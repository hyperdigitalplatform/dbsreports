package in.armedu.banking.report.rbixbrl.reports.dbs06;



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
import in.armedu.banking.report.rbixbrl.model.dbs06.*;
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
                        
                        import org.xbrl._2003.instance.MonetaryItemType;
                        
                        import org.xbrl.dtr.type.numeric.PercentItemType;
                        

@Setter
public class DBS06Report implements XBRLReportIntf {
       
    
    // logic for main method
    @Override
    public StringWriter generateReport(ReportData reportData){
        JAXBContext jc;
        Marshaller m;
        // TODO should be generated dynamically
        DBS06ReportData mainReportData = (DBS06ReportData) reportData;

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
            // TODO should be changed to specific xsd related to report dbs06
            simpleType.setHref("in-rbi-dbs06.xsd");
            xbrl.getSchemaRef().add(simpleType);
            xbrl.getOtherAttributes().put(new QName("xml:lang"), "en");
           
            
            // context identifiers and body elements
            List<String> contextIdentifiers = new ArrayList<String>();
            List<Context> contextElements = new ArrayList<Context>();
            List<Object> bodyElements = new ArrayList<Object>();
            List<String> unitIdentifiers = new ArrayList<String>();
            List<Unit> unitElements = new ArrayList<Unit>();
           
            //Unit unitObj = null;
            //DBS06ReportData dBS06ReportData = new DBS06ReportData();
            // print values           
    

            // TODO : create proper context with loop and element
            // initiatilize data class and allow to be set 
            //private DBS06ReportData dBS06ReportData = new DBS06ReportData();
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
                
                
                
                // create variable for subclass DBSLeverageRatioSolo_Layout1 if any typeMembers then List or Single
                DBSLeverageRatioSolo_Layout1 dBSLeverageRatioSolo_Layout1 = mainReportData.getDBSLeverageRatioSolo_Layout1();
                // method calling
                
                    dBSLeverageRatioSolo_Layout1Method(dBSLeverageRatioSolo_Layout1, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBSLeverageRatioSolo_Layout2 if any typeMembers then List or Single
                DBSLeverageRatioSolo_Layout2 dBSLeverageRatioSolo_Layout2 = mainReportData.getDBSLeverageRatioSolo_Layout2();
                // method calling
                
                    dBSLeverageRatioSolo_Layout2Method(dBSLeverageRatioSolo_Layout2, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBSLeverageRatioSolo_Layout3 if any typeMembers then List or Single
                DBSLeverageRatioSolo_Layout3 dBSLeverageRatioSolo_Layout3 = mainReportData.getDBSLeverageRatioSolo_Layout3();
                // method calling
                
                    dBSLeverageRatioSolo_Layout3Method(dBSLeverageRatioSolo_Layout3, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBSLeverageRatioSolo_Layout4 if any typeMembers then List or Single
                DBSLeverageRatioSolo_Layout4 dBSLeverageRatioSolo_Layout4 = mainReportData.getDBSLeverageRatioSolo_Layout4();
                // method calling
                
                    dBSLeverageRatioSolo_Layout4Method(dBSLeverageRatioSolo_Layout4, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBSLeverageRatioSolo_Layout5 if any typeMembers then List or Single
                DBSLeverageRatioSolo_Layout5 dBSLeverageRatioSolo_Layout5 = mainReportData.getDBSLeverageRatioSolo_Layout5();
                // method calling
                
                    dBSLeverageRatioSolo_Layout5Method(dBSLeverageRatioSolo_Layout5, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBSLeverageRatioConsolidated_Layout1 if any typeMembers then List or Single
                DBSLeverageRatioConsolidated_Layout1 dBSLeverageRatioConsolidated_Layout1 = mainReportData.getDBSLeverageRatioConsolidated_Layout1();
                // method calling
                
                    dBSLeverageRatioConsolidated_Layout1Method(dBSLeverageRatioConsolidated_Layout1, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBSLeverageRatioConsolidated_Layout2 if any typeMembers then List or Single
                DBSLeverageRatioConsolidated_Layout2 dBSLeverageRatioConsolidated_Layout2 = mainReportData.getDBSLeverageRatioConsolidated_Layout2();
                // method calling
                
                    dBSLeverageRatioConsolidated_Layout2Method(dBSLeverageRatioConsolidated_Layout2, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBSLeverageRatioConsolidated_Layout3 if any typeMembers then List or Single
                DBSLeverageRatioConsolidated_Layout3 dBSLeverageRatioConsolidated_Layout3 = mainReportData.getDBSLeverageRatioConsolidated_Layout3();
                // method calling
                
                    dBSLeverageRatioConsolidated_Layout3Method(dBSLeverageRatioConsolidated_Layout3, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBSLeverageRatioConsolidated_Layout4 if any typeMembers then List or Single
                DBSLeverageRatioConsolidated_Layout4 dBSLeverageRatioConsolidated_Layout4 = mainReportData.getDBSLeverageRatioConsolidated_Layout4();
                // method calling
                
                    dBSLeverageRatioConsolidated_Layout4Method(dBSLeverageRatioConsolidated_Layout4, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBSLeverageRatioConsolidated_Layout5 if any typeMembers then List or Single
                DBSLeverageRatioConsolidated_Layout5 dBSLeverageRatioConsolidated_Layout5 = mainReportData.getDBSLeverageRatioConsolidated_Layout5();
                // method calling
                
                    dBSLeverageRatioConsolidated_Layout5Method(dBSLeverageRatioConsolidated_Layout5, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                
                
                // if typemembers exist
                
                
                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReturnNameValue2 = DBS06ReportUtil.retrieveValueForElement(field.getReturnName(), zeroFilingInfo_Layout1ReturnNameMap4);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReturnNameFieldDataValue3 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReturnName(), zeroFilingInfo_Layout1ReturnNameMap4, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ReturnNameFieldDataValue3 != null ) {
                                        if(!zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1ReturnNameContext1 = DBS06ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReturnCodeValue8 = DBS06ReportUtil.retrieveValueForElement(field.getReturnCode(), zeroFilingInfo_Layout1ReturnCodeMap10);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReturnCodeFieldDataValue9 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReturnCode(), zeroFilingInfo_Layout1ReturnCodeMap10, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ReturnCodeFieldDataValue9 != null ) {
                                        if(!zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1ReturnCodeContext7 = DBS06ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1ReturnCodeValue8 != null && !"".equals(zeroFilingInfo_Layout1ReturnCodeValue8)) {
                                    
                                    addContext(FilingInfo_Layout1ReturnCodeContext7, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType returnCodeValue11 = new StringItemType();
                                    returnCodeValue11.setContextRef(FilingInfo_Layout1ReturnCodeContext7);
                                    
                                    returnCodeValue11.setValue(zeroFilingInfo_Layout1ReturnCodeValue8);        
                                    
                                    
                                    JAXBElement<StringItemType> returnCodeElement12 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReturnCode(returnCodeValue11);
                                    bodyElements.add(returnCodeElement12);
                                
                            }
                        
                            
                            // - BankCode
                            
                                Map zeroFilingInfo_Layout1BankCodeMap16 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1BankCodeValue14 = DBS06ReportUtil.retrieveValueForElement(field.getBankCode(), zeroFilingInfo_Layout1BankCodeMap16);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1BankCodeFieldDataValue15 = DBS06ReportUtil.retrieveFieldDataForElement(field.getBankCode(), zeroFilingInfo_Layout1BankCodeMap16, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroFilingInfo_Layout1BankCodeFieldDataValue15 != null ) {
                                        if(!zeroFilingInfo_Layout1BankCodeFieldDataValue15.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1BankCodeFieldDataValue15.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1BankCodeFieldDataValue15.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1BankCodeFieldDataValue15.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1BankCodeFieldDataValue15.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1BankCodeFieldDataValue15.getInstantDateValue();
                                    }

                                    
                                    Context FilingInfo_Layout1BankCodeContext13 = DBS06ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout1BankCodeValue14 != null && !"".equals(zeroFilingInfo_Layout1BankCodeValue14)) {
                                    
                                    addContext(FilingInfo_Layout1BankCodeContext13, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType bankCodeValue17 = new StringItemType();
                                    bankCodeValue17.setContextRef(FilingInfo_Layout1BankCodeContext13);
                                    
                                    bankCodeValue17.setValue(zeroFilingInfo_Layout1BankCodeValue14);        
                                    
                                    
                                    JAXBElement<StringItemType> bankCodeElement18 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createBankCode(bankCodeValue17);
                                    bodyElements.add(bankCodeElement18);
                                
                            }
                        
                            
                            // - NameOfReportingInstitution
                            
                                Map zeroFilingInfo_Layout1NameOfReportingInstitutionMap22 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1NameOfReportingInstitutionValue20 = DBS06ReportUtil.retrieveValueForElement(field.getNameOfReportingInstitution(), zeroFilingInfo_Layout1NameOfReportingInstitutionMap22);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue21 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNameOfReportingInstitution(), zeroFilingInfo_Layout1NameOfReportingInstitutionMap22, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue21 != null ) {
                                        if(!zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue21.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue21.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue21.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue21.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue21.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue21.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1NameOfReportingInstitutionContext19 = DBS06ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1NameOfReportingInstitutionValue20 != null && !"".equals(zeroFilingInfo_Layout1NameOfReportingInstitutionValue20)) {
                                    
                                    addContext(FilingInfo_Layout1NameOfReportingInstitutionContext19, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType nameOfReportingInstitutionValue23 = new StringItemType();
                                    nameOfReportingInstitutionValue23.setContextRef(FilingInfo_Layout1NameOfReportingInstitutionContext19);
                                    
                                    nameOfReportingInstitutionValue23.setValue(zeroFilingInfo_Layout1NameOfReportingInstitutionValue20);        
                                    
                                    
                                    JAXBElement<StringItemType> nameOfReportingInstitutionElement24 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNameOfReportingInstitution(nameOfReportingInstitutionValue23);
                                    bodyElements.add(nameOfReportingInstitutionElement24);
                                
                            }
                        
                            
                            // - InstitutionType
                            
                                Map zeroFilingInfo_Layout1InstitutionTypeMap28 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1InstitutionTypeValue26 = DBS06ReportUtil.retrieveValueForElement(field.getInstitutionType(), zeroFilingInfo_Layout1InstitutionTypeMap28);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27 = DBS06ReportUtil.retrieveFieldDataForElement(field.getInstitutionType(), zeroFilingInfo_Layout1InstitutionTypeMap28, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27 != null ) {
                                        if(!zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1InstitutionTypeContext25 = DBS06ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingFrequencyValue32 = DBS06ReportUtil.retrieveValueForElement(field.getReportingFrequency(), zeroFilingInfo_Layout1ReportingFrequencyMap34);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReportingFrequency(), zeroFilingInfo_Layout1ReportingFrequencyMap34, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1ReportingFrequencyContext31 = DBS06ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingPeriodStartDateValue38 = DBS06ReportUtil.retrieveValueForElement(field.getReportingPeriodStartDate(), zeroFilingInfo_Layout1ReportingPeriodStartDateMap40);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReportingPeriodStartDate(), zeroFilingInfo_Layout1ReportingPeriodStartDateMap40, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getInstantDateValue();
                                    }

                                    
                                    Context FilingInfo_Layout1ReportingPeriodStartDateContext37 = DBS06ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout1ReportingPeriodStartDateValue38 != null && !"".equals(zeroFilingInfo_Layout1ReportingPeriodStartDateValue38)) {
                                    
                                    addContext(FilingInfo_Layout1ReportingPeriodStartDateContext37, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    DateItemType reportingPeriodStartDateValue41 = new DateItemType();
                                    reportingPeriodStartDateValue41.setContextRef(FilingInfo_Layout1ReportingPeriodStartDateContext37);
                                    
                                    reportingPeriodStartDateValue41.setValue(DBS06ReportContextUtil.toXMLGeo(zeroFilingInfo_Layout1ReportingPeriodStartDateValue38));
                                    
                                    
                                    JAXBElement<DateItemType> reportingPeriodStartDateElement42 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReportingPeriodStartDate(reportingPeriodStartDateValue41);
                                    bodyElements.add(reportingPeriodStartDateElement42);
                                
                            }
                        
                            
                            // - ReportingPeriodEndDate
                            
                                Map zeroFilingInfo_Layout1ReportingPeriodEndDateMap46 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingPeriodEndDateValue44 = DBS06ReportUtil.retrieveValueForElement(field.getReportingPeriodEndDate(), zeroFilingInfo_Layout1ReportingPeriodEndDateMap46);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReportingPeriodEndDate(), zeroFilingInfo_Layout1ReportingPeriodEndDateMap46, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getInstantDateValue();
                                    }

                                    
                                    Context FilingInfo_Layout1ReportingPeriodEndDateContext43 = DBS06ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout1ReportingPeriodEndDateValue44 != null && !"".equals(zeroFilingInfo_Layout1ReportingPeriodEndDateValue44)) {
                                    
                                    addContext(FilingInfo_Layout1ReportingPeriodEndDateContext43, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    DateItemType reportingPeriodEndDateValue47 = new DateItemType();
                                    reportingPeriodEndDateValue47.setContextRef(FilingInfo_Layout1ReportingPeriodEndDateContext43);
                                    
                                    reportingPeriodEndDateValue47.setValue(DBS06ReportContextUtil.toXMLGeo(zeroFilingInfo_Layout1ReportingPeriodEndDateValue44));
                                    
                                    
                                    JAXBElement<DateItemType> reportingPeriodEndDateElement48 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReportingPeriodEndDate(reportingPeriodEndDateValue47);
                                    bodyElements.add(reportingPeriodEndDateElement48);
                                
                            }
                        
                            
                            // - ReportingCurrency
                            
                                Map zeroFilingInfo_Layout1ReportingCurrencyMap52 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingCurrencyValue50 = DBS06ReportUtil.retrieveValueForElement(field.getReportingCurrency(), zeroFilingInfo_Layout1ReportingCurrencyMap52);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReportingCurrency(), zeroFilingInfo_Layout1ReportingCurrencyMap52, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1ReportingCurrencyContext49 = DBS06ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingScaleValue56 = DBS06ReportUtil.retrieveValueForElement(field.getReportingScale(), zeroFilingInfo_Layout1ReportingScaleMap58);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReportingScaleFieldDataValue57 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReportingScale(), zeroFilingInfo_Layout1ReportingScaleMap58, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ReportingScaleFieldDataValue57 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1ReportingScaleContext55 = DBS06ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1TaxonomyVersionValue62 = DBS06ReportUtil.retrieveValueForElement(field.getTaxonomyVersion(), zeroFilingInfo_Layout1TaxonomyVersionMap64);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63 = DBS06ReportUtil.retrieveFieldDataForElement(field.getTaxonomyVersion(), zeroFilingInfo_Layout1TaxonomyVersionMap64, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63 != null ) {
                                        if(!zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1TaxonomyVersionContext61 = DBS06ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ToolNameValue68 = DBS06ReportUtil.retrieveValueForElement(field.getToolName(), zeroFilingInfo_Layout1ToolNameMap70);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ToolNameFieldDataValue69 = DBS06ReportUtil.retrieveFieldDataForElement(field.getToolName(), zeroFilingInfo_Layout1ToolNameMap70, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ToolNameFieldDataValue69 != null ) {
                                        if(!zeroFilingInfo_Layout1ToolNameFieldDataValue69.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ToolNameFieldDataValue69.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ToolNameFieldDataValue69.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ToolNameFieldDataValue69.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ToolNameFieldDataValue69.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ToolNameFieldDataValue69.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1ToolNameContext67 = DBS06ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ToolVersionValue74 = DBS06ReportUtil.retrieveValueForElement(field.getToolVersion(), zeroFilingInfo_Layout1ToolVersionMap76);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ToolVersionFieldDataValue75 = DBS06ReportUtil.retrieveFieldDataForElement(field.getToolVersion(), zeroFilingInfo_Layout1ToolVersionMap76, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ToolVersionFieldDataValue75 != null ) {
                                        if(!zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1ToolVersionContext73 = DBS06ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReportStatusValue80 = DBS06ReportUtil.retrieveValueForElement(field.getReportStatus(), zeroFilingInfo_Layout1ReportStatusMap82);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReportStatusFieldDataValue81 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReportStatus(), zeroFilingInfo_Layout1ReportStatusMap82, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ReportStatusFieldDataValue81 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1ReportStatusContext79 = DBS06ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1DateOfAuditValue86 = DBS06ReportUtil.retrieveValueForElement(field.getDateOfAudit(), zeroFilingInfo_Layout1DateOfAuditMap88);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1DateOfAuditFieldDataValue87 = DBS06ReportUtil.retrieveFieldDataForElement(field.getDateOfAudit(), zeroFilingInfo_Layout1DateOfAuditMap88, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroFilingInfo_Layout1DateOfAuditFieldDataValue87 != null ) {
                                        if(!zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getInstantDateValue();
                                    }

                                    
                                    Context FilingInfo_Layout1DateOfAuditContext85 = DBS06ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout1DateOfAuditValue86 != null && !"".equals(zeroFilingInfo_Layout1DateOfAuditValue86)) {
                                    
                                    addContext(FilingInfo_Layout1DateOfAuditContext85, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    DateItemType dateOfAuditValue89 = new DateItemType();
                                    dateOfAuditValue89.setContextRef(FilingInfo_Layout1DateOfAuditContext85);
                                    
                                    dateOfAuditValue89.setValue(DBS06ReportContextUtil.toXMLGeo(zeroFilingInfo_Layout1DateOfAuditValue86));
                                    
                                    
                                    JAXBElement<DateItemType> dateOfAuditElement90 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createDateOfAudit(dateOfAuditValue89);
                                    bodyElements.add(dateOfAuditElement90);
                                
                            }
                        
                            
                            // - GeneralRemarks
                            
                                Map zeroFilingInfo_Layout1GeneralRemarksMap94 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1GeneralRemarksValue92 = DBS06ReportUtil.retrieveValueForElement(field.getGeneralRemarks(), zeroFilingInfo_Layout1GeneralRemarksMap94);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93 = DBS06ReportUtil.retrieveFieldDataForElement(field.getGeneralRemarks(), zeroFilingInfo_Layout1GeneralRemarksMap94, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93 != null ) {
                                        if(!zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1GeneralRemarksContext91 = DBS06ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                    
                    
                        
                        
                            
                            // - WhetherBankHasSubsidiaries
                            
                                Map zeroFilingInfo_Layout2WhetherBankHasSubsidiariesMap100 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout2WhetherBankHasSubsidiariesValue98 = DBS06ReportUtil.retrieveValueForElement(field.getWhetherBankHasSubsidiaries(), zeroFilingInfo_Layout2WhetherBankHasSubsidiariesMap100);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout2WhetherBankHasSubsidiariesFieldDataValue99 = DBS06ReportUtil.retrieveFieldDataForElement(field.getWhetherBankHasSubsidiaries(), zeroFilingInfo_Layout2WhetherBankHasSubsidiariesMap100, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroFilingInfo_Layout2WhetherBankHasSubsidiariesFieldDataValue99 != null ) {
                                        if(!zeroFilingInfo_Layout2WhetherBankHasSubsidiariesFieldDataValue99.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout2WhetherBankHasSubsidiariesFieldDataValue99.getStartDateValue();
                                        if(!zeroFilingInfo_Layout2WhetherBankHasSubsidiariesFieldDataValue99.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout2WhetherBankHasSubsidiariesFieldDataValue99.getEndDateValue();
                                        if(!zeroFilingInfo_Layout2WhetherBankHasSubsidiariesFieldDataValue99.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout2WhetherBankHasSubsidiariesFieldDataValue99.getInstantDateValue();
                                    }

                                    
                                    Context FilingInfo_Layout2WhetherBankHasSubsidiariesContext97 = DBS06ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout2WhetherBankHasSubsidiariesValue98 != null && !"".equals(zeroFilingInfo_Layout2WhetherBankHasSubsidiariesValue98)) {
                                    
                                    addContext(FilingInfo_Layout2WhetherBankHasSubsidiariesContext97, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    BooleanItemType whetherBankHasSubsidiariesValue101 = new BooleanItemType();
                                    whetherBankHasSubsidiariesValue101.setContextRef(FilingInfo_Layout2WhetherBankHasSubsidiariesContext97);
                                    
                                        whetherBankHasSubsidiariesValue101.setValue(Boolean.getBoolean(zeroFilingInfo_Layout2WhetherBankHasSubsidiariesValue98));
                                    
                                    
                                    JAXBElement<BooleanItemType> whetherBankHasSubsidiariesElement102 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherBankHasSubsidiaries(whetherBankHasSubsidiariesValue101);
                                    bodyElements.add(whetherBankHasSubsidiariesElement102);
                                
                            }
                        
                        
                    
                    
            
                    
                    
                    
                    return "";
                    }

                
                    
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBSLeverageRatioSolo_Layout1 if any typeMembers then List or Single
                //DBSLeverageRatioSolo_Layout1 dBSLeverageRatioSolo_Layout1 = mainReportData.getDBSLeverageRatioSolo_Layout1();
                
                    private String dBSLeverageRatioSolo_Layout1Method(DBSLeverageRatioSolo_Layout1 dBSLeverageRatioSolo_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                
                    {
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                    DBSLeverageRatioSolo_Layout1 field = dBSLeverageRatioSolo_Layout1;
                    
                    
                    
            
                    
                    
                        
                            
                            
                                
                                Unit INR103 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR103 = createUnitIfNotExist(INR103, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            
                                
                                Map explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap105 = new HashMap<String, String>();
                                
                                
                                explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap105.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:DomesticSovereignsMember");                
                                
                                        
                                        
                                        
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap105.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                String explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticSovereignsMemberValue106 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap105);
                            
                                startDate = startDateDefault;
                                endDate = endDateDefault;
                                periodDate = periodDateDefault;
                                FieldDataValue explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticSovereignsMemberFieldDataValue107 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap105, "", "", "xs:date($refPeriodEndDate)" );

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticSovereignsMemberFieldDataValue107 != null ) {
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticSovereignsMemberFieldDataValue107.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticSovereignsMemberFieldDataValue107.getStartDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticSovereignsMemberFieldDataValue107.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticSovereignsMemberFieldDataValue107.getEndDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticSovereignsMemberFieldDataValue107.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticSovereignsMemberFieldDataValue107.getInstantDateValue();
                                }

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticSovereignsMemberValue106 != null && !"".equals(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticSovereignsMemberValue106)) {
                                
                                    
                                        Context explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext104 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap105 );
                                        
                                    
                                    addContext(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext104, contextElements, contextIdentifiers);
                                    
                                
                                    // create element JAXB Element
                
                                    MonetaryItemType explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticSovereignsMemberDataType109 = new MonetaryItemType();
                                    explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticSovereignsMemberDataType109.setContextRef(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext104);
                                    
                                    
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticSovereignsMemberDataType109.setUnitRef(INR103);
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticSovereignsMemberDataType109.setDecimals("INF");
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticSovereignsMemberDataType109.setValue(new BigDecimal(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticSovereignsMemberValue106));
                                    
                                    
                                    JAXBElement<MonetaryItemType> explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticSovereignsMemberElement108 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticSovereignsMemberDataType109);
                                    bodyElements.add(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticSovereignsMemberElement108);
                                
                                }
                                // if uniquenamevalue is empty then don't do anything
                            

                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR110 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR110 = createUnitIfNotExist(INR110, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            
                                
                                Map explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap112 = new HashMap<String, String>();
                                
                                
                                explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap112.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:ForeignSovereignsMember");                
                                
                                        
                                        
                                        
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap112.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                String explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignSovereignsMemberValue113 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap112);
                            
                                startDate = startDateDefault;
                                endDate = endDateDefault;
                                periodDate = periodDateDefault;
                                FieldDataValue explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignSovereignsMemberFieldDataValue114 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap112, "", "", "xs:date($refPeriodEndDate)" );

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignSovereignsMemberFieldDataValue114 != null ) {
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignSovereignsMemberFieldDataValue114.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignSovereignsMemberFieldDataValue114.getStartDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignSovereignsMemberFieldDataValue114.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignSovereignsMemberFieldDataValue114.getEndDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignSovereignsMemberFieldDataValue114.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignSovereignsMemberFieldDataValue114.getInstantDateValue();
                                }

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignSovereignsMemberValue113 != null && !"".equals(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignSovereignsMemberValue113)) {
                                
                                    
                                        Context explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext111 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap112 );
                                        
                                    
                                    addContext(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext111, contextElements, contextIdentifiers);
                                    
                                
                                    // create element JAXB Element
                
                                    MonetaryItemType explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignSovereignsMemberDataType116 = new MonetaryItemType();
                                    explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignSovereignsMemberDataType116.setContextRef(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext111);
                                    
                                    
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignSovereignsMemberDataType116.setUnitRef(INR110);
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignSovereignsMemberDataType116.setDecimals("INF");
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignSovereignsMemberDataType116.setValue(new BigDecimal(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignSovereignsMemberValue113));
                                    
                                    
                                    JAXBElement<MonetaryItemType> explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignSovereignsMemberElement115 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignSovereignsMemberDataType116);
                                    bodyElements.add(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignSovereignsMemberElement115);
                                
                                }
                                // if uniquenamevalue is empty then don't do anything
                            

                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR117 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR117 = createUnitIfNotExist(INR117, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            
                                
                                Map explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap119 = new HashMap<String, String>();
                                
                                
                                explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap119.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:BanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMember");                
                                
                                        
                                        
                                        
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap119.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                String explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberValue120 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap119);
                            
                                startDate = startDateDefault;
                                endDate = endDateDefault;
                                periodDate = periodDateDefault;
                                FieldDataValue explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberFieldDataValue121 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap119, "", "", "xs:date($refPeriodEndDate)" );

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberFieldDataValue121 != null ) {
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberFieldDataValue121.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberFieldDataValue121.getStartDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberFieldDataValue121.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberFieldDataValue121.getEndDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberFieldDataValue121.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberFieldDataValue121.getInstantDateValue();
                                }

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberValue120 != null && !"".equals(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberValue120)) {
                                
                                    
                                        Context explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext118 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap119 );
                                        
                                    
                                    addContext(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext118, contextElements, contextIdentifiers);
                                    
                                
                                    // create element JAXB Element
                
                                    MonetaryItemType explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberDataType123 = new MonetaryItemType();
                                    explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberDataType123.setContextRef(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext118);
                                    
                                    
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberDataType123.setUnitRef(INR117);
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberDataType123.setDecimals("INF");
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberDataType123.setValue(new BigDecimal(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberValue120));
                                    
                                    
                                    JAXBElement<MonetaryItemType> explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberElement122 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberDataType123);
                                    bodyElements.add(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberElement122);
                                
                                }
                                // if uniquenamevalue is empty then don't do anything
                            

                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR124 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR124 = createUnitIfNotExist(INR124, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            
                                
                                Map explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap126 = new HashMap<String, String>();
                                
                                
                                explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap126.put("rbi-core:LeverageRatioExposureAxis", "in-rbi-rep:ForeignBanksMember");                
                                
                                        
                                        
                                        
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap126.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                String explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignBanksMemberValue127 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap126);
                            
                                startDate = startDateDefault;
                                endDate = endDateDefault;
                                periodDate = periodDateDefault;
                                FieldDataValue explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignBanksMemberFieldDataValue128 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap126, "", "", "xs:date($refPeriodEndDate)" );

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignBanksMemberFieldDataValue128 != null ) {
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignBanksMemberFieldDataValue128.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignBanksMemberFieldDataValue128.getStartDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignBanksMemberFieldDataValue128.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignBanksMemberFieldDataValue128.getEndDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignBanksMemberFieldDataValue128.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignBanksMemberFieldDataValue128.getInstantDateValue();
                                }

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignBanksMemberValue127 != null && !"".equals(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignBanksMemberValue127)) {
                                
                                    
                                        Context explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext125 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap126 );
                                        
                                    
                                    addContext(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext125, contextElements, contextIdentifiers);
                                    
                                
                                    // create element JAXB Element
                
                                    MonetaryItemType explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignBanksMemberDataType130 = new MonetaryItemType();
                                    explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignBanksMemberDataType130.setContextRef(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext125);
                                    
                                    
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignBanksMemberDataType130.setUnitRef(INR124);
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignBanksMemberDataType130.setDecimals("INF");
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignBanksMemberDataType130.setValue(new BigDecimal(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignBanksMemberValue127));
                                    
                                    
                                    JAXBElement<MonetaryItemType> explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignBanksMemberElement129 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignBanksMemberDataType130);
                                    bodyElements.add(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignBanksMemberElement129);
                                
                                }
                                // if uniquenamevalue is empty then don't do anything
                            

                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR131 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR131 = createUnitIfNotExist(INR131, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            
                                
                                Map explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap133 = new HashMap<String, String>();
                                
                                
                                explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap133.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:DomesticPublicSectorEntitiesMember");                
                                
                                        
                                        
                                        
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap133.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                String explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticPublicSectorEntitiesMemberValue134 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap133);
                            
                                startDate = startDateDefault;
                                endDate = endDateDefault;
                                periodDate = periodDateDefault;
                                FieldDataValue explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticPublicSectorEntitiesMemberFieldDataValue135 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap133, "", "", "xs:date($refPeriodEndDate)" );

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticPublicSectorEntitiesMemberFieldDataValue135 != null ) {
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticPublicSectorEntitiesMemberFieldDataValue135.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticPublicSectorEntitiesMemberFieldDataValue135.getStartDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticPublicSectorEntitiesMemberFieldDataValue135.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticPublicSectorEntitiesMemberFieldDataValue135.getEndDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticPublicSectorEntitiesMemberFieldDataValue135.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticPublicSectorEntitiesMemberFieldDataValue135.getInstantDateValue();
                                }

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticPublicSectorEntitiesMemberValue134 != null && !"".equals(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticPublicSectorEntitiesMemberValue134)) {
                                
                                    
                                        Context explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext132 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap133 );
                                        
                                    
                                    addContext(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext132, contextElements, contextIdentifiers);
                                    
                                
                                    // create element JAXB Element
                
                                    MonetaryItemType explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticPublicSectorEntitiesMemberDataType137 = new MonetaryItemType();
                                    explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticPublicSectorEntitiesMemberDataType137.setContextRef(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext132);
                                    
                                    
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticPublicSectorEntitiesMemberDataType137.setUnitRef(INR131);
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticPublicSectorEntitiesMemberDataType137.setDecimals("INF");
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticPublicSectorEntitiesMemberDataType137.setValue(new BigDecimal(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticPublicSectorEntitiesMemberValue134));
                                    
                                    
                                    JAXBElement<MonetaryItemType> explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticPublicSectorEntitiesMemberElement136 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticPublicSectorEntitiesMemberDataType137);
                                    bodyElements.add(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisDomesticPublicSectorEntitiesMemberElement136);
                                
                                }
                                // if uniquenamevalue is empty then don't do anything
                            

                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR138 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR138 = createUnitIfNotExist(INR138, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            
                                
                                Map explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap140 = new HashMap<String, String>();
                                
                                
                                explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap140.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:ForeignPublicSectorEntitiesMember");                
                                
                                        
                                        
                                        
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap140.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                String explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignPublicSectorEntitiesMemberValue141 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap140);
                            
                                startDate = startDateDefault;
                                endDate = endDateDefault;
                                periodDate = periodDateDefault;
                                FieldDataValue explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignPublicSectorEntitiesMemberFieldDataValue142 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap140, "", "", "xs:date($refPeriodEndDate)" );

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignPublicSectorEntitiesMemberFieldDataValue142 != null ) {
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignPublicSectorEntitiesMemberFieldDataValue142.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignPublicSectorEntitiesMemberFieldDataValue142.getStartDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignPublicSectorEntitiesMemberFieldDataValue142.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignPublicSectorEntitiesMemberFieldDataValue142.getEndDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignPublicSectorEntitiesMemberFieldDataValue142.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignPublicSectorEntitiesMemberFieldDataValue142.getInstantDateValue();
                                }

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignPublicSectorEntitiesMemberValue141 != null && !"".equals(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignPublicSectorEntitiesMemberValue141)) {
                                
                                    
                                        Context explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext139 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap140 );
                                        
                                    
                                    addContext(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext139, contextElements, contextIdentifiers);
                                    
                                
                                    // create element JAXB Element
                
