package in.armedu.banking.report.rbixbrl.reports.dbs13;



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
import in.armedu.banking.report.rbixbrl.model.dbs13.*;
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
public class DBS13Report implements XBRLReportIntf {
       
    
    // logic for main method
    @Override
    public StringWriter generateReport(ReportData reportData){
        JAXBContext jc;
        Marshaller m;
        // TODO should be generated dynamically
        DBS13ReportData mainReportData = (DBS13ReportData) reportData;

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
            // TODO should be changed to specific xsd related to report dbs13
            simpleType.setHref("in-rbi-dbs13.xsd");
            xbrl.getSchemaRef().add(simpleType);
            xbrl.getOtherAttributes().put(new QName("xml:lang"), "en");
           
            
            // context identifiers and body elements
            List<String> contextIdentifiers = new ArrayList<String>();
            List<Context> contextElements = new ArrayList<Context>();
            List<Object> bodyElements = new ArrayList<Object>();
            List<String> unitIdentifiers = new ArrayList<String>();
            List<Unit> unitElements = new ArrayList<Unit>();
           
            //Unit unitObj = null;
            //DBS13ReportData dBS13ReportData = new DBS13ReportData();
            // print values           
    

            // TODO : create proper context with loop and element
            // initiatilize data class and allow to be set 
            //private DBS13ReportData dBS13ReportData = new DBS13ReportData();
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
                
                
                
                // create variable for subclass DBS_LEF_A_20LE_Standalone_Layout1 if any typeMembers then List or Single
                DBS_LEF_A_20LE_Standalone_Layout1 dBS_LEF_A_20LE_Standalone_Layout1 = mainReportData.getDBS_LEF_A_20LE_Standalone_Layout1();
                // method calling
                
                    dBS_LEF_A_20LE_Standalone_Layout1Method(dBS_LEF_A_20LE_Standalone_Layout1, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBS_LEF_A_20LE_Standalone_Layout2 if any typeMembers then List or Single
                List<DBS_LEF_A_20LE_Standalone_Layout2> dBS_LEF_A_20LE_Standalone_Layout2 = mainReportData.getDBS_LEF_A_20LE_Standalone_Layout2();
                // method calling
                
                
                // if typemembers exist
                
                    dBS_LEF_A_20LE_Standalone_Layout2Method(dBS_LEF_A_20LE_Standalone_Layout2, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                    
                    
                
                
                
                // create variable for subclass DBS_LEF_B_SpecExp_Standalone_Layout1 if any typeMembers then List or Single
                List<DBS_LEF_B_SpecExp_Standalone_Layout1> dBS_LEF_B_SpecExp_Standalone_Layout1 = mainReportData.getDBS_LEF_B_SpecExp_Standalone_Layout1();
                // method calling
                
                
                // if typemembers exist
                
                    dBS_LEF_B_SpecExp_Standalone_Layout1Method(dBS_LEF_B_SpecExp_Standalone_Layout1, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                    
                    
                
                
                
                // create variable for subclass DBS_LEF_C_OthExp_Standalone_Layout1 if any typeMembers then List or Single
                List<DBS_LEF_C_OthExp_Standalone_Layout1> dBS_LEF_C_OthExp_Standalone_Layout1 = mainReportData.getDBS_LEF_C_OthExp_Standalone_Layout1();
                // method calling
                
                
                // if typemembers exist
                
                    dBS_LEF_C_OthExp_Standalone_Layout1Method(dBS_LEF_C_OthExp_Standalone_Layout1, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                    
                    
                
                
                
                // create variable for subclass DBS_LEF_D_ExempExp_Standalone_Layout1 if any typeMembers then List or Single
                List<DBS_LEF_D_ExempExp_Standalone_Layout1> dBS_LEF_D_ExempExp_Standalone_Layout1 = mainReportData.getDBS_LEF_D_ExempExp_Standalone_Layout1();
                // method calling
                
                
                // if typemembers exist
                
                    dBS_LEF_D_ExempExp_Standalone_Layout1Method(dBS_LEF_D_ExempExp_Standalone_Layout1, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                    
                    
                
                
                
                // create variable for subclass DBS_LEF_A_20LE_Consolidated_Layout1 if any typeMembers then List or Single
                DBS_LEF_A_20LE_Consolidated_Layout1 dBS_LEF_A_20LE_Consolidated_Layout1 = mainReportData.getDBS_LEF_A_20LE_Consolidated_Layout1();
                // method calling
                
                    dBS_LEF_A_20LE_Consolidated_Layout1Method(dBS_LEF_A_20LE_Consolidated_Layout1, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBS_LEF_A_20LE_Consolidated_Layout2 if any typeMembers then List or Single
                List<DBS_LEF_A_20LE_Consolidated_Layout2> dBS_LEF_A_20LE_Consolidated_Layout2 = mainReportData.getDBS_LEF_A_20LE_Consolidated_Layout2();
                // method calling
                
                
                // if typemembers exist
                
                    dBS_LEF_A_20LE_Consolidated_Layout2Method(dBS_LEF_A_20LE_Consolidated_Layout2, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                    
                    
                
                
                
                // create variable for subclass DBS_LEF_B_SpecExp_Consolidated_Layout1 if any typeMembers then List or Single
                List<DBS_LEF_B_SpecExp_Consolidated_Layout1> dBS_LEF_B_SpecExp_Consolidated_Layout1 = mainReportData.getDBS_LEF_B_SpecExp_Consolidated_Layout1();
                // method calling
                
                
                // if typemembers exist
                
                    dBS_LEF_B_SpecExp_Consolidated_Layout1Method(dBS_LEF_B_SpecExp_Consolidated_Layout1, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                    
                    
                
                
                
                // create variable for subclass DBS_LEF_C_OthExp_Consolidated_Layout1 if any typeMembers then List or Single
                List<DBS_LEF_C_OthExp_Consolidated_Layout1> dBS_LEF_C_OthExp_Consolidated_Layout1 = mainReportData.getDBS_LEF_C_OthExp_Consolidated_Layout1();
                // method calling
                
                
                // if typemembers exist
                
                    dBS_LEF_C_OthExp_Consolidated_Layout1Method(dBS_LEF_C_OthExp_Consolidated_Layout1, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                    
                    
                
                
                
                // create variable for subclass DBS_LEF_D_ExempExp_Consolidated_Layout1 if any typeMembers then List or Single
                List<DBS_LEF_D_ExempExp_Consolidated_Layout1> dBS_LEF_D_ExempExp_Consolidated_Layout1 = mainReportData.getDBS_LEF_D_ExempExp_Consolidated_Layout1();
                // method calling
                
                
                // if typemembers exist
                
                    dBS_LEF_D_ExempExp_Consolidated_Layout1Method(dBS_LEF_D_ExempExp_Consolidated_Layout1, contextIdentifiers,  contextElements, bodyElements, unitIdentifiers, unitElements, bankCode, startDate, endDate, periodDate);
                    
                    
                
                
                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReturnNameValue2 = DBS13ReportUtil.retrieveValueForElement(field.getReturnName(), zeroFilingInfo_Layout1ReturnNameMap4);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReturnNameFieldDataValue3 = DBS13ReportUtil.retrieveFieldDataForElement(field.getReturnName(), zeroFilingInfo_Layout1ReturnNameMap4, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ReturnNameFieldDataValue3 != null ) {
                                        if(!zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1ReturnNameContext1 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReturnCodeValue8 = DBS13ReportUtil.retrieveValueForElement(field.getReturnCode(), zeroFilingInfo_Layout1ReturnCodeMap10);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReturnCodeFieldDataValue9 = DBS13ReportUtil.retrieveFieldDataForElement(field.getReturnCode(), zeroFilingInfo_Layout1ReturnCodeMap10, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ReturnCodeFieldDataValue9 != null ) {
                                        if(!zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1ReturnCodeContext7 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1NameOfReportingInstitutionValue14 = DBS13ReportUtil.retrieveValueForElement(field.getNameOfReportingInstitution(), zeroFilingInfo_Layout1NameOfReportingInstitutionMap16);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15 = DBS13ReportUtil.retrieveFieldDataForElement(field.getNameOfReportingInstitution(), zeroFilingInfo_Layout1NameOfReportingInstitutionMap16, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15 != null ) {
                                        if(!zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1NameOfReportingInstitutionContext13 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1BankCodeValue20 = DBS13ReportUtil.retrieveValueForElement(field.getBankCode(), zeroFilingInfo_Layout1BankCodeMap22);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1BankCodeFieldDataValue21 = DBS13ReportUtil.retrieveFieldDataForElement(field.getBankCode(), zeroFilingInfo_Layout1BankCodeMap22, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroFilingInfo_Layout1BankCodeFieldDataValue21 != null ) {
                                        if(!zeroFilingInfo_Layout1BankCodeFieldDataValue21.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1BankCodeFieldDataValue21.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1BankCodeFieldDataValue21.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1BankCodeFieldDataValue21.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1BankCodeFieldDataValue21.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1BankCodeFieldDataValue21.getInstantDateValue();
                                    }

                                    
                                    Context FilingInfo_Layout1BankCodeContext19 = DBS13ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1InstitutionTypeValue26 = DBS13ReportUtil.retrieveValueForElement(field.getInstitutionType(), zeroFilingInfo_Layout1InstitutionTypeMap28);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27 = DBS13ReportUtil.retrieveFieldDataForElement(field.getInstitutionType(), zeroFilingInfo_Layout1InstitutionTypeMap28, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27 != null ) {
                                        if(!zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1InstitutionTypeContext25 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingFrequencyValue32 = DBS13ReportUtil.retrieveValueForElement(field.getReportingFrequency(), zeroFilingInfo_Layout1ReportingFrequencyMap34);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33 = DBS13ReportUtil.retrieveFieldDataForElement(field.getReportingFrequency(), zeroFilingInfo_Layout1ReportingFrequencyMap34, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1ReportingFrequencyContext31 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingPeriodStartDateValue38 = DBS13ReportUtil.retrieveValueForElement(field.getReportingPeriodStartDate(), zeroFilingInfo_Layout1ReportingPeriodStartDateMap40);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39 = DBS13ReportUtil.retrieveFieldDataForElement(field.getReportingPeriodStartDate(), zeroFilingInfo_Layout1ReportingPeriodStartDateMap40, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getInstantDateValue();
                                    }

                                    
                                    Context FilingInfo_Layout1ReportingPeriodStartDateContext37 = DBS13ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout1ReportingPeriodStartDateValue38 != null && !"".equals(zeroFilingInfo_Layout1ReportingPeriodStartDateValue38)) {
                                    
                                    addContext(FilingInfo_Layout1ReportingPeriodStartDateContext37, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    DateItemType reportingPeriodStartDateValue41 = new DateItemType();
                                    reportingPeriodStartDateValue41.setContextRef(FilingInfo_Layout1ReportingPeriodStartDateContext37);
                                    
                                    reportingPeriodStartDateValue41.setValue(DBS13ReportContextUtil.toXMLGeo(zeroFilingInfo_Layout1ReportingPeriodStartDateValue38));
                                    
                                    
                                    JAXBElement<DateItemType> reportingPeriodStartDateElement42 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReportingPeriodStartDate(reportingPeriodStartDateValue41);
                                    bodyElements.add(reportingPeriodStartDateElement42);
                                
                            }
                        
                            
                            // - ReportingPeriodEndDate
                            
                                Map zeroFilingInfo_Layout1ReportingPeriodEndDateMap46 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingPeriodEndDateValue44 = DBS13ReportUtil.retrieveValueForElement(field.getReportingPeriodEndDate(), zeroFilingInfo_Layout1ReportingPeriodEndDateMap46);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45 = DBS13ReportUtil.retrieveFieldDataForElement(field.getReportingPeriodEndDate(), zeroFilingInfo_Layout1ReportingPeriodEndDateMap46, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getInstantDateValue();
                                    }

                                    
                                    Context FilingInfo_Layout1ReportingPeriodEndDateContext43 = DBS13ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout1ReportingPeriodEndDateValue44 != null && !"".equals(zeroFilingInfo_Layout1ReportingPeriodEndDateValue44)) {
                                    
                                    addContext(FilingInfo_Layout1ReportingPeriodEndDateContext43, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    DateItemType reportingPeriodEndDateValue47 = new DateItemType();
                                    reportingPeriodEndDateValue47.setContextRef(FilingInfo_Layout1ReportingPeriodEndDateContext43);
                                    
                                    reportingPeriodEndDateValue47.setValue(DBS13ReportContextUtil.toXMLGeo(zeroFilingInfo_Layout1ReportingPeriodEndDateValue44));
                                    
                                    
                                    JAXBElement<DateItemType> reportingPeriodEndDateElement48 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReportingPeriodEndDate(reportingPeriodEndDateValue47);
                                    bodyElements.add(reportingPeriodEndDateElement48);
                                
                            }
                        
                            
                            // - ReportingCurrency
                            
                                Map zeroFilingInfo_Layout1ReportingCurrencyMap52 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingCurrencyValue50 = DBS13ReportUtil.retrieveValueForElement(field.getReportingCurrency(), zeroFilingInfo_Layout1ReportingCurrencyMap52);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51 = DBS13ReportUtil.retrieveFieldDataForElement(field.getReportingCurrency(), zeroFilingInfo_Layout1ReportingCurrencyMap52, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1ReportingCurrencyContext49 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingScaleValue56 = DBS13ReportUtil.retrieveValueForElement(field.getReportingScale(), zeroFilingInfo_Layout1ReportingScaleMap58);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReportingScaleFieldDataValue57 = DBS13ReportUtil.retrieveFieldDataForElement(field.getReportingScale(), zeroFilingInfo_Layout1ReportingScaleMap58, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ReportingScaleFieldDataValue57 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1ReportingScaleContext55 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1TaxonomyVersionValue62 = DBS13ReportUtil.retrieveValueForElement(field.getTaxonomyVersion(), zeroFilingInfo_Layout1TaxonomyVersionMap64);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63 = DBS13ReportUtil.retrieveFieldDataForElement(field.getTaxonomyVersion(), zeroFilingInfo_Layout1TaxonomyVersionMap64, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63 != null ) {
                                        if(!zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1TaxonomyVersionContext61 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ToolNameValue68 = DBS13ReportUtil.retrieveValueForElement(field.getToolName(), zeroFilingInfo_Layout1ToolNameMap70);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ToolNameFieldDataValue69 = DBS13ReportUtil.retrieveFieldDataForElement(field.getToolName(), zeroFilingInfo_Layout1ToolNameMap70, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ToolNameFieldDataValue69 != null ) {
                                        if(!zeroFilingInfo_Layout1ToolNameFieldDataValue69.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ToolNameFieldDataValue69.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ToolNameFieldDataValue69.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ToolNameFieldDataValue69.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ToolNameFieldDataValue69.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ToolNameFieldDataValue69.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1ToolNameContext67 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ToolVersionValue74 = DBS13ReportUtil.retrieveValueForElement(field.getToolVersion(), zeroFilingInfo_Layout1ToolVersionMap76);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ToolVersionFieldDataValue75 = DBS13ReportUtil.retrieveFieldDataForElement(field.getToolVersion(), zeroFilingInfo_Layout1ToolVersionMap76, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ToolVersionFieldDataValue75 != null ) {
                                        if(!zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1ToolVersionContext73 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1ReportStatusValue80 = DBS13ReportUtil.retrieveValueForElement(field.getReportStatus(), zeroFilingInfo_Layout1ReportStatusMap82);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1ReportStatusFieldDataValue81 = DBS13ReportUtil.retrieveFieldDataForElement(field.getReportStatus(), zeroFilingInfo_Layout1ReportStatusMap82, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1ReportStatusFieldDataValue81 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1ReportStatusContext79 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1DateOfAuditValue86 = DBS13ReportUtil.retrieveValueForElement(field.getDateOfAudit(), zeroFilingInfo_Layout1DateOfAuditMap88);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1DateOfAuditFieldDataValue87 = DBS13ReportUtil.retrieveFieldDataForElement(field.getDateOfAudit(), zeroFilingInfo_Layout1DateOfAuditMap88, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroFilingInfo_Layout1DateOfAuditFieldDataValue87 != null ) {
                                        if(!zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getInstantDateValue();
                                    }

                                    
                                    Context FilingInfo_Layout1DateOfAuditContext85 = DBS13ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout1DateOfAuditValue86 != null && !"".equals(zeroFilingInfo_Layout1DateOfAuditValue86)) {
                                    
                                    addContext(FilingInfo_Layout1DateOfAuditContext85, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    DateItemType dateOfAuditValue89 = new DateItemType();
                                    dateOfAuditValue89.setContextRef(FilingInfo_Layout1DateOfAuditContext85);
                                    
                                    dateOfAuditValue89.setValue(DBS13ReportContextUtil.toXMLGeo(zeroFilingInfo_Layout1DateOfAuditValue86));
                                    
                                    
                                    JAXBElement<DateItemType> dateOfAuditElement90 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createDateOfAudit(dateOfAuditValue89);
                                    bodyElements.add(dateOfAuditElement90);
                                
                            }
                        
                            
                            // - GeneralRemarks
                            
                                Map zeroFilingInfo_Layout1GeneralRemarksMap94 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout1GeneralRemarksValue92 = DBS13ReportUtil.retrieveValueForElement(field.getGeneralRemarks(), zeroFilingInfo_Layout1GeneralRemarksMap94);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93 = DBS13ReportUtil.retrieveFieldDataForElement(field.getGeneralRemarks(), zeroFilingInfo_Layout1GeneralRemarksMap94, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93 != null ) {
                                        if(!zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getStartDateValue();
                                        if(!zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getEndDateValue();
                                        if(!zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getInstantDateValue();
                                    }

                                    
                                        Context FilingInfo_Layout1GeneralRemarksContext91 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                
                                
                                    
                                    String zeroFilingInfo_Layout2WhetherBankHasSubsidiariesValue98 = DBS13ReportUtil.retrieveValueForElement(field.getWhetherBankHasSubsidiaries(), zeroFilingInfo_Layout2WhetherBankHasSubsidiariesMap100);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroFilingInfo_Layout2WhetherBankHasSubsidiariesFieldDataValue99 = DBS13ReportUtil.retrieveFieldDataForElement(field.getWhetherBankHasSubsidiaries(), zeroFilingInfo_Layout2WhetherBankHasSubsidiariesMap100, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroFilingInfo_Layout2WhetherBankHasSubsidiariesFieldDataValue99 != null ) {
                                        if(!zeroFilingInfo_Layout2WhetherBankHasSubsidiariesFieldDataValue99.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout2WhetherBankHasSubsidiariesFieldDataValue99.getStartDateValue();
                                        if(!zeroFilingInfo_Layout2WhetherBankHasSubsidiariesFieldDataValue99.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout2WhetherBankHasSubsidiariesFieldDataValue99.getEndDateValue();
                                        if(!zeroFilingInfo_Layout2WhetherBankHasSubsidiariesFieldDataValue99.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout2WhetherBankHasSubsidiariesFieldDataValue99.getInstantDateValue();
                                    }

                                    
                                    Context FilingInfo_Layout2WhetherBankHasSubsidiariesContext97 = DBS13ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
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
                
                
                
                // create variable for subclass DBS_LEF_A_20LE_Standalone_Layout1 if any typeMembers then List or Single
                //DBS_LEF_A_20LE_Standalone_Layout1 dBS_LEF_A_20LE_Standalone_Layout1 = mainReportData.getDBS_LEF_A_20LE_Standalone_Layout1();
                
                    private String dBS_LEF_A_20LE_Standalone_Layout1Method(DBS_LEF_A_20LE_Standalone_Layout1 dBS_LEF_A_20LE_Standalone_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                
                    {
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                    DBS_LEF_A_20LE_Standalone_Layout1 field = dBS_LEF_A_20LE_Standalone_Layout1;
                    
                    
                        
                        
                            
                                
                                Unit INR103 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR103 = createUnitIfNotExist(INR103, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - Tier1Capital
                            
                                Map zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalMap107 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalMap107.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                    
                                    String zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalValue105 = DBS13ReportUtil.retrieveValueForElement(field.getTier1Capital(), zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalMap107);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalFieldDataValue106 = DBS13ReportUtil.retrieveFieldDataForElement(field.getTier1Capital(), zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalMap107, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalFieldDataValue106 != null ) {
                                        if(!zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalFieldDataValue106.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalFieldDataValue106.getStartDateValue();
                                        if(!zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalFieldDataValue106.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalFieldDataValue106.getEndDateValue();
                                        if(!zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalFieldDataValue106.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalFieldDataValue106.getInstantDateValue();
                                    }

                                    
                                            Context DBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalContext104 = DBS13ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalMap107 );
                                        
                                
                                if(zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalValue105 != null && !"".equals(zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalValue105)) {
                                    
                                    addContext(DBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalContext104, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType tier1CapitalValue108 = new MonetaryItemType();
                                    tier1CapitalValue108.setContextRef(DBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalContext104);
                                    
                                    tier1CapitalValue108.setUnitRef(INR103);
                                    tier1CapitalValue108.setDecimals("INF");
                                    tier1CapitalValue108.setValue(new BigDecimal(zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalValue105));
                                    
                                    
                                    JAXBElement<MonetaryItemType> tier1CapitalElement109 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createTier1Capital(tier1CapitalValue108);
                                    bodyElements.add(tier1CapitalElement109);
                                
                            }
                        
                        
                    
                    
            
                    
                    
                    
                    return "";
                    }

                
                    
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBS_LEF_A_20LE_Standalone_Layout2 if any typeMembers then List or Single
                //List<DBS_LEF_A_20LE_Standalone_Layout2> dBS_LEF_A_20LE_Standalone_Layout2 = mainReportData.getDBS_LEF_A_20LE_Standalone_Layout2();
                
                
                // if typemembers exist
                
                    private String dBS_LEF_A_20LE_Standalone_Layout2Method(List<DBS_LEF_A_20LE_Standalone_Layout2> dBS_LEF_A_20LE_Standalone_Layout2, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                    {
                        
                    dBS_LEF_A_20LE_Standalone_Layout2.forEach((field)->{
                        // create startdate, enddate, and perioddate
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                        // crate variable loop  for type member
                        
                            // create variable for type member PermanentAccountNumberOrGroupIDOfCounterpartyAxis
                            String permanentAccountNumberOrGroupIDOfCounterpartyAxis = field.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis();
                        
                            // create variable for type member NameOfCounterPartyAxis
                            String nameOfCounterPartyAxis = field.getNameOfCounterPartyAxis();
                        
                        // end create variable loop for type member
                        
                        // if explict member is empty
                        
                        
                
                        
                        
                            
                                
                                
                                    
                                    Unit INR110 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR110 = createUnitIfNotExist(INR110, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - ExposureAmount
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisMap112 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisMap112.put("rbi-core:CounterPartyAxis", "rbi-core:SingleMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisMap112.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisMap112.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:LargestTwentyExposuresMember");
                                        
                                    String explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisSingleMemberValue113 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisMap112);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisSingleMemberFieldDataValue114 = DBS13ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisMap112, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisSingleMemberFieldDataValue114 != null ) {
                                        if(!explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisSingleMemberFieldDataValue114.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisSingleMemberFieldDataValue114.getStartDateValue();
                                        if(!explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisSingleMemberFieldDataValue114.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisSingleMemberFieldDataValue114.getEndDateValue();
                                        if(!explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisSingleMemberFieldDataValue114.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisSingleMemberFieldDataValue114.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisSingleMemberValue113 != null && !"".equals(explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisSingleMemberValue113)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisContext111 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_A_20LE_Standalone_Layout2( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisMap112 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisContext111, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisSingleMemberDataType116 = new MonetaryItemType();
                                        explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisSingleMemberDataType116.setContextRef(explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisContext111);
                                        
                                        
                                            explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisSingleMemberDataType116.setUnitRef(INR110);
                                            explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisSingleMemberDataType116.setDecimals("INF");
                                            explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisSingleMemberDataType116.setValue(new BigDecimal(explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisSingleMemberValue113));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisSingleMemberElement115 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisSingleMemberDataType116);
                                        bodyElements.add(explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisSingleMemberElement115);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure117 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure117 = createUnitIfNotExist(pure117, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - PercentageOfExposureToTier1Capital
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap119 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap119.put("rbi-core:CounterPartyAxis", "rbi-core:SingleMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap119.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap119.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:LargestTwentyExposuresMember");
                                        
                                    String explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue120 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap119);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue121 = DBS13ReportUtil.retrieveFieldDataForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap119, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue121 != null ) {
                                        if(!explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue121.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue121.getStartDateValue();
                                        if(!explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue121.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue121.getEndDateValue();
                                        if(!explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue121.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue121.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue120 != null && !"".equals(explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue120)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisContext118 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_A_20LE_Standalone_Layout2( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap119 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisContext118, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        PercentItemType explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType123 = new PercentItemType();
                                        explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType123.setContextRef(explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisContext118);
                                        
                                        
                                            explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType123.setUnitRef(pure117);
                                            explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType123.setDecimals("INF");
                                            explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType123.setValue(new BigDecimal(explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue120));
                                        
                                        
                                        JAXBElement<PercentItemType> explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberElement122 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType123);
                                        bodyElements.add(explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberElement122);
                                    
                                    }
                                    
                                

                                
                            
                            
                            
                        
                            
                                
                                
                                    
                                    Unit INR124 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR124 = createUnitIfNotExist(INR124, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - ExposureAmount
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisMap126 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisMap126.put("rbi-core:CounterPartyAxis", "rbi-core:GroupMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisMap126.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisMap126.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:LargestTwentyExposuresMember");
                                        
                                    String explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisGroupMemberValue127 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisMap126);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisGroupMemberFieldDataValue128 = DBS13ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisMap126, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisGroupMemberFieldDataValue128 != null ) {
                                        if(!explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisGroupMemberFieldDataValue128.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisGroupMemberFieldDataValue128.getStartDateValue();
                                        if(!explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisGroupMemberFieldDataValue128.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisGroupMemberFieldDataValue128.getEndDateValue();
                                        if(!explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisGroupMemberFieldDataValue128.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisGroupMemberFieldDataValue128.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisGroupMemberValue127 != null && !"".equals(explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisGroupMemberValue127)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisContext125 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_A_20LE_Standalone_Layout2( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisMap126 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisContext125, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisGroupMemberDataType130 = new MonetaryItemType();
                                        explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisGroupMemberDataType130.setContextRef(explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisContext125);
                                        
                                        
                                            explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisGroupMemberDataType130.setUnitRef(INR124);
                                            explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisGroupMemberDataType130.setDecimals("INF");
                                            explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisGroupMemberDataType130.setValue(new BigDecimal(explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisGroupMemberValue127));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisGroupMemberElement129 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisGroupMemberDataType130);
                                        bodyElements.add(explictMember1DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountCounterPartyAxisGroupMemberElement129);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure131 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure131 = createUnitIfNotExist(pure131, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - PercentageOfExposureToTier1Capital
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap133 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap133.put("rbi-core:CounterPartyAxis", "rbi-core:GroupMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap133.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap133.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:LargestTwentyExposuresMember");
                                        
                                    String explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue134 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap133);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue135 = DBS13ReportUtil.retrieveFieldDataForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap133, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue135 != null ) {
                                        if(!explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue135.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue135.getStartDateValue();
                                        if(!explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue135.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue135.getEndDateValue();
                                        if(!explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue135.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue135.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue134 != null && !"".equals(explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue134)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisContext132 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_A_20LE_Standalone_Layout2( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap133 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisContext132, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        PercentItemType explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType137 = new PercentItemType();
                                        explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType137.setContextRef(explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisContext132);
                                        
                                        
                                            explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType137.setUnitRef(pure131);
                                            explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType137.setDecimals("INF");
                                            explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType137.setValue(new BigDecimal(explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue134));
                                        
                                        
                                        JAXBElement<PercentItemType> explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberElement136 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType137);
                                        bodyElements.add(explictMember1DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberElement136);
                                    
                                    }
                                    
                                

                                
                            
                            
                            
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBS_LEF_B_SpecExp_Standalone_Layout1 if any typeMembers then List or Single
                //List<DBS_LEF_B_SpecExp_Standalone_Layout1> dBS_LEF_B_SpecExp_Standalone_Layout1 = mainReportData.getDBS_LEF_B_SpecExp_Standalone_Layout1();
                
                
                // if typemembers exist
                
                    private String dBS_LEF_B_SpecExp_Standalone_Layout1Method(List<DBS_LEF_B_SpecExp_Standalone_Layout1> dBS_LEF_B_SpecExp_Standalone_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                    {
                        
                    dBS_LEF_B_SpecExp_Standalone_Layout1.forEach((field)->{
                        // create startdate, enddate, and perioddate
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                        // crate variable loop  for type member
                        
                            // create variable for type member PermanentAccountNumberOrGroupIDOfCounterpartyAxis
                            String permanentAccountNumberOrGroupIDOfCounterpartyAxis = field.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis();
                        
                            // create variable for type member NameOfCounterPartyAxis
                            String nameOfCounterPartyAxis = field.getNameOfCounterPartyAxis();
                        
                        // end create variable loop for type member
                        
                        // if explict member is empty
                        
                        
                
                        
                        
                            
                                
                                
                                    
                                    Unit INR138 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR138 = createUnitIfNotExist(INR138, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - ExposureAmount
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap140 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap140.put("rbi-core:CounterPartyAxis", "rbi-core:SingleMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap140.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap140.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExposuresEqualToOrAboveSpecifiedPercentageOfTier1CapitalMember");
                                        
                                    String explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberValue141 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap140);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue142 = DBS13ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap140, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue142 != null ) {
                                        if(!explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue142.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue142.getStartDateValue();
                                        if(!explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue142.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue142.getEndDateValue();
                                        if(!explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue142.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue142.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberValue141 != null && !"".equals(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberValue141)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisContext139 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_B_SpecExp_Standalone_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap140 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisContext139, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType144 = new MonetaryItemType();
                                        explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType144.setContextRef(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisContext139);
                                        
                                        
                                            explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType144.setUnitRef(INR138);
                                            explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType144.setDecimals("INF");
                                            explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType144.setValue(new BigDecimal(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberValue141));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberElement143 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType144);
                                        bodyElements.add(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberElement143);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure145 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure145 = createUnitIfNotExist(pure145, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - PercentageOfExposureToTier1Capital
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap147 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap147.put("rbi-core:CounterPartyAxis", "rbi-core:SingleMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap147.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap147.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExposuresEqualToOrAboveSpecifiedPercentageOfTier1CapitalMember");
                                        
                                    String explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue148 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap147);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue149 = DBS13ReportUtil.retrieveFieldDataForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap147, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue149 != null ) {
                                        if(!explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue149.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue149.getStartDateValue();
                                        if(!explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue149.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue149.getEndDateValue();
                                        if(!explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue149.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue149.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue148 != null && !"".equals(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue148)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext146 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_B_SpecExp_Standalone_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap147 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext146, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        PercentItemType explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType151 = new PercentItemType();
                                        explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType151.setContextRef(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext146);
                                        
                                        
                                            explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType151.setUnitRef(pure145);
                                            explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType151.setDecimals("INF");
                                            explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType151.setValue(new BigDecimal(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue148));
                                        
                                        
                                        JAXBElement<PercentItemType> explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberElement150 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType151);
                                        bodyElements.add(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberElement150);
                                    
                                    }
                                    
                                

                                
                            
                            
                            
                        
                            
                                
                                
                                    
                                    Unit INR152 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR152 = createUnitIfNotExist(INR152, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - ExposureAmount
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap154 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap154.put("rbi-core:CounterPartyAxis", "rbi-core:GroupMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap154.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap154.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExposuresEqualToOrAboveSpecifiedPercentageOfTier1CapitalMember");
                                        
                                    String explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberValue155 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap154);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue156 = DBS13ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap154, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue156 != null ) {
                                        if(!explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue156.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue156.getStartDateValue();
                                        if(!explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue156.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue156.getEndDateValue();
                                        if(!explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue156.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue156.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberValue155 != null && !"".equals(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberValue155)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisContext153 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_B_SpecExp_Standalone_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap154 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisContext153, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType158 = new MonetaryItemType();
                                        explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType158.setContextRef(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisContext153);
                                        
                                        
                                            explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType158.setUnitRef(INR152);
                                            explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType158.setDecimals("INF");
                                            explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType158.setValue(new BigDecimal(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberValue155));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberElement157 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType158);
                                        bodyElements.add(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberElement157);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure159 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure159 = createUnitIfNotExist(pure159, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - PercentageOfExposureToTier1Capital
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap161 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap161.put("rbi-core:CounterPartyAxis", "rbi-core:GroupMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap161.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap161.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExposuresEqualToOrAboveSpecifiedPercentageOfTier1CapitalMember");
                                        
                                    String explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue162 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap161);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue163 = DBS13ReportUtil.retrieveFieldDataForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap161, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue163 != null ) {
                                        if(!explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue163.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue163.getStartDateValue();
                                        if(!explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue163.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue163.getEndDateValue();
                                        if(!explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue163.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue163.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue162 != null && !"".equals(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue162)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext160 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_B_SpecExp_Standalone_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap161 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext160, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        PercentItemType explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType165 = new PercentItemType();
                                        explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType165.setContextRef(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext160);
                                        
                                        
                                            explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType165.setUnitRef(pure159);
                                            explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType165.setDecimals("INF");
                                            explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType165.setValue(new BigDecimal(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue162));
                                        
                                        
                                        JAXBElement<PercentItemType> explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberElement164 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType165);
                                        bodyElements.add(explictMember1DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberElement164);
                                    
                                    }
                                    
                                

                                
                            
                            
                            
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBS_LEF_C_OthExp_Standalone_Layout1 if any typeMembers then List or Single
                //List<DBS_LEF_C_OthExp_Standalone_Layout1> dBS_LEF_C_OthExp_Standalone_Layout1 = mainReportData.getDBS_LEF_C_OthExp_Standalone_Layout1();
                
                
                // if typemembers exist
                
                    private String dBS_LEF_C_OthExp_Standalone_Layout1Method(List<DBS_LEF_C_OthExp_Standalone_Layout1> dBS_LEF_C_OthExp_Standalone_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                    {
                        
                    dBS_LEF_C_OthExp_Standalone_Layout1.forEach((field)->{
                        // create startdate, enddate, and perioddate
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                        // crate variable loop  for type member
                        
                            // create variable for type member PermanentAccountNumberOrGroupIDOfCounterpartyAxis
                            String permanentAccountNumberOrGroupIDOfCounterpartyAxis = field.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis();
                        
                            // create variable for type member NameOfCounterPartyAxis
                            String nameOfCounterPartyAxis = field.getNameOfCounterPartyAxis();
                        
                        // end create variable loop for type member
                        
                        // if explict member is empty
                        
                        
                
                        
                        
                            
                                
                                
                                    
                                    Unit INR166 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR166 = createUnitIfNotExist(INR166, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - ExposureAmount
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap168 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap168.put("rbi-core:CounterPartyAxis", "rbi-core:SingleMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap168.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap168.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:OtherExposuresMember");
                                        
                                    String explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberValue169 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap168);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue170 = DBS13ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap168, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue170 != null ) {
                                        if(!explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue170.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue170.getStartDateValue();
                                        if(!explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue170.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue170.getEndDateValue();
                                        if(!explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue170.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue170.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberValue169 != null && !"".equals(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberValue169)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisContext167 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_C_OthExp_Standalone_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap168 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisContext167, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType172 = new MonetaryItemType();
                                        explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType172.setContextRef(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisContext167);
                                        
                                        
                                            explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType172.setUnitRef(INR166);
                                            explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType172.setDecimals("INF");
                                            explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType172.setValue(new BigDecimal(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberValue169));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberElement171 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType172);
                                        bodyElements.add(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberElement171);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure173 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure173 = createUnitIfNotExist(pure173, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - PercentageOfExposureToTier1Capital
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap175 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap175.put("rbi-core:CounterPartyAxis", "rbi-core:SingleMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap175.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap175.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:OtherExposuresMember");
                                        
                                    String explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue176 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap175);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue177 = DBS13ReportUtil.retrieveFieldDataForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap175, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue177 != null ) {
                                        if(!explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue177.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue177.getStartDateValue();
                                        if(!explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue177.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue177.getEndDateValue();
                                        if(!explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue177.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue177.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue176 != null && !"".equals(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue176)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext174 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_C_OthExp_Standalone_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap175 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext174, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        PercentItemType explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType179 = new PercentItemType();
                                        explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType179.setContextRef(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext174);
                                        
                                        
                                            explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType179.setUnitRef(pure173);
                                            explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType179.setDecimals("INF");
                                            explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType179.setValue(new BigDecimal(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue176));
                                        
                                        
                                        JAXBElement<PercentItemType> explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberElement178 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType179);
                                        bodyElements.add(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberElement178);
                                    
                                    }
                                    
                                

                                
                            
                            
                            
                        
                            
                                
                                
                                    
                                    Unit INR180 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR180 = createUnitIfNotExist(INR180, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - ExposureAmount
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap182 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap182.put("rbi-core:CounterPartyAxis", "rbi-core:GroupMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap182.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap182.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:OtherExposuresMember");
                                        
                                    String explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberValue183 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap182);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue184 = DBS13ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap182, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue184 != null ) {
                                        if(!explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue184.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue184.getStartDateValue();
                                        if(!explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue184.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue184.getEndDateValue();
                                        if(!explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue184.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue184.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberValue183 != null && !"".equals(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberValue183)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisContext181 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_C_OthExp_Standalone_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap182 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisContext181, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType186 = new MonetaryItemType();
                                        explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType186.setContextRef(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisContext181);
                                        
                                        
                                            explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType186.setUnitRef(INR180);
                                            explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType186.setDecimals("INF");
                                            explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType186.setValue(new BigDecimal(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberValue183));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberElement185 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType186);
                                        bodyElements.add(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberElement185);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure187 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure187 = createUnitIfNotExist(pure187, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - PercentageOfExposureToTier1Capital
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap189 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap189.put("rbi-core:CounterPartyAxis", "rbi-core:GroupMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap189.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap189.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:OtherExposuresMember");
                                        
                                    String explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue190 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap189);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue191 = DBS13ReportUtil.retrieveFieldDataForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap189, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue191 != null ) {
                                        if(!explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue191.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue191.getStartDateValue();
                                        if(!explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue191.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue191.getEndDateValue();
                                        if(!explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue191.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue191.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue190 != null && !"".equals(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue190)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext188 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_C_OthExp_Standalone_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap189 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext188, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        PercentItemType explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType193 = new PercentItemType();
                                        explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType193.setContextRef(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext188);
                                        
                                        
                                            explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType193.setUnitRef(pure187);
                                            explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType193.setDecimals("INF");
                                            explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType193.setValue(new BigDecimal(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue190));
                                        
                                        
                                        JAXBElement<PercentItemType> explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberElement192 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType193);
                                        bodyElements.add(explictMember1DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberElement192);
                                    
                                    }
                                    
                                

                                
                            
                            
                            
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBS_LEF_D_ExempExp_Standalone_Layout1 if any typeMembers then List or Single
                //List<DBS_LEF_D_ExempExp_Standalone_Layout1> dBS_LEF_D_ExempExp_Standalone_Layout1 = mainReportData.getDBS_LEF_D_ExempExp_Standalone_Layout1();
                
                
                // if typemembers exist
                
                    private String dBS_LEF_D_ExempExp_Standalone_Layout1Method(List<DBS_LEF_D_ExempExp_Standalone_Layout1> dBS_LEF_D_ExempExp_Standalone_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                    {
                        
                    dBS_LEF_D_ExempExp_Standalone_Layout1.forEach((field)->{
                        // create startdate, enddate, and perioddate
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                        // crate variable loop  for type member
                        
                            // create variable for type member PermanentAccountNumberOrGroupIDOfCounterpartyAxis
                            String permanentAccountNumberOrGroupIDOfCounterpartyAxis = field.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis();
                        
                            // create variable for type member NameOfCounterPartyAxis
                            String nameOfCounterPartyAxis = field.getNameOfCounterPartyAxis();
                        
                        // end create variable loop for type member
                        
                        // if explict member is empty
                        
                        
                
                        
                        
                            
                                
                                
                                    
                                    Unit INR194 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR194 = createUnitIfNotExist(INR194, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - ExposureAmount
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap196 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap196.put("rbi-core:CounterPartyAxis", "rbi-core:SingleMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap196.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap196.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExemptedExposuresMember");
                                        
                                    String explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberValue197 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap196);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue198 = DBS13ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap196, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue198 != null ) {
                                        if(!explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue198.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue198.getStartDateValue();
                                        if(!explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue198.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue198.getEndDateValue();
                                        if(!explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue198.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue198.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberValue197 != null && !"".equals(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberValue197)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisContext195 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_D_ExempExp_Standalone_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap196 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisContext195, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType200 = new MonetaryItemType();
                                        explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType200.setContextRef(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisContext195);
                                        
                                        
                                            explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType200.setUnitRef(INR194);
                                            explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType200.setDecimals("INF");
                                            explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType200.setValue(new BigDecimal(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberValue197));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberElement199 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType200);
                                        bodyElements.add(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisSingleMemberElement199);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure201 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure201 = createUnitIfNotExist(pure201, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - PercentageOfExposureToTier1Capital
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap203 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap203.put("rbi-core:CounterPartyAxis", "rbi-core:SingleMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap203.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap203.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExemptedExposuresMember");
                                        
                                    String explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue204 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap203);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue205 = DBS13ReportUtil.retrieveFieldDataForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap203, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue205 != null ) {
                                        if(!explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue205.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue205.getStartDateValue();
                                        if(!explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue205.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue205.getEndDateValue();
                                        if(!explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue205.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue205.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue204 != null && !"".equals(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue204)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext202 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_D_ExempExp_Standalone_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap203 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext202, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        PercentItemType explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType207 = new PercentItemType();
                                        explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType207.setContextRef(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext202);
                                        
                                        
                                            explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType207.setUnitRef(pure201);
                                            explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType207.setDecimals("INF");
                                            explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType207.setValue(new BigDecimal(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue204));
                                        
                                        
                                        JAXBElement<PercentItemType> explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberElement206 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType207);
                                        bodyElements.add(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberElement206);
                                    
                                    }
                                    
                                

                                
                            
                            
                            
                        
                            
                                
                                
                                    
                                    Unit INR208 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR208 = createUnitIfNotExist(INR208, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - ExposureAmount
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap210 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap210.put("rbi-core:CounterPartyAxis", "rbi-core:GroupMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap210.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap210.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExemptedExposuresMember");
                                        
                                    String explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberValue211 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap210);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue212 = DBS13ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap210, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue212 != null ) {
                                        if(!explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue212.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue212.getStartDateValue();
                                        if(!explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue212.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue212.getEndDateValue();
                                        if(!explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue212.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue212.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberValue211 != null && !"".equals(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberValue211)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisContext209 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_D_ExempExp_Standalone_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisMap210 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisContext209, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType214 = new MonetaryItemType();
                                        explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType214.setContextRef(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisContext209);
                                        
                                        
                                            explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType214.setUnitRef(INR208);
                                            explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType214.setDecimals("INF");
                                            explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType214.setValue(new BigDecimal(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberValue211));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberElement213 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType214);
                                        bodyElements.add(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountCounterPartyAxisGroupMemberElement213);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure215 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure215 = createUnitIfNotExist(pure215, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - PercentageOfExposureToTier1Capital
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap217 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap217.put("rbi-core:CounterPartyAxis", "rbi-core:GroupMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap217.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap217.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExemptedExposuresMember");
                                        
                                    String explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue218 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap217);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue219 = DBS13ReportUtil.retrieveFieldDataForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap217, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue219 != null ) {
                                        if(!explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue219.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue219.getStartDateValue();
                                        if(!explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue219.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue219.getEndDateValue();
                                        if(!explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue219.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue219.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue218 != null && !"".equals(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue218)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext216 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_D_ExempExp_Standalone_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap217 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext216, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        PercentItemType explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType221 = new PercentItemType();
                                        explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType221.setContextRef(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext216);
                                        
                                        
                                            explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType221.setUnitRef(pure215);
                                            explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType221.setDecimals("INF");
                                            explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType221.setValue(new BigDecimal(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue218));
                                        
                                        
                                        JAXBElement<PercentItemType> explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberElement220 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType221);
                                        bodyElements.add(explictMember1DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberElement220);
                                    
                                    }
                                    
                                

                                
                            
                            
                            
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBS_LEF_A_20LE_Consolidated_Layout1 if any typeMembers then List or Single
                //DBS_LEF_A_20LE_Consolidated_Layout1 dBS_LEF_A_20LE_Consolidated_Layout1 = mainReportData.getDBS_LEF_A_20LE_Consolidated_Layout1();
                
                    private String dBS_LEF_A_20LE_Consolidated_Layout1Method(DBS_LEF_A_20LE_Consolidated_Layout1 dBS_LEF_A_20LE_Consolidated_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                
                    {
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                    DBS_LEF_A_20LE_Consolidated_Layout1 field = dBS_LEF_A_20LE_Consolidated_Layout1;
                    
                    
                        
                        
                            
                                
                                Unit INR222 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR222 = createUnitIfNotExist(INR222, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - Tier1Capital
                            
                                Map zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalMap226 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalMap226.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                    
                                    String zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalValue224 = DBS13ReportUtil.retrieveValueForElement(field.getTier1Capital(), zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalMap226);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalFieldDataValue225 = DBS13ReportUtil.retrieveFieldDataForElement(field.getTier1Capital(), zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalMap226, "", "", "xs:date($refPeriodEndDate)");
    
                                    if(zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalFieldDataValue225 != null ) {
                                        if(!zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalFieldDataValue225.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalFieldDataValue225.getStartDateValue();
                                        if(!zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalFieldDataValue225.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalFieldDataValue225.getEndDateValue();
                                        if(!zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalFieldDataValue225.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalFieldDataValue225.getInstantDateValue();
                                    }

                                    
                                            Context DBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalContext223 = DBS13ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalMap226 );
                                        
                                
                                if(zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalValue224 != null && !"".equals(zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalValue224)) {
                                    
                                    addContext(DBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalContext223, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType tier1CapitalValue227 = new MonetaryItemType();
                                    tier1CapitalValue227.setContextRef(DBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalContext223);
                                    
                                    tier1CapitalValue227.setUnitRef(INR222);
                                    tier1CapitalValue227.setDecimals("INF");
                                    tier1CapitalValue227.setValue(new BigDecimal(zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalValue224));
                                    
                                    
                                    JAXBElement<MonetaryItemType> tier1CapitalElement228 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createTier1Capital(tier1CapitalValue227);
                                    bodyElements.add(tier1CapitalElement228);
                                
                            }
                        
                        
                    
                    
            
                    
                    
                    
                    return "";
                    }

                
                    
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBS_LEF_A_20LE_Consolidated_Layout2 if any typeMembers then List or Single
                //List<DBS_LEF_A_20LE_Consolidated_Layout2> dBS_LEF_A_20LE_Consolidated_Layout2 = mainReportData.getDBS_LEF_A_20LE_Consolidated_Layout2();
                
                
                // if typemembers exist
                
                    private String dBS_LEF_A_20LE_Consolidated_Layout2Method(List<DBS_LEF_A_20LE_Consolidated_Layout2> dBS_LEF_A_20LE_Consolidated_Layout2, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                    {
                        
                    dBS_LEF_A_20LE_Consolidated_Layout2.forEach((field)->{
                        // create startdate, enddate, and perioddate
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                        // crate variable loop  for type member
                        
                            // create variable for type member PermanentAccountNumberOrGroupIDOfCounterpartyAxis
                            String permanentAccountNumberOrGroupIDOfCounterpartyAxis = field.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis();
                        
                            // create variable for type member NameOfCounterPartyAxis
                            String nameOfCounterPartyAxis = field.getNameOfCounterPartyAxis();
                        
                        // end create variable loop for type member
                        
                        // if explict member is empty
                        
                        
                
                        
                        
                            
                                
                                
                                    
                                    Unit INR229 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR229 = createUnitIfNotExist(INR229, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - ExposureAmount
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisMap231 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisMap231.put("rbi-core:CounterPartyAxis", "rbi-core:SingleMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisMap231.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisMap231.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:LargestTwentyExposuresMember");
                                        
                                    String explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisSingleMemberValue232 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisMap231);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisSingleMemberFieldDataValue233 = DBS13ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisMap231, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisSingleMemberFieldDataValue233 != null ) {
                                        if(!explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisSingleMemberFieldDataValue233.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisSingleMemberFieldDataValue233.getStartDateValue();
                                        if(!explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisSingleMemberFieldDataValue233.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisSingleMemberFieldDataValue233.getEndDateValue();
                                        if(!explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisSingleMemberFieldDataValue233.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisSingleMemberFieldDataValue233.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisSingleMemberValue232 != null && !"".equals(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisSingleMemberValue232)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisContext230 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_A_20LE_Consolidated_Layout2( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisMap231 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisContext230, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisSingleMemberDataType235 = new MonetaryItemType();
                                        explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisSingleMemberDataType235.setContextRef(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisContext230);
                                        
                                        
                                            explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisSingleMemberDataType235.setUnitRef(INR229);
                                            explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisSingleMemberDataType235.setDecimals("INF");
                                            explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisSingleMemberDataType235.setValue(new BigDecimal(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisSingleMemberValue232));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisSingleMemberElement234 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisSingleMemberDataType235);
                                        bodyElements.add(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisSingleMemberElement234);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure236 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure236 = createUnitIfNotExist(pure236, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - PercentageOfExposureToTier1Capital
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap238 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap238.put("rbi-core:CounterPartyAxis", "rbi-core:SingleMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap238.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap238.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:LargestTwentyExposuresMember");
                                        
                                    String explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue239 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap238);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue240 = DBS13ReportUtil.retrieveFieldDataForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap238, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue240 != null ) {
                                        if(!explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue240.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue240.getStartDateValue();
                                        if(!explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue240.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue240.getEndDateValue();
                                        if(!explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue240.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue240.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue239 != null && !"".equals(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue239)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisContext237 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_A_20LE_Consolidated_Layout2( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap238 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisContext237, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        PercentItemType explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType242 = new PercentItemType();
                                        explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType242.setContextRef(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisContext237);
                                        
                                        
                                            explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType242.setUnitRef(pure236);
                                            explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType242.setDecimals("INF");
                                            explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType242.setValue(new BigDecimal(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue239));
                                        
                                        
                                        JAXBElement<PercentItemType> explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberElement241 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType242);
                                        bodyElements.add(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberElement241);
                                    
                                    }
                                    
                                

                                
                            
                            
                            
                        
                            
                                
                                
                                    
                                    Unit INR243 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR243 = createUnitIfNotExist(INR243, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - ExposureAmount
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisMap245 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisMap245.put("rbi-core:CounterPartyAxis", "rbi-core:GroupMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisMap245.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisMap245.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:LargestTwentyExposuresMember");
                                        
                                    String explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisGroupMemberValue246 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisMap245);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisGroupMemberFieldDataValue247 = DBS13ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisMap245, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisGroupMemberFieldDataValue247 != null ) {
                                        if(!explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisGroupMemberFieldDataValue247.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisGroupMemberFieldDataValue247.getStartDateValue();
                                        if(!explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisGroupMemberFieldDataValue247.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisGroupMemberFieldDataValue247.getEndDateValue();
                                        if(!explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisGroupMemberFieldDataValue247.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisGroupMemberFieldDataValue247.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisGroupMemberValue246 != null && !"".equals(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisGroupMemberValue246)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisContext244 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_A_20LE_Consolidated_Layout2( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisMap245 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisContext244, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisGroupMemberDataType249 = new MonetaryItemType();
                                        explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisGroupMemberDataType249.setContextRef(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisContext244);
                                        
                                        
                                            explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisGroupMemberDataType249.setUnitRef(INR243);
                                            explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisGroupMemberDataType249.setDecimals("INF");
                                            explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisGroupMemberDataType249.setValue(new BigDecimal(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisGroupMemberValue246));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisGroupMemberElement248 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisGroupMemberDataType249);
                                        bodyElements.add(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountCounterPartyAxisGroupMemberElement248);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure250 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure250 = createUnitIfNotExist(pure250, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - PercentageOfExposureToTier1Capital
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap252 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap252.put("rbi-core:CounterPartyAxis", "rbi-core:GroupMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap252.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap252.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:LargestTwentyExposuresMember");
                                        
                                    String explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue253 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap252);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue254 = DBS13ReportUtil.retrieveFieldDataForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap252, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue254 != null ) {
                                        if(!explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue254.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue254.getStartDateValue();
                                        if(!explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue254.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue254.getEndDateValue();
                                        if(!explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue254.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue254.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue253 != null && !"".equals(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue253)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisContext251 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_A_20LE_Consolidated_Layout2( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisMap252 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisContext251, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        PercentItemType explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType256 = new PercentItemType();
                                        explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType256.setContextRef(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisContext251);
                                        
                                        
                                            explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType256.setUnitRef(pure250);
                                            explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType256.setDecimals("INF");
                                            explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType256.setValue(new BigDecimal(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue253));
                                        
                                        
                                        JAXBElement<PercentItemType> explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberElement255 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType256);
                                        bodyElements.add(explictMember1DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberElement255);
                                    
                                    }
                                    
                                

                                
                            
                            
                            
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBS_LEF_B_SpecExp_Consolidated_Layout1 if any typeMembers then List or Single
                //List<DBS_LEF_B_SpecExp_Consolidated_Layout1> dBS_LEF_B_SpecExp_Consolidated_Layout1 = mainReportData.getDBS_LEF_B_SpecExp_Consolidated_Layout1();
                
                
                // if typemembers exist
                
                    private String dBS_LEF_B_SpecExp_Consolidated_Layout1Method(List<DBS_LEF_B_SpecExp_Consolidated_Layout1> dBS_LEF_B_SpecExp_Consolidated_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                    {
                        
                    dBS_LEF_B_SpecExp_Consolidated_Layout1.forEach((field)->{
                        // create startdate, enddate, and perioddate
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                        // crate variable loop  for type member
                        
                            // create variable for type member PermanentAccountNumberOrGroupIDOfCounterpartyAxis
                            String permanentAccountNumberOrGroupIDOfCounterpartyAxis = field.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis();
                        
                            // create variable for type member NameOfCounterPartyAxis
                            String nameOfCounterPartyAxis = field.getNameOfCounterPartyAxis();
                        
                        // end create variable loop for type member
                        
                        // if explict member is empty
                        
                        
                
                        
                        
                            
                                
                                
                                    
                                    Unit INR257 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR257 = createUnitIfNotExist(INR257, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - ExposureAmount
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap259 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap259.put("rbi-core:CounterPartyAxis", "rbi-core:SingleMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap259.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap259.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExposuresEqualToOrAboveSpecifiedPercentageOfTier1CapitalMember");
                                        
                                    String explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberValue260 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap259);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue261 = DBS13ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap259, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue261 != null ) {
                                        if(!explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue261.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue261.getStartDateValue();
                                        if(!explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue261.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue261.getEndDateValue();
                                        if(!explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue261.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue261.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberValue260 != null && !"".equals(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberValue260)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisContext258 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_B_SpecExp_Consolidated_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap259 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisContext258, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType263 = new MonetaryItemType();
                                        explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType263.setContextRef(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisContext258);
                                        
                                        
                                            explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType263.setUnitRef(INR257);
                                            explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType263.setDecimals("INF");
                                            explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType263.setValue(new BigDecimal(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberValue260));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberElement262 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType263);
                                        bodyElements.add(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberElement262);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure264 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure264 = createUnitIfNotExist(pure264, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - PercentageOfExposureToTier1Capital
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap266 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap266.put("rbi-core:CounterPartyAxis", "rbi-core:SingleMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap266.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap266.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExposuresEqualToOrAboveSpecifiedPercentageOfTier1CapitalMember");
                                        
                                    String explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue267 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap266);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue268 = DBS13ReportUtil.retrieveFieldDataForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap266, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue268 != null ) {
                                        if(!explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue268.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue268.getStartDateValue();
                                        if(!explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue268.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue268.getEndDateValue();
                                        if(!explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue268.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue268.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue267 != null && !"".equals(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue267)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext265 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_B_SpecExp_Consolidated_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap266 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext265, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        PercentItemType explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType270 = new PercentItemType();
                                        explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType270.setContextRef(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext265);
                                        
                                        
                                            explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType270.setUnitRef(pure264);
                                            explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType270.setDecimals("INF");
                                            explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType270.setValue(new BigDecimal(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue267));
                                        
                                        
                                        JAXBElement<PercentItemType> explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberElement269 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType270);
                                        bodyElements.add(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberElement269);
                                    
                                    }
                                    
                                

                                
                            
                            
                            
                        
                            
                                
                                
                                    
                                    Unit INR271 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR271 = createUnitIfNotExist(INR271, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - ExposureAmount
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap273 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap273.put("rbi-core:CounterPartyAxis", "rbi-core:GroupMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap273.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap273.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExposuresEqualToOrAboveSpecifiedPercentageOfTier1CapitalMember");
                                        
                                    String explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberValue274 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap273);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue275 = DBS13ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap273, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue275 != null ) {
                                        if(!explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue275.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue275.getStartDateValue();
                                        if(!explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue275.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue275.getEndDateValue();
                                        if(!explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue275.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue275.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberValue274 != null && !"".equals(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberValue274)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisContext272 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_B_SpecExp_Consolidated_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap273 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisContext272, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType277 = new MonetaryItemType();
                                        explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType277.setContextRef(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisContext272);
                                        
                                        
                                            explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType277.setUnitRef(INR271);
                                            explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType277.setDecimals("INF");
                                            explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType277.setValue(new BigDecimal(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberValue274));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberElement276 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType277);
                                        bodyElements.add(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberElement276);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure278 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure278 = createUnitIfNotExist(pure278, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - PercentageOfExposureToTier1Capital
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap280 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap280.put("rbi-core:CounterPartyAxis", "rbi-core:GroupMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap280.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap280.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExposuresEqualToOrAboveSpecifiedPercentageOfTier1CapitalMember");
                                        
                                    String explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue281 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap280);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue282 = DBS13ReportUtil.retrieveFieldDataForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap280, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue282 != null ) {
                                        if(!explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue282.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue282.getStartDateValue();
                                        if(!explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue282.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue282.getEndDateValue();
                                        if(!explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue282.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue282.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue281 != null && !"".equals(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue281)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext279 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_B_SpecExp_Consolidated_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap280 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext279, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        PercentItemType explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType284 = new PercentItemType();
                                        explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType284.setContextRef(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext279);
                                        
                                        
                                            explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType284.setUnitRef(pure278);
                                            explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType284.setDecimals("INF");
                                            explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType284.setValue(new BigDecimal(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue281));
                                        
                                        
                                        JAXBElement<PercentItemType> explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberElement283 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType284);
                                        bodyElements.add(explictMember1DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberElement283);
                                    
                                    }
                                    
                                

                                
                            
                            
                            
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBS_LEF_C_OthExp_Consolidated_Layout1 if any typeMembers then List or Single
                //List<DBS_LEF_C_OthExp_Consolidated_Layout1> dBS_LEF_C_OthExp_Consolidated_Layout1 = mainReportData.getDBS_LEF_C_OthExp_Consolidated_Layout1();
                
                
                // if typemembers exist
                
                    private String dBS_LEF_C_OthExp_Consolidated_Layout1Method(List<DBS_LEF_C_OthExp_Consolidated_Layout1> dBS_LEF_C_OthExp_Consolidated_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                    {
                        
                    dBS_LEF_C_OthExp_Consolidated_Layout1.forEach((field)->{
                        // create startdate, enddate, and perioddate
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                        // crate variable loop  for type member
                        
                            // create variable for type member PermanentAccountNumberOrGroupIDOfCounterpartyAxis
                            String permanentAccountNumberOrGroupIDOfCounterpartyAxis = field.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis();
                        
                            // create variable for type member NameOfCounterPartyAxis
                            String nameOfCounterPartyAxis = field.getNameOfCounterPartyAxis();
                        
                        // end create variable loop for type member
                        
                        // if explict member is empty
                        
                        
                
                        
                        
                            
                                
                                
                                    
                                    Unit INR285 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR285 = createUnitIfNotExist(INR285, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - ExposureAmount
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap287 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap287.put("rbi-core:CounterPartyAxis", "rbi-core:SingleMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap287.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap287.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:OtherExposuresMember");
                                        
                                    String explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberValue288 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap287);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue289 = DBS13ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap287, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue289 != null ) {
                                        if(!explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue289.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue289.getStartDateValue();
                                        if(!explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue289.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue289.getEndDateValue();
                                        if(!explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue289.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue289.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberValue288 != null && !"".equals(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberValue288)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisContext286 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_C_OthExp_Consolidated_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap287 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisContext286, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType291 = new MonetaryItemType();
                                        explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType291.setContextRef(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisContext286);
                                        
                                        
                                            explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType291.setUnitRef(INR285);
                                            explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType291.setDecimals("INF");
                                            explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType291.setValue(new BigDecimal(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberValue288));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberElement290 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType291);
                                        bodyElements.add(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberElement290);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure292 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure292 = createUnitIfNotExist(pure292, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - PercentageOfExposureToTier1Capital
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap294 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap294.put("rbi-core:CounterPartyAxis", "rbi-core:SingleMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap294.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap294.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:OtherExposuresMember");
                                        
                                    String explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue295 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap294);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue296 = DBS13ReportUtil.retrieveFieldDataForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap294, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue296 != null ) {
                                        if(!explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue296.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue296.getStartDateValue();
                                        if(!explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue296.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue296.getEndDateValue();
                                        if(!explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue296.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue296.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue295 != null && !"".equals(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue295)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext293 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_C_OthExp_Consolidated_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap294 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext293, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        PercentItemType explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType298 = new PercentItemType();
                                        explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType298.setContextRef(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext293);
                                        
                                        
                                            explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType298.setUnitRef(pure292);
                                            explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType298.setDecimals("INF");
                                            explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType298.setValue(new BigDecimal(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue295));
                                        
                                        
                                        JAXBElement<PercentItemType> explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberElement297 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType298);
                                        bodyElements.add(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberElement297);
                                    
                                    }
                                    
                                

                                
                            
                            
                            
                        
                            
                                
                                
                                    
                                    Unit INR299 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR299 = createUnitIfNotExist(INR299, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - ExposureAmount
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap301 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap301.put("rbi-core:CounterPartyAxis", "rbi-core:GroupMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap301.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap301.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:OtherExposuresMember");
                                        
                                    String explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberValue302 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap301);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue303 = DBS13ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap301, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue303 != null ) {
                                        if(!explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue303.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue303.getStartDateValue();
                                        if(!explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue303.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue303.getEndDateValue();
                                        if(!explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue303.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue303.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberValue302 != null && !"".equals(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberValue302)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisContext300 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_C_OthExp_Consolidated_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap301 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisContext300, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType305 = new MonetaryItemType();
                                        explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType305.setContextRef(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisContext300);
                                        
                                        
                                            explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType305.setUnitRef(INR299);
                                            explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType305.setDecimals("INF");
                                            explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType305.setValue(new BigDecimal(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberValue302));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberElement304 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType305);
                                        bodyElements.add(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberElement304);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure306 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure306 = createUnitIfNotExist(pure306, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - PercentageOfExposureToTier1Capital
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap308 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap308.put("rbi-core:CounterPartyAxis", "rbi-core:GroupMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap308.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap308.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:OtherExposuresMember");
                                        
                                    String explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue309 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap308);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue310 = DBS13ReportUtil.retrieveFieldDataForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap308, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue310 != null ) {
                                        if(!explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue310.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue310.getStartDateValue();
                                        if(!explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue310.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue310.getEndDateValue();
                                        if(!explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue310.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue310.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue309 != null && !"".equals(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue309)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext307 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_C_OthExp_Consolidated_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap308 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext307, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        PercentItemType explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType312 = new PercentItemType();
                                        explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType312.setContextRef(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext307);
                                        
                                        
                                            explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType312.setUnitRef(pure306);
                                            explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType312.setDecimals("INF");
                                            explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType312.setValue(new BigDecimal(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue309));
                                        
                                        
                                        JAXBElement<PercentItemType> explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberElement311 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType312);
                                        bodyElements.add(explictMember1DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberElement311);
                                    
                                    }
                                    
                                

                                
                            
                            
                            
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBS_LEF_D_ExempExp_Consolidated_Layout1 if any typeMembers then List or Single
                //List<DBS_LEF_D_ExempExp_Consolidated_Layout1> dBS_LEF_D_ExempExp_Consolidated_Layout1 = mainReportData.getDBS_LEF_D_ExempExp_Consolidated_Layout1();
                
                
                // if typemembers exist
                
                    private String dBS_LEF_D_ExempExp_Consolidated_Layout1Method(List<DBS_LEF_D_ExempExp_Consolidated_Layout1> dBS_LEF_D_ExempExp_Consolidated_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDateDefault, String endDateDefault, String periodDateDefault)
                    {
                        
                    dBS_LEF_D_ExempExp_Consolidated_Layout1.forEach((field)->{
                        // create startdate, enddate, and perioddate
                        String startDate = startDateDefault;
                        String endDate = endDateDefault;
                        String periodDate = periodDateDefault;
                        // crate variable loop  for type member
                        
                            // create variable for type member PermanentAccountNumberOrGroupIDOfCounterpartyAxis
                            String permanentAccountNumberOrGroupIDOfCounterpartyAxis = field.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis();
                        
                            // create variable for type member NameOfCounterPartyAxis
                            String nameOfCounterPartyAxis = field.getNameOfCounterPartyAxis();
                        
                        // end create variable loop for type member
                        
                        // if explict member is empty
                        
                        
                
                        
                        
                            
                                
                                
                                    
                                    Unit INR313 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR313 = createUnitIfNotExist(INR313, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - ExposureAmount
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap315 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap315.put("rbi-core:CounterPartyAxis", "rbi-core:SingleMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap315.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap315.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExemptedExposuresMember");
                                        
                                    String explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberValue316 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap315);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue317 = DBS13ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap315, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue317 != null ) {
                                        if(!explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue317.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue317.getStartDateValue();
                                        if(!explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue317.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue317.getEndDateValue();
                                        if(!explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue317.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberFieldDataValue317.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberValue316 != null && !"".equals(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberValue316)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisContext314 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_D_ExempExp_Consolidated_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap315 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisContext314, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType319 = new MonetaryItemType();
                                        explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType319.setContextRef(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisContext314);
                                        
                                        
                                            explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType319.setUnitRef(INR313);
                                            explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType319.setDecimals("INF");
                                            explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType319.setValue(new BigDecimal(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberValue316));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberElement318 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberDataType319);
                                        bodyElements.add(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisSingleMemberElement318);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure320 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure320 = createUnitIfNotExist(pure320, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - PercentageOfExposureToTier1Capital
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap322 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap322.put("rbi-core:CounterPartyAxis", "rbi-core:SingleMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap322.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap322.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExemptedExposuresMember");
                                        
                                    String explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue323 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap322);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue324 = DBS13ReportUtil.retrieveFieldDataForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap322, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue324 != null ) {
                                        if(!explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue324.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue324.getStartDateValue();
                                        if(!explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue324.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue324.getEndDateValue();
                                        if(!explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue324.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberFieldDataValue324.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue323 != null && !"".equals(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue323)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext321 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_D_ExempExp_Consolidated_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap322 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext321, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        PercentItemType explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType326 = new PercentItemType();
                                        explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType326.setContextRef(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext321);
                                        
                                        
                                            explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType326.setUnitRef(pure320);
                                            explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType326.setDecimals("INF");
                                            explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType326.setValue(new BigDecimal(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberValue323));
                                        
                                        
                                        JAXBElement<PercentItemType> explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberElement325 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberDataType326);
                                        bodyElements.add(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisSingleMemberElement325);
                                    
                                    }
                                    
                                

                                
                            
                            
                            
                        
                            
                                
                                
                                    
                                    Unit INR327 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR327 = createUnitIfNotExist(INR327, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - ExposureAmount
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap329 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap329.put("rbi-core:CounterPartyAxis", "rbi-core:GroupMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap329.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap329.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExemptedExposuresMember");
                                        
                                    String explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberValue330 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap329);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue331 = DBS13ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap329, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue331 != null ) {
                                        if(!explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue331.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue331.getStartDateValue();
                                        if(!explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue331.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue331.getEndDateValue();
                                        if(!explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue331.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberFieldDataValue331.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberValue330 != null && !"".equals(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberValue330)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisContext328 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_D_ExempExp_Consolidated_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisMap329 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisContext328, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        MonetaryItemType explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType333 = new MonetaryItemType();
                                        explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType333.setContextRef(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisContext328);
                                        
                                        
                                            explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType333.setUnitRef(INR327);
                                            explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType333.setDecimals("INF");
                                            explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType333.setValue(new BigDecimal(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberValue330));
                                        
                                        
                                        JAXBElement<MonetaryItemType> explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberElement332 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberDataType333);
                                        bodyElements.add(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountCounterPartyAxisGroupMemberElement332);
                                    
                                    }
                                    
                                

                                
                            
                            
                                
                                
                                    
                                    Unit pure334 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure334 = createUnitIfNotExist(pure334, "PURE", "http://www.xbrl.org/2003/instance", "pure", unitElements);
                                    
                                
                                
                                //rbi-core:CounterPartyAxis - PercentageOfExposureToTier1Capital
                                
                            
                                
                                    
                                    Map explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap336 = new HashMap<String, String>();
                                    
                                    
                                    explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap336.put("rbi-core:CounterPartyAxis", "rbi-core:GroupMember");                
                                    
                                            
                                            
                                            explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap336.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap336.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExemptedExposuresMember");
                                        
                                    String explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue337 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap336);
                                
                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue338 = DBS13ReportUtil.retrieveFieldDataForElement(field.getPercentageOfExposureToTier1Capital(), explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap336, "", "", "xs:date($refPeriodEndDate)");

                                    if(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue338 != null ) {
                                        if(!explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue338.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue338.getStartDateValue();
                                        if(!explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue338.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue338.getEndDateValue();
                                        if(!explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue338.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberFieldDataValue338.getInstantDateValue();
                                    }

                                    if(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue337 != null && !"".equals(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue337)) {
                                    
                                        
                                            Context explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext335 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_D_ExempExp_Consolidated_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisMap336 );
                                            
                                        
                                        addContext(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext335, contextElements, contextIdentifiers);
                                    
                                    
                                        // create element JAXB Element
                    
                                        PercentItemType explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType340 = new PercentItemType();
                                        explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType340.setContextRef(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisContext335);
                                        
                                        
                                            explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType340.setUnitRef(pure334);
                                            explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType340.setDecimals("INF");
                                            explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType340.setValue(new BigDecimal(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberValue337));
                                        
                                        
                                        JAXBElement<PercentItemType> explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberElement339 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberDataType340);
                                        bodyElements.add(explictMember1DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalCounterPartyAxisGroupMemberElement339);
                                    
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
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryMap344 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryValue342 = DBS13ReportUtil.retrieveValueForElement(field.getNameOfSignatory(), zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryMap344);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue343 = DBS13ReportUtil.retrieveFieldDataForElement(field.getNameOfSignatory(), zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryMap344, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue343 != null ) {
                                        if(!zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue343.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue343.getStartDateValue();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue343.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue343.getEndDateValue();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue343.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue343.getInstantDateValue();
                                    }

                                    
                                        Context DBS_AuthorisedSignatory_Layout1NameOfSignatoryContext341 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryValue342 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryValue342)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1NameOfSignatoryContext341, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType nameOfSignatoryValue345 = new StringItemType();
                                    nameOfSignatoryValue345.setContextRef(DBS_AuthorisedSignatory_Layout1NameOfSignatoryContext341);
                                    
                                    nameOfSignatoryValue345.setValue(zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryValue342);        
                                    
                                    
                                    JAXBElement<StringItemType> nameOfSignatoryElement346 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNameOfSignatory(nameOfSignatoryValue345);
                                    bodyElements.add(nameOfSignatoryElement346);
                                
                            }
                        
                            
                            // - DesignationOfSignatory
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryMap350 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryValue348 = DBS13ReportUtil.retrieveValueForElement(field.getDesignationOfSignatory(), zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryMap350);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue349 = DBS13ReportUtil.retrieveFieldDataForElement(field.getDesignationOfSignatory(), zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryMap350, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue349 != null ) {
                                        if(!zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue349.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue349.getStartDateValue();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue349.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue349.getEndDateValue();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue349.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue349.getInstantDateValue();
                                    }

                                    
                                        Context DBS_AuthorisedSignatory_Layout1DesignationOfSignatoryContext347 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryValue348 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryValue348)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1DesignationOfSignatoryContext347, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType designationOfSignatoryValue351 = new StringItemType();
                                    designationOfSignatoryValue351.setContextRef(DBS_AuthorisedSignatory_Layout1DesignationOfSignatoryContext347);
                                    
                                    designationOfSignatoryValue351.setValue(zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryValue348);        
                                    
                                    
                                    JAXBElement<StringItemType> designationOfSignatoryElement352 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createDesignationOfSignatory(designationOfSignatoryValue351);
                                    bodyElements.add(designationOfSignatoryElement352);
                                
                            }
                        
                            
                            // - AuthorisedSignatoryOfficialLandlineNumber
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberMap356 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue354 = DBS13ReportUtil.retrieveValueForElement(field.getAuthorisedSignatoryOfficialLandlineNumber(), zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberMap356);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue355 = DBS13ReportUtil.retrieveFieldDataForElement(field.getAuthorisedSignatoryOfficialLandlineNumber(), zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberMap356, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue355 != null ) {
                                        if(!zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue355.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue355.getStartDateValue();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue355.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue355.getEndDateValue();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue355.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue355.getInstantDateValue();
                                    }

                                    
                                        Context DBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext353 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue354 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue354)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext353, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType authorisedSignatoryOfficialLandlineNumberValue357 = new StringItemType();
                                    authorisedSignatoryOfficialLandlineNumberValue357.setContextRef(DBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext353);
                                    
                                    authorisedSignatoryOfficialLandlineNumberValue357.setValue(zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue354);        
                                    
                                    
                                    JAXBElement<StringItemType> authorisedSignatoryOfficialLandlineNumberElement358 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createAuthorisedSignatoryOfficialLandlineNumber(authorisedSignatoryOfficialLandlineNumberValue357);
                                    bodyElements.add(authorisedSignatoryOfficialLandlineNumberElement358);
                                
                            }
                        
                            
                            // - MobileNumberOfAuthorisedSignatory
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryMap362 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue360 = DBS13ReportUtil.retrieveValueForElement(field.getMobileNumberOfAuthorisedSignatory(), zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryMap362);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue361 = DBS13ReportUtil.retrieveFieldDataForElement(field.getMobileNumberOfAuthorisedSignatory(), zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryMap362, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue361 != null ) {
                                        if(!zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue361.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue361.getStartDateValue();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue361.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue361.getEndDateValue();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue361.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue361.getInstantDateValue();
                                    }

                                    
                                        Context DBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext359 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue360 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue360)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext359, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType mobileNumberOfAuthorisedSignatoryValue363 = new StringItemType();
                                    mobileNumberOfAuthorisedSignatoryValue363.setContextRef(DBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext359);
                                    
                                    mobileNumberOfAuthorisedSignatoryValue363.setValue(zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue360);        
                                    
                                    
                                    JAXBElement<StringItemType> mobileNumberOfAuthorisedSignatoryElement364 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createMobileNumberOfAuthorisedSignatory(mobileNumberOfAuthorisedSignatoryValue363);
                                    bodyElements.add(mobileNumberOfAuthorisedSignatoryElement364);
                                
                            }
                        
                            
                            // - EMailIDOfAuthorisedReportingOfficial
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialMap368 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue366 = DBS13ReportUtil.retrieveValueForElement(field.getEMailIDOfAuthorisedReportingOfficial(), zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialMap368);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue367 = DBS13ReportUtil.retrieveFieldDataForElement(field.getEMailIDOfAuthorisedReportingOfficial(), zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialMap368, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue367 != null ) {
                                        if(!zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue367.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue367.getStartDateValue();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue367.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue367.getEndDateValue();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue367.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue367.getInstantDateValue();
                                    }

                                    
                                        Context DBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext365 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue366 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue366)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext365, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType eMailIDOfAuthorisedReportingOfficialValue369 = new StringItemType();
                                    eMailIDOfAuthorisedReportingOfficialValue369.setContextRef(DBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext365);
                                    
                                    eMailIDOfAuthorisedReportingOfficialValue369.setValue(zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue366);        
                                    
                                    
                                    JAXBElement<StringItemType> eMailIDOfAuthorisedReportingOfficialElement370 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createEMailIDOfAuthorisedReportingOfficial(eMailIDOfAuthorisedReportingOfficialValue369);
                                    bodyElements.add(eMailIDOfAuthorisedReportingOfficialElement370);
                                
                            }
                        
                            
                            // - Remarks
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1RemarksMap374 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1RemarksValue372 = DBS13ReportUtil.retrieveValueForElement(field.getRemarks(), zeroDBS_AuthorisedSignatory_Layout1RemarksMap374);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBS_AuthorisedSignatory_Layout1RemarksFieldDataValue373 = DBS13ReportUtil.retrieveFieldDataForElement(field.getRemarks(), zeroDBS_AuthorisedSignatory_Layout1RemarksMap374, "xs:date($refPeriodStartDate)", "xs:date($refPeriodEndDate)", "");
    
                                    if(zeroDBS_AuthorisedSignatory_Layout1RemarksFieldDataValue373 != null ) {
                                        if(!zeroDBS_AuthorisedSignatory_Layout1RemarksFieldDataValue373.getStartDateValue().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_AuthorisedSignatory_Layout1RemarksFieldDataValue373.getStartDateValue();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1RemarksFieldDataValue373.getEndDateValue().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_AuthorisedSignatory_Layout1RemarksFieldDataValue373.getEndDateValue();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1RemarksFieldDataValue373.getInstantDateValue().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_AuthorisedSignatory_Layout1RemarksFieldDataValue373.getInstantDateValue();
                                    }

                                    
                                        Context DBS_AuthorisedSignatory_Layout1RemarksContext371 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1RemarksValue372 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1RemarksValue372)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1RemarksContext371, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType remarksValue375 = new StringItemType();
                                    remarksValue375.setContextRef(DBS_AuthorisedSignatory_Layout1RemarksContext371);
                                    
                                    remarksValue375.setValue(zeroDBS_AuthorisedSignatory_Layout1RemarksValue372);        
                                    
                                    
                                    JAXBElement<StringItemType> remarksElement376 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createRemarks(remarksValue375);
                                    bodyElements.add(remarksElement376);
                                
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
    
    

