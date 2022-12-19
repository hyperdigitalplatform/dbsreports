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
                                    FieldDataValue zeroFilingInfo_Layout1ReturnNameFieldDataValue3 = DBS12ReportUtil.retrieveFieldDataForElement(field.getReturnName(), zeroFilingInfo_Layout1ReturnNameMap4, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ReturnNameFieldDataValue3 != null ) {
                                        if(!zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getInstantDateValue();
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
                                    FieldDataValue zeroFilingInfo_Layout1ReturnCodeFieldDataValue9 = DBS12ReportUtil.retrieveFieldDataForElement(field.getReturnCode(), zeroFilingInfo_Layout1ReturnCodeMap10, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ReturnCodeFieldDataValue9 != null ) {
                                        if(!zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getInstantDateValue();
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
                                    FieldDataValue zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15 = DBS12ReportUtil.retrieveFieldDataForElement(field.getNameOfReportingInstitution(), zeroFilingInfo_Layout1NameOfReportingInstitutionMap16, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15 != null ) {
                                        if(!zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getInstantDateValue();
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
                                    FieldDataValue zeroFilingInfo_Layout1BankCodeFieldDataValue21 = DBS12ReportUtil.retrieveFieldDataForElement(field.getBankCode(), zeroFilingInfo_Layout1BankCodeMap22, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroFilingInfo_Layout1BankCodeFieldDataValue21 != null ) {
                                        if(!zeroFilingInfo_Layout1BankCodeFieldDataValue21.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1BankCodeFieldDataValue21.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1BankCodeFieldDataValue21.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1BankCodeFieldDataValue21.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1BankCodeFieldDataValue21.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1BankCodeFieldDataValue21.getInstantDateValue();
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
                                    FieldDataValue zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27 = DBS12ReportUtil.retrieveFieldDataForElement(field.getInstitutionType(), zeroFilingInfo_Layout1InstitutionTypeMap28, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27 != null ) {
                                        if(!zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getInstantDateValue();
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
                                    FieldDataValue zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33 = DBS12ReportUtil.retrieveFieldDataForElement(field.getReportingFrequency(), zeroFilingInfo_Layout1ReportingFrequencyMap34, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getInstantDateValue();
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
                                    FieldDataValue zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39 = DBS12ReportUtil.retrieveFieldDataForElement(field.getReportingPeriodStartDate(), zeroFilingInfo_Layout1ReportingPeriodStartDateMap40, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getInstantDateValue();
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
                                    FieldDataValue zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45 = DBS12ReportUtil.retrieveFieldDataForElement(field.getReportingPeriodEndDate(), zeroFilingInfo_Layout1ReportingPeriodEndDateMap46, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getInstantDateValue();
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
                                    FieldDataValue zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51 = DBS12ReportUtil.retrieveFieldDataForElement(field.getReportingCurrency(), zeroFilingInfo_Layout1ReportingCurrencyMap52, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getInstantDateValue();
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
                                    FieldDataValue zeroFilingInfo_Layout1ReportingScaleFieldDataValue57 = DBS12ReportUtil.retrieveFieldDataForElement(field.getReportingScale(), zeroFilingInfo_Layout1ReportingScaleMap58, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ReportingScaleFieldDataValue57 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getInstantDateValue();
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
                                    FieldDataValue zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTaxonomyVersion(), zeroFilingInfo_Layout1TaxonomyVersionMap64, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63 != null ) {
                                        if(!zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getInstantDateValue();
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
                                    FieldDataValue zeroFilingInfo_Layout1ToolNameFieldDataValue69 = DBS12ReportUtil.retrieveFieldDataForElement(field.getToolName(), zeroFilingInfo_Layout1ToolNameMap70, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ToolNameFieldDataValue69 != null ) {
                                        if(!zeroFilingInfo_Layout1ToolNameFieldDataValue69.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ToolNameFieldDataValue69.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ToolNameFieldDataValue69.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ToolNameFieldDataValue69.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ToolNameFieldDataValue69.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ToolNameFieldDataValue69.getInstantDateValue();
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
                                    FieldDataValue zeroFilingInfo_Layout1ToolVersionFieldDataValue75 = DBS12ReportUtil.retrieveFieldDataForElement(field.getToolVersion(), zeroFilingInfo_Layout1ToolVersionMap76, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ToolVersionFieldDataValue75 != null ) {
                                        if(!zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getInstantDateValue();
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
                                    FieldDataValue zeroFilingInfo_Layout1ReportStatusFieldDataValue81 = DBS12ReportUtil.retrieveFieldDataForElement(field.getReportStatus(), zeroFilingInfo_Layout1ReportStatusMap82, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ReportStatusFieldDataValue81 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getInstantDateValue();
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
                                    FieldDataValue zeroFilingInfo_Layout1DateOfAuditFieldDataValue87 = DBS12ReportUtil.retrieveFieldDataForElement(field.getDateOfAudit(), zeroFilingInfo_Layout1DateOfAuditMap88, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroFilingInfo_Layout1DateOfAuditFieldDataValue87 != null ) {
                                        if(!zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getInstantDateValue();
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
                                    FieldDataValue zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93 = DBS12ReportUtil.retrieveFieldDataForElement(field.getGeneralRemarks(), zeroFilingInfo_Layout1GeneralRemarksMap94, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93 != null ) {
                                        if(!zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getInstantDateValue();
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
                                    FieldDataValue zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankFieldDataValue99 = DBS12ReportUtil.retrieveFieldDataForElement(field.getWhetherBankSubmittingTheReturnIsForeignBank(), zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankMap100, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankFieldDataValue99 != null ) {
                                        if(!zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankFieldDataValue99.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankFieldDataValue99.getStartDateValue();
                                        if(!zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankFieldDataValue99.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankFieldDataValue99.getEndDateValue();
                                        if(!zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankFieldDataValue99.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankFieldDataValue99.getInstantDateValue();
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
                        
                        
                
                        
                        
                            
                                
                                
                                
                                //rbi-core:GeographicalLocationAxis - TypeOfEntity
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisMap104 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisMap104.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:DomesticMember");                
                                    
                                    String explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberValue105 = DBS12ReportUtil.retrieveValueForElement(field.getTypeOfEntity(), explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisMap104);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberFieldDataValue106 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTypeOfEntity(), explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisMap104, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberFieldDataValue106 != null ) {
                                        if(!explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberFieldDataValue106.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberFieldDataValue106.getStartDateValue();
                                        if(!explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberFieldDataValue106.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberFieldDataValue106.getEndDateValue();
                                        if(!explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberFieldDataValue106.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberFieldDataValue106.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberValue105 != null && !"".equals(explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberValue105)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisContext103 = DBS12ReportContextUtil.createFromToContextWithMembersDBS12_SectionA_Layout1( bankCode, startDate, endDate, nameOfEntityAxis,  explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisMap104 );
                                        
                                        addContext(explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisContext103, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        TypeOfEntity explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberDataType108 = new TypeOfEntity();
                                        explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberDataType108.setContextRef(explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisContext103);
                                        
                                        
                                            explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberDataType108.setValue(explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberValue105);
                                        
                                        
                                        JAXBElement<TypeOfEntity> explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberElement107 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTypeOfEntity(explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberDataType108);
                                        bodyElements.add(explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberElement107);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:GeographicalLocationAxis - FinancialClassification
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisMap110 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisMap110.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:DomesticMember");                
                                    
                                    String explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberValue111 = DBS12ReportUtil.retrieveValueForElement(field.getFinancialClassification(), explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisMap110);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberFieldDataValue112 = DBS12ReportUtil.retrieveFieldDataForElement(field.getFinancialClassification(), explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisMap110, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberFieldDataValue112 != null ) {
                                        if(!explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberFieldDataValue112.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberFieldDataValue112.getStartDateValue();
                                        if(!explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberFieldDataValue112.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberFieldDataValue112.getEndDateValue();
                                        if(!explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberFieldDataValue112.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberFieldDataValue112.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberValue111 != null && !"".equals(explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberValue111)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisContext109 = DBS12ReportContextUtil.createFromToContextWithMembersDBS12_SectionA_Layout1( bankCode, startDate, endDate, nameOfEntityAxis,  explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisMap110 );
                                        
                                        addContext(explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisContext109, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        FinancialClassification explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberDataType114 = new FinancialClassification();
                                        explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberDataType114.setContextRef(explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisContext109);
                                        
                                        
                                            explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberDataType114.setValue(explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberValue111);
                                        
                                        
                                        JAXBElement<FinancialClassification> explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberElement113 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createFinancialClassification(explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberDataType114);
                                        bodyElements.add(explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberElement113);
                                    
                                    }
                                    
                                

                                
                            
                            
                            
                        
                            
                                
                                
                                
                                //rbi-core:GeographicalLocationAxis - TypeOfEntity
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisMap116 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisMap116.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:OverseasMember");                
                                    
                                    String explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberValue117 = DBS12ReportUtil.retrieveValueForElement(field.getTypeOfEntity(), explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisMap116);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberFieldDataValue118 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTypeOfEntity(), explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisMap116, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberFieldDataValue118 != null ) {
                                        if(!explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberFieldDataValue118.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberFieldDataValue118.getStartDateValue();
                                        if(!explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberFieldDataValue118.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberFieldDataValue118.getEndDateValue();
                                        if(!explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberFieldDataValue118.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberFieldDataValue118.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberValue117 != null && !"".equals(explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberValue117)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisContext115 = DBS12ReportContextUtil.createFromToContextWithMembersDBS12_SectionA_Layout1( bankCode, startDate, endDate, nameOfEntityAxis,  explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisMap116 );
                                        
                                        addContext(explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisContext115, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        TypeOfEntity explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberDataType120 = new TypeOfEntity();
                                        explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberDataType120.setContextRef(explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisContext115);
                                        
                                        
                                            explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberDataType120.setValue(explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberValue117);
                                        
                                        
                                        JAXBElement<TypeOfEntity> explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberElement119 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTypeOfEntity(explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberDataType120);
                                        bodyElements.add(explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberElement119);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:GeographicalLocationAxis - FinancialClassification
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisMap122 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisMap122.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:OverseasMember");                
                                    
                                    String explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberValue123 = DBS12ReportUtil.retrieveValueForElement(field.getFinancialClassification(), explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisMap122);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberFieldDataValue124 = DBS12ReportUtil.retrieveFieldDataForElement(field.getFinancialClassification(), explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisMap122, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberFieldDataValue124 != null ) {
                                        if(!explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberFieldDataValue124.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberFieldDataValue124.getStartDateValue();
                                        if(!explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberFieldDataValue124.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberFieldDataValue124.getEndDateValue();
                                        if(!explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberFieldDataValue124.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberFieldDataValue124.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberValue123 != null && !"".equals(explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberValue123)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisContext121 = DBS12ReportContextUtil.createFromToContextWithMembersDBS12_SectionA_Layout1( bankCode, startDate, endDate, nameOfEntityAxis,  explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisMap122 );
                                        
                                        addContext(explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisContext121, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        FinancialClassification explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberDataType126 = new FinancialClassification();
                                        explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberDataType126.setContextRef(explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisContext121);
                                        
                                        
                                            explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberDataType126.setValue(explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberValue123);
                                        
                                        
                                        JAXBElement<FinancialClassification> explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberElement125 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createFinancialClassification(explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberDataType126);
                                        bodyElements.add(explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberElement125);
                                    
                                    }
                                    
                                

                                
                            
                            
                            
                        
                            
                                
                                
                                
                                //rbi-core:GeographicalLocationAxis - TypeOfEntity
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisMap128 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisMap128.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:NotApplicableMember");                
                                    
                                    String explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberValue129 = DBS12ReportUtil.retrieveValueForElement(field.getTypeOfEntity(), explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisMap128);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberFieldDataValue130 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTypeOfEntity(), explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisMap128, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberFieldDataValue130 != null ) {
                                        if(!explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberFieldDataValue130.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberFieldDataValue130.getStartDateValue();
                                        if(!explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberFieldDataValue130.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberFieldDataValue130.getEndDateValue();
                                        if(!explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberFieldDataValue130.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberFieldDataValue130.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberValue129 != null && !"".equals(explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberValue129)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisContext127 = DBS12ReportContextUtil.createFromToContextWithMembersDBS12_SectionA_Layout1( bankCode, startDate, endDate, nameOfEntityAxis,  explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisMap128 );
                                        
                                        addContext(explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisContext127, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        TypeOfEntity explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberDataType132 = new TypeOfEntity();
                                        explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberDataType132.setContextRef(explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisContext127);
                                        
                                        
                                            explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberDataType132.setValue(explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberValue129);
                                        
                                        
                                        JAXBElement<TypeOfEntity> explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberElement131 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTypeOfEntity(explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberDataType132);
                                        bodyElements.add(explictMember1DBS12_SectionA_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberElement131);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:GeographicalLocationAxis - FinancialClassification
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisMap134 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisMap134.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:NotApplicableMember");                
                                    
                                    String explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberValue135 = DBS12ReportUtil.retrieveValueForElement(field.getFinancialClassification(), explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisMap134);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberFieldDataValue136 = DBS12ReportUtil.retrieveFieldDataForElement(field.getFinancialClassification(), explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisMap134, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberFieldDataValue136 != null ) {
                                        if(!explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberFieldDataValue136.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberFieldDataValue136.getStartDateValue();
                                        if(!explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberFieldDataValue136.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberFieldDataValue136.getEndDateValue();
                                        if(!explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberFieldDataValue136.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberFieldDataValue136.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberValue135 != null && !"".equals(explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberValue135)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisContext133 = DBS12ReportContextUtil.createFromToContextWithMembersDBS12_SectionA_Layout1( bankCode, startDate, endDate, nameOfEntityAxis,  explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisMap134 );
                                        
                                        addContext(explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisContext133, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        FinancialClassification explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberDataType138 = new FinancialClassification();
                                        explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberDataType138.setContextRef(explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisContext133);
                                        
                                        
                                            explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberDataType138.setValue(explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberValue135);
                                        
                                        
                                        JAXBElement<FinancialClassification> explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberElement137 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createFinancialClassification(explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberDataType138);
                                        bodyElements.add(explictMember1DBS12_SectionA_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberElement137);
                                    
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
                        
                        
                
                        
                        
                            
                                
                                
                                
                                //rbi-core:GeographicalLocationAxis - TypeOfEntity
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisMap140 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisMap140.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:DomesticMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberValue141 = DBS12ReportUtil.retrieveValueForElement(field.getTypeOfEntity(), explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisMap140);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberFieldDataValue142 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTypeOfEntity(), explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisMap140, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberFieldDataValue142 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberFieldDataValue142.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberFieldDataValue142.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberFieldDataValue142.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberFieldDataValue142.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberFieldDataValue142.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberFieldDataValue142.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberValue141 != null && !"".equals(explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberValue141)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisContext139 = DBS12ReportContextUtil.createFromToContextWithMembersDBS12_SectionB_Layout1( bankCode, startDate, endDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisMap140 );
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisContext139, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        TypeOfEntity explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberDataType144 = new TypeOfEntity();
                                        explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberDataType144.setContextRef(explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisContext139);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberDataType144.setValue(explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberValue141);
                                        
                                        
                                        JAXBElement<TypeOfEntity> explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberElement143 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTypeOfEntity(explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberDataType144);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisDomesticMemberElement143);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:GeographicalLocationAxis - FinancialClassification
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisMap146 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisMap146.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:DomesticMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberValue147 = DBS12ReportUtil.retrieveValueForElement(field.getFinancialClassification(), explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisMap146);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberFieldDataValue148 = DBS12ReportUtil.retrieveFieldDataForElement(field.getFinancialClassification(), explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisMap146, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberFieldDataValue148 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberFieldDataValue148.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberFieldDataValue148.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberFieldDataValue148.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberFieldDataValue148.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberFieldDataValue148.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberFieldDataValue148.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberValue147 != null && !"".equals(explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberValue147)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisContext145 = DBS12ReportContextUtil.createFromToContextWithMembersDBS12_SectionB_Layout1( bankCode, startDate, endDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisMap146 );
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisContext145, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        FinancialClassification explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberDataType150 = new FinancialClassification();
                                        explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberDataType150.setContextRef(explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisContext145);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberDataType150.setValue(explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberValue147);
                                        
                                        
                                        JAXBElement<FinancialClassification> explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberElement149 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createFinancialClassification(explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberDataType150);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisDomesticMemberElement149);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR151 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR151 = createUnitIfNotExist(INR151, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - BanksEquityInvestmentInTheCompany
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisMap153 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisMap153.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:DomesticMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisDomesticMemberValue154 = DBS12ReportUtil.retrieveValueForElement(field.getBanksEquityInvestmentInTheCompany(), explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisMap153);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisDomesticMemberFieldDataValue155 = DBS12ReportUtil.retrieveFieldDataForElement(field.getBanksEquityInvestmentInTheCompany(), explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisMap153, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisDomesticMemberFieldDataValue155 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisDomesticMemberFieldDataValue155.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisDomesticMemberFieldDataValue155.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisDomesticMemberFieldDataValue155.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisDomesticMemberFieldDataValue155.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisDomesticMemberFieldDataValue155.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisDomesticMemberFieldDataValue155.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisDomesticMemberValue154 != null && !"".equals(explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisDomesticMemberValue154)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisContext152 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisMap153 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisContext152, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisDomesticMemberDataType157 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisDomesticMemberDataType157.setContextRef(explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisContext152);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisDomesticMemberDataType157.setUnitRef(INR151);
                                            explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisDomesticMemberDataType157.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisDomesticMemberDataType157.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisDomesticMemberValue154));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisDomesticMemberElement156 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createBanksEquityInvestmentInTheCompany(explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisDomesticMemberDataType157);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisDomesticMemberElement156);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure158 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure158 = createUnitIfNotExist(pure158, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - BanksPercentageInvestmentInCompanyEquity
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisMap160 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisMap160.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:DomesticMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisDomesticMemberValue161 = DBS12ReportUtil.retrieveValueForElement(field.getBanksPercentageInvestmentInCompanyEquity(), explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisMap160);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisDomesticMemberFieldDataValue162 = DBS12ReportUtil.retrieveFieldDataForElement(field.getBanksPercentageInvestmentInCompanyEquity(), explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisMap160, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisDomesticMemberFieldDataValue162 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisDomesticMemberFieldDataValue162.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisDomesticMemberFieldDataValue162.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisDomesticMemberFieldDataValue162.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisDomesticMemberFieldDataValue162.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisDomesticMemberFieldDataValue162.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisDomesticMemberFieldDataValue162.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisDomesticMemberValue161 != null && !"".equals(explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisDomesticMemberValue161)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisContext159 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisMap160 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisContext159, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        PureItemType explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisDomesticMemberDataType164 = new PureItemType();
                                        explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisDomesticMemberDataType164.setContextRef(explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisContext159);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisDomesticMemberDataType164.setUnitRef(pure158);
                                            explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisDomesticMemberDataType164.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisDomesticMemberDataType164.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisDomesticMemberValue161));
                                        
                                        
                                        JAXBElement<PureItemType> explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisDomesticMemberElement163 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createBanksPercentageInvestmentInCompanyEquity(explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisDomesticMemberDataType164);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisDomesticMemberElement163);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR165 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR165 = createUnitIfNotExist(INR165, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - AggregateAmountOutstandingForFundedExposure
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisMap167 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisMap167.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:DomesticMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisDomesticMemberValue168 = DBS12ReportUtil.retrieveValueForElement(field.getAggregateAmountOutstandingForFundedExposure(), explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisMap167);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisDomesticMemberFieldDataValue169 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAggregateAmountOutstandingForFundedExposure(), explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisMap167, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisDomesticMemberFieldDataValue169 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisDomesticMemberFieldDataValue169.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisDomesticMemberFieldDataValue169.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisDomesticMemberFieldDataValue169.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisDomesticMemberFieldDataValue169.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisDomesticMemberFieldDataValue169.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisDomesticMemberFieldDataValue169.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisDomesticMemberValue168 != null && !"".equals(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisDomesticMemberValue168)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisContext166 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisMap167 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisContext166, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisDomesticMemberDataType171 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisDomesticMemberDataType171.setContextRef(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisContext166);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisDomesticMemberDataType171.setUnitRef(INR165);
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisDomesticMemberDataType171.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisDomesticMemberDataType171.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisDomesticMemberValue168));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisDomesticMemberElement170 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAggregateAmountOutstandingForFundedExposure(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisDomesticMemberDataType171);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisDomesticMemberElement170);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR172 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR172 = createUnitIfNotExist(INR172, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - FundedCreditExposure
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisMap174 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisMap174.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:DomesticMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisDomesticMemberValue175 = DBS12ReportUtil.retrieveValueForElement(field.getFundedCreditExposure(), explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisMap174);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisDomesticMemberFieldDataValue176 = DBS12ReportUtil.retrieveFieldDataForElement(field.getFundedCreditExposure(), explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisMap174, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisDomesticMemberFieldDataValue176 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisDomesticMemberFieldDataValue176.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisDomesticMemberFieldDataValue176.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisDomesticMemberFieldDataValue176.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisDomesticMemberFieldDataValue176.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisDomesticMemberFieldDataValue176.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisDomesticMemberFieldDataValue176.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisDomesticMemberValue175 != null && !"".equals(explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisDomesticMemberValue175)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisContext173 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisMap174 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisContext173, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisDomesticMemberDataType178 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisDomesticMemberDataType178.setContextRef(explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisContext173);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisDomesticMemberDataType178.setUnitRef(INR172);
                                            explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisDomesticMemberDataType178.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisDomesticMemberDataType178.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisDomesticMemberValue175));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisDomesticMemberElement177 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createFundedCreditExposure(explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisDomesticMemberDataType178);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisDomesticMemberElement177);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR179 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR179 = createUnitIfNotExist(INR179, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - AggregateAmountOutstandingForNonFundedExposure
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisMap181 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisMap181.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:DomesticMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisDomesticMemberValue182 = DBS12ReportUtil.retrieveValueForElement(field.getAggregateAmountOutstandingForNonFundedExposure(), explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisMap181);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisDomesticMemberFieldDataValue183 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAggregateAmountOutstandingForNonFundedExposure(), explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisMap181, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisDomesticMemberFieldDataValue183 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisDomesticMemberFieldDataValue183.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisDomesticMemberFieldDataValue183.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisDomesticMemberFieldDataValue183.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisDomesticMemberFieldDataValue183.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisDomesticMemberFieldDataValue183.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisDomesticMemberFieldDataValue183.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisDomesticMemberValue182 != null && !"".equals(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisDomesticMemberValue182)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisContext180 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisMap181 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisContext180, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisDomesticMemberDataType185 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisDomesticMemberDataType185.setContextRef(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisContext180);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisDomesticMemberDataType185.setUnitRef(INR179);
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisDomesticMemberDataType185.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisDomesticMemberDataType185.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisDomesticMemberValue182));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisDomesticMemberElement184 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAggregateAmountOutstandingForNonFundedExposure(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisDomesticMemberDataType185);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisDomesticMemberElement184);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR186 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR186 = createUnitIfNotExist(INR186, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - NonFundedCreditExposure
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisMap188 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisMap188.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:DomesticMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisDomesticMemberValue189 = DBS12ReportUtil.retrieveValueForElement(field.getNonFundedCreditExposure(), explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisMap188);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisDomesticMemberFieldDataValue190 = DBS12ReportUtil.retrieveFieldDataForElement(field.getNonFundedCreditExposure(), explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisMap188, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisDomesticMemberFieldDataValue190 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisDomesticMemberFieldDataValue190.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisDomesticMemberFieldDataValue190.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisDomesticMemberFieldDataValue190.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisDomesticMemberFieldDataValue190.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisDomesticMemberFieldDataValue190.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisDomesticMemberFieldDataValue190.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisDomesticMemberValue189 != null && !"".equals(explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisDomesticMemberValue189)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisContext187 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisMap188 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisContext187, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisDomesticMemberDataType192 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisDomesticMemberDataType192.setContextRef(explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisContext187);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisDomesticMemberDataType192.setUnitRef(INR186);
                                            explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisDomesticMemberDataType192.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisDomesticMemberDataType192.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisDomesticMemberValue189));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisDomesticMemberElement191 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNonFundedCreditExposure(explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisDomesticMemberDataType192);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisDomesticMemberElement191);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR193 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR193 = createUnitIfNotExist(INR193, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - AggregateInvestmentExposure
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisMap195 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisMap195.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:DomesticMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisDomesticMemberValue196 = DBS12ReportUtil.retrieveValueForElement(field.getAggregateInvestmentExposure(), explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisMap195);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisDomesticMemberFieldDataValue197 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAggregateInvestmentExposure(), explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisMap195, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisDomesticMemberFieldDataValue197 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisDomesticMemberFieldDataValue197.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisDomesticMemberFieldDataValue197.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisDomesticMemberFieldDataValue197.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisDomesticMemberFieldDataValue197.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisDomesticMemberFieldDataValue197.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisDomesticMemberFieldDataValue197.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisDomesticMemberValue196 != null && !"".equals(explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisDomesticMemberValue196)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisContext194 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisMap195 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisContext194, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisDomesticMemberDataType199 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisDomesticMemberDataType199.setContextRef(explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisContext194);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisDomesticMemberDataType199.setUnitRef(INR193);
                                            explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisDomesticMemberDataType199.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisDomesticMemberDataType199.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisDomesticMemberValue196));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisDomesticMemberElement198 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAggregateInvestmentExposure(explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisDomesticMemberDataType199);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisDomesticMemberElement198);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR200 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR200 = createUnitIfNotExist(INR200, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - ExemptedExposure
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisMap202 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisMap202.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:DomesticMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisDomesticMemberValue203 = DBS12ReportUtil.retrieveValueForElement(field.getExemptedExposure(), explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisMap202);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisDomesticMemberFieldDataValue204 = DBS12ReportUtil.retrieveFieldDataForElement(field.getExemptedExposure(), explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisMap202, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisDomesticMemberFieldDataValue204 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisDomesticMemberFieldDataValue204.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisDomesticMemberFieldDataValue204.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisDomesticMemberFieldDataValue204.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisDomesticMemberFieldDataValue204.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisDomesticMemberFieldDataValue204.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisDomesticMemberFieldDataValue204.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisDomesticMemberValue203 != null && !"".equals(explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisDomesticMemberValue203)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisContext201 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisMap202 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisContext201, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisDomesticMemberDataType206 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisDomesticMemberDataType206.setContextRef(explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisContext201);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisDomesticMemberDataType206.setUnitRef(INR200);
                                            explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisDomesticMemberDataType206.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisDomesticMemberDataType206.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisDomesticMemberValue203));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisDomesticMemberElement205 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createExemptedExposure(explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisDomesticMemberDataType206);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisDomesticMemberElement205);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR207 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR207 = createUnitIfNotExist(INR207, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - AggregateAmountOutstanding
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisMap209 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisMap209.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:DomesticMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisDomesticMemberValue210 = DBS12ReportUtil.retrieveValueForElement(field.getAggregateAmountOutstanding(), explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisMap209);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisDomesticMemberFieldDataValue211 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAggregateAmountOutstanding(), explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisMap209, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisDomesticMemberFieldDataValue211 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisDomesticMemberFieldDataValue211.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisDomesticMemberFieldDataValue211.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisDomesticMemberFieldDataValue211.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisDomesticMemberFieldDataValue211.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisDomesticMemberFieldDataValue211.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisDomesticMemberFieldDataValue211.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisDomesticMemberValue210 != null && !"".equals(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisDomesticMemberValue210)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisContext208 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisMap209 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisContext208, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisDomesticMemberDataType213 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisDomesticMemberDataType213.setContextRef(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisContext208);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisDomesticMemberDataType213.setUnitRef(INR207);
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisDomesticMemberDataType213.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisDomesticMemberDataType213.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisDomesticMemberValue210));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisDomesticMemberElement212 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAggregateAmountOutstanding(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisDomesticMemberDataType213);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisDomesticMemberElement212);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR214 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR214 = createUnitIfNotExist(INR214, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - AggregateExposure
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisMap216 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisMap216.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:DomesticMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisDomesticMemberValue217 = DBS12ReportUtil.retrieveValueForElement(field.getAggregateExposure(), explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisMap216);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisDomesticMemberFieldDataValue218 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAggregateExposure(), explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisMap216, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisDomesticMemberFieldDataValue218 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisDomesticMemberFieldDataValue218.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisDomesticMemberFieldDataValue218.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisDomesticMemberFieldDataValue218.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisDomesticMemberFieldDataValue218.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisDomesticMemberFieldDataValue218.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisDomesticMemberFieldDataValue218.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisDomesticMemberValue217 != null && !"".equals(explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisDomesticMemberValue217)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisContext215 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisMap216 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisContext215, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisDomesticMemberDataType220 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisDomesticMemberDataType220.setContextRef(explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisContext215);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisDomesticMemberDataType220.setUnitRef(INR214);
                                            explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisDomesticMemberDataType220.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisDomesticMemberDataType220.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisDomesticMemberValue217));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisDomesticMemberElement219 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAggregateExposure(explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisDomesticMemberDataType220);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisDomesticMemberElement219);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:GeographicalLocationAxis - AssetClassifications
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisMap222 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisMap222.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:DomesticMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisDomesticMemberValue223 = DBS12ReportUtil.retrieveValueForElement(field.getAssetClassifications(), explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisMap222);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisDomesticMemberFieldDataValue224 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAssetClassifications(), explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisMap222, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisDomesticMemberFieldDataValue224 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisDomesticMemberFieldDataValue224.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisDomesticMemberFieldDataValue224.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisDomesticMemberFieldDataValue224.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisDomesticMemberFieldDataValue224.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisDomesticMemberFieldDataValue224.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisDomesticMemberFieldDataValue224.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisDomesticMemberValue223 != null && !"".equals(explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisDomesticMemberValue223)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisContext221 = DBS12ReportContextUtil.createFromToContextWithMembersDBS12_SectionB_Layout1( bankCode, startDate, endDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisMap222 );
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisContext221, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        AssetClassifications explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisDomesticMemberDataType226 = new AssetClassifications();
                                        explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisDomesticMemberDataType226.setContextRef(explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisContext221);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisDomesticMemberDataType226.setValue(explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisDomesticMemberValue223);
                                        
                                        
                                        JAXBElement<AssetClassifications> explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisDomesticMemberElement225 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createAssetClassifications(explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisDomesticMemberDataType226);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisDomesticMemberElement225);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR227 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR227 = createUnitIfNotExist(INR227, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - AmountOfAggregateProvisionsHeldForNPAs
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisMap229 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisMap229.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:DomesticMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisDomesticMemberValue230 = DBS12ReportUtil.retrieveValueForElement(field.getAmountOfAggregateProvisionsHeldForNPAs(), explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisMap229);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisDomesticMemberFieldDataValue231 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAmountOfAggregateProvisionsHeldForNPAs(), explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisMap229, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisDomesticMemberFieldDataValue231 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisDomesticMemberFieldDataValue231.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisDomesticMemberFieldDataValue231.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisDomesticMemberFieldDataValue231.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisDomesticMemberFieldDataValue231.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisDomesticMemberFieldDataValue231.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisDomesticMemberFieldDataValue231.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisDomesticMemberValue230 != null && !"".equals(explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisDomesticMemberValue230)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisContext228 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisMap229 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisContext228, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisDomesticMemberDataType233 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisDomesticMemberDataType233.setContextRef(explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisContext228);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisDomesticMemberDataType233.setUnitRef(INR227);
                                            explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisDomesticMemberDataType233.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisDomesticMemberDataType233.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisDomesticMemberValue230));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisDomesticMemberElement232 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAmountOfAggregateProvisionsHeldForNPAs(explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisDomesticMemberDataType233);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisDomesticMemberElement232);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR234 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR234 = createUnitIfNotExist(INR234, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstanding
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisMap236 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisMap236.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:DomesticMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisDomesticMemberValue237 = DBS12ReportUtil.retrieveValueForElement(field.getAmountOfUnsecuredAmountOutstandingOfTotalAmountOutstanding(), explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisMap236);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisDomesticMemberFieldDataValue238 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAmountOfUnsecuredAmountOutstandingOfTotalAmountOutstanding(), explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisMap236, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisDomesticMemberFieldDataValue238 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisDomesticMemberFieldDataValue238.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisDomesticMemberFieldDataValue238.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisDomesticMemberFieldDataValue238.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisDomesticMemberFieldDataValue238.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisDomesticMemberFieldDataValue238.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisDomesticMemberFieldDataValue238.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisDomesticMemberValue237 != null && !"".equals(explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisDomesticMemberValue237)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisContext235 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisMap236 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisContext235, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisDomesticMemberDataType240 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisDomesticMemberDataType240.setContextRef(explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisContext235);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisDomesticMemberDataType240.setUnitRef(INR234);
                                            explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisDomesticMemberDataType240.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisDomesticMemberDataType240.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisDomesticMemberValue237));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisDomesticMemberElement239 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAmountOfUnsecuredAmountOutstandingOfTotalAmountOutstanding(explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisDomesticMemberDataType240);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisDomesticMemberElement239);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:GeographicalLocationAxis - ReasonsForBreachOfStipulatedPrudentialLimits
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisMap242 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisMap242.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:DomesticMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisDomesticMemberValue243 = DBS12ReportUtil.retrieveValueForElement(field.getReasonsForBreachOfStipulatedPrudentialLimits(), explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisMap242);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisDomesticMemberFieldDataValue244 = DBS12ReportUtil.retrieveFieldDataForElement(field.getReasonsForBreachOfStipulatedPrudentialLimits(), explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisMap242, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisDomesticMemberFieldDataValue244 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisDomesticMemberFieldDataValue244.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisDomesticMemberFieldDataValue244.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisDomesticMemberFieldDataValue244.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisDomesticMemberFieldDataValue244.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisDomesticMemberFieldDataValue244.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisDomesticMemberFieldDataValue244.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisDomesticMemberValue243 != null && !"".equals(explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisDomesticMemberValue243)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisContext241 = DBS12ReportContextUtil.createFromToContextWithMembersDBS12_SectionB_Layout1( bankCode, startDate, endDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisMap242 );
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisContext241, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        StringItemType explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisDomesticMemberDataType246 = new StringItemType();
                                        explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisDomesticMemberDataType246.setContextRef(explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisContext241);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisDomesticMemberDataType246.setValue(explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisDomesticMemberValue243);
                                        
                                        
                                        JAXBElement<StringItemType> explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisDomesticMemberElement245 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createReasonsForBreachOfStipulatedPrudentialLimits(explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisDomesticMemberDataType246);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisDomesticMemberElement245);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:GeographicalLocationAxis - DescriptionOfIntraGroupSupportArrangementsOrAgreements
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisMap248 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisMap248.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:DomesticMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisDomesticMemberValue249 = DBS12ReportUtil.retrieveValueForElement(field.getDescriptionOfIntraGroupSupportArrangementsOrAgreements(), explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisMap248);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisDomesticMemberFieldDataValue250 = DBS12ReportUtil.retrieveFieldDataForElement(field.getDescriptionOfIntraGroupSupportArrangementsOrAgreements(), explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisMap248, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisDomesticMemberFieldDataValue250 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisDomesticMemberFieldDataValue250.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisDomesticMemberFieldDataValue250.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisDomesticMemberFieldDataValue250.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisDomesticMemberFieldDataValue250.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisDomesticMemberFieldDataValue250.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisDomesticMemberFieldDataValue250.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisDomesticMemberValue249 != null && !"".equals(explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisDomesticMemberValue249)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisContext247 = DBS12ReportContextUtil.createFromToContextWithMembersDBS12_SectionB_Layout1( bankCode, startDate, endDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisMap248 );
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisContext247, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        StringItemType explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisDomesticMemberDataType252 = new StringItemType();
                                        explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisDomesticMemberDataType252.setContextRef(explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisContext247);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisDomesticMemberDataType252.setValue(explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisDomesticMemberValue249);
                                        
                                        
                                        JAXBElement<StringItemType> explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisDomesticMemberElement251 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createDescriptionOfIntraGroupSupportArrangementsOrAgreements(explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisDomesticMemberDataType252);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisDomesticMemberElement251);
                                    
                                    }
                                    
                                

                                
                            
                            
                            
                        
                            
                                
                                
                                
                                //rbi-core:GeographicalLocationAxis - TypeOfEntity
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisMap254 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisMap254.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:OverseasMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberValue255 = DBS12ReportUtil.retrieveValueForElement(field.getTypeOfEntity(), explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisMap254);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberFieldDataValue256 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTypeOfEntity(), explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisMap254, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberFieldDataValue256 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberFieldDataValue256.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberFieldDataValue256.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberFieldDataValue256.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberFieldDataValue256.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberFieldDataValue256.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberFieldDataValue256.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberValue255 != null && !"".equals(explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberValue255)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisContext253 = DBS12ReportContextUtil.createFromToContextWithMembersDBS12_SectionB_Layout1( bankCode, startDate, endDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisMap254 );
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisContext253, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        TypeOfEntity explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberDataType258 = new TypeOfEntity();
                                        explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberDataType258.setContextRef(explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisContext253);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberDataType258.setValue(explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberValue255);
                                        
                                        
                                        JAXBElement<TypeOfEntity> explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberElement257 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTypeOfEntity(explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberDataType258);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisOverseasMemberElement257);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:GeographicalLocationAxis - FinancialClassification
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisMap260 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisMap260.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:OverseasMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberValue261 = DBS12ReportUtil.retrieveValueForElement(field.getFinancialClassification(), explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisMap260);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberFieldDataValue262 = DBS12ReportUtil.retrieveFieldDataForElement(field.getFinancialClassification(), explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisMap260, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberFieldDataValue262 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberFieldDataValue262.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberFieldDataValue262.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberFieldDataValue262.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberFieldDataValue262.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberFieldDataValue262.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberFieldDataValue262.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberValue261 != null && !"".equals(explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberValue261)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisContext259 = DBS12ReportContextUtil.createFromToContextWithMembersDBS12_SectionB_Layout1( bankCode, startDate, endDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisMap260 );
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisContext259, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        FinancialClassification explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberDataType264 = new FinancialClassification();
                                        explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberDataType264.setContextRef(explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisContext259);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberDataType264.setValue(explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberValue261);
                                        
                                        
                                        JAXBElement<FinancialClassification> explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberElement263 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createFinancialClassification(explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberDataType264);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisOverseasMemberElement263);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR265 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR265 = createUnitIfNotExist(INR265, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - BanksEquityInvestmentInTheCompany
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisMap267 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisMap267.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:OverseasMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisOverseasMemberValue268 = DBS12ReportUtil.retrieveValueForElement(field.getBanksEquityInvestmentInTheCompany(), explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisMap267);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisOverseasMemberFieldDataValue269 = DBS12ReportUtil.retrieveFieldDataForElement(field.getBanksEquityInvestmentInTheCompany(), explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisMap267, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisOverseasMemberFieldDataValue269 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisOverseasMemberFieldDataValue269.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisOverseasMemberFieldDataValue269.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisOverseasMemberFieldDataValue269.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisOverseasMemberFieldDataValue269.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisOverseasMemberFieldDataValue269.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisOverseasMemberFieldDataValue269.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisOverseasMemberValue268 != null && !"".equals(explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisOverseasMemberValue268)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisContext266 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisMap267 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisContext266, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisOverseasMemberDataType271 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisOverseasMemberDataType271.setContextRef(explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisContext266);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisOverseasMemberDataType271.setUnitRef(INR265);
                                            explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisOverseasMemberDataType271.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisOverseasMemberDataType271.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisOverseasMemberValue268));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisOverseasMemberElement270 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createBanksEquityInvestmentInTheCompany(explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisOverseasMemberDataType271);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisOverseasMemberElement270);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure272 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure272 = createUnitIfNotExist(pure272, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - BanksPercentageInvestmentInCompanyEquity
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisMap274 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisMap274.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:OverseasMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisOverseasMemberValue275 = DBS12ReportUtil.retrieveValueForElement(field.getBanksPercentageInvestmentInCompanyEquity(), explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisMap274);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisOverseasMemberFieldDataValue276 = DBS12ReportUtil.retrieveFieldDataForElement(field.getBanksPercentageInvestmentInCompanyEquity(), explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisMap274, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisOverseasMemberFieldDataValue276 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisOverseasMemberFieldDataValue276.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisOverseasMemberFieldDataValue276.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisOverseasMemberFieldDataValue276.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisOverseasMemberFieldDataValue276.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisOverseasMemberFieldDataValue276.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisOverseasMemberFieldDataValue276.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisOverseasMemberValue275 != null && !"".equals(explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisOverseasMemberValue275)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisContext273 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisMap274 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisContext273, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        PureItemType explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisOverseasMemberDataType278 = new PureItemType();
                                        explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisOverseasMemberDataType278.setContextRef(explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisContext273);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisOverseasMemberDataType278.setUnitRef(pure272);
                                            explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisOverseasMemberDataType278.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisOverseasMemberDataType278.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisOverseasMemberValue275));
                                        
                                        
                                        JAXBElement<PureItemType> explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisOverseasMemberElement277 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createBanksPercentageInvestmentInCompanyEquity(explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisOverseasMemberDataType278);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisOverseasMemberElement277);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR279 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR279 = createUnitIfNotExist(INR279, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - AggregateAmountOutstandingForFundedExposure
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisMap281 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisMap281.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:OverseasMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisOverseasMemberValue282 = DBS12ReportUtil.retrieveValueForElement(field.getAggregateAmountOutstandingForFundedExposure(), explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisMap281);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisOverseasMemberFieldDataValue283 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAggregateAmountOutstandingForFundedExposure(), explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisMap281, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisOverseasMemberFieldDataValue283 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisOverseasMemberFieldDataValue283.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisOverseasMemberFieldDataValue283.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisOverseasMemberFieldDataValue283.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisOverseasMemberFieldDataValue283.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisOverseasMemberFieldDataValue283.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisOverseasMemberFieldDataValue283.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisOverseasMemberValue282 != null && !"".equals(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisOverseasMemberValue282)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisContext280 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisMap281 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisContext280, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisOverseasMemberDataType285 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisOverseasMemberDataType285.setContextRef(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisContext280);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisOverseasMemberDataType285.setUnitRef(INR279);
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisOverseasMemberDataType285.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisOverseasMemberDataType285.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisOverseasMemberValue282));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisOverseasMemberElement284 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAggregateAmountOutstandingForFundedExposure(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisOverseasMemberDataType285);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisOverseasMemberElement284);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR286 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR286 = createUnitIfNotExist(INR286, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - FundedCreditExposure
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisMap288 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisMap288.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:OverseasMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisOverseasMemberValue289 = DBS12ReportUtil.retrieveValueForElement(field.getFundedCreditExposure(), explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisMap288);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisOverseasMemberFieldDataValue290 = DBS12ReportUtil.retrieveFieldDataForElement(field.getFundedCreditExposure(), explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisMap288, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisOverseasMemberFieldDataValue290 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisOverseasMemberFieldDataValue290.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisOverseasMemberFieldDataValue290.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisOverseasMemberFieldDataValue290.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisOverseasMemberFieldDataValue290.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisOverseasMemberFieldDataValue290.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisOverseasMemberFieldDataValue290.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisOverseasMemberValue289 != null && !"".equals(explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisOverseasMemberValue289)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisContext287 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisMap288 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisContext287, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisOverseasMemberDataType292 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisOverseasMemberDataType292.setContextRef(explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisContext287);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisOverseasMemberDataType292.setUnitRef(INR286);
                                            explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisOverseasMemberDataType292.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisOverseasMemberDataType292.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisOverseasMemberValue289));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisOverseasMemberElement291 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createFundedCreditExposure(explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisOverseasMemberDataType292);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisOverseasMemberElement291);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR293 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR293 = createUnitIfNotExist(INR293, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - AggregateAmountOutstandingForNonFundedExposure
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisMap295 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisMap295.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:OverseasMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisOverseasMemberValue296 = DBS12ReportUtil.retrieveValueForElement(field.getAggregateAmountOutstandingForNonFundedExposure(), explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisMap295);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisOverseasMemberFieldDataValue297 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAggregateAmountOutstandingForNonFundedExposure(), explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisMap295, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisOverseasMemberFieldDataValue297 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisOverseasMemberFieldDataValue297.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisOverseasMemberFieldDataValue297.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisOverseasMemberFieldDataValue297.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisOverseasMemberFieldDataValue297.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisOverseasMemberFieldDataValue297.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisOverseasMemberFieldDataValue297.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisOverseasMemberValue296 != null && !"".equals(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisOverseasMemberValue296)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisContext294 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisMap295 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisContext294, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisOverseasMemberDataType299 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisOverseasMemberDataType299.setContextRef(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisContext294);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisOverseasMemberDataType299.setUnitRef(INR293);
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisOverseasMemberDataType299.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisOverseasMemberDataType299.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisOverseasMemberValue296));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisOverseasMemberElement298 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAggregateAmountOutstandingForNonFundedExposure(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisOverseasMemberDataType299);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisOverseasMemberElement298);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR300 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR300 = createUnitIfNotExist(INR300, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - NonFundedCreditExposure
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisMap302 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisMap302.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:OverseasMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisOverseasMemberValue303 = DBS12ReportUtil.retrieveValueForElement(field.getNonFundedCreditExposure(), explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisMap302);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisOverseasMemberFieldDataValue304 = DBS12ReportUtil.retrieveFieldDataForElement(field.getNonFundedCreditExposure(), explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisMap302, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisOverseasMemberFieldDataValue304 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisOverseasMemberFieldDataValue304.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisOverseasMemberFieldDataValue304.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisOverseasMemberFieldDataValue304.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisOverseasMemberFieldDataValue304.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisOverseasMemberFieldDataValue304.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisOverseasMemberFieldDataValue304.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisOverseasMemberValue303 != null && !"".equals(explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisOverseasMemberValue303)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisContext301 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisMap302 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisContext301, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisOverseasMemberDataType306 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisOverseasMemberDataType306.setContextRef(explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisContext301);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisOverseasMemberDataType306.setUnitRef(INR300);
                                            explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisOverseasMemberDataType306.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisOverseasMemberDataType306.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisOverseasMemberValue303));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisOverseasMemberElement305 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNonFundedCreditExposure(explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisOverseasMemberDataType306);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisOverseasMemberElement305);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR307 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR307 = createUnitIfNotExist(INR307, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - AggregateInvestmentExposure
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisMap309 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisMap309.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:OverseasMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisOverseasMemberValue310 = DBS12ReportUtil.retrieveValueForElement(field.getAggregateInvestmentExposure(), explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisMap309);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisOverseasMemberFieldDataValue311 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAggregateInvestmentExposure(), explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisMap309, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisOverseasMemberFieldDataValue311 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisOverseasMemberFieldDataValue311.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisOverseasMemberFieldDataValue311.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisOverseasMemberFieldDataValue311.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisOverseasMemberFieldDataValue311.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisOverseasMemberFieldDataValue311.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisOverseasMemberFieldDataValue311.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisOverseasMemberValue310 != null && !"".equals(explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisOverseasMemberValue310)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisContext308 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisMap309 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisContext308, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisOverseasMemberDataType313 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisOverseasMemberDataType313.setContextRef(explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisContext308);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisOverseasMemberDataType313.setUnitRef(INR307);
                                            explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisOverseasMemberDataType313.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisOverseasMemberDataType313.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisOverseasMemberValue310));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisOverseasMemberElement312 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAggregateInvestmentExposure(explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisOverseasMemberDataType313);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisOverseasMemberElement312);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR314 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR314 = createUnitIfNotExist(INR314, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - ExemptedExposure
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisMap316 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisMap316.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:OverseasMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisOverseasMemberValue317 = DBS12ReportUtil.retrieveValueForElement(field.getExemptedExposure(), explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisMap316);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisOverseasMemberFieldDataValue318 = DBS12ReportUtil.retrieveFieldDataForElement(field.getExemptedExposure(), explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisMap316, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisOverseasMemberFieldDataValue318 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisOverseasMemberFieldDataValue318.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisOverseasMemberFieldDataValue318.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisOverseasMemberFieldDataValue318.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisOverseasMemberFieldDataValue318.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisOverseasMemberFieldDataValue318.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisOverseasMemberFieldDataValue318.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisOverseasMemberValue317 != null && !"".equals(explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisOverseasMemberValue317)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisContext315 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisMap316 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisContext315, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisOverseasMemberDataType320 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisOverseasMemberDataType320.setContextRef(explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisContext315);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisOverseasMemberDataType320.setUnitRef(INR314);
                                            explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisOverseasMemberDataType320.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisOverseasMemberDataType320.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisOverseasMemberValue317));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisOverseasMemberElement319 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createExemptedExposure(explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisOverseasMemberDataType320);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisOverseasMemberElement319);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR321 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR321 = createUnitIfNotExist(INR321, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - AggregateAmountOutstanding
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisMap323 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisMap323.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:OverseasMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisOverseasMemberValue324 = DBS12ReportUtil.retrieveValueForElement(field.getAggregateAmountOutstanding(), explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisMap323);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisOverseasMemberFieldDataValue325 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAggregateAmountOutstanding(), explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisMap323, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisOverseasMemberFieldDataValue325 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisOverseasMemberFieldDataValue325.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisOverseasMemberFieldDataValue325.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisOverseasMemberFieldDataValue325.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisOverseasMemberFieldDataValue325.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisOverseasMemberFieldDataValue325.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisOverseasMemberFieldDataValue325.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisOverseasMemberValue324 != null && !"".equals(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisOverseasMemberValue324)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisContext322 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisMap323 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisContext322, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisOverseasMemberDataType327 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisOverseasMemberDataType327.setContextRef(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisContext322);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisOverseasMemberDataType327.setUnitRef(INR321);
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisOverseasMemberDataType327.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisOverseasMemberDataType327.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisOverseasMemberValue324));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisOverseasMemberElement326 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAggregateAmountOutstanding(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisOverseasMemberDataType327);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisOverseasMemberElement326);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR328 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR328 = createUnitIfNotExist(INR328, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - AggregateExposure
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisMap330 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisMap330.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:OverseasMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisOverseasMemberValue331 = DBS12ReportUtil.retrieveValueForElement(field.getAggregateExposure(), explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisMap330);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisOverseasMemberFieldDataValue332 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAggregateExposure(), explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisMap330, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisOverseasMemberFieldDataValue332 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisOverseasMemberFieldDataValue332.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisOverseasMemberFieldDataValue332.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisOverseasMemberFieldDataValue332.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisOverseasMemberFieldDataValue332.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisOverseasMemberFieldDataValue332.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisOverseasMemberFieldDataValue332.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisOverseasMemberValue331 != null && !"".equals(explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisOverseasMemberValue331)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisContext329 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisMap330 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisContext329, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisOverseasMemberDataType334 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisOverseasMemberDataType334.setContextRef(explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisContext329);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisOverseasMemberDataType334.setUnitRef(INR328);
                                            explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisOverseasMemberDataType334.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisOverseasMemberDataType334.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisOverseasMemberValue331));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisOverseasMemberElement333 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAggregateExposure(explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisOverseasMemberDataType334);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisOverseasMemberElement333);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:GeographicalLocationAxis - AssetClassifications
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisMap336 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisMap336.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:OverseasMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisOverseasMemberValue337 = DBS12ReportUtil.retrieveValueForElement(field.getAssetClassifications(), explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisMap336);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisOverseasMemberFieldDataValue338 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAssetClassifications(), explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisMap336, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisOverseasMemberFieldDataValue338 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisOverseasMemberFieldDataValue338.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisOverseasMemberFieldDataValue338.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisOverseasMemberFieldDataValue338.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisOverseasMemberFieldDataValue338.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisOverseasMemberFieldDataValue338.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisOverseasMemberFieldDataValue338.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisOverseasMemberValue337 != null && !"".equals(explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisOverseasMemberValue337)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisContext335 = DBS12ReportContextUtil.createFromToContextWithMembersDBS12_SectionB_Layout1( bankCode, startDate, endDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisMap336 );
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisContext335, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        AssetClassifications explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisOverseasMemberDataType340 = new AssetClassifications();
                                        explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisOverseasMemberDataType340.setContextRef(explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisContext335);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisOverseasMemberDataType340.setValue(explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisOverseasMemberValue337);
                                        
                                        
                                        JAXBElement<AssetClassifications> explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisOverseasMemberElement339 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createAssetClassifications(explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisOverseasMemberDataType340);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisOverseasMemberElement339);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR341 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR341 = createUnitIfNotExist(INR341, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - AmountOfAggregateProvisionsHeldForNPAs
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisMap343 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisMap343.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:OverseasMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisOverseasMemberValue344 = DBS12ReportUtil.retrieveValueForElement(field.getAmountOfAggregateProvisionsHeldForNPAs(), explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisMap343);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisOverseasMemberFieldDataValue345 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAmountOfAggregateProvisionsHeldForNPAs(), explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisMap343, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisOverseasMemberFieldDataValue345 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisOverseasMemberFieldDataValue345.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisOverseasMemberFieldDataValue345.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisOverseasMemberFieldDataValue345.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisOverseasMemberFieldDataValue345.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisOverseasMemberFieldDataValue345.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisOverseasMemberFieldDataValue345.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisOverseasMemberValue344 != null && !"".equals(explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisOverseasMemberValue344)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisContext342 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisMap343 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisContext342, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisOverseasMemberDataType347 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisOverseasMemberDataType347.setContextRef(explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisContext342);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisOverseasMemberDataType347.setUnitRef(INR341);
                                            explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisOverseasMemberDataType347.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisOverseasMemberDataType347.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisOverseasMemberValue344));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisOverseasMemberElement346 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAmountOfAggregateProvisionsHeldForNPAs(explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisOverseasMemberDataType347);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisOverseasMemberElement346);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR348 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR348 = createUnitIfNotExist(INR348, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstanding
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisMap350 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisMap350.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:OverseasMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisOverseasMemberValue351 = DBS12ReportUtil.retrieveValueForElement(field.getAmountOfUnsecuredAmountOutstandingOfTotalAmountOutstanding(), explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisMap350);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisOverseasMemberFieldDataValue352 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAmountOfUnsecuredAmountOutstandingOfTotalAmountOutstanding(), explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisMap350, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisOverseasMemberFieldDataValue352 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisOverseasMemberFieldDataValue352.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisOverseasMemberFieldDataValue352.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisOverseasMemberFieldDataValue352.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisOverseasMemberFieldDataValue352.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisOverseasMemberFieldDataValue352.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisOverseasMemberFieldDataValue352.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisOverseasMemberValue351 != null && !"".equals(explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisOverseasMemberValue351)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisContext349 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisMap350 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisContext349, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisOverseasMemberDataType354 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisOverseasMemberDataType354.setContextRef(explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisContext349);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisOverseasMemberDataType354.setUnitRef(INR348);
                                            explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisOverseasMemberDataType354.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisOverseasMemberDataType354.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisOverseasMemberValue351));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisOverseasMemberElement353 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAmountOfUnsecuredAmountOutstandingOfTotalAmountOutstanding(explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisOverseasMemberDataType354);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisOverseasMemberElement353);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:GeographicalLocationAxis - ReasonsForBreachOfStipulatedPrudentialLimits
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisMap356 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisMap356.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:OverseasMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisOverseasMemberValue357 = DBS12ReportUtil.retrieveValueForElement(field.getReasonsForBreachOfStipulatedPrudentialLimits(), explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisMap356);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisOverseasMemberFieldDataValue358 = DBS12ReportUtil.retrieveFieldDataForElement(field.getReasonsForBreachOfStipulatedPrudentialLimits(), explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisMap356, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisOverseasMemberFieldDataValue358 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisOverseasMemberFieldDataValue358.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisOverseasMemberFieldDataValue358.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisOverseasMemberFieldDataValue358.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisOverseasMemberFieldDataValue358.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisOverseasMemberFieldDataValue358.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisOverseasMemberFieldDataValue358.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisOverseasMemberValue357 != null && !"".equals(explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisOverseasMemberValue357)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisContext355 = DBS12ReportContextUtil.createFromToContextWithMembersDBS12_SectionB_Layout1( bankCode, startDate, endDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisMap356 );
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisContext355, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        StringItemType explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisOverseasMemberDataType360 = new StringItemType();
                                        explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisOverseasMemberDataType360.setContextRef(explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisContext355);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisOverseasMemberDataType360.setValue(explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisOverseasMemberValue357);
                                        
                                        
                                        JAXBElement<StringItemType> explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisOverseasMemberElement359 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createReasonsForBreachOfStipulatedPrudentialLimits(explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisOverseasMemberDataType360);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisOverseasMemberElement359);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:GeographicalLocationAxis - DescriptionOfIntraGroupSupportArrangementsOrAgreements
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisMap362 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisMap362.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:OverseasMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisOverseasMemberValue363 = DBS12ReportUtil.retrieveValueForElement(field.getDescriptionOfIntraGroupSupportArrangementsOrAgreements(), explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisMap362);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisOverseasMemberFieldDataValue364 = DBS12ReportUtil.retrieveFieldDataForElement(field.getDescriptionOfIntraGroupSupportArrangementsOrAgreements(), explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisMap362, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisOverseasMemberFieldDataValue364 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisOverseasMemberFieldDataValue364.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisOverseasMemberFieldDataValue364.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisOverseasMemberFieldDataValue364.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisOverseasMemberFieldDataValue364.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisOverseasMemberFieldDataValue364.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisOverseasMemberFieldDataValue364.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisOverseasMemberValue363 != null && !"".equals(explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisOverseasMemberValue363)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisContext361 = DBS12ReportContextUtil.createFromToContextWithMembersDBS12_SectionB_Layout1( bankCode, startDate, endDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisMap362 );
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisContext361, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        StringItemType explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisOverseasMemberDataType366 = new StringItemType();
                                        explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisOverseasMemberDataType366.setContextRef(explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisContext361);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisOverseasMemberDataType366.setValue(explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisOverseasMemberValue363);
                                        
                                        
                                        JAXBElement<StringItemType> explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisOverseasMemberElement365 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createDescriptionOfIntraGroupSupportArrangementsOrAgreements(explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisOverseasMemberDataType366);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisOverseasMemberElement365);
                                    
                                    }
                                    
                                

                                
                            
                            
                            
                        
                            
                                
                                
                                
                                //rbi-core:GeographicalLocationAxis - TypeOfEntity
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisMap368 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisMap368.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:NotApplicableMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberValue369 = DBS12ReportUtil.retrieveValueForElement(field.getTypeOfEntity(), explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisMap368);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberFieldDataValue370 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTypeOfEntity(), explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisMap368, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberFieldDataValue370 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberFieldDataValue370.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberFieldDataValue370.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberFieldDataValue370.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberFieldDataValue370.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberFieldDataValue370.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberFieldDataValue370.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberValue369 != null && !"".equals(explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberValue369)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisContext367 = DBS12ReportContextUtil.createFromToContextWithMembersDBS12_SectionB_Layout1( bankCode, startDate, endDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisMap368 );
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisContext367, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        TypeOfEntity explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberDataType372 = new TypeOfEntity();
                                        explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberDataType372.setContextRef(explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisContext367);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberDataType372.setValue(explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberValue369);
                                        
                                        
                                        JAXBElement<TypeOfEntity> explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberElement371 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTypeOfEntity(explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberDataType372);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1TypeOfEntityGeographicalLocationAxisNotApplicableMemberElement371);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:GeographicalLocationAxis - FinancialClassification
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisMap374 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisMap374.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:NotApplicableMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberValue375 = DBS12ReportUtil.retrieveValueForElement(field.getFinancialClassification(), explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisMap374);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberFieldDataValue376 = DBS12ReportUtil.retrieveFieldDataForElement(field.getFinancialClassification(), explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisMap374, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberFieldDataValue376 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberFieldDataValue376.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberFieldDataValue376.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberFieldDataValue376.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberFieldDataValue376.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberFieldDataValue376.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberFieldDataValue376.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberValue375 != null && !"".equals(explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberValue375)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisContext373 = DBS12ReportContextUtil.createFromToContextWithMembersDBS12_SectionB_Layout1( bankCode, startDate, endDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisMap374 );
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisContext373, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        FinancialClassification explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberDataType378 = new FinancialClassification();
                                        explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberDataType378.setContextRef(explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisContext373);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberDataType378.setValue(explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberValue375);
                                        
                                        
                                        JAXBElement<FinancialClassification> explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberElement377 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createFinancialClassification(explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberDataType378);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1FinancialClassificationGeographicalLocationAxisNotApplicableMemberElement377);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR379 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR379 = createUnitIfNotExist(INR379, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - BanksEquityInvestmentInTheCompany
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisMap381 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisMap381.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:NotApplicableMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisNotApplicableMemberValue382 = DBS12ReportUtil.retrieveValueForElement(field.getBanksEquityInvestmentInTheCompany(), explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisMap381);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisNotApplicableMemberFieldDataValue383 = DBS12ReportUtil.retrieveFieldDataForElement(field.getBanksEquityInvestmentInTheCompany(), explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisMap381, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisNotApplicableMemberFieldDataValue383 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisNotApplicableMemberFieldDataValue383.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisNotApplicableMemberFieldDataValue383.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisNotApplicableMemberFieldDataValue383.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisNotApplicableMemberFieldDataValue383.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisNotApplicableMemberFieldDataValue383.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisNotApplicableMemberFieldDataValue383.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisNotApplicableMemberValue382 != null && !"".equals(explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisNotApplicableMemberValue382)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisContext380 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisMap381 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisContext380, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisNotApplicableMemberDataType385 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisNotApplicableMemberDataType385.setContextRef(explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisContext380);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisNotApplicableMemberDataType385.setUnitRef(INR379);
                                            explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisNotApplicableMemberDataType385.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisNotApplicableMemberDataType385.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisNotApplicableMemberValue382));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisNotApplicableMemberElement384 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createBanksEquityInvestmentInTheCompany(explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisNotApplicableMemberDataType385);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyGeographicalLocationAxisNotApplicableMemberElement384);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure386 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure386 = createUnitIfNotExist(pure386, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - BanksPercentageInvestmentInCompanyEquity
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisMap388 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisMap388.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:NotApplicableMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisNotApplicableMemberValue389 = DBS12ReportUtil.retrieveValueForElement(field.getBanksPercentageInvestmentInCompanyEquity(), explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisMap388);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisNotApplicableMemberFieldDataValue390 = DBS12ReportUtil.retrieveFieldDataForElement(field.getBanksPercentageInvestmentInCompanyEquity(), explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisMap388, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisNotApplicableMemberFieldDataValue390 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisNotApplicableMemberFieldDataValue390.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisNotApplicableMemberFieldDataValue390.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisNotApplicableMemberFieldDataValue390.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisNotApplicableMemberFieldDataValue390.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisNotApplicableMemberFieldDataValue390.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisNotApplicableMemberFieldDataValue390.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisNotApplicableMemberValue389 != null && !"".equals(explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisNotApplicableMemberValue389)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisContext387 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisMap388 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisContext387, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        PureItemType explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisNotApplicableMemberDataType392 = new PureItemType();
                                        explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisNotApplicableMemberDataType392.setContextRef(explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisContext387);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisNotApplicableMemberDataType392.setUnitRef(pure386);
                                            explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisNotApplicableMemberDataType392.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisNotApplicableMemberDataType392.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisNotApplicableMemberValue389));
                                        
                                        
                                        JAXBElement<PureItemType> explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisNotApplicableMemberElement391 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createBanksPercentageInvestmentInCompanyEquity(explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisNotApplicableMemberDataType392);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityGeographicalLocationAxisNotApplicableMemberElement391);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR393 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR393 = createUnitIfNotExist(INR393, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - AggregateAmountOutstandingForFundedExposure
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisMap395 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisMap395.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:NotApplicableMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisNotApplicableMemberValue396 = DBS12ReportUtil.retrieveValueForElement(field.getAggregateAmountOutstandingForFundedExposure(), explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisMap395);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue397 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAggregateAmountOutstandingForFundedExposure(), explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisMap395, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue397 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue397.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue397.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue397.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue397.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue397.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue397.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisNotApplicableMemberValue396 != null && !"".equals(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisNotApplicableMemberValue396)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisContext394 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisMap395 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisContext394, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisNotApplicableMemberDataType399 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisNotApplicableMemberDataType399.setContextRef(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisContext394);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisNotApplicableMemberDataType399.setUnitRef(INR393);
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisNotApplicableMemberDataType399.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisNotApplicableMemberDataType399.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisNotApplicableMemberValue396));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisNotApplicableMemberElement398 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAggregateAmountOutstandingForFundedExposure(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisNotApplicableMemberDataType399);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureGeographicalLocationAxisNotApplicableMemberElement398);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR400 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR400 = createUnitIfNotExist(INR400, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - FundedCreditExposure
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisMap402 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisMap402.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:NotApplicableMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisNotApplicableMemberValue403 = DBS12ReportUtil.retrieveValueForElement(field.getFundedCreditExposure(), explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisMap402);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue404 = DBS12ReportUtil.retrieveFieldDataForElement(field.getFundedCreditExposure(), explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisMap402, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue404 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue404.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue404.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue404.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue404.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue404.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue404.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisNotApplicableMemberValue403 != null && !"".equals(explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisNotApplicableMemberValue403)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisContext401 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisMap402 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisContext401, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisNotApplicableMemberDataType406 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisNotApplicableMemberDataType406.setContextRef(explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisContext401);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisNotApplicableMemberDataType406.setUnitRef(INR400);
                                            explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisNotApplicableMemberDataType406.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisNotApplicableMemberDataType406.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisNotApplicableMemberValue403));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisNotApplicableMemberElement405 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createFundedCreditExposure(explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisNotApplicableMemberDataType406);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1FundedCreditExposureGeographicalLocationAxisNotApplicableMemberElement405);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR407 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR407 = createUnitIfNotExist(INR407, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - AggregateAmountOutstandingForNonFundedExposure
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisMap409 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisMap409.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:NotApplicableMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisNotApplicableMemberValue410 = DBS12ReportUtil.retrieveValueForElement(field.getAggregateAmountOutstandingForNonFundedExposure(), explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisMap409);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue411 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAggregateAmountOutstandingForNonFundedExposure(), explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisMap409, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue411 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue411.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue411.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue411.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue411.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue411.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue411.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisNotApplicableMemberValue410 != null && !"".equals(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisNotApplicableMemberValue410)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisContext408 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisMap409 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisContext408, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisNotApplicableMemberDataType413 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisNotApplicableMemberDataType413.setContextRef(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisContext408);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisNotApplicableMemberDataType413.setUnitRef(INR407);
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisNotApplicableMemberDataType413.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisNotApplicableMemberDataType413.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisNotApplicableMemberValue410));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisNotApplicableMemberElement412 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAggregateAmountOutstandingForNonFundedExposure(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisNotApplicableMemberDataType413);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureGeographicalLocationAxisNotApplicableMemberElement412);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR414 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR414 = createUnitIfNotExist(INR414, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - NonFundedCreditExposure
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisMap416 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisMap416.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:NotApplicableMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisNotApplicableMemberValue417 = DBS12ReportUtil.retrieveValueForElement(field.getNonFundedCreditExposure(), explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisMap416);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue418 = DBS12ReportUtil.retrieveFieldDataForElement(field.getNonFundedCreditExposure(), explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisMap416, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue418 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue418.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue418.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue418.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue418.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue418.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue418.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisNotApplicableMemberValue417 != null && !"".equals(explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisNotApplicableMemberValue417)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisContext415 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisMap416 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisContext415, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisNotApplicableMemberDataType420 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisNotApplicableMemberDataType420.setContextRef(explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisContext415);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisNotApplicableMemberDataType420.setUnitRef(INR414);
                                            explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisNotApplicableMemberDataType420.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisNotApplicableMemberDataType420.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisNotApplicableMemberValue417));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisNotApplicableMemberElement419 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNonFundedCreditExposure(explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisNotApplicableMemberDataType420);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1NonFundedCreditExposureGeographicalLocationAxisNotApplicableMemberElement419);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR421 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR421 = createUnitIfNotExist(INR421, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - AggregateInvestmentExposure
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisMap423 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisMap423.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:NotApplicableMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisNotApplicableMemberValue424 = DBS12ReportUtil.retrieveValueForElement(field.getAggregateInvestmentExposure(), explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisMap423);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue425 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAggregateInvestmentExposure(), explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisMap423, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue425 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue425.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue425.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue425.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue425.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue425.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue425.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisNotApplicableMemberValue424 != null && !"".equals(explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisNotApplicableMemberValue424)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisContext422 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisMap423 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisContext422, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisNotApplicableMemberDataType427 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisNotApplicableMemberDataType427.setContextRef(explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisContext422);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisNotApplicableMemberDataType427.setUnitRef(INR421);
                                            explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisNotApplicableMemberDataType427.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisNotApplicableMemberDataType427.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisNotApplicableMemberValue424));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisNotApplicableMemberElement426 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAggregateInvestmentExposure(explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisNotApplicableMemberDataType427);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1AggregateInvestmentExposureGeographicalLocationAxisNotApplicableMemberElement426);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR428 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR428 = createUnitIfNotExist(INR428, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - ExemptedExposure
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisMap430 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisMap430.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:NotApplicableMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisNotApplicableMemberValue431 = DBS12ReportUtil.retrieveValueForElement(field.getExemptedExposure(), explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisMap430);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue432 = DBS12ReportUtil.retrieveFieldDataForElement(field.getExemptedExposure(), explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisMap430, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue432 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue432.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue432.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue432.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue432.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue432.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue432.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisNotApplicableMemberValue431 != null && !"".equals(explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisNotApplicableMemberValue431)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisContext429 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisMap430 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisContext429, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisNotApplicableMemberDataType434 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisNotApplicableMemberDataType434.setContextRef(explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisContext429);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisNotApplicableMemberDataType434.setUnitRef(INR428);
                                            explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisNotApplicableMemberDataType434.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisNotApplicableMemberDataType434.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisNotApplicableMemberValue431));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisNotApplicableMemberElement433 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createExemptedExposure(explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisNotApplicableMemberDataType434);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1ExemptedExposureGeographicalLocationAxisNotApplicableMemberElement433);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR435 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR435 = createUnitIfNotExist(INR435, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - AggregateAmountOutstanding
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisMap437 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisMap437.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:NotApplicableMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisNotApplicableMemberValue438 = DBS12ReportUtil.retrieveValueForElement(field.getAggregateAmountOutstanding(), explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisMap437);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisNotApplicableMemberFieldDataValue439 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAggregateAmountOutstanding(), explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisMap437, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisNotApplicableMemberFieldDataValue439 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisNotApplicableMemberFieldDataValue439.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisNotApplicableMemberFieldDataValue439.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisNotApplicableMemberFieldDataValue439.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisNotApplicableMemberFieldDataValue439.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisNotApplicableMemberFieldDataValue439.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisNotApplicableMemberFieldDataValue439.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisNotApplicableMemberValue438 != null && !"".equals(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisNotApplicableMemberValue438)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisContext436 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisMap437 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisContext436, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisNotApplicableMemberDataType441 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisNotApplicableMemberDataType441.setContextRef(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisContext436);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisNotApplicableMemberDataType441.setUnitRef(INR435);
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisNotApplicableMemberDataType441.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisNotApplicableMemberDataType441.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisNotApplicableMemberValue438));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisNotApplicableMemberElement440 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAggregateAmountOutstanding(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisNotApplicableMemberDataType441);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1AggregateAmountOutstandingGeographicalLocationAxisNotApplicableMemberElement440);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR442 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR442 = createUnitIfNotExist(INR442, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - AggregateExposure
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisMap444 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisMap444.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:NotApplicableMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisNotApplicableMemberValue445 = DBS12ReportUtil.retrieveValueForElement(field.getAggregateExposure(), explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisMap444);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue446 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAggregateExposure(), explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisMap444, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue446 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue446.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue446.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue446.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue446.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue446.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisNotApplicableMemberFieldDataValue446.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisNotApplicableMemberValue445 != null && !"".equals(explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisNotApplicableMemberValue445)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisContext443 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisMap444 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisContext443, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisNotApplicableMemberDataType448 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisNotApplicableMemberDataType448.setContextRef(explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisContext443);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisNotApplicableMemberDataType448.setUnitRef(INR442);
                                            explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisNotApplicableMemberDataType448.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisNotApplicableMemberDataType448.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisNotApplicableMemberValue445));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisNotApplicableMemberElement447 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAggregateExposure(explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisNotApplicableMemberDataType448);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1AggregateExposureGeographicalLocationAxisNotApplicableMemberElement447);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:GeographicalLocationAxis - AssetClassifications
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisMap450 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisMap450.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:NotApplicableMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisNotApplicableMemberValue451 = DBS12ReportUtil.retrieveValueForElement(field.getAssetClassifications(), explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisMap450);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisNotApplicableMemberFieldDataValue452 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAssetClassifications(), explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisMap450, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisNotApplicableMemberFieldDataValue452 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisNotApplicableMemberFieldDataValue452.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisNotApplicableMemberFieldDataValue452.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisNotApplicableMemberFieldDataValue452.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisNotApplicableMemberFieldDataValue452.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisNotApplicableMemberFieldDataValue452.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisNotApplicableMemberFieldDataValue452.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisNotApplicableMemberValue451 != null && !"".equals(explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisNotApplicableMemberValue451)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisContext449 = DBS12ReportContextUtil.createFromToContextWithMembersDBS12_SectionB_Layout1( bankCode, startDate, endDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisMap450 );
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisContext449, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        AssetClassifications explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisNotApplicableMemberDataType454 = new AssetClassifications();
                                        explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisNotApplicableMemberDataType454.setContextRef(explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisContext449);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisNotApplicableMemberDataType454.setValue(explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisNotApplicableMemberValue451);
                                        
                                        
                                        JAXBElement<AssetClassifications> explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisNotApplicableMemberElement453 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createAssetClassifications(explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisNotApplicableMemberDataType454);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1AssetClassificationsGeographicalLocationAxisNotApplicableMemberElement453);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR455 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR455 = createUnitIfNotExist(INR455, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - AmountOfAggregateProvisionsHeldForNPAs
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisMap457 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisMap457.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:NotApplicableMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisNotApplicableMemberValue458 = DBS12ReportUtil.retrieveValueForElement(field.getAmountOfAggregateProvisionsHeldForNPAs(), explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisMap457);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisNotApplicableMemberFieldDataValue459 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAmountOfAggregateProvisionsHeldForNPAs(), explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisMap457, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisNotApplicableMemberFieldDataValue459 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisNotApplicableMemberFieldDataValue459.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisNotApplicableMemberFieldDataValue459.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisNotApplicableMemberFieldDataValue459.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisNotApplicableMemberFieldDataValue459.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisNotApplicableMemberFieldDataValue459.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisNotApplicableMemberFieldDataValue459.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisNotApplicableMemberValue458 != null && !"".equals(explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisNotApplicableMemberValue458)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisContext456 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisMap457 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisContext456, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisNotApplicableMemberDataType461 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisNotApplicableMemberDataType461.setContextRef(explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisContext456);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisNotApplicableMemberDataType461.setUnitRef(INR455);
                                            explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisNotApplicableMemberDataType461.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisNotApplicableMemberDataType461.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisNotApplicableMemberValue458));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisNotApplicableMemberElement460 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAmountOfAggregateProvisionsHeldForNPAs(explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisNotApplicableMemberDataType461);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsGeographicalLocationAxisNotApplicableMemberElement460);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit INR462 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR462 = createUnitIfNotExist(INR462, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:GeographicalLocationAxis - AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstanding
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisMap464 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisMap464.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:NotApplicableMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisNotApplicableMemberValue465 = DBS12ReportUtil.retrieveValueForElement(field.getAmountOfUnsecuredAmountOutstandingOfTotalAmountOutstanding(), explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisMap464);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisNotApplicableMemberFieldDataValue466 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAmountOfUnsecuredAmountOutstandingOfTotalAmountOutstanding(), explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisMap464, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisNotApplicableMemberFieldDataValue466 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisNotApplicableMemberFieldDataValue466.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisNotApplicableMemberFieldDataValue466.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisNotApplicableMemberFieldDataValue466.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisNotApplicableMemberFieldDataValue466.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisNotApplicableMemberFieldDataValue466.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisNotApplicableMemberFieldDataValue466.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisNotApplicableMemberValue465 != null && !"".equals(explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisNotApplicableMemberValue465)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisContext463 = DBS12ReportContextUtil.createAsOfContextWithMembersDBS12_SectionB_Layout1( bankCode, periodDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisMap464 );
                                            
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisContext463, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisNotApplicableMemberDataType468 = new MonetaryItemType();
                                        explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisNotApplicableMemberDataType468.setContextRef(explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisContext463);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisNotApplicableMemberDataType468.setUnitRef(INR462);
                                            explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisNotApplicableMemberDataType468.setDecimals("INF");
                                            explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisNotApplicableMemberDataType468.setValue(new BigDecimal(explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisNotApplicableMemberValue465));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisNotApplicableMemberElement467 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAmountOfUnsecuredAmountOutstandingOfTotalAmountOutstanding(explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisNotApplicableMemberDataType468);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingGeographicalLocationAxisNotApplicableMemberElement467);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:GeographicalLocationAxis - ReasonsForBreachOfStipulatedPrudentialLimits
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisMap470 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisMap470.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:NotApplicableMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisNotApplicableMemberValue471 = DBS12ReportUtil.retrieveValueForElement(field.getReasonsForBreachOfStipulatedPrudentialLimits(), explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisMap470);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisNotApplicableMemberFieldDataValue472 = DBS12ReportUtil.retrieveFieldDataForElement(field.getReasonsForBreachOfStipulatedPrudentialLimits(), explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisMap470, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisNotApplicableMemberFieldDataValue472 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisNotApplicableMemberFieldDataValue472.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisNotApplicableMemberFieldDataValue472.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisNotApplicableMemberFieldDataValue472.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisNotApplicableMemberFieldDataValue472.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisNotApplicableMemberFieldDataValue472.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisNotApplicableMemberFieldDataValue472.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisNotApplicableMemberValue471 != null && !"".equals(explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisNotApplicableMemberValue471)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisContext469 = DBS12ReportContextUtil.createFromToContextWithMembersDBS12_SectionB_Layout1( bankCode, startDate, endDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisMap470 );
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisContext469, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        StringItemType explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisNotApplicableMemberDataType474 = new StringItemType();
                                        explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisNotApplicableMemberDataType474.setContextRef(explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisContext469);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisNotApplicableMemberDataType474.setValue(explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisNotApplicableMemberValue471);
                                        
                                        
                                        JAXBElement<StringItemType> explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisNotApplicableMemberElement473 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createReasonsForBreachOfStipulatedPrudentialLimits(explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisNotApplicableMemberDataType474);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsGeographicalLocationAxisNotApplicableMemberElement473);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                
                                //rbi-core:GeographicalLocationAxis - DescriptionOfIntraGroupSupportArrangementsOrAgreements
                                
                            
                                
                                    
                                    Map explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisMap476 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisMap476.put("rbi-core:GeographicalLocationAxis", "in-rbi-rep:NotApplicableMember");                
                                    
                                    String explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisNotApplicableMemberValue477 = DBS12ReportUtil.retrieveValueForElement(field.getDescriptionOfIntraGroupSupportArrangementsOrAgreements(), explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisMap476);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisNotApplicableMemberFieldDataValue478 = DBS12ReportUtil.retrieveFieldDataForElement(field.getDescriptionOfIntraGroupSupportArrangementsOrAgreements(), explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisMap476, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                    if(explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisNotApplicableMemberFieldDataValue478 != null ) {
                                        if(!explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisNotApplicableMemberFieldDataValue478.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisNotApplicableMemberFieldDataValue478.getStartDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisNotApplicableMemberFieldDataValue478.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisNotApplicableMemberFieldDataValue478.getEndDateValue();
                                        if(!explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisNotApplicableMemberFieldDataValue478.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisNotApplicableMemberFieldDataValue478.getInstantDateValue();
                                    }

                                    if(explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisNotApplicableMemberValue477 != null && !"".equals(explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisNotApplicableMemberValue477)) {
                                    
                                        
                                            Context explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisContext475 = DBS12ReportContextUtil.createFromToContextWithMembersDBS12_SectionB_Layout1( bankCode, startDate, endDate, nameOfEntityAxis,  explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisMap476 );
                                        
                                        addContext(explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisContext475, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        StringItemType explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisNotApplicableMemberDataType480 = new StringItemType();
                                        explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisNotApplicableMemberDataType480.setContextRef(explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisContext475);
                                        
                                        
                                            explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisNotApplicableMemberDataType480.setValue(explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisNotApplicableMemberValue477);
                                        
                                        
                                        JAXBElement<StringItemType> explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisNotApplicableMemberElement479 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createDescriptionOfIntraGroupSupportArrangementsOrAgreements(explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisNotApplicableMemberDataType480);
                                        bodyElements.add(explictMember1DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsGeographicalLocationAxisNotApplicableMemberElement479);
                                    
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
                                
                                    Map zeroDBS12_SectionC_Layout1TypeOfEntityMap484 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionC_Layout1TypeOfEntityValue482 = DBS12ReportUtil.retrieveValueForElement(field.getTypeOfEntity(), zeroDBS12_SectionC_Layout1TypeOfEntityMap484);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionC_Layout1TypeOfEntityFieldDataValue483 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTypeOfEntity(), zeroDBS12_SectionC_Layout1TypeOfEntityMap484, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                        if(zeroDBS12_SectionC_Layout1TypeOfEntityFieldDataValue483 != null ) {
                                            if(!zeroDBS12_SectionC_Layout1TypeOfEntityFieldDataValue483.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionC_Layout1TypeOfEntityFieldDataValue483.getStartDateValue();
                                            if(!zeroDBS12_SectionC_Layout1TypeOfEntityFieldDataValue483.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionC_Layout1TypeOfEntityFieldDataValue483.getEndDateValue();
                                            if(!zeroDBS12_SectionC_Layout1TypeOfEntityFieldDataValue483.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionC_Layout1TypeOfEntityFieldDataValue483.getInstantDateValue();
                                        }

                                        
                                            Context DBS12_SectionC_Layout1TypeOfEntityContext481 = DBS12ReportContextUtil.createFromToContextDBS12_SectionC_Layout1( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionC_Layout1TypeOfEntityValue482 != null && !"".equals(zeroDBS12_SectionC_Layout1TypeOfEntityValue482)) {
                                        
                                        addContext(DBS12_SectionC_Layout1TypeOfEntityContext481, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        TypeOfEntity typeOfEntityValue485 = new TypeOfEntity();
                                        typeOfEntityValue485.setContextRef(DBS12_SectionC_Layout1TypeOfEntityContext481);
                                        
                                            typeOfEntityValue485.setValue(zeroDBS12_SectionC_Layout1TypeOfEntityValue482);        
                                        
                                        
                                        JAXBElement<TypeOfEntity> typeOfEntityElement486 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTypeOfEntity(typeOfEntityValue485);
                                        bodyElements.add(typeOfEntityElement486);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionC_Layout1
                                // create unit if not empty
                                
                                
                                // - TypeOfExposures
                                
                                    Map zeroDBS12_SectionC_Layout1TypeOfExposuresMap490 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionC_Layout1TypeOfExposuresValue488 = DBS12ReportUtil.retrieveValueForElement(field.getTypeOfExposures(), zeroDBS12_SectionC_Layout1TypeOfExposuresMap490);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionC_Layout1TypeOfExposuresFieldDataValue489 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTypeOfExposures(), zeroDBS12_SectionC_Layout1TypeOfExposuresMap490, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                        if(zeroDBS12_SectionC_Layout1TypeOfExposuresFieldDataValue489 != null ) {
                                            if(!zeroDBS12_SectionC_Layout1TypeOfExposuresFieldDataValue489.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionC_Layout1TypeOfExposuresFieldDataValue489.getStartDateValue();
                                            if(!zeroDBS12_SectionC_Layout1TypeOfExposuresFieldDataValue489.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionC_Layout1TypeOfExposuresFieldDataValue489.getEndDateValue();
                                            if(!zeroDBS12_SectionC_Layout1TypeOfExposuresFieldDataValue489.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionC_Layout1TypeOfExposuresFieldDataValue489.getInstantDateValue();
                                        }

                                        
                                            Context DBS12_SectionC_Layout1TypeOfExposuresContext487 = DBS12ReportContextUtil.createFromToContextDBS12_SectionC_Layout1( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionC_Layout1TypeOfExposuresValue488 != null && !"".equals(zeroDBS12_SectionC_Layout1TypeOfExposuresValue488)) {
                                        
                                        addContext(DBS12_SectionC_Layout1TypeOfExposuresContext487, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        TypeOfExposures typeOfExposuresValue491 = new TypeOfExposures();
                                        typeOfExposuresValue491.setContextRef(DBS12_SectionC_Layout1TypeOfExposuresContext487);
                                        
                                            typeOfExposuresValue491.setValue(zeroDBS12_SectionC_Layout1TypeOfExposuresValue488);        
                                        
                                        
                                        JAXBElement<TypeOfExposures> typeOfExposuresElement492 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTypeOfExposures(typeOfExposuresValue491);
                                        bodyElements.add(typeOfExposuresElement492);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionC_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR493 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR493 = createUnitIfNotExist(INR493, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExposureAmount
                                
                                    Map zeroDBS12_SectionC_Layout1ExposureAmountMap497 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionC_Layout1ExposureAmountValue495 = DBS12ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBS12_SectionC_Layout1ExposureAmountMap497);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionC_Layout1ExposureAmountFieldDataValue496 = DBS12ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), zeroDBS12_SectionC_Layout1ExposureAmountMap497, "", "", "xs:date($refPeriodEndDate)");

                                        if(zeroDBS12_SectionC_Layout1ExposureAmountFieldDataValue496 != null ) {
                                            if(!zeroDBS12_SectionC_Layout1ExposureAmountFieldDataValue496.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionC_Layout1ExposureAmountFieldDataValue496.getStartDateValue();
                                            if(!zeroDBS12_SectionC_Layout1ExposureAmountFieldDataValue496.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionC_Layout1ExposureAmountFieldDataValue496.getEndDateValue();
                                            if(!zeroDBS12_SectionC_Layout1ExposureAmountFieldDataValue496.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionC_Layout1ExposureAmountFieldDataValue496.getInstantDateValue();
                                        }

                                        
                                        Context DBS12_SectionC_Layout1ExposureAmountContext494 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionC_Layout1( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionC_Layout1ExposureAmountValue495 != null && !"".equals(zeroDBS12_SectionC_Layout1ExposureAmountValue495)) {
                                        
                                        addContext(DBS12_SectionC_Layout1ExposureAmountContext494, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exposureAmountValue498 = new MonetaryItemType();
                                        exposureAmountValue498.setContextRef(DBS12_SectionC_Layout1ExposureAmountContext494);
                                        
                                            exposureAmountValue498.setUnitRef(INR493);
                                            exposureAmountValue498.setDecimals("INF");
                                            exposureAmountValue498.setValue(new BigDecimal(zeroDBS12_SectionC_Layout1ExposureAmountValue495));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exposureAmountElement499 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue498);
                                        bodyElements.add(exposureAmountElement499);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionC_Layout1
                                // create unit if not empty
                                
                                
                                // - TermOfCreditExposure
                                
                                    Map zeroDBS12_SectionC_Layout1TermOfCreditExposureMap503 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionC_Layout1TermOfCreditExposureValue501 = DBS12ReportUtil.retrieveValueForElement(field.getTermOfCreditExposure(), zeroDBS12_SectionC_Layout1TermOfCreditExposureMap503);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionC_Layout1TermOfCreditExposureFieldDataValue502 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTermOfCreditExposure(), zeroDBS12_SectionC_Layout1TermOfCreditExposureMap503, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                        if(zeroDBS12_SectionC_Layout1TermOfCreditExposureFieldDataValue502 != null ) {
                                            if(!zeroDBS12_SectionC_Layout1TermOfCreditExposureFieldDataValue502.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionC_Layout1TermOfCreditExposureFieldDataValue502.getStartDateValue();
                                            if(!zeroDBS12_SectionC_Layout1TermOfCreditExposureFieldDataValue502.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionC_Layout1TermOfCreditExposureFieldDataValue502.getEndDateValue();
                                            if(!zeroDBS12_SectionC_Layout1TermOfCreditExposureFieldDataValue502.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionC_Layout1TermOfCreditExposureFieldDataValue502.getInstantDateValue();
                                        }

                                        
                                            Context DBS12_SectionC_Layout1TermOfCreditExposureContext500 = DBS12ReportContextUtil.createFromToContextDBS12_SectionC_Layout1( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionC_Layout1TermOfCreditExposureValue501 != null && !"".equals(zeroDBS12_SectionC_Layout1TermOfCreditExposureValue501)) {
                                        
                                        addContext(DBS12_SectionC_Layout1TermOfCreditExposureContext500, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        StringItemType termOfCreditExposureValue504 = new StringItemType();
                                        termOfCreditExposureValue504.setContextRef(DBS12_SectionC_Layout1TermOfCreditExposureContext500);
                                        
                                            termOfCreditExposureValue504.setValue(zeroDBS12_SectionC_Layout1TermOfCreditExposureValue501);        
                                        
                                        
                                        JAXBElement<StringItemType> termOfCreditExposureElement505 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createTermOfCreditExposure(termOfCreditExposureValue504);
                                        bodyElements.add(termOfCreditExposureElement505);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionC_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR506 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR506 = createUnitIfNotExist(INR506, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ValueOfSecuritiesCollateral
                                
                                    Map zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralMap510 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralValue508 = DBS12ReportUtil.retrieveValueForElement(field.getValueOfSecuritiesCollateral(), zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralMap510);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralFieldDataValue509 = DBS12ReportUtil.retrieveFieldDataForElement(field.getValueOfSecuritiesCollateral(), zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralMap510, "", "", "xs:date($refPeriodEndDate)");

                                        if(zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralFieldDataValue509 != null ) {
                                            if(!zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralFieldDataValue509.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralFieldDataValue509.getStartDateValue();
                                            if(!zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralFieldDataValue509.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralFieldDataValue509.getEndDateValue();
                                            if(!zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralFieldDataValue509.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralFieldDataValue509.getInstantDateValue();
                                        }

                                        
                                        Context DBS12_SectionC_Layout1ValueOfSecuritiesCollateralContext507 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionC_Layout1( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralValue508 != null && !"".equals(zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralValue508)) {
                                        
                                        addContext(DBS12_SectionC_Layout1ValueOfSecuritiesCollateralContext507, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType valueOfSecuritiesCollateralValue511 = new MonetaryItemType();
                                        valueOfSecuritiesCollateralValue511.setContextRef(DBS12_SectionC_Layout1ValueOfSecuritiesCollateralContext507);
                                        
                                            valueOfSecuritiesCollateralValue511.setUnitRef(INR506);
                                            valueOfSecuritiesCollateralValue511.setDecimals("INF");
                                            valueOfSecuritiesCollateralValue511.setValue(new BigDecimal(zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralValue508));
                                        
                                        
                                        JAXBElement<MonetaryItemType> valueOfSecuritiesCollateralElement512 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createValueOfSecuritiesCollateral(valueOfSecuritiesCollateralValue511);
                                        bodyElements.add(valueOfSecuritiesCollateralElement512);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionC_Layout1
                                // create unit if not empty
                                
                                
                                // - AssetClassifications
                                
                                    Map zeroDBS12_SectionC_Layout1AssetClassificationsMap516 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionC_Layout1AssetClassificationsValue514 = DBS12ReportUtil.retrieveValueForElement(field.getAssetClassifications(), zeroDBS12_SectionC_Layout1AssetClassificationsMap516);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionC_Layout1AssetClassificationsFieldDataValue515 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAssetClassifications(), zeroDBS12_SectionC_Layout1AssetClassificationsMap516, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                        if(zeroDBS12_SectionC_Layout1AssetClassificationsFieldDataValue515 != null ) {
                                            if(!zeroDBS12_SectionC_Layout1AssetClassificationsFieldDataValue515.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionC_Layout1AssetClassificationsFieldDataValue515.getStartDateValue();
                                            if(!zeroDBS12_SectionC_Layout1AssetClassificationsFieldDataValue515.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionC_Layout1AssetClassificationsFieldDataValue515.getEndDateValue();
                                            if(!zeroDBS12_SectionC_Layout1AssetClassificationsFieldDataValue515.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionC_Layout1AssetClassificationsFieldDataValue515.getInstantDateValue();
                                        }

                                        
                                            Context DBS12_SectionC_Layout1AssetClassificationsContext513 = DBS12ReportContextUtil.createFromToContextDBS12_SectionC_Layout1( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionC_Layout1AssetClassificationsValue514 != null && !"".equals(zeroDBS12_SectionC_Layout1AssetClassificationsValue514)) {
                                        
                                        addContext(DBS12_SectionC_Layout1AssetClassificationsContext513, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        AssetClassifications assetClassificationsValue517 = new AssetClassifications();
                                        assetClassificationsValue517.setContextRef(DBS12_SectionC_Layout1AssetClassificationsContext513);
                                        
                                            assetClassificationsValue517.setValue(zeroDBS12_SectionC_Layout1AssetClassificationsValue514);        
                                        
                                        
                                        JAXBElement<AssetClassifications> assetClassificationsElement518 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createAssetClassifications(assetClassificationsValue517);
                                        bodyElements.add(assetClassificationsElement518);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionC_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR519 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR519 = createUnitIfNotExist(INR519, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ProvisionForInvestment
                                
                                    Map zeroDBS12_SectionC_Layout1ProvisionForInvestmentMap523 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionC_Layout1ProvisionForInvestmentValue521 = DBS12ReportUtil.retrieveValueForElement(field.getProvisionForInvestment(), zeroDBS12_SectionC_Layout1ProvisionForInvestmentMap523);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionC_Layout1ProvisionForInvestmentFieldDataValue522 = DBS12ReportUtil.retrieveFieldDataForElement(field.getProvisionForInvestment(), zeroDBS12_SectionC_Layout1ProvisionForInvestmentMap523, "", "", "xs:date($refPeriodEndDate)");

                                        if(zeroDBS12_SectionC_Layout1ProvisionForInvestmentFieldDataValue522 != null ) {
                                            if(!zeroDBS12_SectionC_Layout1ProvisionForInvestmentFieldDataValue522.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionC_Layout1ProvisionForInvestmentFieldDataValue522.getStartDateValue();
                                            if(!zeroDBS12_SectionC_Layout1ProvisionForInvestmentFieldDataValue522.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionC_Layout1ProvisionForInvestmentFieldDataValue522.getEndDateValue();
                                            if(!zeroDBS12_SectionC_Layout1ProvisionForInvestmentFieldDataValue522.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionC_Layout1ProvisionForInvestmentFieldDataValue522.getInstantDateValue();
                                        }

                                        
                                        Context DBS12_SectionC_Layout1ProvisionForInvestmentContext520 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionC_Layout1( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionC_Layout1ProvisionForInvestmentValue521 != null && !"".equals(zeroDBS12_SectionC_Layout1ProvisionForInvestmentValue521)) {
                                        
                                        addContext(DBS12_SectionC_Layout1ProvisionForInvestmentContext520, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType provisionForInvestmentValue524 = new MonetaryItemType();
                                        provisionForInvestmentValue524.setContextRef(DBS12_SectionC_Layout1ProvisionForInvestmentContext520);
                                        
                                            provisionForInvestmentValue524.setUnitRef(INR519);
                                            provisionForInvestmentValue524.setDecimals("INF");
                                            provisionForInvestmentValue524.setValue(new BigDecimal(zeroDBS12_SectionC_Layout1ProvisionForInvestmentValue521));
                                        
                                        
                                        JAXBElement<MonetaryItemType> provisionForInvestmentElement525 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createProvisionForInvestment(provisionForInvestmentValue524);
                                        bodyElements.add(provisionForInvestmentElement525);
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
                                
                                    Map zeroDBS12_SectionD_Layout1TypeOfExposuresMap529 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout1TypeOfExposuresValue527 = DBS12ReportUtil.retrieveValueForElement(field.getTypeOfExposures(), zeroDBS12_SectionD_Layout1TypeOfExposuresMap529);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout1TypeOfExposuresFieldDataValue528 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTypeOfExposures(), zeroDBS12_SectionD_Layout1TypeOfExposuresMap529, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                        if(zeroDBS12_SectionD_Layout1TypeOfExposuresFieldDataValue528 != null ) {
                                            if(!zeroDBS12_SectionD_Layout1TypeOfExposuresFieldDataValue528.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout1TypeOfExposuresFieldDataValue528.getStartDateValue();
                                            if(!zeroDBS12_SectionD_Layout1TypeOfExposuresFieldDataValue528.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout1TypeOfExposuresFieldDataValue528.getEndDateValue();
                                            if(!zeroDBS12_SectionD_Layout1TypeOfExposuresFieldDataValue528.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout1TypeOfExposuresFieldDataValue528.getInstantDateValue();
                                        }

                                        
                                            Context DBS12_SectionD_Layout1TypeOfExposuresContext526 = DBS12ReportContextUtil.createFromToContextDBS12_SectionD_Layout1( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout1TypeOfExposuresValue527 != null && !"".equals(zeroDBS12_SectionD_Layout1TypeOfExposuresValue527)) {
                                        
                                        addContext(DBS12_SectionD_Layout1TypeOfExposuresContext526, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        TypeOfExposures typeOfExposuresValue530 = new TypeOfExposures();
                                        typeOfExposuresValue530.setContextRef(DBS12_SectionD_Layout1TypeOfExposuresContext526);
                                        
                                            typeOfExposuresValue530.setValue(zeroDBS12_SectionD_Layout1TypeOfExposuresValue527);        
                                        
                                        
                                        JAXBElement<TypeOfExposures> typeOfExposuresElement531 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTypeOfExposures(typeOfExposuresValue530);
                                        bodyElements.add(typeOfExposuresElement531);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR532 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR532 = createUnitIfNotExist(INR532, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExposureAmount
                                
                                    Map zeroDBS12_SectionD_Layout1ExposureAmountMap536 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout1ExposureAmountValue534 = DBS12ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBS12_SectionD_Layout1ExposureAmountMap536);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout1ExposureAmountFieldDataValue535 = DBS12ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), zeroDBS12_SectionD_Layout1ExposureAmountMap536, "", "", "xs:date($refPeriodEndDate)");

                                        if(zeroDBS12_SectionD_Layout1ExposureAmountFieldDataValue535 != null ) {
                                            if(!zeroDBS12_SectionD_Layout1ExposureAmountFieldDataValue535.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout1ExposureAmountFieldDataValue535.getStartDateValue();
                                            if(!zeroDBS12_SectionD_Layout1ExposureAmountFieldDataValue535.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout1ExposureAmountFieldDataValue535.getEndDateValue();
                                            if(!zeroDBS12_SectionD_Layout1ExposureAmountFieldDataValue535.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout1ExposureAmountFieldDataValue535.getInstantDateValue();
                                        }

                                        
                                        Context DBS12_SectionD_Layout1ExposureAmountContext533 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionD_Layout1( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout1ExposureAmountValue534 != null && !"".equals(zeroDBS12_SectionD_Layout1ExposureAmountValue534)) {
                                        
                                        addContext(DBS12_SectionD_Layout1ExposureAmountContext533, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exposureAmountValue537 = new MonetaryItemType();
                                        exposureAmountValue537.setContextRef(DBS12_SectionD_Layout1ExposureAmountContext533);
                                        
                                            exposureAmountValue537.setUnitRef(INR532);
                                            exposureAmountValue537.setDecimals("INF");
                                            exposureAmountValue537.setValue(new BigDecimal(zeroDBS12_SectionD_Layout1ExposureAmountValue534));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exposureAmountElement538 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue537);
                                        bodyElements.add(exposureAmountElement538);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout1
                                // create unit if not empty
                                
                                
                                // - TermOfCreditExposure
                                
                                    Map zeroDBS12_SectionD_Layout1TermOfCreditExposureMap542 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout1TermOfCreditExposureValue540 = DBS12ReportUtil.retrieveValueForElement(field.getTermOfCreditExposure(), zeroDBS12_SectionD_Layout1TermOfCreditExposureMap542);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout1TermOfCreditExposureFieldDataValue541 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTermOfCreditExposure(), zeroDBS12_SectionD_Layout1TermOfCreditExposureMap542, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                        if(zeroDBS12_SectionD_Layout1TermOfCreditExposureFieldDataValue541 != null ) {
                                            if(!zeroDBS12_SectionD_Layout1TermOfCreditExposureFieldDataValue541.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout1TermOfCreditExposureFieldDataValue541.getStartDateValue();
                                            if(!zeroDBS12_SectionD_Layout1TermOfCreditExposureFieldDataValue541.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout1TermOfCreditExposureFieldDataValue541.getEndDateValue();
                                            if(!zeroDBS12_SectionD_Layout1TermOfCreditExposureFieldDataValue541.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout1TermOfCreditExposureFieldDataValue541.getInstantDateValue();
                                        }

                                        
                                            Context DBS12_SectionD_Layout1TermOfCreditExposureContext539 = DBS12ReportContextUtil.createFromToContextDBS12_SectionD_Layout1( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout1TermOfCreditExposureValue540 != null && !"".equals(zeroDBS12_SectionD_Layout1TermOfCreditExposureValue540)) {
                                        
                                        addContext(DBS12_SectionD_Layout1TermOfCreditExposureContext539, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        StringItemType termOfCreditExposureValue543 = new StringItemType();
                                        termOfCreditExposureValue543.setContextRef(DBS12_SectionD_Layout1TermOfCreditExposureContext539);
                                        
                                            termOfCreditExposureValue543.setValue(zeroDBS12_SectionD_Layout1TermOfCreditExposureValue540);        
                                        
                                        
                                        JAXBElement<StringItemType> termOfCreditExposureElement544 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createTermOfCreditExposure(termOfCreditExposureValue543);
                                        bodyElements.add(termOfCreditExposureElement544);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR545 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR545 = createUnitIfNotExist(INR545, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ValueOfSecuritiesCollateral
                                
                                    Map zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralMap549 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralValue547 = DBS12ReportUtil.retrieveValueForElement(field.getValueOfSecuritiesCollateral(), zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralMap549);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralFieldDataValue548 = DBS12ReportUtil.retrieveFieldDataForElement(field.getValueOfSecuritiesCollateral(), zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralMap549, "", "", "xs:date($refPeriodEndDate)");

                                        if(zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralFieldDataValue548 != null ) {
                                            if(!zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralFieldDataValue548.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralFieldDataValue548.getStartDateValue();
                                            if(!zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralFieldDataValue548.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralFieldDataValue548.getEndDateValue();
                                            if(!zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralFieldDataValue548.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralFieldDataValue548.getInstantDateValue();
                                        }

                                        
                                        Context DBS12_SectionD_Layout1ValueOfSecuritiesCollateralContext546 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionD_Layout1( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralValue547 != null && !"".equals(zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralValue547)) {
                                        
                                        addContext(DBS12_SectionD_Layout1ValueOfSecuritiesCollateralContext546, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType valueOfSecuritiesCollateralValue550 = new MonetaryItemType();
                                        valueOfSecuritiesCollateralValue550.setContextRef(DBS12_SectionD_Layout1ValueOfSecuritiesCollateralContext546);
                                        
                                            valueOfSecuritiesCollateralValue550.setUnitRef(INR545);
                                            valueOfSecuritiesCollateralValue550.setDecimals("INF");
                                            valueOfSecuritiesCollateralValue550.setValue(new BigDecimal(zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralValue547));
                                        
                                        
                                        JAXBElement<MonetaryItemType> valueOfSecuritiesCollateralElement551 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createValueOfSecuritiesCollateral(valueOfSecuritiesCollateralValue550);
                                        bodyElements.add(valueOfSecuritiesCollateralElement551);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout1
                                // create unit if not empty
                                
                                
                                // - AssetClassifications
                                
                                    Map zeroDBS12_SectionD_Layout1AssetClassificationsMap555 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout1AssetClassificationsValue553 = DBS12ReportUtil.retrieveValueForElement(field.getAssetClassifications(), zeroDBS12_SectionD_Layout1AssetClassificationsMap555);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout1AssetClassificationsFieldDataValue554 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAssetClassifications(), zeroDBS12_SectionD_Layout1AssetClassificationsMap555, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                        if(zeroDBS12_SectionD_Layout1AssetClassificationsFieldDataValue554 != null ) {
                                            if(!zeroDBS12_SectionD_Layout1AssetClassificationsFieldDataValue554.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout1AssetClassificationsFieldDataValue554.getStartDateValue();
                                            if(!zeroDBS12_SectionD_Layout1AssetClassificationsFieldDataValue554.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout1AssetClassificationsFieldDataValue554.getEndDateValue();
                                            if(!zeroDBS12_SectionD_Layout1AssetClassificationsFieldDataValue554.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout1AssetClassificationsFieldDataValue554.getInstantDateValue();
                                        }

                                        
                                            Context DBS12_SectionD_Layout1AssetClassificationsContext552 = DBS12ReportContextUtil.createFromToContextDBS12_SectionD_Layout1( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout1AssetClassificationsValue553 != null && !"".equals(zeroDBS12_SectionD_Layout1AssetClassificationsValue553)) {
                                        
                                        addContext(DBS12_SectionD_Layout1AssetClassificationsContext552, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        AssetClassifications assetClassificationsValue556 = new AssetClassifications();
                                        assetClassificationsValue556.setContextRef(DBS12_SectionD_Layout1AssetClassificationsContext552);
                                        
                                            assetClassificationsValue556.setValue(zeroDBS12_SectionD_Layout1AssetClassificationsValue553);        
                                        
                                        
                                        JAXBElement<AssetClassifications> assetClassificationsElement557 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createAssetClassifications(assetClassificationsValue556);
                                        bodyElements.add(assetClassificationsElement557);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR558 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR558 = createUnitIfNotExist(INR558, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ProvisionForInvestment
                                
                                    Map zeroDBS12_SectionD_Layout1ProvisionForInvestmentMap562 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout1ProvisionForInvestmentValue560 = DBS12ReportUtil.retrieveValueForElement(field.getProvisionForInvestment(), zeroDBS12_SectionD_Layout1ProvisionForInvestmentMap562);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout1ProvisionForInvestmentFieldDataValue561 = DBS12ReportUtil.retrieveFieldDataForElement(field.getProvisionForInvestment(), zeroDBS12_SectionD_Layout1ProvisionForInvestmentMap562, "", "", "xs:date($refPeriodEndDate)");

                                        if(zeroDBS12_SectionD_Layout1ProvisionForInvestmentFieldDataValue561 != null ) {
                                            if(!zeroDBS12_SectionD_Layout1ProvisionForInvestmentFieldDataValue561.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout1ProvisionForInvestmentFieldDataValue561.getStartDateValue();
                                            if(!zeroDBS12_SectionD_Layout1ProvisionForInvestmentFieldDataValue561.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout1ProvisionForInvestmentFieldDataValue561.getEndDateValue();
                                            if(!zeroDBS12_SectionD_Layout1ProvisionForInvestmentFieldDataValue561.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout1ProvisionForInvestmentFieldDataValue561.getInstantDateValue();
                                        }

                                        
                                        Context DBS12_SectionD_Layout1ProvisionForInvestmentContext559 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionD_Layout1( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout1ProvisionForInvestmentValue560 != null && !"".equals(zeroDBS12_SectionD_Layout1ProvisionForInvestmentValue560)) {
                                        
                                        addContext(DBS12_SectionD_Layout1ProvisionForInvestmentContext559, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType provisionForInvestmentValue563 = new MonetaryItemType();
                                        provisionForInvestmentValue563.setContextRef(DBS12_SectionD_Layout1ProvisionForInvestmentContext559);
                                        
                                            provisionForInvestmentValue563.setUnitRef(INR558);
                                            provisionForInvestmentValue563.setDecimals("INF");
                                            provisionForInvestmentValue563.setValue(new BigDecimal(zeroDBS12_SectionD_Layout1ProvisionForInvestmentValue560));
                                        
                                        
                                        JAXBElement<MonetaryItemType> provisionForInvestmentElement564 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createProvisionForInvestment(provisionForInvestmentValue563);
                                        bodyElements.add(provisionForInvestmentElement564);
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
                                
                                    Map zeroDBS12_SectionD_Layout2TypeOfEntityMap568 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout2TypeOfEntityValue566 = DBS12ReportUtil.retrieveValueForElement(field.getTypeOfEntity(), zeroDBS12_SectionD_Layout2TypeOfEntityMap568);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout2TypeOfEntityFieldDataValue567 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTypeOfEntity(), zeroDBS12_SectionD_Layout2TypeOfEntityMap568, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                        if(zeroDBS12_SectionD_Layout2TypeOfEntityFieldDataValue567 != null ) {
                                            if(!zeroDBS12_SectionD_Layout2TypeOfEntityFieldDataValue567.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout2TypeOfEntityFieldDataValue567.getStartDateValue();
                                            if(!zeroDBS12_SectionD_Layout2TypeOfEntityFieldDataValue567.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout2TypeOfEntityFieldDataValue567.getEndDateValue();
                                            if(!zeroDBS12_SectionD_Layout2TypeOfEntityFieldDataValue567.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout2TypeOfEntityFieldDataValue567.getInstantDateValue();
                                        }

                                        
                                            Context DBS12_SectionD_Layout2TypeOfEntityContext565 = DBS12ReportContextUtil.createFromToContextDBS12_SectionD_Layout2( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis,nameOfInterestedDirectorManagerAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout2TypeOfEntityValue566 != null && !"".equals(zeroDBS12_SectionD_Layout2TypeOfEntityValue566)) {
                                        
                                        addContext(DBS12_SectionD_Layout2TypeOfEntityContext565, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        TypeOfEntity typeOfEntityValue569 = new TypeOfEntity();
                                        typeOfEntityValue569.setContextRef(DBS12_SectionD_Layout2TypeOfEntityContext565);
                                        
                                            typeOfEntityValue569.setValue(zeroDBS12_SectionD_Layout2TypeOfEntityValue566);        
                                        
                                        
                                        JAXBElement<TypeOfEntity> typeOfEntityElement570 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTypeOfEntity(typeOfEntityValue569);
                                        bodyElements.add(typeOfEntityElement570);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout2
                                // create unit if not empty
                                
                                
                                // - TypeOfExposures
                                
                                    Map zeroDBS12_SectionD_Layout2TypeOfExposuresMap574 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout2TypeOfExposuresValue572 = DBS12ReportUtil.retrieveValueForElement(field.getTypeOfExposures(), zeroDBS12_SectionD_Layout2TypeOfExposuresMap574);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout2TypeOfExposuresFieldDataValue573 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTypeOfExposures(), zeroDBS12_SectionD_Layout2TypeOfExposuresMap574, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                        if(zeroDBS12_SectionD_Layout2TypeOfExposuresFieldDataValue573 != null ) {
                                            if(!zeroDBS12_SectionD_Layout2TypeOfExposuresFieldDataValue573.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout2TypeOfExposuresFieldDataValue573.getStartDateValue();
                                            if(!zeroDBS12_SectionD_Layout2TypeOfExposuresFieldDataValue573.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout2TypeOfExposuresFieldDataValue573.getEndDateValue();
                                            if(!zeroDBS12_SectionD_Layout2TypeOfExposuresFieldDataValue573.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout2TypeOfExposuresFieldDataValue573.getInstantDateValue();
                                        }

                                        
                                            Context DBS12_SectionD_Layout2TypeOfExposuresContext571 = DBS12ReportContextUtil.createFromToContextDBS12_SectionD_Layout2( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis,nameOfInterestedDirectorManagerAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout2TypeOfExposuresValue572 != null && !"".equals(zeroDBS12_SectionD_Layout2TypeOfExposuresValue572)) {
                                        
                                        addContext(DBS12_SectionD_Layout2TypeOfExposuresContext571, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        TypeOfExposures typeOfExposuresValue575 = new TypeOfExposures();
                                        typeOfExposuresValue575.setContextRef(DBS12_SectionD_Layout2TypeOfExposuresContext571);
                                        
                                            typeOfExposuresValue575.setValue(zeroDBS12_SectionD_Layout2TypeOfExposuresValue572);        
                                        
                                        
                                        JAXBElement<TypeOfExposures> typeOfExposuresElement576 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTypeOfExposures(typeOfExposuresValue575);
                                        bodyElements.add(typeOfExposuresElement576);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout2
                                // create unit if not empty
                                
                                    
                                    Unit INR577 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR577 = createUnitIfNotExist(INR577, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExposureAmount
                                
                                    Map zeroDBS12_SectionD_Layout2ExposureAmountMap581 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout2ExposureAmountValue579 = DBS12ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBS12_SectionD_Layout2ExposureAmountMap581);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout2ExposureAmountFieldDataValue580 = DBS12ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), zeroDBS12_SectionD_Layout2ExposureAmountMap581, "", "", "xs:date($refPeriodEndDate)");

                                        if(zeroDBS12_SectionD_Layout2ExposureAmountFieldDataValue580 != null ) {
                                            if(!zeroDBS12_SectionD_Layout2ExposureAmountFieldDataValue580.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout2ExposureAmountFieldDataValue580.getStartDateValue();
                                            if(!zeroDBS12_SectionD_Layout2ExposureAmountFieldDataValue580.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout2ExposureAmountFieldDataValue580.getEndDateValue();
                                            if(!zeroDBS12_SectionD_Layout2ExposureAmountFieldDataValue580.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout2ExposureAmountFieldDataValue580.getInstantDateValue();
                                        }

                                        
                                        Context DBS12_SectionD_Layout2ExposureAmountContext578 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionD_Layout2( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis,nameOfInterestedDirectorManagerAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout2ExposureAmountValue579 != null && !"".equals(zeroDBS12_SectionD_Layout2ExposureAmountValue579)) {
                                        
                                        addContext(DBS12_SectionD_Layout2ExposureAmountContext578, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exposureAmountValue582 = new MonetaryItemType();
                                        exposureAmountValue582.setContextRef(DBS12_SectionD_Layout2ExposureAmountContext578);
                                        
                                            exposureAmountValue582.setUnitRef(INR577);
                                            exposureAmountValue582.setDecimals("INF");
                                            exposureAmountValue582.setValue(new BigDecimal(zeroDBS12_SectionD_Layout2ExposureAmountValue579));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exposureAmountElement583 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue582);
                                        bodyElements.add(exposureAmountElement583);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout2
                                // create unit if not empty
                                
                                
                                // - TermOfCreditExposure
                                
                                    Map zeroDBS12_SectionD_Layout2TermOfCreditExposureMap587 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout2TermOfCreditExposureValue585 = DBS12ReportUtil.retrieveValueForElement(field.getTermOfCreditExposure(), zeroDBS12_SectionD_Layout2TermOfCreditExposureMap587);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout2TermOfCreditExposureFieldDataValue586 = DBS12ReportUtil.retrieveFieldDataForElement(field.getTermOfCreditExposure(), zeroDBS12_SectionD_Layout2TermOfCreditExposureMap587, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                        if(zeroDBS12_SectionD_Layout2TermOfCreditExposureFieldDataValue586 != null ) {
                                            if(!zeroDBS12_SectionD_Layout2TermOfCreditExposureFieldDataValue586.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout2TermOfCreditExposureFieldDataValue586.getStartDateValue();
                                            if(!zeroDBS12_SectionD_Layout2TermOfCreditExposureFieldDataValue586.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout2TermOfCreditExposureFieldDataValue586.getEndDateValue();
                                            if(!zeroDBS12_SectionD_Layout2TermOfCreditExposureFieldDataValue586.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout2TermOfCreditExposureFieldDataValue586.getInstantDateValue();
                                        }

                                        
                                            Context DBS12_SectionD_Layout2TermOfCreditExposureContext584 = DBS12ReportContextUtil.createFromToContextDBS12_SectionD_Layout2( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis,nameOfInterestedDirectorManagerAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout2TermOfCreditExposureValue585 != null && !"".equals(zeroDBS12_SectionD_Layout2TermOfCreditExposureValue585)) {
                                        
                                        addContext(DBS12_SectionD_Layout2TermOfCreditExposureContext584, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        StringItemType termOfCreditExposureValue588 = new StringItemType();
                                        termOfCreditExposureValue588.setContextRef(DBS12_SectionD_Layout2TermOfCreditExposureContext584);
                                        
                                            termOfCreditExposureValue588.setValue(zeroDBS12_SectionD_Layout2TermOfCreditExposureValue585);        
                                        
                                        
                                        JAXBElement<StringItemType> termOfCreditExposureElement589 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createTermOfCreditExposure(termOfCreditExposureValue588);
                                        bodyElements.add(termOfCreditExposureElement589);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout2
                                // create unit if not empty
                                
                                    
                                    Unit INR590 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR590 = createUnitIfNotExist(INR590, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ValueOfSecuritiesCollateral
                                
                                    Map zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralMap594 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralValue592 = DBS12ReportUtil.retrieveValueForElement(field.getValueOfSecuritiesCollateral(), zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralMap594);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralFieldDataValue593 = DBS12ReportUtil.retrieveFieldDataForElement(field.getValueOfSecuritiesCollateral(), zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralMap594, "", "", "xs:date($refPeriodEndDate)");

                                        if(zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralFieldDataValue593 != null ) {
                                            if(!zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralFieldDataValue593.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralFieldDataValue593.getStartDateValue();
                                            if(!zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralFieldDataValue593.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralFieldDataValue593.getEndDateValue();
                                            if(!zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralFieldDataValue593.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralFieldDataValue593.getInstantDateValue();
                                        }

                                        
                                        Context DBS12_SectionD_Layout2ValueOfSecuritiesCollateralContext591 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionD_Layout2( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis,nameOfInterestedDirectorManagerAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralValue592 != null && !"".equals(zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralValue592)) {
                                        
                                        addContext(DBS12_SectionD_Layout2ValueOfSecuritiesCollateralContext591, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType valueOfSecuritiesCollateralValue595 = new MonetaryItemType();
                                        valueOfSecuritiesCollateralValue595.setContextRef(DBS12_SectionD_Layout2ValueOfSecuritiesCollateralContext591);
                                        
                                            valueOfSecuritiesCollateralValue595.setUnitRef(INR590);
                                            valueOfSecuritiesCollateralValue595.setDecimals("INF");
                                            valueOfSecuritiesCollateralValue595.setValue(new BigDecimal(zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralValue592));
                                        
                                        
                                        JAXBElement<MonetaryItemType> valueOfSecuritiesCollateralElement596 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createValueOfSecuritiesCollateral(valueOfSecuritiesCollateralValue595);
                                        bodyElements.add(valueOfSecuritiesCollateralElement596);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout2
                                // create unit if not empty
                                
                                
                                // - AssetClassifications
                                
                                    Map zeroDBS12_SectionD_Layout2AssetClassificationsMap600 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout2AssetClassificationsValue598 = DBS12ReportUtil.retrieveValueForElement(field.getAssetClassifications(), zeroDBS12_SectionD_Layout2AssetClassificationsMap600);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout2AssetClassificationsFieldDataValue599 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAssetClassifications(), zeroDBS12_SectionD_Layout2AssetClassificationsMap600, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");

                                        if(zeroDBS12_SectionD_Layout2AssetClassificationsFieldDataValue599 != null ) {
                                            if(!zeroDBS12_SectionD_Layout2AssetClassificationsFieldDataValue599.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout2AssetClassificationsFieldDataValue599.getStartDateValue();
                                            if(!zeroDBS12_SectionD_Layout2AssetClassificationsFieldDataValue599.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout2AssetClassificationsFieldDataValue599.getEndDateValue();
                                            if(!zeroDBS12_SectionD_Layout2AssetClassificationsFieldDataValue599.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout2AssetClassificationsFieldDataValue599.getInstantDateValue();
                                        }

                                        
                                            Context DBS12_SectionD_Layout2AssetClassificationsContext597 = DBS12ReportContextUtil.createFromToContextDBS12_SectionD_Layout2( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis,nameOfInterestedDirectorManagerAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout2AssetClassificationsValue598 != null && !"".equals(zeroDBS12_SectionD_Layout2AssetClassificationsValue598)) {
                                        
                                        addContext(DBS12_SectionD_Layout2AssetClassificationsContext597, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        AssetClassifications assetClassificationsValue601 = new AssetClassifications();
                                        assetClassificationsValue601.setContextRef(DBS12_SectionD_Layout2AssetClassificationsContext597);
                                        
                                            assetClassificationsValue601.setValue(zeroDBS12_SectionD_Layout2AssetClassificationsValue598);        
                                        
                                        
                                        JAXBElement<AssetClassifications> assetClassificationsElement602 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createAssetClassifications(assetClassificationsValue601);
                                        bodyElements.add(assetClassificationsElement602);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout2
                                // create unit if not empty
                                
                                    
                                    Unit INR603 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR603 = createUnitIfNotExist(INR603, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ProvisionForInvestment
                                
                                    Map zeroDBS12_SectionD_Layout2ProvisionForInvestmentMap607 = new HashMap<String, String>();
                                    
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout2ProvisionForInvestmentValue605 = DBS12ReportUtil.retrieveValueForElement(field.getProvisionForInvestment(), zeroDBS12_SectionD_Layout2ProvisionForInvestmentMap607);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS12_SectionD_Layout2ProvisionForInvestmentFieldDataValue606 = DBS12ReportUtil.retrieveFieldDataForElement(field.getProvisionForInvestment(), zeroDBS12_SectionD_Layout2ProvisionForInvestmentMap607, "", "", "xs:date($refPeriodEndDate)");

                                        if(zeroDBS12_SectionD_Layout2ProvisionForInvestmentFieldDataValue606 != null ) {
                                            if(!zeroDBS12_SectionD_Layout2ProvisionForInvestmentFieldDataValue606.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS12_SectionD_Layout2ProvisionForInvestmentFieldDataValue606.getStartDateValue();
                                            if(!zeroDBS12_SectionD_Layout2ProvisionForInvestmentFieldDataValue606.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS12_SectionD_Layout2ProvisionForInvestmentFieldDataValue606.getEndDateValue();
                                            if(!zeroDBS12_SectionD_Layout2ProvisionForInvestmentFieldDataValue606.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS12_SectionD_Layout2ProvisionForInvestmentFieldDataValue606.getInstantDateValue();
                                        }

                                        
                                        Context DBS12_SectionD_Layout2ProvisionForInvestmentContext604 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionD_Layout2( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis,nameOfInterestedDirectorManagerAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout2ProvisionForInvestmentValue605 != null && !"".equals(zeroDBS12_SectionD_Layout2ProvisionForInvestmentValue605)) {
                                        
                                        addContext(DBS12_SectionD_Layout2ProvisionForInvestmentContext604, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType provisionForInvestmentValue608 = new MonetaryItemType();
                                        provisionForInvestmentValue608.setContextRef(DBS12_SectionD_Layout2ProvisionForInvestmentContext604);
                                        
                                            provisionForInvestmentValue608.setUnitRef(INR603);
                                            provisionForInvestmentValue608.setDecimals("INF");
                                            provisionForInvestmentValue608.setValue(new BigDecimal(zeroDBS12_SectionD_Layout2ProvisionForInvestmentValue605));
                                        
                                        
                                        JAXBElement<MonetaryItemType> provisionForInvestmentElement609 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createProvisionForInvestment(provisionForInvestmentValue608);
                                        bodyElements.add(provisionForInvestmentElement609);
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
                            
                                Map zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryMap613 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryValue611 = DBS12ReportUtil.retrieveValueForElement(field.getNameOfSignatory(), zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryMap613);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue612 = DBS12ReportUtil.retrieveFieldDataForElement(field.getNameOfSignatory(), zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryMap613, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue612 != null ) {
                                        if(!zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue612.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue612.getStartDateValue();
                                        if(!zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue612.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue612.getEndDateValue();
                                        if(!zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue612.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue612.getInstantDateValue();
                                    }

                                    
                                        Context DBSAuthorisedSignatory_Layout1NameOfSignatoryContext610 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryValue611 != null && !"".equals(zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryValue611)) {
                                    
                                    addContext(DBSAuthorisedSignatory_Layout1NameOfSignatoryContext610, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType nameOfSignatoryValue614 = new StringItemType();
                                    nameOfSignatoryValue614.setContextRef(DBSAuthorisedSignatory_Layout1NameOfSignatoryContext610);
                                    
                                    nameOfSignatoryValue614.setValue(zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryValue611);        
                                    
                                    
                                    JAXBElement<StringItemType> nameOfSignatoryElement615 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNameOfSignatory(nameOfSignatoryValue614);
                                    bodyElements.add(nameOfSignatoryElement615);
                                
                            }
                        
                            
                            // - DesignationOfSignatory
                            
                                Map zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryMap619 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryValue617 = DBS12ReportUtil.retrieveValueForElement(field.getDesignationOfSignatory(), zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryMap619);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue618 = DBS12ReportUtil.retrieveFieldDataForElement(field.getDesignationOfSignatory(), zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryMap619, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue618 != null ) {
                                        if(!zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue618.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue618.getStartDateValue();
                                        if(!zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue618.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue618.getEndDateValue();
                                        if(!zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue618.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue618.getInstantDateValue();
                                    }

                                    
                                        Context DBSAuthorisedSignatory_Layout1DesignationOfSignatoryContext616 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryValue617 != null && !"".equals(zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryValue617)) {
                                    
                                    addContext(DBSAuthorisedSignatory_Layout1DesignationOfSignatoryContext616, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType designationOfSignatoryValue620 = new StringItemType();
                                    designationOfSignatoryValue620.setContextRef(DBSAuthorisedSignatory_Layout1DesignationOfSignatoryContext616);
                                    
                                    designationOfSignatoryValue620.setValue(zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryValue617);        
                                    
                                    
                                    JAXBElement<StringItemType> designationOfSignatoryElement621 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createDesignationOfSignatory(designationOfSignatoryValue620);
                                    bodyElements.add(designationOfSignatoryElement621);
                                
                            }
                        
                            
                            // - AuthorisedSignatoryOfficialLandlineNumber
                            
                                Map zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberMap625 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue623 = DBS12ReportUtil.retrieveValueForElement(field.getAuthorisedSignatoryOfficialLandlineNumber(), zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberMap625);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue624 = DBS12ReportUtil.retrieveFieldDataForElement(field.getAuthorisedSignatoryOfficialLandlineNumber(), zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberMap625, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue624 != null ) {
                                        if(!zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue624.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue624.getStartDateValue();
                                        if(!zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue624.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue624.getEndDateValue();
                                        if(!zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue624.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue624.getInstantDateValue();
                                    }

                                    
                                        Context DBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext622 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue623 != null && !"".equals(zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue623)) {
                                    
                                    addContext(DBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext622, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType authorisedSignatoryOfficialLandlineNumberValue626 = new StringItemType();
                                    authorisedSignatoryOfficialLandlineNumberValue626.setContextRef(DBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext622);
                                    
                                    authorisedSignatoryOfficialLandlineNumberValue626.setValue(zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue623);        
                                    
                                    
                                    JAXBElement<StringItemType> authorisedSignatoryOfficialLandlineNumberElement627 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createAuthorisedSignatoryOfficialLandlineNumber(authorisedSignatoryOfficialLandlineNumberValue626);
                                    bodyElements.add(authorisedSignatoryOfficialLandlineNumberElement627);
                                
                            }
                        
                            
                            // - MobileNumberOfAuthorisedSignatory
                            
                                Map zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryMap631 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue629 = DBS12ReportUtil.retrieveValueForElement(field.getMobileNumberOfAuthorisedSignatory(), zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryMap631);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue630 = DBS12ReportUtil.retrieveFieldDataForElement(field.getMobileNumberOfAuthorisedSignatory(), zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryMap631, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue630 != null ) {
                                        if(!zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue630.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue630.getStartDateValue();
                                        if(!zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue630.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue630.getEndDateValue();
                                        if(!zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue630.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue630.getInstantDateValue();
                                    }

                                    
                                        Context DBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext628 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue629 != null && !"".equals(zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue629)) {
                                    
                                    addContext(DBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext628, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType mobileNumberOfAuthorisedSignatoryValue632 = new StringItemType();
                                    mobileNumberOfAuthorisedSignatoryValue632.setContextRef(DBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext628);
                                    
                                    mobileNumberOfAuthorisedSignatoryValue632.setValue(zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue629);        
                                    
                                    
                                    JAXBElement<StringItemType> mobileNumberOfAuthorisedSignatoryElement633 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createMobileNumberOfAuthorisedSignatory(mobileNumberOfAuthorisedSignatoryValue632);
                                    bodyElements.add(mobileNumberOfAuthorisedSignatoryElement633);
                                
                            }
                        
                            
                            // - EMailIDOfAuthorisedReportingOfficial
                            
                                Map zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialMap637 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue635 = DBS12ReportUtil.retrieveValueForElement(field.getEMailIDOfAuthorisedReportingOfficial(), zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialMap637);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue636 = DBS12ReportUtil.retrieveFieldDataForElement(field.getEMailIDOfAuthorisedReportingOfficial(), zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialMap637, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue636 != null ) {
                                        if(!zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue636.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue636.getStartDateValue();
                                        if(!zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue636.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue636.getEndDateValue();
                                        if(!zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue636.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue636.getInstantDateValue();
                                    }

                                    
                                        Context DBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext634 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue635 != null && !"".equals(zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue635)) {
                                    
                                    addContext(DBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext634, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType eMailIDOfAuthorisedReportingOfficialValue638 = new StringItemType();
                                    eMailIDOfAuthorisedReportingOfficialValue638.setContextRef(DBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext634);
                                    
                                    eMailIDOfAuthorisedReportingOfficialValue638.setValue(zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue635);        
                                    
                                    
                                    JAXBElement<StringItemType> eMailIDOfAuthorisedReportingOfficialElement639 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createEMailIDOfAuthorisedReportingOfficial(eMailIDOfAuthorisedReportingOfficialValue638);
                                    bodyElements.add(eMailIDOfAuthorisedReportingOfficialElement639);
                                
                            }
                        
                            
                            // - Remarks
                            
                                Map zeroDBSAuthorisedSignatory_Layout1RemarksMap643 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBSAuthorisedSignatory_Layout1RemarksValue641 = DBS12ReportUtil.retrieveValueForElement(field.getRemarks(), zeroDBSAuthorisedSignatory_Layout1RemarksMap643);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSAuthorisedSignatory_Layout1RemarksFieldDataValue642 = DBS12ReportUtil.retrieveFieldDataForElement(field.getRemarks(), zeroDBSAuthorisedSignatory_Layout1RemarksMap643, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroDBSAuthorisedSignatory_Layout1RemarksFieldDataValue642 != null ) {
                                        if(!zeroDBSAuthorisedSignatory_Layout1RemarksFieldDataValue642.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSAuthorisedSignatory_Layout1RemarksFieldDataValue642.getStartDateValue();
                                        if(!zeroDBSAuthorisedSignatory_Layout1RemarksFieldDataValue642.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSAuthorisedSignatory_Layout1RemarksFieldDataValue642.getEndDateValue();
                                        if(!zeroDBSAuthorisedSignatory_Layout1RemarksFieldDataValue642.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSAuthorisedSignatory_Layout1RemarksFieldDataValue642.getInstantDateValue();
                                    }

                                    
                                        Context DBSAuthorisedSignatory_Layout1RemarksContext640 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBSAuthorisedSignatory_Layout1RemarksValue641 != null && !"".equals(zeroDBSAuthorisedSignatory_Layout1RemarksValue641)) {
                                    
                                    addContext(DBSAuthorisedSignatory_Layout1RemarksContext640, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType remarksValue644 = new StringItemType();
                                    remarksValue644.setContextRef(DBSAuthorisedSignatory_Layout1RemarksContext640);
                                    
                                    remarksValue644.setValue(zeroDBSAuthorisedSignatory_Layout1RemarksValue641);        
                                    
                                    
                                    JAXBElement<StringItemType> remarksElement645 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createRemarks(remarksValue644);
                                    bodyElements.add(remarksElement645);
                                
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
    
    