                                    MonetaryItemType explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignPublicSectorEntitiesMemberDataType144 = new MonetaryItemType();
                                    explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignPublicSectorEntitiesMemberDataType144.setContextRef(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext139);
                                    
                                    
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignPublicSectorEntitiesMemberDataType144.setUnitRef(INR138);
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignPublicSectorEntitiesMemberDataType144.setDecimals("INF");
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignPublicSectorEntitiesMemberDataType144.setValue(new BigDecimal(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignPublicSectorEntitiesMemberValue141));
                                    
                                    
                                    JAXBElement<MonetaryItemType> explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignPublicSectorEntitiesMemberElement143 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignPublicSectorEntitiesMemberDataType144);
                                    bodyElements.add(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisForeignPublicSectorEntitiesMemberElement143);
                                
                                }
                                // if uniquenamevalue is empty then don't do anything
                            

                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR145 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR145 = createUnitIfNotExist(INR145, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            
                                
                                Map explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap147 = new HashMap<String, String>();
                                
                                
                                explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap147.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:PrimaryDealersMember");                
                                
                                        
                                        
                                        
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap147.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                String explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisPrimaryDealersMemberValue148 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap147);
                            
                                startDate = startDateDefault;
                                endDate = endDateDefault;
                                periodDate = periodDateDefault;
                                FieldDataValue explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisPrimaryDealersMemberFieldDataValue149 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap147, "", "", "xs:date($refPeriodEndDate)" );

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisPrimaryDealersMemberFieldDataValue149 != null ) {
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisPrimaryDealersMemberFieldDataValue149.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisPrimaryDealersMemberFieldDataValue149.getStartDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisPrimaryDealersMemberFieldDataValue149.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisPrimaryDealersMemberFieldDataValue149.getEndDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisPrimaryDealersMemberFieldDataValue149.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisPrimaryDealersMemberFieldDataValue149.getInstantDateValue();
                                }

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisPrimaryDealersMemberValue148 != null && !"".equals(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisPrimaryDealersMemberValue148)) {
                                
                                    
                                        Context explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext146 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap147 );
                                        
                                    
                                    addContext(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext146, contextElements, contextIdentifiers);
                                    
                                
                                    // create element JAXB Element
                
                                    MonetaryItemType explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisPrimaryDealersMemberDataType151 = new MonetaryItemType();
                                    explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisPrimaryDealersMemberDataType151.setContextRef(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext146);
                                    
                                    
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisPrimaryDealersMemberDataType151.setUnitRef(INR145);
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisPrimaryDealersMemberDataType151.setDecimals("INF");
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisPrimaryDealersMemberDataType151.setValue(new BigDecimal(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisPrimaryDealersMemberValue148));
                                    
                                    
                                    JAXBElement<MonetaryItemType> explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisPrimaryDealersMemberElement150 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisPrimaryDealersMemberDataType151);
                                    bodyElements.add(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisPrimaryDealersMemberElement150);
                                
                                }
                                // if uniquenamevalue is empty then don't do anything
                            

                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR152 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR152 = createUnitIfNotExist(INR152, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            
                                
                                Map explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap154 = new HashMap<String, String>();
                                
                                
                                explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap154.put("rbi-core:LeverageRatioExposureAxis", "in-rbi-rep:CorporateMember");                
                                
                                        
                                        
                                        
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap154.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                String explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisCorporateMemberValue155 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap154);
                            
                                startDate = startDateDefault;
                                endDate = endDateDefault;
                                periodDate = periodDateDefault;
                                FieldDataValue explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisCorporateMemberFieldDataValue156 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap154, "", "", "xs:date($refPeriodEndDate)" );

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisCorporateMemberFieldDataValue156 != null ) {
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisCorporateMemberFieldDataValue156.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisCorporateMemberFieldDataValue156.getStartDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisCorporateMemberFieldDataValue156.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisCorporateMemberFieldDataValue156.getEndDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisCorporateMemberFieldDataValue156.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisCorporateMemberFieldDataValue156.getInstantDateValue();
                                }

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisCorporateMemberValue155 != null && !"".equals(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisCorporateMemberValue155)) {
                                
                                    
                                        Context explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext153 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap154 );
                                        
                                    
                                    addContext(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext153, contextElements, contextIdentifiers);
                                    
                                
                                    // create element JAXB Element
                
                                    MonetaryItemType explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisCorporateMemberDataType158 = new MonetaryItemType();
                                    explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisCorporateMemberDataType158.setContextRef(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext153);
                                    
                                    
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisCorporateMemberDataType158.setUnitRef(INR152);
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisCorporateMemberDataType158.setDecimals("INF");
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisCorporateMemberDataType158.setValue(new BigDecimal(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisCorporateMemberValue155));
                                    
                                    
                                    JAXBElement<MonetaryItemType> explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisCorporateMemberElement157 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisCorporateMemberDataType158);
                                    bodyElements.add(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisCorporateMemberElement157);
                                
                                }
                                // if uniquenamevalue is empty then don't do anything
                            

                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR159 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR159 = createUnitIfNotExist(INR159, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            
                                
                                Map explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap161 = new HashMap<String, String>();
                                
                                
                                explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap161.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:ExposureToCCPsMember");                
                                
                                        
                                        
                                        
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap161.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                String explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCCPsMemberValue162 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap161);
                            
                                startDate = startDateDefault;
                                endDate = endDateDefault;
                                periodDate = periodDateDefault;
                                FieldDataValue explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCCPsMemberFieldDataValue163 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap161, "", "", "xs:date($refPeriodEndDate)" );

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCCPsMemberFieldDataValue163 != null ) {
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCCPsMemberFieldDataValue163.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCCPsMemberFieldDataValue163.getStartDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCCPsMemberFieldDataValue163.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCCPsMemberFieldDataValue163.getEndDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCCPsMemberFieldDataValue163.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCCPsMemberFieldDataValue163.getInstantDateValue();
                                }

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCCPsMemberValue162 != null && !"".equals(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCCPsMemberValue162)) {
                                
                                    
                                        Context explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext160 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap161 );
                                        
                                    
                                    addContext(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext160, contextElements, contextIdentifiers);
                                    
                                
                                    // create element JAXB Element
                
                                    MonetaryItemType explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCCPsMemberDataType165 = new MonetaryItemType();
                                    explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCCPsMemberDataType165.setContextRef(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext160);
                                    
                                    
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCCPsMemberDataType165.setUnitRef(INR159);
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCCPsMemberDataType165.setDecimals("INF");
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCCPsMemberDataType165.setValue(new BigDecimal(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCCPsMemberValue162));
                                    
                                    
                                    JAXBElement<MonetaryItemType> explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCCPsMemberElement164 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCCPsMemberDataType165);
                                    bodyElements.add(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCCPsMemberElement164);
                                
                                }
                                // if uniquenamevalue is empty then don't do anything
                            

                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR166 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR166 = createUnitIfNotExist(INR166, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            
                                
                                Map explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap168 = new HashMap<String, String>();
                                
                                
                                explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap168.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:ExposureToCapitalOfCCPsMember");                
                                
                                        
                                        
                                        
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap168.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                String explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCapitalOfCCPsMemberValue169 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap168);
                            
                                startDate = startDateDefault;
                                endDate = endDateDefault;
                                periodDate = periodDateDefault;
                                FieldDataValue explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCapitalOfCCPsMemberFieldDataValue170 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap168, "", "", "xs:date($refPeriodEndDate)" );

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCapitalOfCCPsMemberFieldDataValue170 != null ) {
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCapitalOfCCPsMemberFieldDataValue170.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCapitalOfCCPsMemberFieldDataValue170.getStartDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCapitalOfCCPsMemberFieldDataValue170.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCapitalOfCCPsMemberFieldDataValue170.getEndDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCapitalOfCCPsMemberFieldDataValue170.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCapitalOfCCPsMemberFieldDataValue170.getInstantDateValue();
                                }

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCapitalOfCCPsMemberValue169 != null && !"".equals(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCapitalOfCCPsMemberValue169)) {
                                
                                    
                                        Context explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext167 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap168 );
                                        
                                    
                                    addContext(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext167, contextElements, contextIdentifiers);
                                    
                                
                                    // create element JAXB Element
                
                                    MonetaryItemType explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCapitalOfCCPsMemberDataType172 = new MonetaryItemType();
                                    explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCapitalOfCCPsMemberDataType172.setContextRef(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext167);
                                    
                                    
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCapitalOfCCPsMemberDataType172.setUnitRef(INR166);
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCapitalOfCCPsMemberDataType172.setDecimals("INF");
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCapitalOfCCPsMemberDataType172.setValue(new BigDecimal(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCapitalOfCCPsMemberValue169));
                                    
                                    
                                    JAXBElement<MonetaryItemType> explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCapitalOfCCPsMemberElement171 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCapitalOfCCPsMemberDataType172);
                                    bodyElements.add(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToCapitalOfCCPsMemberElement171);
                                
                                }
                                // if uniquenamevalue is empty then don't do anything
                            

                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR173 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR173 = createUnitIfNotExist(INR173, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            
                                
                                Map explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap175 = new HashMap<String, String>();
                                
                                
                                explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap175.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:ExposureToDefaultFundContributionOfCCPsMember");                
                                
                                        
                                        
                                        
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap175.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                String explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToDefaultFundContributionOfCCPsMemberValue176 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap175);
                            
                                startDate = startDateDefault;
                                endDate = endDateDefault;
                                periodDate = periodDateDefault;
                                FieldDataValue explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToDefaultFundContributionOfCCPsMemberFieldDataValue177 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap175, "", "", "xs:date($refPeriodEndDate)" );

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToDefaultFundContributionOfCCPsMemberFieldDataValue177 != null ) {
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToDefaultFundContributionOfCCPsMemberFieldDataValue177.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToDefaultFundContributionOfCCPsMemberFieldDataValue177.getStartDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToDefaultFundContributionOfCCPsMemberFieldDataValue177.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToDefaultFundContributionOfCCPsMemberFieldDataValue177.getEndDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToDefaultFundContributionOfCCPsMemberFieldDataValue177.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToDefaultFundContributionOfCCPsMemberFieldDataValue177.getInstantDateValue();
                                }

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToDefaultFundContributionOfCCPsMemberValue176 != null && !"".equals(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToDefaultFundContributionOfCCPsMemberValue176)) {
                                
                                    
                                        Context explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext174 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap175 );
                                        
                                    
                                    addContext(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext174, contextElements, contextIdentifiers);
                                    
                                
                                    // create element JAXB Element
                
                                    MonetaryItemType explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToDefaultFundContributionOfCCPsMemberDataType179 = new MonetaryItemType();
                                    explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToDefaultFundContributionOfCCPsMemberDataType179.setContextRef(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext174);
                                    
                                    
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToDefaultFundContributionOfCCPsMemberDataType179.setUnitRef(INR173);
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToDefaultFundContributionOfCCPsMemberDataType179.setDecimals("INF");
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToDefaultFundContributionOfCCPsMemberDataType179.setValue(new BigDecimal(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToDefaultFundContributionOfCCPsMemberValue176));
                                    
                                    
                                    JAXBElement<MonetaryItemType> explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToDefaultFundContributionOfCCPsMemberElement178 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToDefaultFundContributionOfCCPsMemberDataType179);
                                    bodyElements.add(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisExposureToDefaultFundContributionOfCCPsMemberElement178);
                                
                                }
                                // if uniquenamevalue is empty then don't do anything
                            

                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR180 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR180 = createUnitIfNotExist(INR180, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            
                                
                                Map explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap182 = new HashMap<String, String>();
                                
                                
                                explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap182.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:OtherExposureToCCPsMember");                
                                
                                        
                                        
                                        
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap182.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                String explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOtherExposureToCCPsMemberValue183 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap182);
                            
                                startDate = startDateDefault;
                                endDate = endDateDefault;
                                periodDate = periodDateDefault;
                                FieldDataValue explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOtherExposureToCCPsMemberFieldDataValue184 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap182, "", "", "xs:date($refPeriodEndDate)" );

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOtherExposureToCCPsMemberFieldDataValue184 != null ) {
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOtherExposureToCCPsMemberFieldDataValue184.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOtherExposureToCCPsMemberFieldDataValue184.getStartDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOtherExposureToCCPsMemberFieldDataValue184.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOtherExposureToCCPsMemberFieldDataValue184.getEndDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOtherExposureToCCPsMemberFieldDataValue184.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOtherExposureToCCPsMemberFieldDataValue184.getInstantDateValue();
                                }

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOtherExposureToCCPsMemberValue183 != null && !"".equals(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOtherExposureToCCPsMemberValue183)) {
                                
                                    
                                        Context explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext181 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap182 );
                                        
                                    
                                    addContext(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext181, contextElements, contextIdentifiers);
                                    
                                
                                    // create element JAXB Element
                
                                    MonetaryItemType explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOtherExposureToCCPsMemberDataType186 = new MonetaryItemType();
                                    explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOtherExposureToCCPsMemberDataType186.setContextRef(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext181);
                                    
                                    
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOtherExposureToCCPsMemberDataType186.setUnitRef(INR180);
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOtherExposureToCCPsMemberDataType186.setDecimals("INF");
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOtherExposureToCCPsMemberDataType186.setValue(new BigDecimal(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOtherExposureToCCPsMemberValue183));
                                    
                                    
                                    JAXBElement<MonetaryItemType> explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOtherExposureToCCPsMemberElement185 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOtherExposureToCCPsMemberDataType186);
                                    bodyElements.add(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOtherExposureToCCPsMemberElement185);
                                
                                }
                                // if uniquenamevalue is empty then don't do anything
                            

                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR187 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR187 = createUnitIfNotExist(INR187, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            
                                
                                Map explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap189 = new HashMap<String, String>();
                                
                                
                                explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap189.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AllOtherExposuresMember");                
                                
                                        
                                        
                                        
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap189.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                String explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisAllOtherExposuresMemberValue190 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap189);
                            
                                startDate = startDateDefault;
                                endDate = endDateDefault;
                                periodDate = periodDateDefault;
                                FieldDataValue explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisAllOtherExposuresMemberFieldDataValue191 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap189, "", "", "xs:date($refPeriodEndDate)" );

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisAllOtherExposuresMemberFieldDataValue191 != null ) {
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisAllOtherExposuresMemberFieldDataValue191.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisAllOtherExposuresMemberFieldDataValue191.getStartDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisAllOtherExposuresMemberFieldDataValue191.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisAllOtherExposuresMemberFieldDataValue191.getEndDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisAllOtherExposuresMemberFieldDataValue191.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisAllOtherExposuresMemberFieldDataValue191.getInstantDateValue();
                                }

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisAllOtherExposuresMemberValue190 != null && !"".equals(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisAllOtherExposuresMemberValue190)) {
                                
                                    
                                        Context explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext188 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap189 );
                                        
                                    
                                    addContext(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext188, contextElements, contextIdentifiers);
                                    
                                
                                    // create element JAXB Element
                
                                    MonetaryItemType explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisAllOtherExposuresMemberDataType193 = new MonetaryItemType();
                                    explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisAllOtherExposuresMemberDataType193.setContextRef(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext188);
                                    
                                    
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisAllOtherExposuresMemberDataType193.setUnitRef(INR187);
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisAllOtherExposuresMemberDataType193.setDecimals("INF");
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisAllOtherExposuresMemberDataType193.setValue(new BigDecimal(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisAllOtherExposuresMemberValue190));
                                    
                                    
                                    JAXBElement<MonetaryItemType> explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisAllOtherExposuresMemberElement192 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisAllOtherExposuresMemberDataType193);
                                    bodyElements.add(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisAllOtherExposuresMemberElement192);
                                
                                }
                                // if uniquenamevalue is empty then don't do anything
                            

                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR194 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR194 = createUnitIfNotExist(INR194, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            
                                
                                Map explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap196 = new HashMap<String, String>();
                                
                                
                                explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap196.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:BalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMember");                
                                
                                        
                                        
                                        
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap196.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                String explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberValue197 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap196);
                            
                                startDate = startDateDefault;
                                endDate = endDateDefault;
                                periodDate = periodDateDefault;
                                FieldDataValue explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberFieldDataValue198 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap196, "", "", "xs:date($refPeriodEndDate)" );

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberFieldDataValue198 != null ) {
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberFieldDataValue198.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberFieldDataValue198.getStartDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberFieldDataValue198.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberFieldDataValue198.getEndDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberFieldDataValue198.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberFieldDataValue198.getInstantDateValue();
                                }

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberValue197 != null && !"".equals(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberValue197)) {
                                
                                    
                                        Context explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext195 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap196 );
                                        
                                    
                                    addContext(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext195, contextElements, contextIdentifiers);
                                    
                                
                                    // create element JAXB Element
                
                                    MonetaryItemType explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberDataType200 = new MonetaryItemType();
                                    explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberDataType200.setContextRef(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext195);
                                    
                                    
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberDataType200.setUnitRef(INR194);
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberDataType200.setDecimals("INF");
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberDataType200.setValue(new BigDecimal(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberValue197));
                                    
                                    
                                    JAXBElement<MonetaryItemType> explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberElement199 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberDataType200);
                                    bodyElements.add(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberElement199);
                                
                                }
                                // if uniquenamevalue is empty then don't do anything
                            

                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR201 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR201 = createUnitIfNotExist(INR201, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            
                                
                                Map explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap203 = new HashMap<String, String>();
                                
                                
                                explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap203.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:FiduciaryAssetsMember");                
                                
                                        
                                        
                                        
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap203.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                String explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisFiduciaryAssetsMemberValue204 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap203);
                            
                                startDate = startDateDefault;
                                endDate = endDateDefault;
                                periodDate = periodDateDefault;
                                FieldDataValue explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisFiduciaryAssetsMemberFieldDataValue205 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap203, "", "", "xs:date($refPeriodEndDate)" );

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisFiduciaryAssetsMemberFieldDataValue205 != null ) {
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisFiduciaryAssetsMemberFieldDataValue205.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisFiduciaryAssetsMemberFieldDataValue205.getStartDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisFiduciaryAssetsMemberFieldDataValue205.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisFiduciaryAssetsMemberFieldDataValue205.getEndDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisFiduciaryAssetsMemberFieldDataValue205.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisFiduciaryAssetsMemberFieldDataValue205.getInstantDateValue();
                                }

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisFiduciaryAssetsMemberValue204 != null && !"".equals(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisFiduciaryAssetsMemberValue204)) {
                                
                                    
                                        Context explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext202 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap203 );
                                        
                                    
                                    addContext(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext202, contextElements, contextIdentifiers);
                                    
                                
                                    // create element JAXB Element
                
                                    MonetaryItemType explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisFiduciaryAssetsMemberDataType207 = new MonetaryItemType();
                                    explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisFiduciaryAssetsMemberDataType207.setContextRef(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext202);
                                    
                                    
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisFiduciaryAssetsMemberDataType207.setUnitRef(INR201);
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisFiduciaryAssetsMemberDataType207.setDecimals("INF");
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisFiduciaryAssetsMemberDataType207.setValue(new BigDecimal(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisFiduciaryAssetsMemberValue204));
                                    
                                    
                                    JAXBElement<MonetaryItemType> explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisFiduciaryAssetsMemberElement206 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisFiduciaryAssetsMemberDataType207);
                                    bodyElements.add(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisFiduciaryAssetsMemberElement206);
                                
                                }
                                // if uniquenamevalue is empty then don't do anything
                            

                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR208 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR208 = createUnitIfNotExist(INR208, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            
                                
                                Map explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap210 = new HashMap<String, String>();
                                
                                
                                explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap210.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:OnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMember");                
                                
                                        
                                        
                                        
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap210.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                String explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberValue211 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap210);
                            
                                startDate = startDateDefault;
                                endDate = endDateDefault;
                                periodDate = periodDateDefault;
                                FieldDataValue explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberFieldDataValue212 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap210, "", "", "xs:date($refPeriodEndDate)" );

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberFieldDataValue212 != null ) {
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberFieldDataValue212.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberFieldDataValue212.getStartDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberFieldDataValue212.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberFieldDataValue212.getEndDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberFieldDataValue212.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberFieldDataValue212.getInstantDateValue();
                                }

                                if(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberValue211 != null && !"".equals(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberValue211)) {
                                
                                    
                                        Context explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext209 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisMap210 );
                                        
                                    
                                    addContext(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext209, contextElements, contextIdentifiers);
                                    
                                
                                    // create element JAXB Element
                
                                    MonetaryItemType explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberDataType214 = new MonetaryItemType();
                                    explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberDataType214.setContextRef(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisContext209);
                                    
                                    
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberDataType214.setUnitRef(INR208);
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberDataType214.setDecimals("INF");
                                        explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberDataType214.setValue(new BigDecimal(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberValue211));
                                    
                                    
                                    JAXBElement<MonetaryItemType> explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberElement213 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberDataType214);
                                    bodyElements.add(explictMember1DBSLeverageRatioSolo_Layout1ExposureAmountLeverageRatioExposureAxisOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberElement213);
                                
                                }
                                // if uniquenamevalue is empty then don't do anything
                            

                            
                        
                        
                        
                    
                    
                    return "";
                    }

                
                    
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBSLeverageRatioSolo_Layout2 if any typeMembers then List or Single
                //DBSLeverageRatioSolo_Layout2 dBSLeverageRatioSolo_Layout2 = mainReportData.getDBSLeverageRatioSolo_Layout2();
                
                    private String dBSLeverageRatioSolo_Layout2Method(DBSLeverageRatioSolo_Layout2 dBSLeverageRatioSolo_Layout2, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                
                    {
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                    DBSLeverageRatioSolo_Layout2 field = dBSLeverageRatioSolo_Layout2;
                    
                    
                        
                        
                            
                                
                                Unit pure215 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                pure215 = createUnitIfNotExist(pure215, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                
                            
                            // - CreditConversionFactor
                            
                                Map zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap219 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap219.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap219.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:UnconditionallyCancellableCreditCardsCommitmentsMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorValue217 = DBS06ReportUtil.retrieveValueForElement(field.getCreditConversionFactor(), zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap219);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue218 = DBS06ReportUtil.retrieveFieldDataForElement(field.getCreditConversionFactor(), zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap219, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue218 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue218.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue218.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue218.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue218.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue218.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue218.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout2CreditConversionFactorContext216 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap219 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorValue217 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorValue217)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout2CreditConversionFactorContext216, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    PercentItemType creditConversionFactorValue220 = new PercentItemType();
                                    creditConversionFactorValue220.setContextRef(DBSLeverageRatioSolo_Layout2CreditConversionFactorContext216);
                                    
                                    creditConversionFactorValue220.setUnitRef(pure215);
                                    creditConversionFactorValue220.setDecimals("INF");
                                    creditConversionFactorValue220.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorValue217));
                                    
                                    
                                    JAXBElement<PercentItemType> creditConversionFactorElement221 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createCreditConversionFactor(creditConversionFactorValue220);
                                    bodyElements.add(creditConversionFactorElement221);
                                
                            }
                        
                            
                                
                                Unit pure222 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                pure222 = createUnitIfNotExist(pure222, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                
                            
                            // - CreditConversionFactor
                            
                                Map zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap226 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap226.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap226.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:OtherUnconditionallyCancellableCommitmentsMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorValue224 = DBS06ReportUtil.retrieveValueForElement(field.getCreditConversionFactor(), zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap226);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue225 = DBS06ReportUtil.retrieveFieldDataForElement(field.getCreditConversionFactor(), zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap226, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue225 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue225.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue225.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue225.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue225.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue225.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue225.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout2CreditConversionFactorContext223 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap226 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorValue224 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorValue224)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout2CreditConversionFactorContext223, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    PercentItemType creditConversionFactorValue227 = new PercentItemType();
                                    creditConversionFactorValue227.setContextRef(DBSLeverageRatioSolo_Layout2CreditConversionFactorContext223);
                                    
                                    creditConversionFactorValue227.setUnitRef(pure222);
                                    creditConversionFactorValue227.setDecimals("INF");
                                    creditConversionFactorValue227.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorValue224));
                                    
                                    
                                    JAXBElement<PercentItemType> creditConversionFactorElement228 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createCreditConversionFactor(creditConversionFactorValue227);
                                    bodyElements.add(creditConversionFactorElement228);
                                
                            }
                        
                            
                                
                                Unit pure229 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                pure229 = createUnitIfNotExist(pure229, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                
                            
                            // - CreditConversionFactor
                            
                                Map zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap233 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap233.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap233.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:OtherOffBalanceSheetItemsWith10PercentCreditConversionFactorMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorValue231 = DBS06ReportUtil.retrieveValueForElement(field.getCreditConversionFactor(), zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap233);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue232 = DBS06ReportUtil.retrieveFieldDataForElement(field.getCreditConversionFactor(), zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap233, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue232 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue232.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue232.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue232.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue232.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue232.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue232.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout2CreditConversionFactorContext230 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap233 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorValue231 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorValue231)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout2CreditConversionFactorContext230, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    PercentItemType creditConversionFactorValue234 = new PercentItemType();
                                    creditConversionFactorValue234.setContextRef(DBSLeverageRatioSolo_Layout2CreditConversionFactorContext230);
                                    
                                    creditConversionFactorValue234.setUnitRef(pure229);
                                    creditConversionFactorValue234.setDecimals("INF");
                                    creditConversionFactorValue234.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorValue231));
                                    
                                    
                                    JAXBElement<PercentItemType> creditConversionFactorElement235 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createCreditConversionFactor(creditConversionFactorValue234);
                                    bodyElements.add(creditConversionFactorElement235);
                                
                            }
                        
                            
                                
                                Unit pure236 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                pure236 = createUnitIfNotExist(pure236, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                
                            
                            // - CreditConversionFactor
                            
                                Map zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap240 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap240.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap240.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:OffBalanceSheetItemsWith20PercentCreditConversionFactorMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorValue238 = DBS06ReportUtil.retrieveValueForElement(field.getCreditConversionFactor(), zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap240);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue239 = DBS06ReportUtil.retrieveFieldDataForElement(field.getCreditConversionFactor(), zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap240, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue239 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue239.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue239.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue239.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue239.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue239.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue239.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout2CreditConversionFactorContext237 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap240 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorValue238 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorValue238)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout2CreditConversionFactorContext237, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    PercentItemType creditConversionFactorValue241 = new PercentItemType();
                                    creditConversionFactorValue241.setContextRef(DBSLeverageRatioSolo_Layout2CreditConversionFactorContext237);
                                    
                                    creditConversionFactorValue241.setUnitRef(pure236);
                                    creditConversionFactorValue241.setDecimals("INF");
                                    creditConversionFactorValue241.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorValue238));
                                    
                                    
                                    JAXBElement<PercentItemType> creditConversionFactorElement242 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createCreditConversionFactor(creditConversionFactorValue241);
                                    bodyElements.add(creditConversionFactorElement242);
                                
                            }
                        
                            
                                
                                Unit pure243 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                pure243 = createUnitIfNotExist(pure243, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                
                            
                            // - CreditConversionFactor
                            
                                Map zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap247 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap247.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap247.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:OffBalanceSheetItemsWith50PercentCreditConversionFactorMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorValue245 = DBS06ReportUtil.retrieveValueForElement(field.getCreditConversionFactor(), zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap247);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue246 = DBS06ReportUtil.retrieveFieldDataForElement(field.getCreditConversionFactor(), zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap247, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue246 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue246.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue246.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue246.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue246.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue246.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue246.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout2CreditConversionFactorContext244 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap247 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorValue245 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorValue245)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout2CreditConversionFactorContext244, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    PercentItemType creditConversionFactorValue248 = new PercentItemType();
                                    creditConversionFactorValue248.setContextRef(DBSLeverageRatioSolo_Layout2CreditConversionFactorContext244);
                                    
                                    creditConversionFactorValue248.setUnitRef(pure243);
                                    creditConversionFactorValue248.setDecimals("INF");
                                    creditConversionFactorValue248.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorValue245));
                                    
                                    
                                    JAXBElement<PercentItemType> creditConversionFactorElement249 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createCreditConversionFactor(creditConversionFactorValue248);
                                    bodyElements.add(creditConversionFactorElement249);
                                
                            }
                        
                            
                                
                                Unit pure250 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                pure250 = createUnitIfNotExist(pure250, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                
                            
                            // - CreditConversionFactor
                            
                                Map zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap254 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap254.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap254.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:OffBalanceSheetItemsWith100PercentCreditConversionFactorMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorValue252 = DBS06ReportUtil.retrieveValueForElement(field.getCreditConversionFactor(), zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap254);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue253 = DBS06ReportUtil.retrieveFieldDataForElement(field.getCreditConversionFactor(), zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap254, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue253 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue253.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue253.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue253.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue253.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue253.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorFieldDataValue253.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout2CreditConversionFactorContext251 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorMap254 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorValue252 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorValue252)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout2CreditConversionFactorContext251, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    PercentItemType creditConversionFactorValue255 = new PercentItemType();
                                    creditConversionFactorValue255.setContextRef(DBSLeverageRatioSolo_Layout2CreditConversionFactorContext251);
                                    
                                    creditConversionFactorValue255.setUnitRef(pure250);
                                    creditConversionFactorValue255.setDecimals("INF");
                                    creditConversionFactorValue255.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout2CreditConversionFactorValue252));
                                    
                                    
                                    JAXBElement<PercentItemType> creditConversionFactorElement256 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createCreditConversionFactor(creditConversionFactorValue255);
                                    bodyElements.add(creditConversionFactorElement256);
                                
                            }
                        
                        
                    
                    
            
                    
                    
                    
                    return "";
                    }

                
                    
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBSLeverageRatioSolo_Layout3 if any typeMembers then List or Single
                //DBSLeverageRatioSolo_Layout3 dBSLeverageRatioSolo_Layout3 = mainReportData.getDBSLeverageRatioSolo_Layout3();
                
                    private String dBSLeverageRatioSolo_Layout3Method(DBSLeverageRatioSolo_Layout3 dBSLeverageRatioSolo_Layout3, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                
                    {
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                    DBSLeverageRatioSolo_Layout3 field = dBSLeverageRatioSolo_Layout3;
                    
                    
                        
                        
                            
                                
                                Unit INR257 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR257 = createUnitIfNotExist(INR257, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap261 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap261.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap261.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:CreditDerivativesProtectionSoldMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue259 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap261);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue260 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap261, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue260 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue260.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue260.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue260.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue260.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue260.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue260.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext258 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap261 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue259 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue259)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext258, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue262 = new MonetaryItemType();
                                    notionalPrincipalAmountValue262.setContextRef(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext258);
                                    
                                    notionalPrincipalAmountValue262.setUnitRef(INR257);
                                    notionalPrincipalAmountValue262.setDecimals("INF");
                                    notionalPrincipalAmountValue262.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue259));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement263 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue262);
                                    bodyElements.add(notionalPrincipalAmountElement263);
                                
                            }
                        
                            
                                
                                Unit INR264 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR264 = createUnitIfNotExist(INR264, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap268 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap268.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap268.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:CreditDerivativesProtectionSoldMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue266 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap268);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue267 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap268, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue267 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue267.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue267.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue267.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue267.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue267.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue267.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3ReplacementCostContext265 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap268 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue266 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue266)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3ReplacementCostContext265, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue269 = new MonetaryItemType();
                                    replacementCostValue269.setContextRef(DBSLeverageRatioSolo_Layout3ReplacementCostContext265);
                                    
                                    replacementCostValue269.setUnitRef(INR264);
                                    replacementCostValue269.setDecimals("INF");
                                    replacementCostValue269.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue266));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement270 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue269);
                                    bodyElements.add(replacementCostElement270);
                                
                            }
                        
                            
                                
                                Unit INR271 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR271 = createUnitIfNotExist(INR271, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - PotentialFutureExposure
                            
                                Map zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap275 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap275.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap275.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:CreditDerivativesProtectionSoldMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue273 = DBS06ReportUtil.retrieveValueForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap275);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue274 = DBS06ReportUtil.retrieveFieldDataForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap275, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue274 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue274.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue274.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue274.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue274.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue274.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue274.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext272 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap275 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue273 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue273)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext272, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType potentialFutureExposureValue276 = new MonetaryItemType();
                                    potentialFutureExposureValue276.setContextRef(DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext272);
                                    
                                    potentialFutureExposureValue276.setUnitRef(INR271);
                                    potentialFutureExposureValue276.setDecimals("INF");
                                    potentialFutureExposureValue276.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue273));
                                    
                                    
                                    JAXBElement<MonetaryItemType> potentialFutureExposureElement277 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createPotentialFutureExposure(potentialFutureExposureValue276);
                                    bodyElements.add(potentialFutureExposureElement277);
                                
                            }
                        
                            
                                
                                Unit INR278 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR278 = createUnitIfNotExist(INR278, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap282 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap282.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap282.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:CreditDerivativesProtectionBoughtMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue280 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap282);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue281 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap282, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue281 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue281.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue281.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue281.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue281.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue281.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue281.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext279 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap282 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue280 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue280)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext279, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue283 = new MonetaryItemType();
                                    notionalPrincipalAmountValue283.setContextRef(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext279);
                                    
                                    notionalPrincipalAmountValue283.setUnitRef(INR278);
                                    notionalPrincipalAmountValue283.setDecimals("INF");
                                    notionalPrincipalAmountValue283.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue280));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement284 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue283);
                                    bodyElements.add(notionalPrincipalAmountElement284);
                                
                            }
                        
                            
                                
                                Unit INR285 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR285 = createUnitIfNotExist(INR285, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap289 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap289.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap289.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:CreditDerivativesProtectionBoughtMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue287 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap289);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue288 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap289, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue288 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue288.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue288.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue288.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue288.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue288.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue288.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3ReplacementCostContext286 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap289 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue287 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue287)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3ReplacementCostContext286, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue290 = new MonetaryItemType();
                                    replacementCostValue290.setContextRef(DBSLeverageRatioSolo_Layout3ReplacementCostContext286);
                                    
                                    replacementCostValue290.setUnitRef(INR285);
                                    replacementCostValue290.setDecimals("INF");
                                    replacementCostValue290.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue287));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement291 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue290);
                                    bodyElements.add(replacementCostElement291);
                                
                            }
                        
                            
                                
                                Unit INR292 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR292 = createUnitIfNotExist(INR292, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - PotentialFutureExposure
                            
                                Map zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap296 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap296.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap296.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:CreditDerivativesProtectionBoughtMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue294 = DBS06ReportUtil.retrieveValueForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap296);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue295 = DBS06ReportUtil.retrieveFieldDataForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap296, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue295 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue295.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue295.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue295.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue295.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue295.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue295.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext293 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap296 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue294 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue294)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext293, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType potentialFutureExposureValue297 = new MonetaryItemType();
                                    potentialFutureExposureValue297.setContextRef(DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext293);
                                    
                                    potentialFutureExposureValue297.setUnitRef(INR292);
                                    potentialFutureExposureValue297.setDecimals("INF");
                                    potentialFutureExposureValue297.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue294));
                                    
                                    
                                    JAXBElement<MonetaryItemType> potentialFutureExposureElement298 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createPotentialFutureExposure(potentialFutureExposureValue297);
                                    bodyElements.add(potentialFutureExposureElement298);
                                
                            }
                        
                            
                                
                                Unit INR299 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR299 = createUnitIfNotExist(INR299, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap303 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap303.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap303.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:FinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue301 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap303);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue302 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap303, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue302 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue302.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue302.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue302.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue302.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue302.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue302.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext300 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap303 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue301 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue301)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext300, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue304 = new MonetaryItemType();
                                    notionalPrincipalAmountValue304.setContextRef(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext300);
                                    
                                    notionalPrincipalAmountValue304.setUnitRef(INR299);
                                    notionalPrincipalAmountValue304.setDecimals("INF");
                                    notionalPrincipalAmountValue304.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue301));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement305 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue304);
                                    bodyElements.add(notionalPrincipalAmountElement305);
                                
                            }
                        
                            
                                
                                Unit INR306 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR306 = createUnitIfNotExist(INR306, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap310 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap310.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap310.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:FinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue308 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap310);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue309 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap310, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue309 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue309.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue309.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue309.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue309.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue309.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue309.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3ReplacementCostContext307 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap310 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue308 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue308)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3ReplacementCostContext307, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue311 = new MonetaryItemType();
                                    replacementCostValue311.setContextRef(DBSLeverageRatioSolo_Layout3ReplacementCostContext307);
                                    
                                    replacementCostValue311.setUnitRef(INR306);
                                    replacementCostValue311.setDecimals("INF");
                                    replacementCostValue311.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue308));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement312 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue311);
                                    bodyElements.add(replacementCostElement312);
                                
                            }
                        
                            
                                
                                Unit INR313 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR313 = createUnitIfNotExist(INR313, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - PotentialFutureExposure
                            
                                Map zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap317 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap317.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap317.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:FinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue315 = DBS06ReportUtil.retrieveValueForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap317);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue316 = DBS06ReportUtil.retrieveFieldDataForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap317, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue316 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue316.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue316.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue316.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue316.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue316.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue316.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext314 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap317 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue315 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue315)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext314, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType potentialFutureExposureValue318 = new MonetaryItemType();
                                    potentialFutureExposureValue318.setContextRef(DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext314);
                                    
                                    potentialFutureExposureValue318.setUnitRef(INR313);
                                    potentialFutureExposureValue318.setDecimals("INF");
                                    potentialFutureExposureValue318.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue315));
                                    
                                    
                                    JAXBElement<MonetaryItemType> potentialFutureExposureElement319 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createPotentialFutureExposure(potentialFutureExposureValue318);
                                    bodyElements.add(potentialFutureExposureElement319);
                                
                            }
                        
                            
                                
                                Unit INR320 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR320 = createUnitIfNotExist(INR320, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap324 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap324.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap324.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue322 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap324);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue323 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap324, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue323 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue323.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue323.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue323.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue323.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue323.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue323.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext321 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap324 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue322 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue322)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext321, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue325 = new MonetaryItemType();
                                    notionalPrincipalAmountValue325.setContextRef(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext321);
                                    
                                    notionalPrincipalAmountValue325.setUnitRef(INR320);
                                    notionalPrincipalAmountValue325.setDecimals("INF");
                                    notionalPrincipalAmountValue325.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue322));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement326 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue325);
                                    bodyElements.add(notionalPrincipalAmountElement326);
                                
                            }
                        
                            
                                
                                Unit INR327 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR327 = createUnitIfNotExist(INR327, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap331 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap331.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap331.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue329 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap331);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue330 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap331, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue330 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue330.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue330.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue330.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue330.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue330.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue330.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3ReplacementCostContext328 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap331 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue329 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue329)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3ReplacementCostContext328, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue332 = new MonetaryItemType();
                                    replacementCostValue332.setContextRef(DBSLeverageRatioSolo_Layout3ReplacementCostContext328);
                                    
                                    replacementCostValue332.setUnitRef(INR327);
                                    replacementCostValue332.setDecimals("INF");
                                    replacementCostValue332.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue329));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement333 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue332);
                                    bodyElements.add(replacementCostElement333);
                                
                            }
                        
                            
                                
                                Unit INR334 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR334 = createUnitIfNotExist(INR334, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - PotentialFutureExposure
                            
                                Map zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap338 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap338.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap338.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue336 = DBS06ReportUtil.retrieveValueForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap338);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue337 = DBS06ReportUtil.retrieveFieldDataForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap338, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue337 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue337.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue337.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue337.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue337.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue337.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue337.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext335 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap338 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue336 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue336)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext335, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType potentialFutureExposureValue339 = new MonetaryItemType();
                                    potentialFutureExposureValue339.setContextRef(DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext335);
                                    
                                    potentialFutureExposureValue339.setUnitRef(INR334);
                                    potentialFutureExposureValue339.setDecimals("INF");
                                    potentialFutureExposureValue339.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue336));
                                    
                                    
                                    JAXBElement<MonetaryItemType> potentialFutureExposureElement340 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createPotentialFutureExposure(potentialFutureExposureValue339);
                                    bodyElements.add(potentialFutureExposureElement340);
                                
                            }
                        
                            
                                
                                Unit INR341 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR341 = createUnitIfNotExist(INR341, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap345 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap345.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap345.put("in-rbi-rep:ExposureClassAxis", "rbi-core:ExposureToQCCPsMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap345.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue343 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap345);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue344 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap345, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue344 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue344.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue344.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue344.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue344.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue344.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue344.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext342 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap345 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue343 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue343)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext342, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue346 = new MonetaryItemType();
                                    notionalPrincipalAmountValue346.setContextRef(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext342);
                                    
                                    notionalPrincipalAmountValue346.setUnitRef(INR341);
                                    notionalPrincipalAmountValue346.setDecimals("INF");
                                    notionalPrincipalAmountValue346.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue343));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement347 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue346);
                                    bodyElements.add(notionalPrincipalAmountElement347);
                                
                            }
                        
                            
                                
                                Unit INR348 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR348 = createUnitIfNotExist(INR348, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap352 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap352.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap352.put("in-rbi-rep:ExposureClassAxis", "rbi-core:ExposureToQCCPsMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap352.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue350 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap352);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue351 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap352, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue351 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue351.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue351.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue351.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue351.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue351.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue351.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3ReplacementCostContext349 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap352 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue350 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue350)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3ReplacementCostContext349, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue353 = new MonetaryItemType();
                                    replacementCostValue353.setContextRef(DBSLeverageRatioSolo_Layout3ReplacementCostContext349);
                                    
                                    replacementCostValue353.setUnitRef(INR348);
                                    replacementCostValue353.setDecimals("INF");
                                    replacementCostValue353.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue350));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement354 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue353);
                                    bodyElements.add(replacementCostElement354);
                                
                            }
                        
                            
                                
                                Unit INR355 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR355 = createUnitIfNotExist(INR355, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - PotentialFutureExposure
                            
                                Map zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap359 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap359.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap359.put("in-rbi-rep:ExposureClassAxis", "rbi-core:ExposureToQCCPsMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap359.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue357 = DBS06ReportUtil.retrieveValueForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap359);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue358 = DBS06ReportUtil.retrieveFieldDataForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap359, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue358 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue358.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue358.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue358.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue358.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue358.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue358.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext356 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap359 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue357 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue357)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext356, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType potentialFutureExposureValue360 = new MonetaryItemType();
                                    potentialFutureExposureValue360.setContextRef(DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext356);
                                    
                                    potentialFutureExposureValue360.setUnitRef(INR355);
                                    potentialFutureExposureValue360.setDecimals("INF");
                                    potentialFutureExposureValue360.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue357));
                                    
                                    
                                    JAXBElement<MonetaryItemType> potentialFutureExposureElement361 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createPotentialFutureExposure(potentialFutureExposureValue360);
                                    bodyElements.add(potentialFutureExposureElement361);
                                
                            }
                        
                            
                                
                                Unit INR362 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR362 = createUnitIfNotExist(INR362, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap366 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap366.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap366.put("in-rbi-rep:ExposureClassAxis", "rbi-core:ExposureToNonQCCPsMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap366.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue364 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap366);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue365 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap366, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue365 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue365.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue365.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue365.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue365.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue365.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue365.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext363 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap366 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue364 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue364)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext363, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue367 = new MonetaryItemType();
                                    notionalPrincipalAmountValue367.setContextRef(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext363);
                                    
                                    notionalPrincipalAmountValue367.setUnitRef(INR362);
                                    notionalPrincipalAmountValue367.setDecimals("INF");
                                    notionalPrincipalAmountValue367.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue364));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement368 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue367);
                                    bodyElements.add(notionalPrincipalAmountElement368);
                                
                            }
                        
                            
                                
                                Unit INR369 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR369 = createUnitIfNotExist(INR369, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap373 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap373.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap373.put("in-rbi-rep:ExposureClassAxis", "rbi-core:ExposureToNonQCCPsMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap373.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue371 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap373);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue372 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap373, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue372 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue372.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue372.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue372.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue372.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue372.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue372.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3ReplacementCostContext370 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap373 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue371 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue371)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3ReplacementCostContext370, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue374 = new MonetaryItemType();
                                    replacementCostValue374.setContextRef(DBSLeverageRatioSolo_Layout3ReplacementCostContext370);
                                    
                                    replacementCostValue374.setUnitRef(INR369);
                                    replacementCostValue374.setDecimals("INF");
                                    replacementCostValue374.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue371));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement375 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue374);
                                    bodyElements.add(replacementCostElement375);
                                
                            }
                        
                            
                                
                                Unit INR376 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR376 = createUnitIfNotExist(INR376, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - PotentialFutureExposure
                            
                                Map zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap380 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap380.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap380.put("in-rbi-rep:ExposureClassAxis", "rbi-core:ExposureToNonQCCPsMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap380.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue378 = DBS06ReportUtil.retrieveValueForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap380);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue379 = DBS06ReportUtil.retrieveFieldDataForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap380, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue379 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue379.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue379.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue379.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue379.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue379.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue379.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext377 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap380 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue378 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue378)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext377, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType potentialFutureExposureValue381 = new MonetaryItemType();
                                    potentialFutureExposureValue381.setContextRef(DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext377);
                                    
                                    potentialFutureExposureValue381.setUnitRef(INR376);
                                    potentialFutureExposureValue381.setDecimals("INF");
                                    potentialFutureExposureValue381.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue378));
                                    
                                    
                                    JAXBElement<MonetaryItemType> potentialFutureExposureElement382 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createPotentialFutureExposure(potentialFutureExposureValue381);
                                    bodyElements.add(potentialFutureExposureElement382);
                                
                            }
                        
                            
                                
                                Unit INR383 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR383 = createUnitIfNotExist(INR383, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap387 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap387.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap387.put("in-rbi-rep:ExposureClassAxis", "rbi-core:ExposureDueToNonCentrallyClearedDerivativesMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap387.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue385 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap387);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue386 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap387, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue386 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue386.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue386.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue386.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue386.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue386.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue386.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext384 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap387 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue385 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue385)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext384, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue388 = new MonetaryItemType();
                                    notionalPrincipalAmountValue388.setContextRef(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext384);
                                    
                                    notionalPrincipalAmountValue388.setUnitRef(INR383);
                                    notionalPrincipalAmountValue388.setDecimals("INF");
                                    notionalPrincipalAmountValue388.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue385));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement389 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue388);
                                    bodyElements.add(notionalPrincipalAmountElement389);
                                
                            }
                        
                            
                                
                                Unit INR390 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR390 = createUnitIfNotExist(INR390, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap394 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap394.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap394.put("in-rbi-rep:ExposureClassAxis", "rbi-core:ExposureDueToNonCentrallyClearedDerivativesMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap394.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue392 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap394);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue393 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap394, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue393 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue393.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue393.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue393.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue393.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue393.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue393.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3ReplacementCostContext391 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap394 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue392 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue392)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3ReplacementCostContext391, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue395 = new MonetaryItemType();
                                    replacementCostValue395.setContextRef(DBSLeverageRatioSolo_Layout3ReplacementCostContext391);
                                    
                                    replacementCostValue395.setUnitRef(INR390);
                                    replacementCostValue395.setDecimals("INF");
                                    replacementCostValue395.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue392));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement396 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue395);
                                    bodyElements.add(replacementCostElement396);
                                
                            }
                        
                            
                                
                                Unit INR397 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR397 = createUnitIfNotExist(INR397, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - PotentialFutureExposure
                            
                                Map zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap401 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap401.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap401.put("in-rbi-rep:ExposureClassAxis", "rbi-core:ExposureDueToNonCentrallyClearedDerivativesMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap401.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue399 = DBS06ReportUtil.retrieveValueForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap401);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue400 = DBS06ReportUtil.retrieveFieldDataForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap401, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue400 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue400.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue400.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue400.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue400.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue400.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue400.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext398 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap401 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue399 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue399)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext398, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType potentialFutureExposureValue402 = new MonetaryItemType();
                                    potentialFutureExposureValue402.setContextRef(DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext398);
                                    
                                    potentialFutureExposureValue402.setUnitRef(INR397);
                                    potentialFutureExposureValue402.setDecimals("INF");
                                    potentialFutureExposureValue402.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue399));
                                    
                                    
                                    JAXBElement<MonetaryItemType> potentialFutureExposureElement403 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createPotentialFutureExposure(potentialFutureExposureValue402);
                                    bodyElements.add(potentialFutureExposureElement403);
                                
                            }
                        
                            
                                
                                Unit INR404 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR404 = createUnitIfNotExist(INR404, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap408 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap408.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap408.put("in-rbi-rep:ExposureClassAxis", "rbi-core:OtherExposuresMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap408.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue406 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap408);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue407 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap408, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue407 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue407.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue407.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue407.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue407.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue407.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue407.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext405 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap408 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue406 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue406)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext405, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue409 = new MonetaryItemType();
                                    notionalPrincipalAmountValue409.setContextRef(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext405);
                                    
                                    notionalPrincipalAmountValue409.setUnitRef(INR404);
                                    notionalPrincipalAmountValue409.setDecimals("INF");
                                    notionalPrincipalAmountValue409.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue406));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement410 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue409);
                                    bodyElements.add(notionalPrincipalAmountElement410);
                                
                            }
                        
                            
                                
                                Unit INR411 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR411 = createUnitIfNotExist(INR411, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap415 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap415.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap415.put("in-rbi-rep:ExposureClassAxis", "rbi-core:OtherExposuresMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap415.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue413 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap415);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue414 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap415, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue414 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue414.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue414.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue414.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue414.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue414.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue414.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3ReplacementCostContext412 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap415 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue413 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue413)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3ReplacementCostContext412, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue416 = new MonetaryItemType();
                                    replacementCostValue416.setContextRef(DBSLeverageRatioSolo_Layout3ReplacementCostContext412);
                                    
                                    replacementCostValue416.setUnitRef(INR411);
                                    replacementCostValue416.setDecimals("INF");
                                    replacementCostValue416.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue413));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement417 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue416);
                                    bodyElements.add(replacementCostElement417);
                                
                            }
                        
                            
                                
                                Unit INR418 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR418 = createUnitIfNotExist(INR418, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - PotentialFutureExposure
                            
                                Map zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap422 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap422.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap422.put("in-rbi-rep:ExposureClassAxis", "rbi-core:OtherExposuresMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap422.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue420 = DBS06ReportUtil.retrieveValueForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap422);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue421 = DBS06ReportUtil.retrieveFieldDataForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap422, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue421 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue421.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue421.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue421.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue421.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue421.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue421.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext419 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap422 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue420 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue420)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext419, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType potentialFutureExposureValue423 = new MonetaryItemType();
                                    potentialFutureExposureValue423.setContextRef(DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext419);
                                    
                                    potentialFutureExposureValue423.setUnitRef(INR418);
                                    potentialFutureExposureValue423.setDecimals("INF");
                                    potentialFutureExposureValue423.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue420));
                                    
                                    
                                    JAXBElement<MonetaryItemType> potentialFutureExposureElement424 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createPotentialFutureExposure(potentialFutureExposureValue423);
                                    bodyElements.add(potentialFutureExposureElement424);
                                
                            }
                        
                            
                                
                                Unit INR425 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR425 = createUnitIfNotExist(INR425, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap429 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap429.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap429.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:ExemptedCCPLegOfClientClearedTradeExposuresMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue427 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap429);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue428 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap429, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue428 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue428.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue428.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue428.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue428.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue428.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue428.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext426 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap429 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue427 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue427)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext426, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue430 = new MonetaryItemType();
                                    notionalPrincipalAmountValue430.setContextRef(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext426);
                                    
                                    notionalPrincipalAmountValue430.setUnitRef(INR425);
                                    notionalPrincipalAmountValue430.setDecimals("INF");
                                    notionalPrincipalAmountValue430.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue427));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement431 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue430);
                                    bodyElements.add(notionalPrincipalAmountElement431);
                                
                            }
                        
                            
                                
                                Unit INR432 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR432 = createUnitIfNotExist(INR432, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap436 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap436.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap436.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:ExemptedCCPLegOfClientClearedTradeExposuresMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue434 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap436);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue435 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap436, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue435 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue435.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue435.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue435.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue435.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue435.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue435.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3ReplacementCostContext433 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap436 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue434 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue434)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3ReplacementCostContext433, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue437 = new MonetaryItemType();
                                    replacementCostValue437.setContextRef(DBSLeverageRatioSolo_Layout3ReplacementCostContext433);
                                    
                                    replacementCostValue437.setUnitRef(INR432);
                                    replacementCostValue437.setDecimals("INF");
                                    replacementCostValue437.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue434));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement438 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue437);
                                    bodyElements.add(replacementCostElement438);
                                
                            }
                        
                            
                                
                                Unit INR439 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR439 = createUnitIfNotExist(INR439, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - PotentialFutureExposure
                            
                                Map zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap443 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap443.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap443.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:ExemptedCCPLegOfClientClearedTradeExposuresMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue441 = DBS06ReportUtil.retrieveValueForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap443);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue442 = DBS06ReportUtil.retrieveFieldDataForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap443, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue442 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue442.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue442.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue442.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue442.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue442.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue442.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext440 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap443 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue441 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue441)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext440, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType potentialFutureExposureValue444 = new MonetaryItemType();
                                    potentialFutureExposureValue444.setContextRef(DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext440);
                                    
                                    potentialFutureExposureValue444.setUnitRef(INR439);
                                    potentialFutureExposureValue444.setDecimals("INF");
                                    potentialFutureExposureValue444.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue441));
                                    
                                    
                                    JAXBElement<MonetaryItemType> potentialFutureExposureElement445 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createPotentialFutureExposure(potentialFutureExposureValue444);
                                    bodyElements.add(potentialFutureExposureElement445);
                                
                            }
                        
                            
                                
                                Unit INR446 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR446 = createUnitIfNotExist(INR446, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap450 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap450.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap450.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:EffectiveNotionalAmountOfWrittenCreditDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue448 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap450);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue449 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap450, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue449 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue449.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue449.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue449.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue449.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue449.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue449.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext447 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap450 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue448 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue448)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext447, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue451 = new MonetaryItemType();
                                    notionalPrincipalAmountValue451.setContextRef(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext447);
                                    
                                    notionalPrincipalAmountValue451.setUnitRef(INR446);
                                    notionalPrincipalAmountValue451.setDecimals("INF");
                                    notionalPrincipalAmountValue451.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue448));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement452 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue451);
                                    bodyElements.add(notionalPrincipalAmountElement452);
                                
                            }
                        
                            
                                
                                Unit INR453 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR453 = createUnitIfNotExist(INR453, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap457 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap457.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap457.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:NegativeChangeInFairValueOfWrittenCreditDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue455 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap457);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue456 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap457, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue456 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue456.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue456.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue456.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue456.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue456.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue456.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext454 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap457 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue455 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue455)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext454, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue458 = new MonetaryItemType();
                                    notionalPrincipalAmountValue458.setContextRef(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext454);
                                    
                                    notionalPrincipalAmountValue458.setUnitRef(INR453);
                                    notionalPrincipalAmountValue458.setDecimals("INF");
                                    notionalPrincipalAmountValue458.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue455));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement459 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue458);
                                    bodyElements.add(notionalPrincipalAmountElement459);
                                
                            }
                        
                            
                                
                                Unit INR460 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR460 = createUnitIfNotExist(INR460, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap464 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap464.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap464.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:EffectiveNotionalAmountOfWrittenCreditDerivativesAdjustedForNegativeChangeInFairValueMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue462 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap464);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue463 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap464, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue463 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue463.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue463.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue463.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue463.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue463.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue463.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext461 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap464 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue462 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue462)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext461, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue465 = new MonetaryItemType();
                                    notionalPrincipalAmountValue465.setContextRef(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext461);
                                    
                                    notionalPrincipalAmountValue465.setUnitRef(INR460);
                                    notionalPrincipalAmountValue465.setDecimals("INF");
                                    notionalPrincipalAmountValue465.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue462));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement466 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue465);
                                    bodyElements.add(notionalPrincipalAmountElement466);
                                
                            }
                        
                            
                                
                                Unit INR467 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR467 = createUnitIfNotExist(INR467, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap471 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap471.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap471.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:CreditDerivativesBoughtMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue469 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap471);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue470 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap471, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue470 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue470.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue470.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue470.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue470.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue470.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue470.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext468 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap471 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue469 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue469)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext468, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue472 = new MonetaryItemType();
                                    notionalPrincipalAmountValue472.setContextRef(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext468);
                                    
                                    notionalPrincipalAmountValue472.setUnitRef(INR467);
                                    notionalPrincipalAmountValue472.setDecimals("INF");
                                    notionalPrincipalAmountValue472.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue469));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement473 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue472);
                                    bodyElements.add(notionalPrincipalAmountElement473);
                                
                            }
                        
                            
                                
                                Unit INR474 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR474 = createUnitIfNotExist(INR474, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap478 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap478.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap478.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:NetAdjustedEffectiveNotionalAmountOfWrittenCreditDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue476 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap478);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue477 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap478, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue477 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue477.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue477.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue477.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue477.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue477.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue477.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext475 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap478 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue476 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue476)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext475, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue479 = new MonetaryItemType();
                                    notionalPrincipalAmountValue479.setContextRef(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext475);
                                    
                                    notionalPrincipalAmountValue479.setUnitRef(INR474);
                                    notionalPrincipalAmountValue479.setDecimals("INF");
                                    notionalPrincipalAmountValue479.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue476));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement480 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue479);
                                    bodyElements.add(notionalPrincipalAmountElement480);
                                
                            }
                        
                            
                                
                                Unit INR481 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR481 = createUnitIfNotExist(INR481, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap485 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap485.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap485.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:DeductionForAjustmentOfPFEAmountRelatingToWrittenCreditDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue483 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap485);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue484 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap485, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue484 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue484.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue484.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue484.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue484.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue484.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue484.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext482 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap485 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue483 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue483)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext482, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue486 = new MonetaryItemType();
                                    notionalPrincipalAmountValue486.setContextRef(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext482);
                                    
                                    notionalPrincipalAmountValue486.setUnitRef(INR481);
                                    notionalPrincipalAmountValue486.setDecimals("INF");
                                    notionalPrincipalAmountValue486.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue483));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement487 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue486);
                                    bodyElements.add(notionalPrincipalAmountElement487);
                                
                            }
                        
                            
                                
                                Unit INR488 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR488 = createUnitIfNotExist(INR488, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap492 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap492.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap492.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:WrittenCreditDerivativesNetMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue490 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap492);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue491 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap492, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue491 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue491.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue491.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue491.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue491.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue491.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountFieldDataValue491.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext489 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountMap492 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue490 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue490)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext489, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue493 = new MonetaryItemType();
                                    notionalPrincipalAmountValue493.setContextRef(DBSLeverageRatioSolo_Layout3NotionalPrincipalAmountContext489);
                                    
                                    notionalPrincipalAmountValue493.setUnitRef(INR488);
                                    notionalPrincipalAmountValue493.setDecimals("INF");
                                    notionalPrincipalAmountValue493.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3NotionalPrincipalAmountValue490));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement494 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue493);
                                    bodyElements.add(notionalPrincipalAmountElement494);
                                
                            }
                        
                            
                                
                                Unit INR495 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR495 = createUnitIfNotExist(INR495, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap499 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap499.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap499.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:GrossUpForDerivativeCollateralProvidedWhereDeductedFromTheBalanceSheetMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue497 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap499);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue498 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap499, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue498 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue498.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue498.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue498.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue498.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue498.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue498.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3ReplacementCostContext496 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap499 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue497 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue497)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3ReplacementCostContext496, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue500 = new MonetaryItemType();
                                    replacementCostValue500.setContextRef(DBSLeverageRatioSolo_Layout3ReplacementCostContext496);
                                    
                                    replacementCostValue500.setUnitRef(INR495);
                                    replacementCostValue500.setDecimals("INF");
                                    replacementCostValue500.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue497));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement501 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue500);
                                    bodyElements.add(replacementCostElement501);
                                
                            }
                        
                            
                                
                                Unit INR502 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR502 = createUnitIfNotExist(INR502, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap506 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap506.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap506.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:EligibleCashVariationMarginReceivedInDerivativeExpsouresMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue504 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap506);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue505 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap506, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue505 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue505.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue505.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue505.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue505.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue505.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue505.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3ReplacementCostContext503 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap506 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue504 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue504)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3ReplacementCostContext503, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue507 = new MonetaryItemType();
                                    replacementCostValue507.setContextRef(DBSLeverageRatioSolo_Layout3ReplacementCostContext503);
                                    
                                    replacementCostValue507.setUnitRef(INR502);
                                    replacementCostValue507.setDecimals("INF");
                                    replacementCostValue507.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue504));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement508 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue507);
                                    bodyElements.add(replacementCostElement508);
                                
                            }
                        
                            
                                
                                Unit INR509 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR509 = createUnitIfNotExist(INR509, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap513 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap513.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap513.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:ReceivableAssetsForCashVariationMarginProvidedInDerivativeExposuresMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue511 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap513);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue512 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap513, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue512 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue512.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue512.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue512.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue512.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue512.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue512.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3ReplacementCostContext510 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap513 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue511 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue511)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3ReplacementCostContext510, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue514 = new MonetaryItemType();
                                    replacementCostValue514.setContextRef(DBSLeverageRatioSolo_Layout3ReplacementCostContext510);
                                    
                                    replacementCostValue514.setUnitRef(INR509);
                                    replacementCostValue514.setDecimals("INF");
                                    replacementCostValue514.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue511));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement515 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue514);
                                    bodyElements.add(replacementCostElement515);
                                
                            }
                        
                            
                                
                                Unit INR516 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR516 = createUnitIfNotExist(INR516, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap520 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap520.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap520.put("rbi-core:LeverageRatioExposureAxis", "in-rbi-rep:DerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue518 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap520);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue519 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap520, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue519 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue519.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue519.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue519.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue519.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue519.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3ReplacementCostFieldDataValue519.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3ReplacementCostContext517 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3ReplacementCostMap520 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue518 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue518)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3ReplacementCostContext517, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue521 = new MonetaryItemType();
                                    replacementCostValue521.setContextRef(DBSLeverageRatioSolo_Layout3ReplacementCostContext517);
                                    
                                    replacementCostValue521.setUnitRef(INR516);
                                    replacementCostValue521.setDecimals("INF");
                                    replacementCostValue521.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3ReplacementCostValue518));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement522 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue521);
                                    bodyElements.add(replacementCostElement522);
                                
                            }
                        
                            
                                
                                Unit INR523 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR523 = createUnitIfNotExist(INR523, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - PotentialFutureExposure
                            
                                Map zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap527 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap527.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap527.put("rbi-core:LeverageRatioExposureAxis", "in-rbi-rep:DerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue525 = DBS06ReportUtil.retrieveValueForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap527);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue526 = DBS06ReportUtil.retrieveFieldDataForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap527, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue526 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue526.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue526.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue526.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue526.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue526.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureFieldDataValue526.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext524 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureMap527 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue525 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue525)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext524, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType potentialFutureExposureValue528 = new MonetaryItemType();
                                    potentialFutureExposureValue528.setContextRef(DBSLeverageRatioSolo_Layout3PotentialFutureExposureContext524);
                                    
                                    potentialFutureExposureValue528.setUnitRef(INR523);
                                    potentialFutureExposureValue528.setDecimals("INF");
                                    potentialFutureExposureValue528.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3PotentialFutureExposureValue525));
                                    
                                    
                                    JAXBElement<MonetaryItemType> potentialFutureExposureElement529 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createPotentialFutureExposure(potentialFutureExposureValue528);
                                    bodyElements.add(potentialFutureExposureElement529);
                                
                            }
                        
                            
                                
                                Unit INR530 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR530 = createUnitIfNotExist(INR530, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ExposureAmount
                            
                                Map zeroDBSLeverageRatioSolo_Layout3ExposureAmountMap534 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ExposureAmountMap534.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout3ExposureAmountMap534.put("rbi-core:LeverageRatioExposureAxis", "in-rbi-rep:DerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout3ExposureAmountValue532 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBSLeverageRatioSolo_Layout3ExposureAmountMap534);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout3ExposureAmountFieldDataValue533 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), zeroDBSLeverageRatioSolo_Layout3ExposureAmountMap534, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout3ExposureAmountFieldDataValue533 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout3ExposureAmountFieldDataValue533.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout3ExposureAmountFieldDataValue533.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ExposureAmountFieldDataValue533.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout3ExposureAmountFieldDataValue533.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout3ExposureAmountFieldDataValue533.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout3ExposureAmountFieldDataValue533.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout3ExposureAmountContext531 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout3ExposureAmountMap534 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout3ExposureAmountValue532 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout3ExposureAmountValue532)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout3ExposureAmountContext531, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType exposureAmountValue535 = new MonetaryItemType();
                                    exposureAmountValue535.setContextRef(DBSLeverageRatioSolo_Layout3ExposureAmountContext531);
                                    
                                    exposureAmountValue535.setUnitRef(INR530);
                                    exposureAmountValue535.setDecimals("INF");
                                    exposureAmountValue535.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout3ExposureAmountValue532));
                                    
                                    
                                    JAXBElement<MonetaryItemType> exposureAmountElement536 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue535);
                                    bodyElements.add(exposureAmountElement536);
                                
                            }
                        
                        
                    
                    
            
                    
                    
                    
                    return "";
                    }

                
                    
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBSLeverageRatioSolo_Layout4 if any typeMembers then List or Single
                //DBSLeverageRatioSolo_Layout4 dBSLeverageRatioSolo_Layout4 = mainReportData.getDBSLeverageRatioSolo_Layout4();
                
                    private String dBSLeverageRatioSolo_Layout4Method(DBSLeverageRatioSolo_Layout4 dBSLeverageRatioSolo_Layout4, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                
                    {
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                    DBSLeverageRatioSolo_Layout4 field = dBSLeverageRatioSolo_Layout4;
                    
                    
                        
                        
                            
                                
                                Unit INR537 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR537 = createUnitIfNotExist(INR537, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ExposureAmount
                            
                                Map zeroDBSLeverageRatioSolo_Layout4ExposureAmountMap541 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioSolo_Layout4ExposureAmountMap541.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                    
                                    String zeroDBSLeverageRatioSolo_Layout4ExposureAmountValue539 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBSLeverageRatioSolo_Layout4ExposureAmountMap541);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioSolo_Layout4ExposureAmountFieldDataValue540 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), zeroDBSLeverageRatioSolo_Layout4ExposureAmountMap541, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioSolo_Layout4ExposureAmountFieldDataValue540 != null ) {
                                        if(!zeroDBSLeverageRatioSolo_Layout4ExposureAmountFieldDataValue540.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioSolo_Layout4ExposureAmountFieldDataValue540.getStartDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout4ExposureAmountFieldDataValue540.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioSolo_Layout4ExposureAmountFieldDataValue540.getEndDateValue();
                                        if(!zeroDBSLeverageRatioSolo_Layout4ExposureAmountFieldDataValue540.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioSolo_Layout4ExposureAmountFieldDataValue540.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioSolo_Layout4ExposureAmountContext538 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioSolo_Layout4ExposureAmountMap541 );
                                        
                                
                                if(zeroDBSLeverageRatioSolo_Layout4ExposureAmountValue539 != null && !"".equals(zeroDBSLeverageRatioSolo_Layout4ExposureAmountValue539)) {
                                    
                                    addContext(DBSLeverageRatioSolo_Layout4ExposureAmountContext538, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType exposureAmountValue542 = new MonetaryItemType();
                                    exposureAmountValue542.setContextRef(DBSLeverageRatioSolo_Layout4ExposureAmountContext538);
                                    
                                    exposureAmountValue542.setUnitRef(INR537);
                                    exposureAmountValue542.setDecimals("INF");
                                    exposureAmountValue542.setValue(new BigDecimal(zeroDBSLeverageRatioSolo_Layout4ExposureAmountValue539));
                                    
                                    
                                    JAXBElement<MonetaryItemType> exposureAmountElement543 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue542);
                                    bodyElements.add(exposureAmountElement543);
                                
                            }
                        
                        
                    
                    
            
                    
                    
                    
                    return "";
                    }

                
                    
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBSLeverageRatioSolo_Layout5 if any typeMembers then List or Single
                //DBSLeverageRatioSolo_Layout5 dBSLeverageRatioSolo_Layout5 = mainReportData.getDBSLeverageRatioSolo_Layout5();
                
                    private String dBSLeverageRatioSolo_Layout5Method(DBSLeverageRatioSolo_Layout5 dBSLeverageRatioSolo_Layout5, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                
                    {
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                    DBSLeverageRatioSolo_Layout5 field = dBSLeverageRatioSolo_Layout5;
                    
                    
                    
            
                    
                    
                        
                            
                            
                                
                                Unit INR544 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR544 = createUnitIfNotExist(INR544, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis - Tier1Capital
                            
                        
                            
                                
                                Map explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisMap546 = new HashMap<String, String>();
                                
                                
                                explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisMap546.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");                
                                
                                String explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberValue547 = DBS06ReportUtil.retrieveValueForElement(field.getTier1Capital(), explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisMap546);
                            
                                startDate = startDateDefault;
                                endDate = endDateDefault;
                                periodDate = periodDateDefault;
                                FieldDataValue explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberFieldDataValue548 = DBS06ReportUtil.retrieveFieldDataForElement(field.getTier1Capital(), explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisMap546, "", "", "xs:date($refPeriodEndDate)" );

                                if(explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberFieldDataValue548 != null ) {
                                    if(!explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberFieldDataValue548.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberFieldDataValue548.getStartDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberFieldDataValue548.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberFieldDataValue548.getEndDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberFieldDataValue548.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberFieldDataValue548.getInstantDateValue();
                                }

                                if(explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberValue547 != null && !"".equals(explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberValue547)) {
                                
                                    
                                        Context explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisContext545 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisMap546 );
                                        
                                    
                                    addContext(explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisContext545, contextElements, contextIdentifiers);
                                    
                                
                                    // create element JAXB Element
                
                                    MonetaryItemType explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberDataType550 = new MonetaryItemType();
                                    explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberDataType550.setContextRef(explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisContext545);
                                    
                                    
                                        explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberDataType550.setUnitRef(INR544);
                                        explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberDataType550.setDecimals("INF");
                                        explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberDataType550.setValue(new BigDecimal(explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberValue547));
                                    
                                    
                                    JAXBElement<MonetaryItemType> explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberElement549 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createTier1Capital(explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberDataType550);
                                    bodyElements.add(explictMember1DBSLeverageRatioSolo_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberElement549);
                                
                                }
                                // if uniquenamevalue is empty then don't do anything
                            

                            
                        
                        
                            
                            
                                
                                Unit INR551 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR551 = createUnitIfNotExist(INR551, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis - ExposureAmount
                            
                        
                            
                                
                                Map explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisMap553 = new HashMap<String, String>();
                                
                                
                                explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisMap553.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");                
                                
                                        
                                        
                                        
                                        explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisMap553.put("rbi-core:LeverageRatioExposureAxis", "in-rbi-rep:TotalExposureMember");
                                    
                                String explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberValue554 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisMap553);
                            
                                startDate = startDateDefault;
                                endDate = endDateDefault;
                                periodDate = periodDateDefault;
                                FieldDataValue explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberFieldDataValue555 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisMap553, "", "", "xs:date($refPeriodEndDate)" );

                                if(explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberFieldDataValue555 != null ) {
                                    if(!explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberFieldDataValue555.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberFieldDataValue555.getStartDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberFieldDataValue555.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberFieldDataValue555.getEndDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberFieldDataValue555.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberFieldDataValue555.getInstantDateValue();
                                }

                                if(explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberValue554 != null && !"".equals(explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberValue554)) {
                                
                                    
                                        Context explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisContext552 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisMap553 );
                                        
                                    
                                    addContext(explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisContext552, contextElements, contextIdentifiers);
                                    
                                
                                    // create element JAXB Element
                
                                    MonetaryItemType explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberDataType557 = new MonetaryItemType();
                                    explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberDataType557.setContextRef(explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisContext552);
                                    
                                    
                                        explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberDataType557.setUnitRef(INR551);
                                        explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberDataType557.setDecimals("INF");
                                        explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberDataType557.setValue(new BigDecimal(explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberValue554));
                                    
                                    
                                    JAXBElement<MonetaryItemType> explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberElement556 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberDataType557);
                                    bodyElements.add(explictMember1DBSLeverageRatioSolo_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberElement556);
                                
                                }
                                // if uniquenamevalue is empty then don't do anything
                            

                            
                        
                        
                            
                            
                                
                                Unit pure558 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                pure558 = createUnitIfNotExist(pure558, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                
                            
                            //rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis - BaselIILeverageRatio
                            
                        
                            
                                
                                Map explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisMap560 = new HashMap<String, String>();
                                
                                
                                explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisMap560.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");                
                                
                                String explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberValue561 = DBS06ReportUtil.retrieveValueForElement(field.getBaselIILeverageRatio(), explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisMap560);
                            
                                startDate = startDateDefault;
                                endDate = endDateDefault;
                                periodDate = periodDateDefault;
                                FieldDataValue explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberFieldDataValue562 = DBS06ReportUtil.retrieveFieldDataForElement(field.getBaselIILeverageRatio(), explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisMap560, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "" );

                                if(explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberFieldDataValue562 != null ) {
                                    if(!explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberFieldDataValue562.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberFieldDataValue562.getStartDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberFieldDataValue562.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberFieldDataValue562.getEndDateValue();
                                    if(!explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberFieldDataValue562.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberFieldDataValue562.getInstantDateValue();
                                }

                                if(explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberValue561 != null && !"".equals(explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberValue561)) {
                                
                                    
                                        Context explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisContext559 = DBS06ReportContextUtil.createFromToContextWithMembers( bankCode, startDate, endDate,  explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisMap560 );
                                    
                                    addContext(explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisContext559, contextElements, contextIdentifiers);
                                    
                                
                                    // create element JAXB Element
                
                                    PercentItemType explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberDataType564 = new PercentItemType();
                                    explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberDataType564.setContextRef(explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisContext559);
                                    
                                    
                                        explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberDataType564.setUnitRef(pure558);
                                        explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberDataType564.setDecimals("INF");
                                        explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberDataType564.setValue(new BigDecimal(explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberValue561));
                                    
                                    
                                    JAXBElement<PercentItemType> explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberElement563 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createBaselIILeverageRatio(explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberDataType564);
                                    bodyElements.add(explictMember1DBSLeverageRatioSolo_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisStandaloneMemberElement563);
                                
                                }
                                // if uniquenamevalue is empty then don't do anything
                            

                            
                        
                        
                        
                    
                    
                    return "";
                    }

                
                    
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBSLeverageRatioConsolidated_Layout1 if any typeMembers then List or Single
                //DBSLeverageRatioConsolidated_Layout1 dBSLeverageRatioConsolidated_Layout1 = mainReportData.getDBSLeverageRatioConsolidated_Layout1();
                
                    private String dBSLeverageRatioConsolidated_Layout1Method(DBSLeverageRatioConsolidated_Layout1 dBSLeverageRatioConsolidated_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                
                    {
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                    DBSLeverageRatioConsolidated_Layout1 field = dBSLeverageRatioConsolidated_Layout1;
                    
                    
                    
            
                    
                    
                        
                            
                            
                                
                                Unit INR565 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR565 = createUnitIfNotExist(INR565, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis,rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            

                            
                                    Map explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberMap567 = new HashMap<String, String>();
                                    
                                    
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberMap567.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");                
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberMap567.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:DomesticSovereignsMember");   
                                
                                    String explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberValue568 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberMap567);
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberFieldDataValue569 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberMap567, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberFieldDataValue569 != null ) {
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberFieldDataValue569.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberFieldDataValue569.getStartDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberFieldDataValue569.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberFieldDataValue569.getEndDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberFieldDataValue569.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberFieldDataValue569.getInstantDateValue();
                                    }
                                    
                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberValue568 != null && !"".equals(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberValue568)) {
                                    
                                        
                                        
                                            Context explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberContext566 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberMap567 );
                                        
                                        addContext(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberContext566, contextElements, contextIdentifiers);
                                                  
                                            // create element JAXB Element
                    
                                            MonetaryItemType explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberDataType571 = new MonetaryItemType();
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberDataType571.setContextRef(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberContext566);
                                        
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberDataType571.setUnitRef(INR565);
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberDataType571.setDecimals("INF");
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberDataType571.setValue(new BigDecimal(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberValue568));
                                        
                                        
                                            JAXBElement<MonetaryItemType> explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberElement570 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberDataType571);
                                            bodyElements.add(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticSovereignsMemberElement570);
                                    }
                                
                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR572 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR572 = createUnitIfNotExist(INR572, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis,rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            

                            
                                    Map explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberMap574 = new HashMap<String, String>();
                                    
                                    
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberMap574.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");                
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberMap574.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:ForeignSovereignsMember");   
                                
                                    String explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberValue575 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberMap574);
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberFieldDataValue576 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberMap574, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberFieldDataValue576 != null ) {
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberFieldDataValue576.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberFieldDataValue576.getStartDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberFieldDataValue576.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberFieldDataValue576.getEndDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberFieldDataValue576.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberFieldDataValue576.getInstantDateValue();
                                    }
                                    
                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberValue575 != null && !"".equals(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberValue575)) {
                                    
                                        
                                        
                                            Context explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberContext573 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberMap574 );
                                        
                                        addContext(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberContext573, contextElements, contextIdentifiers);
                                                  
                                            // create element JAXB Element
                    
                                            MonetaryItemType explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberDataType578 = new MonetaryItemType();
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberDataType578.setContextRef(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberContext573);
                                        
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberDataType578.setUnitRef(INR572);
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberDataType578.setDecimals("INF");
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberDataType578.setValue(new BigDecimal(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberValue575));
                                        
                                        
                                            JAXBElement<MonetaryItemType> explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberElement577 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberDataType578);
                                            bodyElements.add(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignSovereignsMemberElement577);
                                    }
                                
                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR579 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR579 = createUnitIfNotExist(INR579, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis,rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            

                            
                                    Map explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberMap581 = new HashMap<String, String>();
                                    
                                    
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberMap581.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");                
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberMap581.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:BanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMember");   
                                
                                    String explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberValue582 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberMap581);
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberFieldDataValue583 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberMap581, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberFieldDataValue583 != null ) {
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberFieldDataValue583.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberFieldDataValue583.getStartDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberFieldDataValue583.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberFieldDataValue583.getEndDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberFieldDataValue583.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberFieldDataValue583.getInstantDateValue();
                                    }
                                    
                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberValue582 != null && !"".equals(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberValue582)) {
                                    
                                        
                                        
                                            Context explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberContext580 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberMap581 );
                                        
                                        addContext(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberContext580, contextElements, contextIdentifiers);
                                                  
                                            // create element JAXB Element
                    
                                            MonetaryItemType explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberDataType585 = new MonetaryItemType();
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberDataType585.setContextRef(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberContext580);
                                        
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberDataType585.setUnitRef(INR579);
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberDataType585.setDecimals("INF");
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberDataType585.setValue(new BigDecimal(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberValue582));
                                        
                                        
                                            JAXBElement<MonetaryItemType> explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberElement584 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberDataType585);
                                            bodyElements.add(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBanksIncorporatedInIndiaAndForeignBankBranchesInIndiaMemberElement584);
                                    }
                                
                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR586 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR586 = createUnitIfNotExist(INR586, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis,rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            

                            
                                    Map explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberMap588 = new HashMap<String, String>();
                                    
                                    
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberMap588.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");                
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberMap588.put("rbi-core:LeverageRatioExposureAxis", "in-rbi-rep:ForeignBanksMember");   
                                
                                    String explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberValue589 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberMap588);
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberFieldDataValue590 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberMap588, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberFieldDataValue590 != null ) {
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberFieldDataValue590.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberFieldDataValue590.getStartDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberFieldDataValue590.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberFieldDataValue590.getEndDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberFieldDataValue590.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberFieldDataValue590.getInstantDateValue();
                                    }
                                    
                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberValue589 != null && !"".equals(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberValue589)) {
                                    
                                        
                                        
                                            Context explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberContext587 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberMap588 );
                                        
                                        addContext(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberContext587, contextElements, contextIdentifiers);
                                                  
                                            // create element JAXB Element
                    
                                            MonetaryItemType explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberDataType592 = new MonetaryItemType();
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberDataType592.setContextRef(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberContext587);
                                        
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberDataType592.setUnitRef(INR586);
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberDataType592.setDecimals("INF");
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberDataType592.setValue(new BigDecimal(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberValue589));
                                        
                                        
                                            JAXBElement<MonetaryItemType> explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberElement591 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberDataType592);
                                            bodyElements.add(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignBanksMemberElement591);
                                    }
                                
                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR593 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR593 = createUnitIfNotExist(INR593, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis,rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            

                            
                                    Map explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberMap595 = new HashMap<String, String>();
                                    
                                    
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberMap595.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");                
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberMap595.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:DomesticPublicSectorEntitiesMember");   
                                
                                    String explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberValue596 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberMap595);
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberFieldDataValue597 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberMap595, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberFieldDataValue597 != null ) {
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberFieldDataValue597.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberFieldDataValue597.getStartDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberFieldDataValue597.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberFieldDataValue597.getEndDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberFieldDataValue597.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberFieldDataValue597.getInstantDateValue();
                                    }
                                    
                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberValue596 != null && !"".equals(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberValue596)) {
                                    
                                        
                                        
                                            Context explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberContext594 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberMap595 );
                                        
                                        addContext(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberContext594, contextElements, contextIdentifiers);
                                                  
                                            // create element JAXB Element
                    
                                            MonetaryItemType explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberDataType599 = new MonetaryItemType();
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberDataType599.setContextRef(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberContext594);
                                        
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberDataType599.setUnitRef(INR593);
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberDataType599.setDecimals("INF");
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberDataType599.setValue(new BigDecimal(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberValue596));
                                        
                                        
                                            JAXBElement<MonetaryItemType> explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberElement598 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberDataType599);
                                            bodyElements.add(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberDomesticPublicSectorEntitiesMemberElement598);
                                    }
                                
                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR600 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR600 = createUnitIfNotExist(INR600, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis,rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            

                            
                                    Map explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberMap602 = new HashMap<String, String>();
                                    
                                    
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberMap602.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");                
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberMap602.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:ForeignPublicSectorEntitiesMember");   
                                
                                    String explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberValue603 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberMap602);
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberFieldDataValue604 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberMap602, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberFieldDataValue604 != null ) {
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberFieldDataValue604.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberFieldDataValue604.getStartDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberFieldDataValue604.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberFieldDataValue604.getEndDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberFieldDataValue604.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberFieldDataValue604.getInstantDateValue();
                                    }
                                    
                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberValue603 != null && !"".equals(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberValue603)) {
                                    
                                        
                                        
                                            Context explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberContext601 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberMap602 );
                                        
                                        addContext(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberContext601, contextElements, contextIdentifiers);
                                                  
                                            // create element JAXB Element
                    
                                            MonetaryItemType explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberDataType606 = new MonetaryItemType();
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberDataType606.setContextRef(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberContext601);
                                        
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberDataType606.setUnitRef(INR600);
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberDataType606.setDecimals("INF");
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberDataType606.setValue(new BigDecimal(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberValue603));
                                        
                                        
                                            JAXBElement<MonetaryItemType> explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberElement605 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberDataType606);
                                            bodyElements.add(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberForeignPublicSectorEntitiesMemberElement605);
                                    }
                                
                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR607 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR607 = createUnitIfNotExist(INR607, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis,rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            

                            
                                    Map explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberMap609 = new HashMap<String, String>();
                                    
                                    
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberMap609.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");                
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberMap609.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:PrimaryDealersMember");   
                                
                                    String explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberValue610 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberMap609);
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberFieldDataValue611 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberMap609, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberFieldDataValue611 != null ) {
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberFieldDataValue611.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberFieldDataValue611.getStartDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberFieldDataValue611.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberFieldDataValue611.getEndDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberFieldDataValue611.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberFieldDataValue611.getInstantDateValue();
                                    }
                                    
                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberValue610 != null && !"".equals(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberValue610)) {
                                    
                                        
                                        
                                            Context explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberContext608 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberMap609 );
                                        
                                        addContext(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberContext608, contextElements, contextIdentifiers);
                                                  
                                            // create element JAXB Element
                    
                                            MonetaryItemType explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberDataType613 = new MonetaryItemType();
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberDataType613.setContextRef(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberContext608);
                                        
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberDataType613.setUnitRef(INR607);
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberDataType613.setDecimals("INF");
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberDataType613.setValue(new BigDecimal(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberValue610));
                                        
                                        
                                            JAXBElement<MonetaryItemType> explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberElement612 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberDataType613);
                                            bodyElements.add(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberPrimaryDealersMemberElement612);
                                    }
                                
                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR614 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR614 = createUnitIfNotExist(INR614, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis,rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            

                            
                                    Map explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberMap616 = new HashMap<String, String>();
                                    
                                    
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberMap616.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");                
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberMap616.put("rbi-core:LeverageRatioExposureAxis", "in-rbi-rep:CorporateMember");   
                                
                                    String explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberValue617 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberMap616);
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberFieldDataValue618 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberMap616, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberFieldDataValue618 != null ) {
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberFieldDataValue618.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberFieldDataValue618.getStartDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberFieldDataValue618.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberFieldDataValue618.getEndDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberFieldDataValue618.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberFieldDataValue618.getInstantDateValue();
                                    }
                                    
                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberValue617 != null && !"".equals(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberValue617)) {
                                    
                                        
                                        
                                            Context explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberContext615 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberMap616 );
                                        
                                        addContext(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberContext615, contextElements, contextIdentifiers);
                                                  
                                            // create element JAXB Element
                    
                                            MonetaryItemType explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberDataType620 = new MonetaryItemType();
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberDataType620.setContextRef(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberContext615);
                                        
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberDataType620.setUnitRef(INR614);
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberDataType620.setDecimals("INF");
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberDataType620.setValue(new BigDecimal(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberValue617));
                                        
                                        
                                            JAXBElement<MonetaryItemType> explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberElement619 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberDataType620);
                                            bodyElements.add(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberCorporateMemberElement619);
                                    }
                                
                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR621 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR621 = createUnitIfNotExist(INR621, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis,rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            

                            
                                    Map explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberMap623 = new HashMap<String, String>();
                                    
                                    
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberMap623.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");                
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberMap623.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:ExposureToCCPsMember");   
                                
                                    String explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberValue624 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberMap623);
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberFieldDataValue625 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberMap623, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberFieldDataValue625 != null ) {
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberFieldDataValue625.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberFieldDataValue625.getStartDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberFieldDataValue625.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberFieldDataValue625.getEndDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberFieldDataValue625.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberFieldDataValue625.getInstantDateValue();
                                    }
                                    
                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberValue624 != null && !"".equals(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberValue624)) {
                                    
                                        
                                        
                                            Context explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberContext622 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberMap623 );
                                        
                                        addContext(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberContext622, contextElements, contextIdentifiers);
                                                  
                                            // create element JAXB Element
                    
                                            MonetaryItemType explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberDataType627 = new MonetaryItemType();
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberDataType627.setContextRef(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberContext622);
                                        
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberDataType627.setUnitRef(INR621);
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberDataType627.setDecimals("INF");
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberDataType627.setValue(new BigDecimal(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberValue624));
                                        
                                        
                                            JAXBElement<MonetaryItemType> explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberElement626 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberDataType627);
                                            bodyElements.add(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCCPsMemberElement626);
                                    }
                                
                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR628 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR628 = createUnitIfNotExist(INR628, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis,rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            

                            
                                    Map explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberMap630 = new HashMap<String, String>();
                                    
                                    
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberMap630.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");                
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberMap630.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:ExposureToCapitalOfCCPsMember");   
                                
                                    String explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberValue631 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberMap630);
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberFieldDataValue632 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberMap630, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberFieldDataValue632 != null ) {
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberFieldDataValue632.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberFieldDataValue632.getStartDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberFieldDataValue632.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberFieldDataValue632.getEndDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberFieldDataValue632.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberFieldDataValue632.getInstantDateValue();
                                    }
                                    
                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberValue631 != null && !"".equals(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberValue631)) {
                                    
                                        
                                        
                                            Context explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberContext629 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberMap630 );
                                        
                                        addContext(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberContext629, contextElements, contextIdentifiers);
                                                  
                                            // create element JAXB Element
                    
                                            MonetaryItemType explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberDataType634 = new MonetaryItemType();
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberDataType634.setContextRef(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberContext629);
                                        
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberDataType634.setUnitRef(INR628);
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberDataType634.setDecimals("INF");
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberDataType634.setValue(new BigDecimal(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberValue631));
                                        
                                        
                                            JAXBElement<MonetaryItemType> explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberElement633 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberDataType634);
                                            bodyElements.add(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToCapitalOfCCPsMemberElement633);
                                    }
                                
                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR635 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR635 = createUnitIfNotExist(INR635, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis,rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            

                            
                                    Map explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberMap637 = new HashMap<String, String>();
                                    
                                    
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberMap637.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");                
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberMap637.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:ExposureToDefaultFundContributionOfCCPsMember");   
                                
                                    String explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberValue638 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberMap637);
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberFieldDataValue639 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberMap637, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberFieldDataValue639 != null ) {
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberFieldDataValue639.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberFieldDataValue639.getStartDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberFieldDataValue639.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberFieldDataValue639.getEndDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberFieldDataValue639.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberFieldDataValue639.getInstantDateValue();
                                    }
                                    
                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberValue638 != null && !"".equals(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberValue638)) {
                                    
                                        
                                        
                                            Context explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberContext636 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberMap637 );
                                        
                                        addContext(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberContext636, contextElements, contextIdentifiers);
                                                  
                                            // create element JAXB Element
                    
                                            MonetaryItemType explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberDataType641 = new MonetaryItemType();
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberDataType641.setContextRef(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberContext636);
                                        
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberDataType641.setUnitRef(INR635);
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberDataType641.setDecimals("INF");
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberDataType641.setValue(new BigDecimal(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberValue638));
                                        
                                        
                                            JAXBElement<MonetaryItemType> explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberElement640 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberDataType641);
                                            bodyElements.add(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberExposureToDefaultFundContributionOfCCPsMemberElement640);
                                    }
                                
                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR642 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR642 = createUnitIfNotExist(INR642, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis,rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            

                            
                                    Map explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberMap644 = new HashMap<String, String>();
                                    
                                    
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberMap644.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");                
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberMap644.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:OtherExposureToCCPsMember");   
                                
                                    String explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberValue645 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberMap644);
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberFieldDataValue646 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberMap644, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberFieldDataValue646 != null ) {
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberFieldDataValue646.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberFieldDataValue646.getStartDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberFieldDataValue646.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberFieldDataValue646.getEndDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberFieldDataValue646.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberFieldDataValue646.getInstantDateValue();
                                    }
                                    
                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberValue645 != null && !"".equals(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberValue645)) {
                                    
                                        
                                        
                                            Context explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberContext643 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberMap644 );
                                        
                                        addContext(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberContext643, contextElements, contextIdentifiers);
                                                  
                                            // create element JAXB Element
                    
                                            MonetaryItemType explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberDataType648 = new MonetaryItemType();
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberDataType648.setContextRef(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberContext643);
                                        
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberDataType648.setUnitRef(INR642);
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberDataType648.setDecimals("INF");
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberDataType648.setValue(new BigDecimal(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberValue645));
                                        
                                        
                                            JAXBElement<MonetaryItemType> explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberElement647 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberDataType648);
                                            bodyElements.add(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOtherExposureToCCPsMemberElement647);
                                    }
                                
                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR649 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR649 = createUnitIfNotExist(INR649, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis,rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            

                            
                                    Map explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberMap651 = new HashMap<String, String>();
                                    
                                    
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberMap651.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");                
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberMap651.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AllOtherExposuresMember");   
                                
                                    String explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberValue652 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberMap651);
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberFieldDataValue653 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberMap651, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberFieldDataValue653 != null ) {
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberFieldDataValue653.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberFieldDataValue653.getStartDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberFieldDataValue653.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberFieldDataValue653.getEndDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberFieldDataValue653.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberFieldDataValue653.getInstantDateValue();
                                    }
                                    
                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberValue652 != null && !"".equals(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberValue652)) {
                                    
                                        
                                        
                                            Context explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberContext650 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberMap651 );
                                        
                                        addContext(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberContext650, contextElements, contextIdentifiers);
                                                  
                                            // create element JAXB Element
                    
                                            MonetaryItemType explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberDataType655 = new MonetaryItemType();
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberDataType655.setContextRef(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberContext650);
                                        
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberDataType655.setUnitRef(INR649);
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberDataType655.setDecimals("INF");
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberDataType655.setValue(new BigDecimal(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberValue652));
                                        
                                        
                                            JAXBElement<MonetaryItemType> explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberElement654 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberDataType655);
                                            bodyElements.add(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberAllOtherExposuresMemberElement654);
                                    }
                                
                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR656 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR656 = createUnitIfNotExist(INR656, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis,rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            

                            
                                    Map explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberMap658 = new HashMap<String, String>();
                                    
                                    
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberMap658.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");                
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberMap658.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:BalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMember");   
                                
                                    String explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberValue659 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberMap658);
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberFieldDataValue660 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberMap658, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberFieldDataValue660 != null ) {
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberFieldDataValue660.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberFieldDataValue660.getStartDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberFieldDataValue660.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberFieldDataValue660.getEndDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberFieldDataValue660.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberFieldDataValue660.getInstantDateValue();
                                    }
                                    
                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberValue659 != null && !"".equals(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberValue659)) {
                                    
                                        
                                        
                                            Context explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberContext657 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberMap658 );
                                        
                                        addContext(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberContext657, contextElements, contextIdentifiers);
                                                  
                                            // create element JAXB Element
                    
                                            MonetaryItemType explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberDataType662 = new MonetaryItemType();
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberDataType662.setContextRef(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberContext657);
                                        
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberDataType662.setUnitRef(INR656);
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberDataType662.setDecimals("INF");
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberDataType662.setValue(new BigDecimal(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberValue659));
                                        
                                        
                                            JAXBElement<MonetaryItemType> explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberElement661 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberDataType662);
                                            bodyElements.add(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberBalanceSheetAssetsDeductedFromTier1CapitalAndNotReckonedForExposureMeasureMemberElement661);
                                    }
                                
                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR663 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR663 = createUnitIfNotExist(INR663, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis,rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            

                            
                                    Map explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberMap665 = new HashMap<String, String>();
                                    
                                    
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberMap665.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");                
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberMap665.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:FiduciaryAssetsMember");   
                                
                                    String explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberValue666 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberMap665);
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberFieldDataValue667 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberMap665, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberFieldDataValue667 != null ) {
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberFieldDataValue667.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberFieldDataValue667.getStartDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberFieldDataValue667.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberFieldDataValue667.getEndDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberFieldDataValue667.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberFieldDataValue667.getInstantDateValue();
                                    }
                                    
                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberValue666 != null && !"".equals(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberValue666)) {
                                    
                                        
                                        
                                            Context explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberContext664 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberMap665 );
                                        
                                        addContext(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberContext664, contextElements, contextIdentifiers);
                                                  
                                            // create element JAXB Element
                    
                                            MonetaryItemType explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberDataType669 = new MonetaryItemType();
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberDataType669.setContextRef(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberContext664);
                                        
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberDataType669.setUnitRef(INR663);
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberDataType669.setDecimals("INF");
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberDataType669.setValue(new BigDecimal(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberValue666));
                                        
                                        
                                            JAXBElement<MonetaryItemType> explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberElement668 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberDataType669);
                                            bodyElements.add(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberFiduciaryAssetsMemberElement668);
                                    }
                                
                            
                        
                        
                        
                    
                        
                            
                            
                                
                                Unit INR670 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR670 = createUnitIfNotExist(INR670, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis,rbi-core:LeverageRatioExposureAxis - ExposureAmount
                            
                        
                            

                            
                                    Map explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberMap672 = new HashMap<String, String>();
                                    
                                    
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberMap672.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");                
                                    explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberMap672.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:OnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMember");   
                                
                                    String explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberValue673 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberMap672);
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberFieldDataValue674 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberMap672, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberFieldDataValue674 != null ) {
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberFieldDataValue674.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberFieldDataValue674.getStartDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberFieldDataValue674.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberFieldDataValue674.getEndDateValue();
                                        if(!explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberFieldDataValue674.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberFieldDataValue674.getInstantDateValue();
                                    }
                                    
                                    if(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberValue673 != null && !"".equals(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberValue673)) {
                                    
                                        
                                        
                                            Context explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberContext671 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberMap672 );
                                        
                                        addContext(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberContext671, contextElements, contextIdentifiers);
                                                  
                                            // create element JAXB Element
                    
                                            MonetaryItemType explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberDataType676 = new MonetaryItemType();
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberDataType676.setContextRef(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberContext671);
                                        
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberDataType676.setUnitRef(INR670);
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberDataType676.setDecimals("INF");
                                            explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberDataType676.setValue(new BigDecimal(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberValue673));
                                        
                                        
                                            JAXBElement<MonetaryItemType> explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberElement675 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberDataType676);
                                            bodyElements.add(explictMember2DBSLeverageRatioConsolidated_Layout1ExposureAmountConsolidatedMemberOnBalanceSheetExposureExcludingDerivativesAndSFTsButIncludingCollateralMemberElement675);
                                    }
                                
                            
                        
                        
                        
                    
                    
                    return "";
                    }

                
                    
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBSLeverageRatioConsolidated_Layout2 if any typeMembers then List or Single
                //DBSLeverageRatioConsolidated_Layout2 dBSLeverageRatioConsolidated_Layout2 = mainReportData.getDBSLeverageRatioConsolidated_Layout2();
                
                    private String dBSLeverageRatioConsolidated_Layout2Method(DBSLeverageRatioConsolidated_Layout2 dBSLeverageRatioConsolidated_Layout2, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                
                    {
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                    DBSLeverageRatioConsolidated_Layout2 field = dBSLeverageRatioConsolidated_Layout2;
                    
                    
                        
                        
                            
                                
                                Unit pure677 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                pure677 = createUnitIfNotExist(pure677, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                
                            
                            // - CreditConversionFactor
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap681 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap681.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap681.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:UnconditionallyCancellableCreditCardsCommitmentsMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorValue679 = DBS06ReportUtil.retrieveValueForElement(field.getCreditConversionFactor(), zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap681);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue680 = DBS06ReportUtil.retrieveFieldDataForElement(field.getCreditConversionFactor(), zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap681, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue680 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue680.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue680.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue680.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue680.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue680.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue680.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout2CreditConversionFactorContext678 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap681 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorValue679 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorValue679)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout2CreditConversionFactorContext678, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    PercentItemType creditConversionFactorValue682 = new PercentItemType();
                                    creditConversionFactorValue682.setContextRef(DBSLeverageRatioConsolidated_Layout2CreditConversionFactorContext678);
                                    
                                    creditConversionFactorValue682.setUnitRef(pure677);
                                    creditConversionFactorValue682.setDecimals("INF");
                                    creditConversionFactorValue682.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorValue679));
                                    
                                    
                                    JAXBElement<PercentItemType> creditConversionFactorElement683 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createCreditConversionFactor(creditConversionFactorValue682);
                                    bodyElements.add(creditConversionFactorElement683);
                                
                            }
                        
                            
                                
                                Unit pure684 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                pure684 = createUnitIfNotExist(pure684, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                
                            
                            // - CreditConversionFactor
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap688 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap688.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap688.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:OtherUnconditionallyCancellableCommitmentsMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorValue686 = DBS06ReportUtil.retrieveValueForElement(field.getCreditConversionFactor(), zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap688);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue687 = DBS06ReportUtil.retrieveFieldDataForElement(field.getCreditConversionFactor(), zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap688, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue687 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue687.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue687.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue687.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue687.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue687.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue687.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout2CreditConversionFactorContext685 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap688 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorValue686 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorValue686)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout2CreditConversionFactorContext685, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    PercentItemType creditConversionFactorValue689 = new PercentItemType();
                                    creditConversionFactorValue689.setContextRef(DBSLeverageRatioConsolidated_Layout2CreditConversionFactorContext685);
                                    
                                    creditConversionFactorValue689.setUnitRef(pure684);
                                    creditConversionFactorValue689.setDecimals("INF");
                                    creditConversionFactorValue689.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorValue686));
                                    
                                    
                                    JAXBElement<PercentItemType> creditConversionFactorElement690 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createCreditConversionFactor(creditConversionFactorValue689);
                                    bodyElements.add(creditConversionFactorElement690);
                                
                            }
                        
                            
                                
                                Unit pure691 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                pure691 = createUnitIfNotExist(pure691, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                
                            
                            // - CreditConversionFactor
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap695 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap695.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap695.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:OtherOffBalanceSheetItemsWith10PercentCreditConversionFactorMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorValue693 = DBS06ReportUtil.retrieveValueForElement(field.getCreditConversionFactor(), zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap695);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue694 = DBS06ReportUtil.retrieveFieldDataForElement(field.getCreditConversionFactor(), zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap695, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue694 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue694.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue694.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue694.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue694.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue694.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue694.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout2CreditConversionFactorContext692 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap695 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorValue693 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorValue693)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout2CreditConversionFactorContext692, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    PercentItemType creditConversionFactorValue696 = new PercentItemType();
                                    creditConversionFactorValue696.setContextRef(DBSLeverageRatioConsolidated_Layout2CreditConversionFactorContext692);
                                    
                                    creditConversionFactorValue696.setUnitRef(pure691);
                                    creditConversionFactorValue696.setDecimals("INF");
                                    creditConversionFactorValue696.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorValue693));
                                    
                                    
                                    JAXBElement<PercentItemType> creditConversionFactorElement697 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createCreditConversionFactor(creditConversionFactorValue696);
                                    bodyElements.add(creditConversionFactorElement697);
                                
                            }
                        
                            
                                
                                Unit pure698 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                pure698 = createUnitIfNotExist(pure698, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                
                            
                            // - CreditConversionFactor
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap702 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap702.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap702.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:OffBalanceSheetItemsWith20PercentCreditConversionFactorMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorValue700 = DBS06ReportUtil.retrieveValueForElement(field.getCreditConversionFactor(), zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap702);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue701 = DBS06ReportUtil.retrieveFieldDataForElement(field.getCreditConversionFactor(), zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap702, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue701 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue701.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue701.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue701.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue701.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue701.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue701.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout2CreditConversionFactorContext699 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap702 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorValue700 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorValue700)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout2CreditConversionFactorContext699, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    PercentItemType creditConversionFactorValue703 = new PercentItemType();
                                    creditConversionFactorValue703.setContextRef(DBSLeverageRatioConsolidated_Layout2CreditConversionFactorContext699);
                                    
                                    creditConversionFactorValue703.setUnitRef(pure698);
                                    creditConversionFactorValue703.setDecimals("INF");
                                    creditConversionFactorValue703.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorValue700));
                                    
                                    
                                    JAXBElement<PercentItemType> creditConversionFactorElement704 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createCreditConversionFactor(creditConversionFactorValue703);
                                    bodyElements.add(creditConversionFactorElement704);
                                
                            }
                        
                            
                                
                                Unit pure705 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                pure705 = createUnitIfNotExist(pure705, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                
                            
                            // - CreditConversionFactor
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap709 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap709.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap709.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:OffBalanceSheetItemsWith50PercentCreditConversionFactorMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorValue707 = DBS06ReportUtil.retrieveValueForElement(field.getCreditConversionFactor(), zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap709);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue708 = DBS06ReportUtil.retrieveFieldDataForElement(field.getCreditConversionFactor(), zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap709, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue708 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue708.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue708.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue708.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue708.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue708.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue708.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout2CreditConversionFactorContext706 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap709 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorValue707 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorValue707)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout2CreditConversionFactorContext706, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    PercentItemType creditConversionFactorValue710 = new PercentItemType();
                                    creditConversionFactorValue710.setContextRef(DBSLeverageRatioConsolidated_Layout2CreditConversionFactorContext706);
                                    
                                    creditConversionFactorValue710.setUnitRef(pure705);
                                    creditConversionFactorValue710.setDecimals("INF");
                                    creditConversionFactorValue710.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorValue707));
                                    
                                    
                                    JAXBElement<PercentItemType> creditConversionFactorElement711 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createCreditConversionFactor(creditConversionFactorValue710);
                                    bodyElements.add(creditConversionFactorElement711);
                                
                            }
                        
                            
                                
                                Unit pure712 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                pure712 = createUnitIfNotExist(pure712, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                
                            
                            // - CreditConversionFactor
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap716 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap716.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap716.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:OffBalanceSheetItemsWith100PercentCreditConversionFactorMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorValue714 = DBS06ReportUtil.retrieveValueForElement(field.getCreditConversionFactor(), zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap716);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue715 = DBS06ReportUtil.retrieveFieldDataForElement(field.getCreditConversionFactor(), zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap716, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue715 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue715.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue715.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue715.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue715.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue715.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorFieldDataValue715.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout2CreditConversionFactorContext713 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorMap716 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorValue714 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorValue714)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout2CreditConversionFactorContext713, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    PercentItemType creditConversionFactorValue717 = new PercentItemType();
                                    creditConversionFactorValue717.setContextRef(DBSLeverageRatioConsolidated_Layout2CreditConversionFactorContext713);
                                    
                                    creditConversionFactorValue717.setUnitRef(pure712);
                                    creditConversionFactorValue717.setDecimals("INF");
                                    creditConversionFactorValue717.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout2CreditConversionFactorValue714));
                                    
                                    
                                    JAXBElement<PercentItemType> creditConversionFactorElement718 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createCreditConversionFactor(creditConversionFactorValue717);
                                    bodyElements.add(creditConversionFactorElement718);
                                
                            }
                        
                        
                    
                    
            
                    
                    
                    
                    return "";
                    }

                
                    
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBSLeverageRatioConsolidated_Layout3 if any typeMembers then List or Single
                //DBSLeverageRatioConsolidated_Layout3 dBSLeverageRatioConsolidated_Layout3 = mainReportData.getDBSLeverageRatioConsolidated_Layout3();
                
                    private String dBSLeverageRatioConsolidated_Layout3Method(DBSLeverageRatioConsolidated_Layout3 dBSLeverageRatioConsolidated_Layout3, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                
                    {
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                    DBSLeverageRatioConsolidated_Layout3 field = dBSLeverageRatioConsolidated_Layout3;
                    
                    
                        
                        
                            
                                
                                Unit INR719 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR719 = createUnitIfNotExist(INR719, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap723 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap723.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap723.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:CreditDerivativesProtectionSoldMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue721 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap723);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue722 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap723, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue722 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue722.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue722.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue722.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue722.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue722.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue722.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext720 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap723 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue721 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue721)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext720, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue724 = new MonetaryItemType();
                                    notionalPrincipalAmountValue724.setContextRef(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext720);
                                    
                                    notionalPrincipalAmountValue724.setUnitRef(INR719);
                                    notionalPrincipalAmountValue724.setDecimals("INF");
                                    notionalPrincipalAmountValue724.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue721));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement725 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue724);
                                    bodyElements.add(notionalPrincipalAmountElement725);
                                
                            }
                        
                            
                                
                                Unit INR726 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR726 = createUnitIfNotExist(INR726, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap730 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap730.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap730.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:CreditDerivativesProtectionSoldMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue728 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap730);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue729 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap730, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue729 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue729.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue729.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue729.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue729.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue729.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue729.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3ReplacementCostContext727 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap730 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue728 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue728)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext727, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue731 = new MonetaryItemType();
                                    replacementCostValue731.setContextRef(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext727);
                                    
                                    replacementCostValue731.setUnitRef(INR726);
                                    replacementCostValue731.setDecimals("INF");
                                    replacementCostValue731.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue728));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement732 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue731);
                                    bodyElements.add(replacementCostElement732);
                                
                            }
                        
                            
                                
                                Unit INR733 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR733 = createUnitIfNotExist(INR733, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - PotentialFutureExposure
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap737 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap737.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap737.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:CreditDerivativesProtectionSoldMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue735 = DBS06ReportUtil.retrieveValueForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap737);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue736 = DBS06ReportUtil.retrieveFieldDataForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap737, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue736 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue736.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue736.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue736.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue736.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue736.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue736.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext734 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap737 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue735 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue735)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext734, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType potentialFutureExposureValue738 = new MonetaryItemType();
                                    potentialFutureExposureValue738.setContextRef(DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext734);
                                    
                                    potentialFutureExposureValue738.setUnitRef(INR733);
                                    potentialFutureExposureValue738.setDecimals("INF");
                                    potentialFutureExposureValue738.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue735));
                                    
                                    
                                    JAXBElement<MonetaryItemType> potentialFutureExposureElement739 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createPotentialFutureExposure(potentialFutureExposureValue738);
                                    bodyElements.add(potentialFutureExposureElement739);
                                
                            }
                        
                            
                                
                                Unit INR740 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR740 = createUnitIfNotExist(INR740, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap744 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap744.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap744.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:CreditDerivativesProtectionBoughtMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue742 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap744);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue743 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap744, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue743 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue743.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue743.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue743.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue743.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue743.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue743.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext741 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap744 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue742 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue742)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext741, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue745 = new MonetaryItemType();
                                    notionalPrincipalAmountValue745.setContextRef(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext741);
                                    
                                    notionalPrincipalAmountValue745.setUnitRef(INR740);
                                    notionalPrincipalAmountValue745.setDecimals("INF");
                                    notionalPrincipalAmountValue745.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue742));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement746 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue745);
                                    bodyElements.add(notionalPrincipalAmountElement746);
                                
                            }
                        
                            
                                
                                Unit INR747 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR747 = createUnitIfNotExist(INR747, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap751 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap751.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap751.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:CreditDerivativesProtectionBoughtMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue749 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap751);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue750 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap751, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue750 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue750.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue750.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue750.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue750.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue750.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue750.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3ReplacementCostContext748 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap751 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue749 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue749)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext748, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue752 = new MonetaryItemType();
                                    replacementCostValue752.setContextRef(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext748);
                                    
                                    replacementCostValue752.setUnitRef(INR747);
                                    replacementCostValue752.setDecimals("INF");
                                    replacementCostValue752.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue749));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement753 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue752);
                                    bodyElements.add(replacementCostElement753);
                                
                            }
                        
                            
                                
                                Unit INR754 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR754 = createUnitIfNotExist(INR754, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - PotentialFutureExposure
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap758 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap758.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap758.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:CreditDerivativesProtectionBoughtMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue756 = DBS06ReportUtil.retrieveValueForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap758);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue757 = DBS06ReportUtil.retrieveFieldDataForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap758, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue757 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue757.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue757.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue757.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue757.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue757.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue757.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext755 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap758 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue756 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue756)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext755, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType potentialFutureExposureValue759 = new MonetaryItemType();
                                    potentialFutureExposureValue759.setContextRef(DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext755);
                                    
                                    potentialFutureExposureValue759.setUnitRef(INR754);
                                    potentialFutureExposureValue759.setDecimals("INF");
                                    potentialFutureExposureValue759.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue756));
                                    
                                    
                                    JAXBElement<MonetaryItemType> potentialFutureExposureElement760 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createPotentialFutureExposure(potentialFutureExposureValue759);
                                    bodyElements.add(potentialFutureExposureElement760);
                                
                            }
                        
                            
                                
                                Unit INR761 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR761 = createUnitIfNotExist(INR761, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap765 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap765.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap765.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:FinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue763 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap765);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue764 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap765, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue764 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue764.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue764.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue764.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue764.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue764.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue764.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext762 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap765 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue763 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue763)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext762, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue766 = new MonetaryItemType();
                                    notionalPrincipalAmountValue766.setContextRef(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext762);
                                    
                                    notionalPrincipalAmountValue766.setUnitRef(INR761);
                                    notionalPrincipalAmountValue766.setDecimals("INF");
                                    notionalPrincipalAmountValue766.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue763));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement767 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue766);
                                    bodyElements.add(notionalPrincipalAmountElement767);
                                
                            }
                        
                            
                                
                                Unit INR768 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR768 = createUnitIfNotExist(INR768, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap772 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap772.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap772.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:FinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue770 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap772);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue771 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap772, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue771 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue771.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue771.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue771.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue771.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue771.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue771.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3ReplacementCostContext769 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap772 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue770 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue770)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext769, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue773 = new MonetaryItemType();
                                    replacementCostValue773.setContextRef(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext769);
                                    
                                    replacementCostValue773.setUnitRef(INR768);
                                    replacementCostValue773.setDecimals("INF");
                                    replacementCostValue773.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue770));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement774 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue773);
                                    bodyElements.add(replacementCostElement774);
                                
                            }
                        
                            
                                
                                Unit INR775 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR775 = createUnitIfNotExist(INR775, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - PotentialFutureExposure
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap779 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap779.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap779.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:FinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue777 = DBS06ReportUtil.retrieveValueForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap779);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue778 = DBS06ReportUtil.retrieveFieldDataForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap779, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue778 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue778.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue778.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue778.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue778.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue778.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue778.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext776 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap779 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue777 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue777)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext776, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType potentialFutureExposureValue780 = new MonetaryItemType();
                                    potentialFutureExposureValue780.setContextRef(DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext776);
                                    
                                    potentialFutureExposureValue780.setUnitRef(INR775);
                                    potentialFutureExposureValue780.setDecimals("INF");
                                    potentialFutureExposureValue780.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue777));
                                    
                                    
                                    JAXBElement<MonetaryItemType> potentialFutureExposureElement781 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createPotentialFutureExposure(potentialFutureExposureValue780);
                                    bodyElements.add(potentialFutureExposureElement781);
                                
                            }
                        
                            
                                
                                Unit INR782 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR782 = createUnitIfNotExist(INR782, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap786 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap786.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap786.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue784 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap786);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue785 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap786, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue785 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue785.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue785.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue785.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue785.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue785.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue785.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext783 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap786 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue784 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue784)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext783, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue787 = new MonetaryItemType();
                                    notionalPrincipalAmountValue787.setContextRef(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext783);
                                    
                                    notionalPrincipalAmountValue787.setUnitRef(INR782);
                                    notionalPrincipalAmountValue787.setDecimals("INF");
                                    notionalPrincipalAmountValue787.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue784));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement788 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue787);
                                    bodyElements.add(notionalPrincipalAmountElement788);
                                
                            }
                        
                            
                                
                                Unit INR789 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR789 = createUnitIfNotExist(INR789, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap793 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap793.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap793.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue791 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap793);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue792 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap793, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue792 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue792.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue792.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue792.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue792.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue792.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue792.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3ReplacementCostContext790 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap793 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue791 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue791)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext790, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue794 = new MonetaryItemType();
                                    replacementCostValue794.setContextRef(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext790);
                                    
                                    replacementCostValue794.setUnitRef(INR789);
                                    replacementCostValue794.setDecimals("INF");
                                    replacementCostValue794.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue791));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement795 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue794);
                                    bodyElements.add(replacementCostElement795);
                                
                            }
                        
                            
                                
                                Unit INR796 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR796 = createUnitIfNotExist(INR796, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - PotentialFutureExposure
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap800 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap800.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap800.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue798 = DBS06ReportUtil.retrieveValueForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap800);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue799 = DBS06ReportUtil.retrieveFieldDataForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap800, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue799 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue799.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue799.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue799.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue799.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue799.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue799.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext797 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap800 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue798 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue798)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext797, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType potentialFutureExposureValue801 = new MonetaryItemType();
                                    potentialFutureExposureValue801.setContextRef(DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext797);
                                    
                                    potentialFutureExposureValue801.setUnitRef(INR796);
                                    potentialFutureExposureValue801.setDecimals("INF");
                                    potentialFutureExposureValue801.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue798));
                                    
                                    
                                    JAXBElement<MonetaryItemType> potentialFutureExposureElement802 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createPotentialFutureExposure(potentialFutureExposureValue801);
                                    bodyElements.add(potentialFutureExposureElement802);
                                
                            }
                        
                            
                                
                                Unit INR803 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR803 = createUnitIfNotExist(INR803, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap807 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap807.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap807.put("in-rbi-rep:ExposureClassAxis", "rbi-core:ExposureToQCCPsMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap807.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue805 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap807);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue806 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap807, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue806 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue806.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue806.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue806.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue806.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue806.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue806.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext804 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap807 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue805 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue805)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext804, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue808 = new MonetaryItemType();
                                    notionalPrincipalAmountValue808.setContextRef(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext804);
                                    
                                    notionalPrincipalAmountValue808.setUnitRef(INR803);
                                    notionalPrincipalAmountValue808.setDecimals("INF");
                                    notionalPrincipalAmountValue808.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue805));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement809 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue808);
                                    bodyElements.add(notionalPrincipalAmountElement809);
                                
                            }
                        
                            
                                
                                Unit INR810 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR810 = createUnitIfNotExist(INR810, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap814 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap814.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap814.put("in-rbi-rep:ExposureClassAxis", "rbi-core:ExposureToQCCPsMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap814.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue812 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap814);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue813 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap814, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue813 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue813.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue813.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue813.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue813.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue813.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue813.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3ReplacementCostContext811 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap814 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue812 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue812)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext811, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue815 = new MonetaryItemType();
                                    replacementCostValue815.setContextRef(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext811);
                                    
                                    replacementCostValue815.setUnitRef(INR810);
                                    replacementCostValue815.setDecimals("INF");
                                    replacementCostValue815.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue812));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement816 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue815);
                                    bodyElements.add(replacementCostElement816);
                                
                            }
                        
                            
                                
                                Unit INR817 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR817 = createUnitIfNotExist(INR817, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - PotentialFutureExposure
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap821 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap821.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap821.put("in-rbi-rep:ExposureClassAxis", "rbi-core:ExposureToQCCPsMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap821.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue819 = DBS06ReportUtil.retrieveValueForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap821);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue820 = DBS06ReportUtil.retrieveFieldDataForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap821, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue820 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue820.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue820.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue820.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue820.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue820.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue820.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext818 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap821 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue819 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue819)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext818, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType potentialFutureExposureValue822 = new MonetaryItemType();
                                    potentialFutureExposureValue822.setContextRef(DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext818);
                                    
                                    potentialFutureExposureValue822.setUnitRef(INR817);
                                    potentialFutureExposureValue822.setDecimals("INF");
                                    potentialFutureExposureValue822.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue819));
                                    
                                    
                                    JAXBElement<MonetaryItemType> potentialFutureExposureElement823 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createPotentialFutureExposure(potentialFutureExposureValue822);
                                    bodyElements.add(potentialFutureExposureElement823);
                                
                            }
                        
                            
                                
                                Unit INR824 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR824 = createUnitIfNotExist(INR824, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap828 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap828.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap828.put("in-rbi-rep:ExposureClassAxis", "rbi-core:ExposureToNonQCCPsMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap828.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue826 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap828);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue827 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap828, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue827 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue827.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue827.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue827.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue827.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue827.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue827.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext825 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap828 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue826 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue826)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext825, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue829 = new MonetaryItemType();
                                    notionalPrincipalAmountValue829.setContextRef(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext825);
                                    
                                    notionalPrincipalAmountValue829.setUnitRef(INR824);
                                    notionalPrincipalAmountValue829.setDecimals("INF");
                                    notionalPrincipalAmountValue829.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue826));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement830 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue829);
                                    bodyElements.add(notionalPrincipalAmountElement830);
                                
                            }
                        
                            
                                
                                Unit INR831 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR831 = createUnitIfNotExist(INR831, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap835 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap835.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap835.put("in-rbi-rep:ExposureClassAxis", "rbi-core:ExposureToNonQCCPsMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap835.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue833 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap835);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue834 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap835, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue834 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue834.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue834.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue834.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue834.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue834.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue834.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3ReplacementCostContext832 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap835 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue833 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue833)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext832, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue836 = new MonetaryItemType();
                                    replacementCostValue836.setContextRef(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext832);
                                    
                                    replacementCostValue836.setUnitRef(INR831);
                                    replacementCostValue836.setDecimals("INF");
                                    replacementCostValue836.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue833));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement837 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue836);
                                    bodyElements.add(replacementCostElement837);
                                
                            }
                        
                            
                                
                                Unit INR838 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR838 = createUnitIfNotExist(INR838, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - PotentialFutureExposure
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap842 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap842.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap842.put("in-rbi-rep:ExposureClassAxis", "rbi-core:ExposureToNonQCCPsMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap842.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue840 = DBS06ReportUtil.retrieveValueForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap842);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue841 = DBS06ReportUtil.retrieveFieldDataForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap842, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue841 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue841.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue841.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue841.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue841.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue841.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue841.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext839 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap842 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue840 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue840)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext839, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType potentialFutureExposureValue843 = new MonetaryItemType();
                                    potentialFutureExposureValue843.setContextRef(DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext839);
                                    
                                    potentialFutureExposureValue843.setUnitRef(INR838);
                                    potentialFutureExposureValue843.setDecimals("INF");
                                    potentialFutureExposureValue843.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue840));
                                    
                                    
                                    JAXBElement<MonetaryItemType> potentialFutureExposureElement844 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createPotentialFutureExposure(potentialFutureExposureValue843);
                                    bodyElements.add(potentialFutureExposureElement844);
                                
                            }
                        
                            
                                
                                Unit INR845 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR845 = createUnitIfNotExist(INR845, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap849 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap849.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap849.put("in-rbi-rep:ExposureClassAxis", "rbi-core:ExposureDueToNonCentrallyClearedDerivativesMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap849.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue847 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap849);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue848 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap849, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue848 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue848.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue848.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue848.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue848.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue848.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue848.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext846 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap849 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue847 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue847)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext846, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue850 = new MonetaryItemType();
                                    notionalPrincipalAmountValue850.setContextRef(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext846);
                                    
                                    notionalPrincipalAmountValue850.setUnitRef(INR845);
                                    notionalPrincipalAmountValue850.setDecimals("INF");
                                    notionalPrincipalAmountValue850.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue847));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement851 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue850);
                                    bodyElements.add(notionalPrincipalAmountElement851);
                                
                            }
                        
                            
                                
                                Unit INR852 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR852 = createUnitIfNotExist(INR852, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap856 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap856.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap856.put("in-rbi-rep:ExposureClassAxis", "rbi-core:ExposureDueToNonCentrallyClearedDerivativesMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap856.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue854 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap856);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue855 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap856, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue855 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue855.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue855.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue855.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue855.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue855.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue855.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3ReplacementCostContext853 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap856 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue854 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue854)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext853, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue857 = new MonetaryItemType();
                                    replacementCostValue857.setContextRef(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext853);
                                    
                                    replacementCostValue857.setUnitRef(INR852);
                                    replacementCostValue857.setDecimals("INF");
                                    replacementCostValue857.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue854));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement858 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue857);
                                    bodyElements.add(replacementCostElement858);
                                
                            }
                        
                            
                                
                                Unit INR859 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR859 = createUnitIfNotExist(INR859, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - PotentialFutureExposure
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap863 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap863.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap863.put("in-rbi-rep:ExposureClassAxis", "rbi-core:ExposureDueToNonCentrallyClearedDerivativesMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap863.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue861 = DBS06ReportUtil.retrieveValueForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap863);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue862 = DBS06ReportUtil.retrieveFieldDataForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap863, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue862 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue862.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue862.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue862.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue862.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue862.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue862.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext860 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap863 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue861 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue861)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext860, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType potentialFutureExposureValue864 = new MonetaryItemType();
                                    potentialFutureExposureValue864.setContextRef(DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext860);
                                    
                                    potentialFutureExposureValue864.setUnitRef(INR859);
                                    potentialFutureExposureValue864.setDecimals("INF");
                                    potentialFutureExposureValue864.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue861));
                                    
                                    
                                    JAXBElement<MonetaryItemType> potentialFutureExposureElement865 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createPotentialFutureExposure(potentialFutureExposureValue864);
                                    bodyElements.add(potentialFutureExposureElement865);
                                
                            }
                        
                            
                                
                                Unit INR866 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR866 = createUnitIfNotExist(INR866, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap870 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap870.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap870.put("in-rbi-rep:ExposureClassAxis", "rbi-core:OtherExposuresMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap870.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue868 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap870);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue869 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap870, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue869 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue869.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue869.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue869.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue869.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue869.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue869.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext867 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap870 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue868 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue868)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext867, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue871 = new MonetaryItemType();
                                    notionalPrincipalAmountValue871.setContextRef(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext867);
                                    
                                    notionalPrincipalAmountValue871.setUnitRef(INR866);
                                    notionalPrincipalAmountValue871.setDecimals("INF");
                                    notionalPrincipalAmountValue871.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue868));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement872 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue871);
                                    bodyElements.add(notionalPrincipalAmountElement872);
                                
                            }
                        
                            
                                
                                Unit INR873 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR873 = createUnitIfNotExist(INR873, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap877 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap877.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap877.put("in-rbi-rep:ExposureClassAxis", "rbi-core:OtherExposuresMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap877.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue875 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap877);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue876 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap877, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue876 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue876.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue876.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue876.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue876.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue876.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue876.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3ReplacementCostContext874 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap877 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue875 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue875)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext874, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue878 = new MonetaryItemType();
                                    replacementCostValue878.setContextRef(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext874);
                                    
                                    replacementCostValue878.setUnitRef(INR873);
                                    replacementCostValue878.setDecimals("INF");
                                    replacementCostValue878.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue875));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement879 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue878);
                                    bodyElements.add(replacementCostElement879);
                                
                            }
                        
                            
                                
                                Unit INR880 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR880 = createUnitIfNotExist(INR880, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - PotentialFutureExposure
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap884 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap884.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap884.put("in-rbi-rep:ExposureClassAxis", "rbi-core:OtherExposuresMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap884.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:AggregateOfCreditAndFinancialDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue882 = DBS06ReportUtil.retrieveValueForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap884);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue883 = DBS06ReportUtil.retrieveFieldDataForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap884, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue883 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue883.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue883.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue883.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue883.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue883.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue883.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext881 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap884 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue882 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue882)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext881, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType potentialFutureExposureValue885 = new MonetaryItemType();
                                    potentialFutureExposureValue885.setContextRef(DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext881);
                                    
                                    potentialFutureExposureValue885.setUnitRef(INR880);
                                    potentialFutureExposureValue885.setDecimals("INF");
                                    potentialFutureExposureValue885.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue882));
                                    
                                    
                                    JAXBElement<MonetaryItemType> potentialFutureExposureElement886 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createPotentialFutureExposure(potentialFutureExposureValue885);
                                    bodyElements.add(potentialFutureExposureElement886);
                                
                            }
                        
                            
                                
                                Unit INR887 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR887 = createUnitIfNotExist(INR887, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap891 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap891.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap891.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:ExemptedCCPLegOfClientClearedTradeExposuresMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue889 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap891);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue890 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap891, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue890 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue890.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue890.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue890.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue890.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue890.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue890.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext888 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap891 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue889 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue889)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext888, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue892 = new MonetaryItemType();
                                    notionalPrincipalAmountValue892.setContextRef(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext888);
                                    
                                    notionalPrincipalAmountValue892.setUnitRef(INR887);
                                    notionalPrincipalAmountValue892.setDecimals("INF");
                                    notionalPrincipalAmountValue892.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue889));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement893 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue892);
                                    bodyElements.add(notionalPrincipalAmountElement893);
                                
                            }
                        
                            
                                
                                Unit INR894 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR894 = createUnitIfNotExist(INR894, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap898 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap898.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap898.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:ExemptedCCPLegOfClientClearedTradeExposuresMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue896 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap898);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue897 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap898, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue897 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue897.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue897.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue897.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue897.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue897.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue897.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3ReplacementCostContext895 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap898 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue896 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue896)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext895, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue899 = new MonetaryItemType();
                                    replacementCostValue899.setContextRef(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext895);
                                    
                                    replacementCostValue899.setUnitRef(INR894);
                                    replacementCostValue899.setDecimals("INF");
                                    replacementCostValue899.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue896));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement900 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue899);
                                    bodyElements.add(replacementCostElement900);
                                
                            }
                        
                            
                                
                                Unit INR901 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR901 = createUnitIfNotExist(INR901, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - PotentialFutureExposure
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap905 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap905.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap905.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:ExemptedCCPLegOfClientClearedTradeExposuresMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue903 = DBS06ReportUtil.retrieveValueForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap905);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue904 = DBS06ReportUtil.retrieveFieldDataForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap905, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue904 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue904.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue904.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue904.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue904.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue904.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue904.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext902 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap905 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue903 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue903)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext902, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType potentialFutureExposureValue906 = new MonetaryItemType();
                                    potentialFutureExposureValue906.setContextRef(DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext902);
                                    
                                    potentialFutureExposureValue906.setUnitRef(INR901);
                                    potentialFutureExposureValue906.setDecimals("INF");
                                    potentialFutureExposureValue906.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue903));
                                    
                                    
                                    JAXBElement<MonetaryItemType> potentialFutureExposureElement907 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createPotentialFutureExposure(potentialFutureExposureValue906);
                                    bodyElements.add(potentialFutureExposureElement907);
                                
                            }
                        
                            
                                
                                Unit INR908 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR908 = createUnitIfNotExist(INR908, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap912 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap912.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap912.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:EffectiveNotionalAmountOfWrittenCreditDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue910 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap912);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue911 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap912, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue911 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue911.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue911.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue911.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue911.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue911.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue911.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext909 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap912 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue910 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue910)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext909, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue913 = new MonetaryItemType();
                                    notionalPrincipalAmountValue913.setContextRef(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext909);
                                    
                                    notionalPrincipalAmountValue913.setUnitRef(INR908);
                                    notionalPrincipalAmountValue913.setDecimals("INF");
                                    notionalPrincipalAmountValue913.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue910));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement914 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue913);
                                    bodyElements.add(notionalPrincipalAmountElement914);
                                
                            }
                        
                            
                                
                                Unit INR915 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR915 = createUnitIfNotExist(INR915, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap919 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap919.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap919.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:NegativeChangeInFairValueOfWrittenCreditDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue917 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap919);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue918 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap919, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue918 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue918.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue918.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue918.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue918.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue918.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue918.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext916 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap919 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue917 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue917)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext916, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue920 = new MonetaryItemType();
                                    notionalPrincipalAmountValue920.setContextRef(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext916);
                                    
                                    notionalPrincipalAmountValue920.setUnitRef(INR915);
                                    notionalPrincipalAmountValue920.setDecimals("INF");
                                    notionalPrincipalAmountValue920.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue917));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement921 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue920);
                                    bodyElements.add(notionalPrincipalAmountElement921);
                                
                            }
                        
                            
                                
                                Unit INR922 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR922 = createUnitIfNotExist(INR922, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap926 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap926.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap926.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:EffectiveNotionalAmountOfWrittenCreditDerivativesAdjustedForNegativeChangeInFairValueMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue924 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap926);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue925 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap926, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue925 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue925.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue925.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue925.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue925.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue925.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue925.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext923 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap926 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue924 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue924)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext923, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue927 = new MonetaryItemType();
                                    notionalPrincipalAmountValue927.setContextRef(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext923);
                                    
                                    notionalPrincipalAmountValue927.setUnitRef(INR922);
                                    notionalPrincipalAmountValue927.setDecimals("INF");
                                    notionalPrincipalAmountValue927.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue924));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement928 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue927);
                                    bodyElements.add(notionalPrincipalAmountElement928);
                                
                            }
                        
                            
                                
                                Unit INR929 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR929 = createUnitIfNotExist(INR929, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap933 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap933.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap933.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:CreditDerivativesBoughtMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue931 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap933);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue932 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap933, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue932 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue932.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue932.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue932.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue932.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue932.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue932.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext930 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap933 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue931 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue931)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext930, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue934 = new MonetaryItemType();
                                    notionalPrincipalAmountValue934.setContextRef(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext930);
                                    
                                    notionalPrincipalAmountValue934.setUnitRef(INR929);
                                    notionalPrincipalAmountValue934.setDecimals("INF");
                                    notionalPrincipalAmountValue934.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue931));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement935 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue934);
                                    bodyElements.add(notionalPrincipalAmountElement935);
                                
                            }
                        
                            
                                
                                Unit INR936 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR936 = createUnitIfNotExist(INR936, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap940 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap940.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap940.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:NetAdjustedEffectiveNotionalAmountOfWrittenCreditDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue938 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap940);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue939 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap940, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue939 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue939.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue939.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue939.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue939.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue939.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue939.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext937 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap940 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue938 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue938)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext937, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue941 = new MonetaryItemType();
                                    notionalPrincipalAmountValue941.setContextRef(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext937);
                                    
                                    notionalPrincipalAmountValue941.setUnitRef(INR936);
                                    notionalPrincipalAmountValue941.setDecimals("INF");
                                    notionalPrincipalAmountValue941.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue938));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement942 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue941);
                                    bodyElements.add(notionalPrincipalAmountElement942);
                                
                            }
                        
                            
                                
                                Unit INR943 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR943 = createUnitIfNotExist(INR943, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap947 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap947.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap947.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:DeductionForAjustmentOfPFEAmountRelatingToWrittenCreditDerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue945 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap947);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue946 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap947, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue946 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue946.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue946.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue946.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue946.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue946.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue946.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext944 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap947 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue945 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue945)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext944, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue948 = new MonetaryItemType();
                                    notionalPrincipalAmountValue948.setContextRef(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext944);
                                    
                                    notionalPrincipalAmountValue948.setUnitRef(INR943);
                                    notionalPrincipalAmountValue948.setDecimals("INF");
                                    notionalPrincipalAmountValue948.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue945));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement949 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue948);
                                    bodyElements.add(notionalPrincipalAmountElement949);
                                
                            }
                        
                            
                                
                                Unit INR950 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR950 = createUnitIfNotExist(INR950, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - NotionalPrincipalAmount
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap954 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap954.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap954.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:WrittenCreditDerivativesNetMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue952 = DBS06ReportUtil.retrieveValueForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap954);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue953 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNotionalPrincipalAmount(), zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap954, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue953 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue953.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue953.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue953.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue953.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue953.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountFieldDataValue953.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext951 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountMap954 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue952 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue952)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext951, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType notionalPrincipalAmountValue955 = new MonetaryItemType();
                                    notionalPrincipalAmountValue955.setContextRef(DBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountContext951);
                                    
                                    notionalPrincipalAmountValue955.setUnitRef(INR950);
                                    notionalPrincipalAmountValue955.setDecimals("INF");
                                    notionalPrincipalAmountValue955.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3NotionalPrincipalAmountValue952));
                                    
                                    
                                    JAXBElement<MonetaryItemType> notionalPrincipalAmountElement956 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNotionalPrincipalAmount(notionalPrincipalAmountValue955);
                                    bodyElements.add(notionalPrincipalAmountElement956);
                                
                            }
                        
                            
                                
                                Unit INR957 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR957 = createUnitIfNotExist(INR957, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap961 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap961.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap961.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:GrossUpForDerivativeCollateralProvidedWhereDeductedFromTheBalanceSheetMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue959 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap961);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue960 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap961, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue960 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue960.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue960.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue960.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue960.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue960.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue960.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3ReplacementCostContext958 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap961 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue959 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue959)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext958, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue962 = new MonetaryItemType();
                                    replacementCostValue962.setContextRef(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext958);
                                    
                                    replacementCostValue962.setUnitRef(INR957);
                                    replacementCostValue962.setDecimals("INF");
                                    replacementCostValue962.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue959));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement963 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue962);
                                    bodyElements.add(replacementCostElement963);
                                
                            }
                        
                            
                                
                                Unit INR964 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR964 = createUnitIfNotExist(INR964, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap968 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap968.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap968.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:EligibleCashVariationMarginReceivedInDerivativeExpsouresMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue966 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap968);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue967 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap968, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue967 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue967.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue967.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue967.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue967.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue967.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue967.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3ReplacementCostContext965 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap968 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue966 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue966)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext965, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue969 = new MonetaryItemType();
                                    replacementCostValue969.setContextRef(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext965);
                                    
                                    replacementCostValue969.setUnitRef(INR964);
                                    replacementCostValue969.setDecimals("INF");
                                    replacementCostValue969.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue966));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement970 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue969);
                                    bodyElements.add(replacementCostElement970);
                                
                            }
                        
                            
                                
                                Unit INR971 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR971 = createUnitIfNotExist(INR971, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap975 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap975.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap975.put("rbi-core:LeverageRatioExposureAxis", "rbi-core:ReceivableAssetsForCashVariationMarginProvidedInDerivativeExposuresMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue973 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap975);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue974 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap975, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue974 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue974.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue974.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue974.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue974.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue974.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue974.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3ReplacementCostContext972 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap975 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue973 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue973)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext972, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue976 = new MonetaryItemType();
                                    replacementCostValue976.setContextRef(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext972);
                                    
                                    replacementCostValue976.setUnitRef(INR971);
                                    replacementCostValue976.setDecimals("INF");
                                    replacementCostValue976.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue973));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement977 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue976);
                                    bodyElements.add(replacementCostElement977);
                                
                            }
                        
                            
                                
                                Unit INR978 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR978 = createUnitIfNotExist(INR978, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ReplacementCost
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap982 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap982.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap982.put("rbi-core:LeverageRatioExposureAxis", "in-rbi-rep:DerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue980 = DBS06ReportUtil.retrieveValueForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap982);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue981 = DBS06ReportUtil.retrieveFieldDataForElement(field.getReplacementCost(), zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap982, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue981 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue981.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue981.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue981.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue981.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue981.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostFieldDataValue981.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3ReplacementCostContext979 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostMap982 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue980 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue980)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext979, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType replacementCostValue983 = new MonetaryItemType();
                                    replacementCostValue983.setContextRef(DBSLeverageRatioConsolidated_Layout3ReplacementCostContext979);
                                    
                                    replacementCostValue983.setUnitRef(INR978);
                                    replacementCostValue983.setDecimals("INF");
                                    replacementCostValue983.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3ReplacementCostValue980));
                                    
                                    
                                    JAXBElement<MonetaryItemType> replacementCostElement984 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReplacementCost(replacementCostValue983);
                                    bodyElements.add(replacementCostElement984);
                                
                            }
                        
                            
                                
                                Unit INR985 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR985 = createUnitIfNotExist(INR985, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - PotentialFutureExposure
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap989 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap989.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap989.put("rbi-core:LeverageRatioExposureAxis", "in-rbi-rep:DerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue987 = DBS06ReportUtil.retrieveValueForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap989);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue988 = DBS06ReportUtil.retrieveFieldDataForElement(field.getPotentialFutureExposure(), zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap989, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue988 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue988.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue988.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue988.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue988.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue988.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureFieldDataValue988.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext986 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureMap989 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue987 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue987)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext986, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType potentialFutureExposureValue990 = new MonetaryItemType();
                                    potentialFutureExposureValue990.setContextRef(DBSLeverageRatioConsolidated_Layout3PotentialFutureExposureContext986);
                                    
                                    potentialFutureExposureValue990.setUnitRef(INR985);
                                    potentialFutureExposureValue990.setDecimals("INF");
                                    potentialFutureExposureValue990.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3PotentialFutureExposureValue987));
                                    
                                    
                                    JAXBElement<MonetaryItemType> potentialFutureExposureElement991 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createPotentialFutureExposure(potentialFutureExposureValue990);
                                    bodyElements.add(potentialFutureExposureElement991);
                                
                            }
                        
                            
                                
                                Unit INR992 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR992 = createUnitIfNotExist(INR992, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ExposureAmount
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout3ExposureAmountMap996 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ExposureAmountMap996.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout3ExposureAmountMap996.put("rbi-core:LeverageRatioExposureAxis", "in-rbi-rep:DerivativesMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout3ExposureAmountValue994 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBSLeverageRatioConsolidated_Layout3ExposureAmountMap996);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout3ExposureAmountFieldDataValue995 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), zeroDBSLeverageRatioConsolidated_Layout3ExposureAmountMap996, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout3ExposureAmountFieldDataValue995 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ExposureAmountFieldDataValue995.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout3ExposureAmountFieldDataValue995.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ExposureAmountFieldDataValue995.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout3ExposureAmountFieldDataValue995.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout3ExposureAmountFieldDataValue995.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout3ExposureAmountFieldDataValue995.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout3ExposureAmountContext993 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout3ExposureAmountMap996 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout3ExposureAmountValue994 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout3ExposureAmountValue994)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout3ExposureAmountContext993, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType exposureAmountValue997 = new MonetaryItemType();
                                    exposureAmountValue997.setContextRef(DBSLeverageRatioConsolidated_Layout3ExposureAmountContext993);
                                    
                                    exposureAmountValue997.setUnitRef(INR992);
                                    exposureAmountValue997.setDecimals("INF");
                                    exposureAmountValue997.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout3ExposureAmountValue994));
                                    
                                    
                                    JAXBElement<MonetaryItemType> exposureAmountElement998 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue997);
                                    bodyElements.add(exposureAmountElement998);
                                
                            }
                        
                        
                    
                    
            
                    
                    
                    
                    return "";
                    }

                
                    
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBSLeverageRatioConsolidated_Layout4 if any typeMembers then List or Single
                //DBSLeverageRatioConsolidated_Layout4 dBSLeverageRatioConsolidated_Layout4 = mainReportData.getDBSLeverageRatioConsolidated_Layout4();
                
                    private String dBSLeverageRatioConsolidated_Layout4Method(DBSLeverageRatioConsolidated_Layout4 dBSLeverageRatioConsolidated_Layout4, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                
                    {
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                    DBSLeverageRatioConsolidated_Layout4 field = dBSLeverageRatioConsolidated_Layout4;
                    
                    
                        
                        
                            
                                
                                Unit INR999 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR999 = createUnitIfNotExist(INR999, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - ExposureAmount
                            
                                Map zeroDBSLeverageRatioConsolidated_Layout4ExposureAmountMap1003 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBSLeverageRatioConsolidated_Layout4ExposureAmountMap1003.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                    
                                    String zeroDBSLeverageRatioConsolidated_Layout4ExposureAmountValue1001 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBSLeverageRatioConsolidated_Layout4ExposureAmountMap1003);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSLeverageRatioConsolidated_Layout4ExposureAmountFieldDataValue1002 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), zeroDBSLeverageRatioConsolidated_Layout4ExposureAmountMap1003, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBSLeverageRatioConsolidated_Layout4ExposureAmountFieldDataValue1002 != null ) {
                                        if(!zeroDBSLeverageRatioConsolidated_Layout4ExposureAmountFieldDataValue1002.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSLeverageRatioConsolidated_Layout4ExposureAmountFieldDataValue1002.getStartDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout4ExposureAmountFieldDataValue1002.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSLeverageRatioConsolidated_Layout4ExposureAmountFieldDataValue1002.getEndDateValue();
                                        if(!zeroDBSLeverageRatioConsolidated_Layout4ExposureAmountFieldDataValue1002.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSLeverageRatioConsolidated_Layout4ExposureAmountFieldDataValue1002.getInstantDateValue();
                                    }

                                    
                                            Context DBSLeverageRatioConsolidated_Layout4ExposureAmountContext1000 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBSLeverageRatioConsolidated_Layout4ExposureAmountMap1003 );
                                        
                                
                                if(zeroDBSLeverageRatioConsolidated_Layout4ExposureAmountValue1001 != null && !"".equals(zeroDBSLeverageRatioConsolidated_Layout4ExposureAmountValue1001)) {
                                    
                                    addContext(DBSLeverageRatioConsolidated_Layout4ExposureAmountContext1000, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType exposureAmountValue1004 = new MonetaryItemType();
                                    exposureAmountValue1004.setContextRef(DBSLeverageRatioConsolidated_Layout4ExposureAmountContext1000);
                                    
                                    exposureAmountValue1004.setUnitRef(INR999);
                                    exposureAmountValue1004.setDecimals("INF");
                                    exposureAmountValue1004.setValue(new BigDecimal(zeroDBSLeverageRatioConsolidated_Layout4ExposureAmountValue1001));
                                    
                                    
                                    JAXBElement<MonetaryItemType> exposureAmountElement1005 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue1004);
                                    bodyElements.add(exposureAmountElement1005);
                                
                            }
                        
                        
                    
                    
            
                    
                    
                    
                    return "";
                    }

                
                    
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBSLeverageRatioConsolidated_Layout5 if any typeMembers then List or Single
                //DBSLeverageRatioConsolidated_Layout5 dBSLeverageRatioConsolidated_Layout5 = mainReportData.getDBSLeverageRatioConsolidated_Layout5();
                
                    private String dBSLeverageRatioConsolidated_Layout5Method(DBSLeverageRatioConsolidated_Layout5 dBSLeverageRatioConsolidated_Layout5, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                
                    {
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                    DBSLeverageRatioConsolidated_Layout5 field = dBSLeverageRatioConsolidated_Layout5;
                    
                    
                    
            
                    
                    
                        
                            
                            
                                
                                Unit INR1006 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR1006 = createUnitIfNotExist(INR1006, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis - Tier1Capital
                            
                        
                            
                                
                                Map explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisMap1008 = new HashMap<String, String>();
                                
                                
                                explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisMap1008.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");                
                                
                                String explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberValue1009 = DBS06ReportUtil.retrieveValueForElement(field.getTier1Capital(), explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisMap1008);
                            
                                startDate = startDateDefault;
                                endDate = endDateDefault;
                                periodDate = periodDateDefault;
                                FieldDataValue explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberFieldDataValue1010 = DBS06ReportUtil.retrieveFieldDataForElement(field.getTier1Capital(), explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisMap1008, "", "", "xs:date($refPeriodEndDate)" );

                                if(explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberFieldDataValue1010 != null ) {
                                    if(!explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberFieldDataValue1010.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberFieldDataValue1010.getStartDateValue();
                                    if(!explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberFieldDataValue1010.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberFieldDataValue1010.getEndDateValue();
                                    if(!explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberFieldDataValue1010.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberFieldDataValue1010.getInstantDateValue();
                                }

                                if(explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberValue1009 != null && !"".equals(explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberValue1009)) {
                                
                                    
                                        Context explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisContext1007 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisMap1008 );
                                        
                                    
                                    addContext(explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisContext1007, contextElements, contextIdentifiers);
                                    
                                
                                    // create element JAXB Element
                
                                    MonetaryItemType explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberDataType1012 = new MonetaryItemType();
                                    explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberDataType1012.setContextRef(explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisContext1007);
                                    
                                    
                                        explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberDataType1012.setUnitRef(INR1006);
                                        explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberDataType1012.setDecimals("INF");
                                        explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberDataType1012.setValue(new BigDecimal(explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberValue1009));
                                    
                                    
                                    JAXBElement<MonetaryItemType> explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberElement1011 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createTier1Capital(explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberDataType1012);
                                    bodyElements.add(explictMember1DBSLeverageRatioConsolidated_Layout5Tier1CapitalConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberElement1011);
                                
                                }
                                // if uniquenamevalue is empty then don't do anything
                            

                            
                        
                        
                            
                            
                                
                                Unit INR1013 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR1013 = createUnitIfNotExist(INR1013, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            //rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis - ExposureAmount
                            
                        
                            
                                
                                Map explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisMap1015 = new HashMap<String, String>();
                                
                                
                                explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisMap1015.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");                
                                
                                        
                                        
                                        
                                        explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisMap1015.put("rbi-core:LeverageRatioExposureAxis", "in-rbi-rep:TotalExposureMember");
                                    
                                String explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberValue1016 = DBS06ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisMap1015);
                            
                                startDate = startDateDefault;
                                endDate = endDateDefault;
                                periodDate = periodDateDefault;
                                FieldDataValue explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberFieldDataValue1017 = DBS06ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisMap1015, "", "", "xs:date($refPeriodEndDate)" );

                                if(explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberFieldDataValue1017 != null ) {
                                    if(!explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberFieldDataValue1017.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberFieldDataValue1017.getStartDateValue();
                                    if(!explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberFieldDataValue1017.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberFieldDataValue1017.getEndDateValue();
                                    if(!explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberFieldDataValue1017.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberFieldDataValue1017.getInstantDateValue();
                                }

                                if(explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberValue1016 != null && !"".equals(explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberValue1016)) {
                                
                                    
                                        Context explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisContext1014 = DBS06ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisMap1015 );
                                        
                                    
                                    addContext(explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisContext1014, contextElements, contextIdentifiers);
                                    
                                
                                    // create element JAXB Element
                
                                    MonetaryItemType explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberDataType1019 = new MonetaryItemType();
                                    explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberDataType1019.setContextRef(explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisContext1014);
                                    
                                    
                                        explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberDataType1019.setUnitRef(INR1013);
                                        explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberDataType1019.setDecimals("INF");
                                        explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberDataType1019.setValue(new BigDecimal(explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberValue1016));
                                    
                                    
                                    JAXBElement<MonetaryItemType> explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberElement1018 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberDataType1019);
                                    bodyElements.add(explictMember1DBSLeverageRatioConsolidated_Layout5ExposureAmountConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberElement1018);
                                
                                }
                                // if uniquenamevalue is empty then don't do anything
                            

                            
                        
                        
                            
                            
                                
                                Unit pure1020 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                pure1020 = createUnitIfNotExist(pure1020, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                
                            
                            //rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis - BaselIILeverageRatio
                            
                        
                            
                                
                                Map explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisMap1022 = new HashMap<String, String>();
                                
                                
                                explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisMap1022.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");                
                                
                                String explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberValue1023 = DBS06ReportUtil.retrieveValueForElement(field.getBaselIILeverageRatio(), explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisMap1022);
                            
                                startDate = startDateDefault;
                                endDate = endDateDefault;
                                periodDate = periodDateDefault;
                                FieldDataValue explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberFieldDataValue1024 = DBS06ReportUtil.retrieveFieldDataForElement(field.getBaselIILeverageRatio(), explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisMap1022, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "" );

                                if(explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberFieldDataValue1024 != null ) {
                                    if(!explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberFieldDataValue1024.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberFieldDataValue1024.getStartDateValue();
                                    if(!explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberFieldDataValue1024.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberFieldDataValue1024.getEndDateValue();
                                    if(!explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberFieldDataValue1024.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberFieldDataValue1024.getInstantDateValue();
                                }

                                if(explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberValue1023 != null && !"".equals(explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberValue1023)) {
                                
                                    
                                        Context explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisContext1021 = DBS06ReportContextUtil.createFromToContextWithMembers( bankCode, startDate, endDate,  explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisMap1022 );
                                    
                                    addContext(explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisContext1021, contextElements, contextIdentifiers);
                                    
                                
                                    // create element JAXB Element
                
                                    PercentItemType explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberDataType1026 = new PercentItemType();
                                    explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberDataType1026.setContextRef(explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisContext1021);
                                    
                                    
                                        explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberDataType1026.setUnitRef(pure1020);
                                        explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberDataType1026.setDecimals("INF");
                                        explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberDataType1026.setValue(new BigDecimal(explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberValue1023));
                                    
                                    
                                    JAXBElement<PercentItemType> explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberElement1025 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createBaselIILeverageRatio(explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberDataType1026);
                                    bodyElements.add(explictMember1DBSLeverageRatioConsolidated_Layout5BaselIILeverageRatioConsolidatedAndSeparateFinancialStatementsAxisConsolidatedMemberElement1025);
                                
                                }
                                // if uniquenamevalue is empty then don't do anything
                            

                            
                        
                        
                        
                    
                    
                    return "";
                    }

                
                    
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBSAuthorisedSignatory_Layout1 if any typeMembers then List or Single
                //DBSAuthorisedSignatory_Layout1 dBSAuthorisedSignatory_Layout1 = mainReportData.getDBSAuthorisedSignatory_Layout1();
                
                    private String dBSAuthorisedSignatory_Layout1Method(DBSAuthorisedSignatory_Layout1 dBSAuthorisedSignatory_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                
                    {
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                    DBSAuthorisedSignatory_Layout1 field = dBSAuthorisedSignatory_Layout1;
                    
                    
                        
                        
                            
                            // - NameOfSignatory
                            
                                Map zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryMap1030 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryValue1028 = DBS06ReportUtil.retrieveValueForElement(field.getNameOfSignatory(), zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryMap1030);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue1029 = DBS06ReportUtil.retrieveFieldDataForElement(field.getNameOfSignatory(), zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryMap1030, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue1029 != null ) {
                                        if(!zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue1029.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue1029.getStartDateValue();
                                        if(!zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue1029.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue1029.getEndDateValue();
                                        if(!zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue1029.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue1029.getInstantDateValue();
                                    }

                                    
                                        Context DBSAuthorisedSignatory_Layout1NameOfSignatoryContext1027 = DBS06ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryValue1028 != null && !"".equals(zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryValue1028)) {
                                    
                                    addContext(DBSAuthorisedSignatory_Layout1NameOfSignatoryContext1027, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType nameOfSignatoryValue1031 = new StringItemType();
                                    nameOfSignatoryValue1031.setContextRef(DBSAuthorisedSignatory_Layout1NameOfSignatoryContext1027);
                                    
                                    nameOfSignatoryValue1031.setValue(zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryValue1028);        
                                    
                                    
                                    JAXBElement<StringItemType> nameOfSignatoryElement1032 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNameOfSignatory(nameOfSignatoryValue1031);
                                    bodyElements.add(nameOfSignatoryElement1032);
                                
                            }
                        
                            
                            // - DesignationOfSignatory
                            
                                Map zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryMap1036 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryValue1034 = DBS06ReportUtil.retrieveValueForElement(field.getDesignationOfSignatory(), zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryMap1036);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue1035 = DBS06ReportUtil.retrieveFieldDataForElement(field.getDesignationOfSignatory(), zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryMap1036, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue1035 != null ) {
                                        if(!zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue1035.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue1035.getStartDateValue();
                                        if(!zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue1035.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue1035.getEndDateValue();
                                        if(!zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue1035.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue1035.getInstantDateValue();
                                    }

                                    
                                        Context DBSAuthorisedSignatory_Layout1DesignationOfSignatoryContext1033 = DBS06ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryValue1034 != null && !"".equals(zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryValue1034)) {
                                    
                                    addContext(DBSAuthorisedSignatory_Layout1DesignationOfSignatoryContext1033, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType designationOfSignatoryValue1037 = new StringItemType();
                                    designationOfSignatoryValue1037.setContextRef(DBSAuthorisedSignatory_Layout1DesignationOfSignatoryContext1033);
                                    
                                    designationOfSignatoryValue1037.setValue(zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryValue1034);        
                                    
                                    
                                    JAXBElement<StringItemType> designationOfSignatoryElement1038 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createDesignationOfSignatory(designationOfSignatoryValue1037);
                                    bodyElements.add(designationOfSignatoryElement1038);
                                
                            }
                        
                            
                            // - AuthorisedSignatoryOfficialLandlineNumber
                            
                                Map zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberMap1042 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue1040 = DBS06ReportUtil.retrieveValueForElement(field.getAuthorisedSignatoryOfficialLandlineNumber(), zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberMap1042);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue1041 = DBS06ReportUtil.retrieveFieldDataForElement(field.getAuthorisedSignatoryOfficialLandlineNumber(), zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberMap1042, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue1041 != null ) {
                                        if(!zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue1041.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue1041.getStartDateValue();
                                        if(!zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue1041.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue1041.getEndDateValue();
                                        if(!zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue1041.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue1041.getInstantDateValue();
                                    }

                                    
                                        Context DBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext1039 = DBS06ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue1040 != null && !"".equals(zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue1040)) {
                                    
                                    addContext(DBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext1039, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType authorisedSignatoryOfficialLandlineNumberValue1043 = new StringItemType();
                                    authorisedSignatoryOfficialLandlineNumberValue1043.setContextRef(DBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext1039);
                                    
                                    authorisedSignatoryOfficialLandlineNumberValue1043.setValue(zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue1040);        
                                    
                                    
                                    JAXBElement<StringItemType> authorisedSignatoryOfficialLandlineNumberElement1044 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createAuthorisedSignatoryOfficialLandlineNumber(authorisedSignatoryOfficialLandlineNumberValue1043);
                                    bodyElements.add(authorisedSignatoryOfficialLandlineNumberElement1044);
                                
                            }
                        
                            
                            // - MobileNumberOfAuthorisedSignatory
                            
                                Map zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryMap1048 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue1046 = DBS06ReportUtil.retrieveValueForElement(field.getMobileNumberOfAuthorisedSignatory(), zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryMap1048);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue1047 = DBS06ReportUtil.retrieveFieldDataForElement(field.getMobileNumberOfAuthorisedSignatory(), zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryMap1048, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue1047 != null ) {
                                        if(!zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue1047.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue1047.getStartDateValue();
                                        if(!zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue1047.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue1047.getEndDateValue();
                                        if(!zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue1047.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue1047.getInstantDateValue();
                                    }

                                    
                                        Context DBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext1045 = DBS06ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue1046 != null && !"".equals(zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue1046)) {
                                    
                                    addContext(DBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext1045, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType mobileNumberOfAuthorisedSignatoryValue1049 = new StringItemType();
                                    mobileNumberOfAuthorisedSignatoryValue1049.setContextRef(DBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext1045);
                                    
                                    mobileNumberOfAuthorisedSignatoryValue1049.setValue(zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue1046);        
                                    
                                    
                                    JAXBElement<StringItemType> mobileNumberOfAuthorisedSignatoryElement1050 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createMobileNumberOfAuthorisedSignatory(mobileNumberOfAuthorisedSignatoryValue1049);
                                    bodyElements.add(mobileNumberOfAuthorisedSignatoryElement1050);
                                
                            }
                        
                            
                            // - EMailIDOfAuthorisedReportingOfficial
                            
                                Map zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialMap1054 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue1052 = DBS06ReportUtil.retrieveValueForElement(field.getEMailIDOfAuthorisedReportingOfficial(), zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialMap1054);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue1053 = DBS06ReportUtil.retrieveFieldDataForElement(field.getEMailIDOfAuthorisedReportingOfficial(), zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialMap1054, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue1053 != null ) {
                                        if(!zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue1053.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue1053.getStartDateValue();
                                        if(!zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue1053.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue1053.getEndDateValue();
                                        if(!zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue1053.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue1053.getInstantDateValue();
                                    }

                                    
                                        Context DBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext1051 = DBS06ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue1052 != null && !"".equals(zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue1052)) {
                                    
                                    addContext(DBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext1051, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType eMailIDOfAuthorisedReportingOfficialValue1055 = new StringItemType();
                                    eMailIDOfAuthorisedReportingOfficialValue1055.setContextRef(DBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext1051);
                                    
                                    eMailIDOfAuthorisedReportingOfficialValue1055.setValue(zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue1052);        
                                    
                                    
                                    JAXBElement<StringItemType> eMailIDOfAuthorisedReportingOfficialElement1056 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createEMailIDOfAuthorisedReportingOfficial(eMailIDOfAuthorisedReportingOfficialValue1055);
                                    bodyElements.add(eMailIDOfAuthorisedReportingOfficialElement1056);
                                
                            }
                        
                            
                            // - Remarks
                            
                                Map zeroDBSAuthorisedSignatory_Layout1RemarksMap1060 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBSAuthorisedSignatory_Layout1RemarksValue1058 = DBS06ReportUtil.retrieveValueForElement(field.getRemarks(), zeroDBSAuthorisedSignatory_Layout1RemarksMap1060);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBSAuthorisedSignatory_Layout1RemarksFieldDataValue1059 = DBS06ReportUtil.retrieveFieldDataForElement(field.getRemarks(), zeroDBSAuthorisedSignatory_Layout1RemarksMap1060, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroDBSAuthorisedSignatory_Layout1RemarksFieldDataValue1059 != null ) {
                                        if(!zeroDBSAuthorisedSignatory_Layout1RemarksFieldDataValue1059.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBSAuthorisedSignatory_Layout1RemarksFieldDataValue1059.getStartDateValue();
                                        if(!zeroDBSAuthorisedSignatory_Layout1RemarksFieldDataValue1059.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBSAuthorisedSignatory_Layout1RemarksFieldDataValue1059.getEndDateValue();
                                        if(!zeroDBSAuthorisedSignatory_Layout1RemarksFieldDataValue1059.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBSAuthorisedSignatory_Layout1RemarksFieldDataValue1059.getInstantDateValue();
                                    }

                                    
                                        Context DBSAuthorisedSignatory_Layout1RemarksContext1057 = DBS06ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBSAuthorisedSignatory_Layout1RemarksValue1058 != null && !"".equals(zeroDBSAuthorisedSignatory_Layout1RemarksValue1058)) {
                                    
                                    addContext(DBSAuthorisedSignatory_Layout1RemarksContext1057, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType remarksValue1061 = new StringItemType();
                                    remarksValue1061.setContextRef(DBSAuthorisedSignatory_Layout1RemarksContext1057);
                                    
                                    remarksValue1061.setValue(zeroDBSAuthorisedSignatory_Layout1RemarksValue1058);        
                                    
                                    
                                    JAXBElement<StringItemType> remarksElement1062 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createRemarks(remarksValue1061);
                                    bodyElements.add(remarksElement1062);
                                
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
    
    

