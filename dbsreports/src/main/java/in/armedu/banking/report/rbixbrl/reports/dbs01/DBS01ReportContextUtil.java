package in.armedu.banking.report.rbixbrl.reports.dbs01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.xbrl._2003.instance.Context;
import org.xbrl._2003.instance.ContextEntityType;
import org.xbrl._2003.instance.ContextPeriodType;
import org.xbrl._2003.instance.StringItemType;
import org.xbrl._2003.instance.ObjectFactory;
import org.xbrl._2003.instance.ContextEntityType.Identifier;
import org.xbrl._2006.xbrldi.ExplicitMember;
import org.xbrl._2006.xbrldi.TypedMember;

import in.armedu.banking.report.rbixbrl.util.ContextUtil;

public class DBS01ReportContextUtil {
    
    
    public static final String CURRENCY = "currency";
    public static final String PERCENTAGE = "percentage";

    public static XMLGregorianCalendar toXMLGeo(String dateInStr){
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        XMLGregorianCalendar xmlGregCal = null;
        try {
            Date date = format.parse(dateInStr);
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTime(date);
            xmlGregCal =  DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
            xmlGregCal.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        
        return xmlGregCal;
    }

    public static Context createFromToContext(String bankCode, String startDate, String endDate){
        return createFromToContext(bankCode, startDate, endDate, null);
    }
    public static Context createAsOfContext(String bankCode, String reportDate){
        return createAsOfContext( bankCode,  reportDate,  null);
    }

    public static Context createFromToContext(String bankCode, String startDate, String endDate, String contextRefFromTo){
        ObjectFactory xbrlObjectFactory = new ObjectFactory();
        ContextEntityType contextEntityType = xbrlObjectFactory.createContextEntityType();
        Identifier identifier = xbrlObjectFactory.createContextEntityTypeIdentifier();
        identifier.setScheme("http://www.rbi.gov.in/000/2010-12-31");
        // set entity identifier aka bank code
        identifier.setValue(bankCode);
        contextEntityType.setIdentifier(identifier);
        // create fromto context
        Context fromToContext = xbrlObjectFactory.createContext();
        if(contextRefFromTo == null || contextRefFromTo.isEmpty())
            contextRefFromTo = ContextUtil.getIdForFromTo("fromto", startDate, endDate, Collections.emptyList());

        fromToContext.setId(contextRefFromTo);
        ContextPeriodType period = xbrlObjectFactory.createContextPeriodType();
        period.setStartDate(startDate);
        period.setEndDate(endDate);
        fromToContext.setEntity(contextEntityType);
        fromToContext.setPeriod(period);
        return fromToContext;
    }

    public static Context createAsOfContext(String bankCode, String reportDate, String contextRefAsOf){
        ObjectFactory xbrlObjectFactory = new ObjectFactory();
        ContextEntityType contextEntityType = xbrlObjectFactory.createContextEntityType();
        Identifier identifier = xbrlObjectFactory.createContextEntityTypeIdentifier();
        identifier.setScheme("http://www.rbi.gov.in/000/2010-12-31");
        // set entity identifier aka bank code
        identifier.setValue(bankCode);
        contextEntityType.setIdentifier(identifier);
        // create fromto context
        Context asOfContext = xbrlObjectFactory.createContext();
        if(contextRefAsOf == null || contextRefAsOf.isEmpty())
            contextRefAsOf = ContextUtil.getIdForAsOf("asof", reportDate, Collections.emptyList());
        asOfContext.setId(contextRefAsOf);
        ContextPeriodType periodInstant = xbrlObjectFactory.createContextPeriodType();
        periodInstant.setInstant(reportDate);
        asOfContext.setEntity(contextEntityType);
        asOfContext.setPeriod(periodInstant);
        return asOfContext;
    }

    
    // common methods without typemembers
    
    public static Context createFromToContextWithMembers(String bankCode, String startDate, String endDate,  Map<String, String> emMap ){
        ObjectFactory xbrlObjectFactory = new ObjectFactory();
        String contextRefFromToForBorrowerString = ContextUtil.getIdForFromTo("fromto", startDate, endDate, emMap.values() );
        Context context = createFromToContext(bankCode, startDate, endDate, contextRefFromToForBorrowerString);
        
        // create segement
        org.xbrl._2003.instance.Segment segFundedMember = xbrlObjectFactory.createSegment();
        List<ExplicitMember> explicitMembers = createExplicitMembers(emMap);
        segFundedMember.getAny().addAll(explicitMembers);
        
        context.getEntity().setSegment(segFundedMember);
        return context;
    }

    public static Context createAsOfContextWithMembers(String bankCode, String reportDate,  Map<String, String> emMap ){
        ObjectFactory xbrlObjectFactory = new ObjectFactory();
        String contextRefAsOfFundTypeString = ContextUtil.getIdForAsOf("asof", reportDate, emMap.values() );
        Context context = createAsOfContext(bankCode, reportDate, contextRefAsOfFundTypeString);
        
        // create segement
        org.xbrl._2003.instance.Segment segFundedMember = xbrlObjectFactory.createSegment();
        List<ExplicitMember> explicitMembers = createExplicitMembers(emMap);
        segFundedMember.getAny().addAll(explicitMembers);
        
        context.getEntity().setSegment(segFundedMember);
        
        return context;

    }

    

    // common methods to create explicitmembers
    public static List<ExplicitMember> createExplicitMembers(Map<String, String> emMap) {
        List<ExplicitMember> explicitMembers = new ArrayList<ExplicitMember>();
        emMap.forEach((type, value)->{
            if(type.equalsIgnoreCase("in-rbi-rep:TypedDefaultAxis")) return;
            ExplicitMember explicitMemberForExposureType = new org.xbrl._2006.xbrldi.ObjectFactory().createExplicitMember();
            String[] types = type.split(":");
            String[] values = value.split(":");
            explicitMemberForExposureType.setDimension(new QName(getFullNamespace(types[0]), types[1]));
            explicitMemberForExposureType.setValue(new QName(getFullNamespace(values[0]), values[1]));
            explicitMembers.add(explicitMemberForExposureType);
        });        
        return explicitMembers;
    }

    public static String getFullNamespace(String namespace) {        
        if(namespace.equalsIgnoreCase("in-rbi-rep-types")){
            return "http://www.rbi.org/in/xbrl/2012-05-07/in-rbi-rep-types";
        } else if(namespace.equalsIgnoreCase("nonnum")){
            return "http://www.xbrl.org/dtr/type/non-numeric";
        } else if(namespace.equalsIgnoreCase("num")){
            return "http://www.xbrl.org/dtr/type/numeric";
        } else if(namespace.equalsIgnoreCase("rbi-type")){
            return "http://www.rbi.org/in/xbrl/rbi-type";
        } else if(namespace.equalsIgnoreCase("rbi-core")){
            return "http://www.rbi.org/in/xbrl/rbi-core";
        } else if(namespace.equalsIgnoreCase("rbi-rep")){
            return "http://www.rbi.org/in/xbrl/rbi-par";
        } else if(namespace.equalsIgnoreCase("in-rbi-rep")){
            return "http://www.rbi.org/in/xbrl/2012-04-25/rbi";
        } else if(namespace.equalsIgnoreCase("in-rbi-rep-par")){
            return "http://www.rbi.org/in-rbi-rep-par";                        
        } else if(namespace.equalsIgnoreCase("xbrli")){
            return "http://www.xbrl.org/2003/instance";
        } else if (namespace.equalsIgnoreCase("xbrldt")){
            return "http://xbrl.org/2005/xbrldt";
        } else {
            return "";
        }        
    }
    
}


