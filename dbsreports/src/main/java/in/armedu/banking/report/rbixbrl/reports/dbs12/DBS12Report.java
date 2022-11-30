package in.armedu.banking.report.rbixbrl.reports.dbs12;



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
import in.armedu.banking.report.rbixbrl.model.dbs12.*;
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
                        
                        import org.rbi.in.xbrl.rbi_type.TypeOfEntity;
                        
                        import org.rbi.in.xbrl.rbi_type.FinancialClassification;
                        
                        import org.xbrl._2003.instance.MonetaryItemType;
                        
                        import org.xbrl._2003.instance.PureItemType;
                        
                        import org.rbi.in.xbrl.rbi_type.AssetClassifications;
                        
                        import org.rbi.in.xbrl.rbi_type.TypeOfExposures;
                        

@Setter
public class DBS12Report implements XBRLReportIntf {
       
    
    // logic for main method
    @Override
    public StringWriter generateReport(ReportData reportData){
        JAXBContext jc;
        Marshaller m;
        // TODO should be generated dynamically
        DBS12ReportData mainReportData = (DBS12ReportData) reportData;

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
            // TODO should be changed to specific xsd related to report dbs12
            simpleType.setHref("in-rbi-dbs12.xsd");
            xbrl.getSchemaRef().add(simpleType);
            xbrl.getOtherAttributes().put(new QName("xml:lang"), "en");
           
            
            // context identifiers and body elements
            List<String> contextIdentifiers = new ArrayList<String>();
            List<Context> contextElements = new ArrayList<Context>();
            List<Object> bodyElements = new ArrayList<Object>();
            List<String> unitIdentifiers = new ArrayList<String>();
            List<Unit> unitElements = new ArrayList<Unit>();
           
            //Unit unitObj = null;
            //DBS12ReportData dBS12ReportData = new DBS12ReportData();
            // print values           
    

            // TODO : create proper context with loop and element
            // initiatilize data class and allow to be set 
            //private DBS12ReportData dBS12ReportData = new DBS12ReportData();
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
                
                
                
                // create variable for subclass DBS12_SectionA_Layout1 if any typeMembers then List or Single
                List<DBS12_SectionA_Layout1> dBS12_SectionA_Layout1 = mainReportData.getDBS12_SectionA_Layout1();
                // method calling
                
                
                // if typemembers exist
                
                    dBS12_SectionA_Layout1Method(dBS12_SectionA_Layout1, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                    
                    
                
                
                
                // create variable for subclass DBS12_SectionB_Layout1 if any typeMembers then List or Single
                List<DBS12_SectionB_Layout1> dBS12_SectionB_Layout1 = mainReportData.getDBS12_SectionB_Layout1();
                // method calling
                
                
                // if typemembers exist
                
                    dBS12_SectionB_Layout1Method(dBS12_SectionB_Layout1, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                    
                    
                
                
                
                // create variable for subclass DBS12_SectionC_Layout1 if any typeMembers then List or Single
                List<DBS12_SectionC_Layout1> dBS12_SectionC_Layout1 = mainReportData.getDBS12_SectionC_Layout1();
                // method calling
                
                
                // if typemembers exist
                
                    dBS12_SectionC_Layout1Method(dBS12_SectionC_Layout1, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                    
                    
                
                
                
                // create variable for subclass DBS12_SectionD_Layout1 if any typeMembers then List or Single
                List<DBS12_SectionD_Layout1> dBS12_SectionD_Layout1 = mainReportData.getDBS12_SectionD_Layout1();
                // method calling
                
                
                // if typemembers exist
                
                    dBS12_SectionD_Layout1Method(dBS12_SectionD_Layout1, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                    
                    
                
                
                
                // create variable for subclass DBS12_SectionD_Layout2 if any typeMembers then List or Single
                List<DBS12_SectionD_Layout2> dBS12_SectionD_Layout2 = mainReportData.getDBS12_SectionD_Layout2();
                // method calling
                
                
                // if typemembers exist
                
                    dBS12_SectionD_Layout2Method(dBS12_SectionD_Layout2, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                    
                    
                
                
                
                // create variable for subclass DBSAuthorisedSignatory_Layout1 if any typeMembers then List or Single
                DBSAuthorisedSignatory_Layout1 dBSAuthorisedSignatory_Layout1 = mainReportData.getDBSAuthorisedSignatory_Layout1();
                // method calling
                
                    dBSAuthorisedSignatory_Layout1Method(dBSAuthorisedSignatory_Layout1, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                
                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReturnNameValue2 = DBS12ReportUtil.retrieveValueForElement(field.getReturnName(), zeroFilingInfo_Layout1ReturnNameMap4);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReturnNameFieldDataValue3 = DBS12ReportUtil.retrieveFieldDataForElement(field.getReturnName(), zeroFilingInfo_Layout1ReturnNameMap4);
    
                                    if(zeroFilingInfo_Layout1ReturnNameFieldDataValue3 != null ) {
                                        if(!zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getStartDate();
                                        if(!zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getEndDate();
                                        if(!zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getInstantDate();
                                    }

                                    
                                        Context FilingInfo_Layout1ReturnNameContext1 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReturnCodeValue8 = DBS12ReportUtil.retrieveValueForElement(field.getReturnCode(), zeroFilingInfo_Layout1ReturnCodeMap10);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReturnCodeFieldDataValue9 = DBS12ReportUtil.retrieveFieldDataForElement(field.getReturnCode(), zeroFilingInfo_Layout1ReturnCodeMap10);
    
                                    if(zeroFilingInfo_Layout1ReturnCodeFieldDataValue9 != null ) {
                                        if(!zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getStartDate();
                                        if(!zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getEndDate();
                                        if(!zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getInstantDate();
                                    }

                                    
                                        Context FilingInfo_Layout1ReturnCodeContext7 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1NameOfReportingInstitutionValue14 = DBS12ReportUtil.retrieveValueForElement(field.getNameOfReportingInstitution(), zeroFilingInfo_Layout1NameOfReportingInstitutionMap16);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15 = DBS12ReportUtil.retrieveFieldDataForElement(field.getNameOfReportingInstitution(), zeroFilingInfo_Layout1NameOfReportingInstitutionMap16);
    
                                    if(zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15 != null ) {
                                        if(!zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getStartDate();
                                        if(!zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getEndDate();
                                        if(!zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getInstantDate();
                                    }

                                    
                                        Context FilingInfo_Layout1NameOfReportingInstitutionContext13 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1BankCodeValue20 = DBS12ReportUtil.retrieveValueForElement(field.getBankCode(), zeroFilingInfo_Layout1BankCodeMap22);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1BankCodeFieldDataValue21 = DBS12ReportUtil.retrieveFieldDataForElement(field.getBankCode(), zeroFilingInfo_Layout1BankCodeMap22);
    
                                    if(zeroFilingInfo_Layout1BankCodeFieldDataValue21 != null ) {
                                        if(!zeroFilingInfo_Layout1BankCodeFieldDataValue21.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1BankCodeFieldDataValue21.getStartDate();
                                        if(!zeroFilingInfo_Layout1BankCodeFieldDataValue21.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1BankCodeFieldDataValue21.getEndDate();
                                        if(!zeroFilingInfo_Layout1BankCodeFieldDataValue21.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1BankCodeFieldDataValue21.getInstantDate();
                                    }

                                    
                                    Context FilingInfo_Layout1BankCodeContext19 = DBS12ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1InstitutionTypeValue26 = DBS12ReportUtil.retrieveValueForElement(field.getInstitutionType(), zeroFilingInfo_Layout1InstitutionTypeMap28);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27 = DBS12ReportUtil.retrieveFieldDataForElement(field.getInstitutionType(), zeroFilingInfo_Layout1InstitutionTypeMap28);
    
                                    if(zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27 != null ) {
                                        if(!zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getStartDate();
                                        if(!zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getEndDate();
                                        if(!zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getInstantDate();
                                    }

                                    
                                        Context FilingInfo_Layout1InstitutionTypeContext25 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingFrequencyValue32 = DBS12ReportUtil.retrieveValueForElement(field.getReportingFrequency(), zeroFilingInfo_Layout1ReportingFrequencyMap34);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33 = DBS12ReportUtil.retrieveFieldDataForElement(field.getReportingFrequency(), zeroFilingInfo_Layout1ReportingFrequencyMap34);
    
                                    if(zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getStartDate();
                                        if(!zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getEndDate();
                                        if(!zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getInstantDate();
                                    }

                                    
                                        Context FilingInfo_Layout1ReportingFrequencyContext31 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingPeriodStartDateValue38 = DBS12ReportUtil.retrieveValueForElement(field.getReportingPeriodStartDate(), zeroFilingInfo_Layout1ReportingPeriodStartDateMap40);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39 = DBS12ReportUtil.retrieveFieldDataForElement(field.getReportingPeriodStartDate(), zeroFilingInfo_Layout1ReportingPeriodStartDateMap40);
    
                                    if(zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getStartDate();
                                        if(!zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getEndDate();
                                        if(!zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getInstantDate();
                                    }

                                    
                                    Context FilingInfo_Layout1ReportingPeriodStartDateContext37 = DBS12ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout1ReportingPeriodStartDateValue38 != null && !"".equals(zeroFilingInfo_Layout1ReportingPeriodStartDateValue38)) {
                                    
                                    addContext(FilingInfo_Layout1ReportingPeriodStartDateContext37, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    DateItemType reportingPeriodStartDateValue41 = new DateItemType();
                                    reportingPeriodStartDateValue41.setContextRef(FilingInfo_Layout1ReportingPeriodStartDateContext37);
                                    
                                    reportingPeriodStartDateValue41.setValue(DBS12ReportContextUtil.toXMLGeo(zeroFilingInfo_Layout1ReportingPeriodStartDateValue38));
                                    
                                    
                                    JAXBElement<DateItemType> reportingPeriodStartDateElement42 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReportingPeriodStartDate(reportingPeriodStartDateValue41);
                                    bodyElements.add(reportingPeriodStartDateElement42);
                                
                            }
                        
                            
                            // - ReportingPeriodEndDate
                            
                                Map zeroFilingInfo_Layout1ReportingPeriodEndDateMap46 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingPeriodEndDateValue44 = DBS12ReportUtil.retrieveValueForElement(field.getReportingPeriodEndDate(), zeroFilingInfo_Layout1ReportingPeriodEndDateMap46);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45 = DBS12ReportUtil.retrieveFieldDataForElement(field.getReportingPeriodEndDate(), zeroFilingInfo_Layout1ReportingPeriodEndDateMap46);
    
                                    if(zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getStartDate();
                                        if(!zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getEndDate();
                                        if(!zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getInstantDate();
                                    }

                                    
                                    Context FilingInfo_Layout1ReportingPeriodEndDateContext43 = DBS12ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout1ReportingPeriodEndDateValue44 != null && !"".equals(zeroFilingInfo_Layout1ReportingPeriodEndDateValue44)) {
                                    
                                    addContext(FilingInfo_Layout1ReportingPeriodEndDateContext43, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    DateItemType reportingPeriodEndDateValue47 = new DateItemType();
                                    reportingPeriodEndDateValue47.setContextRef(FilingInfo_Layout1ReportingPeriodEndDateContext43);
                                    
                                    reportingPeriodEndDateValue47.setValue(DBS12ReportContextUtil.toXMLGeo(zeroFilingInfo_Layout1ReportingPeriodEndDateValue44));
                                    
                                    
                                    JAXBElement<DateItemType> reportingPeriodEndDateElement48 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReportingPeriodEndDate(reportingPeriodEndDateValue47);
                                    bodyElements.add(reportingPeriodEndDateElement48);
                                
                            }
                        
                            
                            // - ReportingCurrency
                            
                                Map zeroFilingInfo_Layout1ReportingCurrencyMap52 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingCurrencyValue50 = DBS12ReportUtil.retrieveValueForElement(field.getReportingCurrency(), zeroFilingInfo_Layout1ReportingCurrencyMap52);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51 = DBS12ReportUtil.retrieveFieldDataForElement(field.getReportingCurrency(), zeroFilingInfo_Layout1ReportingCurrencyMap52);
    
                                    if(zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getStartDate();
                                        if(!zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getEndDate();
                                        if(!zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getInstantDate();
                                    }

                                    
                                        Context FilingInfo_Layout1ReportingCurrencyContext49 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingScaleValue56 = DBS12ReportUtil.retrieveValueForElement(field.getReportingScale(), zeroFilingInfo_Layout1ReportingScaleMap58);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReportingScaleFieldDataValue57 = DBS12ReportUtil.retrieveFieldDataForElement(field.getReportingScale(), zeroFilingInfo_Layout1ReportingScaleMap58);
    
                                    if(zeroFilingInfo_Layout1ReportingScaleFieldDataValue57 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getStartDate();
                                        if(!zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getEndDate();
                                        if(!zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getInstantDate();
                                    }

                                    
                                        Context FilingInfo_Layout1ReportingScaleContext55 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1TaxonomyVersionValue62 = DBS12ReportUtil.retrieveValueForElement(field.getTaxonomyVersion(), zeroFilingInfo_Layout1TaxonomyVersionMap64);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTaxonomyVersion(), zeroFilingInfo_Layout1TaxonomyVersionMap64);
    
                                    if(zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63 != null ) {
                                        if(!zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getStartDate();
                                        if(!zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getEndDate();
                                        if(!zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getInstantDate();
                                    }

                                    
                                        Context FilingInfo_Layout1TaxonomyVersionContext61 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ToolNameValue68 = DBS12ReportUtil.retrieveValueForElement(field.getToolName(), zeroFilingInfo_Layout1ToolNameMap70);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ToolNameFieldDataValue69 = DBS12ReportUtil.retrieveFieldDataForElement(field.getToolName(), zeroFilingInfo_Layout1ToolNameMap70);
    
                                    if(zeroFilingInfo_Layout1ToolNameFieldDataValue69 != null ) {
                                        if(!zeroFilingInfo_Layout1ToolNameFieldDataValue69.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ToolNameFieldDataValue69.getStartDate();
                                        if(!zeroFilingInfo_Layout1ToolNameFieldDataValue69.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ToolNameFieldDataValue69.getEndDate();
                                        if(!zeroFilingInfo_Layout1ToolNameFieldDataValue69.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ToolNameFieldDataValue69.getInstantDate();
                                    }

                                    
                                        Context FilingInfo_Layout1ToolNameContext67 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ToolVersionValue74 = DBS12ReportUtil.retrieveValueForElement(field.getToolVersion(), zeroFilingInfo_Layout1ToolVersionMap76);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ToolVersionFieldDataValue75 = DBS12ReportUtil.retrieveFieldDataForElement(field.getToolVersion(), zeroFilingInfo_Layout1ToolVersionMap76);
    
                                    if(zeroFilingInfo_Layout1ToolVersionFieldDataValue75 != null ) {
                                        if(!zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getStartDate();
                                        if(!zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getEndDate();
                                        if(!zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getInstantDate();
                                    }

                                    
                                        Context FilingInfo_Layout1ToolVersionContext73 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReportStatusValue80 = DBS12ReportUtil.retrieveValueForElement(field.getReportStatus(), zeroFilingInfo_Layout1ReportStatusMap82);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReportStatusFieldDataValue81 = DBS12ReportUtil.retrieveFieldDataForElement(field.getReportStatus(), zeroFilingInfo_Layout1ReportStatusMap82);
    
                                    if(zeroFilingInfo_Layout1ReportStatusFieldDataValue81 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getStartDate();
                                        if(!zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getEndDate();
                                        if(!zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getInstantDate();
                                    }

                                    
                                        Context FilingInfo_Layout1ReportStatusContext79 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1DateOfAuditValue86 = DBS12ReportUtil.retrieveValueForElement(field.getDateOfAudit(), zeroFilingInfo_Layout1DateOfAuditMap88);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1DateOfAuditFieldDataValue87 = DBS12ReportUtil.retrieveFieldDataForElement(field.getDateOfAudit(), zeroFilingInfo_Layout1DateOfAuditMap88);
    
                                    if(zeroFilingInfo_Layout1DateOfAuditFieldDataValue87 != null ) {
                                        if(!zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getStartDate();
                                        if(!zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getEndDate();
                                        if(!zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getInstantDate();
                                    }

                                    
                                    Context FilingInfo_Layout1DateOfAuditContext85 = DBS12ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout1DateOfAuditValue86 != null && !"".equals(zeroFilingInfo_Layout1DateOfAuditValue86)) {
                                    
                                    addContext(FilingInfo_Layout1DateOfAuditContext85, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    DateItemType dateOfAuditValue89 = new DateItemType();
                                    dateOfAuditValue89.setContextRef(FilingInfo_Layout1DateOfAuditContext85);
                                    
                                    dateOfAuditValue89.setValue(DBS12ReportContextUtil.toXMLGeo(zeroFilingInfo_Layout1DateOfAuditValue86));
                                    
                                    
                                    JAXBElement<DateItemType> dateOfAuditElement90 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createDateOfAudit(dateOfAuditValue89);
                                    bodyElements.add(dateOfAuditElement90);
                                
                            }
                        
                            
                            // - GeneralRemarks
                            
                                Map zeroFilingInfo_Layout1GeneralRemarksMap94 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1GeneralRemarksValue92 = DBS12ReportUtil.retrieveValueForElement(field.getGeneralRemarks(), zeroFilingInfo_Layout1GeneralRemarksMap94);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93 = DBS12ReportUtil.retrieveFieldDataForElement(field.getGeneralRemarks(), zeroFilingInfo_Layout1GeneralRemarksMap94);
    
                                    if(zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93 != null ) {
                                        if(!zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getStartDate();
                                        if(!zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getEndDate();
                                        if(!zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getInstantDate();
                                    }

                                    
                                        Context FilingInfo_Layout1GeneralRemarksContext91 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                    
                    
                        
                        
                            
                            // - WhetherBankSubmittingTheReturnIsForeignBank
                            
                                Map zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankMap100 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankValue98 = DBS12ReportUtil.retrieveValueForElement(field.getWhetherBankSubmittingTheReturnIsForeignBank(), zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankMap100);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankFieldDataValue99 = DBS12ReportUtil.retrieveFieldDataForElement(field.getWhetherBankSubmittingTheReturnIsForeignBank(), zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankMap100);
    
                                    if(zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankFieldDataValue99 != null ) {
                                        if(!zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankFieldDataValue99.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankFieldDataValue99.getStartDate();
                                        if(!zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankFieldDataValue99.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankFieldDataValue99.getEndDate();
                                        if(!zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankFieldDataValue99.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankFieldDataValue99.getInstantDate();
                                    }

                                    
                                        Context FilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankContext97 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankValue98 != null && !"".equals(zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankValue98)) {
                                    
                                    addContext(FilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankContext97, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    BooleanItemType whetherBankSubmittingTheReturnIsForeignBankValue101 = new BooleanItemType();
                                    whetherBankSubmittingTheReturnIsForeignBankValue101.setContextRef(FilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankContext97);
                                    
                                        whetherBankSubmittingTheReturnIsForeignBankValue101.setValue(Boolean.getBoolean(zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankValue98));
                                    
                                    
                                    JAXBElement<BooleanItemType> whetherBankSubmittingTheReturnIsForeignBankElement102 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherBankSubmittingTheReturnIsForeignBank(whetherBankSubmittingTheReturnIsForeignBankValue101);
                                    bodyElements.add(whetherBankSubmittingTheReturnIsForeignBankElement102);
                                
                            }
                        
                        
                    
                    
            
                    
                    
                    
                    return "";
                    }

                
                    
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBS12_SectionA_Layout1 if any typeMembers then List or Single
                //List<DBS12_SectionA_Layout1> dBS12_SectionA_Layout1 = mainReportData.getDBS12_SectionA_Layout1();
                
                
                // if typemembers exist
                
                    private String dBS12_SectionA_Layout1Method(List<DBS12_SectionA_Layout1> dBS12_SectionA_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                    {
                        
                    dBS12_SectionA_Layout1.forEach((field)->{
                        // create startdate, enddate, and perioddate
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                        // crate variable loop  for type member
                        
                            // create variable for type member NameOfEntityAxis
                            String nameOfEntityAxis = field.getNameOfEntityAxis();
                        
                        // end create variable loop for type member
                        
                        // if explict member is empty
                        
                            // create xbrl report element
                            
                                // start create element for report of DBS12_SectionA_Layout1
                                // create unit if not empty
                                
                                
                                // - TypeOfEntity
                                
                                    Map zeroDBS12_SectionA_Layout1TypeOfEntityMap106 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionA_Layout1TypeOfEntityValue104 = DBS12ReportUtil.retrieveValueForElement(field.getTypeOfEntity(), zeroDBS12_SectionA_Layout1TypeOfEntityMap106);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionA_Layout1TypeOfEntityFieldDataValue105 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTypeOfEntity(), zeroDBS12_SectionA_Layout1TypeOfEntityMap106);

                                        if(zeroDBS12_SectionA_Layout1TypeOfEntityFieldDataValue105 != null ) {
                                            if(!zeroDBS12_SectionA_Layout1TypeOfEntityFieldDataValue105.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionA_Layout1TypeOfEntityFieldDataValue105.getStartDate();
                                            if(!zeroDBS12_SectionA_Layout1TypeOfEntityFieldDataValue105.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionA_Layout1TypeOfEntityFieldDataValue105.getEndDate();
                                            if(!zeroDBS12_SectionA_Layout1TypeOfEntityFieldDataValue105.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionA_Layout1TypeOfEntityFieldDataValue105.getInstantDate();
                                        }

                                        
                                            Context DBS12_SectionA_Layout1TypeOfEntityContext103 = DBS12ReportContextUtil.createFromToContextDBS12_SectionA_Layout1( bankCode, startDate, endDate ,nameOfEntityAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionA_Layout1TypeOfEntityValue104 != null && !"".equals(zeroDBS12_SectionA_Layout1TypeOfEntityValue104)) {
                                        
                                        addContext(DBS12_SectionA_Layout1TypeOfEntityContext103, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        TypeOfEntity typeOfEntityValue107 = new TypeOfEntity();
                                        typeOfEntityValue107.setContextRef(DBS12_SectionA_Layout1TypeOfEntityContext103);
                                        
                                            typeOfEntityValue107.setValue(zeroDBS12_SectionA_Layout1TypeOfEntityValue104);        
                                        
                                        
                                        JAXBElement<TypeOfEntity> typeOfEntityElement108 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTypeOfEntity(typeOfEntityValue107);
                                        bodyElements.add(typeOfEntityElement108);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionA_Layout1
                                // create unit if not empty
                                
                                
                                // - FinancialClassification
                                
                                    Map zeroDBS12_SectionA_Layout1FinancialClassificationMap112 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionA_Layout1FinancialClassificationValue110 = DBS12ReportUtil.retrieveValueForElement(field.getFinancialClassification(), zeroDBS12_SectionA_Layout1FinancialClassificationMap112);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionA_Layout1FinancialClassificationFieldDataValue111 = DBS12ReportUtil.retrieveFieldDataForElement(field.getFinancialClassification(), zeroDBS12_SectionA_Layout1FinancialClassificationMap112);

                                        if(zeroDBS12_SectionA_Layout1FinancialClassificationFieldDataValue111 != null ) {
                                            if(!zeroDBS12_SectionA_Layout1FinancialClassificationFieldDataValue111.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionA_Layout1FinancialClassificationFieldDataValue111.getStartDate();
                                            if(!zeroDBS12_SectionA_Layout1FinancialClassificationFieldDataValue111.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionA_Layout1FinancialClassificationFieldDataValue111.getEndDate();
                                            if(!zeroDBS12_SectionA_Layout1FinancialClassificationFieldDataValue111.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionA_Layout1FinancialClassificationFieldDataValue111.getInstantDate();
                                        }

                                        
                                            Context DBS12_SectionA_Layout1FinancialClassificationContext109 = DBS12ReportContextUtil.createFromToContextDBS12_SectionA_Layout1( bankCode, startDate, endDate ,nameOfEntityAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionA_Layout1FinancialClassificationValue110 != null && !"".equals(zeroDBS12_SectionA_Layout1FinancialClassificationValue110)) {
                                        
                                        addContext(DBS12_SectionA_Layout1FinancialClassificationContext109, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        FinancialClassification financialClassificationValue113 = new FinancialClassification();
                                        financialClassificationValue113.setContextRef(DBS12_SectionA_Layout1FinancialClassificationContext109);
                                        
                                            financialClassificationValue113.setValue(zeroDBS12_SectionA_Layout1FinancialClassificationValue110);        
                                        
                                        
                                        JAXBElement<FinancialClassification> financialClassificationElement114 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createFinancialClassification(financialClassificationValue113);
                                        bodyElements.add(financialClassificationElement114);
                                    }
                                
                            
                            
                            
                        
                        
                
                        
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBS12_SectionB_Layout1 if any typeMembers then List or Single
                //List<DBS12_SectionB_Layout1> dBS12_SectionB_Layout1 = mainReportData.getDBS12_SectionB_Layout1();
                
                
                // if typemembers exist
                
                    private String dBS12_SectionB_Layout1Method(List<DBS12_SectionB_Layout1> dBS12_SectionB_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                    {
                        
                    dBS12_SectionB_Layout1.forEach((field)->{
                        // create startdate, enddate, and perioddate
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                        // crate variable loop  for type member
                        
                            // create variable for type member NameOfEntityAxis
                            String nameOfEntityAxis = field.getNameOfEntityAxis();
                        
                        // end create variable loop for type member
                        
                        // if explict member is empty
                        
                            // create xbrl report element
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                
                                // - TypeOfEntity
                                
                                    Map zeroDBS12_SectionB_Layout1TypeOfEntityMap118 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1TypeOfEntityValue116 = DBS12ReportUtil.retrieveValueForElement(field.getTypeOfEntity(), zeroDBS12_SectionB_Layout1TypeOfEntityMap118);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionB_Layout1TypeOfEntityFieldDataValue117 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTypeOfEntity(), zeroDBS12_SectionB_Layout1TypeOfEntityMap118);

                                        if(zeroDBS12_SectionB_Layout1TypeOfEntityFieldDataValue117 != null ) {
                                            if(!zeroDBS12_SectionB_Layout1TypeOfEntityFieldDataValue117.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionB_Layout1TypeOfEntityFieldDataValue117.getStartDate();
                                            if(!zeroDBS12_SectionB_Layout1TypeOfEntityFieldDataValue117.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionB_Layout1TypeOfEntityFieldDataValue117.getEndDate();
                                            if(!zeroDBS12_SectionB_Layout1TypeOfEntityFieldDataValue117.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionB_Layout1TypeOfEntityFieldDataValue117.getInstantDate();
                                        }

                                        
                                            Context DBS12_SectionB_Layout1TypeOfEntityContext115 = DBS12ReportContextUtil.createFromToContextDBS12_SectionB_Layout1( bankCode, startDate, endDate ,nameOfEntityAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1TypeOfEntityValue116 != null && !"".equals(zeroDBS12_SectionB_Layout1TypeOfEntityValue116)) {
                                        
                                        addContext(DBS12_SectionB_Layout1TypeOfEntityContext115, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        TypeOfEntity typeOfEntityValue119 = new TypeOfEntity();
                                        typeOfEntityValue119.setContextRef(DBS12_SectionB_Layout1TypeOfEntityContext115);
                                        
                                            typeOfEntityValue119.setValue(zeroDBS12_SectionB_Layout1TypeOfEntityValue116);        
                                        
                                        
                                        JAXBElement<TypeOfEntity> typeOfEntityElement120 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTypeOfEntity(typeOfEntityValue119);
                                        bodyElements.add(typeOfEntityElement120);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                
                                // - FinancialClassification
                                
                                    Map zeroDBS12_SectionB_Layout1FinancialClassificationMap124 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1FinancialClassificationValue122 = DBS12ReportUtil.retrieveValueForElement(field.getFinancialClassification(), zeroDBS12_SectionB_Layout1FinancialClassificationMap124);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionB_Layout1FinancialClassificationFieldDataValue123 = DBS12ReportUtil.retrieveFieldDataForElement(field.getFinancialClassification(), zeroDBS12_SectionB_Layout1FinancialClassificationMap124);

                                        if(zeroDBS12_SectionB_Layout1FinancialClassificationFieldDataValue123 != null ) {
                                            if(!zeroDBS12_SectionB_Layout1FinancialClassificationFieldDataValue123.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionB_Layout1FinancialClassificationFieldDataValue123.getStartDate();
                                            if(!zeroDBS12_SectionB_Layout1FinancialClassificationFieldDataValue123.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionB_Layout1FinancialClassificationFieldDataValue123.getEndDate();
                                            if(!zeroDBS12_SectionB_Layout1FinancialClassificationFieldDataValue123.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionB_Layout1FinancialClassificationFieldDataValue123.getInstantDate();
                                        }

                                        
                                            Context DBS12_SectionB_Layout1FinancialClassificationContext121 = DBS12ReportContextUtil.createFromToContextDBS12_SectionB_Layout1( bankCode, startDate, endDate ,nameOfEntityAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1FinancialClassificationValue122 != null && !"".equals(zeroDBS12_SectionB_Layout1FinancialClassificationValue122)) {
                                        
                                        addContext(DBS12_SectionB_Layout1FinancialClassificationContext121, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        FinancialClassification financialClassificationValue125 = new FinancialClassification();
                                        financialClassificationValue125.setContextRef(DBS12_SectionB_Layout1FinancialClassificationContext121);
                                        
                                            financialClassificationValue125.setValue(zeroDBS12_SectionB_Layout1FinancialClassificationValue122);        
                                        
                                        
                                        JAXBElement<FinancialClassification> financialClassificationElement126 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createFinancialClassification(financialClassificationValue125);
                                        bodyElements.add(financialClassificationElement126);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR127 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR127 = createUnitIfNotExist(INR127, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - BanksEquityInvestmentInTheCompany
                                
                                    Map zeroDBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyMap131 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyValue129 = DBS12ReportUtil.retrieveValueForElement(field.getBanksEquityInvestmentInTheCompany(), zeroDBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyMap131);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyFieldDataValue130 = DBS12ReportUtil.retrieveFieldDataForElement(field.getBanksEquityInvestmentInTheCompany(), zeroDBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyMap131);

                                        if(zeroDBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyFieldDataValue130 != null ) {
                                            if(!zeroDBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyFieldDataValue130.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyFieldDataValue130.getStartDate();
                                            if(!zeroDBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyFieldDataValue130.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyFieldDataValue130.getEndDate();
                                            if(!zeroDBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyFieldDataValue130.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyFieldDataValue130.getInstantDate();
                                        }

                                        
                                        Context DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyContext128 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionB_Layout1( bankCode, periodDate ,nameOfEntityAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyValue129 != null && !"".equals(zeroDBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyValue129)) {
                                        
                                        addContext(DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyContext128, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType banksEquityInvestmentInTheCompanyValue132 = new MonetaryItemType();
                                        banksEquityInvestmentInTheCompanyValue132.setContextRef(DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyContext128);
                                        
                                            banksEquityInvestmentInTheCompanyValue132.setUnitRef(INR127);
                                            banksEquityInvestmentInTheCompanyValue132.setDecimals("INF");
                                            banksEquityInvestmentInTheCompanyValue132.setValue(new BigDecimal(zeroDBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyValue129));
                                        
                                        
                                        JAXBElement<MonetaryItemType> banksEquityInvestmentInTheCompanyElement133 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createBanksEquityInvestmentInTheCompany(banksEquityInvestmentInTheCompanyValue132);
                                        bodyElements.add(banksEquityInvestmentInTheCompanyElement133);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit pure134 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure134 = createUnitIfNotExist(pure134, "PURE", "http://www.xbrl.org/2003/instance","pure", unitElements);
                                    
                                
                                
                                // - BanksPercentageInvestmentInCompanyEquity
                                
                                    Map zeroDBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityMap138 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityValue136 = DBS12ReportUtil.retrieveValueForElement(field.getBanksPercentageInvestmentInCompanyEquity(), zeroDBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityMap138);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityFieldDataValue137 = DBS12ReportUtil.retrieveFieldDataForElement(field.getBanksPercentageInvestmentInCompanyEquity(), zeroDBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityMap138);

                                        if(zeroDBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityFieldDataValue137 != null ) {
                                            if(!zeroDBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityFieldDataValue137.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityFieldDataValue137.getStartDate();
                                            if(!zeroDBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityFieldDataValue137.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityFieldDataValue137.getEndDate();
                                            if(!zeroDBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityFieldDataValue137.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityFieldDataValue137.getInstantDate();
                                        }

                                        
                                        Context DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityContext135 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionB_Layout1( bankCode, periodDate ,nameOfEntityAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityValue136 != null && !"".equals(zeroDBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityValue136)) {
                                        
                                        addContext(DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityContext135, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        PureItemType banksPercentageInvestmentInCompanyEquityValue139 = new PureItemType();
                                        banksPercentageInvestmentInCompanyEquityValue139.setContextRef(DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityContext135);
                                        
                                            banksPercentageInvestmentInCompanyEquityValue139.setUnitRef(pure134);
                                            banksPercentageInvestmentInCompanyEquityValue139.setDecimals("INF");
                                            banksPercentageInvestmentInCompanyEquityValue139.setValue(new BigDecimal(zeroDBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityValue136));
                                        
                                        
                                        JAXBElement<PureItemType> banksPercentageInvestmentInCompanyEquityElement140 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createBanksPercentageInvestmentInCompanyEquity(banksPercentageInvestmentInCompanyEquityValue139);
                                        bodyElements.add(banksPercentageInvestmentInCompanyEquityElement140);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR141 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR141 = createUnitIfNotExist(INR141, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - AggregateAmountOutstandingForFundedExposure
                                
                                    Map zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureMap145 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureValue143 = DBS12ReportUtil.retrieveValueForElement(field.getAggregateAmountOutstandingForFundedExposure(), zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureMap145);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureFieldDataValue144 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAggregateAmountOutstandingForFundedExposure(), zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureMap145);

                                        if(zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureFieldDataValue144 != null ) {
                                            if(!zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureFieldDataValue144.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureFieldDataValue144.getStartDate();
                                            if(!zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureFieldDataValue144.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureFieldDataValue144.getEndDate();
                                            if(!zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureFieldDataValue144.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureFieldDataValue144.getInstantDate();
                                        }

                                        
                                        Context DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureContext142 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionB_Layout1( bankCode, periodDate ,nameOfEntityAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureValue143 != null && !"".equals(zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureValue143)) {
                                        
                                        addContext(DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureContext142, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType aggregateAmountOutstandingForFundedExposureValue146 = new MonetaryItemType();
                                        aggregateAmountOutstandingForFundedExposureValue146.setContextRef(DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureContext142);
                                        
                                            aggregateAmountOutstandingForFundedExposureValue146.setUnitRef(INR141);
                                            aggregateAmountOutstandingForFundedExposureValue146.setDecimals("INF");
                                            aggregateAmountOutstandingForFundedExposureValue146.setValue(new BigDecimal(zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureValue143));
                                        
                                        
                                        JAXBElement<MonetaryItemType> aggregateAmountOutstandingForFundedExposureElement147 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAggregateAmountOutstandingForFundedExposure(aggregateAmountOutstandingForFundedExposureValue146);
                                        bodyElements.add(aggregateAmountOutstandingForFundedExposureElement147);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR148 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR148 = createUnitIfNotExist(INR148, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - FundedCreditExposure
                                
                                    Map zeroDBS12_SectionB_Layout1FundedCreditExposureMap152 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1FundedCreditExposureValue150 = DBS12ReportUtil.retrieveValueForElement(field.getFundedCreditExposure(), zeroDBS12_SectionB_Layout1FundedCreditExposureMap152);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionB_Layout1FundedCreditExposureFieldDataValue151 = DBS12ReportUtil.retrieveFieldDataForElement(field.getFundedCreditExposure(), zeroDBS12_SectionB_Layout1FundedCreditExposureMap152);

                                        if(zeroDBS12_SectionB_Layout1FundedCreditExposureFieldDataValue151 != null ) {
                                            if(!zeroDBS12_SectionB_Layout1FundedCreditExposureFieldDataValue151.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionB_Layout1FundedCreditExposureFieldDataValue151.getStartDate();
                                            if(!zeroDBS12_SectionB_Layout1FundedCreditExposureFieldDataValue151.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionB_Layout1FundedCreditExposureFieldDataValue151.getEndDate();
                                            if(!zeroDBS12_SectionB_Layout1FundedCreditExposureFieldDataValue151.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionB_Layout1FundedCreditExposureFieldDataValue151.getInstantDate();
                                        }

                                        
                                        Context DBS12_SectionB_Layout1FundedCreditExposureContext149 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionB_Layout1( bankCode, periodDate ,nameOfEntityAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1FundedCreditExposureValue150 != null && !"".equals(zeroDBS12_SectionB_Layout1FundedCreditExposureValue150)) {
                                        
                                        addContext(DBS12_SectionB_Layout1FundedCreditExposureContext149, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType fundedCreditExposureValue153 = new MonetaryItemType();
                                        fundedCreditExposureValue153.setContextRef(DBS12_SectionB_Layout1FundedCreditExposureContext149);
                                        
                                            fundedCreditExposureValue153.setUnitRef(INR148);
                                            fundedCreditExposureValue153.setDecimals("INF");
                                            fundedCreditExposureValue153.setValue(new BigDecimal(zeroDBS12_SectionB_Layout1FundedCreditExposureValue150));
                                        
                                        
                                        JAXBElement<MonetaryItemType> fundedCreditExposureElement154 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createFundedCreditExposure(fundedCreditExposureValue153);
                                        bodyElements.add(fundedCreditExposureElement154);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR155 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR155 = createUnitIfNotExist(INR155, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - AggregateAmountOutstandingForNonFundedExposure
                                
                                    Map zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureMap159 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureValue157 = DBS12ReportUtil.retrieveValueForElement(field.getAggregateAmountOutstandingForNonFundedExposure(), zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureMap159);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureFieldDataValue158 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAggregateAmountOutstandingForNonFundedExposure(), zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureMap159);

                                        if(zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureFieldDataValue158 != null ) {
                                            if(!zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureFieldDataValue158.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureFieldDataValue158.getStartDate();
                                            if(!zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureFieldDataValue158.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureFieldDataValue158.getEndDate();
                                            if(!zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureFieldDataValue158.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureFieldDataValue158.getInstantDate();
                                        }

                                        
                                        Context DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureContext156 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionB_Layout1( bankCode, periodDate ,nameOfEntityAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureValue157 != null && !"".equals(zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureValue157)) {
                                        
                                        addContext(DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureContext156, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType aggregateAmountOutstandingForNonFundedExposureValue160 = new MonetaryItemType();
                                        aggregateAmountOutstandingForNonFundedExposureValue160.setContextRef(DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureContext156);
                                        
                                            aggregateAmountOutstandingForNonFundedExposureValue160.setUnitRef(INR155);
                                            aggregateAmountOutstandingForNonFundedExposureValue160.setDecimals("INF");
                                            aggregateAmountOutstandingForNonFundedExposureValue160.setValue(new BigDecimal(zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureValue157));
                                        
                                        
                                        JAXBElement<MonetaryItemType> aggregateAmountOutstandingForNonFundedExposureElement161 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAggregateAmountOutstandingForNonFundedExposure(aggregateAmountOutstandingForNonFundedExposureValue160);
                                        bodyElements.add(aggregateAmountOutstandingForNonFundedExposureElement161);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR162 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR162 = createUnitIfNotExist(INR162, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - NonFundedCreditExposure
                                
                                    Map zeroDBS12_SectionB_Layout1NonFundedCreditExposureMap166 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1NonFundedCreditExposureValue164 = DBS12ReportUtil.retrieveValueForElement(field.getNonFundedCreditExposure(), zeroDBS12_SectionB_Layout1NonFundedCreditExposureMap166);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionB_Layout1NonFundedCreditExposureFieldDataValue165 = DBS12ReportUtil.retrieveFieldDataForElement(field.getNonFundedCreditExposure(), zeroDBS12_SectionB_Layout1NonFundedCreditExposureMap166);

                                        if(zeroDBS12_SectionB_Layout1NonFundedCreditExposureFieldDataValue165 != null ) {
                                            if(!zeroDBS12_SectionB_Layout1NonFundedCreditExposureFieldDataValue165.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionB_Layout1NonFundedCreditExposureFieldDataValue165.getStartDate();
                                            if(!zeroDBS12_SectionB_Layout1NonFundedCreditExposureFieldDataValue165.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionB_Layout1NonFundedCreditExposureFieldDataValue165.getEndDate();
                                            if(!zeroDBS12_SectionB_Layout1NonFundedCreditExposureFieldDataValue165.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionB_Layout1NonFundedCreditExposureFieldDataValue165.getInstantDate();
                                        }

                                        
                                        Context DBS12_SectionB_Layout1NonFundedCreditExposureContext163 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionB_Layout1( bankCode, periodDate ,nameOfEntityAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1NonFundedCreditExposureValue164 != null && !"".equals(zeroDBS12_SectionB_Layout1NonFundedCreditExposureValue164)) {
                                        
                                        addContext(DBS12_SectionB_Layout1NonFundedCreditExposureContext163, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType nonFundedCreditExposureValue167 = new MonetaryItemType();
                                        nonFundedCreditExposureValue167.setContextRef(DBS12_SectionB_Layout1NonFundedCreditExposureContext163);
                                        
                                            nonFundedCreditExposureValue167.setUnitRef(INR162);
                                            nonFundedCreditExposureValue167.setDecimals("INF");
                                            nonFundedCreditExposureValue167.setValue(new BigDecimal(zeroDBS12_SectionB_Layout1NonFundedCreditExposureValue164));
                                        
                                        
                                        JAXBElement<MonetaryItemType> nonFundedCreditExposureElement168 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNonFundedCreditExposure(nonFundedCreditExposureValue167);
                                        bodyElements.add(nonFundedCreditExposureElement168);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR169 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR169 = createUnitIfNotExist(INR169, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - AggregateInvestmentExposure
                                
                                    Map zeroDBS12_SectionB_Layout1AggregateInvestmentExposureMap173 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1AggregateInvestmentExposureValue171 = DBS12ReportUtil.retrieveValueForElement(field.getAggregateInvestmentExposure(), zeroDBS12_SectionB_Layout1AggregateInvestmentExposureMap173);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionB_Layout1AggregateInvestmentExposureFieldDataValue172 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAggregateInvestmentExposure(), zeroDBS12_SectionB_Layout1AggregateInvestmentExposureMap173);

                                        if(zeroDBS12_SectionB_Layout1AggregateInvestmentExposureFieldDataValue172 != null ) {
                                            if(!zeroDBS12_SectionB_Layout1AggregateInvestmentExposureFieldDataValue172.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionB_Layout1AggregateInvestmentExposureFieldDataValue172.getStartDate();
                                            if(!zeroDBS12_SectionB_Layout1AggregateInvestmentExposureFieldDataValue172.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionB_Layout1AggregateInvestmentExposureFieldDataValue172.getEndDate();
                                            if(!zeroDBS12_SectionB_Layout1AggregateInvestmentExposureFieldDataValue172.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionB_Layout1AggregateInvestmentExposureFieldDataValue172.getInstantDate();
                                        }

                                        
                                        Context DBS12_SectionB_Layout1AggregateInvestmentExposureContext170 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionB_Layout1( bankCode, periodDate ,nameOfEntityAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1AggregateInvestmentExposureValue171 != null && !"".equals(zeroDBS12_SectionB_Layout1AggregateInvestmentExposureValue171)) {
                                        
                                        addContext(DBS12_SectionB_Layout1AggregateInvestmentExposureContext170, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType aggregateInvestmentExposureValue174 = new MonetaryItemType();
                                        aggregateInvestmentExposureValue174.setContextRef(DBS12_SectionB_Layout1AggregateInvestmentExposureContext170);
                                        
                                            aggregateInvestmentExposureValue174.setUnitRef(INR169);
                                            aggregateInvestmentExposureValue174.setDecimals("INF");
                                            aggregateInvestmentExposureValue174.setValue(new BigDecimal(zeroDBS12_SectionB_Layout1AggregateInvestmentExposureValue171));
                                        
                                        
                                        JAXBElement<MonetaryItemType> aggregateInvestmentExposureElement175 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAggregateInvestmentExposure(aggregateInvestmentExposureValue174);
                                        bodyElements.add(aggregateInvestmentExposureElement175);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR176 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR176 = createUnitIfNotExist(INR176, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExemptedExposure
                                
                                    Map zeroDBS12_SectionB_Layout1ExemptedExposureMap180 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1ExemptedExposureValue178 = DBS12ReportUtil.retrieveValueForElement(field.getExemptedExposure(), zeroDBS12_SectionB_Layout1ExemptedExposureMap180);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionB_Layout1ExemptedExposureFieldDataValue179 = DBS12ReportUtil.retrieveFieldDataForElement(field.getExemptedExposure(), zeroDBS12_SectionB_Layout1ExemptedExposureMap180);

                                        if(zeroDBS12_SectionB_Layout1ExemptedExposureFieldDataValue179 != null ) {
                                            if(!zeroDBS12_SectionB_Layout1ExemptedExposureFieldDataValue179.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionB_Layout1ExemptedExposureFieldDataValue179.getStartDate();
                                            if(!zeroDBS12_SectionB_Layout1ExemptedExposureFieldDataValue179.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionB_Layout1ExemptedExposureFieldDataValue179.getEndDate();
                                            if(!zeroDBS12_SectionB_Layout1ExemptedExposureFieldDataValue179.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionB_Layout1ExemptedExposureFieldDataValue179.getInstantDate();
                                        }

                                        
                                        Context DBS12_SectionB_Layout1ExemptedExposureContext177 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionB_Layout1( bankCode, periodDate ,nameOfEntityAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1ExemptedExposureValue178 != null && !"".equals(zeroDBS12_SectionB_Layout1ExemptedExposureValue178)) {
                                        
                                        addContext(DBS12_SectionB_Layout1ExemptedExposureContext177, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exemptedExposureValue181 = new MonetaryItemType();
                                        exemptedExposureValue181.setContextRef(DBS12_SectionB_Layout1ExemptedExposureContext177);
                                        
                                            exemptedExposureValue181.setUnitRef(INR176);
                                            exemptedExposureValue181.setDecimals("INF");
                                            exemptedExposureValue181.setValue(new BigDecimal(zeroDBS12_SectionB_Layout1ExemptedExposureValue178));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exemptedExposureElement182 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createExemptedExposure(exemptedExposureValue181);
                                        bodyElements.add(exemptedExposureElement182);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR183 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR183 = createUnitIfNotExist(INR183, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - AggregateAmountOutstanding
                                
                                    Map zeroDBS12_SectionB_Layout1AggregateAmountOutstandingMap187 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1AggregateAmountOutstandingValue185 = DBS12ReportUtil.retrieveValueForElement(field.getAggregateAmountOutstanding(), zeroDBS12_SectionB_Layout1AggregateAmountOutstandingMap187);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionB_Layout1AggregateAmountOutstandingFieldDataValue186 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAggregateAmountOutstanding(), zeroDBS12_SectionB_Layout1AggregateAmountOutstandingMap187);

                                        if(zeroDBS12_SectionB_Layout1AggregateAmountOutstandingFieldDataValue186 != null ) {
                                            if(!zeroDBS12_SectionB_Layout1AggregateAmountOutstandingFieldDataValue186.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionB_Layout1AggregateAmountOutstandingFieldDataValue186.getStartDate();
                                            if(!zeroDBS12_SectionB_Layout1AggregateAmountOutstandingFieldDataValue186.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionB_Layout1AggregateAmountOutstandingFieldDataValue186.getEndDate();
                                            if(!zeroDBS12_SectionB_Layout1AggregateAmountOutstandingFieldDataValue186.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionB_Layout1AggregateAmountOutstandingFieldDataValue186.getInstantDate();
                                        }

                                        
                                        Context DBS12_SectionB_Layout1AggregateAmountOutstandingContext184 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionB_Layout1( bankCode, periodDate ,nameOfEntityAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1AggregateAmountOutstandingValue185 != null && !"".equals(zeroDBS12_SectionB_Layout1AggregateAmountOutstandingValue185)) {
                                        
                                        addContext(DBS12_SectionB_Layout1AggregateAmountOutstandingContext184, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType aggregateAmountOutstandingValue188 = new MonetaryItemType();
                                        aggregateAmountOutstandingValue188.setContextRef(DBS12_SectionB_Layout1AggregateAmountOutstandingContext184);
                                        
                                            aggregateAmountOutstandingValue188.setUnitRef(INR183);
                                            aggregateAmountOutstandingValue188.setDecimals("INF");
                                            aggregateAmountOutstandingValue188.setValue(new BigDecimal(zeroDBS12_SectionB_Layout1AggregateAmountOutstandingValue185));
                                        
                                        
                                        JAXBElement<MonetaryItemType> aggregateAmountOutstandingElement189 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAggregateAmountOutstanding(aggregateAmountOutstandingValue188);
                                        bodyElements.add(aggregateAmountOutstandingElement189);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR190 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR190 = createUnitIfNotExist(INR190, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - AggregateExposure
                                
                                    Map zeroDBS12_SectionB_Layout1AggregateExposureMap194 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1AggregateExposureValue192 = DBS12ReportUtil.retrieveValueForElement(field.getAggregateExposure(), zeroDBS12_SectionB_Layout1AggregateExposureMap194);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionB_Layout1AggregateExposureFieldDataValue193 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAggregateExposure(), zeroDBS12_SectionB_Layout1AggregateExposureMap194);

                                        if(zeroDBS12_SectionB_Layout1AggregateExposureFieldDataValue193 != null ) {
                                            if(!zeroDBS12_SectionB_Layout1AggregateExposureFieldDataValue193.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionB_Layout1AggregateExposureFieldDataValue193.getStartDate();
                                            if(!zeroDBS12_SectionB_Layout1AggregateExposureFieldDataValue193.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionB_Layout1AggregateExposureFieldDataValue193.getEndDate();
                                            if(!zeroDBS12_SectionB_Layout1AggregateExposureFieldDataValue193.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionB_Layout1AggregateExposureFieldDataValue193.getInstantDate();
                                        }

                                        
                                        Context DBS12_SectionB_Layout1AggregateExposureContext191 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionB_Layout1( bankCode, periodDate ,nameOfEntityAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1AggregateExposureValue192 != null && !"".equals(zeroDBS12_SectionB_Layout1AggregateExposureValue192)) {
                                        
                                        addContext(DBS12_SectionB_Layout1AggregateExposureContext191, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType aggregateExposureValue195 = new MonetaryItemType();
                                        aggregateExposureValue195.setContextRef(DBS12_SectionB_Layout1AggregateExposureContext191);
                                        
                                            aggregateExposureValue195.setUnitRef(INR190);
                                            aggregateExposureValue195.setDecimals("INF");
                                            aggregateExposureValue195.setValue(new BigDecimal(zeroDBS12_SectionB_Layout1AggregateExposureValue192));
                                        
                                        
                                        JAXBElement<MonetaryItemType> aggregateExposureElement196 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAggregateExposure(aggregateExposureValue195);
                                        bodyElements.add(aggregateExposureElement196);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                
                                // - AssetClassifications
                                
                                    Map zeroDBS12_SectionB_Layout1AssetClassificationsMap200 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1AssetClassificationsValue198 = DBS12ReportUtil.retrieveValueForElement(field.getAssetClassifications(), zeroDBS12_SectionB_Layout1AssetClassificationsMap200);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionB_Layout1AssetClassificationsFieldDataValue199 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAssetClassifications(), zeroDBS12_SectionB_Layout1AssetClassificationsMap200);

                                        if(zeroDBS12_SectionB_Layout1AssetClassificationsFieldDataValue199 != null ) {
                                            if(!zeroDBS12_SectionB_Layout1AssetClassificationsFieldDataValue199.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionB_Layout1AssetClassificationsFieldDataValue199.getStartDate();
                                            if(!zeroDBS12_SectionB_Layout1AssetClassificationsFieldDataValue199.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionB_Layout1AssetClassificationsFieldDataValue199.getEndDate();
                                            if(!zeroDBS12_SectionB_Layout1AssetClassificationsFieldDataValue199.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionB_Layout1AssetClassificationsFieldDataValue199.getInstantDate();
                                        }

                                        
                                            Context DBS12_SectionB_Layout1AssetClassificationsContext197 = DBS12ReportContextUtil.createFromToContextDBS12_SectionB_Layout1( bankCode, startDate, endDate ,nameOfEntityAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1AssetClassificationsValue198 != null && !"".equals(zeroDBS12_SectionB_Layout1AssetClassificationsValue198)) {
                                        
                                        addContext(DBS12_SectionB_Layout1AssetClassificationsContext197, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        AssetClassifications assetClassificationsValue201 = new AssetClassifications();
                                        assetClassificationsValue201.setContextRef(DBS12_SectionB_Layout1AssetClassificationsContext197);
                                        
                                            assetClassificationsValue201.setValue(zeroDBS12_SectionB_Layout1AssetClassificationsValue198);        
                                        
                                        
                                        JAXBElement<AssetClassifications> assetClassificationsElement202 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createAssetClassifications(assetClassificationsValue201);
                                        bodyElements.add(assetClassificationsElement202);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR203 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR203 = createUnitIfNotExist(INR203, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - AmountOfAggregateProvisionsHeldForNPAs
                                
                                    Map zeroDBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsMap207 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsValue205 = DBS12ReportUtil.retrieveValueForElement(field.getAmountOfAggregateProvisionsHeldForNPAs(), zeroDBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsMap207);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsFieldDataValue206 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAmountOfAggregateProvisionsHeldForNPAs(), zeroDBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsMap207);

                                        if(zeroDBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsFieldDataValue206 != null ) {
                                            if(!zeroDBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsFieldDataValue206.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsFieldDataValue206.getStartDate();
                                            if(!zeroDBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsFieldDataValue206.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsFieldDataValue206.getEndDate();
                                            if(!zeroDBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsFieldDataValue206.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsFieldDataValue206.getInstantDate();
                                        }

                                        
                                        Context DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsContext204 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionB_Layout1( bankCode, periodDate ,nameOfEntityAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsValue205 != null && !"".equals(zeroDBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsValue205)) {
                                        
                                        addContext(DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsContext204, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType amountOfAggregateProvisionsHeldForNPAsValue208 = new MonetaryItemType();
                                        amountOfAggregateProvisionsHeldForNPAsValue208.setContextRef(DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsContext204);
                                        
                                            amountOfAggregateProvisionsHeldForNPAsValue208.setUnitRef(INR203);
                                            amountOfAggregateProvisionsHeldForNPAsValue208.setDecimals("INF");
                                            amountOfAggregateProvisionsHeldForNPAsValue208.setValue(new BigDecimal(zeroDBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsValue205));
                                        
                                        
                                        JAXBElement<MonetaryItemType> amountOfAggregateProvisionsHeldForNPAsElement209 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAmountOfAggregateProvisionsHeldForNPAs(amountOfAggregateProvisionsHeldForNPAsValue208);
                                        bodyElements.add(amountOfAggregateProvisionsHeldForNPAsElement209);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR210 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR210 = createUnitIfNotExist(INR210, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstanding
                                
                                    Map zeroDBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingMap214 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingValue212 = DBS12ReportUtil.retrieveValueForElement(field.getAmountOfUnsecuredAmountOutstandingOfTotalAmountOutstanding(), zeroDBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingMap214);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingFieldDataValue213 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAmountOfUnsecuredAmountOutstandingOfTotalAmountOutstanding(), zeroDBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingMap214);

                                        if(zeroDBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingFieldDataValue213 != null ) {
                                            if(!zeroDBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingFieldDataValue213.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingFieldDataValue213.getStartDate();
                                            if(!zeroDBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingFieldDataValue213.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingFieldDataValue213.getEndDate();
                                            if(!zeroDBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingFieldDataValue213.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingFieldDataValue213.getInstantDate();
                                        }

                                        
                                        Context DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingContext211 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionB_Layout1( bankCode, periodDate ,nameOfEntityAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingValue212 != null && !"".equals(zeroDBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingValue212)) {
                                        
                                        addContext(DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingContext211, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType amountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingValue215 = new MonetaryItemType();
                                        amountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingValue215.setContextRef(DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingContext211);
                                        
                                            amountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingValue215.setUnitRef(INR210);
                                            amountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingValue215.setDecimals("INF");
                                            amountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingValue215.setValue(new BigDecimal(zeroDBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingValue212));
                                        
                                        
                                        JAXBElement<MonetaryItemType> amountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingElement216 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAmountOfUnsecuredAmountOutstandingOfTotalAmountOutstanding(amountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingValue215);
                                        bodyElements.add(amountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingElement216);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                
                                // - ReasonsForBreachOfStipulatedPrudentialLimits
                                
                                    Map zeroDBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsMap220 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsValue218 = DBS12ReportUtil.retrieveValueForElement(field.getReasonsForBreachOfStipulatedPrudentialLimits(), zeroDBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsMap220);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsFieldDataValue219 = DBS12ReportUtil.retrieveFieldDataForElement(field.getReasonsForBreachOfStipulatedPrudentialLimits(), zeroDBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsMap220);

                                        if(zeroDBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsFieldDataValue219 != null ) {
                                            if(!zeroDBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsFieldDataValue219.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsFieldDataValue219.getStartDate();
                                            if(!zeroDBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsFieldDataValue219.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsFieldDataValue219.getEndDate();
                                            if(!zeroDBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsFieldDataValue219.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsFieldDataValue219.getInstantDate();
                                        }

                                        
                                            Context DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsContext217 = DBS12ReportContextUtil.createFromToContextDBS12_SectionB_Layout1( bankCode, startDate, endDate ,nameOfEntityAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsValue218 != null && !"".equals(zeroDBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsValue218)) {
                                        
                                        addContext(DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsContext217, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        StringItemType reasonsForBreachOfStipulatedPrudentialLimitsValue221 = new StringItemType();
                                        reasonsForBreachOfStipulatedPrudentialLimitsValue221.setContextRef(DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsContext217);
                                        
                                            reasonsForBreachOfStipulatedPrudentialLimitsValue221.setValue(zeroDBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsValue218);        
                                        
                                        
                                        JAXBElement<StringItemType> reasonsForBreachOfStipulatedPrudentialLimitsElement222 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createReasonsForBreachOfStipulatedPrudentialLimits(reasonsForBreachOfStipulatedPrudentialLimitsValue221);
                                        bodyElements.add(reasonsForBreachOfStipulatedPrudentialLimitsElement222);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                
                                // - DescriptionOfIntraGroupSupportArrangementsOrAgreements
                                
                                    Map zeroDBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsMap226 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsValue224 = DBS12ReportUtil.retrieveValueForElement(field.getDescriptionOfIntraGroupSupportArrangementsOrAgreements(), zeroDBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsMap226);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsFieldDataValue225 = DBS12ReportUtil.retrieveFieldDataForElement(field.getDescriptionOfIntraGroupSupportArrangementsOrAgreements(), zeroDBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsMap226);

                                        if(zeroDBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsFieldDataValue225 != null ) {
                                            if(!zeroDBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsFieldDataValue225.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsFieldDataValue225.getStartDate();
                                            if(!zeroDBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsFieldDataValue225.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsFieldDataValue225.getEndDate();
                                            if(!zeroDBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsFieldDataValue225.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsFieldDataValue225.getInstantDate();
                                        }

                                        
                                            Context DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsContext223 = DBS12ReportContextUtil.createFromToContextDBS12_SectionB_Layout1( bankCode, startDate, endDate ,nameOfEntityAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsValue224 != null && !"".equals(zeroDBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsValue224)) {
                                        
                                        addContext(DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsContext223, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        StringItemType descriptionOfIntraGroupSupportArrangementsOrAgreementsValue227 = new StringItemType();
                                        descriptionOfIntraGroupSupportArrangementsOrAgreementsValue227.setContextRef(DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsContext223);
                                        
                                            descriptionOfIntraGroupSupportArrangementsOrAgreementsValue227.setValue(zeroDBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsValue224);        
                                        
                                        
                                        JAXBElement<StringItemType> descriptionOfIntraGroupSupportArrangementsOrAgreementsElement228 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createDescriptionOfIntraGroupSupportArrangementsOrAgreements(descriptionOfIntraGroupSupportArrangementsOrAgreementsValue227);
                                        bodyElements.add(descriptionOfIntraGroupSupportArrangementsOrAgreementsElement228);
                                    }
                                
                            
                            
                            
                        
                        
                
                        
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBS12_SectionC_Layout1 if any typeMembers then List or Single
                //List<DBS12_SectionC_Layout1> dBS12_SectionC_Layout1 = mainReportData.getDBS12_SectionC_Layout1();
                
                
                // if typemembers exist
                
                    private String dBS12_SectionC_Layout1Method(List<DBS12_SectionC_Layout1> dBS12_SectionC_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                    {
                        
                    dBS12_SectionC_Layout1.forEach((field)->{
                        // create startdate, enddate, and perioddate
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                        // crate variable loop  for type member
                        
                            // create variable for type member UniqueTransactionCodeAxis
                            String uniqueTransactionCodeAxis = field.getUniqueTransactionCodeAxis();
                        
                            // create variable for type member NameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis
                            String nameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis = field.getNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis();
                        
                        // end create variable loop for type member
                        
                        // if explict member is empty
                        
                            // create xbrl report element
                            
                                // start create element for report of DBS12_SectionC_Layout1
                                // create unit if not empty
                                
                                
                                // - TypeOfEntity
                                
                                    Map zeroDBS12_SectionC_Layout1TypeOfEntityMap232 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionC_Layout1TypeOfEntityValue230 = DBS12ReportUtil.retrieveValueForElement(field.getTypeOfEntity(), zeroDBS12_SectionC_Layout1TypeOfEntityMap232);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionC_Layout1TypeOfEntityFieldDataValue231 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTypeOfEntity(), zeroDBS12_SectionC_Layout1TypeOfEntityMap232);

                                        if(zeroDBS12_SectionC_Layout1TypeOfEntityFieldDataValue231 != null ) {
                                            if(!zeroDBS12_SectionC_Layout1TypeOfEntityFieldDataValue231.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionC_Layout1TypeOfEntityFieldDataValue231.getStartDate();
                                            if(!zeroDBS12_SectionC_Layout1TypeOfEntityFieldDataValue231.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionC_Layout1TypeOfEntityFieldDataValue231.getEndDate();
                                            if(!zeroDBS12_SectionC_Layout1TypeOfEntityFieldDataValue231.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionC_Layout1TypeOfEntityFieldDataValue231.getInstantDate();
                                        }

                                        
                                            Context DBS12_SectionC_Layout1TypeOfEntityContext229 = DBS12ReportContextUtil.createFromToContextDBS12_SectionC_Layout1( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionC_Layout1TypeOfEntityValue230 != null && !"".equals(zeroDBS12_SectionC_Layout1TypeOfEntityValue230)) {
                                        
                                        addContext(DBS12_SectionC_Layout1TypeOfEntityContext229, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        TypeOfEntity typeOfEntityValue233 = new TypeOfEntity();
                                        typeOfEntityValue233.setContextRef(DBS12_SectionC_Layout1TypeOfEntityContext229);
                                        
                                            typeOfEntityValue233.setValue(zeroDBS12_SectionC_Layout1TypeOfEntityValue230);        
                                        
                                        
                                        JAXBElement<TypeOfEntity> typeOfEntityElement234 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTypeOfEntity(typeOfEntityValue233);
                                        bodyElements.add(typeOfEntityElement234);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionC_Layout1
                                // create unit if not empty
                                
                                
                                // - TypeOfExposures
                                
                                    Map zeroDBS12_SectionC_Layout1TypeOfExposuresMap238 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionC_Layout1TypeOfExposuresValue236 = DBS12ReportUtil.retrieveValueForElement(field.getTypeOfExposures(), zeroDBS12_SectionC_Layout1TypeOfExposuresMap238);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionC_Layout1TypeOfExposuresFieldDataValue237 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTypeOfExposures(), zeroDBS12_SectionC_Layout1TypeOfExposuresMap238);

                                        if(zeroDBS12_SectionC_Layout1TypeOfExposuresFieldDataValue237 != null ) {
                                            if(!zeroDBS12_SectionC_Layout1TypeOfExposuresFieldDataValue237.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionC_Layout1TypeOfExposuresFieldDataValue237.getStartDate();
                                            if(!zeroDBS12_SectionC_Layout1TypeOfExposuresFieldDataValue237.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionC_Layout1TypeOfExposuresFieldDataValue237.getEndDate();
                                            if(!zeroDBS12_SectionC_Layout1TypeOfExposuresFieldDataValue237.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionC_Layout1TypeOfExposuresFieldDataValue237.getInstantDate();
                                        }

                                        
                                            Context DBS12_SectionC_Layout1TypeOfExposuresContext235 = DBS12ReportContextUtil.createFromToContextDBS12_SectionC_Layout1( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionC_Layout1TypeOfExposuresValue236 != null && !"".equals(zeroDBS12_SectionC_Layout1TypeOfExposuresValue236)) {
                                        
                                        addContext(DBS12_SectionC_Layout1TypeOfExposuresContext235, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        TypeOfExposures typeOfExposuresValue239 = new TypeOfExposures();
                                        typeOfExposuresValue239.setContextRef(DBS12_SectionC_Layout1TypeOfExposuresContext235);
                                        
                                            typeOfExposuresValue239.setValue(zeroDBS12_SectionC_Layout1TypeOfExposuresValue236);        
                                        
                                        
                                        JAXBElement<TypeOfExposures> typeOfExposuresElement240 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTypeOfExposures(typeOfExposuresValue239);
                                        bodyElements.add(typeOfExposuresElement240);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionC_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR241 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR241 = createUnitIfNotExist(INR241, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExposureAmount
                                
                                    Map zeroDBS12_SectionC_Layout1ExposureAmountMap245 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionC_Layout1ExposureAmountValue243 = DBS12ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBS12_SectionC_Layout1ExposureAmountMap245);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionC_Layout1ExposureAmountFieldDataValue244 = DBS12ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), zeroDBS12_SectionC_Layout1ExposureAmountMap245);

                                        if(zeroDBS12_SectionC_Layout1ExposureAmountFieldDataValue244 != null ) {
                                            if(!zeroDBS12_SectionC_Layout1ExposureAmountFieldDataValue244.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionC_Layout1ExposureAmountFieldDataValue244.getStartDate();
                                            if(!zeroDBS12_SectionC_Layout1ExposureAmountFieldDataValue244.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionC_Layout1ExposureAmountFieldDataValue244.getEndDate();
                                            if(!zeroDBS12_SectionC_Layout1ExposureAmountFieldDataValue244.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionC_Layout1ExposureAmountFieldDataValue244.getInstantDate();
                                        }

                                        
                                        Context DBS12_SectionC_Layout1ExposureAmountContext242 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionC_Layout1( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionC_Layout1ExposureAmountValue243 != null && !"".equals(zeroDBS12_SectionC_Layout1ExposureAmountValue243)) {
                                        
                                        addContext(DBS12_SectionC_Layout1ExposureAmountContext242, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exposureAmountValue246 = new MonetaryItemType();
                                        exposureAmountValue246.setContextRef(DBS12_SectionC_Layout1ExposureAmountContext242);
                                        
                                            exposureAmountValue246.setUnitRef(INR241);
                                            exposureAmountValue246.setDecimals("INF");
                                            exposureAmountValue246.setValue(new BigDecimal(zeroDBS12_SectionC_Layout1ExposureAmountValue243));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exposureAmountElement247 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue246);
                                        bodyElements.add(exposureAmountElement247);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionC_Layout1
                                // create unit if not empty
                                
                                
                                // - TermOfCreditExposure
                                
                                    Map zeroDBS12_SectionC_Layout1TermOfCreditExposureMap251 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionC_Layout1TermOfCreditExposureValue249 = DBS12ReportUtil.retrieveValueForElement(field.getTermOfCreditExposure(), zeroDBS12_SectionC_Layout1TermOfCreditExposureMap251);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionC_Layout1TermOfCreditExposureFieldDataValue250 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTermOfCreditExposure(), zeroDBS12_SectionC_Layout1TermOfCreditExposureMap251);

                                        if(zeroDBS12_SectionC_Layout1TermOfCreditExposureFieldDataValue250 != null ) {
                                            if(!zeroDBS12_SectionC_Layout1TermOfCreditExposureFieldDataValue250.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionC_Layout1TermOfCreditExposureFieldDataValue250.getStartDate();
                                            if(!zeroDBS12_SectionC_Layout1TermOfCreditExposureFieldDataValue250.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionC_Layout1TermOfCreditExposureFieldDataValue250.getEndDate();
                                            if(!zeroDBS12_SectionC_Layout1TermOfCreditExposureFieldDataValue250.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionC_Layout1TermOfCreditExposureFieldDataValue250.getInstantDate();
                                        }

                                        
                                            Context DBS12_SectionC_Layout1TermOfCreditExposureContext248 = DBS12ReportContextUtil.createFromToContextDBS12_SectionC_Layout1( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionC_Layout1TermOfCreditExposureValue249 != null && !"".equals(zeroDBS12_SectionC_Layout1TermOfCreditExposureValue249)) {
                                        
                                        addContext(DBS12_SectionC_Layout1TermOfCreditExposureContext248, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        StringItemType termOfCreditExposureValue252 = new StringItemType();
                                        termOfCreditExposureValue252.setContextRef(DBS12_SectionC_Layout1TermOfCreditExposureContext248);
                                        
                                            termOfCreditExposureValue252.setValue(zeroDBS12_SectionC_Layout1TermOfCreditExposureValue249);        
                                        
                                        
                                        JAXBElement<StringItemType> termOfCreditExposureElement253 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createTermOfCreditExposure(termOfCreditExposureValue252);
                                        bodyElements.add(termOfCreditExposureElement253);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionC_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR254 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR254 = createUnitIfNotExist(INR254, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ValueOfSecuritiesCollateral
                                
                                    Map zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralMap258 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralValue256 = DBS12ReportUtil.retrieveValueForElement(field.getValueOfSecuritiesCollateral(), zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralMap258);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralFieldDataValue257 = DBS12ReportUtil.retrieveFieldDataForElement(field.getValueOfSecuritiesCollateral(), zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralMap258);

                                        if(zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralFieldDataValue257 != null ) {
                                            if(!zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralFieldDataValue257.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralFieldDataValue257.getStartDate();
                                            if(!zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralFieldDataValue257.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralFieldDataValue257.getEndDate();
                                            if(!zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralFieldDataValue257.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralFieldDataValue257.getInstantDate();
                                        }

                                        
                                        Context DBS12_SectionC_Layout1ValueOfSecuritiesCollateralContext255 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionC_Layout1( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralValue256 != null && !"".equals(zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralValue256)) {
                                        
                                        addContext(DBS12_SectionC_Layout1ValueOfSecuritiesCollateralContext255, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType valueOfSecuritiesCollateralValue259 = new MonetaryItemType();
                                        valueOfSecuritiesCollateralValue259.setContextRef(DBS12_SectionC_Layout1ValueOfSecuritiesCollateralContext255);
                                        
                                            valueOfSecuritiesCollateralValue259.setUnitRef(INR254);
                                            valueOfSecuritiesCollateralValue259.setDecimals("INF");
                                            valueOfSecuritiesCollateralValue259.setValue(new BigDecimal(zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralValue256));
                                        
                                        
                                        JAXBElement<MonetaryItemType> valueOfSecuritiesCollateralElement260 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createValueOfSecuritiesCollateral(valueOfSecuritiesCollateralValue259);
                                        bodyElements.add(valueOfSecuritiesCollateralElement260);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionC_Layout1
                                // create unit if not empty
                                
                                
                                // - AssetClassifications
                                
                                    Map zeroDBS12_SectionC_Layout1AssetClassificationsMap264 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionC_Layout1AssetClassificationsValue262 = DBS12ReportUtil.retrieveValueForElement(field.getAssetClassifications(), zeroDBS12_SectionC_Layout1AssetClassificationsMap264);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionC_Layout1AssetClassificationsFieldDataValue263 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAssetClassifications(), zeroDBS12_SectionC_Layout1AssetClassificationsMap264);

                                        if(zeroDBS12_SectionC_Layout1AssetClassificationsFieldDataValue263 != null ) {
                                            if(!zeroDBS12_SectionC_Layout1AssetClassificationsFieldDataValue263.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionC_Layout1AssetClassificationsFieldDataValue263.getStartDate();
                                            if(!zeroDBS12_SectionC_Layout1AssetClassificationsFieldDataValue263.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionC_Layout1AssetClassificationsFieldDataValue263.getEndDate();
                                            if(!zeroDBS12_SectionC_Layout1AssetClassificationsFieldDataValue263.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionC_Layout1AssetClassificationsFieldDataValue263.getInstantDate();
                                        }

                                        
                                            Context DBS12_SectionC_Layout1AssetClassificationsContext261 = DBS12ReportContextUtil.createFromToContextDBS12_SectionC_Layout1( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionC_Layout1AssetClassificationsValue262 != null && !"".equals(zeroDBS12_SectionC_Layout1AssetClassificationsValue262)) {
                                        
                                        addContext(DBS12_SectionC_Layout1AssetClassificationsContext261, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        AssetClassifications assetClassificationsValue265 = new AssetClassifications();
                                        assetClassificationsValue265.setContextRef(DBS12_SectionC_Layout1AssetClassificationsContext261);
                                        
                                            assetClassificationsValue265.setValue(zeroDBS12_SectionC_Layout1AssetClassificationsValue262);        
                                        
                                        
                                        JAXBElement<AssetClassifications> assetClassificationsElement266 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createAssetClassifications(assetClassificationsValue265);
                                        bodyElements.add(assetClassificationsElement266);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionC_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR267 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR267 = createUnitIfNotExist(INR267, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ProvisionForInvestment
                                
                                    Map zeroDBS12_SectionC_Layout1ProvisionForInvestmentMap271 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionC_Layout1ProvisionForInvestmentValue269 = DBS12ReportUtil.retrieveValueForElement(field.getProvisionForInvestment(), zeroDBS12_SectionC_Layout1ProvisionForInvestmentMap271);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionC_Layout1ProvisionForInvestmentFieldDataValue270 = DBS12ReportUtil.retrieveFieldDataForElement(field.getProvisionForInvestment(), zeroDBS12_SectionC_Layout1ProvisionForInvestmentMap271);

                                        if(zeroDBS12_SectionC_Layout1ProvisionForInvestmentFieldDataValue270 != null ) {
                                            if(!zeroDBS12_SectionC_Layout1ProvisionForInvestmentFieldDataValue270.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionC_Layout1ProvisionForInvestmentFieldDataValue270.getStartDate();
                                            if(!zeroDBS12_SectionC_Layout1ProvisionForInvestmentFieldDataValue270.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionC_Layout1ProvisionForInvestmentFieldDataValue270.getEndDate();
                                            if(!zeroDBS12_SectionC_Layout1ProvisionForInvestmentFieldDataValue270.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionC_Layout1ProvisionForInvestmentFieldDataValue270.getInstantDate();
                                        }

                                        
                                        Context DBS12_SectionC_Layout1ProvisionForInvestmentContext268 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionC_Layout1( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionC_Layout1ProvisionForInvestmentValue269 != null && !"".equals(zeroDBS12_SectionC_Layout1ProvisionForInvestmentValue269)) {
                                        
                                        addContext(DBS12_SectionC_Layout1ProvisionForInvestmentContext268, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType provisionForInvestmentValue272 = new MonetaryItemType();
                                        provisionForInvestmentValue272.setContextRef(DBS12_SectionC_Layout1ProvisionForInvestmentContext268);
                                        
                                            provisionForInvestmentValue272.setUnitRef(INR267);
                                            provisionForInvestmentValue272.setDecimals("INF");
                                            provisionForInvestmentValue272.setValue(new BigDecimal(zeroDBS12_SectionC_Layout1ProvisionForInvestmentValue269));
                                        
                                        
                                        JAXBElement<MonetaryItemType> provisionForInvestmentElement273 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createProvisionForInvestment(provisionForInvestmentValue272);
                                        bodyElements.add(provisionForInvestmentElement273);
                                    }
                                
                            
                            
                            
                        
                        
                
                        
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBS12_SectionD_Layout1 if any typeMembers then List or Single
                //List<DBS12_SectionD_Layout1> dBS12_SectionD_Layout1 = mainReportData.getDBS12_SectionD_Layout1();
                
                
                // if typemembers exist
                
                    private String dBS12_SectionD_Layout1Method(List<DBS12_SectionD_Layout1> dBS12_SectionD_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                    {
                        
                    dBS12_SectionD_Layout1.forEach((field)->{
                        // create startdate, enddate, and perioddate
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                        // crate variable loop  for type member
                        
                            // create variable for type member UniqueTransactionCodeAxis
                            String uniqueTransactionCodeAxis = field.getUniqueTransactionCodeAxis();
                        
                            // create variable for type member NameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis
                            String nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis = field.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis();
                        
                        // end create variable loop for type member
                        
                        // if explict member is empty
                        
                            // create xbrl report element
                            
                                // start create element for report of DBS12_SectionD_Layout1
                                // create unit if not empty
                                
                                
                                // - TypeOfExposures
                                
                                    Map zeroDBS12_SectionD_Layout1TypeOfExposuresMap277 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout1TypeOfExposuresValue275 = DBS12ReportUtil.retrieveValueForElement(field.getTypeOfExposures(), zeroDBS12_SectionD_Layout1TypeOfExposuresMap277);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout1TypeOfExposuresFieldDataValue276 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTypeOfExposures(), zeroDBS12_SectionD_Layout1TypeOfExposuresMap277);

                                        if(zeroDBS12_SectionD_Layout1TypeOfExposuresFieldDataValue276 != null ) {
                                            if(!zeroDBS12_SectionD_Layout1TypeOfExposuresFieldDataValue276.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout1TypeOfExposuresFieldDataValue276.getStartDate();
                                            if(!zeroDBS12_SectionD_Layout1TypeOfExposuresFieldDataValue276.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout1TypeOfExposuresFieldDataValue276.getEndDate();
                                            if(!zeroDBS12_SectionD_Layout1TypeOfExposuresFieldDataValue276.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout1TypeOfExposuresFieldDataValue276.getInstantDate();
                                        }

                                        
                                            Context DBS12_SectionD_Layout1TypeOfExposuresContext274 = DBS12ReportContextUtil.createFromToContextDBS12_SectionD_Layout1( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout1TypeOfExposuresValue275 != null && !"".equals(zeroDBS12_SectionD_Layout1TypeOfExposuresValue275)) {
                                        
                                        addContext(DBS12_SectionD_Layout1TypeOfExposuresContext274, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        TypeOfExposures typeOfExposuresValue278 = new TypeOfExposures();
                                        typeOfExposuresValue278.setContextRef(DBS12_SectionD_Layout1TypeOfExposuresContext274);
                                        
                                            typeOfExposuresValue278.setValue(zeroDBS12_SectionD_Layout1TypeOfExposuresValue275);        
                                        
                                        
                                        JAXBElement<TypeOfExposures> typeOfExposuresElement279 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTypeOfExposures(typeOfExposuresValue278);
                                        bodyElements.add(typeOfExposuresElement279);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR280 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR280 = createUnitIfNotExist(INR280, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExposureAmount
                                
                                    Map zeroDBS12_SectionD_Layout1ExposureAmountMap284 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout1ExposureAmountValue282 = DBS12ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBS12_SectionD_Layout1ExposureAmountMap284);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout1ExposureAmountFieldDataValue283 = DBS12ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), zeroDBS12_SectionD_Layout1ExposureAmountMap284);

                                        if(zeroDBS12_SectionD_Layout1ExposureAmountFieldDataValue283 != null ) {
                                            if(!zeroDBS12_SectionD_Layout1ExposureAmountFieldDataValue283.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout1ExposureAmountFieldDataValue283.getStartDate();
                                            if(!zeroDBS12_SectionD_Layout1ExposureAmountFieldDataValue283.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout1ExposureAmountFieldDataValue283.getEndDate();
                                            if(!zeroDBS12_SectionD_Layout1ExposureAmountFieldDataValue283.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout1ExposureAmountFieldDataValue283.getInstantDate();
                                        }

                                        
                                        Context DBS12_SectionD_Layout1ExposureAmountContext281 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionD_Layout1( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout1ExposureAmountValue282 != null && !"".equals(zeroDBS12_SectionD_Layout1ExposureAmountValue282)) {
                                        
                                        addContext(DBS12_SectionD_Layout1ExposureAmountContext281, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exposureAmountValue285 = new MonetaryItemType();
                                        exposureAmountValue285.setContextRef(DBS12_SectionD_Layout1ExposureAmountContext281);
                                        
                                            exposureAmountValue285.setUnitRef(INR280);
                                            exposureAmountValue285.setDecimals("INF");
                                            exposureAmountValue285.setValue(new BigDecimal(zeroDBS12_SectionD_Layout1ExposureAmountValue282));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exposureAmountElement286 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue285);
                                        bodyElements.add(exposureAmountElement286);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout1
                                // create unit if not empty
                                
                                
                                // - TermOfCreditExposure
                                
                                    Map zeroDBS12_SectionD_Layout1TermOfCreditExposureMap290 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout1TermOfCreditExposureValue288 = DBS12ReportUtil.retrieveValueForElement(field.getTermOfCreditExposure(), zeroDBS12_SectionD_Layout1TermOfCreditExposureMap290);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout1TermOfCreditExposureFieldDataValue289 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTermOfCreditExposure(), zeroDBS12_SectionD_Layout1TermOfCreditExposureMap290);

                                        if(zeroDBS12_SectionD_Layout1TermOfCreditExposureFieldDataValue289 != null ) {
                                            if(!zeroDBS12_SectionD_Layout1TermOfCreditExposureFieldDataValue289.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout1TermOfCreditExposureFieldDataValue289.getStartDate();
                                            if(!zeroDBS12_SectionD_Layout1TermOfCreditExposureFieldDataValue289.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout1TermOfCreditExposureFieldDataValue289.getEndDate();
                                            if(!zeroDBS12_SectionD_Layout1TermOfCreditExposureFieldDataValue289.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout1TermOfCreditExposureFieldDataValue289.getInstantDate();
                                        }

                                        
                                            Context DBS12_SectionD_Layout1TermOfCreditExposureContext287 = DBS12ReportContextUtil.createFromToContextDBS12_SectionD_Layout1( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout1TermOfCreditExposureValue288 != null && !"".equals(zeroDBS12_SectionD_Layout1TermOfCreditExposureValue288)) {
                                        
                                        addContext(DBS12_SectionD_Layout1TermOfCreditExposureContext287, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        StringItemType termOfCreditExposureValue291 = new StringItemType();
                                        termOfCreditExposureValue291.setContextRef(DBS12_SectionD_Layout1TermOfCreditExposureContext287);
                                        
                                            termOfCreditExposureValue291.setValue(zeroDBS12_SectionD_Layout1TermOfCreditExposureValue288);        
                                        
                                        
                                        JAXBElement<StringItemType> termOfCreditExposureElement292 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createTermOfCreditExposure(termOfCreditExposureValue291);
                                        bodyElements.add(termOfCreditExposureElement292);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR293 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR293 = createUnitIfNotExist(INR293, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ValueOfSecuritiesCollateral
                                
                                    Map zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralMap297 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralValue295 = DBS12ReportUtil.retrieveValueForElement(field.getValueOfSecuritiesCollateral(), zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralMap297);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralFieldDataValue296 = DBS12ReportUtil.retrieveFieldDataForElement(field.getValueOfSecuritiesCollateral(), zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralMap297);

                                        if(zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralFieldDataValue296 != null ) {
                                            if(!zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralFieldDataValue296.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralFieldDataValue296.getStartDate();
                                            if(!zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralFieldDataValue296.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralFieldDataValue296.getEndDate();
                                            if(!zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralFieldDataValue296.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralFieldDataValue296.getInstantDate();
                                        }

                                        
                                        Context DBS12_SectionD_Layout1ValueOfSecuritiesCollateralContext294 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionD_Layout1( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralValue295 != null && !"".equals(zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralValue295)) {
                                        
                                        addContext(DBS12_SectionD_Layout1ValueOfSecuritiesCollateralContext294, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType valueOfSecuritiesCollateralValue298 = new MonetaryItemType();
                                        valueOfSecuritiesCollateralValue298.setContextRef(DBS12_SectionD_Layout1ValueOfSecuritiesCollateralContext294);
                                        
                                            valueOfSecuritiesCollateralValue298.setUnitRef(INR293);
                                            valueOfSecuritiesCollateralValue298.setDecimals("INF");
                                            valueOfSecuritiesCollateralValue298.setValue(new BigDecimal(zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralValue295));
                                        
                                        
                                        JAXBElement<MonetaryItemType> valueOfSecuritiesCollateralElement299 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createValueOfSecuritiesCollateral(valueOfSecuritiesCollateralValue298);
                                        bodyElements.add(valueOfSecuritiesCollateralElement299);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout1
                                // create unit if not empty
                                
                                
                                // - AssetClassifications
                                
                                    Map zeroDBS12_SectionD_Layout1AssetClassificationsMap303 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout1AssetClassificationsValue301 = DBS12ReportUtil.retrieveValueForElement(field.getAssetClassifications(), zeroDBS12_SectionD_Layout1AssetClassificationsMap303);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout1AssetClassificationsFieldDataValue302 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAssetClassifications(), zeroDBS12_SectionD_Layout1AssetClassificationsMap303);

                                        if(zeroDBS12_SectionD_Layout1AssetClassificationsFieldDataValue302 != null ) {
                                            if(!zeroDBS12_SectionD_Layout1AssetClassificationsFieldDataValue302.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout1AssetClassificationsFieldDataValue302.getStartDate();
                                            if(!zeroDBS12_SectionD_Layout1AssetClassificationsFieldDataValue302.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout1AssetClassificationsFieldDataValue302.getEndDate();
                                            if(!zeroDBS12_SectionD_Layout1AssetClassificationsFieldDataValue302.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout1AssetClassificationsFieldDataValue302.getInstantDate();
                                        }

                                        
                                            Context DBS12_SectionD_Layout1AssetClassificationsContext300 = DBS12ReportContextUtil.createFromToContextDBS12_SectionD_Layout1( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout1AssetClassificationsValue301 != null && !"".equals(zeroDBS12_SectionD_Layout1AssetClassificationsValue301)) {
                                        
                                        addContext(DBS12_SectionD_Layout1AssetClassificationsContext300, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        AssetClassifications assetClassificationsValue304 = new AssetClassifications();
                                        assetClassificationsValue304.setContextRef(DBS12_SectionD_Layout1AssetClassificationsContext300);
                                        
                                            assetClassificationsValue304.setValue(zeroDBS12_SectionD_Layout1AssetClassificationsValue301);        
                                        
                                        
                                        JAXBElement<AssetClassifications> assetClassificationsElement305 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createAssetClassifications(assetClassificationsValue304);
                                        bodyElements.add(assetClassificationsElement305);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR306 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR306 = createUnitIfNotExist(INR306, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ProvisionForInvestment
                                
                                    Map zeroDBS12_SectionD_Layout1ProvisionForInvestmentMap310 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout1ProvisionForInvestmentValue308 = DBS12ReportUtil.retrieveValueForElement(field.getProvisionForInvestment(), zeroDBS12_SectionD_Layout1ProvisionForInvestmentMap310);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout1ProvisionForInvestmentFieldDataValue309 = DBS12ReportUtil.retrieveFieldDataForElement(field.getProvisionForInvestment(), zeroDBS12_SectionD_Layout1ProvisionForInvestmentMap310);

                                        if(zeroDBS12_SectionD_Layout1ProvisionForInvestmentFieldDataValue309 != null ) {
                                            if(!zeroDBS12_SectionD_Layout1ProvisionForInvestmentFieldDataValue309.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout1ProvisionForInvestmentFieldDataValue309.getStartDate();
                                            if(!zeroDBS12_SectionD_Layout1ProvisionForInvestmentFieldDataValue309.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout1ProvisionForInvestmentFieldDataValue309.getEndDate();
                                            if(!zeroDBS12_SectionD_Layout1ProvisionForInvestmentFieldDataValue309.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout1ProvisionForInvestmentFieldDataValue309.getInstantDate();
                                        }

                                        
                                        Context DBS12_SectionD_Layout1ProvisionForInvestmentContext307 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionD_Layout1( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout1ProvisionForInvestmentValue308 != null && !"".equals(zeroDBS12_SectionD_Layout1ProvisionForInvestmentValue308)) {
                                        
                                        addContext(DBS12_SectionD_Layout1ProvisionForInvestmentContext307, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType provisionForInvestmentValue311 = new MonetaryItemType();
                                        provisionForInvestmentValue311.setContextRef(DBS12_SectionD_Layout1ProvisionForInvestmentContext307);
                                        
                                            provisionForInvestmentValue311.setUnitRef(INR306);
                                            provisionForInvestmentValue311.setDecimals("INF");
                                            provisionForInvestmentValue311.setValue(new BigDecimal(zeroDBS12_SectionD_Layout1ProvisionForInvestmentValue308));
                                        
                                        
                                        JAXBElement<MonetaryItemType> provisionForInvestmentElement312 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createProvisionForInvestment(provisionForInvestmentValue311);
                                        bodyElements.add(provisionForInvestmentElement312);
                                    }
                                
                            
                            
                            
                        
                        
                
                        
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBS12_SectionD_Layout2 if any typeMembers then List or Single
                //List<DBS12_SectionD_Layout2> dBS12_SectionD_Layout2 = mainReportData.getDBS12_SectionD_Layout2();
                
                
                // if typemembers exist
                
                    private String dBS12_SectionD_Layout2Method(List<DBS12_SectionD_Layout2> dBS12_SectionD_Layout2, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                    {
                        
                    dBS12_SectionD_Layout2.forEach((field)->{
                        // create startdate, enddate, and perioddate
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                        // crate variable loop  for type member
                        
                            // create variable for type member UniqueTransactionCodeAxis
                            String uniqueTransactionCodeAxis = field.getUniqueTransactionCodeAxis();
                        
                            // create variable for type member NameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis
                            String nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis = field.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis();
                        
                            // create variable for type member NameOfInterestedDirectorManagerAxis
                            String nameOfInterestedDirectorManagerAxis = field.getNameOfInterestedDirectorManagerAxis();
                        
                        // end create variable loop for type member
                        
                        // if explict member is empty
                        
                            // create xbrl report element
                            
                                // start create element for report of DBS12_SectionD_Layout2
                                // create unit if not empty
                                
                                
                                // - TypeOfEntity
                                
                                    Map zeroDBS12_SectionD_Layout2TypeOfEntityMap316 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout2TypeOfEntityValue314 = DBS12ReportUtil.retrieveValueForElement(field.getTypeOfEntity(), zeroDBS12_SectionD_Layout2TypeOfEntityMap316);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout2TypeOfEntityFieldDataValue315 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTypeOfEntity(), zeroDBS12_SectionD_Layout2TypeOfEntityMap316);

                                        if(zeroDBS12_SectionD_Layout2TypeOfEntityFieldDataValue315 != null ) {
                                            if(!zeroDBS12_SectionD_Layout2TypeOfEntityFieldDataValue315.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout2TypeOfEntityFieldDataValue315.getStartDate();
                                            if(!zeroDBS12_SectionD_Layout2TypeOfEntityFieldDataValue315.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout2TypeOfEntityFieldDataValue315.getEndDate();
                                            if(!zeroDBS12_SectionD_Layout2TypeOfEntityFieldDataValue315.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout2TypeOfEntityFieldDataValue315.getInstantDate();
                                        }

                                        
                                            Context DBS12_SectionD_Layout2TypeOfEntityContext313 = DBS12ReportContextUtil.createFromToContextDBS12_SectionD_Layout2( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis,nameOfInterestedDirectorManagerAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout2TypeOfEntityValue314 != null && !"".equals(zeroDBS12_SectionD_Layout2TypeOfEntityValue314)) {
                                        
                                        addContext(DBS12_SectionD_Layout2TypeOfEntityContext313, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        TypeOfEntity typeOfEntityValue317 = new TypeOfEntity();
                                        typeOfEntityValue317.setContextRef(DBS12_SectionD_Layout2TypeOfEntityContext313);
                                        
                                            typeOfEntityValue317.setValue(zeroDBS12_SectionD_Layout2TypeOfEntityValue314);        
                                        
                                        
                                        JAXBElement<TypeOfEntity> typeOfEntityElement318 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTypeOfEntity(typeOfEntityValue317);
                                        bodyElements.add(typeOfEntityElement318);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout2
                                // create unit if not empty
                                
                                
                                // - TypeOfExposures
                                
                                    Map zeroDBS12_SectionD_Layout2TypeOfExposuresMap322 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout2TypeOfExposuresValue320 = DBS12ReportUtil.retrieveValueForElement(field.getTypeOfExposures(), zeroDBS12_SectionD_Layout2TypeOfExposuresMap322);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout2TypeOfExposuresFieldDataValue321 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTypeOfExposures(), zeroDBS12_SectionD_Layout2TypeOfExposuresMap322);

                                        if(zeroDBS12_SectionD_Layout2TypeOfExposuresFieldDataValue321 != null ) {
                                            if(!zeroDBS12_SectionD_Layout2TypeOfExposuresFieldDataValue321.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout2TypeOfExposuresFieldDataValue321.getStartDate();
                                            if(!zeroDBS12_SectionD_Layout2TypeOfExposuresFieldDataValue321.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout2TypeOfExposuresFieldDataValue321.getEndDate();
                                            if(!zeroDBS12_SectionD_Layout2TypeOfExposuresFieldDataValue321.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout2TypeOfExposuresFieldDataValue321.getInstantDate();
                                        }

                                        
                                            Context DBS12_SectionD_Layout2TypeOfExposuresContext319 = DBS12ReportContextUtil.createFromToContextDBS12_SectionD_Layout2( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis,nameOfInterestedDirectorManagerAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout2TypeOfExposuresValue320 != null && !"".equals(zeroDBS12_SectionD_Layout2TypeOfExposuresValue320)) {
                                        
                                        addContext(DBS12_SectionD_Layout2TypeOfExposuresContext319, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        TypeOfExposures typeOfExposuresValue323 = new TypeOfExposures();
                                        typeOfExposuresValue323.setContextRef(DBS12_SectionD_Layout2TypeOfExposuresContext319);
                                        
                                            typeOfExposuresValue323.setValue(zeroDBS12_SectionD_Layout2TypeOfExposuresValue320);        
                                        
                                        
                                        JAXBElement<TypeOfExposures> typeOfExposuresElement324 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTypeOfExposures(typeOfExposuresValue323);
                                        bodyElements.add(typeOfExposuresElement324);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout2
                                // create unit if not empty
                                
                                    
                                    Unit INR325 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR325 = createUnitIfNotExist(INR325, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExposureAmount
                                
                                    Map zeroDBS12_SectionD_Layout2ExposureAmountMap329 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout2ExposureAmountValue327 = DBS12ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBS12_SectionD_Layout2ExposureAmountMap329);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout2ExposureAmountFieldDataValue328 = DBS12ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), zeroDBS12_SectionD_Layout2ExposureAmountMap329);

                                        if(zeroDBS12_SectionD_Layout2ExposureAmountFieldDataValue328 != null ) {
                                            if(!zeroDBS12_SectionD_Layout2ExposureAmountFieldDataValue328.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout2ExposureAmountFieldDataValue328.getStartDate();
                                            if(!zeroDBS12_SectionD_Layout2ExposureAmountFieldDataValue328.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout2ExposureAmountFieldDataValue328.getEndDate();
                                            if(!zeroDBS12_SectionD_Layout2ExposureAmountFieldDataValue328.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout2ExposureAmountFieldDataValue328.getInstantDate();
                                        }

                                        
                                        Context DBS12_SectionD_Layout2ExposureAmountContext326 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionD_Layout2( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis,nameOfInterestedDirectorManagerAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout2ExposureAmountValue327 != null && !"".equals(zeroDBS12_SectionD_Layout2ExposureAmountValue327)) {
                                        
                                        addContext(DBS12_SectionD_Layout2ExposureAmountContext326, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exposureAmountValue330 = new MonetaryItemType();
                                        exposureAmountValue330.setContextRef(DBS12_SectionD_Layout2ExposureAmountContext326);
                                        
                                            exposureAmountValue330.setUnitRef(INR325);
                                            exposureAmountValue330.setDecimals("INF");
                                            exposureAmountValue330.setValue(new BigDecimal(zeroDBS12_SectionD_Layout2ExposureAmountValue327));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exposureAmountElement331 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue330);
                                        bodyElements.add(exposureAmountElement331);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout2
                                // create unit if not empty
                                
                                
                                // - TermOfCreditExposure
                                
                                    Map zeroDBS12_SectionD_Layout2TermOfCreditExposureMap335 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout2TermOfCreditExposureValue333 = DBS12ReportUtil.retrieveValueForElement(field.getTermOfCreditExposure(), zeroDBS12_SectionD_Layout2TermOfCreditExposureMap335);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout2TermOfCreditExposureFieldDataValue334 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTermOfCreditExposure(), zeroDBS12_SectionD_Layout2TermOfCreditExposureMap335);

                                        if(zeroDBS12_SectionD_Layout2TermOfCreditExposureFieldDataValue334 != null ) {
                                            if(!zeroDBS12_SectionD_Layout2TermOfCreditExposureFieldDataValue334.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout2TermOfCreditExposureFieldDataValue334.getStartDate();
                                            if(!zeroDBS12_SectionD_Layout2TermOfCreditExposureFieldDataValue334.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout2TermOfCreditExposureFieldDataValue334.getEndDate();
                                            if(!zeroDBS12_SectionD_Layout2TermOfCreditExposureFieldDataValue334.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout2TermOfCreditExposureFieldDataValue334.getInstantDate();
                                        }

                                        
                                            Context DBS12_SectionD_Layout2TermOfCreditExposureContext332 = DBS12ReportContextUtil.createFromToContextDBS12_SectionD_Layout2( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis,nameOfInterestedDirectorManagerAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout2TermOfCreditExposureValue333 != null && !"".equals(zeroDBS12_SectionD_Layout2TermOfCreditExposureValue333)) {
                                        
                                        addContext(DBS12_SectionD_Layout2TermOfCreditExposureContext332, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        StringItemType termOfCreditExposureValue336 = new StringItemType();
                                        termOfCreditExposureValue336.setContextRef(DBS12_SectionD_Layout2TermOfCreditExposureContext332);
                                        
                                            termOfCreditExposureValue336.setValue(zeroDBS12_SectionD_Layout2TermOfCreditExposureValue333);        
                                        
                                        
                                        JAXBElement<StringItemType> termOfCreditExposureElement337 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createTermOfCreditExposure(termOfCreditExposureValue336);
                                        bodyElements.add(termOfCreditExposureElement337);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout2
                                // create unit if not empty
                                
                                    
                                    Unit INR338 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR338 = createUnitIfNotExist(INR338, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ValueOfSecuritiesCollateral
                                
                                    Map zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralMap342 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralValue340 = DBS12ReportUtil.retrieveValueForElement(field.getValueOfSecuritiesCollateral(), zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralMap342);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralFieldDataValue341 = DBS12ReportUtil.retrieveFieldDataForElement(field.getValueOfSecuritiesCollateral(), zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralMap342);

                                        if(zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralFieldDataValue341 != null ) {
                                            if(!zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralFieldDataValue341.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralFieldDataValue341.getStartDate();
                                            if(!zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralFieldDataValue341.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralFieldDataValue341.getEndDate();
                                            if(!zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralFieldDataValue341.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralFieldDataValue341.getInstantDate();
                                        }

                                        
                                        Context DBS12_SectionD_Layout2ValueOfSecuritiesCollateralContext339 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionD_Layout2( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis,nameOfInterestedDirectorManagerAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralValue340 != null && !"".equals(zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralValue340)) {
                                        
                                        addContext(DBS12_SectionD_Layout2ValueOfSecuritiesCollateralContext339, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType valueOfSecuritiesCollateralValue343 = new MonetaryItemType();
                                        valueOfSecuritiesCollateralValue343.setContextRef(DBS12_SectionD_Layout2ValueOfSecuritiesCollateralContext339);
                                        
                                            valueOfSecuritiesCollateralValue343.setUnitRef(INR338);
                                            valueOfSecuritiesCollateralValue343.setDecimals("INF");
                                            valueOfSecuritiesCollateralValue343.setValue(new BigDecimal(zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralValue340));
                                        
                                        
                                        JAXBElement<MonetaryItemType> valueOfSecuritiesCollateralElement344 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createValueOfSecuritiesCollateral(valueOfSecuritiesCollateralValue343);
                                        bodyElements.add(valueOfSecuritiesCollateralElement344);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout2
                                // create unit if not empty
                                
                                
                                // - AssetClassifications
                                
                                    Map zeroDBS12_SectionD_Layout2AssetClassificationsMap348 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout2AssetClassificationsValue346 = DBS12ReportUtil.retrieveValueForElement(field.getAssetClassifications(), zeroDBS12_SectionD_Layout2AssetClassificationsMap348);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout2AssetClassificationsFieldDataValue347 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAssetClassifications(), zeroDBS12_SectionD_Layout2AssetClassificationsMap348);

                                        if(zeroDBS12_SectionD_Layout2AssetClassificationsFieldDataValue347 != null ) {
                                            if(!zeroDBS12_SectionD_Layout2AssetClassificationsFieldDataValue347.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout2AssetClassificationsFieldDataValue347.getStartDate();
                                            if(!zeroDBS12_SectionD_Layout2AssetClassificationsFieldDataValue347.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout2AssetClassificationsFieldDataValue347.getEndDate();
                                            if(!zeroDBS12_SectionD_Layout2AssetClassificationsFieldDataValue347.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout2AssetClassificationsFieldDataValue347.getInstantDate();
                                        }

                                        
                                            Context DBS12_SectionD_Layout2AssetClassificationsContext345 = DBS12ReportContextUtil.createFromToContextDBS12_SectionD_Layout2( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis,nameOfInterestedDirectorManagerAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout2AssetClassificationsValue346 != null && !"".equals(zeroDBS12_SectionD_Layout2AssetClassificationsValue346)) {
                                        
                                        addContext(DBS12_SectionD_Layout2AssetClassificationsContext345, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        AssetClassifications assetClassificationsValue349 = new AssetClassifications();
                                        assetClassificationsValue349.setContextRef(DBS12_SectionD_Layout2AssetClassificationsContext345);
                                        
                                            assetClassificationsValue349.setValue(zeroDBS12_SectionD_Layout2AssetClassificationsValue346);        
                                        
                                        
                                        JAXBElement<AssetClassifications> assetClassificationsElement350 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createAssetClassifications(assetClassificationsValue349);
                                        bodyElements.add(assetClassificationsElement350);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout2
                                // create unit if not empty
                                
                                    
                                    Unit INR351 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR351 = createUnitIfNotExist(INR351, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ProvisionForInvestment
                                
                                    Map zeroDBS12_SectionD_Layout2ProvisionForInvestmentMap355 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout2ProvisionForInvestmentValue353 = DBS12ReportUtil.retrieveValueForElement(field.getProvisionForInvestment(), zeroDBS12_SectionD_Layout2ProvisionForInvestmentMap355);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout2ProvisionForInvestmentFieldDataValue354 = DBS12ReportUtil.retrieveFieldDataForElement(field.getProvisionForInvestment(), zeroDBS12_SectionD_Layout2ProvisionForInvestmentMap355);

                                        if(zeroDBS12_SectionD_Layout2ProvisionForInvestmentFieldDataValue354 != null ) {
                                            if(!zeroDBS12_SectionD_Layout2ProvisionForInvestmentFieldDataValue354.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout2ProvisionForInvestmentFieldDataValue354.getStartDate();
                                            if(!zeroDBS12_SectionD_Layout2ProvisionForInvestmentFieldDataValue354.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout2ProvisionForInvestmentFieldDataValue354.getEndDate();
                                            if(!zeroDBS12_SectionD_Layout2ProvisionForInvestmentFieldDataValue354.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout2ProvisionForInvestmentFieldDataValue354.getInstantDate();
                                        }

                                        
                                        Context DBS12_SectionD_Layout2ProvisionForInvestmentContext352 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionD_Layout2( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis,nameOfInterestedDirectorManagerAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout2ProvisionForInvestmentValue353 != null && !"".equals(zeroDBS12_SectionD_Layout2ProvisionForInvestmentValue353)) {
                                        
                                        addContext(DBS12_SectionD_Layout2ProvisionForInvestmentContext352, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType provisionForInvestmentValue356 = new MonetaryItemType();
                                        provisionForInvestmentValue356.setContextRef(DBS12_SectionD_Layout2ProvisionForInvestmentContext352);
                                        
                                            provisionForInvestmentValue356.setUnitRef(INR351);
                                            provisionForInvestmentValue356.setDecimals("INF");
                                            provisionForInvestmentValue356.setValue(new BigDecimal(zeroDBS12_SectionD_Layout2ProvisionForInvestmentValue353));
                                        
                                        
                                        JAXBElement<MonetaryItemType> provisionForInvestmentElement357 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createProvisionForInvestment(provisionForInvestmentValue356);
                                        bodyElements.add(provisionForInvestmentElement357);
                                    }
                                
                            
                            
                            
                        
                        
                
                        
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBSAuthorisedSignatory_Layout1 if any typeMembers then List or Single
                //DBSAuthorisedSignatory_Layout1 dBSAuthorisedSignatory_Layout1 = mainReportData.getDBSAuthorisedSignatory_Layout1();
                
                    private String dBSAuthorisedSignatory_Layout1Method(DBSAuthorisedSignatory_Layout1 dBSAuthorisedSignatory_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                
                    {
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                    DBSAuthorisedSignatory_Layout1 field = dBSAuthorisedSignatory_Layout1;
                    
                    
                        
                        
                            
                            // - NameOfSignatory
                            
                                Map zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryMap361 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryValue359 = DBS12ReportUtil.retrieveValueForElement(field.getNameOfSignatory(), zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryMap361);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue360 = DBS12ReportUtil.retrieveFieldDataForElement(field.getNameOfSignatory(), zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryMap361);
    
                                    if(zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue360 != null ) {
                                        if(!zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue360.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue360.getStartDate();
                                        if(!zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue360.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue360.getEndDate();
                                        if(!zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue360.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue360.getInstantDate();
                                    }

                                    
                                        Context DBSAuthorisedSignatory_Layout1NameOfSignatoryContext358 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryValue359 != null && !"".equals(zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryValue359)) {
                                    
                                    addContext(DBSAuthorisedSignatory_Layout1NameOfSignatoryContext358, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType nameOfSignatoryValue362 = new StringItemType();
                                    nameOfSignatoryValue362.setContextRef(DBSAuthorisedSignatory_Layout1NameOfSignatoryContext358);
                                    
                                    nameOfSignatoryValue362.setValue(zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryValue359);        
                                    
                                    
                                    JAXBElement<StringItemType> nameOfSignatoryElement363 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNameOfSignatory(nameOfSignatoryValue362);
                                    bodyElements.add(nameOfSignatoryElement363);
                                
                            }
                        
                            
                            // - DesignationOfSignatory
                            
                                Map zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryMap367 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryValue365 = DBS12ReportUtil.retrieveValueForElement(field.getDesignationOfSignatory(), zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryMap367);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue366 = DBS12ReportUtil.retrieveFieldDataForElement(field.getDesignationOfSignatory(), zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryMap367);
    
                                    if(zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue366 != null ) {
                                        if(!zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue366.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue366.getStartDate();
                                        if(!zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue366.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue366.getEndDate();
                                        if(!zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue366.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue366.getInstantDate();
                                    }

                                    
                                        Context DBSAuthorisedSignatory_Layout1DesignationOfSignatoryContext364 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryValue365 != null && !"".equals(zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryValue365)) {
                                    
                                    addContext(DBSAuthorisedSignatory_Layout1DesignationOfSignatoryContext364, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType designationOfSignatoryValue368 = new StringItemType();
                                    designationOfSignatoryValue368.setContextRef(DBSAuthorisedSignatory_Layout1DesignationOfSignatoryContext364);
                                    
                                    designationOfSignatoryValue368.setValue(zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryValue365);        
                                    
                                    
                                    JAXBElement<StringItemType> designationOfSignatoryElement369 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createDesignationOfSignatory(designationOfSignatoryValue368);
                                    bodyElements.add(designationOfSignatoryElement369);
                                
                            }
                        
                            
                            // - AuthorisedSignatoryOfficialLandlineNumber
                            
                                Map zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberMap373 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue371 = DBS12ReportUtil.retrieveValueForElement(field.getAuthorisedSignatoryOfficialLandlineNumber(), zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberMap373);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue372 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAuthorisedSignatoryOfficialLandlineNumber(), zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberMap373);
    
                                    if(zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue372 != null ) {
                                        if(!zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue372.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue372.getStartDate();
                                        if(!zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue372.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue372.getEndDate();
                                        if(!zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue372.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue372.getInstantDate();
                                    }

                                    
                                        Context DBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext370 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue371 != null && !"".equals(zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue371)) {
                                    
                                    addContext(DBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext370, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType authorisedSignatoryOfficialLandlineNumberValue374 = new StringItemType();
                                    authorisedSignatoryOfficialLandlineNumberValue374.setContextRef(DBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext370);
                                    
                                    authorisedSignatoryOfficialLandlineNumberValue374.setValue(zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue371);        
                                    
                                    
                                    JAXBElement<StringItemType> authorisedSignatoryOfficialLandlineNumberElement375 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createAuthorisedSignatoryOfficialLandlineNumber(authorisedSignatoryOfficialLandlineNumberValue374);
                                    bodyElements.add(authorisedSignatoryOfficialLandlineNumberElement375);
                                
                            }
                        
                            
                            // - MobileNumberOfAuthorisedSignatory
                            
                                Map zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryMap379 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue377 = DBS12ReportUtil.retrieveValueForElement(field.getMobileNumberOfAuthorisedSignatory(), zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryMap379);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue378 = DBS12ReportUtil.retrieveFieldDataForElement(field.getMobileNumberOfAuthorisedSignatory(), zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryMap379);
    
                                    if(zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue378 != null ) {
                                        if(!zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue378.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue378.getStartDate();
                                        if(!zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue378.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue378.getEndDate();
                                        if(!zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue378.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue378.getInstantDate();
                                    }

                                    
                                        Context DBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext376 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue377 != null && !"".equals(zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue377)) {
                                    
                                    addContext(DBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext376, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType mobileNumberOfAuthorisedSignatoryValue380 = new StringItemType();
                                    mobileNumberOfAuthorisedSignatoryValue380.setContextRef(DBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext376);
                                    
                                    mobileNumberOfAuthorisedSignatoryValue380.setValue(zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue377);        
                                    
                                    
                                    JAXBElement<StringItemType> mobileNumberOfAuthorisedSignatoryElement381 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createMobileNumberOfAuthorisedSignatory(mobileNumberOfAuthorisedSignatoryValue380);
                                    bodyElements.add(mobileNumberOfAuthorisedSignatoryElement381);
                                
                            }
                        
                            
                            // - EMailIDOfAuthorisedReportingOfficial
                            
                                Map zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialMap385 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue383 = DBS12ReportUtil.retrieveValueForElement(field.getEMailIDOfAuthorisedReportingOfficial(), zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialMap385);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue384 = DBS12ReportUtil.retrieveFieldDataForElement(field.getEMailIDOfAuthorisedReportingOfficial(), zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialMap385);
    
                                    if(zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue384 != null ) {
                                        if(!zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue384.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue384.getStartDate();
                                        if(!zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue384.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue384.getEndDate();
                                        if(!zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue384.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue384.getInstantDate();
                                    }

                                    
                                        Context DBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext382 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue383 != null && !"".equals(zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue383)) {
                                    
                                    addContext(DBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext382, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType eMailIDOfAuthorisedReportingOfficialValue386 = new StringItemType();
                                    eMailIDOfAuthorisedReportingOfficialValue386.setContextRef(DBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext382);
                                    
                                    eMailIDOfAuthorisedReportingOfficialValue386.setValue(zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue383);        
                                    
                                    
                                    JAXBElement<StringItemType> eMailIDOfAuthorisedReportingOfficialElement387 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createEMailIDOfAuthorisedReportingOfficial(eMailIDOfAuthorisedReportingOfficialValue386);
                                    bodyElements.add(eMailIDOfAuthorisedReportingOfficialElement387);
                                
                            }
                        
                            
                            // - Remarks
                            
                                Map zeroDBSAuthorisedSignatory_Layout1RemarksMap391 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBSAuthorisedSignatory_Layout1RemarksValue389 = DBS12ReportUtil.retrieveValueForElement(field.getRemarks(), zeroDBSAuthorisedSignatory_Layout1RemarksMap391);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSAuthorisedSignatory_Layout1RemarksFieldDataValue390 = DBS12ReportUtil.retrieveFieldDataForElement(field.getRemarks(), zeroDBSAuthorisedSignatory_Layout1RemarksMap391);
    
                                    if(zeroDBSAuthorisedSignatory_Layout1RemarksFieldDataValue390 != null ) {
                                        if(!zeroDBSAuthorisedSignatory_Layout1RemarksFieldDataValue390.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSAuthorisedSignatory_Layout1RemarksFieldDataValue390.getStartDate();
                                        if(!zeroDBSAuthorisedSignatory_Layout1RemarksFieldDataValue390.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSAuthorisedSignatory_Layout1RemarksFieldDataValue390.getEndDate();
                                        if(!zeroDBSAuthorisedSignatory_Layout1RemarksFieldDataValue390.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSAuthorisedSignatory_Layout1RemarksFieldDataValue390.getInstantDate();
                                    }

                                    
                                        Context DBSAuthorisedSignatory_Layout1RemarksContext388 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBSAuthorisedSignatory_Layout1RemarksValue389 != null && !"".equals(zeroDBSAuthorisedSignatory_Layout1RemarksValue389)) {
                                    
                                    addContext(DBSAuthorisedSignatory_Layout1RemarksContext388, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType remarksValue392 = new StringItemType();
                                    remarksValue392.setContextRef(DBSAuthorisedSignatory_Layout1RemarksContext388);
                                    
                                    remarksValue392.setValue(zeroDBSAuthorisedSignatory_Layout1RemarksValue389);        
                                    
                                    
                                    JAXBElement<StringItemType> remarksElement393 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createRemarks(remarksValue392);
                                    bodyElements.add(remarksElement393);
                                
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
    
    

