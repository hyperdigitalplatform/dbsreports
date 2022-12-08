package in.armedu.banking.report.rbixbrl.reports.dbs16;



import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;

import org.xbrl._2003.instance.Context;
import org.xbrl._2003.instance.ContextEntityType;
import org.xbrl._2003.instance.ContextEntityType.Identifier;
import org.xbrl._2006.xbrldi.ExplicitMember;
import org.xbrl._2006.xbrldi.TypedMember;
import org.xbrl._2003.instance.ContextPeriodType;
import org.xbrl._2003.instance.ObjectFactory;
import org.xbrl._2003.instance.Unit;
import org.xbrl._2003.instance.Xbrl;
import org.xbrl._2003.xlink.SimpleType;

// generic import classes
import java.lang.Boolean;
import java.io.StringWriter;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import in.armedu.banking.report.rbixbrl.util.DefaultNamespacePrefixMapper;
import lombok.Setter;

// import model class
import in.armedu.banking.report.rbixbrl.model.dbs16.*;
import in.armedu.banking.report.rbixbrl.model.FieldDataValue;
// add xbrl data type and inerface
import in.armedu.banking.report.rbixbrl.reports.XBRLReportIntf;
import in.armedu.banking.report.rbixbrl.util.CommonFns;
import in.armedu.banking.report.rbixbrl.model.ReportData;

// add data type 

                        import org.xbrl._2003.instance.StringItemType;
                        
                        import org.xbrl._2003.instance.DateItemType;
                        
                        import org.rbi.in.xbrl.rbi_type.ReportingScale;
                        
                        import org.rbi.in.xbrl._2012_05_07.in_rbi_rep_types.ReportStatusItemType;
                        
                        import org.xbrl.dtr.type.non_numeric.TextBlockItemType;
                        
                        import org.xbrl._2003.instance.BooleanItemType;
                        
                        import org.rbi.in.xbrl.rbi_type.NoFraudOrNoWilfulDefaulterFlag;
                        
                        import org.xbrl._2003.instance.MonetaryItemType;
                        
                        import org.xbrl._2003.instance.DecimalItemType;
                        
                        import org.rbi.in.xbrl.rbi_type.LoanOrAccountClassification;
                        

