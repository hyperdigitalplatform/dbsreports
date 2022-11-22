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
                
                    private String filingInfo_Layout1Method(FilingInfo_Layout1 filingInfo_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDate, String endDate, String periodDate)
                
                    {
            
                    FilingInfo_Layout1 field = filingInfo_Layout1;
                    
                    
                        
                        
                            
                            // - ReturnName
                            
                                Map zeroFilingInfo_Layout1ReturnNameMap3 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout1ReturnNameValue2 = DBS16ReportUtil.retrieveValueForElement(field.getReturnName(), zeroFilingInfo_Layout1ReturnNameMap3);

                                    
                                        Context FilingInfo_Layout1ReturnNameContext1 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                    
                                    String zeroFilingInfo_Layout1ReturnCodeValue7 = DBS16ReportUtil.retrieveValueForElement(field.getReturnCode(), zeroFilingInfo_Layout1ReturnCodeMap8);

                                    
                                        Context FilingInfo_Layout1ReturnCodeContext6 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                    
                                    String zeroFilingInfo_Layout1NameOfReportingInstitutionValue12 = DBS16ReportUtil.retrieveValueForElement(field.getNameOfReportingInstitution(), zeroFilingInfo_Layout1NameOfReportingInstitutionMap13);

                                    
                                        Context FilingInfo_Layout1NameOfReportingInstitutionContext11 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                    
                                    String zeroFilingInfo_Layout1BankCodeValue17 = DBS16ReportUtil.retrieveValueForElement(field.getBankCode(), zeroFilingInfo_Layout1BankCodeMap18);

                                    
                                    Context FilingInfo_Layout1BankCodeContext16 = DBS16ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
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
                                
                                    
                                    String zeroFilingInfo_Layout1InstitutionTypeValue22 = DBS16ReportUtil.retrieveValueForElement(field.getInstitutionType(), zeroFilingInfo_Layout1InstitutionTypeMap23);

                                    
                                        Context FilingInfo_Layout1InstitutionTypeContext21 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingFrequencyValue27 = DBS16ReportUtil.retrieveValueForElement(field.getReportingFrequency(), zeroFilingInfo_Layout1ReportingFrequencyMap28);

                                    
                                        Context FilingInfo_Layout1ReportingFrequencyContext26 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingPeriodStartDateValue32 = DBS16ReportUtil.retrieveValueForElement(field.getReportingPeriodStartDate(), zeroFilingInfo_Layout1ReportingPeriodStartDateMap33);

                                    
                                    Context FilingInfo_Layout1ReportingPeriodStartDateContext31 = DBS16ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout1ReportingPeriodStartDateValue32 != null && !"".equals(zeroFilingInfo_Layout1ReportingPeriodStartDateValue32)) {
                                    
                                    addContext(FilingInfo_Layout1ReportingPeriodStartDateContext31, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    DateItemType reportingPeriodStartDateValue34 = new DateItemType();
                                    reportingPeriodStartDateValue34.setContextRef(FilingInfo_Layout1ReportingPeriodStartDateContext31);
                                    
                                    reportingPeriodStartDateValue34.setValue(DBS16ReportContextUtil.toXMLGeo(zeroFilingInfo_Layout1ReportingPeriodStartDateValue32));
                                    
                                    
                                    JAXBElement<DateItemType> reportingPeriodStartDateElement35 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReportingPeriodStartDate(reportingPeriodStartDateValue34);
                                    bodyElements.add(reportingPeriodStartDateElement35);
                                
                            }
                        
                            
                            // - ReportingPeriodEndDate
                            
                                Map zeroFilingInfo_Layout1ReportingPeriodEndDateMap38 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingPeriodEndDateValue37 = DBS16ReportUtil.retrieveValueForElement(field.getReportingPeriodEndDate(), zeroFilingInfo_Layout1ReportingPeriodEndDateMap38);

                                    
                                    Context FilingInfo_Layout1ReportingPeriodEndDateContext36 = DBS16ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout1ReportingPeriodEndDateValue37 != null && !"".equals(zeroFilingInfo_Layout1ReportingPeriodEndDateValue37)) {
                                    
                                    addContext(FilingInfo_Layout1ReportingPeriodEndDateContext36, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    DateItemType reportingPeriodEndDateValue39 = new DateItemType();
                                    reportingPeriodEndDateValue39.setContextRef(FilingInfo_Layout1ReportingPeriodEndDateContext36);
                                    
                                    reportingPeriodEndDateValue39.setValue(DBS16ReportContextUtil.toXMLGeo(zeroFilingInfo_Layout1ReportingPeriodEndDateValue37));
                                    
                                    
                                    JAXBElement<DateItemType> reportingPeriodEndDateElement40 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReportingPeriodEndDate(reportingPeriodEndDateValue39);
                                    bodyElements.add(reportingPeriodEndDateElement40);
                                
                            }
                        
                            
                            // - ReportingCurrency
                            
                                Map zeroFilingInfo_Layout1ReportingCurrencyMap43 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingCurrencyValue42 = DBS16ReportUtil.retrieveValueForElement(field.getReportingCurrency(), zeroFilingInfo_Layout1ReportingCurrencyMap43);

                                    
                                        Context FilingInfo_Layout1ReportingCurrencyContext41 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingScaleValue47 = DBS16ReportUtil.retrieveValueForElement(field.getReportingScale(), zeroFilingInfo_Layout1ReportingScaleMap48);

                                    
                                        Context FilingInfo_Layout1ReportingScaleContext46 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                    
                                    String zeroFilingInfo_Layout1TaxonomyVersionValue52 = DBS16ReportUtil.retrieveValueForElement(field.getTaxonomyVersion(), zeroFilingInfo_Layout1TaxonomyVersionMap53);

                                    
                                        Context FilingInfo_Layout1TaxonomyVersionContext51 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                    
                                    String zeroFilingInfo_Layout1ToolNameValue57 = DBS16ReportUtil.retrieveValueForElement(field.getToolName(), zeroFilingInfo_Layout1ToolNameMap58);

                                    
                                        Context FilingInfo_Layout1ToolNameContext56 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                    
                                    String zeroFilingInfo_Layout1ToolVersionValue62 = DBS16ReportUtil.retrieveValueForElement(field.getToolVersion(), zeroFilingInfo_Layout1ToolVersionMap63);

                                    
                                        Context FilingInfo_Layout1ToolVersionContext61 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                    
                                    String zeroFilingInfo_Layout1ReportStatusValue67 = DBS16ReportUtil.retrieveValueForElement(field.getReportStatus(), zeroFilingInfo_Layout1ReportStatusMap68);

                                    
                                        Context FilingInfo_Layout1ReportStatusContext66 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                    
                                    String zeroFilingInfo_Layout1DateOfAuditValue72 = DBS16ReportUtil.retrieveValueForElement(field.getDateOfAudit(), zeroFilingInfo_Layout1DateOfAuditMap73);

                                    
                                    Context FilingInfo_Layout1DateOfAuditContext71 = DBS16ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout1DateOfAuditValue72 != null && !"".equals(zeroFilingInfo_Layout1DateOfAuditValue72)) {
                                    
                                    addContext(FilingInfo_Layout1DateOfAuditContext71, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    DateItemType dateOfAuditValue74 = new DateItemType();
                                    dateOfAuditValue74.setContextRef(FilingInfo_Layout1DateOfAuditContext71);
                                    
                                    dateOfAuditValue74.setValue(DBS16ReportContextUtil.toXMLGeo(zeroFilingInfo_Layout1DateOfAuditValue72));
                                    
                                    
                                    JAXBElement<DateItemType> dateOfAuditElement75 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createDateOfAudit(dateOfAuditValue74);
                                    bodyElements.add(dateOfAuditElement75);
                                
                            }
                        
                            
                            // - GeneralRemarks
                            
                                Map zeroFilingInfo_Layout1GeneralRemarksMap78 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout1GeneralRemarksValue77 = DBS16ReportUtil.retrieveValueForElement(field.getGeneralRemarks(), zeroFilingInfo_Layout1GeneralRemarksMap78);

                                    
                                        Context FilingInfo_Layout1GeneralRemarksContext76 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                    
                    
                        
                        
                            
                            // - WhetherNilReporting
                            
                                Map zeroFilingInfo_Layout2WhetherNilReportingMap83 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout2WhetherNilReportingValue82 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherNilReporting(), zeroFilingInfo_Layout2WhetherNilReportingMap83);

                                    
                                        Context FilingInfo_Layout2WhetherNilReportingContext81 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout2WhetherNilReportingValue82 != null && !"".equals(zeroFilingInfo_Layout2WhetherNilReportingValue82)) {
                                    
                                    addContext(FilingInfo_Layout2WhetherNilReportingContext81, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    BooleanItemType whetherNilReportingValue84 = new BooleanItemType();
                                    whetherNilReportingValue84.setContextRef(FilingInfo_Layout2WhetherNilReportingContext81);
                                    
                                        whetherNilReportingValue84.setValue(Boolean.getBoolean(zeroFilingInfo_Layout2WhetherNilReportingValue82));
                                    
                                    
                                    JAXBElement<BooleanItemType> whetherNilReportingElement85 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createWhetherNilReporting(whetherNilReportingValue84);
                                    bodyElements.add(whetherNilReportingElement85);
                                
                            }
                        
                        
                    
                    
            
                    
                    
                    
                    return "";
                    }

                
                    
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBS_StressedMSME_Layout1 if any typeMembers then List or Single
                //List<DBS_StressedMSME_Layout1> dBS_StressedMSME_Layout1 = mainReportData.getDBS_StressedMSME_Layout1();
                
                
                // if typemembers exist
                
                    private String dBS_StressedMSME_Layout1Method(List<DBS_StressedMSME_Layout1> dBS_StressedMSME_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDate, String endDate, String periodDate)
                    {
                    dBS_StressedMSME_Layout1.forEach((field)->{
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
                        
                            // create xbrl report element
                            
                                // start create element for report of DBS_StressedMSME_Layout1
                                // create unit if not empty
                                
                                
                                // - WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate
                                
                                    Map zeroDBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMap88 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateValue87 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate(), zeroDBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateMap88);

                                        
                                            Context DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateContext86 = DBS16ReportContextUtil.createFromToContextDBS_StressedMSME_Layout1( bankCode, startDate, endDate ,nameOfBorrowerAxis,borrowerPermanentAccountNumberAxis,eligibleMicroSmallAndMediumEnterprisesEntityNameAxis,mSMEEntityPermanentAccountNumberAxis,stateAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateValue87 != null && !"".equals(zeroDBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateValue87)) {
                                        
                                        addContext(DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateContext86, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        BooleanItemType whetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateValue89 = new BooleanItemType();
                                        whetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateValue89.setContextRef(DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateContext86);
                                        
                                            whetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateValue89.setValue(Boolean.getBoolean(zeroDBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateValue87));
                                        
                                        
                                        JAXBElement<BooleanItemType> whetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateElement90 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate(whetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateValue89);
                                        bodyElements.add(whetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDateElement90);
                                    }
                                
                            
                            
                                // start create element for report of DBS_StressedMSME_Layout1
                                // create unit if not empty
                                
                                
                                // - WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate
                                
                                    Map zeroDBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMap93 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateValue92 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate(), zeroDBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateMap93);

                                        
                                            Context DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateContext91 = DBS16ReportContextUtil.createFromToContextDBS_StressedMSME_Layout1( bankCode, startDate, endDate ,nameOfBorrowerAxis,borrowerPermanentAccountNumberAxis,eligibleMicroSmallAndMediumEnterprisesEntityNameAxis,mSMEEntityPermanentAccountNumberAxis,stateAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateValue92 != null && !"".equals(zeroDBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateValue92)) {
                                        
                                        addContext(DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateContext91, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        BooleanItemType whetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateValue94 = new BooleanItemType();
                                        whetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateValue94.setContextRef(DBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateContext91);
                                        
                                            whetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateValue94.setValue(Boolean.getBoolean(zeroDBS_StressedMSME_Layout1WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateValue92));
                                        
                                        
                                        JAXBElement<BooleanItemType> whetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateElement95 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate(whetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateValue94);
                                        bodyElements.add(whetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDateElement95);
                                    }
                                
                            
                            
                                // start create element for report of DBS_StressedMSME_Layout1
                                // create unit if not empty
                                
                                
                                // - NoFraudOrNoWilfulDefaulterFlag
                                
                                    Map zeroDBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMap98 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagValue97 = DBS16ReportUtil.retrieveValueForElement(field.getNoFraudOrNoWilfulDefaulterFlag(), zeroDBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagMap98);

                                        
                                        Context DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagContext96 = DBS16ReportContextUtil.createAsOfContextDBS_StressedMSME_Layout1( bankCode, periodDate ,nameOfBorrowerAxis,borrowerPermanentAccountNumberAxis,eligibleMicroSmallAndMediumEnterprisesEntityNameAxis,mSMEEntityPermanentAccountNumberAxis,stateAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagValue97 != null && !"".equals(zeroDBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagValue97)) {
                                        
                                        addContext(DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagContext96, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        NoFraudOrNoWilfulDefaulterFlag noFraudOrNoWilfulDefaulterFlagValue99 = new NoFraudOrNoWilfulDefaulterFlag();
                                        noFraudOrNoWilfulDefaulterFlagValue99.setContextRef(DBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagContext96);
                                        
                                            noFraudOrNoWilfulDefaulterFlagValue99.setValue(zeroDBS_StressedMSME_Layout1NoFraudOrNoWilfulDefaulterFlagValue97);        
                                        
                                        
                                        JAXBElement<NoFraudOrNoWilfulDefaulterFlag> noFraudOrNoWilfulDefaulterFlagElement100 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createNoFraudOrNoWilfulDefaulterFlag(noFraudOrNoWilfulDefaulterFlagValue99);
                                        bodyElements.add(noFraudOrNoWilfulDefaulterFlagElement100);
                                    }
                                
                            
                            
                                // start create element for report of DBS_StressedMSME_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR101 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR101 = createUnitIfNotExist(INR101, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate
                                
                                    Map zeroDBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMap104 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateValue103 = DBS16ReportUtil.retrieveValueForElement(field.getPromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate(), zeroDBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateMap104);

                                        
                                        Context DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateContext102 = DBS16ReportContextUtil.createAsOfContextDBS_StressedMSME_Layout1( bankCode, periodDate ,nameOfBorrowerAxis,borrowerPermanentAccountNumberAxis,eligibleMicroSmallAndMediumEnterprisesEntityNameAxis,mSMEEntityPermanentAccountNumberAxis,stateAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateValue103 != null && !"".equals(zeroDBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateValue103)) {
                                        
                                        addContext(DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateContext102, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType promotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateValue105 = new MonetaryItemType();
                                        promotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateValue105.setContextRef(DBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateContext102);
                                        
                                            promotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateValue105.setUnitRef(INR101);
                                            promotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateValue105.setDecimals("INF");
                                            promotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateValue105.setValue(new BigDecimal(zeroDBS_StressedMSME_Layout1PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateValue103));
                                        
                                        
                                        JAXBElement<MonetaryItemType> promotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateElement106 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createPromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate(promotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateValue105);
                                        bodyElements.add(promotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDateElement106);
                                    }
                                
                            
                            
                                // start create element for report of DBS_StressedMSME_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR107 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR107 = createUnitIfNotExist(INR107, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate
                                
                                    Map zeroDBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMap110 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateValue109 = DBS16ReportUtil.retrieveValueForElement(field.getExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate(), zeroDBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateMap110);

                                        
                                        Context DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateContext108 = DBS16ReportContextUtil.createAsOfContextDBS_StressedMSME_Layout1( bankCode, periodDate ,nameOfBorrowerAxis,borrowerPermanentAccountNumberAxis,eligibleMicroSmallAndMediumEnterprisesEntityNameAxis,mSMEEntityPermanentAccountNumberAxis,stateAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateValue109 != null && !"".equals(zeroDBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateValue109)) {
                                        
                                        addContext(DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateContext108, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType existingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateValue111 = new MonetaryItemType();
                                        existingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateValue111.setContextRef(DBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateContext108);
                                        
                                            existingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateValue111.setUnitRef(INR107);
                                            existingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateValue111.setDecimals("INF");
                                            existingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateValue111.setValue(new BigDecimal(zeroDBS_StressedMSME_Layout1ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateValue109));
                                        
                                        
                                        JAXBElement<MonetaryItemType> existingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateElement112 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate(existingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateValue111);
                                        bodyElements.add(existingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDateElement112);
                                    }
                                
                            
                            
                                // start create element for report of DBS_StressedMSME_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR113 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR113 = createUnitIfNotExist(INR113, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate
                                
                                    Map zeroDBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMap116 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateValue115 = DBS16ReportUtil.retrieveValueForElement(field.getExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate(), zeroDBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateMap116);

                                        
                                        Context DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateContext114 = DBS16ReportContextUtil.createAsOfContextDBS_StressedMSME_Layout1( bankCode, periodDate ,nameOfBorrowerAxis,borrowerPermanentAccountNumberAxis,eligibleMicroSmallAndMediumEnterprisesEntityNameAxis,mSMEEntityPermanentAccountNumberAxis,stateAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateValue115 != null && !"".equals(zeroDBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateValue115)) {
                                        
                                        addContext(DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateContext114, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType existingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateValue117 = new MonetaryItemType();
                                        existingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateValue117.setContextRef(DBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateContext114);
                                        
                                            existingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateValue117.setUnitRef(INR113);
                                            existingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateValue117.setDecimals("INF");
                                            existingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateValue117.setValue(new BigDecimal(zeroDBS_StressedMSME_Layout1ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateValue115));
                                        
                                        
                                        JAXBElement<MonetaryItemType> existingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateElement118 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate(existingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateValue117);
                                        bodyElements.add(existingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDateElement118);
                                    }
                                
                            
                            
                                // start create element for report of DBS_StressedMSME_Layout1
                                // create unit if not empty
                                
                                
                                // - WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders
                                
                                    Map zeroDBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMap121 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersValue120 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders(), zeroDBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersMap121);

                                        
                                            Context DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersContext119 = DBS16ReportContextUtil.createFromToContextDBS_StressedMSME_Layout1( bankCode, startDate, endDate ,nameOfBorrowerAxis,borrowerPermanentAccountNumberAxis,eligibleMicroSmallAndMediumEnterprisesEntityNameAxis,mSMEEntityPermanentAccountNumberAxis,stateAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersValue120 != null && !"".equals(zeroDBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersValue120)) {
                                        
                                        addContext(DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersContext119, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        BooleanItemType whetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersValue122 = new BooleanItemType();
                                        whetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersValue122.setContextRef(DBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersContext119);
                                        
                                            whetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersValue122.setValue(Boolean.getBoolean(zeroDBS_StressedMSME_Layout1WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersValue120));
                                        
                                        
                                        JAXBElement<BooleanItemType> whetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersElement123 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders(whetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersValue122);
                                        bodyElements.add(whetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLendersElement123);
                                    }
                                
                            
                            
                                // start create element for report of DBS_StressedMSME_Layout1
                                // create unit if not empty
                                
                                
                                // - LoanSanctionDateUnderCGSSD
                                
                                    Map zeroDBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMap126 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDValue125 = DBS16ReportUtil.retrieveValueForElement(field.getLoanSanctionDateUnderCGSSD(), zeroDBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDMap126);

                                        
                                        Context DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDContext124 = DBS16ReportContextUtil.createAsOfContextDBS_StressedMSME_Layout1( bankCode, periodDate ,nameOfBorrowerAxis,borrowerPermanentAccountNumberAxis,eligibleMicroSmallAndMediumEnterprisesEntityNameAxis,mSMEEntityPermanentAccountNumberAxis,stateAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDValue125 != null && !"".equals(zeroDBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDValue125)) {
                                        
                                        addContext(DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDContext124, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        DateItemType loanSanctionDateUnderCGSSDValue127 = new DateItemType();
                                        loanSanctionDateUnderCGSSDValue127.setContextRef(DBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDContext124);
                                        
                                            loanSanctionDateUnderCGSSDValue127.setValue(DBS16ReportContextUtil.toXMLGeo(zeroDBS_StressedMSME_Layout1LoanSanctionDateUnderCGSSDValue125));
                                        
                                        
                                        JAXBElement<DateItemType> loanSanctionDateUnderCGSSDElement128 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createLoanSanctionDateUnderCGSSD(loanSanctionDateUnderCGSSDValue127);
                                        bodyElements.add(loanSanctionDateUnderCGSSDElement128);
                                    }
                                
                            
                            
                                // start create element for report of DBS_StressedMSME_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR129 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR129 = createUnitIfNotExist(INR129, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - LoanSanctionedUnderCGSSD
                                
                                    Map zeroDBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMap132 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDValue131 = DBS16ReportUtil.retrieveValueForElement(field.getLoanSanctionedUnderCGSSD(), zeroDBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDMap132);

                                        
                                        Context DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDContext130 = DBS16ReportContextUtil.createAsOfContextDBS_StressedMSME_Layout1( bankCode, periodDate ,nameOfBorrowerAxis,borrowerPermanentAccountNumberAxis,eligibleMicroSmallAndMediumEnterprisesEntityNameAxis,mSMEEntityPermanentAccountNumberAxis,stateAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDValue131 != null && !"".equals(zeroDBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDValue131)) {
                                        
                                        addContext(DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDContext130, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType loanSanctionedUnderCGSSDValue133 = new MonetaryItemType();
                                        loanSanctionedUnderCGSSDValue133.setContextRef(DBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDContext130);
                                        
                                            loanSanctionedUnderCGSSDValue133.setUnitRef(INR129);
                                            loanSanctionedUnderCGSSDValue133.setDecimals("INF");
                                            loanSanctionedUnderCGSSDValue133.setValue(new BigDecimal(zeroDBS_StressedMSME_Layout1LoanSanctionedUnderCGSSDValue131));
                                        
                                        
                                        JAXBElement<MonetaryItemType> loanSanctionedUnderCGSSDElement134 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createLoanSanctionedUnderCGSSD(loanSanctionedUnderCGSSDValue133);
                                        bodyElements.add(loanSanctionedUnderCGSSDElement134);
                                    }
                                
                            
                            
                                // start create element for report of DBS_StressedMSME_Layout1
                                // create unit if not empty
                                
                                
                                // - WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage
                                
                                    Map zeroDBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMap137 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageValue136 = DBS16ReportUtil.retrieveValueForElement(field.getWhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage(), zeroDBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageMap137);

                                        
                                            Context DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageContext135 = DBS16ReportContextUtil.createFromToContextDBS_StressedMSME_Layout1( bankCode, startDate, endDate ,nameOfBorrowerAxis,borrowerPermanentAccountNumberAxis,eligibleMicroSmallAndMediumEnterprisesEntityNameAxis,mSMEEntityPermanentAccountNumberAxis,stateAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageValue136 != null && !"".equals(zeroDBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageValue136)) {
                                        
                                        addContext(DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageContext135, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        BooleanItemType whetherCGTMSEApprovalReceivedForTheGuaranteeCoverageValue138 = new BooleanItemType();
                                        whetherCGTMSEApprovalReceivedForTheGuaranteeCoverageValue138.setContextRef(DBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageContext135);
                                        
                                            whetherCGTMSEApprovalReceivedForTheGuaranteeCoverageValue138.setValue(Boolean.getBoolean(zeroDBS_StressedMSME_Layout1WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverageValue136));
                                        
                                        
                                        JAXBElement<BooleanItemType> whetherCGTMSEApprovalReceivedForTheGuaranteeCoverageElement139 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage(whetherCGTMSEApprovalReceivedForTheGuaranteeCoverageValue138);
                                        bodyElements.add(whetherCGTMSEApprovalReceivedForTheGuaranteeCoverageElement139);
                                    }
                                
                            
                            
                                // start create element for report of DBS_StressedMSME_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit pure140 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure140 = createUnitIfNotExist(pure140, "PURE", "http://www.xbrl.org/2003/instance","pure", unitElements);
                                    
                                
                                
                                // - TenureOfLoanSanctionedUnderTheCGSSD
                                
                                    Map zeroDBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMap143 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDValue142 = DBS16ReportUtil.retrieveValueForElement(field.getTenureOfLoanSanctionedUnderTheCGSSD(), zeroDBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDMap143);

                                        
                                        Context DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDContext141 = DBS16ReportContextUtil.createAsOfContextDBS_StressedMSME_Layout1( bankCode, periodDate ,nameOfBorrowerAxis,borrowerPermanentAccountNumberAxis,eligibleMicroSmallAndMediumEnterprisesEntityNameAxis,mSMEEntityPermanentAccountNumberAxis,stateAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDValue142 != null && !"".equals(zeroDBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDValue142)) {
                                        
                                        addContext(DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDContext141, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        DecimalItemType tenureOfLoanSanctionedUnderTheCGSSDValue144 = new DecimalItemType();
                                        tenureOfLoanSanctionedUnderTheCGSSDValue144.setContextRef(DBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDContext141);
                                        
                                            tenureOfLoanSanctionedUnderTheCGSSDValue144.setUnitRef(pure140);
                                            tenureOfLoanSanctionedUnderTheCGSSDValue144.setDecimals("INF");
                                            tenureOfLoanSanctionedUnderTheCGSSDValue144.setValue(new BigDecimal(zeroDBS_StressedMSME_Layout1TenureOfLoanSanctionedUnderTheCGSSDValue142));
                                        
                                        
                                        JAXBElement<DecimalItemType> tenureOfLoanSanctionedUnderTheCGSSDElement145 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTenureOfLoanSanctionedUnderTheCGSSD(tenureOfLoanSanctionedUnderTheCGSSDValue144);
                                        bodyElements.add(tenureOfLoanSanctionedUnderTheCGSSDElement145);
                                    }
                                
                            
                            
                                // start create element for report of DBS_StressedMSME_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit pure146 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure146 = createUnitIfNotExist(pure146, "PURE", "http://www.xbrl.org/2003/instance","pure", unitElements);
                                    
                                
                                
                                // - TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD
                                
                                    Map zeroDBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMap149 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDValue148 = DBS16ReportUtil.retrieveValueForElement(field.getTenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD(), zeroDBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDMap149);

                                        
                                        Context DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDContext147 = DBS16ReportContextUtil.createAsOfContextDBS_StressedMSME_Layout1( bankCode, periodDate ,nameOfBorrowerAxis,borrowerPermanentAccountNumberAxis,eligibleMicroSmallAndMediumEnterprisesEntityNameAxis,mSMEEntityPermanentAccountNumberAxis,stateAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDValue148 != null && !"".equals(zeroDBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDValue148)) {
                                        
                                        addContext(DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDContext147, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        DecimalItemType tenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDValue150 = new DecimalItemType();
                                        tenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDValue150.setContextRef(DBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDContext147);
                                        
                                            tenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDValue150.setUnitRef(pure146);
                                            tenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDValue150.setDecimals("INF");
                                            tenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDValue150.setValue(new BigDecimal(zeroDBS_StressedMSME_Layout1TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDValue148));
                                        
                                        
                                        JAXBElement<DecimalItemType> tenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDElement151 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD(tenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDValue150);
                                        bodyElements.add(tenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSDElement151);
                                    }
                                
                            
                            
                                // start create element for report of DBS_StressedMSME_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR152 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR152 = createUnitIfNotExist(INR152, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate
                                
                                    Map zeroDBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMap155 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateValue154 = DBS16ReportUtil.retrieveValueForElement(field.getCurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate(), zeroDBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateMap155);

                                        
                                        Context DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateContext153 = DBS16ReportContextUtil.createAsOfContextDBS_StressedMSME_Layout1( bankCode, periodDate ,nameOfBorrowerAxis,borrowerPermanentAccountNumberAxis,eligibleMicroSmallAndMediumEnterprisesEntityNameAxis,mSMEEntityPermanentAccountNumberAxis,stateAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateValue154 != null && !"".equals(zeroDBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateValue154)) {
                                        
                                        addContext(DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateContext153, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType currentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateValue156 = new MonetaryItemType();
                                        currentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateValue156.setContextRef(DBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateContext153);
                                        
                                            currentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateValue156.setUnitRef(INR152);
                                            currentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateValue156.setDecimals("INF");
                                            currentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateValue156.setValue(new BigDecimal(zeroDBS_StressedMSME_Layout1CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateValue154));
                                        
                                        
                                        JAXBElement<MonetaryItemType> currentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateElement157 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createCurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate(currentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateValue156);
                                        bodyElements.add(currentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDateElement157);
                                    }
                                
                            
                            
                                // start create element for report of DBS_StressedMSME_Layout1
                                // create unit if not empty
                                
                                
                                // - LoanOutstandingClassificationUnderCGSSDAsOnReportingDate
                                
                                    Map zeroDBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMap160 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateValue159 = DBS16ReportUtil.retrieveValueForElement(field.getLoanOutstandingClassificationUnderCGSSDAsOnReportingDate(), zeroDBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateMap160);

                                        
                                        Context DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateContext158 = DBS16ReportContextUtil.createAsOfContextDBS_StressedMSME_Layout1( bankCode, periodDate ,nameOfBorrowerAxis,borrowerPermanentAccountNumberAxis,eligibleMicroSmallAndMediumEnterprisesEntityNameAxis,mSMEEntityPermanentAccountNumberAxis,stateAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateValue159 != null && !"".equals(zeroDBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateValue159)) {
                                        
                                        addContext(DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateContext158, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        LoanOrAccountClassification loanOutstandingClassificationUnderCGSSDAsOnReportingDateValue161 = new LoanOrAccountClassification();
                                        loanOutstandingClassificationUnderCGSSDAsOnReportingDateValue161.setContextRef(DBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateContext158);
                                        
                                            loanOutstandingClassificationUnderCGSSDAsOnReportingDateValue161.setValue(zeroDBS_StressedMSME_Layout1LoanOutstandingClassificationUnderCGSSDAsOnReportingDateValue159);        
                                        
                                        
                                        JAXBElement<LoanOrAccountClassification> loanOutstandingClassificationUnderCGSSDAsOnReportingDateElement162 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createLoanOutstandingClassificationUnderCGSSDAsOnReportingDate(loanOutstandingClassificationUnderCGSSDAsOnReportingDateValue161);
                                        bodyElements.add(loanOutstandingClassificationUnderCGSSDAsOnReportingDateElement162);
                                    }
                                
                            
                            
                                // start create element for report of DBS_StressedMSME_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR163 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR163 = createUnitIfNotExist(INR163, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate
                                
                                    Map zeroDBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMap166 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateValue165 = DBS16ReportUtil.retrieveValueForElement(field.getCurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate(), zeroDBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateMap166);

                                        
                                        Context DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateContext164 = DBS16ReportContextUtil.createAsOfContextDBS_StressedMSME_Layout1( bankCode, periodDate ,nameOfBorrowerAxis,borrowerPermanentAccountNumberAxis,eligibleMicroSmallAndMediumEnterprisesEntityNameAxis,mSMEEntityPermanentAccountNumberAxis,stateAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateValue165 != null && !"".equals(zeroDBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateValue165)) {
                                        
                                        addContext(DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateContext164, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType currentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateValue167 = new MonetaryItemType();
                                        currentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateValue167.setContextRef(DBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateContext164);
                                        
                                            currentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateValue167.setUnitRef(INR163);
                                            currentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateValue167.setDecimals("INF");
                                            currentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateValue167.setValue(new BigDecimal(zeroDBS_StressedMSME_Layout1CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateValue165));
                                        
                                        
                                        JAXBElement<MonetaryItemType> currentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateElement168 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createCurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate(currentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateValue167);
                                        bodyElements.add(currentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDateElement168);
                                    }
                                
                            
                            
                                // start create element for report of DBS_StressedMSME_Layout1
                                // create unit if not empty
                                
                                
                                // - MSMEAccountClassificationAsOnReportingDate
                                
                                    Map zeroDBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMap171 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateValue170 = DBS16ReportUtil.retrieveValueForElement(field.getMSMEAccountClassificationAsOnReportingDate(), zeroDBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateMap171);

                                        
                                        Context DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateContext169 = DBS16ReportContextUtil.createAsOfContextDBS_StressedMSME_Layout1( bankCode, periodDate ,nameOfBorrowerAxis,borrowerPermanentAccountNumberAxis,eligibleMicroSmallAndMediumEnterprisesEntityNameAxis,mSMEEntityPermanentAccountNumberAxis,stateAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateValue170 != null && !"".equals(zeroDBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateValue170)) {
                                        
                                        addContext(DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateContext169, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        LoanOrAccountClassification mSMEAccountClassificationAsOnReportingDateValue172 = new LoanOrAccountClassification();
                                        mSMEAccountClassificationAsOnReportingDateValue172.setContextRef(DBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateContext169);
                                        
                                            mSMEAccountClassificationAsOnReportingDateValue172.setValue(zeroDBS_StressedMSME_Layout1MSMEAccountClassificationAsOnReportingDateValue170);        
                                        
                                        
                                        JAXBElement<LoanOrAccountClassification> mSMEAccountClassificationAsOnReportingDateElement173 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createMSMEAccountClassificationAsOnReportingDate(mSMEAccountClassificationAsOnReportingDateValue172);
                                        bodyElements.add(mSMEAccountClassificationAsOnReportingDateElement173);
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
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryMap176 = new HashMap<String, String>();
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryValue175 = DBS16ReportUtil.retrieveValueForElement(field.getNameOfSignatory(), zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryMap176);

                                    
                                        Context DBS_AuthorisedSignatory_Layout1NameOfSignatoryContext174 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryValue175 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryValue175)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1NameOfSignatoryContext174, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType nameOfSignatoryValue177 = new StringItemType();
                                    nameOfSignatoryValue177.setContextRef(DBS_AuthorisedSignatory_Layout1NameOfSignatoryContext174);
                                    
                                    nameOfSignatoryValue177.setValue(zeroDBS_AuthorisedSignatory_Layout1NameOfSignatoryValue175);        
                                    
                                    
                                    JAXBElement<StringItemType> nameOfSignatoryElement178 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNameOfSignatory(nameOfSignatoryValue177);
                                    bodyElements.add(nameOfSignatoryElement178);
                                
                            }
                        
                            
                            // - DesignationOfSignatory
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryMap181 = new HashMap<String, String>();
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryValue180 = DBS16ReportUtil.retrieveValueForElement(field.getDesignationOfSignatory(), zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryMap181);

                                    
                                        Context DBS_AuthorisedSignatory_Layout1DesignationOfSignatoryContext179 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryValue180 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryValue180)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1DesignationOfSignatoryContext179, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType designationOfSignatoryValue182 = new StringItemType();
                                    designationOfSignatoryValue182.setContextRef(DBS_AuthorisedSignatory_Layout1DesignationOfSignatoryContext179);
                                    
                                    designationOfSignatoryValue182.setValue(zeroDBS_AuthorisedSignatory_Layout1DesignationOfSignatoryValue180);        
                                    
                                    
                                    JAXBElement<StringItemType> designationOfSignatoryElement183 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createDesignationOfSignatory(designationOfSignatoryValue182);
                                    bodyElements.add(designationOfSignatoryElement183);
                                
                            }
                        
                            
                            // - AuthorisedSignatoryOfficialLandlineNumber
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberMap186 = new HashMap<String, String>();
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue185 = DBS16ReportUtil.retrieveValueForElement(field.getAuthorisedSignatoryOfficialLandlineNumber(), zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberMap186);

                                    
                                        Context DBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext184 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue185 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue185)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext184, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType authorisedSignatoryOfficialLandlineNumberValue187 = new StringItemType();
                                    authorisedSignatoryOfficialLandlineNumberValue187.setContextRef(DBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext184);
                                    
                                    authorisedSignatoryOfficialLandlineNumberValue187.setValue(zeroDBS_AuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue185);        
                                    
                                    
                                    JAXBElement<StringItemType> authorisedSignatoryOfficialLandlineNumberElement188 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createAuthorisedSignatoryOfficialLandlineNumber(authorisedSignatoryOfficialLandlineNumberValue187);
                                    bodyElements.add(authorisedSignatoryOfficialLandlineNumberElement188);
                                
                            }
                        
                            
                            // - MobileNumberOfAuthorisedSignatory
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryMap191 = new HashMap<String, String>();
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue190 = DBS16ReportUtil.retrieveValueForElement(field.getMobileNumberOfAuthorisedSignatory(), zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryMap191);

                                    
                                        Context DBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext189 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue190 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue190)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext189, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType mobileNumberOfAuthorisedSignatoryValue192 = new StringItemType();
                                    mobileNumberOfAuthorisedSignatoryValue192.setContextRef(DBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext189);
                                    
                                    mobileNumberOfAuthorisedSignatoryValue192.setValue(zeroDBS_AuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue190);        
                                    
                                    
                                    JAXBElement<StringItemType> mobileNumberOfAuthorisedSignatoryElement193 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createMobileNumberOfAuthorisedSignatory(mobileNumberOfAuthorisedSignatoryValue192);
                                    bodyElements.add(mobileNumberOfAuthorisedSignatoryElement193);
                                
                            }
                        
                            
                            // - EMailIDOfAuthorisedReportingOfficial
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialMap196 = new HashMap<String, String>();
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue195 = DBS16ReportUtil.retrieveValueForElement(field.getEMailIDOfAuthorisedReportingOfficial(), zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialMap196);

                                    
                                        Context DBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext194 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue195 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue195)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext194, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType eMailIDOfAuthorisedReportingOfficialValue197 = new StringItemType();
                                    eMailIDOfAuthorisedReportingOfficialValue197.setContextRef(DBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext194);
                                    
                                    eMailIDOfAuthorisedReportingOfficialValue197.setValue(zeroDBS_AuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue195);        
                                    
                                    
                                    JAXBElement<StringItemType> eMailIDOfAuthorisedReportingOfficialElement198 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createEMailIDOfAuthorisedReportingOfficial(eMailIDOfAuthorisedReportingOfficialValue197);
                                    bodyElements.add(eMailIDOfAuthorisedReportingOfficialElement198);
                                
                            }
                        
                            
                            // - Remarks
                            
                                Map zeroDBS_AuthorisedSignatory_Layout1RemarksMap201 = new HashMap<String, String>();
                                
                                    
                                    String zeroDBS_AuthorisedSignatory_Layout1RemarksValue200 = DBS16ReportUtil.retrieveValueForElement(field.getRemarks(), zeroDBS_AuthorisedSignatory_Layout1RemarksMap201);

                                    
                                        Context DBS_AuthorisedSignatory_Layout1RemarksContext199 = DBS16ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBS_AuthorisedSignatory_Layout1RemarksValue200 != null && !"".equals(zeroDBS_AuthorisedSignatory_Layout1RemarksValue200)) {
                                    
                                    addContext(DBS_AuthorisedSignatory_Layout1RemarksContext199, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType remarksValue202 = new StringItemType();
                                    remarksValue202.setContextRef(DBS_AuthorisedSignatory_Layout1RemarksContext199);
                                    
                                    remarksValue202.setValue(zeroDBS_AuthorisedSignatory_Layout1RemarksValue200);        
                                    
                                    
                                    JAXBElement<StringItemType> remarksElement203 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createRemarks(remarksValue202);
                                    bodyElements.add(remarksElement203);
                                
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
    
    

