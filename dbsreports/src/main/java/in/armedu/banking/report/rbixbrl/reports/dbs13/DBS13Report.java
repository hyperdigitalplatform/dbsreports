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
            simpleType.setHref("dbs13-entry.xsd");
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
                                    FieldDataValue zeroFilingInfo_Layout1ReturnNameFieldDataValue3 = DBS13ReportUtil.retrieveFieldDataForElement(field.getReturnName(), zeroFilingInfo_Layout1ReturnNameMap4);
    
                                    if(zeroFilingInfo_Layout1ReturnNameFieldDataValue3 != null ) {
                                        if(!zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getStartDate();
                                        if(!zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getEndDate();
                                        if(!zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReturnNameFieldDataValue3.getInstantDate();
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
                                    FieldDataValue zeroFilingInfo_Layout1ReturnCodeFieldDataValue9 = DBS13ReportUtil.retrieveFieldDataForElement(field.getReturnCode(), zeroFilingInfo_Layout1ReturnCodeMap10);
    
                                    if(zeroFilingInfo_Layout1ReturnCodeFieldDataValue9 != null ) {
                                        if(!zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getStartDate();
                                        if(!zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getEndDate();
                                        if(!zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReturnCodeFieldDataValue9.getInstantDate();
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
                                    FieldDataValue zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15 = DBS13ReportUtil.retrieveFieldDataForElement(field.getNameOfReportingInstitution(), zeroFilingInfo_Layout1NameOfReportingInstitutionMap16);
    
                                    if(zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15 != null ) {
                                        if(!zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getStartDate();
                                        if(!zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getEndDate();
                                        if(!zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1NameOfReportingInstitutionFieldDataValue15.getInstantDate();
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
                                    FieldDataValue zeroFilingInfo_Layout1BankCodeFieldDataValue21 = DBS13ReportUtil.retrieveFieldDataForElement(field.getBankCode(), zeroFilingInfo_Layout1BankCodeMap22);
    
                                    if(zeroFilingInfo_Layout1BankCodeFieldDataValue21 != null ) {
                                        if(!zeroFilingInfo_Layout1BankCodeFieldDataValue21.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1BankCodeFieldDataValue21.getStartDate();
                                        if(!zeroFilingInfo_Layout1BankCodeFieldDataValue21.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1BankCodeFieldDataValue21.getEndDate();
                                        if(!zeroFilingInfo_Layout1BankCodeFieldDataValue21.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1BankCodeFieldDataValue21.getInstantDate();
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
                                    FieldDataValue zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27 = DBS13ReportUtil.retrieveFieldDataForElement(field.getInstitutionType(), zeroFilingInfo_Layout1InstitutionTypeMap28);
    
                                    if(zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27 != null ) {
                                        if(!zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getStartDate();
                                        if(!zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getEndDate();
                                        if(!zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1InstitutionTypeFieldDataValue27.getInstantDate();
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
                                    FieldDataValue zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33 = DBS13ReportUtil.retrieveFieldDataForElement(field.getReportingFrequency(), zeroFilingInfo_Layout1ReportingFrequencyMap34);
    
                                    if(zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getStartDate();
                                        if(!zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getEndDate();
                                        if(!zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingFrequencyFieldDataValue33.getInstantDate();
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
                                    FieldDataValue zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39 = DBS13ReportUtil.retrieveFieldDataForElement(field.getReportingPeriodStartDate(), zeroFilingInfo_Layout1ReportingPeriodStartDateMap40);
    
                                    if(zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getStartDate();
                                        if(!zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getEndDate();
                                        if(!zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingPeriodStartDateFieldDataValue39.getInstantDate();
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
                                    FieldDataValue zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45 = DBS13ReportUtil.retrieveFieldDataForElement(field.getReportingPeriodEndDate(), zeroFilingInfo_Layout1ReportingPeriodEndDateMap46);
    
                                    if(zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getStartDate();
                                        if(!zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getEndDate();
                                        if(!zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingPeriodEndDateFieldDataValue45.getInstantDate();
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
                                    FieldDataValue zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51 = DBS13ReportUtil.retrieveFieldDataForElement(field.getReportingCurrency(), zeroFilingInfo_Layout1ReportingCurrencyMap52);
    
                                    if(zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getStartDate();
                                        if(!zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getEndDate();
                                        if(!zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingCurrencyFieldDataValue51.getInstantDate();
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
                                    FieldDataValue zeroFilingInfo_Layout1ReportingScaleFieldDataValue57 = DBS13ReportUtil.retrieveFieldDataForElement(field.getReportingScale(), zeroFilingInfo_Layout1ReportingScaleMap58);
    
                                    if(zeroFilingInfo_Layout1ReportingScaleFieldDataValue57 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getStartDate();
                                        if(!zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getEndDate();
                                        if(!zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportingScaleFieldDataValue57.getInstantDate();
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
                                    FieldDataValue zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63 = DBS13ReportUtil.retrieveFieldDataForElement(field.getTaxonomyVersion(), zeroFilingInfo_Layout1TaxonomyVersionMap64);
    
                                    if(zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63 != null ) {
                                        if(!zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getStartDate();
                                        if(!zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getEndDate();
                                        if(!zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1TaxonomyVersionFieldDataValue63.getInstantDate();
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
                                    FieldDataValue zeroFilingInfo_Layout1ToolNameFieldDataValue69 = DBS13ReportUtil.retrieveFieldDataForElement(field.getToolName(), zeroFilingInfo_Layout1ToolNameMap70);
    
                                    if(zeroFilingInfo_Layout1ToolNameFieldDataValue69 != null ) {
                                        if(!zeroFilingInfo_Layout1ToolNameFieldDataValue69.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ToolNameFieldDataValue69.getStartDate();
                                        if(!zeroFilingInfo_Layout1ToolNameFieldDataValue69.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ToolNameFieldDataValue69.getEndDate();
                                        if(!zeroFilingInfo_Layout1ToolNameFieldDataValue69.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ToolNameFieldDataValue69.getInstantDate();
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
                                    FieldDataValue zeroFilingInfo_Layout1ToolVersionFieldDataValue75 = DBS13ReportUtil.retrieveFieldDataForElement(field.getToolVersion(), zeroFilingInfo_Layout1ToolVersionMap76);
    
                                    if(zeroFilingInfo_Layout1ToolVersionFieldDataValue75 != null ) {
                                        if(!zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getStartDate();
                                        if(!zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getEndDate();
                                        if(!zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ToolVersionFieldDataValue75.getInstantDate();
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
                                    FieldDataValue zeroFilingInfo_Layout1ReportStatusFieldDataValue81 = DBS13ReportUtil.retrieveFieldDataForElement(field.getReportStatus(), zeroFilingInfo_Layout1ReportStatusMap82);
    
                                    if(zeroFilingInfo_Layout1ReportStatusFieldDataValue81 != null ) {
                                        if(!zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getStartDate();
                                        if(!zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getEndDate();
                                        if(!zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1ReportStatusFieldDataValue81.getInstantDate();
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
                                    FieldDataValue zeroFilingInfo_Layout1DateOfAuditFieldDataValue87 = DBS13ReportUtil.retrieveFieldDataForElement(field.getDateOfAudit(), zeroFilingInfo_Layout1DateOfAuditMap88);
    
                                    if(zeroFilingInfo_Layout1DateOfAuditFieldDataValue87 != null ) {
                                        if(!zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getStartDate();
                                        if(!zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getEndDate();
                                        if(!zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1DateOfAuditFieldDataValue87.getInstantDate();
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
                                    FieldDataValue zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93 = DBS13ReportUtil.retrieveFieldDataForElement(field.getGeneralRemarks(), zeroFilingInfo_Layout1GeneralRemarksMap94);
    
                                    if(zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93 != null ) {
                                        if(!zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getStartDate();
                                        if(!zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getEndDate();
                                        if(!zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout1GeneralRemarksFieldDataValue93.getInstantDate();
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
                                    FieldDataValue zeroFilingInfo_Layout2WhetherBankHasSubsidiariesFieldDataValue99 = DBS13ReportUtil.retrieveFieldDataForElement(field.getWhetherBankHasSubsidiaries(), zeroFilingInfo_Layout2WhetherBankHasSubsidiariesMap100);
    
                                    if(zeroFilingInfo_Layout2WhetherBankHasSubsidiariesFieldDataValue99 != null ) {
                                        if(!zeroFilingInfo_Layout2WhetherBankHasSubsidiariesFieldDataValue99.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroFilingInfo_Layout2WhetherBankHasSubsidiariesFieldDataValue99.getStartDate();
                                        if(!zeroFilingInfo_Layout2WhetherBankHasSubsidiariesFieldDataValue99.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroFilingInfo_Layout2WhetherBankHasSubsidiariesFieldDataValue99.getEndDate();
                                        if(!zeroFilingInfo_Layout2WhetherBankHasSubsidiariesFieldDataValue99.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroFilingInfo_Layout2WhetherBankHasSubsidiariesFieldDataValue99.getInstantDate();
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
                                    FieldDataValue zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalFieldDataValue106 = DBS13ReportUtil.retrieveFieldDataForElement(field.getTier1Capital(), zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalMap107);
    
                                    if(zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalFieldDataValue106 != null ) {
                                        if(!zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalFieldDataValue106.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalFieldDataValue106.getStartDate();
                                        if(!zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalFieldDataValue106.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalFieldDataValue106.getEndDate();
                                        if(!zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalFieldDataValue106.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalFieldDataValue106.getInstantDate();
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
                        
                            // create xbrl report element
                            
                                // start create element for report of DBS_LEF_A_20LE_Standalone_Layout2
                                // create unit if not empty
                                
                                    
                                    Unit INR110 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR110 = createUnitIfNotExist(INR110, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExposureAmount
                                
                                    Map zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountMap114 = new HashMap<String, String>();
                                    
                                    
                                            
                                            
                                            zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountMap114.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountMap114.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:LargestTwentyExposuresMember");
                                        
                                        
                                        String zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountValue112 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountMap114);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountFieldDataValue113 = DBS13ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountMap114);

                                        if(zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountFieldDataValue113 != null ) {
                                            if(!zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountFieldDataValue113.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountFieldDataValue113.getStartDate();
                                            if(!zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountFieldDataValue113.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountFieldDataValue113.getEndDate();
                                            if(!zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountFieldDataValue113.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountFieldDataValue113.getInstantDate();
                                        }
                                        
                                        
                                                Context DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountContext111 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_A_20LE_Standalone_Layout2( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountMap114 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountValue112 != null && !"".equals(zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountValue112)) {
                                        
                                        addContext(DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountContext111, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exposureAmountValue115 = new MonetaryItemType();
                                        exposureAmountValue115.setContextRef(DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountContext111);
                                        
                                            exposureAmountValue115.setUnitRef(INR110);
                                            exposureAmountValue115.setDecimals("INF");
                                            exposureAmountValue115.setValue(new BigDecimal(zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountValue112));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exposureAmountElement116 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue115);
                                        bodyElements.add(exposureAmountElement116);
                                    }
                                
                            
                            
                                // start create element for report of DBS_LEF_A_20LE_Standalone_Layout2
                                // create unit if not empty
                                
                                    
                                    Unit pure117 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure117 = createUnitIfNotExist(pure117, "PURE", "http://www.xbrl.org/2003/instance","pure", unitElements);
                                    
                                
                                
                                // - PercentageOfExposureToTier1Capital
                                
                                    Map zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalMap121 = new HashMap<String, String>();
                                    
                                    
                                            
                                            
                                            zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalMap121.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalMap121.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:LargestTwentyExposuresMember");
                                        
                                        
                                        String zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalValue119 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalMap121);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalFieldDataValue120 = DBS13ReportUtil.retrieveFieldDataForElement(field.getPercentageOfExposureToTier1Capital(), zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalMap121);

                                        if(zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalFieldDataValue120 != null ) {
                                            if(!zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalFieldDataValue120.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalFieldDataValue120.getStartDate();
                                            if(!zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalFieldDataValue120.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalFieldDataValue120.getEndDate();
                                            if(!zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalFieldDataValue120.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalFieldDataValue120.getInstantDate();
                                        }
                                        
                                        
                                                Context DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalContext118 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_A_20LE_Standalone_Layout2( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalMap121 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalValue119 != null && !"".equals(zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalValue119)) {
                                        
                                        addContext(DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalContext118, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        PercentItemType percentageOfExposureToTier1CapitalValue122 = new PercentItemType();
                                        percentageOfExposureToTier1CapitalValue122.setContextRef(DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalContext118);
                                        
                                            percentageOfExposureToTier1CapitalValue122.setUnitRef(pure117);
                                            percentageOfExposureToTier1CapitalValue122.setDecimals("INF");
                                            percentageOfExposureToTier1CapitalValue122.setValue(new BigDecimal(zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalValue119));
                                        
                                        
                                        JAXBElement<PercentItemType> percentageOfExposureToTier1CapitalElement123 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(percentageOfExposureToTier1CapitalValue122);
                                        bodyElements.add(percentageOfExposureToTier1CapitalElement123);
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
                        
                            // create xbrl report element
                            
                                // start create element for report of DBS_LEF_B_SpecExp_Standalone_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR124 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR124 = createUnitIfNotExist(INR124, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExposureAmount
                                
                                    Map zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountMap128 = new HashMap<String, String>();
                                    
                                    
                                            
                                            
                                            zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountMap128.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountMap128.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExposuresEqualToOrAboveSpecifiedPercentageOfTier1CapitalMember");
                                        
                                        
                                        String zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountValue126 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountMap128);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountFieldDataValue127 = DBS13ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountMap128);

                                        if(zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountFieldDataValue127 != null ) {
                                            if(!zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountFieldDataValue127.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountFieldDataValue127.getStartDate();
                                            if(!zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountFieldDataValue127.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountFieldDataValue127.getEndDate();
                                            if(!zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountFieldDataValue127.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountFieldDataValue127.getInstantDate();
                                        }
                                        
                                        
                                                Context DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountContext125 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_B_SpecExp_Standalone_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountMap128 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountValue126 != null && !"".equals(zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountValue126)) {
                                        
                                        addContext(DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountContext125, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exposureAmountValue129 = new MonetaryItemType();
                                        exposureAmountValue129.setContextRef(DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountContext125);
                                        
                                            exposureAmountValue129.setUnitRef(INR124);
                                            exposureAmountValue129.setDecimals("INF");
                                            exposureAmountValue129.setValue(new BigDecimal(zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountValue126));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exposureAmountElement130 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue129);
                                        bodyElements.add(exposureAmountElement130);
                                    }
                                
                            
                            
                                // start create element for report of DBS_LEF_B_SpecExp_Standalone_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit pure131 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure131 = createUnitIfNotExist(pure131, "PURE", "http://www.xbrl.org/2003/instance","pure", unitElements);
                                    
                                
                                
                                // - PercentageOfExposureToTier1Capital
                                
                                    Map zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap135 = new HashMap<String, String>();
                                    
                                    
                                            
                                            
                                            zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap135.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap135.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExposuresEqualToOrAboveSpecifiedPercentageOfTier1CapitalMember");
                                        
                                        
                                        String zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalValue133 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap135);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalFieldDataValue134 = DBS13ReportUtil.retrieveFieldDataForElement(field.getPercentageOfExposureToTier1Capital(), zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap135);

                                        if(zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalFieldDataValue134 != null ) {
                                            if(!zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalFieldDataValue134.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalFieldDataValue134.getStartDate();
                                            if(!zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalFieldDataValue134.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalFieldDataValue134.getEndDate();
                                            if(!zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalFieldDataValue134.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalFieldDataValue134.getInstantDate();
                                        }
                                        
                                        
                                                Context DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalContext132 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_B_SpecExp_Standalone_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap135 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalValue133 != null && !"".equals(zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalValue133)) {
                                        
                                        addContext(DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalContext132, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        PercentItemType percentageOfExposureToTier1CapitalValue136 = new PercentItemType();
                                        percentageOfExposureToTier1CapitalValue136.setContextRef(DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalContext132);
                                        
                                            percentageOfExposureToTier1CapitalValue136.setUnitRef(pure131);
                                            percentageOfExposureToTier1CapitalValue136.setDecimals("INF");
                                            percentageOfExposureToTier1CapitalValue136.setValue(new BigDecimal(zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalValue133));
                                        
                                        
                                        JAXBElement<PercentItemType> percentageOfExposureToTier1CapitalElement137 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(percentageOfExposureToTier1CapitalValue136);
                                        bodyElements.add(percentageOfExposureToTier1CapitalElement137);
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
                        
                            // create xbrl report element
                            
                                // start create element for report of DBS_LEF_C_OthExp_Standalone_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR138 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR138 = createUnitIfNotExist(INR138, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExposureAmount
                                
                                    Map zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountMap142 = new HashMap<String, String>();
                                    
                                    
                                            
                                            
                                            zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountMap142.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountMap142.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:OtherExposuresMember");
                                        
                                        
                                        String zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountValue140 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountMap142);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountFieldDataValue141 = DBS13ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountMap142);

                                        if(zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountFieldDataValue141 != null ) {
                                            if(!zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountFieldDataValue141.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountFieldDataValue141.getStartDate();
                                            if(!zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountFieldDataValue141.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountFieldDataValue141.getEndDate();
                                            if(!zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountFieldDataValue141.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountFieldDataValue141.getInstantDate();
                                        }
                                        
                                        
                                                Context DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountContext139 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_C_OthExp_Standalone_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountMap142 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountValue140 != null && !"".equals(zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountValue140)) {
                                        
                                        addContext(DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountContext139, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exposureAmountValue143 = new MonetaryItemType();
                                        exposureAmountValue143.setContextRef(DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountContext139);
                                        
                                            exposureAmountValue143.setUnitRef(INR138);
                                            exposureAmountValue143.setDecimals("INF");
                                            exposureAmountValue143.setValue(new BigDecimal(zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountValue140));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exposureAmountElement144 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue143);
                                        bodyElements.add(exposureAmountElement144);
                                    }
                                
                            
                            
                                // start create element for report of DBS_LEF_C_OthExp_Standalone_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit pure145 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure145 = createUnitIfNotExist(pure145, "PURE", "http://www.xbrl.org/2003/instance","pure", unitElements);
                                    
                                
                                
                                // - PercentageOfExposureToTier1Capital
                                
                                    Map zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap149 = new HashMap<String, String>();
                                    
                                    
                                            
                                            
                                            zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap149.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap149.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:OtherExposuresMember");
                                        
                                        
                                        String zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalValue147 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap149);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalFieldDataValue148 = DBS13ReportUtil.retrieveFieldDataForElement(field.getPercentageOfExposureToTier1Capital(), zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap149);

                                        if(zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalFieldDataValue148 != null ) {
                                            if(!zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalFieldDataValue148.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalFieldDataValue148.getStartDate();
                                            if(!zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalFieldDataValue148.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalFieldDataValue148.getEndDate();
                                            if(!zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalFieldDataValue148.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalFieldDataValue148.getInstantDate();
                                        }
                                        
                                        
                                                Context DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalContext146 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_C_OthExp_Standalone_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap149 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalValue147 != null && !"".equals(zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalValue147)) {
                                        
                                        addContext(DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalContext146, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        PercentItemType percentageOfExposureToTier1CapitalValue150 = new PercentItemType();
                                        percentageOfExposureToTier1CapitalValue150.setContextRef(DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalContext146);
                                        
                                            percentageOfExposureToTier1CapitalValue150.setUnitRef(pure145);
                                            percentageOfExposureToTier1CapitalValue150.setDecimals("INF");
                                            percentageOfExposureToTier1CapitalValue150.setValue(new BigDecimal(zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalValue147));
                                        
                                        
                                        JAXBElement<PercentItemType> percentageOfExposureToTier1CapitalElement151 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(percentageOfExposureToTier1CapitalValue150);
                                        bodyElements.add(percentageOfExposureToTier1CapitalElement151);
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
                        
                            // create xbrl report element
                            
                                // start create element for report of DBS_LEF_D_ExempExp_Standalone_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR152 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR152 = createUnitIfNotExist(INR152, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExposureAmount
                                
                                    Map zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountMap156 = new HashMap<String, String>();
                                    
                                    
                                            
                                            
                                            zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountMap156.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountMap156.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExemptedExposuresMember");
                                        
                                        
                                        String zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountValue154 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountMap156);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountFieldDataValue155 = DBS13ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountMap156);

                                        if(zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountFieldDataValue155 != null ) {
                                            if(!zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountFieldDataValue155.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountFieldDataValue155.getStartDate();
                                            if(!zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountFieldDataValue155.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountFieldDataValue155.getEndDate();
                                            if(!zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountFieldDataValue155.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountFieldDataValue155.getInstantDate();
                                        }
                                        
                                        
                                                Context DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountContext153 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_D_ExempExp_Standalone_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountMap156 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountValue154 != null && !"".equals(zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountValue154)) {
                                        
                                        addContext(DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountContext153, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exposureAmountValue157 = new MonetaryItemType();
                                        exposureAmountValue157.setContextRef(DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountContext153);
                                        
                                            exposureAmountValue157.setUnitRef(INR152);
                                            exposureAmountValue157.setDecimals("INF");
                                            exposureAmountValue157.setValue(new BigDecimal(zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountValue154));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exposureAmountElement158 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue157);
                                        bodyElements.add(exposureAmountElement158);
                                    }
                                
                            
                            
                                // start create element for report of DBS_LEF_D_ExempExp_Standalone_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit pure159 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure159 = createUnitIfNotExist(pure159, "PURE", "http://www.xbrl.org/2003/instance","pure", unitElements);
                                    
                                
                                
                                // - PercentageOfExposureToTier1Capital
                                
                                    Map zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap163 = new HashMap<String, String>();
                                    
                                    
                                            
                                            
                                            zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap163.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap163.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExemptedExposuresMember");
                                        
                                        
                                        String zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalValue161 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap163);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalFieldDataValue162 = DBS13ReportUtil.retrieveFieldDataForElement(field.getPercentageOfExposureToTier1Capital(), zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap163);

                                        if(zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalFieldDataValue162 != null ) {
                                            if(!zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalFieldDataValue162.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalFieldDataValue162.getStartDate();
                                            if(!zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalFieldDataValue162.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalFieldDataValue162.getEndDate();
                                            if(!zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalFieldDataValue162.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalFieldDataValue162.getInstantDate();
                                        }
                                        
                                        
                                                Context DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalContext160 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_D_ExempExp_Standalone_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap163 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalValue161 != null && !"".equals(zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalValue161)) {
                                        
                                        addContext(DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalContext160, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        PercentItemType percentageOfExposureToTier1CapitalValue164 = new PercentItemType();
                                        percentageOfExposureToTier1CapitalValue164.setContextRef(DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalContext160);
                                        
                                            percentageOfExposureToTier1CapitalValue164.setUnitRef(pure159);
                                            percentageOfExposureToTier1CapitalValue164.setDecimals("INF");
                                            percentageOfExposureToTier1CapitalValue164.setValue(new BigDecimal(zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalValue161));
                                        
                                        
                                        JAXBElement<PercentItemType> percentageOfExposureToTier1CapitalElement165 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(percentageOfExposureToTier1CapitalValue164);
                                        bodyElements.add(percentageOfExposureToTier1CapitalElement165);
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
                    
                    
                        
                        
                            
                                
                                Unit INR166 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR166 = createUnitIfNotExist(INR166, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - Tier1Capital
                            
                                Map zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalMap170 = new HashMap<String, String>();
                                
                                
                                
                                        
                                        
                                        zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalMap170.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                    
                                    String zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalValue168 = DBS13ReportUtil.retrieveValueForElement(field.getTier1Capital(), zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalMap170);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalFieldDataValue169 = DBS13ReportUtil.retrieveFieldDataForElement(field.getTier1Capital(), zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalMap170);
    
                                    if(zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalFieldDataValue169 != null ) {
                                        if(!zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalFieldDataValue169.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalFieldDataValue169.getStartDate();
                                        if(!zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalFieldDataValue169.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalFieldDataValue169.getEndDate();
                                        if(!zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalFieldDataValue169.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalFieldDataValue169.getInstantDate();
                                    }

                                    
                                            Context DBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalContext167 = DBS13ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalMap170 );
                                        
                                
                                if(zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalValue168 != null && !"".equals(zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalValue168)) {
                                    
                                    addContext(DBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalContext167, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType tier1CapitalValue171 = new MonetaryItemType();
                                    tier1CapitalValue171.setContextRef(DBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalContext167);
                                    
                                    tier1CapitalValue171.setUnitRef(INR166);
                                    tier1CapitalValue171.setDecimals("INF");
                                    tier1CapitalValue171.setValue(new BigDecimal(zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalValue168));
                                    
                                    
                                    JAXBElement<MonetaryItemType> tier1CapitalElement172 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createTier1Capital(tier1CapitalValue171);
                                    bodyElements.add(tier1CapitalElement172);
                                
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
                        
                            // create xbrl report element
                            
                                // start create element for report of DBS_LEF_A_20LE_Consolidated_Layout2
                                // create unit if not empty
                                
                                    
                                    Unit INR173 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR173 = createUnitIfNotExist(INR173, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExposureAmount
                                
                                    Map zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountMap177 = new HashMap<String, String>();
                                    
                                    
                                            
                                            
                                            zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountMap177.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountMap177.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:LargestTwentyExposuresMember");
                                        
                                        
                                        String zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountValue175 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountMap177);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountFieldDataValue176 = DBS13ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountMap177);

                                        if(zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountFieldDataValue176 != null ) {
                                            if(!zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountFieldDataValue176.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountFieldDataValue176.getStartDate();
                                            if(!zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountFieldDataValue176.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountFieldDataValue176.getEndDate();
                                            if(!zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountFieldDataValue176.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountFieldDataValue176.getInstantDate();
                                        }
                                        
                                        
                                                Context DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountContext174 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_A_20LE_Consolidated_Layout2( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountMap177 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountValue175 != null && !"".equals(zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountValue175)) {
                                        
                                        addContext(DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountContext174, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exposureAmountValue178 = new MonetaryItemType();
                                        exposureAmountValue178.setContextRef(DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountContext174);
                                        
                                            exposureAmountValue178.setUnitRef(INR173);
                                            exposureAmountValue178.setDecimals("INF");
                                            exposureAmountValue178.setValue(new BigDecimal(zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountValue175));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exposureAmountElement179 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue178);
                                        bodyElements.add(exposureAmountElement179);
                                    }
                                
                            
                            
                                // start create element for report of DBS_LEF_A_20LE_Consolidated_Layout2
                                // create unit if not empty
                                
                                    
                                    Unit pure180 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure180 = createUnitIfNotExist(pure180, "PURE", "http://www.xbrl.org/2003/instance","pure", unitElements);
                                    
                                
                                
                                // - PercentageOfExposureToTier1Capital
                                
                                    Map zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalMap184 = new HashMap<String, String>();
                                    
                                    
                                            
                                            
                                            zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalMap184.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalMap184.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:LargestTwentyExposuresMember");
                                        
                                        
                                        String zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalValue182 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalMap184);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalFieldDataValue183 = DBS13ReportUtil.retrieveFieldDataForElement(field.getPercentageOfExposureToTier1Capital(), zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalMap184);

                                        if(zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalFieldDataValue183 != null ) {
                                            if(!zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalFieldDataValue183.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalFieldDataValue183.getStartDate();
                                            if(!zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalFieldDataValue183.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalFieldDataValue183.getEndDate();
                                            if(!zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalFieldDataValue183.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalFieldDataValue183.getInstantDate();
                                        }
                                        
                                        
                                                Context DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalContext181 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_A_20LE_Consolidated_Layout2( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalMap184 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalValue182 != null && !"".equals(zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalValue182)) {
                                        
                                        addContext(DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalContext181, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        PercentItemType percentageOfExposureToTier1CapitalValue185 = new PercentItemType();
                                        percentageOfExposureToTier1CapitalValue185.setContextRef(DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalContext181);
                                        
                                            percentageOfExposureToTier1CapitalValue185.setUnitRef(pure180);
                                            percentageOfExposureToTier1CapitalValue185.setDecimals("INF");
                                            percentageOfExposureToTier1CapitalValue185.setValue(new BigDecimal(zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalValue182));
                                        
                                        
                                        JAXBElement<PercentItemType> percentageOfExposureToTier1CapitalElement186 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(percentageOfExposureToTier1CapitalValue185);
                                        bodyElements.add(percentageOfExposureToTier1CapitalElement186);
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
                        
                            // create xbrl report element
                            
                                // start create element for report of DBS_LEF_B_SpecExp_Consolidated_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR187 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR187 = createUnitIfNotExist(INR187, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExposureAmount
                                
                                    Map zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountMap191 = new HashMap<String, String>();
                                    
                                    
                                            
                                            
                                            zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountMap191.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountMap191.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExposuresEqualToOrAboveSpecifiedPercentageOfTier1CapitalMember");
                                        
                                        
                                        String zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountValue189 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountMap191);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountFieldDataValue190 = DBS13ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountMap191);

                                        if(zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountFieldDataValue190 != null ) {
                                            if(!zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountFieldDataValue190.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountFieldDataValue190.getStartDate();
                                            if(!zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountFieldDataValue190.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountFieldDataValue190.getEndDate();
                                            if(!zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountFieldDataValue190.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountFieldDataValue190.getInstantDate();
                                        }
                                        
                                        
                                                Context DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountContext188 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_B_SpecExp_Consolidated_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountMap191 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountValue189 != null && !"".equals(zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountValue189)) {
                                        
                                        addContext(DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountContext188, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exposureAmountValue192 = new MonetaryItemType();
                                        exposureAmountValue192.setContextRef(DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountContext188);
                                        
                                            exposureAmountValue192.setUnitRef(INR187);
                                            exposureAmountValue192.setDecimals("INF");
                                            exposureAmountValue192.setValue(new BigDecimal(zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountValue189));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exposureAmountElement193 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue192);
                                        bodyElements.add(exposureAmountElement193);
                                    }
                                
                            
                            
                                // start create element for report of DBS_LEF_B_SpecExp_Consolidated_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit pure194 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure194 = createUnitIfNotExist(pure194, "PURE", "http://www.xbrl.org/2003/instance","pure", unitElements);
                                    
                                
                                
                                // - PercentageOfExposureToTier1Capital
                                
                                    Map zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap198 = new HashMap<String, String>();
                                    
                                    
                                            
                                            
                                            zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap198.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap198.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExposuresEqualToOrAboveSpecifiedPercentageOfTier1CapitalMember");
                                        
                                        
                                        String zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalValue196 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap198);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalFieldDataValue197 = DBS13ReportUtil.retrieveFieldDataForElement(field.getPercentageOfExposureToTier1Capital(), zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap198);

                                        if(zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalFieldDataValue197 != null ) {
                                            if(!zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalFieldDataValue197.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalFieldDataValue197.getStartDate();
                                            if(!zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalFieldDataValue197.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalFieldDataValue197.getEndDate();
                                            if(!zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalFieldDataValue197.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalFieldDataValue197.getInstantDate();
                                        }
                                        
                                        
                                                Context DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalContext195 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_B_SpecExp_Consolidated_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap198 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalValue196 != null && !"".equals(zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalValue196)) {
                                        
                                        addContext(DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalContext195, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        PercentItemType percentageOfExposureToTier1CapitalValue199 = new PercentItemType();
                                        percentageOfExposureToTier1CapitalValue199.setContextRef(DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalContext195);
                                        
                                            percentageOfExposureToTier1CapitalValue199.setUnitRef(pure194);
                                            percentageOfExposureToTier1CapitalValue199.setDecimals("INF");
                                            percentageOfExposureToTier1CapitalValue199.setValue(new BigDecimal(zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalValue196));
                                        
                                        
                                        JAXBElement<PercentItemType> percentageOfExposureToTier1CapitalElement200 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(percentageOfExposureToTier1CapitalValue199);
                                        bodyElements.add(percentageOfExposureToTier1CapitalElement200);
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
                        
                            // create xbrl report element
                            
                                // start create element for report of DBS_LEF_C_OthExp_Consolidated_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR201 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR201 = createUnitIfNotExist(INR201, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExposureAmount
                                
                                    Map zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountMap205 = new HashMap<String, String>();
                                    
                                    
                                            
                                            
                                            zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountMap205.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountMap205.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:OtherExposuresMember");
                                        
                                        
                                        String zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountValue203 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountMap205);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountFieldDataValue204 = DBS13ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountMap205);

                                        if(zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountFieldDataValue204 != null ) {
                                            if(!zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountFieldDataValue204.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountFieldDataValue204.getStartDate();
                                            if(!zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountFieldDataValue204.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountFieldDataValue204.getEndDate();
                                            if(!zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountFieldDataValue204.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountFieldDataValue204.getInstantDate();
                                        }
                                        
                                        
                                                Context DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountContext202 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_C_OthExp_Consolidated_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountMap205 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountValue203 != null && !"".equals(zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountValue203)) {
                                        
                                        addContext(DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountContext202, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exposureAmountValue206 = new MonetaryItemType();
                                        exposureAmountValue206.setContextRef(DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountContext202);
                                        
                                            exposureAmountValue206.setUnitRef(INR201);
                                            exposureAmountValue206.setDecimals("INF");
                                            exposureAmountValue206.setValue(new BigDecimal(zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountValue203));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exposureAmountElement207 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue206);
                                        bodyElements.add(exposureAmountElement207);
                                    }
                                
                            
                            
                                // start create element for report of DBS_LEF_C_OthExp_Consolidated_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit pure208 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure208 = createUnitIfNotExist(pure208, "PURE", "http://www.xbrl.org/2003/instance","pure", unitElements);
                                    
                                
                                
                                // - PercentageOfExposureToTier1Capital
                                
                                    Map zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap212 = new HashMap<String, String>();
                                    
                                    
                                            
                                            
                                            zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap212.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap212.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:OtherExposuresMember");
                                        
                                        
                                        String zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalValue210 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap212);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalFieldDataValue211 = DBS13ReportUtil.retrieveFieldDataForElement(field.getPercentageOfExposureToTier1Capital(), zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap212);

                                        if(zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalFieldDataValue211 != null ) {
                                            if(!zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalFieldDataValue211.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalFieldDataValue211.getStartDate();
                                            if(!zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalFieldDataValue211.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalFieldDataValue211.getEndDate();
                                            if(!zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalFieldDataValue211.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalFieldDataValue211.getInstantDate();
                                        }
                                        
                                        
                                                Context DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalContext209 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_C_OthExp_Consolidated_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap212 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalValue210 != null && !"".equals(zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalValue210)) {
                                        
                                        addContext(DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalContext209, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        PercentItemType percentageOfExposureToTier1CapitalValue213 = new PercentItemType();
                                        percentageOfExposureToTier1CapitalValue213.setContextRef(DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalContext209);
                                        
                                            percentageOfExposureToTier1CapitalValue213.setUnitRef(pure208);
                                            percentageOfExposureToTier1CapitalValue213.setDecimals("INF");
                                            percentageOfExposureToTier1CapitalValue213.setValue(new BigDecimal(zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalValue210));
                                        
                                        
                                        JAXBElement<PercentItemType> percentageOfExposureToTier1CapitalElement214 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(percentageOfExposureToTier1CapitalValue213);
                                        bodyElements.add(percentageOfExposureToTier1CapitalElement214);
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
                        
                            // create xbrl report element
                            
                                // start create element for report of DBS_LEF_D_ExempExp_Consolidated_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR215 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR215 = createUnitIfNotExist(INR215, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExposureAmount
                                
                                    Map zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountMap219 = new HashMap<String, String>();
                                    
                                    
                                            
                                            
                                            zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountMap219.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountMap219.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExemptedExposuresMember");
                                        
                                        
                                        String zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountValue217 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountMap219);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountFieldDataValue218 = DBS13ReportUtil.retrieveFieldDataForElement(field.getExposureAmount(), zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountMap219);

                                        if(zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountFieldDataValue218 != null ) {
                                            if(!zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountFieldDataValue218.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountFieldDataValue218.getStartDate();
                                            if(!zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountFieldDataValue218.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountFieldDataValue218.getEndDate();
                                            if(!zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountFieldDataValue218.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountFieldDataValue218.getInstantDate();
                                        }
                                        
                                        
                                                Context DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountContext216 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_D_ExempExp_Consolidated_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountMap219 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountValue217 != null && !"".equals(zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountValue217)) {
                                        
                                        addContext(DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountContext216, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exposureAmountValue220 = new MonetaryItemType();
                                        exposureAmountValue220.setContextRef(DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountContext216);
                                        
                                            exposureAmountValue220.setUnitRef(INR215);
                                            exposureAmountValue220.setDecimals("INF");
                                            exposureAmountValue220.setValue(new BigDecimal(zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountValue217));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exposureAmountElement221 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue220);
                                        bodyElements.add(exposureAmountElement221);
                                    }
                                
                            
                            
                                // start create element for report of DBS_LEF_D_ExempExp_Consolidated_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit pure222 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure222 = createUnitIfNotExist(pure222, "PURE", "http://www.xbrl.org/2003/instance","pure", unitElements);
                                    
                                
                                
                                // - PercentageOfExposureToTier1Capital
                                
                                    Map zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap226 = new HashMap<String, String>();
                                    
                                    
                                            
                                            
                                            zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap226.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap226.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExemptedExposuresMember");
                                        
                                        
                                        String zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalValue224 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap226);
                                        startDate = startDateDefault;
                                        endDate = endDateDefault;
                                        periodDate = periodDateDefault;
                                        FieldDataValue zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalFieldDataValue225 = DBS13ReportUtil.retrieveFieldDataForElement(field.getPercentageOfExposureToTier1Capital(), zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap226);

                                        if(zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalFieldDataValue225 != null ) {
                                            if(!zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalFieldDataValue225.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalFieldDataValue225.getStartDate();
                                            if(!zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalFieldDataValue225.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalFieldDataValue225.getEndDate();
                                            if(!zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalFieldDataValue225.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalFieldDataValue225.getInstantDate();
                                        }
                                        
                                        
                                                Context DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalContext223 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_D_ExempExp_Consolidated_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap226 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalValue224 != null && !"".equals(zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalValue224)) {
                                        
                                        addContext(DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalContext223, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        PercentItemType percentageOfExposureToTier1CapitalValue227 = new PercentItemType();
                                        percentageOfExposureToTier1CapitalValue227.setContextRef(DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalContext223);
                                        
                                            percentageOfExposureToTier1CapitalValue227.setUnitRef(pure222);
                                            percentageOfExposureToTier1CapitalValue227.setDecimals("INF");
                                            percentageOfExposureToTier1CapitalValue227.setValue(new BigDecimal(zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalValue224));
                                        
                                        
                                        JAXBElement<PercentItemType> percentageOfExposureToTier1CapitalElement228 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(percentageOfExposureToTier1CapitalValue227);
                                        bodyElements.add(percentageOfExposureToTier1CapitalElement228);
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
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryMap232 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryValue230 = DBS13ReportUtil.retrieveValueForElement(field.getNameOfSignatory(), zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryMap232);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue231 = DBS13ReportUtil.retrieveFieldDataForElement(field.getNameOfSignatory(), zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryMap232);
    
                                    if(zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue231 != null ) {
                                        if(!zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue231.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue231.getStartDate();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue231.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue231.getEndDate();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue231.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryFieldDataValue231.getInstantDate();
                                    }

                                    
                                        Context DBS_AuthorisedSignatory_Layout1NameOfSignatoryContext229 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryValue230 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryValue230)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1NameOfSignatoryContext229, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType nameOfSignatoryValue233 = new StringItemType();
                                    nameOfSignatoryValue233.setContextRef(DBS_AuthorisedSignatory_Layout1NameOfSignatoryContext229);
                                    
                                    nameOfSignatoryValue233.setValue(zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryValue230);        
                                    
                                    
                                    JAXBElement<StringItemType> nameOfSignatoryElement234 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNameOfSignatory(nameOfSignatoryValue233);
                                    bodyElements.add(nameOfSignatoryElement234);
                                
                            }
                        
                            
                            // - DesignationOfSignatory
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryMap238 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryValue236 = DBS13ReportUtil.retrieveValueForElement(field.getDesignationOfSignatory(), zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryMap238);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue237 = DBS13ReportUtil.retrieveFieldDataForElement(field.getDesignationOfSignatory(), zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryMap238);
    
                                    if(zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue237 != null ) {
                                        if(!zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue237.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue237.getStartDate();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue237.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue237.getEndDate();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue237.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryFieldDataValue237.getInstantDate();
                                    }

                                    
                                        Context DBS_AuthorisedSignatory_Layout1DesignationOfSignatoryContext235 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryValue236 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryValue236)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1DesignationOfSignatoryContext235, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType designationOfSignatoryValue239 = new StringItemType();
                                    designationOfSignatoryValue239.setContextRef(DBS_AuthorisedSignatory_Layout1DesignationOfSignatoryContext235);
                                    
                                    designationOfSignatoryValue239.setValue(zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryValue236);        
                                    
                                    
                                    JAXBElement<StringItemType> designationOfSignatoryElement240 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createDesignationOfSignatory(designationOfSignatoryValue239);
                                    bodyElements.add(designationOfSignatoryElement240);
                                
                            }
                        
                            
                            // - AuthorisedSignatoryOfficialLandlineNumber
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberMap244 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue242 = DBS13ReportUtil.retrieveValueForElement(field.getAuthorisedSignatoryOfficialLandlineNumber(), zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberMap244);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue243 = DBS13ReportUtil.retrieveFieldDataForElement(field.getAuthorisedSignatoryOfficialLandlineNumber(), zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberMap244);
    
                                    if(zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue243 != null ) {
                                        if(!zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue243.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue243.getStartDate();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue243.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue243.getEndDate();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue243.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberFieldDataValue243.getInstantDate();
                                    }

                                    
                                        Context DBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext241 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue242 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue242)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext241, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType authorisedSignatoryOfficialLandlineNumberValue245 = new StringItemType();
                                    authorisedSignatoryOfficialLandlineNumberValue245.setContextRef(DBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext241);
                                    
                                    authorisedSignatoryOfficialLandlineNumberValue245.setValue(zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue242);        
                                    
                                    
                                    JAXBElement<StringItemType> authorisedSignatoryOfficialLandlineNumberElement246 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createAuthorisedSignatoryOfficialLandlineNumber(authorisedSignatoryOfficialLandlineNumberValue245);
                                    bodyElements.add(authorisedSignatoryOfficialLandlineNumberElement246);
                                
                            }
                        
                            
                            // - MobileNumberOfAuthorisedSignatory
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryMap250 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue248 = DBS13ReportUtil.retrieveValueForElement(field.getMobileNumberOfAuthorisedSignatory(), zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryMap250);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue249 = DBS13ReportUtil.retrieveFieldDataForElement(field.getMobileNumberOfAuthorisedSignatory(), zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryMap250);
    
                                    if(zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue249 != null ) {
                                        if(!zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue249.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue249.getStartDate();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue249.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue249.getEndDate();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue249.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryFieldDataValue249.getInstantDate();
                                    }

                                    
                                        Context DBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext247 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue248 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue248)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext247, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType mobileNumberOfAuthorisedSignatoryValue251 = new StringItemType();
                                    mobileNumberOfAuthorisedSignatoryValue251.setContextRef(DBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext247);
                                    
                                    mobileNumberOfAuthorisedSignatoryValue251.setValue(zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue248);        
                                    
                                    
                                    JAXBElement<StringItemType> mobileNumberOfAuthorisedSignatoryElement252 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createMobileNumberOfAuthorisedSignatory(mobileNumberOfAuthorisedSignatoryValue251);
                                    bodyElements.add(mobileNumberOfAuthorisedSignatoryElement252);
                                
                            }
                        
                            
                            // - EMailIDOfAuthorisedReportingOfficial
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialMap256 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue254 = DBS13ReportUtil.retrieveValueForElement(field.getEMailIDOfAuthorisedReportingOfficial(), zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialMap256);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue255 = DBS13ReportUtil.retrieveFieldDataForElement(field.getEMailIDOfAuthorisedReportingOfficial(), zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialMap256);
    
                                    if(zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue255 != null ) {
                                        if(!zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue255.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue255.getStartDate();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue255.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue255.getEndDate();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue255.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialFieldDataValue255.getInstantDate();
                                    }

                                    
                                        Context DBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext253 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue254 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue254)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext253, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType eMailIDOfAuthorisedReportingOfficialValue257 = new StringItemType();
                                    eMailIDOfAuthorisedReportingOfficialValue257.setContextRef(DBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext253);
                                    
                                    eMailIDOfAuthorisedReportingOfficialValue257.setValue(zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue254);        
                                    
                                    
                                    JAXBElement<StringItemType> eMailIDOfAuthorisedReportingOfficialElement258 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createEMailIDOfAuthorisedReportingOfficial(eMailIDOfAuthorisedReportingOfficialValue257);
                                    bodyElements.add(eMailIDOfAuthorisedReportingOfficialElement258);
                                
                            }
                        
                            
                            // - Remarks
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1RemarksMap262 = new HashMap<String, String>();
                                
                                
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1RemarksValue260 = DBS13ReportUtil.retrieveValueForElement(field.getRemarks(), zeroDBS_AuthorisedSignatory_Layout1RemarksMap262);

                                    startDate = startDateDefault;
                                    endDate = endDateDefault;
                                    periodDate = periodDateDefault;
                                    FieldDataValue zeroDBS_AuthorisedSignatory_Layout1RemarksFieldDataValue261 = DBS13ReportUtil.retrieveFieldDataForElement(field.getRemarks(), zeroDBS_AuthorisedSignatory_Layout1RemarksMap262);
    
                                    if(zeroDBS_AuthorisedSignatory_Layout1RemarksFieldDataValue261 != null ) {
                                        if(!zeroDBS_AuthorisedSignatory_Layout1RemarksFieldDataValue261.getStartDate().equalsIgnoreCase("StartDate-Empty")) startDate = zeroDBS_AuthorisedSignatory_Layout1RemarksFieldDataValue261.getStartDate();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1RemarksFieldDataValue261.getEndDate().equalsIgnoreCase("EndDate-Empty")) endDate = zeroDBS_AuthorisedSignatory_Layout1RemarksFieldDataValue261.getEndDate();
                                        if(!zeroDBS_AuthorisedSignatory_Layout1RemarksFieldDataValue261.getInstantDate().equalsIgnoreCase("InstantDate-Empty")) periodDate = zeroDBS_AuthorisedSignatory_Layout1RemarksFieldDataValue261.getInstantDate();
                                    }

                                    
                                        Context DBS_AuthorisedSignatory_Layout1RemarksContext259 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1RemarksValue260 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1RemarksValue260)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1RemarksContext259, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType remarksValue263 = new StringItemType();
                                    remarksValue263.setContextRef(DBS_AuthorisedSignatory_Layout1RemarksContext259);
                                    
                                    remarksValue263.setValue(zeroDBS_AuthorisedSignatory_Layout1RemarksValue260);        
                                    
                                    
                                    JAXBElement<StringItemType> remarksElement264 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createRemarks(remarksValue263);
                                    bodyElements.add(remarksElement264);
                                
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
    
    