@Setter
public class DBS16Report implements XBRLReportIntf {
       
    
    // logic for main method
    @Override
    public StringWriter generateReport(ReportData reportData){
        JAXBContext jc;
        Marshaller m;
        // TODO should be generated dynamically
        DBS16ReportData mainReportData = (DBS16ReportData) reportData;

        try {
            jc = JAXBContext.newInstance(ObjectFactory.class,
            org.rbi.in.xbrl._2012_05_07.in_rbi_rep_types.ObjectFactory.class,
            org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory.class,
            org.rbi.in.xbrl.rbi_core.ObjectFactory.class,
            org.rbi.in.xbrl.rbi_par.ObjectFactory.class,
            org.rbi.in_rbi_rep_par.ObjectFactory.class,
            org.xbrl._2003.xlink.ObjectFactory.class,
            org.xbrl._2003.instance.ObjectFactory.class,
            org.xbrl._2006.xbrldi.ObjectFactory.class,
            org.xbrl._2003.linkbase.ObjectFactory.class,
            org.xbrl._2005.xbrldt.ObjectFactory.class,
            org.xbrl.dtr.type.non_numeric.ObjectFactory.class,
            org.xbrl.dtr.type.numeric.ObjectFactory.class);

            m = jc.createMarshaller();
            StringWriter writer = new StringWriter();
            Xbrl xbrl = new org.xbrl._2003.instance.ObjectFactory().createXbrl();
            
            m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.setProperty("com.sun.xml.bind.namespacePrefixMapper", new DefaultNamespacePrefixMapper());
            org.xbrl._2003.xlink.ObjectFactory xlinkObjectFactory = new org.xbrl._2003.xlink.ObjectFactory();
            SimpleType simpleType = xlinkObjectFactory.createSimpleType();
            simpleType.setType("simple");
            // TODO should be changed to specific xsd related to report dbs16
            simpleType.setHref("in-rbi-dbs16.xsd");
            xbrl.getSchemaRef().add(simpleType);
            xbrl.getOtherAttributes().put(new QName("xml:lang"), "en");
           
            
            // context identifiers and body elements
            List<String> contextIdentifiers = new ArrayList<String>();
            List<Context> contextElements = new ArrayList<Context>();
            List<Object> bodyElements = new ArrayList<Object>();
            List<String> unitIdentifiers = new ArrayList<String>();
            List<Unit> unitElements = new ArrayList<Unit>();
           
            //Unit unitObj = null;
            //DBS16ReportData dBS16ReportData = new DBS16ReportData();
            // print values           
    

            // TODO : create proper context with loop and element
            // initiatilize data class and allow to be set 
            //private DBS16ReportData dBS16ReportData = new DBS16ReportData();
            // retrieve bankcode, startdate, enddate and perioddate
            String bankCode = mainReportData.getBankCode();
            String startDate = mainReportData.getStartDate();
            String endDate = mainReportData.getEndDate();
            String periodDate = mainReportData.getPeriodDate();

             
            
                // create variable for subclass FilingInfo_Layout1 if any typeMembers then List or Single
                FilingInfo_Layout1 filingInfo_Layout1 = mainReportData.getFilingInfo_Layout1();
                // method calling
                
                    filingInfo_Layout1Method(filingInfo_Layout1, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                
                
                // if typemembers exist
                
                
                
                // create variable for subclass FilingInfo_Layout2 if any typeMembers then List or Single
                FilingInfo_Layout2 filingInfo_Layout2 = mainReportData.getFilingInfo_Layout2();
                // method calling
                
                    filingInfo_Layout2Method(filingInfo_Layout2, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBS_StressedMSME_Layout1 if any typeMembers then List or Single
                List<DBS_StressedMSME_Layout1> dBS_StressedMSME_Layout1 = mainReportData.getDBS_StressedMSME_Layout1();
                // method calling
                
                
                // if typemembers exist
                
                    dBS_StressedMSME_Layout1Method(dBS_StressedMSME_Layout1, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                    
                    
                
                
                
                // create variable for subclass DBS_AuthorisedSignatory_Layout1 if any typeMembers then List or Single
                DBS_AuthorisedSignatory_Layout1 dBS_AuthorisedSignatory_Layout1 = mainReportData.getDBS_AuthorisedSignatory_Layout1();
                // method calling
                
                    dBS_AuthorisedSignatory_Layout1Method(dBS_AuthorisedSignatory_Layout1, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                
                
                // if typemembers exist
                
                
                
            // end contexts loop
            // add contexts to xbrl
            contextElements.forEach(ce->{
                xbrl.getItemOrTupleOrContext().add(ce);
            });
            unitElements.forEach(u->{
                xbrl.getItemOrTupleOrContext().add(u);
            });
            
            bodyElements.forEach(be->{
                xbrl.getItemOrTupleOrContext().add(be);
            });
            m.marshal(xbrl, writer);
            System.out.println("");
            System.out.println(writer.toString());
            System.out.println("");
            return writer;
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }






    // logic to generate method
             
            
                // create variable for subclass FilingInfo_Layout1 if any typeMembers then List or Single
                //FilingInfo_Layout1 filingInfo_Layout1 = mainReportData.getFilingInfo_Layout1();
                
                    private String filingInfo_Layout1Method(FilingInfo_Layout1 filingInfo_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                
                    {
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                    FilingInfo_Layout1 field = filingInfo_Layout1;
                    
                    
                        
                        
                            
                            // - ReturnName
                            
                                Map zeroFilingInfo_Layout1ReturnNameMap4 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReturnNameValue2 = DBS16ReportUtil.retrieveValueForElement(field.getReturnName(), zeroFilingInfo_Layout1ReturnNameMap4);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReturnNameFieldDataValue3 = DBS16ReportUtil.retrieveFieldDataForElement(field.getReturnName(), zeroFilingInfo_Layout1ReturnNameMap4, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ReturnNameFieldDataValue3 != null ) {
                                        if(!zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1ReturnNameContext1 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1ReturnNameValue2 != null && !"".equals(zeroFilingInfo_Layout1ReturnNameValue2)) {
                                    
                                    addContext(FilingInfo_Layout1ReturnNameContext1, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType returnNameValue5 = new StringItemType();
                                    returnNameValue5.setContextRef(FilingInfo_Layout1ReturnNameContext1);
                                    
                                    returnNameValue5.setValue(zeroFilingInfo_Layout1ReturnNameValue2);        
                                    
                                    
                                    JAXBElement<StringItemType> returnNameElement6 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReturnName(returnNameValue5);
                                    bodyElements.add(returnNameElement6);
                                
                            }
                        
                            
                            // - ReturnCode
                            
                                Map zeroFilingInfo_Layout1ReturnCodeMap10 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReturnCodeValue8 = DBS16ReportUtil.retrieveValueForElement(field.getReturnCode(), zeroFilingInfo_Layout1ReturnCodeMap10);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReturnCodeFieldDataValue9 = DBS16ReportUtil.retrieveFieldDataForElement(field.getReturnCode(), zeroFilingInfo_Layout1ReturnCodeMap10, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ReturnCodeFieldDataValue9 != null ) {
                                        if(!zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1ReturnCodeContext7 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1ReturnCodeValue8 != null && !"".equals(zeroFilingInfo_Layout1ReturnCodeValue8)) {
                                    
                                    addContext(FilingInfo_Layout1ReturnCodeContext7, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType returnCodeValue11 = new StringItemType();
                                    returnCodeValue11.setContextRef(FilingInfo_Layout1ReturnCodeContext7);
                                    
                                    returnCodeValue11.setValue(zeroFilingInfo_Layout1ReturnCodeValue8);        
                                    
                                    
                                    JAXBElement<StringItemType> returnCodeElement12 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReturnCode(returnCodeValue11);
                                    bodyElements.add(returnCodeElement12);
                                
                            }
                        
                            
                            // - NameOfReportingInstitution
                            
                                Map zeroFilingInfo_Layout1NameOfReportingInstitutionMap16 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1NameOfReportingInstitutionValue14 = DBS16ReportUtil.retrieveValueForElement(field.getNameOfReportingInstitution(), zeroFilingInfo_Layout1NameOfReportingInstitutionMap16);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15 = DBS16ReportUtil.retrieveFieldDataForElement(field.getNameOfReportingInstitution(), zeroFilingInfo_Layout1NameOfReportingInstitutionMap16, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15 != null ) {
                                        if(!zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1NameOfReportingInstitutionContext13 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1NameOfReportingInstitutionValue14 != null && !"".equals(zeroFilingInfo_Layout1NameOfReportingInstitutionValue14)) {
                                    
                                    addContext(FilingInfo_Layout1NameOfReportingInstitutionContext13, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType nameOfReportingInstitutionValue17 = new StringItemType();
                                    nameOfReportingInstitutionValue17.setContextRef(FilingInfo_Layout1NameOfReportingInstitutionContext13);
                                    
                                    nameOfReportingInstitutionValue17.setValue(zeroFilingInfo_Layout1NameOfReportingInstitutionValue14);        
                                    
                                    
                                    JAXBElement<StringItemType> nameOfReportingInstitutionElement18 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNameOfReportingInstitution(nameOfReportingInstitutionValue17);
                                    bodyElements.add(nameOfReportingInstitutionElement18);
                                
                            }
                        
                            
                            // - BankCode
                            
                                Map zeroFilingInfo_Layout1BankCodeMap22 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1BankCodeValue20 = DBS16ReportUtil.retrieveValueForElement(field.getBankCode(), zeroFilingInfo_Layout1BankCodeMap22);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1BankCodeFieldDataValue21 = DBS16ReportUtil.retrieveFieldDataForElement(field.getBankCode(), zeroFilingInfo_Layout1BankCodeMap22, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroFilingInfo_Layout1BankCodeFieldDataValue21 != null ) {
                                        if(!zeroFilingInfo_Layout1BankCodeFieldDataValue21.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1BankCodeFieldDataValue21.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1BankCodeFieldDataValue21.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1BankCodeFieldDataValue21.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1BankCodeFieldDataValue21.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1BankCodeFieldDataValue21.getInstantDateValue();
                                    }

                                    
                                    Context FilingInfo_Layout1BankCodeContext19 = DBS16ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout1BankCodeValue20 != null && !"".equals(zeroFilingInfo_Layout1BankCodeValue20)) {
                                    
                                    addContext(FilingInfo_Layout1BankCodeContext19, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType bankCodeValue23 = new StringItemType();
                                    bankCodeValue23.setContextRef(FilingInfo_Layout1BankCodeContext19);
                                    
                                    bankCodeValue23.setValue(zeroFilingInfo_Layout1BankCodeValue20);        
                                    
                                    
                                    JAXBElement<StringItemType> bankCodeElement24 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createBankCode(bankCodeValue23);
                                    bodyElements.add(bankCodeElement24);
                                
                            }
                        
                            
                            // - InstitutionType
                            
                                Map zeroFilingInfo_Layout1InstitutionTypeMap28 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1InstitutionTypeValue26 = DBS16ReportUtil.retrieveValueForElement(field.getInstitutionType(), zeroFilingInfo_Layout1InstitutionTypeMap28);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27 = DBS16ReportUtil.retrieveFieldDataForElement(field.getInstitutionType(), zeroFilingInfo_Layout1InstitutionTypeMap28, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27 != null ) {
                                        if(!zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1InstitutionTypeContext25 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1InstitutionTypeValue26 != null && !"".equals(zeroFilingInfo_Layout1InstitutionTypeValue26)) {
                                    
                                    addContext(FilingInfo_Layout1InstitutionTypeContext25, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType institutionTypeValue29 = new StringItemType();
                                    institutionTypeValue29.setContextRef(FilingInfo_Layout1InstitutionTypeContext25);
                                    
                                    institutionTypeValue29.setValue(zeroFilingInfo_Layout1InstitutionTypeValue26);        
                                    
                                    
                                    JAXBElement<StringItemType> institutionTypeElement30 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createInstitutionType(institutionTypeValue29);
                                    bodyElements.add(institutionTypeElement30);
                                
                            }
                        
                            
                            // - ReportingFrequency
                            
                                Map zeroFilingInfo_Layout1ReportingFrequencyMap34 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingFrequencyValue32 = DBS16ReportUtil.retrieveValueForElement(field.getReportingFrequency(), zeroFilingInfo_Layout1ReportingFrequencyMap34);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33 = DBS16ReportUtil.retrieveFieldDataForElement(field.getReportingFrequency(), zeroFilingInfo_Layout1ReportingFrequencyMap34, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1ReportingFrequencyContext31 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1ReportingFrequencyValue32 != null && !"".equals(zeroFilingInfo_Layout1ReportingFrequencyValue32)) {
                                    
                                    addContext(FilingInfo_Layout1ReportingFrequencyContext31, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType reportingFrequencyValue35 = new StringItemType();
                                    reportingFrequencyValue35.setContextRef(FilingInfo_Layout1ReportingFrequencyContext31);
                                    
                                    reportingFrequencyValue35.setValue(zeroFilingInfo_Layout1ReportingFrequencyValue32);        
                                    
                                    
                                    JAXBElement<StringItemType> reportingFrequencyElement36 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReportingFrequency(reportingFrequencyValue35);
                                    bodyElements.add(reportingFrequencyElement36);
                                
                            }
                        
                            
                            // - ReportingPeriodStartDate
                            
                                Map zeroFilingInfo_Layout1ReportingPeriodStartDateMap40 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingPeriodStartDateValue38 = DBS16ReportUtil.retrieveValueForElement(field.getReportingPeriodStartDate(), zeroFilingInfo_Layout1ReportingPeriodStartDateMap40);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39 = DBS16ReportUtil.retrieveFieldDataForElement(field.getReportingPeriodStartDate(), zeroFilingInfo_Layout1ReportingPeriodStartDateMap40, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getInstantDateValue();
                                    }

                                    
                                    Context FilingInfo_Layout1ReportingPeriodStartDateContext37 = DBS16ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout1ReportingPeriodStartDateValue38 != null && !"".equals(zeroFilingInfo_Layout1ReportingPeriodStartDateValue38)) {
                                    
                                    addContext(FilingInfo_Layout1ReportingPeriodStartDateContext37, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    DateItemType reportingPeriodStartDateValue41 = new DateItemType();
                                    reportingPeriodStartDateValue41.setContextRef(FilingInfo_Layout1ReportingPeriodStartDateContext37);
                                    
                                    reportingPeriodStartDateValue41.setValue(DBS16ReportContextUtil.toXMLGeo(zeroFilingInfo_Layout1ReportingPeriodStartDateValue38));
                                    
                                    
                                    JAXBElement<DateItemType> reportingPeriodStartDateElement42 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReportingPeriodStartDate(reportingPeriodStartDateValue41);
                                    bodyElements.add(reportingPeriodStartDateElement42);
                                
                            }
                        
                            
                            // - ReportingPeriodEndDate
                            
                                Map zeroFilingInfo_Layout1ReportingPeriodEndDateMap46 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingPeriodEndDateValue44 = DBS16ReportUtil.retrieveValueForElement(field.getReportingPeriodEndDate(), zeroFilingInfo_Layout1ReportingPeriodEndDateMap46);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45 = DBS16ReportUtil.retrieveFieldDataForElement(field.getReportingPeriodEndDate(), zeroFilingInfo_Layout1ReportingPeriodEndDateMap46, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getInstantDateValue();
                                    }

                                    
                                    Context FilingInfo_Layout1ReportingPeriodEndDateContext43 = DBS16ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout1ReportingPeriodEndDateValue44 != null && !"".equals(zeroFilingInfo_Layout1ReportingPeriodEndDateValue44)) {
                                    
                                    addContext(FilingInfo_Layout1ReportingPeriodEndDateContext43, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    DateItemType reportingPeriodEndDateValue47 = new DateItemType();
                                    reportingPeriodEndDateValue47.setContextRef(FilingInfo_Layout1ReportingPeriodEndDateContext43);
                                    
                                    reportingPeriodEndDateValue47.setValue(DBS16ReportContextUtil.toXMLGeo(zeroFilingInfo_Layout1ReportingPeriodEndDateValue44));
                                    
                                    
                                    JAXBElement<DateItemType> reportingPeriodEndDateElement48 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReportingPeriodEndDate(reportingPeriodEndDateValue47);
                                    bodyElements.add(reportingPeriodEndDateElement48);
                                
                            }
                        
                            
                            // - ReportingCurrency
                            
                                Map zeroFilingInfo_Layout1ReportingCurrencyMap52 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingCurrencyValue50 = DBS16ReportUtil.retrieveValueForElement(field.getReportingCurrency(), zeroFilingInfo_Layout1ReportingCurrencyMap52);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51 = DBS16ReportUtil.retrieveFieldDataForElement(field.getReportingCurrency(), zeroFilingInfo_Layout1ReportingCurrencyMap52, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1ReportingCurrencyContext49 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1ReportingCurrencyValue50 != null && !"".equals(zeroFilingInfo_Layout1ReportingCurrencyValue50)) {
                                    
                                    addContext(FilingInfo_Layout1ReportingCurrencyContext49, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType reportingCurrencyValue53 = new StringItemType();
                                    reportingCurrencyValue53.setContextRef(FilingInfo_Layout1ReportingCurrencyContext49);
                                    
                                    reportingCurrencyValue53.setValue(zeroFilingInfo_Layout1ReportingCurrencyValue50);        
                                    
                                    
                                    JAXBElement<StringItemType> reportingCurrencyElement54 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createReportingCurrency(reportingCurrencyValue53);
                                    bodyElements.add(reportingCurrencyElement54);
                                
                            }
                        
                            
                            // - ReportingScale
                            
                                Map zeroFilingInfo_Layout1ReportingScaleMap58 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingScaleValue56 = DBS16ReportUtil.retrieveValueForElement(field.getReportingScale(), zeroFilingInfo_Layout1ReportingScaleMap58);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReportingScaleFieldDataValue57 = DBS16ReportUtil.retrieveFieldDataForElement(field.getReportingScale(), zeroFilingInfo_Layout1ReportingScaleMap58, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ReportingScaleFieldDataValue57 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1ReportingScaleContext55 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1ReportingScaleValue56 != null && !"".equals(zeroFilingInfo_Layout1ReportingScaleValue56)) {
                                    
                                    addContext(FilingInfo_Layout1ReportingScaleContext55, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    ReportingScale reportingScaleValue59 = new ReportingScale();
                                    reportingScaleValue59.setContextRef(FilingInfo_Layout1ReportingScaleContext55);
                                    
                                    reportingScaleValue59.setValue(zeroFilingInfo_Layout1ReportingScaleValue56);        
                                    
                                    
                                    JAXBElement<ReportingScale> reportingScaleElement60 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createReportingScale(reportingScaleValue59);
                                    bodyElements.add(reportingScaleElement60);
                                
                            }
                        
                            
                            // - TaxonomyVersion
                            
                                Map zeroFilingInfo_Layout1TaxonomyVersionMap64 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1TaxonomyVersionValue62 = DBS16ReportUtil.retrieveValueForElement(field.getTaxonomyVersion(), zeroFilingInfo_Layout1TaxonomyVersionMap64);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63 = DBS16ReportUtil.retrieveFieldDataForElement(field.getTaxonomyVersion(), zeroFilingInfo_Layout1TaxonomyVersionMap64, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63 != null ) {
                                        if(!zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1TaxonomyVersionContext61 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1TaxonomyVersionValue62 != null && !"".equals(zeroFilingInfo_Layout1TaxonomyVersionValue62)) {
                                    
                                    addContext(FilingInfo_Layout1TaxonomyVersionContext61, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType taxonomyVersionValue65 = new StringItemType();
                                    taxonomyVersionValue65.setContextRef(FilingInfo_Layout1TaxonomyVersionContext61);
                                    
                                    taxonomyVersionValue65.setValue(zeroFilingInfo_Layout1TaxonomyVersionValue62);        
                                    
                                    
                                    JAXBElement<StringItemType> taxonomyVersionElement66 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTaxonomyVersion(taxonomyVersionValue65);
                                    bodyElements.add(taxonomyVersionElement66);
                                
                            }
                        
                            
                            // - ToolName
                            
                                Map zeroFilingInfo_Layout1ToolNameMap70 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ToolNameValue68 = DBS16ReportUtil.retrieveValueForElement(field.getToolName(), zeroFilingInfo_Layout1ToolNameMap70);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ToolNameFieldDataValue69 = DBS16ReportUtil.retrieveFieldDataForElement(field.getToolName(), zeroFilingInfo_Layout1ToolNameMap70, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ToolNameFieldDataValue69 != null ) {
                                        if(!zeroFilingInfo_Layout1ToolNameFieldDataValue69.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ToolNameFieldDataValue69.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ToolNameFieldDataValue69.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ToolNameFieldDataValue69.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ToolNameFieldDataValue69.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ToolNameFieldDataValue69.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1ToolNameContext67 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1ToolNameValue68 != null && !"".equals(zeroFilingInfo_Layout1ToolNameValue68)) {
                                    
                                    addContext(FilingInfo_Layout1ToolNameContext67, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType toolNameValue71 = new StringItemType();
                                    toolNameValue71.setContextRef(FilingInfo_Layout1ToolNameContext67);
                                    
                                    toolNameValue71.setValue(zeroFilingInfo_Layout1ToolNameValue68);        
                                    
                                    
                                    JAXBElement<StringItemType> toolNameElement72 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createToolName(toolNameValue71);
                                    bodyElements.add(toolNameElement72);
                                
                            }
                        
                            
                            // - ToolVersion
                            
                                Map zeroFilingInfo_Layout1ToolVersionMap76 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ToolVersionValue74 = DBS16ReportUtil.retrieveValueForElement(field.getToolVersion(), zeroFilingInfo_Layout1ToolVersionMap76);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ToolVersionFieldDataValue75 = DBS16ReportUtil.retrieveFieldDataForElement(field.getToolVersion(), zeroFilingInfo_Layout1ToolVersionMap76, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ToolVersionFieldDataValue75 != null ) {
                                        if(!zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1ToolVersionContext73 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1ToolVersionValue74 != null && !"".equals(zeroFilingInfo_Layout1ToolVersionValue74)) {
                                    
                                    addContext(FilingInfo_Layout1ToolVersionContext73, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType toolVersionValue77 = new StringItemType();
                                    toolVersionValue77.setContextRef(FilingInfo_Layout1ToolVersionContext73);
                                    
                                    toolVersionValue77.setValue(zeroFilingInfo_Layout1ToolVersionValue74);        
                                    
                                    
                                    JAXBElement<StringItemType> toolVersionElement78 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createToolVersion(toolVersionValue77);
                                    bodyElements.add(toolVersionElement78);
                                
                            }
                        
                            
                            // - ReportStatus
                            
                                Map zeroFilingInfo_Layout1ReportStatusMap82 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReportStatusValue80 = DBS16ReportUtil.retrieveValueForElement(field.getReportStatus(), zeroFilingInfo_Layout1ReportStatusMap82);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReportStatusFieldDataValue81 = DBS16ReportUtil.retrieveFieldDataForElement(field.getReportStatus(), zeroFilingInfo_Layout1ReportStatusMap82, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ReportStatusFieldDataValue81 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1ReportStatusContext79 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1ReportStatusValue80 != null && !"".equals(zeroFilingInfo_Layout1ReportStatusValue80)) {
                                    
                                    addContext(FilingInfo_Layout1ReportStatusContext79, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    ReportStatusItemType reportStatusValue83 = new ReportStatusItemType();
                                    reportStatusValue83.setContextRef(FilingInfo_Layout1ReportStatusContext79);
                                    
                                    reportStatusValue83.setValue(zeroFilingInfo_Layout1ReportStatusValue80);        
                                    
                                    
                                    JAXBElement<ReportStatusItemType> reportStatusElement84 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReportStatus(reportStatusValue83);
                                    bodyElements.add(reportStatusElement84);
                                
                            }
                        
                            
                            // - DateOfAudit
                            
                                Map zeroFilingInfo_Layout1DateOfAuditMap88 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1DateOfAuditValue86 = DBS16ReportUtil.retrieveValueForElement(field.getDateOfAudit(), zeroFilingInfo_Layout1DateOfAuditMap88);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1DateOfAuditFieldDataValue87 = DBS16ReportUtil.retrieveFieldDataForElement(field.getDateOfAudit(), zeroFilingInfo_Layout1DateOfAuditMap88, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroFilingInfo_Layout1DateOfAuditFieldDataValue87 != null ) {
                                        if(!zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getInstantDateValue();
                                    }

                                    
                                    Context FilingInfo_Layout1DateOfAuditContext85 = DBS16ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout1DateOfAuditValue86 != null && !"".equals(zeroFilingInfo_Layout1DateOfAuditValue86)) {
                                    
                                    addContext(FilingInfo_Layout1DateOfAuditContext85, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    DateItemType dateOfAuditValue89 = new DateItemType();
                                    dateOfAuditValue89.setContextRef(FilingInfo_Layout1DateOfAuditContext85);
                                    
                                    dateOfAuditValue89.setValue(DBS16ReportContextUtil.toXMLGeo(zeroFilingInfo_Layout1DateOfAuditValue86));
                                    
                                    
                                    JAXBElement<DateItemType> dateOfAuditElement90 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createDateOfAudit(dateOfAuditValue89);
                                    bodyElements.add(dateOfAuditElement90);
                                
                            }
                        
                            
                            // - GeneralRemarks
                            
                                Map zeroFilingInfo_Layout1GeneralRemarksMap94 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1GeneralRemarksValue92 = DBS16ReportUtil.retrieveValueForElement(field.getGeneralRemarks(), zeroFilingInfo_Layout1GeneralRemarksMap94);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93 = DBS16ReportUtil.retrieveFieldDataForElement(field.getGeneralRemarks(), zeroFilingInfo_Layout1GeneralRemarksMap94, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93 != null ) {
                                        if(!zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1GeneralRemarksContext91 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1GeneralRemarksValue92 != null && !"".equals(zeroFilingInfo_Layout1GeneralRemarksValue92)) {
                                    
                                    addContext(FilingInfo_Layout1GeneralRemarksContext91, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    TextBlockItemType generalRemarksValue95 = new TextBlockItemType();
                                    generalRemarksValue95.setContextRef(FilingInfo_Layout1GeneralRemarksContext91);
                                    
                                    generalRemarksValue95.setValue(zeroFilingInfo_Layout1GeneralRemarksValue92);        
                                    
                                    
                                    JAXBElement<TextBlockItemType> generalRemarksElement96 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createGeneralRemarks(generalRemarksValue95);
                                    bodyElements.add(generalRemarksElement96);
                                
                            }
                        
                        
                    
                    
            
                    
                    
                    
                    return "";
                    }

                
                    
                
                // if typemembers exist
                
                
                
                // create variable for subclass FilingInfo_Layout2 if any typeMembers then List or Single
                //FilingInfo_Layout2 filingInfo_Layout2 = mainReportData.getFilingInfo_Layout2();
                
                    private String filingInfo_Layout2Method(FilingInfo_Layout2 filingInfo_Layout2, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                
                    {
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                    FilingInfo_Layout2 field = filingInfo_Layout2;
                    
                    
                        
                        
                            
                            // - WhetherNilReporting
                            
                                Map zeroFilingInfo_Layout2WhetherNilReportingMap100 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout2WhetherNilReportingValue98 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherNilReporting(), zeroFilingInfo_Layout2WhetherNilReportingMap100);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout2WhetherNilReportingFieldDataValue99 = DBS16ReportUtil.retrieveFieldDataForElement(field.getWhetherNilReporting(), zeroFilingInfo_Layout2WhetherNilReportingMap100, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout2WhetherNilReportingFieldDataValue99 != null ) {
                                        if(!zeroFilingInfo_Layout2WhetherNilReportingFieldDataValue99.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout2WhetherNilReportingFieldDataValue99.getStartDateValue();
                                        if(!zeroFilingInfo_Layout2WhetherNilReportingFieldDataValue99.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout2WhetherNilReportingFieldDataValue99.getEndDateValue();
                                        if(!zeroFilingInfo_Layout2WhetherNilReportingFieldDataValue99.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout2WhetherNilReportingFieldDataValue99.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout2WhetherNilReportingContext97 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout2WhetherNilReportingValue98 != null && !"".equals(zeroFilingInfo_Layout2WhetherNilReportingValue98)) {
                                    
                                    addContext(FilingInfo_Layout2WhetherNilReportingContext97, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    BooleanItemType whetherNilReportingValue101 = new BooleanItemType();
                                    whetherNilReportingValue101.setContextRef(FilingInfo_Layout2WhetherNilReportingContext97);
                                    
                                        whetherNilReportingValue101.setValue(Boolean.getBoolean(zeroFilingInfo_Layout2WhetherNilReportingValue98));
                                    
                                    
                                    JAXBElement<BooleanItemType> whetherNilReportingElement102 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createWhetherNilReporting(whetherNilReportingValue101);
                                    bodyElements.add(whetherNilReportingElement102);
                                
                            }
                        
                        
                    
                    
            
                    
                    
                    
                    return "";
                    }

                
                    
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBS_StressedMSME_Layout1 if any typeMembers then List or Single
                //List<DBS_StressedMSME_Layout1> dBS_StressedMSME_Layout1 = mainReportData.getDBS_StressedMSME_Layout1();
                
                
                // if typemembers exist
                
                    private String dBS_StressedMSME_Layout1Method(List<DBS_StressedMSME_Layout1> dBS_StressedMSME_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                    {
                        
                    dBS_StressedMSME_Layout1.forEach((field)->{
                        // create startdate, enddate, and perioddate
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                        // crate variable loop  for type member
                        
                            // create variable for type member NameOfBorrowerAxis
                            String nameOfBorrowerAxis = field.getNameOfBorrowerAxis();
                        
                            // create variable for type member BorrowerPermanentAccountNumberAxis
                            String borrowerPermanentAccountNumberAxis = field.getBorrowerPermanentAccountNumberAxis();
                        
                            // create variable for type member EligibleMicroSmallAndMediumEnterprisesEntityNameAxis
                            String eligibleMicroSmallAndMediumEnterprisesEntityNameAxis = field.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis();
                        
                            // create variable for type member MSMEEntityPermanentAccountNumberAxis
                            String mSMEEntityPermanentAccountNumberAxis = field.getMSMEEntityPermanentAccountNumberAxis();
                        
                            // create variable for type member StateAxis
                            String stateAxis = field.getStateAxis();
                        
                        // end create variable loop for type member
                        
                        // if explict member is empty
                        
                        
                
                        
                        
                            
                                
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap104 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap104.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MicroEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue105 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap104);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue106 = DBS16ReportUtil.retrieveFieldDataForElement(field.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap104, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue106 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue106.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue106.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue106.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue106.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue106.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue106.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue105 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue105)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext103 = DBS16ReportContextUtil.createFromToContextWithMembersDBS_StressedMSME_Layout1( bankCode, startDate, endDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap104 );
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext103, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        BooleanItemType explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType108 = new BooleanItemType();
                                        explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType108.setContextRef(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext103);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType108.setValue(Boolean.getBoolean(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue105));
                                        
                                        
                                        JAXBElement<BooleanItemType> explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement107 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType108);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement107);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap110 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap110.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MicroEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue111 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap110);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue112 = DBS16ReportUtil.retrieveFieldDataForElement(field.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap110, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue112 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue112.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue112.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue112.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue112.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue112.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue112.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue111 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue111)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext109 = DBS16ReportContextUtil.createFromToContextWithMembersDBS_StressedMSME_Layout1( bankCode, startDate, endDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap110 );
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext109, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        BooleanItemType explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType114 = new BooleanItemType();
                                        explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType114.setContextRef(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext109);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType114.setValue(Boolean.getBoolean(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue111));
                                        
                                        
                                        JAXBElement<BooleanItemType> explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement113 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType114);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement113);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - NoFraudOrNoWilfulDefaulterFlag
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMap116 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMap116.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MicroEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue117 = DBS16ReportUtil.retrieveValueForElement(field.getNoFraudOrNoWilfulDefaulterFlag(), explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMap116);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue118 = DBS16ReportUtil.retrieveFieldDataForElement(field.getNoFraudOrNoWilfulDefaulterFlag(), explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMap116, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue118 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue118.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue118.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue118.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue118.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue118.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue118.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue117 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue117)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisContext115 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMap116 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisContext115, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        NoFraudOrNoWilfulDefaulterFlag explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType120 = new NoFraudOrNoWilfulDefaulterFlag();
                                        explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType120.setContextRef(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisContext115);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType120.setValue(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue117);
                                        
                                        
                                        JAXBElement<NoFraudOrNoWilfulDefaulterFlag> explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement119 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createNoFraudOrNoWilfulDefaulterFlag(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType120);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement119);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR121 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR121 = createUnitIfNotExist(INR121, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMap123 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMap123.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MicroEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue124 = DBS16ReportUtil.retrieveValueForElement(field.getPromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate(), explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMap123);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue125 = DBS16ReportUtil.retrieveFieldDataForElement(field.getPromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate(), explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMap123, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue125 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue125.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue125.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue125.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue125.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue125.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue125.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue124 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue124)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisContext122 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMap123 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisContext122, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType127 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType127.setContextRef(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisContext122);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType127.setUnitRef(INR121);
                                            explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType127.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType127.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue124));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement126 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType127);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement126);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR128 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR128 = createUnitIfNotExist(INR128, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap130 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap130.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MicroEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue131 = DBS16ReportUtil.retrieveValueForElement(field.getExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap130);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue132 = DBS16ReportUtil.retrieveFieldDataForElement(field.getExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap130, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue132 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue132.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue132.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue132.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue132.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue132.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue132.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue131 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue131)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext129 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap130 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext129, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType134 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType134.setContextRef(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext129);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType134.setUnitRef(INR128);
                                            explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType134.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType134.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue131));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement133 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType134);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement133);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR135 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR135 = createUnitIfNotExist(INR135, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap137 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap137.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MicroEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue138 = DBS16ReportUtil.retrieveValueForElement(field.getExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap137);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue139 = DBS16ReportUtil.retrieveFieldDataForElement(field.getExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap137, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue139 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue139.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue139.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue139.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue139.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue139.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue139.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue138 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue138)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext136 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap137 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext136, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType141 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType141.setContextRef(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext136);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType141.setUnitRef(INR135);
                                            explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType141.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType141.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue138));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement140 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType141);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement140);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMap143 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMap143.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MicroEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue144 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders(), explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMap143);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue145 = DBS16ReportUtil.retrieveFieldDataForElement(field.getWhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders(), explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMap143, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue145 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue145.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue145.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue145.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue145.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue145.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue145.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue144 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue144)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisContext142 = DBS16ReportContextUtil.createFromToContextWithMembersDBS_StressedMSME_Layout1( bankCode, startDate, endDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMap143 );
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisContext142, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        BooleanItemType explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType147 = new BooleanItemType();
                                        explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType147.setContextRef(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisContext142);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType147.setValue(Boolean.getBoolean(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue144));
                                        
                                        
                                        JAXBElement<BooleanItemType> explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement146 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType147);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement146);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - LoanSanctionDateUnderCGSSD
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap149 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap149.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MicroEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue150 = DBS16ReportUtil.retrieveValueForElement(field.getLoanSanctionDateUnderCGSSD(), explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap149);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue151 = DBS16ReportUtil.retrieveFieldDataForElement(field.getLoanSanctionDateUnderCGSSD(), explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap149, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue151 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue151.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue151.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue151.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue151.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue151.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue151.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue150 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue150)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext148 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap149 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext148, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        DateItemType explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType153 = new DateItemType();
                                        explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType153.setContextRef(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext148);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType153.setValue(DBS16ReportContextUtil.toXMLGeo(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue150));
                                        
                                        
                                        JAXBElement<DateItemType> explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement152 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createLoanSanctionDateUnderCGSSD(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType153);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement152);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR154 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR154 = createUnitIfNotExist(INR154, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - LoanSanctionedUnderCGSSD
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap156 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap156.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MicroEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue157 = DBS16ReportUtil.retrieveValueForElement(field.getLoanSanctionedUnderCGSSD(), explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap156);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue158 = DBS16ReportUtil.retrieveFieldDataForElement(field.getLoanSanctionedUnderCGSSD(), explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap156, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue158 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue158.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue158.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue158.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue158.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue158.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue158.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue157 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue157)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext155 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap156 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext155, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType160 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType160.setContextRef(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext155);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType160.setUnitRef(INR154);
                                            explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType160.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType160.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue157));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement159 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createLoanSanctionedUnderCGSSD(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType160);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement159);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMap162 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMap162.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MicroEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue163 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage(), explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMap162);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue164 = DBS16ReportUtil.retrieveFieldDataForElement(field.getWhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage(), explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMap162, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue164 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue164.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue164.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue164.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue164.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue164.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue164.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue163 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue163)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisContext161 = DBS16ReportContextUtil.createFromToContextWithMembersDBS_StressedMSME_Layout1( bankCode, startDate, endDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMap162 );
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisContext161, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        BooleanItemType explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType166 = new BooleanItemType();
                                        explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType166.setContextRef(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisContext161);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType166.setValue(Boolean.getBoolean(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue163));
                                        
                                        
                                        JAXBElement<BooleanItemType> explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement165 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType166);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement165);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure167 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure167 = createUnitIfNotExist(pure167, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - TenureOfLoanSanctionedUnderTheCGSSD
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap169 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap169.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MicroEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue170 = DBS16ReportUtil.retrieveValueForElement(field.getTenureOfLoanSanctionedUnderTheCGSSD(), explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap169);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue171 = DBS16ReportUtil.retrieveFieldDataForElement(field.getTenureOfLoanSanctionedUnderTheCGSSD(), explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap169, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue171 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue171.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue171.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue171.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue171.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue171.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue171.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue170 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue170)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext168 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap169 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext168, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        DecimalItemType explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType173 = new DecimalItemType();
                                        explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType173.setContextRef(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext168);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType173.setUnitRef(pure167);
                                            explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType173.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType173.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue170));
                                        
                                        
                                        JAXBElement<DecimalItemType> explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement172 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTenureOfLoanSanctionedUnderTheCGSSD(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType173);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement172);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure174 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure174 = createUnitIfNotExist(pure174, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap176 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap176.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MicroEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue177 = DBS16ReportUtil.retrieveValueForElement(field.getTenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD(), explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap176);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue178 = DBS16ReportUtil.retrieveFieldDataForElement(field.getTenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD(), explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap176, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue178 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue178.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue178.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue178.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue178.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue178.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue178.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue177 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue177)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext175 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap176 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext175, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        DecimalItemType explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType180 = new DecimalItemType();
                                        explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType180.setContextRef(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext175);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType180.setUnitRef(pure174);
                                            explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType180.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType180.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue177));
                                        
                                        
                                        JAXBElement<DecimalItemType> explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement179 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType180);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement179);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR181 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR181 = createUnitIfNotExist(INR181, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap183 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap183.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MicroEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue184 = DBS16ReportUtil.retrieveValueForElement(field.getCurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap183);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue185 = DBS16ReportUtil.retrieveFieldDataForElement(field.getCurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap183, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue185 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue185.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue185.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue185.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue185.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue185.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue185.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue184 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue184)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext182 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap183 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext182, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType187 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType187.setContextRef(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext182);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType187.setUnitRef(INR181);
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType187.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType187.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue184));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement186 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createCurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType187);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement186);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - LoanOutstandingClassificationUnderCGSSDAsOnReportingDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap189 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap189.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MicroEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue190 = DBS16ReportUtil.retrieveValueForElement(field.getLoanOutstandingClassificationUnderCGSSDAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap189);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue191 = DBS16ReportUtil.retrieveFieldDataForElement(field.getLoanOutstandingClassificationUnderCGSSDAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap189, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue191 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue191.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue191.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue191.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue191.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue191.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue191.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue190 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue190)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext188 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap189 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext188, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        LoanOrAccountClassification explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType193 = new LoanOrAccountClassification();
                                        explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType193.setContextRef(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext188);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType193.setValue(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue190);
                                        
                                        
                                        JAXBElement<LoanOrAccountClassification> explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement192 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createLoanOutstandingClassificationUnderCGSSDAsOnReportingDate(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType193);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement192);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR194 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR194 = createUnitIfNotExist(INR194, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap196 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap196.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MicroEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue197 = DBS16ReportUtil.retrieveValueForElement(field.getCurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap196);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue198 = DBS16ReportUtil.retrieveFieldDataForElement(field.getCurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap196, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue198 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue198.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue198.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue198.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue198.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue198.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue198.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue197 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue197)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext195 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap196 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext195, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType200 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType200.setContextRef(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext195);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType200.setUnitRef(INR194);
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType200.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType200.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue197));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement199 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createCurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType200);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement199);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - MSMEAccountClassificationAsOnReportingDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap202 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap202.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MicroEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue203 = DBS16ReportUtil.retrieveValueForElement(field.getMSMEAccountClassificationAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap202);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue204 = DBS16ReportUtil.retrieveFieldDataForElement(field.getMSMEAccountClassificationAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap202, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue204 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue204.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue204.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue204.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue204.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue204.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberFieldDataValue204.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue203 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue203)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext201 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap202 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext201, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        LoanOrAccountClassification explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType206 = new LoanOrAccountClassification();
                                        explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType206.setContextRef(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext201);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType206.setValue(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberValue203);
                                        
                                        
                                        JAXBElement<LoanOrAccountClassification> explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement205 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createMSMEAccountClassificationAsOnReportingDate(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberDataType206);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMicroEnterprisesMemberElement205);
                                    
                                    }
                                    
                                

                                
                            
                            
                            
                        
                            
                                
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap208 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap208.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:SmallEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue209 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap208);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue210 = DBS16ReportUtil.retrieveFieldDataForElement(field.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap208, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue210 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue210.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue210.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue210.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue210.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue210.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue210.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue209 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue209)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext207 = DBS16ReportContextUtil.createFromToContextWithMembersDBS_StressedMSME_Layout1( bankCode, startDate, endDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap208 );
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext207, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        BooleanItemType explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType212 = new BooleanItemType();
                                        explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType212.setContextRef(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext207);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType212.setValue(Boolean.getBoolean(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue209));
                                        
                                        
                                        JAXBElement<BooleanItemType> explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement211 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType212);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement211);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap214 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap214.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:SmallEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue215 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap214);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue216 = DBS16ReportUtil.retrieveFieldDataForElement(field.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap214, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue216 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue216.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue216.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue216.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue216.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue216.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue216.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue215 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue215)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext213 = DBS16ReportContextUtil.createFromToContextWithMembersDBS_StressedMSME_Layout1( bankCode, startDate, endDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap214 );
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext213, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        BooleanItemType explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType218 = new BooleanItemType();
                                        explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType218.setContextRef(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext213);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType218.setValue(Boolean.getBoolean(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue215));
                                        
                                        
                                        JAXBElement<BooleanItemType> explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement217 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType218);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement217);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - NoFraudOrNoWilfulDefaulterFlag
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMap220 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMap220.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:SmallEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue221 = DBS16ReportUtil.retrieveValueForElement(field.getNoFraudOrNoWilfulDefaulterFlag(), explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMap220);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue222 = DBS16ReportUtil.retrieveFieldDataForElement(field.getNoFraudOrNoWilfulDefaulterFlag(), explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMap220, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue222 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue222.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue222.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue222.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue222.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue222.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue222.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue221 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue221)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisContext219 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMap220 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisContext219, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        NoFraudOrNoWilfulDefaulterFlag explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType224 = new NoFraudOrNoWilfulDefaulterFlag();
                                        explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType224.setContextRef(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisContext219);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType224.setValue(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue221);
                                        
                                        
                                        JAXBElement<NoFraudOrNoWilfulDefaulterFlag> explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement223 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createNoFraudOrNoWilfulDefaulterFlag(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType224);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement223);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR225 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR225 = createUnitIfNotExist(INR225, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMap227 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMap227.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:SmallEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue228 = DBS16ReportUtil.retrieveValueForElement(field.getPromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate(), explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMap227);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue229 = DBS16ReportUtil.retrieveFieldDataForElement(field.getPromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate(), explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMap227, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue229 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue229.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue229.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue229.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue229.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue229.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue229.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue228 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue228)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisContext226 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMap227 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisContext226, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType231 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType231.setContextRef(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisContext226);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType231.setUnitRef(INR225);
                                            explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType231.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType231.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue228));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement230 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType231);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement230);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR232 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR232 = createUnitIfNotExist(INR232, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap234 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap234.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:SmallEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue235 = DBS16ReportUtil.retrieveValueForElement(field.getExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap234);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue236 = DBS16ReportUtil.retrieveFieldDataForElement(field.getExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap234, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue236 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue236.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue236.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue236.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue236.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue236.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue236.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue235 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue235)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext233 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap234 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext233, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType238 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType238.setContextRef(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext233);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType238.setUnitRef(INR232);
                                            explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType238.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType238.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue235));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement237 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType238);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement237);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR239 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR239 = createUnitIfNotExist(INR239, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap241 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap241.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:SmallEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue242 = DBS16ReportUtil.retrieveValueForElement(field.getExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap241);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue243 = DBS16ReportUtil.retrieveFieldDataForElement(field.getExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap241, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue243 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue243.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue243.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue243.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue243.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue243.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue243.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue242 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue242)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext240 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap241 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext240, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType245 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType245.setContextRef(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext240);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType245.setUnitRef(INR239);
                                            explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType245.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType245.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue242));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement244 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType245);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement244);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMap247 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMap247.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:SmallEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue248 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders(), explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMap247);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue249 = DBS16ReportUtil.retrieveFieldDataForElement(field.getWhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders(), explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMap247, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue249 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue249.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue249.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue249.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue249.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue249.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue249.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue248 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue248)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisContext246 = DBS16ReportContextUtil.createFromToContextWithMembersDBS_StressedMSME_Layout1( bankCode, startDate, endDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMap247 );
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisContext246, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        BooleanItemType explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType251 = new BooleanItemType();
                                        explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType251.setContextRef(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisContext246);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType251.setValue(Boolean.getBoolean(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue248));
                                        
                                        
                                        JAXBElement<BooleanItemType> explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement250 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType251);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement250);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - LoanSanctionDateUnderCGSSD
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap253 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap253.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:SmallEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue254 = DBS16ReportUtil.retrieveValueForElement(field.getLoanSanctionDateUnderCGSSD(), explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap253);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue255 = DBS16ReportUtil.retrieveFieldDataForElement(field.getLoanSanctionDateUnderCGSSD(), explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap253, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue255 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue255.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue255.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue255.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue255.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue255.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue255.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue254 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue254)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext252 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap253 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext252, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        DateItemType explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType257 = new DateItemType();
                                        explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType257.setContextRef(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext252);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType257.setValue(DBS16ReportContextUtil.toXMLGeo(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue254));
                                        
                                        
                                        JAXBElement<DateItemType> explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement256 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createLoanSanctionDateUnderCGSSD(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType257);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement256);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR258 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR258 = createUnitIfNotExist(INR258, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - LoanSanctionedUnderCGSSD
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap260 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap260.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:SmallEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue261 = DBS16ReportUtil.retrieveValueForElement(field.getLoanSanctionedUnderCGSSD(), explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap260);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue262 = DBS16ReportUtil.retrieveFieldDataForElement(field.getLoanSanctionedUnderCGSSD(), explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap260, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue262 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue262.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue262.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue262.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue262.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue262.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue262.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue261 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue261)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext259 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap260 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext259, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType264 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType264.setContextRef(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext259);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType264.setUnitRef(INR258);
                                            explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType264.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType264.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue261));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement263 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createLoanSanctionedUnderCGSSD(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType264);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement263);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMap266 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMap266.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:SmallEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue267 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage(), explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMap266);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue268 = DBS16ReportUtil.retrieveFieldDataForElement(field.getWhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage(), explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMap266, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue268 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue268.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue268.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue268.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue268.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue268.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue268.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue267 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue267)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisContext265 = DBS16ReportContextUtil.createFromToContextWithMembersDBS_StressedMSME_Layout1( bankCode, startDate, endDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMap266 );
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisContext265, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        BooleanItemType explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType270 = new BooleanItemType();
                                        explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType270.setContextRef(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisContext265);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType270.setValue(Boolean.getBoolean(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue267));
                                        
                                        
                                        JAXBElement<BooleanItemType> explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement269 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType270);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement269);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure271 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure271 = createUnitIfNotExist(pure271, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - TenureOfLoanSanctionedUnderTheCGSSD
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap273 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap273.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:SmallEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue274 = DBS16ReportUtil.retrieveValueForElement(field.getTenureOfLoanSanctionedUnderTheCGSSD(), explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap273);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue275 = DBS16ReportUtil.retrieveFieldDataForElement(field.getTenureOfLoanSanctionedUnderTheCGSSD(), explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap273, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue275 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue275.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue275.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue275.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue275.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue275.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue275.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue274 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue274)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext272 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap273 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext272, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        DecimalItemType explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType277 = new DecimalItemType();
                                        explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType277.setContextRef(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext272);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType277.setUnitRef(pure271);
                                            explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType277.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType277.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue274));
                                        
                                        
                                        JAXBElement<DecimalItemType> explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement276 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTenureOfLoanSanctionedUnderTheCGSSD(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType277);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement276);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure278 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure278 = createUnitIfNotExist(pure278, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap280 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap280.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:SmallEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue281 = DBS16ReportUtil.retrieveValueForElement(field.getTenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD(), explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap280);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue282 = DBS16ReportUtil.retrieveFieldDataForElement(field.getTenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD(), explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap280, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue282 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue282.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue282.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue282.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue282.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue282.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue282.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue281 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue281)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext279 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap280 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext279, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        DecimalItemType explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType284 = new DecimalItemType();
                                        explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType284.setContextRef(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext279);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType284.setUnitRef(pure278);
                                            explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType284.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType284.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue281));
                                        
                                        
                                        JAXBElement<DecimalItemType> explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement283 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType284);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement283);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR285 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR285 = createUnitIfNotExist(INR285, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap287 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap287.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:SmallEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue288 = DBS16ReportUtil.retrieveValueForElement(field.getCurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap287);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue289 = DBS16ReportUtil.retrieveFieldDataForElement(field.getCurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap287, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue289 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue289.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue289.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue289.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue289.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue289.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue289.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue288 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue288)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext286 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap287 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext286, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType291 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType291.setContextRef(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext286);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType291.setUnitRef(INR285);
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType291.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType291.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue288));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement290 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createCurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType291);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement290);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - LoanOutstandingClassificationUnderCGSSDAsOnReportingDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap293 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap293.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:SmallEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue294 = DBS16ReportUtil.retrieveValueForElement(field.getLoanOutstandingClassificationUnderCGSSDAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap293);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue295 = DBS16ReportUtil.retrieveFieldDataForElement(field.getLoanOutstandingClassificationUnderCGSSDAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap293, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue295 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue295.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue295.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue295.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue295.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue295.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue295.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue294 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue294)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext292 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap293 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext292, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        LoanOrAccountClassification explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType297 = new LoanOrAccountClassification();
                                        explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType297.setContextRef(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext292);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType297.setValue(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue294);
                                        
                                        
                                        JAXBElement<LoanOrAccountClassification> explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement296 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createLoanOutstandingClassificationUnderCGSSDAsOnReportingDate(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType297);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement296);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR298 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR298 = createUnitIfNotExist(INR298, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap300 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap300.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:SmallEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue301 = DBS16ReportUtil.retrieveValueForElement(field.getCurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap300);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue302 = DBS16ReportUtil.retrieveFieldDataForElement(field.getCurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap300, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue302 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue302.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue302.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue302.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue302.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue302.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue302.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue301 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue301)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext299 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap300 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext299, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType304 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType304.setContextRef(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext299);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType304.setUnitRef(INR298);
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType304.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType304.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue301));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement303 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createCurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType304);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement303);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - MSMEAccountClassificationAsOnReportingDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap306 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap306.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:SmallEnterprisesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue307 = DBS16ReportUtil.retrieveValueForElement(field.getMSMEAccountClassificationAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap306);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue308 = DBS16ReportUtil.retrieveFieldDataForElement(field.getMSMEAccountClassificationAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap306, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue308 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue308.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue308.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue308.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue308.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue308.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberFieldDataValue308.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue307 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue307)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext305 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap306 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext305, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        LoanOrAccountClassification explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType310 = new LoanOrAccountClassification();
                                        explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType310.setContextRef(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext305);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType310.setValue(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberValue307);
                                        
                                        
                                        JAXBElement<LoanOrAccountClassification> explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement309 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createMSMEAccountClassificationAsOnReportingDate(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberDataType310);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisSmallEnterprisesMemberElement309);
                                    
                                    }
                                    
                                

                                
                            
                            
                            
                        
                            
                                
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap312 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap312.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MediumEnterpriseMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue313 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap312);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue314 = DBS16ReportUtil.retrieveFieldDataForElement(field.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap312, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue314 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue314.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue314.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue314.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue314.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue314.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue314.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue313 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue313)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext311 = DBS16ReportContextUtil.createFromToContextWithMembersDBS_StressedMSME_Layout1( bankCode, startDate, endDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap312 );
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext311, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        BooleanItemType explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType316 = new BooleanItemType();
                                        explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType316.setContextRef(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext311);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType316.setValue(Boolean.getBoolean(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue313));
                                        
                                        
                                        JAXBElement<BooleanItemType> explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement315 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType316);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement315);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap318 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap318.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MediumEnterpriseMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue319 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap318);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue320 = DBS16ReportUtil.retrieveFieldDataForElement(field.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap318, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue320 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue320.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue320.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue320.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue320.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue320.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue320.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue319 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue319)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext317 = DBS16ReportContextUtil.createFromToContextWithMembersDBS_StressedMSME_Layout1( bankCode, startDate, endDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap318 );
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext317, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        BooleanItemType explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType322 = new BooleanItemType();
                                        explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType322.setContextRef(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext317);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType322.setValue(Boolean.getBoolean(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue319));
                                        
                                        
                                        JAXBElement<BooleanItemType> explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement321 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType322);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement321);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - NoFraudOrNoWilfulDefaulterFlag
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMap324 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMap324.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MediumEnterpriseMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue325 = DBS16ReportUtil.retrieveValueForElement(field.getNoFraudOrNoWilfulDefaulterFlag(), explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMap324);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue326 = DBS16ReportUtil.retrieveFieldDataForElement(field.getNoFraudOrNoWilfulDefaulterFlag(), explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMap324, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue326 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue326.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue326.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue326.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue326.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue326.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue326.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue325 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue325)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisContext323 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMap324 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisContext323, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        NoFraudOrNoWilfulDefaulterFlag explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType328 = new NoFraudOrNoWilfulDefaulterFlag();
                                        explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType328.setContextRef(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisContext323);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType328.setValue(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue325);
                                        
                                        
                                        JAXBElement<NoFraudOrNoWilfulDefaulterFlag> explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement327 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createNoFraudOrNoWilfulDefaulterFlag(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType328);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement327);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR329 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR329 = createUnitIfNotExist(INR329, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMap331 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMap331.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MediumEnterpriseMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue332 = DBS16ReportUtil.retrieveValueForElement(field.getPromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate(), explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMap331);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue333 = DBS16ReportUtil.retrieveFieldDataForElement(field.getPromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate(), explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMap331, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue333 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue333.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue333.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue333.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue333.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue333.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue333.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue332 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue332)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisContext330 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMap331 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisContext330, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType335 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType335.setContextRef(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisContext330);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType335.setUnitRef(INR329);
                                            explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType335.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType335.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue332));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement334 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType335);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement334);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR336 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR336 = createUnitIfNotExist(INR336, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap338 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap338.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MediumEnterpriseMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue339 = DBS16ReportUtil.retrieveValueForElement(field.getExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap338);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue340 = DBS16ReportUtil.retrieveFieldDataForElement(field.getExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap338, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue340 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue340.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue340.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue340.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue340.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue340.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue340.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue339 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue339)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext337 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap338 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext337, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType342 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType342.setContextRef(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext337);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType342.setUnitRef(INR336);
                                            explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType342.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType342.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue339));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement341 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType342);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement341);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR343 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR343 = createUnitIfNotExist(INR343, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap345 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap345.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MediumEnterpriseMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue346 = DBS16ReportUtil.retrieveValueForElement(field.getExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap345);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue347 = DBS16ReportUtil.retrieveFieldDataForElement(field.getExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap345, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue347 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue347.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue347.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue347.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue347.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue347.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue347.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue346 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue346)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext344 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap345 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext344, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType349 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType349.setContextRef(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext344);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType349.setUnitRef(INR343);
                                            explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType349.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType349.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue346));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement348 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType349);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement348);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMap351 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMap351.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MediumEnterpriseMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue352 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders(), explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMap351);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue353 = DBS16ReportUtil.retrieveFieldDataForElement(field.getWhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders(), explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMap351, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue353 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue353.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue353.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue353.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue353.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue353.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue353.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue352 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue352)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisContext350 = DBS16ReportContextUtil.createFromToContextWithMembersDBS_StressedMSME_Layout1( bankCode, startDate, endDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMap351 );
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisContext350, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        BooleanItemType explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType355 = new BooleanItemType();
                                        explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType355.setContextRef(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisContext350);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType355.setValue(Boolean.getBoolean(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue352));
                                        
                                        
                                        JAXBElement<BooleanItemType> explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement354 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType355);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement354);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - LoanSanctionDateUnderCGSSD
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap357 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap357.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MediumEnterpriseMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue358 = DBS16ReportUtil.retrieveValueForElement(field.getLoanSanctionDateUnderCGSSD(), explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap357);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue359 = DBS16ReportUtil.retrieveFieldDataForElement(field.getLoanSanctionDateUnderCGSSD(), explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap357, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue359 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue359.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue359.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue359.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue359.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue359.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue359.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue358 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue358)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext356 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap357 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext356, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        DateItemType explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType361 = new DateItemType();
                                        explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType361.setContextRef(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext356);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType361.setValue(DBS16ReportContextUtil.toXMLGeo(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue358));
                                        
                                        
                                        JAXBElement<DateItemType> explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement360 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createLoanSanctionDateUnderCGSSD(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType361);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement360);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR362 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR362 = createUnitIfNotExist(INR362, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - LoanSanctionedUnderCGSSD
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap364 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap364.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MediumEnterpriseMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue365 = DBS16ReportUtil.retrieveValueForElement(field.getLoanSanctionedUnderCGSSD(), explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap364);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue366 = DBS16ReportUtil.retrieveFieldDataForElement(field.getLoanSanctionedUnderCGSSD(), explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap364, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue366 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue366.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue366.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue366.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue366.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue366.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue366.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue365 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue365)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext363 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap364 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext363, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType368 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType368.setContextRef(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext363);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType368.setUnitRef(INR362);
                                            explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType368.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType368.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue365));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement367 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createLoanSanctionedUnderCGSSD(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType368);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement367);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMap370 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMap370.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MediumEnterpriseMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue371 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage(), explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMap370);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue372 = DBS16ReportUtil.retrieveFieldDataForElement(field.getWhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage(), explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMap370, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue372 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue372.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue372.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue372.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue372.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue372.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue372.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue371 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue371)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisContext369 = DBS16ReportContextUtil.createFromToContextWithMembersDBS_StressedMSME_Layout1( bankCode, startDate, endDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMap370 );
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisContext369, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        BooleanItemType explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType374 = new BooleanItemType();
                                        explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType374.setContextRef(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisContext369);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType374.setValue(Boolean.getBoolean(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue371));
                                        
                                        
                                        JAXBElement<BooleanItemType> explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement373 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType374);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement373);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure375 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure375 = createUnitIfNotExist(pure375, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - TenureOfLoanSanctionedUnderTheCGSSD
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap377 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap377.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MediumEnterpriseMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue378 = DBS16ReportUtil.retrieveValueForElement(field.getTenureOfLoanSanctionedUnderTheCGSSD(), explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap377);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue379 = DBS16ReportUtil.retrieveFieldDataForElement(field.getTenureOfLoanSanctionedUnderTheCGSSD(), explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap377, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue379 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue379.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue379.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue379.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue379.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue379.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue379.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue378 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue378)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext376 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap377 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext376, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        DecimalItemType explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType381 = new DecimalItemType();
                                        explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType381.setContextRef(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext376);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType381.setUnitRef(pure375);
                                            explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType381.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType381.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue378));
                                        
                                        
                                        JAXBElement<DecimalItemType> explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement380 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTenureOfLoanSanctionedUnderTheCGSSD(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType381);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement380);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure382 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure382 = createUnitIfNotExist(pure382, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap384 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap384.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MediumEnterpriseMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue385 = DBS16ReportUtil.retrieveValueForElement(field.getTenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD(), explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap384);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue386 = DBS16ReportUtil.retrieveFieldDataForElement(field.getTenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD(), explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap384, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue386 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue386.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue386.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue386.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue386.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue386.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue386.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue385 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue385)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext383 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMap384 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext383, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        DecimalItemType explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType388 = new DecimalItemType();
                                        explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType388.setContextRef(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisContext383);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType388.setUnitRef(pure382);
                                            explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType388.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType388.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue385));
                                        
                                        
                                        JAXBElement<DecimalItemType> explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement387 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType388);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement387);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR389 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR389 = createUnitIfNotExist(INR389, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap391 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap391.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MediumEnterpriseMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue392 = DBS16ReportUtil.retrieveValueForElement(field.getCurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap391);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue393 = DBS16ReportUtil.retrieveFieldDataForElement(field.getCurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap391, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue393 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue393.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue393.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue393.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue393.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue393.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue393.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue392 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue392)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext390 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap391 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext390, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType395 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType395.setContextRef(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext390);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType395.setUnitRef(INR389);
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType395.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType395.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue392));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement394 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createCurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType395);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement394);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - LoanOutstandingClassificationUnderCGSSDAsOnReportingDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap397 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap397.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MediumEnterpriseMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue398 = DBS16ReportUtil.retrieveValueForElement(field.getLoanOutstandingClassificationUnderCGSSDAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap397);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue399 = DBS16ReportUtil.retrieveFieldDataForElement(field.getLoanOutstandingClassificationUnderCGSSDAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap397, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue399 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue399.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue399.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue399.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue399.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue399.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue399.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue398 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue398)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext396 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap397 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext396, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        LoanOrAccountClassification explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType401 = new LoanOrAccountClassification();
                                        explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType401.setContextRef(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext396);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType401.setValue(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue398);
                                        
                                        
                                        JAXBElement<LoanOrAccountClassification> explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement400 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createLoanOutstandingClassificationUnderCGSSDAsOnReportingDate(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType401);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement400);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR402 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR402 = createUnitIfNotExist(INR402, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap404 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap404.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MediumEnterpriseMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue405 = DBS16ReportUtil.retrieveValueForElement(field.getCurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap404);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue406 = DBS16ReportUtil.retrieveFieldDataForElement(field.getCurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap404, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue406 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue406.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue406.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue406.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue406.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue406.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue406.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue405 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue405)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext403 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMap404 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext403, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType408 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType408.setContextRef(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisContext403);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType408.setUnitRef(INR402);
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType408.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType408.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue405));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement407 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createCurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType408);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement407);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis - MSMEAccountClassificationAsOnReportingDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap410 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap410.put("rbi-core:MicroSmallAndMediumEnterprisesCategoryAxis", "in-rbi-rep:MediumEnterpriseMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue411 = DBS16ReportUtil.retrieveValueForElement(field.getMSMEAccountClassificationAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap410);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue412 = DBS16ReportUtil.retrieveFieldDataForElement(field.getMSMEAccountClassificationAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap410, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue412 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue412.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue412.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue412.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue412.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue412.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberFieldDataValue412.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue411 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue411)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext409 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMap410 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext409, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        LoanOrAccountClassification explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType414 = new LoanOrAccountClassification();
                                        explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType414.setContextRef(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisContext409);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType414.setValue(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberValue411);
                                        
                                        
                                        JAXBElement<LoanOrAccountClassification> explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement413 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createMSMEAccountClassificationAsOnReportingDate(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberDataType414);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMicroSmallAndMediumEnterprisesCategoryAxisMediumEnterpriseMemberElement413);
                                    
                                    }
                                    
                                

                                
                            
                            
                            
                        
                            
                                
                                
                                
                                //in-rbi-rep:SectorsAxis - WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisMap416 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisMap416.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ManufacturingMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisManufacturingMemberValue417 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisMap416);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue418 = DBS16ReportUtil.retrieveFieldDataForElement(field.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisMap416, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue418 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue418.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue418.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue418.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue418.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue418.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue418.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisManufacturingMemberValue417 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisManufacturingMemberValue417)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisContext415 = DBS16ReportContextUtil.createFromToContextWithMembersDBS_StressedMSME_Layout1( bankCode, startDate, endDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisMap416 );
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisContext415, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        BooleanItemType explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisManufacturingMemberDataType420 = new BooleanItemType();
                                        explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisManufacturingMemberDataType420.setContextRef(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisContext415);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisManufacturingMemberDataType420.setValue(Boolean.getBoolean(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisManufacturingMemberValue417));
                                        
                                        
                                        JAXBElement<BooleanItemType> explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisManufacturingMemberElement419 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisManufacturingMemberDataType420);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisManufacturingMemberElement419);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //in-rbi-rep:SectorsAxis - WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisMap422 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisMap422.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ManufacturingMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisManufacturingMemberValue423 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisMap422);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue424 = DBS16ReportUtil.retrieveFieldDataForElement(field.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisMap422, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue424 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue424.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue424.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue424.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue424.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue424.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue424.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisManufacturingMemberValue423 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisManufacturingMemberValue423)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisContext421 = DBS16ReportContextUtil.createFromToContextWithMembersDBS_StressedMSME_Layout1( bankCode, startDate, endDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisMap422 );
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisContext421, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        BooleanItemType explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisManufacturingMemberDataType426 = new BooleanItemType();
                                        explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisManufacturingMemberDataType426.setContextRef(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisContext421);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisManufacturingMemberDataType426.setValue(Boolean.getBoolean(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisManufacturingMemberValue423));
                                        
                                        
                                        JAXBElement<BooleanItemType> explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisManufacturingMemberElement425 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisManufacturingMemberDataType426);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisManufacturingMemberElement425);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //in-rbi-rep:SectorsAxis - NoFraudOrNoWilfulDefaulterFlag
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisMap428 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisMap428.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ManufacturingMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisManufacturingMemberValue429 = DBS16ReportUtil.retrieveValueForElement(field.getNoFraudOrNoWilfulDefaulterFlag(), explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisMap428);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisManufacturingMemberFieldDataValue430 = DBS16ReportUtil.retrieveFieldDataForElement(field.getNoFraudOrNoWilfulDefaulterFlag(), explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisMap428, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisManufacturingMemberFieldDataValue430 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisManufacturingMemberFieldDataValue430.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisManufacturingMemberFieldDataValue430.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisManufacturingMemberFieldDataValue430.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisManufacturingMemberFieldDataValue430.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisManufacturingMemberFieldDataValue430.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisManufacturingMemberFieldDataValue430.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisManufacturingMemberValue429 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisManufacturingMemberValue429)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisContext427 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisMap428 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisContext427, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        NoFraudOrNoWilfulDefaulterFlag explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisManufacturingMemberDataType432 = new NoFraudOrNoWilfulDefaulterFlag();
                                        explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisManufacturingMemberDataType432.setContextRef(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisContext427);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisManufacturingMemberDataType432.setValue(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisManufacturingMemberValue429);
                                        
                                        
                                        JAXBElement<NoFraudOrNoWilfulDefaulterFlag> explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisManufacturingMemberElement431 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createNoFraudOrNoWilfulDefaulterFlag(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisManufacturingMemberDataType432);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisManufacturingMemberElement431);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR433 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR433 = createUnitIfNotExist(INR433, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //in-rbi-rep:SectorsAxis - PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisMap435 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisMap435.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ManufacturingMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisManufacturingMemberValue436 = DBS16ReportUtil.retrieveValueForElement(field.getPromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate(), explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisMap435);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisManufacturingMemberFieldDataValue437 = DBS16ReportUtil.retrieveFieldDataForElement(field.getPromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate(), explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisMap435, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisManufacturingMemberFieldDataValue437 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisManufacturingMemberFieldDataValue437.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisManufacturingMemberFieldDataValue437.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisManufacturingMemberFieldDataValue437.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisManufacturingMemberFieldDataValue437.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisManufacturingMemberFieldDataValue437.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisManufacturingMemberFieldDataValue437.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisManufacturingMemberValue436 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisManufacturingMemberValue436)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisContext434 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisMap435 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisContext434, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisManufacturingMemberDataType439 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisManufacturingMemberDataType439.setContextRef(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisContext434);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisManufacturingMemberDataType439.setUnitRef(INR433);
                                            explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisManufacturingMemberDataType439.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisManufacturingMemberDataType439.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisManufacturingMemberValue436));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisManufacturingMemberElement438 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisManufacturingMemberDataType439);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisManufacturingMemberElement438);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR440 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR440 = createUnitIfNotExist(INR440, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //in-rbi-rep:SectorsAxis - ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisMap442 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisMap442.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ManufacturingMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberValue443 = DBS16ReportUtil.retrieveValueForElement(field.getExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisMap442);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue444 = DBS16ReportUtil.retrieveFieldDataForElement(field.getExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisMap442, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue444 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue444.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue444.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue444.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue444.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue444.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue444.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberValue443 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberValue443)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisContext441 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisMap442 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisContext441, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberDataType446 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberDataType446.setContextRef(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisContext441);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberDataType446.setUnitRef(INR440);
                                            explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberDataType446.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberDataType446.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberValue443));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberElement445 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberDataType446);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberElement445);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR447 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR447 = createUnitIfNotExist(INR447, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //in-rbi-rep:SectorsAxis - ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisMap449 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisMap449.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ManufacturingMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberValue450 = DBS16ReportUtil.retrieveValueForElement(field.getExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisMap449);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue451 = DBS16ReportUtil.retrieveFieldDataForElement(field.getExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisMap449, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue451 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue451.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue451.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue451.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue451.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue451.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue451.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberValue450 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberValue450)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisContext448 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisMap449 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisContext448, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberDataType453 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberDataType453.setContextRef(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisContext448);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberDataType453.setUnitRef(INR447);
                                            explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberDataType453.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberDataType453.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberValue450));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberElement452 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberDataType453);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisManufacturingMemberElement452);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //in-rbi-rep:SectorsAxis - WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisMap455 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisMap455.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ManufacturingMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisManufacturingMemberValue456 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders(), explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisMap455);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisManufacturingMemberFieldDataValue457 = DBS16ReportUtil.retrieveFieldDataForElement(field.getWhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders(), explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisMap455, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisManufacturingMemberFieldDataValue457 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisManufacturingMemberFieldDataValue457.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisManufacturingMemberFieldDataValue457.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisManufacturingMemberFieldDataValue457.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisManufacturingMemberFieldDataValue457.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisManufacturingMemberFieldDataValue457.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisManufacturingMemberFieldDataValue457.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisManufacturingMemberValue456 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisManufacturingMemberValue456)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisContext454 = DBS16ReportContextUtil.createFromToContextWithMembersDBS_StressedMSME_Layout1( bankCode, startDate, endDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisMap455 );
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisContext454, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        BooleanItemType explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisManufacturingMemberDataType459 = new BooleanItemType();
                                        explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisManufacturingMemberDataType459.setContextRef(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisContext454);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisManufacturingMemberDataType459.setValue(Boolean.getBoolean(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisManufacturingMemberValue456));
                                        
                                        
                                        JAXBElement<BooleanItemType> explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisManufacturingMemberElement458 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisManufacturingMemberDataType459);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisManufacturingMemberElement458);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //in-rbi-rep:SectorsAxis - LoanSanctionDateUnderCGSSD
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisMap461 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisMap461.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ManufacturingMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisManufacturingMemberValue462 = DBS16ReportUtil.retrieveValueForElement(field.getLoanSanctionDateUnderCGSSD(), explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisMap461);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisManufacturingMemberFieldDataValue463 = DBS16ReportUtil.retrieveFieldDataForElement(field.getLoanSanctionDateUnderCGSSD(), explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisMap461, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisManufacturingMemberFieldDataValue463 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisManufacturingMemberFieldDataValue463.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisManufacturingMemberFieldDataValue463.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisManufacturingMemberFieldDataValue463.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisManufacturingMemberFieldDataValue463.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisManufacturingMemberFieldDataValue463.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisManufacturingMemberFieldDataValue463.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisManufacturingMemberValue462 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisManufacturingMemberValue462)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisContext460 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisMap461 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisContext460, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        DateItemType explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisManufacturingMemberDataType465 = new DateItemType();
                                        explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisManufacturingMemberDataType465.setContextRef(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisContext460);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisManufacturingMemberDataType465.setValue(DBS16ReportContextUtil.toXMLGeo(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisManufacturingMemberValue462));
                                        
                                        
                                        JAXBElement<DateItemType> explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisManufacturingMemberElement464 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createLoanSanctionDateUnderCGSSD(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisManufacturingMemberDataType465);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisManufacturingMemberElement464);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR466 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR466 = createUnitIfNotExist(INR466, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //in-rbi-rep:SectorsAxis - LoanSanctionedUnderCGSSD
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisMap468 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisMap468.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ManufacturingMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisManufacturingMemberValue469 = DBS16ReportUtil.retrieveValueForElement(field.getLoanSanctionedUnderCGSSD(), explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisMap468);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisManufacturingMemberFieldDataValue470 = DBS16ReportUtil.retrieveFieldDataForElement(field.getLoanSanctionedUnderCGSSD(), explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisMap468, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisManufacturingMemberFieldDataValue470 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisManufacturingMemberFieldDataValue470.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisManufacturingMemberFieldDataValue470.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisManufacturingMemberFieldDataValue470.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisManufacturingMemberFieldDataValue470.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisManufacturingMemberFieldDataValue470.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisManufacturingMemberFieldDataValue470.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisManufacturingMemberValue469 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisManufacturingMemberValue469)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisContext467 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisMap468 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisContext467, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisManufacturingMemberDataType472 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisManufacturingMemberDataType472.setContextRef(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisContext467);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisManufacturingMemberDataType472.setUnitRef(INR466);
                                            explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisManufacturingMemberDataType472.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisManufacturingMemberDataType472.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisManufacturingMemberValue469));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisManufacturingMemberElement471 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createLoanSanctionedUnderCGSSD(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisManufacturingMemberDataType472);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisManufacturingMemberElement471);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //in-rbi-rep:SectorsAxis - WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisMap474 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisMap474.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ManufacturingMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisManufacturingMemberValue475 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage(), explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisMap474);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisManufacturingMemberFieldDataValue476 = DBS16ReportUtil.retrieveFieldDataForElement(field.getWhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage(), explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisMap474, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisManufacturingMemberFieldDataValue476 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisManufacturingMemberFieldDataValue476.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisManufacturingMemberFieldDataValue476.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisManufacturingMemberFieldDataValue476.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisManufacturingMemberFieldDataValue476.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisManufacturingMemberFieldDataValue476.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisManufacturingMemberFieldDataValue476.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisManufacturingMemberValue475 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisManufacturingMemberValue475)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisContext473 = DBS16ReportContextUtil.createFromToContextWithMembersDBS_StressedMSME_Layout1( bankCode, startDate, endDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisMap474 );
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisContext473, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        BooleanItemType explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisManufacturingMemberDataType478 = new BooleanItemType();
                                        explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisManufacturingMemberDataType478.setContextRef(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisContext473);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisManufacturingMemberDataType478.setValue(Boolean.getBoolean(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisManufacturingMemberValue475));
                                        
                                        
                                        JAXBElement<BooleanItemType> explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisManufacturingMemberElement477 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisManufacturingMemberDataType478);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisManufacturingMemberElement477);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure479 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure479 = createUnitIfNotExist(pure479, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //in-rbi-rep:SectorsAxis - TenureOfLoanSanctionedUnderTheCGSSD
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisMap481 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisMap481.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ManufacturingMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberValue482 = DBS16ReportUtil.retrieveValueForElement(field.getTenureOfLoanSanctionedUnderTheCGSSD(), explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisMap481);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberFieldDataValue483 = DBS16ReportUtil.retrieveFieldDataForElement(field.getTenureOfLoanSanctionedUnderTheCGSSD(), explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisMap481, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberFieldDataValue483 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberFieldDataValue483.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberFieldDataValue483.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberFieldDataValue483.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberFieldDataValue483.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberFieldDataValue483.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberFieldDataValue483.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberValue482 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberValue482)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisContext480 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisMap481 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisContext480, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        DecimalItemType explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberDataType485 = new DecimalItemType();
                                        explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberDataType485.setContextRef(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisContext480);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberDataType485.setUnitRef(pure479);
                                            explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberDataType485.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberDataType485.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberValue482));
                                        
                                        
                                        JAXBElement<DecimalItemType> explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberElement484 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTenureOfLoanSanctionedUnderTheCGSSD(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberDataType485);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberElement484);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure486 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure486 = createUnitIfNotExist(pure486, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //in-rbi-rep:SectorsAxis - TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisMap488 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisMap488.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ManufacturingMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberValue489 = DBS16ReportUtil.retrieveValueForElement(field.getTenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD(), explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisMap488);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberFieldDataValue490 = DBS16ReportUtil.retrieveFieldDataForElement(field.getTenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD(), explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisMap488, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberFieldDataValue490 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberFieldDataValue490.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberFieldDataValue490.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberFieldDataValue490.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberFieldDataValue490.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberFieldDataValue490.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberFieldDataValue490.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberValue489 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberValue489)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisContext487 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisMap488 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisContext487, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        DecimalItemType explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberDataType492 = new DecimalItemType();
                                        explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberDataType492.setContextRef(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisContext487);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberDataType492.setUnitRef(pure486);
                                            explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberDataType492.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberDataType492.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberValue489));
                                        
                                        
                                        JAXBElement<DecimalItemType> explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberElement491 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberDataType492);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisManufacturingMemberElement491);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR493 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR493 = createUnitIfNotExist(INR493, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //in-rbi-rep:SectorsAxis - CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisMap495 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisMap495.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ManufacturingMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberValue496 = DBS16ReportUtil.retrieveValueForElement(field.getCurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisMap495);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberFieldDataValue497 = DBS16ReportUtil.retrieveFieldDataForElement(field.getCurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisMap495, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberFieldDataValue497 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberFieldDataValue497.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberFieldDataValue497.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberFieldDataValue497.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberFieldDataValue497.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberFieldDataValue497.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberFieldDataValue497.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberValue496 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberValue496)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisContext494 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisMap495 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisContext494, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberDataType499 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberDataType499.setContextRef(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisContext494);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberDataType499.setUnitRef(INR493);
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberDataType499.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberDataType499.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberValue496));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberElement498 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createCurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberDataType499);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberElement498);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //in-rbi-rep:SectorsAxis - LoanOutstandingClassificationUnderCGSSDAsOnReportingDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisMap501 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisMap501.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ManufacturingMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberValue502 = DBS16ReportUtil.retrieveValueForElement(field.getLoanOutstandingClassificationUnderCGSSDAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisMap501);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberFieldDataValue503 = DBS16ReportUtil.retrieveFieldDataForElement(field.getLoanOutstandingClassificationUnderCGSSDAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisMap501, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberFieldDataValue503 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberFieldDataValue503.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberFieldDataValue503.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberFieldDataValue503.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberFieldDataValue503.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberFieldDataValue503.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberFieldDataValue503.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberValue502 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberValue502)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisContext500 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisMap501 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisContext500, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        LoanOrAccountClassification explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberDataType505 = new LoanOrAccountClassification();
                                        explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberDataType505.setContextRef(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisContext500);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberDataType505.setValue(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberValue502);
                                        
                                        
                                        JAXBElement<LoanOrAccountClassification> explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberElement504 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createLoanOutstandingClassificationUnderCGSSDAsOnReportingDate(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberDataType505);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisManufacturingMemberElement504);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR506 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR506 = createUnitIfNotExist(INR506, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //in-rbi-rep:SectorsAxis - CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisMap508 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisMap508.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ManufacturingMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisManufacturingMemberValue509 = DBS16ReportUtil.retrieveValueForElement(field.getCurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisMap508);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue510 = DBS16ReportUtil.retrieveFieldDataForElement(field.getCurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisMap508, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue510 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue510.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue510.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue510.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue510.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue510.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisManufacturingMemberFieldDataValue510.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisManufacturingMemberValue509 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisManufacturingMemberValue509)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisContext507 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisMap508 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisContext507, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisManufacturingMemberDataType512 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisManufacturingMemberDataType512.setContextRef(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisContext507);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisManufacturingMemberDataType512.setUnitRef(INR506);
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisManufacturingMemberDataType512.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisManufacturingMemberDataType512.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisManufacturingMemberValue509));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisManufacturingMemberElement511 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createCurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisManufacturingMemberDataType512);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisManufacturingMemberElement511);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //in-rbi-rep:SectorsAxis - MSMEAccountClassificationAsOnReportingDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisMap514 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisMap514.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ManufacturingMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisManufacturingMemberValue515 = DBS16ReportUtil.retrieveValueForElement(field.getMSMEAccountClassificationAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisMap514);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisManufacturingMemberFieldDataValue516 = DBS16ReportUtil.retrieveFieldDataForElement(field.getMSMEAccountClassificationAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisMap514, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisManufacturingMemberFieldDataValue516 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisManufacturingMemberFieldDataValue516.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisManufacturingMemberFieldDataValue516.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisManufacturingMemberFieldDataValue516.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisManufacturingMemberFieldDataValue516.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisManufacturingMemberFieldDataValue516.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisManufacturingMemberFieldDataValue516.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisManufacturingMemberValue515 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisManufacturingMemberValue515)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisContext513 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisMap514 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisContext513, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        LoanOrAccountClassification explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisManufacturingMemberDataType518 = new LoanOrAccountClassification();
                                        explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisManufacturingMemberDataType518.setContextRef(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisContext513);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisManufacturingMemberDataType518.setValue(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisManufacturingMemberValue515);
                                        
                                        
                                        JAXBElement<LoanOrAccountClassification> explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisManufacturingMemberElement517 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createMSMEAccountClassificationAsOnReportingDate(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisManufacturingMemberDataType518);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisManufacturingMemberElement517);
                                    
                                    }
                                    
                                

                                
                            
                            
                            
                        
                            
                                
                                
                                
                                //in-rbi-rep:SectorsAxis - WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisMap520 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisMap520.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ServicesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisServicesMemberValue521 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisMap520);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue522 = DBS16ReportUtil.retrieveFieldDataForElement(field.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisMap520, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue522 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue522.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue522.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue522.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue522.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue522.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue522.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisServicesMemberValue521 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisServicesMemberValue521)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisContext519 = DBS16ReportContextUtil.createFromToContextWithMembersDBS_StressedMSME_Layout1( bankCode, startDate, endDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisMap520 );
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisContext519, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        BooleanItemType explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisServicesMemberDataType524 = new BooleanItemType();
                                        explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisServicesMemberDataType524.setContextRef(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisContext519);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisServicesMemberDataType524.setValue(Boolean.getBoolean(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisServicesMemberValue521));
                                        
                                        
                                        JAXBElement<BooleanItemType> explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisServicesMemberElement523 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisServicesMemberDataType524);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateSectorsAxisServicesMemberElement523);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //in-rbi-rep:SectorsAxis - WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisMap526 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisMap526.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ServicesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisServicesMemberValue527 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisMap526);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue528 = DBS16ReportUtil.retrieveFieldDataForElement(field.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisMap526, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue528 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue528.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue528.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue528.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue528.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue528.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue528.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisServicesMemberValue527 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisServicesMemberValue527)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisContext525 = DBS16ReportContextUtil.createFromToContextWithMembersDBS_StressedMSME_Layout1( bankCode, startDate, endDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisMap526 );
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisContext525, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        BooleanItemType explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisServicesMemberDataType530 = new BooleanItemType();
                                        explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisServicesMemberDataType530.setContextRef(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisContext525);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisServicesMemberDataType530.setValue(Boolean.getBoolean(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisServicesMemberValue527));
                                        
                                        
                                        JAXBElement<BooleanItemType> explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisServicesMemberElement529 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisServicesMemberDataType530);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateSectorsAxisServicesMemberElement529);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //in-rbi-rep:SectorsAxis - NoFraudOrNoWilfulDefaulterFlag
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisMap532 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisMap532.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ServicesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisServicesMemberValue533 = DBS16ReportUtil.retrieveValueForElement(field.getNoFraudOrNoWilfulDefaulterFlag(), explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisMap532);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisServicesMemberFieldDataValue534 = DBS16ReportUtil.retrieveFieldDataForElement(field.getNoFraudOrNoWilfulDefaulterFlag(), explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisMap532, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisServicesMemberFieldDataValue534 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisServicesMemberFieldDataValue534.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisServicesMemberFieldDataValue534.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisServicesMemberFieldDataValue534.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisServicesMemberFieldDataValue534.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisServicesMemberFieldDataValue534.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisServicesMemberFieldDataValue534.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisServicesMemberValue533 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisServicesMemberValue533)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisContext531 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisMap532 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisContext531, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        NoFraudOrNoWilfulDefaulterFlag explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisServicesMemberDataType536 = new NoFraudOrNoWilfulDefaulterFlag();
                                        explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisServicesMemberDataType536.setContextRef(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisContext531);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisServicesMemberDataType536.setValue(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisServicesMemberValue533);
                                        
                                        
                                        JAXBElement<NoFraudOrNoWilfulDefaulterFlag> explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisServicesMemberElement535 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createNoFraudOrNoWilfulDefaulterFlag(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisServicesMemberDataType536);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagSectorsAxisServicesMemberElement535);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR537 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR537 = createUnitIfNotExist(INR537, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //in-rbi-rep:SectorsAxis - PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisMap539 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisMap539.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ServicesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisServicesMemberValue540 = DBS16ReportUtil.retrieveValueForElement(field.getPromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate(), explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisMap539);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisServicesMemberFieldDataValue541 = DBS16ReportUtil.retrieveFieldDataForElement(field.getPromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate(), explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisMap539, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisServicesMemberFieldDataValue541 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisServicesMemberFieldDataValue541.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisServicesMemberFieldDataValue541.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisServicesMemberFieldDataValue541.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisServicesMemberFieldDataValue541.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisServicesMemberFieldDataValue541.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisServicesMemberFieldDataValue541.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisServicesMemberValue540 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisServicesMemberValue540)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisContext538 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisMap539 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisContext538, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisServicesMemberDataType543 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisServicesMemberDataType543.setContextRef(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisContext538);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisServicesMemberDataType543.setUnitRef(INR537);
                                            explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisServicesMemberDataType543.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisServicesMemberDataType543.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisServicesMemberValue540));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisServicesMemberElement542 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisServicesMemberDataType543);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateSectorsAxisServicesMemberElement542);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR544 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR544 = createUnitIfNotExist(INR544, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //in-rbi-rep:SectorsAxis - ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisMap546 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisMap546.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ServicesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberValue547 = DBS16ReportUtil.retrieveValueForElement(field.getExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisMap546);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue548 = DBS16ReportUtil.retrieveFieldDataForElement(field.getExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisMap546, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue548 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue548.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue548.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue548.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue548.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue548.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue548.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberValue547 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberValue547)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisContext545 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisMap546 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisContext545, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberDataType550 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberDataType550.setContextRef(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisContext545);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberDataType550.setUnitRef(INR544);
                                            explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberDataType550.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberDataType550.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberValue547));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberElement549 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberDataType550);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberElement549);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR551 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR551 = createUnitIfNotExist(INR551, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //in-rbi-rep:SectorsAxis - ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisMap553 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisMap553.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ServicesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberValue554 = DBS16ReportUtil.retrieveValueForElement(field.getExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisMap553);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue555 = DBS16ReportUtil.retrieveFieldDataForElement(field.getExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisMap553, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue555 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue555.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue555.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue555.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue555.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue555.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberFieldDataValue555.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberValue554 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberValue554)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisContext552 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisMap553 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisContext552, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberDataType557 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberDataType557.setContextRef(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisContext552);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberDataType557.setUnitRef(INR551);
                                            explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberDataType557.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberDataType557.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberValue554));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberElement556 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberDataType557);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateSectorsAxisServicesMemberElement556);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //in-rbi-rep:SectorsAxis - WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisMap559 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisMap559.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ServicesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisServicesMemberValue560 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders(), explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisMap559);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisServicesMemberFieldDataValue561 = DBS16ReportUtil.retrieveFieldDataForElement(field.getWhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders(), explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisMap559, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisServicesMemberFieldDataValue561 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisServicesMemberFieldDataValue561.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisServicesMemberFieldDataValue561.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisServicesMemberFieldDataValue561.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisServicesMemberFieldDataValue561.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisServicesMemberFieldDataValue561.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisServicesMemberFieldDataValue561.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisServicesMemberValue560 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisServicesMemberValue560)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisContext558 = DBS16ReportContextUtil.createFromToContextWithMembersDBS_StressedMSME_Layout1( bankCode, startDate, endDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisMap559 );
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisContext558, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        BooleanItemType explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisServicesMemberDataType563 = new BooleanItemType();
                                        explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisServicesMemberDataType563.setContextRef(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisContext558);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisServicesMemberDataType563.setValue(Boolean.getBoolean(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisServicesMemberValue560));
                                        
                                        
                                        JAXBElement<BooleanItemType> explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisServicesMemberElement562 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisServicesMemberDataType563);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersSectorsAxisServicesMemberElement562);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //in-rbi-rep:SectorsAxis - LoanSanctionDateUnderCGSSD
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisMap565 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisMap565.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ServicesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisServicesMemberValue566 = DBS16ReportUtil.retrieveValueForElement(field.getLoanSanctionDateUnderCGSSD(), explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisMap565);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisServicesMemberFieldDataValue567 = DBS16ReportUtil.retrieveFieldDataForElement(field.getLoanSanctionDateUnderCGSSD(), explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisMap565, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisServicesMemberFieldDataValue567 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisServicesMemberFieldDataValue567.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisServicesMemberFieldDataValue567.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisServicesMemberFieldDataValue567.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisServicesMemberFieldDataValue567.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisServicesMemberFieldDataValue567.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisServicesMemberFieldDataValue567.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisServicesMemberValue566 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisServicesMemberValue566)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisContext564 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisMap565 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisContext564, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        DateItemType explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisServicesMemberDataType569 = new DateItemType();
                                        explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisServicesMemberDataType569.setContextRef(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisContext564);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisServicesMemberDataType569.setValue(DBS16ReportContextUtil.toXMLGeo(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisServicesMemberValue566));
                                        
                                        
                                        JAXBElement<DateItemType> explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisServicesMemberElement568 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createLoanSanctionDateUnderCGSSD(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisServicesMemberDataType569);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDSectorsAxisServicesMemberElement568);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR570 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR570 = createUnitIfNotExist(INR570, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //in-rbi-rep:SectorsAxis - LoanSanctionedUnderCGSSD
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisMap572 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisMap572.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ServicesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisServicesMemberValue573 = DBS16ReportUtil.retrieveValueForElement(field.getLoanSanctionedUnderCGSSD(), explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisMap572);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisServicesMemberFieldDataValue574 = DBS16ReportUtil.retrieveFieldDataForElement(field.getLoanSanctionedUnderCGSSD(), explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisMap572, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisServicesMemberFieldDataValue574 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisServicesMemberFieldDataValue574.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisServicesMemberFieldDataValue574.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisServicesMemberFieldDataValue574.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisServicesMemberFieldDataValue574.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisServicesMemberFieldDataValue574.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisServicesMemberFieldDataValue574.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisServicesMemberValue573 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisServicesMemberValue573)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisContext571 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisMap572 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisContext571, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisServicesMemberDataType576 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisServicesMemberDataType576.setContextRef(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisContext571);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisServicesMemberDataType576.setUnitRef(INR570);
                                            explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisServicesMemberDataType576.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisServicesMemberDataType576.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisServicesMemberValue573));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisServicesMemberElement575 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createLoanSanctionedUnderCGSSD(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisServicesMemberDataType576);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDSectorsAxisServicesMemberElement575);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //in-rbi-rep:SectorsAxis - WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisMap578 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisMap578.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ServicesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisServicesMemberValue579 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage(), explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisMap578);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisServicesMemberFieldDataValue580 = DBS16ReportUtil.retrieveFieldDataForElement(field.getWhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage(), explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisMap578, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisServicesMemberFieldDataValue580 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisServicesMemberFieldDataValue580.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisServicesMemberFieldDataValue580.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisServicesMemberFieldDataValue580.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisServicesMemberFieldDataValue580.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisServicesMemberFieldDataValue580.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisServicesMemberFieldDataValue580.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisServicesMemberValue579 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisServicesMemberValue579)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisContext577 = DBS16ReportContextUtil.createFromToContextWithMembersDBS_StressedMSME_Layout1( bankCode, startDate, endDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisMap578 );
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisContext577, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        BooleanItemType explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisServicesMemberDataType582 = new BooleanItemType();
                                        explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisServicesMemberDataType582.setContextRef(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisContext577);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisServicesMemberDataType582.setValue(Boolean.getBoolean(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisServicesMemberValue579));
                                        
                                        
                                        JAXBElement<BooleanItemType> explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisServicesMemberElement581 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisServicesMemberDataType582);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageSectorsAxisServicesMemberElement581);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure583 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure583 = createUnitIfNotExist(pure583, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //in-rbi-rep:SectorsAxis - TenureOfLoanSanctionedUnderTheCGSSD
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisMap585 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisMap585.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ServicesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberValue586 = DBS16ReportUtil.retrieveValueForElement(field.getTenureOfLoanSanctionedUnderTheCGSSD(), explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisMap585);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberFieldDataValue587 = DBS16ReportUtil.retrieveFieldDataForElement(field.getTenureOfLoanSanctionedUnderTheCGSSD(), explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisMap585, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberFieldDataValue587 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberFieldDataValue587.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberFieldDataValue587.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberFieldDataValue587.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberFieldDataValue587.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberFieldDataValue587.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberFieldDataValue587.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberValue586 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberValue586)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisContext584 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisMap585 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisContext584, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        DecimalItemType explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberDataType589 = new DecimalItemType();
                                        explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberDataType589.setContextRef(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisContext584);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberDataType589.setUnitRef(pure583);
                                            explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberDataType589.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberDataType589.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberValue586));
                                        
                                        
                                        JAXBElement<DecimalItemType> explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberElement588 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTenureOfLoanSanctionedUnderTheCGSSD(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberDataType589);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberElement588);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure590 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure590 = createUnitIfNotExist(pure590, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //in-rbi-rep:SectorsAxis - TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisMap592 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisMap592.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ServicesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberValue593 = DBS16ReportUtil.retrieveValueForElement(field.getTenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD(), explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisMap592);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberFieldDataValue594 = DBS16ReportUtil.retrieveFieldDataForElement(field.getTenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD(), explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisMap592, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberFieldDataValue594 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberFieldDataValue594.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberFieldDataValue594.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberFieldDataValue594.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberFieldDataValue594.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberFieldDataValue594.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberFieldDataValue594.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberValue593 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberValue593)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisContext591 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisMap592 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisContext591, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        DecimalItemType explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberDataType596 = new DecimalItemType();
                                        explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberDataType596.setContextRef(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisContext591);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberDataType596.setUnitRef(pure590);
                                            explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberDataType596.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberDataType596.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberValue593));
                                        
                                        
                                        JAXBElement<DecimalItemType> explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberElement595 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberDataType596);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDSectorsAxisServicesMemberElement595);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR597 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR597 = createUnitIfNotExist(INR597, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //in-rbi-rep:SectorsAxis - CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisMap599 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisMap599.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ServicesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberValue600 = DBS16ReportUtil.retrieveValueForElement(field.getCurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisMap599);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberFieldDataValue601 = DBS16ReportUtil.retrieveFieldDataForElement(field.getCurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisMap599, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberFieldDataValue601 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberFieldDataValue601.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberFieldDataValue601.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberFieldDataValue601.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberFieldDataValue601.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberFieldDataValue601.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberFieldDataValue601.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberValue600 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberValue600)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisContext598 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisMap599 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisContext598, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberDataType603 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberDataType603.setContextRef(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisContext598);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberDataType603.setUnitRef(INR597);
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberDataType603.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberDataType603.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberValue600));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberElement602 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createCurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberDataType603);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberElement602);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //in-rbi-rep:SectorsAxis - LoanOutstandingClassificationUnderCGSSDAsOnReportingDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisMap605 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisMap605.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ServicesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberValue606 = DBS16ReportUtil.retrieveValueForElement(field.getLoanOutstandingClassificationUnderCGSSDAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisMap605);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberFieldDataValue607 = DBS16ReportUtil.retrieveFieldDataForElement(field.getLoanOutstandingClassificationUnderCGSSDAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisMap605, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberFieldDataValue607 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberFieldDataValue607.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberFieldDataValue607.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberFieldDataValue607.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberFieldDataValue607.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberFieldDataValue607.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberFieldDataValue607.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberValue606 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberValue606)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisContext604 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisMap605 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisContext604, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        LoanOrAccountClassification explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberDataType609 = new LoanOrAccountClassification();
                                        explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberDataType609.setContextRef(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisContext604);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberDataType609.setValue(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberValue606);
                                        
                                        
                                        JAXBElement<LoanOrAccountClassification> explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberElement608 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createLoanOutstandingClassificationUnderCGSSDAsOnReportingDate(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberDataType609);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateSectorsAxisServicesMemberElement608);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR610 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR610 = createUnitIfNotExist(INR610, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //in-rbi-rep:SectorsAxis - CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisMap612 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisMap612.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ServicesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisServicesMemberValue613 = DBS16ReportUtil.retrieveValueForElement(field.getCurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisMap612);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisServicesMemberFieldDataValue614 = DBS16ReportUtil.retrieveFieldDataForElement(field.getCurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate(), explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisMap612, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisServicesMemberFieldDataValue614 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisServicesMemberFieldDataValue614.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisServicesMemberFieldDataValue614.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisServicesMemberFieldDataValue614.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisServicesMemberFieldDataValue614.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisServicesMemberFieldDataValue614.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisServicesMemberFieldDataValue614.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisServicesMemberValue613 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisServicesMemberValue613)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisContext611 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisMap612 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisContext611, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisServicesMemberDataType616 = new MonetaryItemType();
                                        explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisServicesMemberDataType616.setContextRef(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisContext611);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisServicesMemberDataType616.setUnitRef(INR610);
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisServicesMemberDataType616.setDecimals("INF");
                                            explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisServicesMemberDataType616.setValue(new BigDecimal(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisServicesMemberValue613));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisServicesMemberElement615 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createCurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisServicesMemberDataType616);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateSectorsAxisServicesMemberElement615);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //in-rbi-rep:SectorsAxis - MSMEAccountClassificationAsOnReportingDate
                                
                            
                                
                                    
                                    Map explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisMap618 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisMap618.put("in-rbi-rep:SectorsAxis", "in-rbi-rep:ServicesMember");                
                                    
                                    String explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisServicesMemberValue619 = DBS16ReportUtil.retrieveValueForElement(field.getMSMEAccountClassificationAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisMap618);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisServicesMemberFieldDataValue620 = DBS16ReportUtil.retrieveFieldDataForElement(field.getMSMEAccountClassificationAsOnReportingDate(), explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisMap618, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisServicesMemberFieldDataValue620 != null ) {
                                        if(!explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisServicesMemberFieldDataValue620.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisServicesMemberFieldDataValue620.getStartDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisServicesMemberFieldDataValue620.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisServicesMemberFieldDataValue620.getEndDateValue();
                                        if(!explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisServicesMemberFieldDataValue620.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisServicesMemberFieldDataValue620.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisServicesMemberValue619 != null && !"".equals(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisServicesMemberValue619)) {
                                    
                                        
                                            Context explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisContext617 = DBS16ReportContextUtil.createAsOfContextWithMembersDBS_StressedMSME_Layout1( bankCode, periodDate, nameOfBorrowerAxis, borrowerPermanentAccountNumberAxis, eligibleMicroSmallAndMediumEnterprisesEntityNameAxis, mSMEEntityPermanentAccountNumberAxis, stateAxis,  explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisMap618 );
                                            
                                        
                                        addContext(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisContext617, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        LoanOrAccountClassification explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisServicesMemberDataType622 = new LoanOrAccountClassification();
                                        explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisServicesMemberDataType622.setContextRef(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisContext617);
                                        
                                        
                                            explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisServicesMemberDataType622.setValue(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisServicesMemberValue619);
                                        
                                        
                                        JAXBElement<LoanOrAccountClassification> explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisServicesMemberElement621 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createMSMEAccountClassificationAsOnReportingDate(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisServicesMemberDataType622);
                                        bodyElements.add(explictMember1DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateSectorsAxisServicesMemberElement621);
                                    
                                    }
                                    
                                

                                
                            
                            
                            
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBS_AuthorisedSignatory_Layout1 if any typeMembers then List or Single
                //DBS_AuthorisedSignatory_Layout1 dBS_AuthorisedSignatory_Layout1 = mainReportData.getDBS_AuthorisedSignatory_Layout1();
                
                    private String dBS_AuthorisedSignatory_Layout1Method(DBS_AuthorisedSignatory_Layout1 dBS_AuthorisedSignatory_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                
                    {
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                    DBS_AuthorisedSignatory_Layout1 field = dBS_AuthorisedSignatory_Layout1;
                    
                    
                        
                        
                            
                            // - NameOfSignatory
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryMap626 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryValue624 = DBS16ReportUtil.retrieveValueForElement(field.getNameOfSignatory(), zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryMap626);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue625 = DBS16ReportUtil.retrieveFieldDataForElement(field.getNameOfSignatory(), zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryMap626, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue625 != null ) {
                                        if(!zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue625.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue625.getStartDateValue();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue625.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue625.getEndDateValue();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue625.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue625.getInstantDateValue();
                                    }

                                    
                                        Context DBS_AuthorisedSignatory_Layout1NameOfSignatoryContext623 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryValue624 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryValue624)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1NameOfSignatoryContext623, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType nameOfSignatoryValue627 = new StringItemType();
                                    nameOfSignatoryValue627.setContextRef(DBS_AuthorisedSignatory_Layout1NameOfSignatoryContext623);
                                    
                                    nameOfSignatoryValue627.setValue(zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryValue624);        
                                    
                                    
                                    JAXBElement<StringItemType> nameOfSignatoryElement628 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNameOfSignatory(nameOfSignatoryValue627);
                                    bodyElements.add(nameOfSignatoryElement628);
                                
                            }
                        
                            
                            // - DesignationOfSignatory
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryMap632 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryValue630 = DBS16ReportUtil.retrieveValueForElement(field.getDesignationOfSignatory(), zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryMap632);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue631 = DBS16ReportUtil.retrieveFieldDataForElement(field.getDesignationOfSignatory(), zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryMap632, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue631 != null ) {
                                        if(!zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue631.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue631.getStartDateValue();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue631.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue631.getEndDateValue();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue631.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue631.getInstantDateValue();
                                    }

                                    
                                        Context DBS_AuthorisedSignatory_Layout1DesignationOfSignatoryContext629 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryValue630 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryValue630)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1DesignationOfSignatoryContext629, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType designationOfSignatoryValue633 = new StringItemType();
                                    designationOfSignatoryValue633.setContextRef(DBS_AuthorisedSignatory_Layout1DesignationOfSignatoryContext629);
                                    
                                    designationOfSignatoryValue633.setValue(zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryValue630);        
                                    
                                    
                                    JAXBElement<StringItemType> designationOfSignatoryElement634 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createDesignationOfSignatory(designationOfSignatoryValue633);
                                    bodyElements.add(designationOfSignatoryElement634);
                                
                            }
                        
                            
                            // - AuthorisedSignatoryOfficialLandlineNumber
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberMap638 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue636 = DBS16ReportUtil.retrieveValueForElement(field.getAuthorisedSignatoryOfficialLandlineNumber(), zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberMap638);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue637 = DBS16ReportUtil.retrieveFieldDataForElement(field.getAuthorisedSignatoryOfficialLandlineNumber(), zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberMap638, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue637 != null ) {
                                        if(!zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue637.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue637.getStartDateValue();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue637.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue637.getEndDateValue();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue637.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue637.getInstantDateValue();
                                    }

                                    
                                        Context DBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext635 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue636 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue636)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext635, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType authorisedSignatoryOfficialLandlineNumberValue639 = new StringItemType();
                                    authorisedSignatoryOfficialLandlineNumberValue639.setContextRef(DBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext635);
                                    
                                    authorisedSignatoryOfficialLandlineNumberValue639.setValue(zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue636);        
                                    
                                    
                                    JAXBElement<StringItemType> authorisedSignatoryOfficialLandlineNumberElement640 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createAuthorisedSignatoryOfficialLandlineNumber(authorisedSignatoryOfficialLandlineNumberValue639);
                                    bodyElements.add(authorisedSignatoryOfficialLandlineNumberElement640);
                                
                            }
                        
                            
                            // - MobileNumberOfAuthorisedSignatory
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryMap644 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue642 = DBS16ReportUtil.retrieveValueForElement(field.getMobileNumberOfAuthorisedSignatory(), zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryMap644);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue643 = DBS16ReportUtil.retrieveFieldDataForElement(field.getMobileNumberOfAuthorisedSignatory(), zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryMap644, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue643 != null ) {
                                        if(!zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue643.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue643.getStartDateValue();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue643.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue643.getEndDateValue();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue643.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue643.getInstantDateValue();
                                    }

                                    
                                        Context DBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext641 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue642 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue642)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext641, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType mobileNumberOfAuthorisedSignatoryValue645 = new StringItemType();
                                    mobileNumberOfAuthorisedSignatoryValue645.setContextRef(DBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext641);
                                    
                                    mobileNumberOfAuthorisedSignatoryValue645.setValue(zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue642);        
                                    
                                    
                                    JAXBElement<StringItemType> mobileNumberOfAuthorisedSignatoryElement646 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createMobileNumberOfAuthorisedSignatory(mobileNumberOfAuthorisedSignatoryValue645);
                                    bodyElements.add(mobileNumberOfAuthorisedSignatoryElement646);
                                
                            }
                        
                            
                            // - EMailIDOfAuthorisedReportingOfficial
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialMap650 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue648 = DBS16ReportUtil.retrieveValueForElement(field.getEMailIDOfAuthorisedReportingOfficial(), zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialMap650);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue649 = DBS16ReportUtil.retrieveFieldDataForElement(field.getEMailIDOfAuthorisedReportingOfficial(), zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialMap650, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue649 != null ) {
                                        if(!zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue649.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue649.getStartDateValue();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue649.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue649.getEndDateValue();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue649.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue649.getInstantDateValue();
                                    }

                                    
                                        Context DBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext647 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue648 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue648)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext647, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType eMailIDOfAuthorisedReportingOfficialValue651 = new StringItemType();
                                    eMailIDOfAuthorisedReportingOfficialValue651.setContextRef(DBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext647);
                                    
                                    eMailIDOfAuthorisedReportingOfficialValue651.setValue(zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue648);        
                                    
                                    
                                    JAXBElement<StringItemType> eMailIDOfAuthorisedReportingOfficialElement652 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createEMailIDOfAuthorisedReportingOfficial(eMailIDOfAuthorisedReportingOfficialValue651);
                                    bodyElements.add(eMailIDOfAuthorisedReportingOfficialElement652);
                                
                            }
                        
                            
                            // - Remarks
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1RemarksMap656 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1RemarksValue654 = DBS16ReportUtil.retrieveValueForElement(field.getRemarks(), zeroDBS_AuthorisedSignatory_Layout1RemarksMap656);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBS_AuthorisedSignatory_Layout1RemarksFieldDataValue655 = DBS16ReportUtil.retrieveFieldDataForElement(field.getRemarks(), zeroDBS_AuthorisedSignatory_Layout1RemarksMap656, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroDBS_AuthorisedSignatory_Layout1RemarksFieldDataValue655 != null ) {
                                        if(!zeroDBS_AuthorisedSignatory_Layout1RemarksFieldDataValue655.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_AuthorisedSignatory_Layout1RemarksFieldDataValue655.getStartDateValue();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1RemarksFieldDataValue655.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_AuthorisedSignatory_Layout1RemarksFieldDataValue655.getEndDateValue();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1RemarksFieldDataValue655.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_AuthorisedSignatory_Layout1RemarksFieldDataValue655.getInstantDateValue();
                                    }

                                    
                                        Context DBS_AuthorisedSignatory_Layout1RemarksContext653 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1RemarksValue654 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1RemarksValue654)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1RemarksContext653, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType remarksValue657 = new StringItemType();
                                    remarksValue657.setContextRef(DBS_AuthorisedSignatory_Layout1RemarksContext653);
                                    
                                    remarksValue657.setValue(zeroDBS_AuthorisedSignatory_Layout1RemarksValue654);        
                                    
                                    
                                    JAXBElement<StringItemType> remarksElement658 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createRemarks(remarksValue657);
                                    bodyElements.add(remarksElement658);
                                
                            }
                        
                        
                    
                    
            
                    
                    
                    
                    return "";
                    }

                
                    
                
                // if typemembers exist
                
                
                
            
            private Unit createUnitIfNotExist(Unit unitObj, String unitId, String namespaceURI, String qNameValue, List<Unit> unitElements) {
                if(unitObj == null){
                    unitObj = new org.xbrl._2003.instance.ObjectFactory().createUnit();
                    unitObj.setId(unitId);
                    QName unitMeasureValue = new QName(namespaceURI, qNameValue);
                    unitObj.getMeasure().add(unitMeasureValue);
                    unitElements.add(unitObj);
                }
                return unitObj;
            }

            private void addContext(Context uniqueIdForContext, List<Context> contextElements, List<String> contextIdentifiers){
                if(!contextIdentifiers.contains(uniqueIdForContext.getId())) {
                    contextElements.add(uniqueIdForContext);
                    contextIdentifiers.add(uniqueIdForContext.getId());
                }
            }
    
        }
    
    

