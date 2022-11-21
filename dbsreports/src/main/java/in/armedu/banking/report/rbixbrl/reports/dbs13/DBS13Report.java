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
                
                    private String filingInfo_Layout1Method(FilingInfo_Layout1 filingInfo_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDate, String endDate, String periodDate)
                
                    {
            
                    FilingInfo_Layout1 field = filingInfo_Layout1;
                    
                    
                        
                        
                            
                            // - ReturnName
                            
                                Map zeroFilingInfo_Layout1ReturnNameMap3 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout1ReturnNameValue2 = DBS13ReportUtil.retrieveValueForElement(field.getReturnName(), zeroFilingInfo_Layout1ReturnNameMap3);

                                    
                                        Context FilingInfo_Layout1ReturnNameContext1 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1ReturnNameValue2 != null && !"".equals(zeroFilingInfo_Layout1ReturnNameValue2)) {
                                    
                                    addContext(FilingInfo_Layout1ReturnNameContext1, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType returnNameValue4 = new StringItemType();
                                    returnNameValue4.setContextRef(FilingInfo_Layout1ReturnNameContext1);
                                    
                                    returnNameValue4.setValue(zeroFilingInfo_Layout1ReturnNameValue2);        
                                    
                                    
                                    JAXBElement<StringItemType> returnNameElement5 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReturnName(returnNameValue4);
                                    bodyElements.add(returnNameElement5);
                                
                            }
                        
                            
                            // - ReturnCode
                            
                                Map zeroFilingInfo_Layout1ReturnCodeMap8 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout1ReturnCodeValue7 = DBS13ReportUtil.retrieveValueForElement(field.getReturnCode(), zeroFilingInfo_Layout1ReturnCodeMap8);

                                    
                                        Context FilingInfo_Layout1ReturnCodeContext6 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1ReturnCodeValue7 != null && !"".equals(zeroFilingInfo_Layout1ReturnCodeValue7)) {
                                    
                                    addContext(FilingInfo_Layout1ReturnCodeContext6, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType returnCodeValue9 = new StringItemType();
                                    returnCodeValue9.setContextRef(FilingInfo_Layout1ReturnCodeContext6);
                                    
                                    returnCodeValue9.setValue(zeroFilingInfo_Layout1ReturnCodeValue7);        
                                    
                                    
                                    JAXBElement<StringItemType> returnCodeElement10 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReturnCode(returnCodeValue9);
                                    bodyElements.add(returnCodeElement10);
                                
                            }
                        
                            
                            // - NameOfReportingInstitution
                            
                                Map zeroFilingInfo_Layout1NameOfReportingInstitutionMap13 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout1NameOfReportingInstitutionValue12 = DBS13ReportUtil.retrieveValueForElement(field.getNameOfReportingInstitution(), zeroFilingInfo_Layout1NameOfReportingInstitutionMap13);

                                    
                                        Context FilingInfo_Layout1NameOfReportingInstitutionContext11 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1NameOfReportingInstitutionValue12 != null && !"".equals(zeroFilingInfo_Layout1NameOfReportingInstitutionValue12)) {
                                    
                                    addContext(FilingInfo_Layout1NameOfReportingInstitutionContext11, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType nameOfReportingInstitutionValue14 = new StringItemType();
                                    nameOfReportingInstitutionValue14.setContextRef(FilingInfo_Layout1NameOfReportingInstitutionContext11);
                                    
                                    nameOfReportingInstitutionValue14.setValue(zeroFilingInfo_Layout1NameOfReportingInstitutionValue12);        
                                    
                                    
                                    JAXBElement<StringItemType> nameOfReportingInstitutionElement15 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNameOfReportingInstitution(nameOfReportingInstitutionValue14);
                                    bodyElements.add(nameOfReportingInstitutionElement15);
                                
                            }
                        
                            
                            // - BankCode
                            
                                Map zeroFilingInfo_Layout1BankCodeMap18 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout1BankCodeValue17 = DBS13ReportUtil.retrieveValueForElement(field.getBankCode(), zeroFilingInfo_Layout1BankCodeMap18);

                                    
                                    Context FilingInfo_Layout1BankCodeContext16 = DBS13ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout1BankCodeValue17 != null && !"".equals(zeroFilingInfo_Layout1BankCodeValue17)) {
                                    
                                    addContext(FilingInfo_Layout1BankCodeContext16, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType bankCodeValue19 = new StringItemType();
                                    bankCodeValue19.setContextRef(FilingInfo_Layout1BankCodeContext16);
                                    
                                    bankCodeValue19.setValue(zeroFilingInfo_Layout1BankCodeValue17);        
                                    
                                    
                                    JAXBElement<StringItemType> bankCodeElement20 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createBankCode(bankCodeValue19);
                                    bodyElements.add(bankCodeElement20);
                                
                            }
                        
                            
                            // - InstitutionType
                            
                                Map zeroFilingInfo_Layout1InstitutionTypeMap23 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout1InstitutionTypeValue22 = DBS13ReportUtil.retrieveValueForElement(field.getInstitutionType(), zeroFilingInfo_Layout1InstitutionTypeMap23);

                                    
                                        Context FilingInfo_Layout1InstitutionTypeContext21 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1InstitutionTypeValue22 != null && !"".equals(zeroFilingInfo_Layout1InstitutionTypeValue22)) {
                                    
                                    addContext(FilingInfo_Layout1InstitutionTypeContext21, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType institutionTypeValue24 = new StringItemType();
                                    institutionTypeValue24.setContextRef(FilingInfo_Layout1InstitutionTypeContext21);
                                    
                                    institutionTypeValue24.setValue(zeroFilingInfo_Layout1InstitutionTypeValue22);        
                                    
                                    
                                    JAXBElement<StringItemType> institutionTypeElement25 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createInstitutionType(institutionTypeValue24);
                                    bodyElements.add(institutionTypeElement25);
                                
                            }
                        
                            
                            // - ReportingFrequency
                            
                                Map zeroFilingInfo_Layout1ReportingFrequencyMap28 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingFrequencyValue27 = DBS13ReportUtil.retrieveValueForElement(field.getReportingFrequency(), zeroFilingInfo_Layout1ReportingFrequencyMap28);

                                    
                                        Context FilingInfo_Layout1ReportingFrequencyContext26 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1ReportingFrequencyValue27 != null && !"".equals(zeroFilingInfo_Layout1ReportingFrequencyValue27)) {
                                    
                                    addContext(FilingInfo_Layout1ReportingFrequencyContext26, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType reportingFrequencyValue29 = new StringItemType();
                                    reportingFrequencyValue29.setContextRef(FilingInfo_Layout1ReportingFrequencyContext26);
                                    
                                    reportingFrequencyValue29.setValue(zeroFilingInfo_Layout1ReportingFrequencyValue27);        
                                    
                                    
                                    JAXBElement<StringItemType> reportingFrequencyElement30 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReportingFrequency(reportingFrequencyValue29);
                                    bodyElements.add(reportingFrequencyElement30);
                                
                            }
                        
                            
                            // - ReportingPeriodStartDate
                            
                                Map zeroFilingInfo_Layout1ReportingPeriodStartDateMap33 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingPeriodStartDateValue32 = DBS13ReportUtil.retrieveValueForElement(field.getReportingPeriodStartDate(), zeroFilingInfo_Layout1ReportingPeriodStartDateMap33);

                                    
                                    Context FilingInfo_Layout1ReportingPeriodStartDateContext31 = DBS13ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout1ReportingPeriodStartDateValue32 != null && !"".equals(zeroFilingInfo_Layout1ReportingPeriodStartDateValue32)) {
                                    
                                    addContext(FilingInfo_Layout1ReportingPeriodStartDateContext31, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    DateItemType reportingPeriodStartDateValue34 = new DateItemType();
                                    reportingPeriodStartDateValue34.setContextRef(FilingInfo_Layout1ReportingPeriodStartDateContext31);
                                    
                                    reportingPeriodStartDateValue34.setValue(DBS13ReportContextUtil.toXMLGeo(zeroFilingInfo_Layout1ReportingPeriodStartDateValue32));
                                    
                                    
                                    JAXBElement<DateItemType> reportingPeriodStartDateElement35 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReportingPeriodStartDate(reportingPeriodStartDateValue34);
                                    bodyElements.add(reportingPeriodStartDateElement35);
                                
                            }
                        
                            
                            // - ReportingPeriodEndDate
                            
                                Map zeroFilingInfo_Layout1ReportingPeriodEndDateMap38 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingPeriodEndDateValue37 = DBS13ReportUtil.retrieveValueForElement(field.getReportingPeriodEndDate(), zeroFilingInfo_Layout1ReportingPeriodEndDateMap38);

                                    
                                    Context FilingInfo_Layout1ReportingPeriodEndDateContext36 = DBS13ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout1ReportingPeriodEndDateValue37 != null && !"".equals(zeroFilingInfo_Layout1ReportingPeriodEndDateValue37)) {
                                    
                                    addContext(FilingInfo_Layout1ReportingPeriodEndDateContext36, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    DateItemType reportingPeriodEndDateValue39 = new DateItemType();
                                    reportingPeriodEndDateValue39.setContextRef(FilingInfo_Layout1ReportingPeriodEndDateContext36);
                                    
                                    reportingPeriodEndDateValue39.setValue(DBS13ReportContextUtil.toXMLGeo(zeroFilingInfo_Layout1ReportingPeriodEndDateValue37));
                                    
                                    
                                    JAXBElement<DateItemType> reportingPeriodEndDateElement40 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReportingPeriodEndDate(reportingPeriodEndDateValue39);
                                    bodyElements.add(reportingPeriodEndDateElement40);
                                
                            }
                        
                            
                            // - ReportingCurrency
                            
                                Map zeroFilingInfo_Layout1ReportingCurrencyMap43 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingCurrencyValue42 = DBS13ReportUtil.retrieveValueForElement(field.getReportingCurrency(), zeroFilingInfo_Layout1ReportingCurrencyMap43);

                                    
                                        Context FilingInfo_Layout1ReportingCurrencyContext41 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1ReportingCurrencyValue42 != null && !"".equals(zeroFilingInfo_Layout1ReportingCurrencyValue42)) {
                                    
                                    addContext(FilingInfo_Layout1ReportingCurrencyContext41, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType reportingCurrencyValue44 = new StringItemType();
                                    reportingCurrencyValue44.setContextRef(FilingInfo_Layout1ReportingCurrencyContext41);
                                    
                                    reportingCurrencyValue44.setValue(zeroFilingInfo_Layout1ReportingCurrencyValue42);        
                                    
                                    
                                    JAXBElement<StringItemType> reportingCurrencyElement45 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createReportingCurrency(reportingCurrencyValue44);
                                    bodyElements.add(reportingCurrencyElement45);
                                
                            }
                        
                            
                            // - ReportingScale
                            
                                Map zeroFilingInfo_Layout1ReportingScaleMap48 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingScaleValue47 = DBS13ReportUtil.retrieveValueForElement(field.getReportingScale(), zeroFilingInfo_Layout1ReportingScaleMap48);

                                    
                                        Context FilingInfo_Layout1ReportingScaleContext46 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1ReportingScaleValue47 != null && !"".equals(zeroFilingInfo_Layout1ReportingScaleValue47)) {
                                    
                                    addContext(FilingInfo_Layout1ReportingScaleContext46, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    ReportingScale reportingScaleValue49 = new ReportingScale();
                                    reportingScaleValue49.setContextRef(FilingInfo_Layout1ReportingScaleContext46);
                                    
                                    reportingScaleValue49.setValue(zeroFilingInfo_Layout1ReportingScaleValue47);        
                                    
                                    
                                    JAXBElement<ReportingScale> reportingScaleElement50 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createReportingScale(reportingScaleValue49);
                                    bodyElements.add(reportingScaleElement50);
                                
                            }
                        
                            
                            // - TaxonomyVersion
                            
                                Map zeroFilingInfo_Layout1TaxonomyVersionMap53 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout1TaxonomyVersionValue52 = DBS13ReportUtil.retrieveValueForElement(field.getTaxonomyVersion(), zeroFilingInfo_Layout1TaxonomyVersionMap53);

                                    
                                        Context FilingInfo_Layout1TaxonomyVersionContext51 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1TaxonomyVersionValue52 != null && !"".equals(zeroFilingInfo_Layout1TaxonomyVersionValue52)) {
                                    
                                    addContext(FilingInfo_Layout1TaxonomyVersionContext51, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType taxonomyVersionValue54 = new StringItemType();
                                    taxonomyVersionValue54.setContextRef(FilingInfo_Layout1TaxonomyVersionContext51);
                                    
                                    taxonomyVersionValue54.setValue(zeroFilingInfo_Layout1TaxonomyVersionValue52);        
                                    
                                    
                                    JAXBElement<StringItemType> taxonomyVersionElement55 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTaxonomyVersion(taxonomyVersionValue54);
                                    bodyElements.add(taxonomyVersionElement55);
                                
                            }
                        
                            
                            // - ToolName
                            
                                Map zeroFilingInfo_Layout1ToolNameMap58 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout1ToolNameValue57 = DBS13ReportUtil.retrieveValueForElement(field.getToolName(), zeroFilingInfo_Layout1ToolNameMap58);

                                    
                                        Context FilingInfo_Layout1ToolNameContext56 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1ToolNameValue57 != null && !"".equals(zeroFilingInfo_Layout1ToolNameValue57)) {
                                    
                                    addContext(FilingInfo_Layout1ToolNameContext56, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType toolNameValue59 = new StringItemType();
                                    toolNameValue59.setContextRef(FilingInfo_Layout1ToolNameContext56);
                                    
                                    toolNameValue59.setValue(zeroFilingInfo_Layout1ToolNameValue57);        
                                    
                                    
                                    JAXBElement<StringItemType> toolNameElement60 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createToolName(toolNameValue59);
                                    bodyElements.add(toolNameElement60);
                                
                            }
                        
                            
                            // - ToolVersion
                            
                                Map zeroFilingInfo_Layout1ToolVersionMap63 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout1ToolVersionValue62 = DBS13ReportUtil.retrieveValueForElement(field.getToolVersion(), zeroFilingInfo_Layout1ToolVersionMap63);

                                    
                                        Context FilingInfo_Layout1ToolVersionContext61 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1ToolVersionValue62 != null && !"".equals(zeroFilingInfo_Layout1ToolVersionValue62)) {
                                    
                                    addContext(FilingInfo_Layout1ToolVersionContext61, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType toolVersionValue64 = new StringItemType();
                                    toolVersionValue64.setContextRef(FilingInfo_Layout1ToolVersionContext61);
                                    
                                    toolVersionValue64.setValue(zeroFilingInfo_Layout1ToolVersionValue62);        
                                    
                                    
                                    JAXBElement<StringItemType> toolVersionElement65 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createToolVersion(toolVersionValue64);
                                    bodyElements.add(toolVersionElement65);
                                
                            }
                        
                            
                            // - ReportStatus
                            
                                Map zeroFilingInfo_Layout1ReportStatusMap68 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout1ReportStatusValue67 = DBS13ReportUtil.retrieveValueForElement(field.getReportStatus(), zeroFilingInfo_Layout1ReportStatusMap68);

                                    
                                        Context FilingInfo_Layout1ReportStatusContext66 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1ReportStatusValue67 != null && !"".equals(zeroFilingInfo_Layout1ReportStatusValue67)) {
                                    
                                    addContext(FilingInfo_Layout1ReportStatusContext66, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    ReportStatusItemType reportStatusValue69 = new ReportStatusItemType();
                                    reportStatusValue69.setContextRef(FilingInfo_Layout1ReportStatusContext66);
                                    
                                    reportStatusValue69.setValue(zeroFilingInfo_Layout1ReportStatusValue67);        
                                    
                                    
                                    JAXBElement<ReportStatusItemType> reportStatusElement70 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReportStatus(reportStatusValue69);
                                    bodyElements.add(reportStatusElement70);
                                
                            }
                        
                            
                            // - DateOfAudit
                            
                                Map zeroFilingInfo_Layout1DateOfAuditMap73 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout1DateOfAuditValue72 = DBS13ReportUtil.retrieveValueForElement(field.getDateOfAudit(), zeroFilingInfo_Layout1DateOfAuditMap73);

                                    
                                    Context FilingInfo_Layout1DateOfAuditContext71 = DBS13ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout1DateOfAuditValue72 != null && !"".equals(zeroFilingInfo_Layout1DateOfAuditValue72)) {
                                    
                                    addContext(FilingInfo_Layout1DateOfAuditContext71, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    DateItemType dateOfAuditValue74 = new DateItemType();
                                    dateOfAuditValue74.setContextRef(FilingInfo_Layout1DateOfAuditContext71);
                                    
                                    dateOfAuditValue74.setValue(DBS13ReportContextUtil.toXMLGeo(zeroFilingInfo_Layout1DateOfAuditValue72));
                                    
                                    
                                    JAXBElement<DateItemType> dateOfAuditElement75 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createDateOfAudit(dateOfAuditValue74);
                                    bodyElements.add(dateOfAuditElement75);
                                
                            }
                        
                            
                            // - GeneralRemarks
                            
                                Map zeroFilingInfo_Layout1GeneralRemarksMap78 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout1GeneralRemarksValue77 = DBS13ReportUtil.retrieveValueForElement(field.getGeneralRemarks(), zeroFilingInfo_Layout1GeneralRemarksMap78);

                                    
                                        Context FilingInfo_Layout1GeneralRemarksContext76 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout1GeneralRemarksValue77 != null && !"".equals(zeroFilingInfo_Layout1GeneralRemarksValue77)) {
                                    
                                    addContext(FilingInfo_Layout1GeneralRemarksContext76, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    TextBlockItemType generalRemarksValue79 = new TextBlockItemType();
                                    generalRemarksValue79.setContextRef(FilingInfo_Layout1GeneralRemarksContext76);
                                    
                                    generalRemarksValue79.setValue(zeroFilingInfo_Layout1GeneralRemarksValue77);        
                                    
                                    
                                    JAXBElement<TextBlockItemType> generalRemarksElement80 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createGeneralRemarks(generalRemarksValue79);
                                    bodyElements.add(generalRemarksElement80);
                                
                            }
                        
                        
                    
                    
            
                    
                    
                    
                    return "";
                    }

                
                    
                
                // if typemembers exist
                
                
                
                // create variable for subclass FilingInfo_Layout2 if any typeMembers then List or Single
                //FilingInfo_Layout2 filingInfo_Layout2 = mainReportData.getFilingInfo_Layout2();
                
                    private String filingInfo_Layout2Method(FilingInfo_Layout2 filingInfo_Layout2, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDate, String endDate, String periodDate)
                
                    {
            
                    FilingInfo_Layout2 field = filingInfo_Layout2;
                    
                    
                        
                        
                            
                            // - WhetherBankHasSubsidiaries
                            
                                Map zeroFilingInfo_Layout2WhetherBankHasSubsidiariesMap83 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout2WhetherBankHasSubsidiariesValue82 = DBS13ReportUtil.retrieveValueForElement(field.getWhetherBankHasSubsidiaries(), zeroFilingInfo_Layout2WhetherBankHasSubsidiariesMap83);

                                    
                                    Context FilingInfo_Layout2WhetherBankHasSubsidiariesContext81 = DBS13ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout2WhetherBankHasSubsidiariesValue82 != null && !"".equals(zeroFilingInfo_Layout2WhetherBankHasSubsidiariesValue82)) {
                                    
                                    addContext(FilingInfo_Layout2WhetherBankHasSubsidiariesContext81, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    BooleanItemType whetherBankHasSubsidiariesValue84 = new BooleanItemType();
                                    whetherBankHasSubsidiariesValue84.setContextRef(FilingInfo_Layout2WhetherBankHasSubsidiariesContext81);
                                    
                                        whetherBankHasSubsidiariesValue84.setValue(Boolean.getBoolean(zeroFilingInfo_Layout2WhetherBankHasSubsidiariesValue82));
                                    
                                    
                                    JAXBElement<BooleanItemType> whetherBankHasSubsidiariesElement85 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherBankHasSubsidiaries(whetherBankHasSubsidiariesValue84);
                                    bodyElements.add(whetherBankHasSubsidiariesElement85);
                                
                            }
                        
                        
                    
                    
            
                    
                    
                    
                    return "";
                    }

                
                    
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBS_LEF_A_20LE_Standalone_Layout1 if any typeMembers then List or Single
                //DBS_LEF_A_20LE_Standalone_Layout1 dBS_LEF_A_20LE_Standalone_Layout1 = mainReportData.getDBS_LEF_A_20LE_Standalone_Layout1();
                
                    private String dBS_LEF_A_20LE_Standalone_Layout1Method(DBS_LEF_A_20LE_Standalone_Layout1 dBS_LEF_A_20LE_Standalone_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDate, String endDate, String periodDate)
                
                    {
            
                    DBS_LEF_A_20LE_Standalone_Layout1 field = dBS_LEF_A_20LE_Standalone_Layout1;
                    
                    
                        
                        
                            
                                
                                Unit INR86 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR86 = createUnitIfNotExist(INR86, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - Tier1Capital
                            
                                Map zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalMap89 = new HashMap<String, String>();
                                
                                        
                                        
                                        zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalMap89.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                    
                                    
                                    String zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalValue88 = DBS13ReportUtil.retrieveValueForElement(field.getTier1Capital(), zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalMap89);

                                    
                                            Context DBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalContext87 = DBS13ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalMap89 );
                                        
                                
                                if(zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalValue88 != null && !"".equals(zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalValue88)) {
                                    
                                    addContext(DBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalContext87, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType tier1CapitalValue90 = new MonetaryItemType();
                                    tier1CapitalValue90.setContextRef(DBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalContext87);
                                    
                                    tier1CapitalValue90.setUnitRef(INR86);
                                    tier1CapitalValue90.setDecimals("INF");
                                    tier1CapitalValue90.setValue(new BigDecimal(zeroDBS_LEF_A_20LE_Standalone_Layout1Tier1CapitalValue88));
                                    
                                    
                                    JAXBElement<MonetaryItemType> tier1CapitalElement91 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createTier1Capital(tier1CapitalValue90);
                                    bodyElements.add(tier1CapitalElement91);
                                
                            }
                        
                        
                    
                    
            
                    
                    
                    
                    return "";
                    }

                
                    
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBS_LEF_A_20LE_Standalone_Layout2 if any typeMembers then List or Single
                //List<DBS_LEF_A_20LE_Standalone_Layout2> dBS_LEF_A_20LE_Standalone_Layout2 = mainReportData.getDBS_LEF_A_20LE_Standalone_Layout2();
                
                
                // if typemembers exist
                
                    private String dBS_LEF_A_20LE_Standalone_Layout2Method(List<DBS_LEF_A_20LE_Standalone_Layout2> dBS_LEF_A_20LE_Standalone_Layout2, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDate, String endDate, String periodDate)
                    {
                    dBS_LEF_A_20LE_Standalone_Layout2.forEach((field)->{
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
                                
                                    
                                    Unit INR92 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR92 = createUnitIfNotExist(INR92, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExposureAmount
                                
                                    Map zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountMap95 = new HashMap<String, String>();
                                    
                                            
                                            
                                            zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountMap95.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountMap95.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:LargestTwentyExposuresMember");
                                        
                                        
                                        String zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountValue94 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountMap95);

                                        
                                                Context DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountContext93 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_A_20LE_Standalone_Layout2( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountMap95 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountValue94 != null && !"".equals(zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountValue94)) {
                                        
                                        addContext(DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountContext93, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exposureAmountValue96 = new MonetaryItemType();
                                        exposureAmountValue96.setContextRef(DBS_LEF_A_20LE_Standalone_Layout2ExposureAmountContext93);
                                        
                                            exposureAmountValue96.setUnitRef(INR92);
                                            exposureAmountValue96.setDecimals("INF");
                                            exposureAmountValue96.setValue(new BigDecimal(zeroDBS_LEF_A_20LE_Standalone_Layout2ExposureAmountValue94));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exposureAmountElement97 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue96);
                                        bodyElements.add(exposureAmountElement97);
                                    }
                                
                            
                            
                                // start create element for report of DBS_LEF_A_20LE_Standalone_Layout2
                                // create unit if not empty
                                
                                    
                                    Unit pure98 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure98 = createUnitIfNotExist(pure98, "PURE", "http://www.xbrl.org/2003/instance","pure", unitElements);
                                    
                                
                                
                                // - PercentageOfExposureToTier1Capital
                                
                                    Map zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalMap101 = new HashMap<String, String>();
                                    
                                            
                                            
                                            zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalMap101.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalMap101.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:LargestTwentyExposuresMember");
                                        
                                        
                                        String zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalValue100 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalMap101);

                                        
                                                Context DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalContext99 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_A_20LE_Standalone_Layout2( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalMap101 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalValue100 != null && !"".equals(zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalValue100)) {
                                        
                                        addContext(DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalContext99, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        PercentItemType percentageOfExposureToTier1CapitalValue102 = new PercentItemType();
                                        percentageOfExposureToTier1CapitalValue102.setContextRef(DBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalContext99);
                                        
                                            percentageOfExposureToTier1CapitalValue102.setUnitRef(pure98);
                                            percentageOfExposureToTier1CapitalValue102.setDecimals("INF");
                                            percentageOfExposureToTier1CapitalValue102.setValue(new BigDecimal(zeroDBS_LEF_A_20LE_Standalone_Layout2PercentageOfExposureToTier1CapitalValue100));
                                        
                                        
                                        JAXBElement<PercentItemType> percentageOfExposureToTier1CapitalElement103 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(percentageOfExposureToTier1CapitalValue102);
                                        bodyElements.add(percentageOfExposureToTier1CapitalElement103);
                                    }
                                
                            
                            
                            
                        
                        
                
                        
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBS_LEF_B_SpecExp_Standalone_Layout1 if any typeMembers then List or Single
                //List<DBS_LEF_B_SpecExp_Standalone_Layout1> dBS_LEF_B_SpecExp_Standalone_Layout1 = mainReportData.getDBS_LEF_B_SpecExp_Standalone_Layout1();
                
                
                // if typemembers exist
                
                    private String dBS_LEF_B_SpecExp_Standalone_Layout1Method(List<DBS_LEF_B_SpecExp_Standalone_Layout1> dBS_LEF_B_SpecExp_Standalone_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDate, String endDate, String periodDate)
                    {
                    dBS_LEF_B_SpecExp_Standalone_Layout1.forEach((field)->{
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
                                
                                    
                                    Unit INR104 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR104 = createUnitIfNotExist(INR104, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExposureAmount
                                
                                    Map zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountMap107 = new HashMap<String, String>();
                                    
                                            
                                            
                                            zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountMap107.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountMap107.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExposuresEqualToOrAboveSpecifiedPercentageOfTier1CapitalMember");
                                        
                                        
                                        String zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountValue106 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountMap107);

                                        
                                                Context DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountContext105 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_B_SpecExp_Standalone_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountMap107 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountValue106 != null && !"".equals(zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountValue106)) {
                                        
                                        addContext(DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountContext105, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exposureAmountValue108 = new MonetaryItemType();
                                        exposureAmountValue108.setContextRef(DBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountContext105);
                                        
                                            exposureAmountValue108.setUnitRef(INR104);
                                            exposureAmountValue108.setDecimals("INF");
                                            exposureAmountValue108.setValue(new BigDecimal(zeroDBS_LEF_B_SpecExp_Standalone_Layout1ExposureAmountValue106));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exposureAmountElement109 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue108);
                                        bodyElements.add(exposureAmountElement109);
                                    }
                                
                            
                            
                                // start create element for report of DBS_LEF_B_SpecExp_Standalone_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit pure110 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure110 = createUnitIfNotExist(pure110, "PURE", "http://www.xbrl.org/2003/instance","pure", unitElements);
                                    
                                
                                
                                // - PercentageOfExposureToTier1Capital
                                
                                    Map zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap113 = new HashMap<String, String>();
                                    
                                            
                                            
                                            zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap113.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap113.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExposuresEqualToOrAboveSpecifiedPercentageOfTier1CapitalMember");
                                        
                                        
                                        String zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalValue112 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap113);

                                        
                                                Context DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalContext111 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_B_SpecExp_Standalone_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap113 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalValue112 != null && !"".equals(zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalValue112)) {
                                        
                                        addContext(DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalContext111, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        PercentItemType percentageOfExposureToTier1CapitalValue114 = new PercentItemType();
                                        percentageOfExposureToTier1CapitalValue114.setContextRef(DBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalContext111);
                                        
                                            percentageOfExposureToTier1CapitalValue114.setUnitRef(pure110);
                                            percentageOfExposureToTier1CapitalValue114.setDecimals("INF");
                                            percentageOfExposureToTier1CapitalValue114.setValue(new BigDecimal(zeroDBS_LEF_B_SpecExp_Standalone_Layout1PercentageOfExposureToTier1CapitalValue112));
                                        
                                        
                                        JAXBElement<PercentItemType> percentageOfExposureToTier1CapitalElement115 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(percentageOfExposureToTier1CapitalValue114);
                                        bodyElements.add(percentageOfExposureToTier1CapitalElement115);
                                    }
                                
                            
                            
                            
                        
                        
                
                        
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBS_LEF_C_OthExp_Standalone_Layout1 if any typeMembers then List or Single
                //List<DBS_LEF_C_OthExp_Standalone_Layout1> dBS_LEF_C_OthExp_Standalone_Layout1 = mainReportData.getDBS_LEF_C_OthExp_Standalone_Layout1();
                
                
                // if typemembers exist
                
                    private String dBS_LEF_C_OthExp_Standalone_Layout1Method(List<DBS_LEF_C_OthExp_Standalone_Layout1> dBS_LEF_C_OthExp_Standalone_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDate, String endDate, String periodDate)
                    {
                    dBS_LEF_C_OthExp_Standalone_Layout1.forEach((field)->{
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
                                
                                    
                                    Unit INR116 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR116 = createUnitIfNotExist(INR116, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExposureAmount
                                
                                    Map zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountMap119 = new HashMap<String, String>();
                                    
                                            
                                            
                                            zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountMap119.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountMap119.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:OtherExposuresMember");
                                        
                                        
                                        String zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountValue118 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountMap119);

                                        
                                                Context DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountContext117 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_C_OthExp_Standalone_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountMap119 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountValue118 != null && !"".equals(zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountValue118)) {
                                        
                                        addContext(DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountContext117, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exposureAmountValue120 = new MonetaryItemType();
                                        exposureAmountValue120.setContextRef(DBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountContext117);
                                        
                                            exposureAmountValue120.setUnitRef(INR116);
                                            exposureAmountValue120.setDecimals("INF");
                                            exposureAmountValue120.setValue(new BigDecimal(zeroDBS_LEF_C_OthExp_Standalone_Layout1ExposureAmountValue118));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exposureAmountElement121 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue120);
                                        bodyElements.add(exposureAmountElement121);
                                    }
                                
                            
                            
                                // start create element for report of DBS_LEF_C_OthExp_Standalone_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit pure122 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure122 = createUnitIfNotExist(pure122, "PURE", "http://www.xbrl.org/2003/instance","pure", unitElements);
                                    
                                
                                
                                // - PercentageOfExposureToTier1Capital
                                
                                    Map zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap125 = new HashMap<String, String>();
                                    
                                            
                                            
                                            zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap125.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap125.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:OtherExposuresMember");
                                        
                                        
                                        String zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalValue124 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap125);

                                        
                                                Context DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalContext123 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_C_OthExp_Standalone_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap125 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalValue124 != null && !"".equals(zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalValue124)) {
                                        
                                        addContext(DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalContext123, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        PercentItemType percentageOfExposureToTier1CapitalValue126 = new PercentItemType();
                                        percentageOfExposureToTier1CapitalValue126.setContextRef(DBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalContext123);
                                        
                                            percentageOfExposureToTier1CapitalValue126.setUnitRef(pure122);
                                            percentageOfExposureToTier1CapitalValue126.setDecimals("INF");
                                            percentageOfExposureToTier1CapitalValue126.setValue(new BigDecimal(zeroDBS_LEF_C_OthExp_Standalone_Layout1PercentageOfExposureToTier1CapitalValue124));
                                        
                                        
                                        JAXBElement<PercentItemType> percentageOfExposureToTier1CapitalElement127 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(percentageOfExposureToTier1CapitalValue126);
                                        bodyElements.add(percentageOfExposureToTier1CapitalElement127);
                                    }
                                
                            
                            
                            
                        
                        
                
                        
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBS_LEF_D_ExempExp_Standalone_Layout1 if any typeMembers then List or Single
                //List<DBS_LEF_D_ExempExp_Standalone_Layout1> dBS_LEF_D_ExempExp_Standalone_Layout1 = mainReportData.getDBS_LEF_D_ExempExp_Standalone_Layout1();
                
                
                // if typemembers exist
                
                    private String dBS_LEF_D_ExempExp_Standalone_Layout1Method(List<DBS_LEF_D_ExempExp_Standalone_Layout1> dBS_LEF_D_ExempExp_Standalone_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDate, String endDate, String periodDate)
                    {
                    dBS_LEF_D_ExempExp_Standalone_Layout1.forEach((field)->{
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
                                
                                    
                                    Unit INR128 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR128 = createUnitIfNotExist(INR128, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExposureAmount
                                
                                    Map zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountMap131 = new HashMap<String, String>();
                                    
                                            
                                            
                                            zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountMap131.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountMap131.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExemptedExposuresMember");
                                        
                                        
                                        String zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountValue130 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountMap131);

                                        
                                                Context DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountContext129 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_D_ExempExp_Standalone_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountMap131 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountValue130 != null && !"".equals(zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountValue130)) {
                                        
                                        addContext(DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountContext129, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exposureAmountValue132 = new MonetaryItemType();
                                        exposureAmountValue132.setContextRef(DBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountContext129);
                                        
                                            exposureAmountValue132.setUnitRef(INR128);
                                            exposureAmountValue132.setDecimals("INF");
                                            exposureAmountValue132.setValue(new BigDecimal(zeroDBS_LEF_D_ExempExp_Standalone_Layout1ExposureAmountValue130));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exposureAmountElement133 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue132);
                                        bodyElements.add(exposureAmountElement133);
                                    }
                                
                            
                            
                                // start create element for report of DBS_LEF_D_ExempExp_Standalone_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit pure134 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure134 = createUnitIfNotExist(pure134, "PURE", "http://www.xbrl.org/2003/instance","pure", unitElements);
                                    
                                
                                
                                // - PercentageOfExposureToTier1Capital
                                
                                    Map zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap137 = new HashMap<String, String>();
                                    
                                            
                                            
                                            zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap137.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:StandaloneMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap137.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExemptedExposuresMember");
                                        
                                        
                                        String zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalValue136 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap137);

                                        
                                                Context DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalContext135 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_D_ExempExp_Standalone_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalMap137 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalValue136 != null && !"".equals(zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalValue136)) {
                                        
                                        addContext(DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalContext135, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        PercentItemType percentageOfExposureToTier1CapitalValue138 = new PercentItemType();
                                        percentageOfExposureToTier1CapitalValue138.setContextRef(DBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalContext135);
                                        
                                            percentageOfExposureToTier1CapitalValue138.setUnitRef(pure134);
                                            percentageOfExposureToTier1CapitalValue138.setDecimals("INF");
                                            percentageOfExposureToTier1CapitalValue138.setValue(new BigDecimal(zeroDBS_LEF_D_ExempExp_Standalone_Layout1PercentageOfExposureToTier1CapitalValue136));
                                        
                                        
                                        JAXBElement<PercentItemType> percentageOfExposureToTier1CapitalElement139 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(percentageOfExposureToTier1CapitalValue138);
                                        bodyElements.add(percentageOfExposureToTier1CapitalElement139);
                                    }
                                
                            
                            
                            
                        
                        
                
                        
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBS_LEF_A_20LE_Consolidated_Layout1 if any typeMembers then List or Single
                //DBS_LEF_A_20LE_Consolidated_Layout1 dBS_LEF_A_20LE_Consolidated_Layout1 = mainReportData.getDBS_LEF_A_20LE_Consolidated_Layout1();
                
                    private String dBS_LEF_A_20LE_Consolidated_Layout1Method(DBS_LEF_A_20LE_Consolidated_Layout1 dBS_LEF_A_20LE_Consolidated_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDate, String endDate, String periodDate)
                
                    {
            
                    DBS_LEF_A_20LE_Consolidated_Layout1 field = dBS_LEF_A_20LE_Consolidated_Layout1;
                    
                    
                        
                        
                            
                                
                                Unit INR140 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                INR140 = createUnitIfNotExist(INR140, "INR", "http://www.xbrl.org/2003/iso4217", "INR", unitElements);
                                
                            
                            // - Tier1Capital
                            
                                Map zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalMap143 = new HashMap<String, String>();
                                
                                        
                                        
                                        zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalMap143.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                    
                                    
                                    String zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalValue142 = DBS13ReportUtil.retrieveValueForElement(field.getTier1Capital(), zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalMap143);

                                    
                                            Context DBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalContext141 = DBS13ReportContextUtil.createAsOfContextWithMembers( bankCode, periodDate,  zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalMap143 );
                                        
                                
                                if(zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalValue142 != null && !"".equals(zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalValue142)) {
                                    
                                    addContext(DBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalContext141, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    MonetaryItemType tier1CapitalValue144 = new MonetaryItemType();
                                    tier1CapitalValue144.setContextRef(DBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalContext141);
                                    
                                    tier1CapitalValue144.setUnitRef(INR140);
                                    tier1CapitalValue144.setDecimals("INF");
                                    tier1CapitalValue144.setValue(new BigDecimal(zeroDBS_LEF_A_20LE_Consolidated_Layout1Tier1CapitalValue142));
                                    
                                    
                                    JAXBElement<MonetaryItemType> tier1CapitalElement145 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createTier1Capital(tier1CapitalValue144);
                                    bodyElements.add(tier1CapitalElement145);
                                
                            }
                        
                        
                    
                    
            
                    
                    
                    
                    return "";
                    }

                
                    
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBS_LEF_A_20LE_Consolidated_Layout2 if any typeMembers then List or Single
                //List<DBS_LEF_A_20LE_Consolidated_Layout2> dBS_LEF_A_20LE_Consolidated_Layout2 = mainReportData.getDBS_LEF_A_20LE_Consolidated_Layout2();
                
                
                // if typemembers exist
                
                    private String dBS_LEF_A_20LE_Consolidated_Layout2Method(List<DBS_LEF_A_20LE_Consolidated_Layout2> dBS_LEF_A_20LE_Consolidated_Layout2, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDate, String endDate, String periodDate)
                    {
                    dBS_LEF_A_20LE_Consolidated_Layout2.forEach((field)->{
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
                                
                                    
                                    Unit INR146 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR146 = createUnitIfNotExist(INR146, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExposureAmount
                                
                                    Map zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountMap149 = new HashMap<String, String>();
                                    
                                            
                                            
                                            zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountMap149.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountMap149.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:LargestTwentyExposuresMember");
                                        
                                        
                                        String zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountValue148 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountMap149);

                                        
                                                Context DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountContext147 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_A_20LE_Consolidated_Layout2( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountMap149 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountValue148 != null && !"".equals(zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountValue148)) {
                                        
                                        addContext(DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountContext147, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exposureAmountValue150 = new MonetaryItemType();
                                        exposureAmountValue150.setContextRef(DBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountContext147);
                                        
                                            exposureAmountValue150.setUnitRef(INR146);
                                            exposureAmountValue150.setDecimals("INF");
                                            exposureAmountValue150.setValue(new BigDecimal(zeroDBS_LEF_A_20LE_Consolidated_Layout2ExposureAmountValue148));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exposureAmountElement151 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue150);
                                        bodyElements.add(exposureAmountElement151);
                                    }
                                
                            
                            
                                // start create element for report of DBS_LEF_A_20LE_Consolidated_Layout2
                                // create unit if not empty
                                
                                    
                                    Unit pure152 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure152 = createUnitIfNotExist(pure152, "PURE", "http://www.xbrl.org/2003/instance","pure", unitElements);
                                    
                                
                                
                                // - PercentageOfExposureToTier1Capital
                                
                                    Map zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalMap155 = new HashMap<String, String>();
                                    
                                            
                                            
                                            zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalMap155.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalMap155.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:LargestTwentyExposuresMember");
                                        
                                        
                                        String zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalValue154 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalMap155);

                                        
                                                Context DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalContext153 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_A_20LE_Consolidated_Layout2( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalMap155 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalValue154 != null && !"".equals(zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalValue154)) {
                                        
                                        addContext(DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalContext153, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        PercentItemType percentageOfExposureToTier1CapitalValue156 = new PercentItemType();
                                        percentageOfExposureToTier1CapitalValue156.setContextRef(DBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalContext153);
                                        
                                            percentageOfExposureToTier1CapitalValue156.setUnitRef(pure152);
                                            percentageOfExposureToTier1CapitalValue156.setDecimals("INF");
                                            percentageOfExposureToTier1CapitalValue156.setValue(new BigDecimal(zeroDBS_LEF_A_20LE_Consolidated_Layout2PercentageOfExposureToTier1CapitalValue154));
                                        
                                        
                                        JAXBElement<PercentItemType> percentageOfExposureToTier1CapitalElement157 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(percentageOfExposureToTier1CapitalValue156);
                                        bodyElements.add(percentageOfExposureToTier1CapitalElement157);
                                    }
                                
                            
                            
                            
                        
                        
                
                        
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBS_LEF_B_SpecExp_Consolidated_Layout1 if any typeMembers then List or Single
                //List<DBS_LEF_B_SpecExp_Consolidated_Layout1> dBS_LEF_B_SpecExp_Consolidated_Layout1 = mainReportData.getDBS_LEF_B_SpecExp_Consolidated_Layout1();
                
                
                // if typemembers exist
                
                    private String dBS_LEF_B_SpecExp_Consolidated_Layout1Method(List<DBS_LEF_B_SpecExp_Consolidated_Layout1> dBS_LEF_B_SpecExp_Consolidated_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDate, String endDate, String periodDate)
                    {
                    dBS_LEF_B_SpecExp_Consolidated_Layout1.forEach((field)->{
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
                                
                                    
                                    Unit INR158 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR158 = createUnitIfNotExist(INR158, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExposureAmount
                                
                                    Map zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountMap161 = new HashMap<String, String>();
                                    
                                            
                                            
                                            zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountMap161.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountMap161.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExposuresEqualToOrAboveSpecifiedPercentageOfTier1CapitalMember");
                                        
                                        
                                        String zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountValue160 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountMap161);

                                        
                                                Context DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountContext159 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_B_SpecExp_Consolidated_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountMap161 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountValue160 != null && !"".equals(zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountValue160)) {
                                        
                                        addContext(DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountContext159, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exposureAmountValue162 = new MonetaryItemType();
                                        exposureAmountValue162.setContextRef(DBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountContext159);
                                        
                                            exposureAmountValue162.setUnitRef(INR158);
                                            exposureAmountValue162.setDecimals("INF");
                                            exposureAmountValue162.setValue(new BigDecimal(zeroDBS_LEF_B_SpecExp_Consolidated_Layout1ExposureAmountValue160));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exposureAmountElement163 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue162);
                                        bodyElements.add(exposureAmountElement163);
                                    }
                                
                            
                            
                                // start create element for report of DBS_LEF_B_SpecExp_Consolidated_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit pure164 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure164 = createUnitIfNotExist(pure164, "PURE", "http://www.xbrl.org/2003/instance","pure", unitElements);
                                    
                                
                                
                                // - PercentageOfExposureToTier1Capital
                                
                                    Map zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap167 = new HashMap<String, String>();
                                    
                                            
                                            
                                            zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap167.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap167.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExposuresEqualToOrAboveSpecifiedPercentageOfTier1CapitalMember");
                                        
                                        
                                        String zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalValue166 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap167);

                                        
                                                Context DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalContext165 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_B_SpecExp_Consolidated_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap167 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalValue166 != null && !"".equals(zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalValue166)) {
                                        
                                        addContext(DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalContext165, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        PercentItemType percentageOfExposureToTier1CapitalValue168 = new PercentItemType();
                                        percentageOfExposureToTier1CapitalValue168.setContextRef(DBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalContext165);
                                        
                                            percentageOfExposureToTier1CapitalValue168.setUnitRef(pure164);
                                            percentageOfExposureToTier1CapitalValue168.setDecimals("INF");
                                            percentageOfExposureToTier1CapitalValue168.setValue(new BigDecimal(zeroDBS_LEF_B_SpecExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalValue166));
                                        
                                        
                                        JAXBElement<PercentItemType> percentageOfExposureToTier1CapitalElement169 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(percentageOfExposureToTier1CapitalValue168);
                                        bodyElements.add(percentageOfExposureToTier1CapitalElement169);
                                    }
                                
                            
                            
                            
                        
                        
                
                        
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBS_LEF_C_OthExp_Consolidated_Layout1 if any typeMembers then List or Single
                //List<DBS_LEF_C_OthExp_Consolidated_Layout1> dBS_LEF_C_OthExp_Consolidated_Layout1 = mainReportData.getDBS_LEF_C_OthExp_Consolidated_Layout1();
                
                
                // if typemembers exist
                
                    private String dBS_LEF_C_OthExp_Consolidated_Layout1Method(List<DBS_LEF_C_OthExp_Consolidated_Layout1> dBS_LEF_C_OthExp_Consolidated_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDate, String endDate, String periodDate)
                    {
                    dBS_LEF_C_OthExp_Consolidated_Layout1.forEach((field)->{
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
                                
                                    
                                    Unit INR170 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR170 = createUnitIfNotExist(INR170, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExposureAmount
                                
                                    Map zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountMap173 = new HashMap<String, String>();
                                    
                                            
                                            
                                            zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountMap173.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountMap173.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:OtherExposuresMember");
                                        
                                        
                                        String zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountValue172 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountMap173);

                                        
                                                Context DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountContext171 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_C_OthExp_Consolidated_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountMap173 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountValue172 != null && !"".equals(zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountValue172)) {
                                        
                                        addContext(DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountContext171, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exposureAmountValue174 = new MonetaryItemType();
                                        exposureAmountValue174.setContextRef(DBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountContext171);
                                        
                                            exposureAmountValue174.setUnitRef(INR170);
                                            exposureAmountValue174.setDecimals("INF");
                                            exposureAmountValue174.setValue(new BigDecimal(zeroDBS_LEF_C_OthExp_Consolidated_Layout1ExposureAmountValue172));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exposureAmountElement175 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue174);
                                        bodyElements.add(exposureAmountElement175);
                                    }
                                
                            
                            
                                // start create element for report of DBS_LEF_C_OthExp_Consolidated_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit pure176 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure176 = createUnitIfNotExist(pure176, "PURE", "http://www.xbrl.org/2003/instance","pure", unitElements);
                                    
                                
                                
                                // - PercentageOfExposureToTier1Capital
                                
                                    Map zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap179 = new HashMap<String, String>();
                                    
                                            
                                            
                                            zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap179.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap179.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:OtherExposuresMember");
                                        
                                        
                                        String zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalValue178 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap179);

                                        
                                                Context DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalContext177 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_C_OthExp_Consolidated_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap179 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalValue178 != null && !"".equals(zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalValue178)) {
                                        
                                        addContext(DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalContext177, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        PercentItemType percentageOfExposureToTier1CapitalValue180 = new PercentItemType();
                                        percentageOfExposureToTier1CapitalValue180.setContextRef(DBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalContext177);
                                        
                                            percentageOfExposureToTier1CapitalValue180.setUnitRef(pure176);
                                            percentageOfExposureToTier1CapitalValue180.setDecimals("INF");
                                            percentageOfExposureToTier1CapitalValue180.setValue(new BigDecimal(zeroDBS_LEF_C_OthExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalValue178));
                                        
                                        
                                        JAXBElement<PercentItemType> percentageOfExposureToTier1CapitalElement181 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(percentageOfExposureToTier1CapitalValue180);
                                        bodyElements.add(percentageOfExposureToTier1CapitalElement181);
                                    }
                                
                            
                            
                            
                        
                        
                
                        
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBS_LEF_D_ExempExp_Consolidated_Layout1 if any typeMembers then List or Single
                //List<DBS_LEF_D_ExempExp_Consolidated_Layout1> dBS_LEF_D_ExempExp_Consolidated_Layout1 = mainReportData.getDBS_LEF_D_ExempExp_Consolidated_Layout1();
                
                
                // if typemembers exist
                
                    private String dBS_LEF_D_ExempExp_Consolidated_Layout1Method(List<DBS_LEF_D_ExempExp_Consolidated_Layout1> dBS_LEF_D_ExempExp_Consolidated_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDate, String endDate, String periodDate)
                    {
                    dBS_LEF_D_ExempExp_Consolidated_Layout1.forEach((field)->{
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
                                
                                    
                                    Unit INR182 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR182 = createUnitIfNotExist(INR182, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExposureAmount
                                
                                    Map zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountMap185 = new HashMap<String, String>();
                                    
                                            
                                            
                                            zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountMap185.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountMap185.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExemptedExposuresMember");
                                        
                                        
                                        String zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountValue184 = DBS13ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountMap185);

                                        
                                                Context DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountContext183 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_D_ExempExp_Consolidated_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountMap185 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountValue184 != null && !"".equals(zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountValue184)) {
                                        
                                        addContext(DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountContext183, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exposureAmountValue186 = new MonetaryItemType();
                                        exposureAmountValue186.setContextRef(DBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountContext183);
                                        
                                            exposureAmountValue186.setUnitRef(INR182);
                                            exposureAmountValue186.setDecimals("INF");
                                            exposureAmountValue186.setValue(new BigDecimal(zeroDBS_LEF_D_ExempExp_Consolidated_Layout1ExposureAmountValue184));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exposureAmountElement187 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue186);
                                        bodyElements.add(exposureAmountElement187);
                                    }
                                
                            
                            
                                // start create element for report of DBS_LEF_D_ExempExp_Consolidated_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit pure188 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure188 = createUnitIfNotExist(pure188, "PURE", "http://www.xbrl.org/2003/instance","pure", unitElements);
                                    
                                
                                
                                // - PercentageOfExposureToTier1Capital
                                
                                    Map zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap191 = new HashMap<String, String>();
                                    
                                            
                                            
                                            zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap191.put("rbi-core:ConsolidatedAndSeparateFinancialStatementsAxis", "in-rbi-rep:ConsolidatedMember");
                                        
                                            
                                            
                                            zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap191.put("rbi-core:ExposureToCounterpartiesAxis", "rbi-core:ExemptedExposuresMember");
                                        
                                        
                                        String zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalValue190 = DBS13ReportUtil.retrieveValueForElement(field.getPercentageOfExposureToTier1Capital(), zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap191);

                                        
                                                Context DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalContext189 = DBS13ReportContextUtil.createAsOfContextWithMembersDBS_LEF_D_ExempExp_Consolidated_Layout1( bankCode, periodDate, permanentAccountNumberOrGroupIDOfCounterpartyAxis, nameOfCounterPartyAxis,  zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalMap191 );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalValue190 != null && !"".equals(zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalValue190)) {
                                        
                                        addContext(DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalContext189, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        PercentItemType percentageOfExposureToTier1CapitalValue192 = new PercentItemType();
                                        percentageOfExposureToTier1CapitalValue192.setContextRef(DBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalContext189);
                                        
                                            percentageOfExposureToTier1CapitalValue192.setUnitRef(pure188);
                                            percentageOfExposureToTier1CapitalValue192.setDecimals("INF");
                                            percentageOfExposureToTier1CapitalValue192.setValue(new BigDecimal(zeroDBS_LEF_D_ExempExp_Consolidated_Layout1PercentageOfExposureToTier1CapitalValue190));
                                        
                                        
                                        JAXBElement<PercentItemType> percentageOfExposureToTier1CapitalElement193 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPercentageOfExposureToTier1Capital(percentageOfExposureToTier1CapitalValue192);
                                        bodyElements.add(percentageOfExposureToTier1CapitalElement193);
                                    }
                                
                            
                            
                            
                        
                        
                
                        
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBS_AuthorisedSignatory_Layout1 if any typeMembers then List or Single
                //DBS_AuthorisedSignatory_Layout1 dBS_AuthorisedSignatory_Layout1 = mainReportData.getDBS_AuthorisedSignatory_Layout1();
                
                    private String dBS_AuthorisedSignatory_Layout1Method(DBS_AuthorisedSignatory_Layout1 dBS_AuthorisedSignatory_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDate, String endDate, String periodDate)
                
                    {
            
                    DBS_AuthorisedSignatory_Layout1 field = dBS_AuthorisedSignatory_Layout1;
                    
                    
                        
                        
                            
                            // - NameOfSignatory
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryMap196 = new HashMap<String, String>();
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryValue195 = DBS13ReportUtil.retrieveValueForElement(field.getNameOfSignatory(), zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryMap196);

                                    
                                        Context DBS_AuthorisedSignatory_Layout1NameOfSignatoryContext194 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryValue195 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryValue195)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1NameOfSignatoryContext194, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType nameOfSignatoryValue197 = new StringItemType();
                                    nameOfSignatoryValue197.setContextRef(DBS_AuthorisedSignatory_Layout1NameOfSignatoryContext194);
                                    
                                    nameOfSignatoryValue197.setValue(zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryValue195);        
                                    
                                    
                                    JAXBElement<StringItemType> nameOfSignatoryElement198 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNameOfSignatory(nameOfSignatoryValue197);
                                    bodyElements.add(nameOfSignatoryElement198);
                                
                            }
                        
                            
                            // - DesignationOfSignatory
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryMap201 = new HashMap<String, String>();
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryValue200 = DBS13ReportUtil.retrieveValueForElement(field.getDesignationOfSignatory(), zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryMap201);

                                    
                                        Context DBS_AuthorisedSignatory_Layout1DesignationOfSignatoryContext199 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryValue200 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryValue200)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1DesignationOfSignatoryContext199, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType designationOfSignatoryValue202 = new StringItemType();
                                    designationOfSignatoryValue202.setContextRef(DBS_AuthorisedSignatory_Layout1DesignationOfSignatoryContext199);
                                    
                                    designationOfSignatoryValue202.setValue(zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryValue200);        
                                    
                                    
                                    JAXBElement<StringItemType> designationOfSignatoryElement203 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createDesignationOfSignatory(designationOfSignatoryValue202);
                                    bodyElements.add(designationOfSignatoryElement203);
                                
                            }
                        
                            
                            // - AuthorisedSignatoryOfficialLandlineNumber
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberMap206 = new HashMap<String, String>();
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue205 = DBS13ReportUtil.retrieveValueForElement(field.getAuthorisedSignatoryOfficialLandlineNumber(), zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberMap206);

                                    
                                        Context DBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext204 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue205 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue205)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext204, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType authorisedSignatoryOfficialLandlineNumberValue207 = new StringItemType();
                                    authorisedSignatoryOfficialLandlineNumberValue207.setContextRef(DBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext204);
                                    
                                    authorisedSignatoryOfficialLandlineNumberValue207.setValue(zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue205);        
                                    
                                    
                                    JAXBElement<StringItemType> authorisedSignatoryOfficialLandlineNumberElement208 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createAuthorisedSignatoryOfficialLandlineNumber(authorisedSignatoryOfficialLandlineNumberValue207);
                                    bodyElements.add(authorisedSignatoryOfficialLandlineNumberElement208);
                                
                            }
                        
                            
                            // - MobileNumberOfAuthorisedSignatory
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryMap211 = new HashMap<String, String>();
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue210 = DBS13ReportUtil.retrieveValueForElement(field.getMobileNumberOfAuthorisedSignatory(), zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryMap211);

                                    
                                        Context DBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext209 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue210 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue210)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext209, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType mobileNumberOfAuthorisedSignatoryValue212 = new StringItemType();
                                    mobileNumberOfAuthorisedSignatoryValue212.setContextRef(DBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext209);
                                    
                                    mobileNumberOfAuthorisedSignatoryValue212.setValue(zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue210);        
                                    
                                    
                                    JAXBElement<StringItemType> mobileNumberOfAuthorisedSignatoryElement213 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createMobileNumberOfAuthorisedSignatory(mobileNumberOfAuthorisedSignatoryValue212);
                                    bodyElements.add(mobileNumberOfAuthorisedSignatoryElement213);
                                
                            }
                        
                            
                            // - EMailIDOfAuthorisedReportingOfficial
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialMap216 = new HashMap<String, String>();
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue215 = DBS13ReportUtil.retrieveValueForElement(field.getEMailIDOfAuthorisedReportingOfficial(), zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialMap216);

                                    
                                        Context DBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext214 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue215 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue215)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext214, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType eMailIDOfAuthorisedReportingOfficialValue217 = new StringItemType();
                                    eMailIDOfAuthorisedReportingOfficialValue217.setContextRef(DBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext214);
                                    
                                    eMailIDOfAuthorisedReportingOfficialValue217.setValue(zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue215);        
                                    
                                    
                                    JAXBElement<StringItemType> eMailIDOfAuthorisedReportingOfficialElement218 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createEMailIDOfAuthorisedReportingOfficial(eMailIDOfAuthorisedReportingOfficialValue217);
                                    bodyElements.add(eMailIDOfAuthorisedReportingOfficialElement218);
                                
                            }
                        
                            
                            // - Remarks
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1RemarksMap221 = new HashMap<String, String>();
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1RemarksValue220 = DBS13ReportUtil.retrieveValueForElement(field.getRemarks(), zeroDBS_AuthorisedSignatory_Layout1RemarksMap221);

                                    
                                        Context DBS_AuthorisedSignatory_Layout1RemarksContext219 = DBS13ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1RemarksValue220 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1RemarksValue220)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1RemarksContext219, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType remarksValue222 = new StringItemType();
                                    remarksValue222.setContextRef(DBS_AuthorisedSignatory_Layout1RemarksContext219);
                                    
                                    remarksValue222.setValue(zeroDBS_AuthorisedSignatory_Layout1RemarksValue220);        
                                    
                                    
                                    JAXBElement<StringItemType> remarksElement223 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createRemarks(remarksValue222);
                                    bodyElements.add(remarksElement223);
                                
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
    
    

