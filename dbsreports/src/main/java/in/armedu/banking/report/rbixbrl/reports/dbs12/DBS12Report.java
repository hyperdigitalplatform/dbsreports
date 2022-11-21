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
                
                    private String filingInfo_Layout1Method(FilingInfo_Layout1 filingInfo_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDate, String endDate, String periodDate)
                
                    {
            
                    FilingInfo_Layout1 field = filingInfo_Layout1;
                    
                    
                        
                        
                            
                            // - ReturnName
                            
                                Map zeroFilingInfo_Layout1ReturnNameMap3 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout1ReturnNameValue2 = DBS12ReportUtil.retrieveValueForElement(field.getReturnName(), zeroFilingInfo_Layout1ReturnNameMap3);

                                    
                                        Context FilingInfo_Layout1ReturnNameContext1 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                    
                                    String zeroFilingInfo_Layout1ReturnCodeValue7 = DBS12ReportUtil.retrieveValueForElement(field.getReturnCode(), zeroFilingInfo_Layout1ReturnCodeMap8);

                                    
                                        Context FilingInfo_Layout1ReturnCodeContext6 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                    
                                    String zeroFilingInfo_Layout1NameOfReportingInstitutionValue12 = DBS12ReportUtil.retrieveValueForElement(field.getNameOfReportingInstitution(), zeroFilingInfo_Layout1NameOfReportingInstitutionMap13);

                                    
                                        Context FilingInfo_Layout1NameOfReportingInstitutionContext11 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                    
                                    String zeroFilingInfo_Layout1BankCodeValue17 = DBS12ReportUtil.retrieveValueForElement(field.getBankCode(), zeroFilingInfo_Layout1BankCodeMap18);

                                    
                                    Context FilingInfo_Layout1BankCodeContext16 = DBS12ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
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
                                
                                    
                                    String zeroFilingInfo_Layout1InstitutionTypeValue22 = DBS12ReportUtil.retrieveValueForElement(field.getInstitutionType(), zeroFilingInfo_Layout1InstitutionTypeMap23);

                                    
                                        Context FilingInfo_Layout1InstitutionTypeContext21 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingFrequencyValue27 = DBS12ReportUtil.retrieveValueForElement(field.getReportingFrequency(), zeroFilingInfo_Layout1ReportingFrequencyMap28);

                                    
                                        Context FilingInfo_Layout1ReportingFrequencyContext26 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingPeriodStartDateValue32 = DBS12ReportUtil.retrieveValueForElement(field.getReportingPeriodStartDate(), zeroFilingInfo_Layout1ReportingPeriodStartDateMap33);

                                    
                                    Context FilingInfo_Layout1ReportingPeriodStartDateContext31 = DBS12ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout1ReportingPeriodStartDateValue32 != null && !"".equals(zeroFilingInfo_Layout1ReportingPeriodStartDateValue32)) {
                                    
                                    addContext(FilingInfo_Layout1ReportingPeriodStartDateContext31, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    DateItemType reportingPeriodStartDateValue34 = new DateItemType();
                                    reportingPeriodStartDateValue34.setContextRef(FilingInfo_Layout1ReportingPeriodStartDateContext31);
                                    
                                    reportingPeriodStartDateValue34.setValue(DBS12ReportContextUtil.toXMLGeo(zeroFilingInfo_Layout1ReportingPeriodStartDateValue32));
                                    
                                    
                                    JAXBElement<DateItemType> reportingPeriodStartDateElement35 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReportingPeriodStartDate(reportingPeriodStartDateValue34);
                                    bodyElements.add(reportingPeriodStartDateElement35);
                                
                            }
                        
                            
                            // - ReportingPeriodEndDate
                            
                                Map zeroFilingInfo_Layout1ReportingPeriodEndDateMap38 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingPeriodEndDateValue37 = DBS12ReportUtil.retrieveValueForElement(field.getReportingPeriodEndDate(), zeroFilingInfo_Layout1ReportingPeriodEndDateMap38);

                                    
                                    Context FilingInfo_Layout1ReportingPeriodEndDateContext36 = DBS12ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout1ReportingPeriodEndDateValue37 != null && !"".equals(zeroFilingInfo_Layout1ReportingPeriodEndDateValue37)) {
                                    
                                    addContext(FilingInfo_Layout1ReportingPeriodEndDateContext36, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    DateItemType reportingPeriodEndDateValue39 = new DateItemType();
                                    reportingPeriodEndDateValue39.setContextRef(FilingInfo_Layout1ReportingPeriodEndDateContext36);
                                    
                                    reportingPeriodEndDateValue39.setValue(DBS12ReportContextUtil.toXMLGeo(zeroFilingInfo_Layout1ReportingPeriodEndDateValue37));
                                    
                                    
                                    JAXBElement<DateItemType> reportingPeriodEndDateElement40 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createReportingPeriodEndDate(reportingPeriodEndDateValue39);
                                    bodyElements.add(reportingPeriodEndDateElement40);
                                
                            }
                        
                            
                            // - ReportingCurrency
                            
                                Map zeroFilingInfo_Layout1ReportingCurrencyMap43 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingCurrencyValue42 = DBS12ReportUtil.retrieveValueForElement(field.getReportingCurrency(), zeroFilingInfo_Layout1ReportingCurrencyMap43);

                                    
                                        Context FilingInfo_Layout1ReportingCurrencyContext41 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                    
                                    String zeroFilingInfo_Layout1ReportingScaleValue47 = DBS12ReportUtil.retrieveValueForElement(field.getReportingScale(), zeroFilingInfo_Layout1ReportingScaleMap48);

                                    
                                        Context FilingInfo_Layout1ReportingScaleContext46 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                    
                                    String zeroFilingInfo_Layout1TaxonomyVersionValue52 = DBS12ReportUtil.retrieveValueForElement(field.getTaxonomyVersion(), zeroFilingInfo_Layout1TaxonomyVersionMap53);

                                    
                                        Context FilingInfo_Layout1TaxonomyVersionContext51 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                    
                                    String zeroFilingInfo_Layout1ToolNameValue57 = DBS12ReportUtil.retrieveValueForElement(field.getToolName(), zeroFilingInfo_Layout1ToolNameMap58);

                                    
                                        Context FilingInfo_Layout1ToolNameContext56 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                    
                                    String zeroFilingInfo_Layout1ToolVersionValue62 = DBS12ReportUtil.retrieveValueForElement(field.getToolVersion(), zeroFilingInfo_Layout1ToolVersionMap63);

                                    
                                        Context FilingInfo_Layout1ToolVersionContext61 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                    
                                    String zeroFilingInfo_Layout1ReportStatusValue67 = DBS12ReportUtil.retrieveValueForElement(field.getReportStatus(), zeroFilingInfo_Layout1ReportStatusMap68);

                                    
                                        Context FilingInfo_Layout1ReportStatusContext66 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                                
                                    
                                    String zeroFilingInfo_Layout1DateOfAuditValue72 = DBS12ReportUtil.retrieveValueForElement(field.getDateOfAudit(), zeroFilingInfo_Layout1DateOfAuditMap73);

                                    
                                    Context FilingInfo_Layout1DateOfAuditContext71 = DBS12ReportContextUtil.createAsOfContext( bankCode, periodDate  );
                                        
                                    
                                
                                if(zeroFilingInfo_Layout1DateOfAuditValue72 != null && !"".equals(zeroFilingInfo_Layout1DateOfAuditValue72)) {
                                    
                                    addContext(FilingInfo_Layout1DateOfAuditContext71, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    DateItemType dateOfAuditValue74 = new DateItemType();
                                    dateOfAuditValue74.setContextRef(FilingInfo_Layout1DateOfAuditContext71);
                                    
                                    dateOfAuditValue74.setValue(DBS12ReportContextUtil.toXMLGeo(zeroFilingInfo_Layout1DateOfAuditValue72));
                                    
                                    
                                    JAXBElement<DateItemType> dateOfAuditElement75 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createDateOfAudit(dateOfAuditValue74);
                                    bodyElements.add(dateOfAuditElement75);
                                
                            }
                        
                            
                            // - GeneralRemarks
                            
                                Map zeroFilingInfo_Layout1GeneralRemarksMap78 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout1GeneralRemarksValue77 = DBS12ReportUtil.retrieveValueForElement(field.getGeneralRemarks(), zeroFilingInfo_Layout1GeneralRemarksMap78);

                                    
                                        Context FilingInfo_Layout1GeneralRemarksContext76 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
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
                    
                    
                        
                        
                            
                            // - WhetherBankSubmittingTheReturnIsForeignBank
                            
                                Map zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankMap83 = new HashMap<String, String>();
                                
                                    
                                    String zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankValue82 = DBS12ReportUtil.retrieveValueForElement(field.getWhetherBankSubmittingTheReturnIsForeignBank(), zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankMap83);

                                    
                                        Context FilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankContext81 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankValue82 != null && !"".equals(zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankValue82)) {
                                    
                                    addContext(FilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankContext81, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    BooleanItemType whetherBankSubmittingTheReturnIsForeignBankValue84 = new BooleanItemType();
                                    whetherBankSubmittingTheReturnIsForeignBankValue84.setContextRef(FilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankContext81);
                                    
                                        whetherBankSubmittingTheReturnIsForeignBankValue84.setValue(Boolean.getBoolean(zeroFilingInfo_Layout2WhetherBankSubmittingTheReturnIsForeignBankValue82));
                                    
                                    
                                    JAXBElement<BooleanItemType> whetherBankSubmittingTheReturnIsForeignBankElement85 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createWhetherBankSubmittingTheReturnIsForeignBank(whetherBankSubmittingTheReturnIsForeignBankValue84);
                                    bodyElements.add(whetherBankSubmittingTheReturnIsForeignBankElement85);
                                
                            }
                        
                        
                    
                    
            
                    
                    
                    
                    return "";
                    }

                
                    
                
                // if typemembers exist
                
                
                
                // create variable for subclass DBS12_SectionA_Layout1 if any typeMembers then List or Single
                //List<DBS12_SectionA_Layout1> dBS12_SectionA_Layout1 = mainReportData.getDBS12_SectionA_Layout1();
                
                
                // if typemembers exist
                
                    private String dBS12_SectionA_Layout1Method(List<DBS12_SectionA_Layout1> dBS12_SectionA_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDate, String endDate, String periodDate)
                    {
                    dBS12_SectionA_Layout1.forEach((field)->{
                        // crate variable loop  for type member
                        
                            // create variable for type member NameOfEntityAxis
                            String nameOfEntityAxis = field.getNameOfEntityAxis();
                        
                        // end create variable loop for type member
                        
                        // if explict member is empty
                        
                            // create xbrl report element
                            
                                // start create element for report of DBS12_SectionA_Layout1
                                // create unit if not empty
                                
                                
                                // - TypeOfEntity
                                
                                    Map zeroDBS12_SectionA_Layout1TypeOfEntityMap88 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionA_Layout1TypeOfEntityValue87 = DBS12ReportUtil.retrieveValueForElement(field.getTypeOfEntity(), zeroDBS12_SectionA_Layout1TypeOfEntityMap88);

                                        
                                            Context DBS12_SectionA_Layout1TypeOfEntityContext86 = DBS12ReportContextUtil.createFromToContextDBS12_SectionA_Layout1( bankCode, startDate, endDate ,nameOfEntityAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionA_Layout1TypeOfEntityValue87 != null && !"".equals(zeroDBS12_SectionA_Layout1TypeOfEntityValue87)) {
                                        
                                        addContext(DBS12_SectionA_Layout1TypeOfEntityContext86, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        TypeOfEntity typeOfEntityValue89 = new TypeOfEntity();
                                        typeOfEntityValue89.setContextRef(DBS12_SectionA_Layout1TypeOfEntityContext86);
                                        
                                            typeOfEntityValue89.setValue(zeroDBS12_SectionA_Layout1TypeOfEntityValue87);        
                                        
                                        
                                        JAXBElement<TypeOfEntity> typeOfEntityElement90 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTypeOfEntity(typeOfEntityValue89);
                                        bodyElements.add(typeOfEntityElement90);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionA_Layout1
                                // create unit if not empty
                                
                                
                                // - FinancialClassification
                                
                                    Map zeroDBS12_SectionA_Layout1FinancialClassificationMap93 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionA_Layout1FinancialClassificationValue92 = DBS12ReportUtil.retrieveValueForElement(field.getFinancialClassification(), zeroDBS12_SectionA_Layout1FinancialClassificationMap93);

                                        
                                            Context DBS12_SectionA_Layout1FinancialClassificationContext91 = DBS12ReportContextUtil.createFromToContextDBS12_SectionA_Layout1( bankCode, startDate, endDate ,nameOfEntityAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionA_Layout1FinancialClassificationValue92 != null && !"".equals(zeroDBS12_SectionA_Layout1FinancialClassificationValue92)) {
                                        
                                        addContext(DBS12_SectionA_Layout1FinancialClassificationContext91, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        FinancialClassification financialClassificationValue94 = new FinancialClassification();
                                        financialClassificationValue94.setContextRef(DBS12_SectionA_Layout1FinancialClassificationContext91);
                                        
                                            financialClassificationValue94.setValue(zeroDBS12_SectionA_Layout1FinancialClassificationValue92);        
                                        
                                        
                                        JAXBElement<FinancialClassification> financialClassificationElement95 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createFinancialClassification(financialClassificationValue94);
                                        bodyElements.add(financialClassificationElement95);
                                    }
                                
                            
                            
                            
                        
                        
                
                        
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBS12_SectionB_Layout1 if any typeMembers then List or Single
                //List<DBS12_SectionB_Layout1> dBS12_SectionB_Layout1 = mainReportData.getDBS12_SectionB_Layout1();
                
                
                // if typemembers exist
                
                    private String dBS12_SectionB_Layout1Method(List<DBS12_SectionB_Layout1> dBS12_SectionB_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDate, String endDate, String periodDate)
                    {
                    dBS12_SectionB_Layout1.forEach((field)->{
                        // crate variable loop  for type member
                        
                            // create variable for type member NameOfEntityAxis
                            String nameOfEntityAxis = field.getNameOfEntityAxis();
                        
                        // end create variable loop for type member
                        
                        // if explict member is empty
                        
                            // create xbrl report element
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                
                                // - TypeOfEntity
                                
                                    Map zeroDBS12_SectionB_Layout1TypeOfEntityMap98 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1TypeOfEntityValue97 = DBS12ReportUtil.retrieveValueForElement(field.getTypeOfEntity(), zeroDBS12_SectionB_Layout1TypeOfEntityMap98);

                                        
                                            Context DBS12_SectionB_Layout1TypeOfEntityContext96 = DBS12ReportContextUtil.createFromToContextDBS12_SectionB_Layout1( bankCode, startDate, endDate ,nameOfEntityAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1TypeOfEntityValue97 != null && !"".equals(zeroDBS12_SectionB_Layout1TypeOfEntityValue97)) {
                                        
                                        addContext(DBS12_SectionB_Layout1TypeOfEntityContext96, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        TypeOfEntity typeOfEntityValue99 = new TypeOfEntity();
                                        typeOfEntityValue99.setContextRef(DBS12_SectionB_Layout1TypeOfEntityContext96);
                                        
                                            typeOfEntityValue99.setValue(zeroDBS12_SectionB_Layout1TypeOfEntityValue97);        
                                        
                                        
                                        JAXBElement<TypeOfEntity> typeOfEntityElement100 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTypeOfEntity(typeOfEntityValue99);
                                        bodyElements.add(typeOfEntityElement100);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                
                                // - FinancialClassification
                                
                                    Map zeroDBS12_SectionB_Layout1FinancialClassificationMap103 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1FinancialClassificationValue102 = DBS12ReportUtil.retrieveValueForElement(field.getFinancialClassification(), zeroDBS12_SectionB_Layout1FinancialClassificationMap103);

                                        
                                            Context DBS12_SectionB_Layout1FinancialClassificationContext101 = DBS12ReportContextUtil.createFromToContextDBS12_SectionB_Layout1( bankCode, startDate, endDate ,nameOfEntityAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1FinancialClassificationValue102 != null && !"".equals(zeroDBS12_SectionB_Layout1FinancialClassificationValue102)) {
                                        
                                        addContext(DBS12_SectionB_Layout1FinancialClassificationContext101, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        FinancialClassification financialClassificationValue104 = new FinancialClassification();
                                        financialClassificationValue104.setContextRef(DBS12_SectionB_Layout1FinancialClassificationContext101);
                                        
                                            financialClassificationValue104.setValue(zeroDBS12_SectionB_Layout1FinancialClassificationValue102);        
                                        
                                        
                                        JAXBElement<FinancialClassification> financialClassificationElement105 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createFinancialClassification(financialClassificationValue104);
                                        bodyElements.add(financialClassificationElement105);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR106 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR106 = createUnitIfNotExist(INR106, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - BanksEquityInvestmentInTheCompany
                                
                                    Map zeroDBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyMap109 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyValue108 = DBS12ReportUtil.retrieveValueForElement(field.getBanksEquityInvestmentInTheCompany(), zeroDBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyMap109);

                                        
                                        Context DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyContext107 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionB_Layout1( bankCode, periodDate ,nameOfEntityAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyValue108 != null && !"".equals(zeroDBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyValue108)) {
                                        
                                        addContext(DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyContext107, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType banksEquityInvestmentInTheCompanyValue110 = new MonetaryItemType();
                                        banksEquityInvestmentInTheCompanyValue110.setContextRef(DBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyContext107);
                                        
                                            banksEquityInvestmentInTheCompanyValue110.setUnitRef(INR106);
                                            banksEquityInvestmentInTheCompanyValue110.setDecimals("INF");
                                            banksEquityInvestmentInTheCompanyValue110.setValue(new BigDecimal(zeroDBS12_SectionB_Layout1BanksEquityInvestmentInTheCompanyValue108));
                                        
                                        
                                        JAXBElement<MonetaryItemType> banksEquityInvestmentInTheCompanyElement111 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createBanksEquityInvestmentInTheCompany(banksEquityInvestmentInTheCompanyValue110);
                                        bodyElements.add(banksEquityInvestmentInTheCompanyElement111);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit pure112 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("PURE")).findAny().orElse(null);
                                    pure112 = createUnitIfNotExist(pure112, "PURE", "http://www.xbrl.org/2003/instance","pure", unitElements);
                                    
                                
                                
                                // - BanksPercentageInvestmentInCompanyEquity
                                
                                    Map zeroDBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityMap115 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityValue114 = DBS12ReportUtil.retrieveValueForElement(field.getBanksPercentageInvestmentInCompanyEquity(), zeroDBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityMap115);

                                        
                                        Context DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityContext113 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionB_Layout1( bankCode, periodDate ,nameOfEntityAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityValue114 != null && !"".equals(zeroDBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityValue114)) {
                                        
                                        addContext(DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityContext113, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        PureItemType banksPercentageInvestmentInCompanyEquityValue116 = new PureItemType();
                                        banksPercentageInvestmentInCompanyEquityValue116.setContextRef(DBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityContext113);
                                        
                                            banksPercentageInvestmentInCompanyEquityValue116.setUnitRef(pure112);
                                            banksPercentageInvestmentInCompanyEquityValue116.setDecimals("INF");
                                            banksPercentageInvestmentInCompanyEquityValue116.setValue(new BigDecimal(zeroDBS12_SectionB_Layout1BanksPercentageInvestmentInCompanyEquityValue114));
                                        
                                        
                                        JAXBElement<PureItemType> banksPercentageInvestmentInCompanyEquityElement117 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createBanksPercentageInvestmentInCompanyEquity(banksPercentageInvestmentInCompanyEquityValue116);
                                        bodyElements.add(banksPercentageInvestmentInCompanyEquityElement117);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR118 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR118 = createUnitIfNotExist(INR118, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - AggregateAmountOutstandingForFundedExposure
                                
                                    Map zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureMap121 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureValue120 = DBS12ReportUtil.retrieveValueForElement(field.getAggregateAmountOutstandingForFundedExposure(), zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureMap121);

                                        
                                        Context DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureContext119 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionB_Layout1( bankCode, periodDate ,nameOfEntityAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureValue120 != null && !"".equals(zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureValue120)) {
                                        
                                        addContext(DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureContext119, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType aggregateAmountOutstandingForFundedExposureValue122 = new MonetaryItemType();
                                        aggregateAmountOutstandingForFundedExposureValue122.setContextRef(DBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureContext119);
                                        
                                            aggregateAmountOutstandingForFundedExposureValue122.setUnitRef(INR118);
                                            aggregateAmountOutstandingForFundedExposureValue122.setDecimals("INF");
                                            aggregateAmountOutstandingForFundedExposureValue122.setValue(new BigDecimal(zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForFundedExposureValue120));
                                        
                                        
                                        JAXBElement<MonetaryItemType> aggregateAmountOutstandingForFundedExposureElement123 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAggregateAmountOutstandingForFundedExposure(aggregateAmountOutstandingForFundedExposureValue122);
                                        bodyElements.add(aggregateAmountOutstandingForFundedExposureElement123);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR124 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR124 = createUnitIfNotExist(INR124, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - FundedCreditExposure
                                
                                    Map zeroDBS12_SectionB_Layout1FundedCreditExposureMap127 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1FundedCreditExposureValue126 = DBS12ReportUtil.retrieveValueForElement(field.getFundedCreditExposure(), zeroDBS12_SectionB_Layout1FundedCreditExposureMap127);

                                        
                                        Context DBS12_SectionB_Layout1FundedCreditExposureContext125 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionB_Layout1( bankCode, periodDate ,nameOfEntityAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1FundedCreditExposureValue126 != null && !"".equals(zeroDBS12_SectionB_Layout1FundedCreditExposureValue126)) {
                                        
                                        addContext(DBS12_SectionB_Layout1FundedCreditExposureContext125, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType fundedCreditExposureValue128 = new MonetaryItemType();
                                        fundedCreditExposureValue128.setContextRef(DBS12_SectionB_Layout1FundedCreditExposureContext125);
                                        
                                            fundedCreditExposureValue128.setUnitRef(INR124);
                                            fundedCreditExposureValue128.setDecimals("INF");
                                            fundedCreditExposureValue128.setValue(new BigDecimal(zeroDBS12_SectionB_Layout1FundedCreditExposureValue126));
                                        
                                        
                                        JAXBElement<MonetaryItemType> fundedCreditExposureElement129 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createFundedCreditExposure(fundedCreditExposureValue128);
                                        bodyElements.add(fundedCreditExposureElement129);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR130 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR130 = createUnitIfNotExist(INR130, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - AggregateAmountOutstandingForNonFundedExposure
                                
                                    Map zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureMap133 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureValue132 = DBS12ReportUtil.retrieveValueForElement(field.getAggregateAmountOutstandingForNonFundedExposure(), zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureMap133);

                                        
                                        Context DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureContext131 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionB_Layout1( bankCode, periodDate ,nameOfEntityAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureValue132 != null && !"".equals(zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureValue132)) {
                                        
                                        addContext(DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureContext131, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType aggregateAmountOutstandingForNonFundedExposureValue134 = new MonetaryItemType();
                                        aggregateAmountOutstandingForNonFundedExposureValue134.setContextRef(DBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureContext131);
                                        
                                            aggregateAmountOutstandingForNonFundedExposureValue134.setUnitRef(INR130);
                                            aggregateAmountOutstandingForNonFundedExposureValue134.setDecimals("INF");
                                            aggregateAmountOutstandingForNonFundedExposureValue134.setValue(new BigDecimal(zeroDBS12_SectionB_Layout1AggregateAmountOutstandingForNonFundedExposureValue132));
                                        
                                        
                                        JAXBElement<MonetaryItemType> aggregateAmountOutstandingForNonFundedExposureElement135 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAggregateAmountOutstandingForNonFundedExposure(aggregateAmountOutstandingForNonFundedExposureValue134);
                                        bodyElements.add(aggregateAmountOutstandingForNonFundedExposureElement135);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR136 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR136 = createUnitIfNotExist(INR136, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - NonFundedCreditExposure
                                
                                    Map zeroDBS12_SectionB_Layout1NonFundedCreditExposureMap139 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1NonFundedCreditExposureValue138 = DBS12ReportUtil.retrieveValueForElement(field.getNonFundedCreditExposure(), zeroDBS12_SectionB_Layout1NonFundedCreditExposureMap139);

                                        
                                        Context DBS12_SectionB_Layout1NonFundedCreditExposureContext137 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionB_Layout1( bankCode, periodDate ,nameOfEntityAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1NonFundedCreditExposureValue138 != null && !"".equals(zeroDBS12_SectionB_Layout1NonFundedCreditExposureValue138)) {
                                        
                                        addContext(DBS12_SectionB_Layout1NonFundedCreditExposureContext137, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType nonFundedCreditExposureValue140 = new MonetaryItemType();
                                        nonFundedCreditExposureValue140.setContextRef(DBS12_SectionB_Layout1NonFundedCreditExposureContext137);
                                        
                                            nonFundedCreditExposureValue140.setUnitRef(INR136);
                                            nonFundedCreditExposureValue140.setDecimals("INF");
                                            nonFundedCreditExposureValue140.setValue(new BigDecimal(zeroDBS12_SectionB_Layout1NonFundedCreditExposureValue138));
                                        
                                        
                                        JAXBElement<MonetaryItemType> nonFundedCreditExposureElement141 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNonFundedCreditExposure(nonFundedCreditExposureValue140);
                                        bodyElements.add(nonFundedCreditExposureElement141);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR142 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR142 = createUnitIfNotExist(INR142, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - AggregateInvestmentExposure
                                
                                    Map zeroDBS12_SectionB_Layout1AggregateInvestmentExposureMap145 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1AggregateInvestmentExposureValue144 = DBS12ReportUtil.retrieveValueForElement(field.getAggregateInvestmentExposure(), zeroDBS12_SectionB_Layout1AggregateInvestmentExposureMap145);

                                        
                                        Context DBS12_SectionB_Layout1AggregateInvestmentExposureContext143 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionB_Layout1( bankCode, periodDate ,nameOfEntityAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1AggregateInvestmentExposureValue144 != null && !"".equals(zeroDBS12_SectionB_Layout1AggregateInvestmentExposureValue144)) {
                                        
                                        addContext(DBS12_SectionB_Layout1AggregateInvestmentExposureContext143, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType aggregateInvestmentExposureValue146 = new MonetaryItemType();
                                        aggregateInvestmentExposureValue146.setContextRef(DBS12_SectionB_Layout1AggregateInvestmentExposureContext143);
                                        
                                            aggregateInvestmentExposureValue146.setUnitRef(INR142);
                                            aggregateInvestmentExposureValue146.setDecimals("INF");
                                            aggregateInvestmentExposureValue146.setValue(new BigDecimal(zeroDBS12_SectionB_Layout1AggregateInvestmentExposureValue144));
                                        
                                        
                                        JAXBElement<MonetaryItemType> aggregateInvestmentExposureElement147 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAggregateInvestmentExposure(aggregateInvestmentExposureValue146);
                                        bodyElements.add(aggregateInvestmentExposureElement147);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR148 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR148 = createUnitIfNotExist(INR148, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExemptedExposure
                                
                                    Map zeroDBS12_SectionB_Layout1ExemptedExposureMap151 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1ExemptedExposureValue150 = DBS12ReportUtil.retrieveValueForElement(field.getExemptedExposure(), zeroDBS12_SectionB_Layout1ExemptedExposureMap151);

                                        
                                        Context DBS12_SectionB_Layout1ExemptedExposureContext149 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionB_Layout1( bankCode, periodDate ,nameOfEntityAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1ExemptedExposureValue150 != null && !"".equals(zeroDBS12_SectionB_Layout1ExemptedExposureValue150)) {
                                        
                                        addContext(DBS12_SectionB_Layout1ExemptedExposureContext149, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exemptedExposureValue152 = new MonetaryItemType();
                                        exemptedExposureValue152.setContextRef(DBS12_SectionB_Layout1ExemptedExposureContext149);
                                        
                                            exemptedExposureValue152.setUnitRef(INR148);
                                            exemptedExposureValue152.setDecimals("INF");
                                            exemptedExposureValue152.setValue(new BigDecimal(zeroDBS12_SectionB_Layout1ExemptedExposureValue150));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exemptedExposureElement153 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createExemptedExposure(exemptedExposureValue152);
                                        bodyElements.add(exemptedExposureElement153);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR154 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR154 = createUnitIfNotExist(INR154, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - AggregateAmountOutstanding
                                
                                    Map zeroDBS12_SectionB_Layout1AggregateAmountOutstandingMap157 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1AggregateAmountOutstandingValue156 = DBS12ReportUtil.retrieveValueForElement(field.getAggregateAmountOutstanding(), zeroDBS12_SectionB_Layout1AggregateAmountOutstandingMap157);

                                        
                                        Context DBS12_SectionB_Layout1AggregateAmountOutstandingContext155 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionB_Layout1( bankCode, periodDate ,nameOfEntityAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1AggregateAmountOutstandingValue156 != null && !"".equals(zeroDBS12_SectionB_Layout1AggregateAmountOutstandingValue156)) {
                                        
                                        addContext(DBS12_SectionB_Layout1AggregateAmountOutstandingContext155, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType aggregateAmountOutstandingValue158 = new MonetaryItemType();
                                        aggregateAmountOutstandingValue158.setContextRef(DBS12_SectionB_Layout1AggregateAmountOutstandingContext155);
                                        
                                            aggregateAmountOutstandingValue158.setUnitRef(INR154);
                                            aggregateAmountOutstandingValue158.setDecimals("INF");
                                            aggregateAmountOutstandingValue158.setValue(new BigDecimal(zeroDBS12_SectionB_Layout1AggregateAmountOutstandingValue156));
                                        
                                        
                                        JAXBElement<MonetaryItemType> aggregateAmountOutstandingElement159 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAggregateAmountOutstanding(aggregateAmountOutstandingValue158);
                                        bodyElements.add(aggregateAmountOutstandingElement159);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR160 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR160 = createUnitIfNotExist(INR160, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - AggregateExposure
                                
                                    Map zeroDBS12_SectionB_Layout1AggregateExposureMap163 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1AggregateExposureValue162 = DBS12ReportUtil.retrieveValueForElement(field.getAggregateExposure(), zeroDBS12_SectionB_Layout1AggregateExposureMap163);

                                        
                                        Context DBS12_SectionB_Layout1AggregateExposureContext161 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionB_Layout1( bankCode, periodDate ,nameOfEntityAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1AggregateExposureValue162 != null && !"".equals(zeroDBS12_SectionB_Layout1AggregateExposureValue162)) {
                                        
                                        addContext(DBS12_SectionB_Layout1AggregateExposureContext161, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType aggregateExposureValue164 = new MonetaryItemType();
                                        aggregateExposureValue164.setContextRef(DBS12_SectionB_Layout1AggregateExposureContext161);
                                        
                                            aggregateExposureValue164.setUnitRef(INR160);
                                            aggregateExposureValue164.setDecimals("INF");
                                            aggregateExposureValue164.setValue(new BigDecimal(zeroDBS12_SectionB_Layout1AggregateExposureValue162));
                                        
                                        
                                        JAXBElement<MonetaryItemType> aggregateExposureElement165 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAggregateExposure(aggregateExposureValue164);
                                        bodyElements.add(aggregateExposureElement165);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                
                                // - AssetClassifications
                                
                                    Map zeroDBS12_SectionB_Layout1AssetClassificationsMap168 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1AssetClassificationsValue167 = DBS12ReportUtil.retrieveValueForElement(field.getAssetClassifications(), zeroDBS12_SectionB_Layout1AssetClassificationsMap168);

                                        
                                            Context DBS12_SectionB_Layout1AssetClassificationsContext166 = DBS12ReportContextUtil.createFromToContextDBS12_SectionB_Layout1( bankCode, startDate, endDate ,nameOfEntityAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1AssetClassificationsValue167 != null && !"".equals(zeroDBS12_SectionB_Layout1AssetClassificationsValue167)) {
                                        
                                        addContext(DBS12_SectionB_Layout1AssetClassificationsContext166, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        AssetClassifications assetClassificationsValue169 = new AssetClassifications();
                                        assetClassificationsValue169.setContextRef(DBS12_SectionB_Layout1AssetClassificationsContext166);
                                        
                                            assetClassificationsValue169.setValue(zeroDBS12_SectionB_Layout1AssetClassificationsValue167);        
                                        
                                        
                                        JAXBElement<AssetClassifications> assetClassificationsElement170 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createAssetClassifications(assetClassificationsValue169);
                                        bodyElements.add(assetClassificationsElement170);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR171 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR171 = createUnitIfNotExist(INR171, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - AmountOfAggregateProvisionsHeldForNPAs
                                
                                    Map zeroDBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsMap174 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsValue173 = DBS12ReportUtil.retrieveValueForElement(field.getAmountOfAggregateProvisionsHeldForNPAs(), zeroDBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsMap174);

                                        
                                        Context DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsContext172 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionB_Layout1( bankCode, periodDate ,nameOfEntityAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsValue173 != null && !"".equals(zeroDBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsValue173)) {
                                        
                                        addContext(DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsContext172, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType amountOfAggregateProvisionsHeldForNPAsValue175 = new MonetaryItemType();
                                        amountOfAggregateProvisionsHeldForNPAsValue175.setContextRef(DBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsContext172);
                                        
                                            amountOfAggregateProvisionsHeldForNPAsValue175.setUnitRef(INR171);
                                            amountOfAggregateProvisionsHeldForNPAsValue175.setDecimals("INF");
                                            amountOfAggregateProvisionsHeldForNPAsValue175.setValue(new BigDecimal(zeroDBS12_SectionB_Layout1AmountOfAggregateProvisionsHeldForNPAsValue173));
                                        
                                        
                                        JAXBElement<MonetaryItemType> amountOfAggregateProvisionsHeldForNPAsElement176 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAmountOfAggregateProvisionsHeldForNPAs(amountOfAggregateProvisionsHeldForNPAsValue175);
                                        bodyElements.add(amountOfAggregateProvisionsHeldForNPAsElement176);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR177 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR177 = createUnitIfNotExist(INR177, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstanding
                                
                                    Map zeroDBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingMap180 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingValue179 = DBS12ReportUtil.retrieveValueForElement(field.getAmountOfUnsecuredAmountOutstandingOfTotalAmountOutstanding(), zeroDBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingMap180);

                                        
                                        Context DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingContext178 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionB_Layout1( bankCode, periodDate ,nameOfEntityAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingValue179 != null && !"".equals(zeroDBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingValue179)) {
                                        
                                        addContext(DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingContext178, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType amountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingValue181 = new MonetaryItemType();
                                        amountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingValue181.setContextRef(DBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingContext178);
                                        
                                            amountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingValue181.setUnitRef(INR177);
                                            amountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingValue181.setDecimals("INF");
                                            amountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingValue181.setValue(new BigDecimal(zeroDBS12_SectionB_Layout1AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingValue179));
                                        
                                        
                                        JAXBElement<MonetaryItemType> amountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingElement182 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createAmountOfUnsecuredAmountOutstandingOfTotalAmountOutstanding(amountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingValue181);
                                        bodyElements.add(amountOfUnsecuredAmountOutstandingOfTotalAmountOutstandingElement182);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                
                                // - ReasonsForBreachOfStipulatedPrudentialLimits
                                
                                    Map zeroDBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsMap185 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsValue184 = DBS12ReportUtil.retrieveValueForElement(field.getReasonsForBreachOfStipulatedPrudentialLimits(), zeroDBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsMap185);

                                        
                                            Context DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsContext183 = DBS12ReportContextUtil.createFromToContextDBS12_SectionB_Layout1( bankCode, startDate, endDate ,nameOfEntityAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsValue184 != null && !"".equals(zeroDBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsValue184)) {
                                        
                                        addContext(DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsContext183, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        StringItemType reasonsForBreachOfStipulatedPrudentialLimitsValue186 = new StringItemType();
                                        reasonsForBreachOfStipulatedPrudentialLimitsValue186.setContextRef(DBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsContext183);
                                        
                                            reasonsForBreachOfStipulatedPrudentialLimitsValue186.setValue(zeroDBS12_SectionB_Layout1ReasonsForBreachOfStipulatedPrudentialLimitsValue184);        
                                        
                                        
                                        JAXBElement<StringItemType> reasonsForBreachOfStipulatedPrudentialLimitsElement187 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createReasonsForBreachOfStipulatedPrudentialLimits(reasonsForBreachOfStipulatedPrudentialLimitsValue186);
                                        bodyElements.add(reasonsForBreachOfStipulatedPrudentialLimitsElement187);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionB_Layout1
                                // create unit if not empty
                                
                                
                                // - DescriptionOfIntraGroupSupportArrangementsOrAgreements
                                
                                    Map zeroDBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsMap190 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsValue189 = DBS12ReportUtil.retrieveValueForElement(field.getDescriptionOfIntraGroupSupportArrangementsOrAgreements(), zeroDBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsMap190);

                                        
                                            Context DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsContext188 = DBS12ReportContextUtil.createFromToContextDBS12_SectionB_Layout1( bankCode, startDate, endDate ,nameOfEntityAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsValue189 != null && !"".equals(zeroDBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsValue189)) {
                                        
                                        addContext(DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsContext188, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        StringItemType descriptionOfIntraGroupSupportArrangementsOrAgreementsValue191 = new StringItemType();
                                        descriptionOfIntraGroupSupportArrangementsOrAgreementsValue191.setContextRef(DBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsContext188);
                                        
                                            descriptionOfIntraGroupSupportArrangementsOrAgreementsValue191.setValue(zeroDBS12_SectionB_Layout1DescriptionOfIntraGroupSupportArrangementsOrAgreementsValue189);        
                                        
                                        
                                        JAXBElement<StringItemType> descriptionOfIntraGroupSupportArrangementsOrAgreementsElement192 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createDescriptionOfIntraGroupSupportArrangementsOrAgreements(descriptionOfIntraGroupSupportArrangementsOrAgreementsValue191);
                                        bodyElements.add(descriptionOfIntraGroupSupportArrangementsOrAgreementsElement192);
                                    }
                                
                            
                            
                            
                        
                        
                
                        
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBS12_SectionC_Layout1 if any typeMembers then List or Single
                //List<DBS12_SectionC_Layout1> dBS12_SectionC_Layout1 = mainReportData.getDBS12_SectionC_Layout1();
                
                
                // if typemembers exist
                
                    private String dBS12_SectionC_Layout1Method(List<DBS12_SectionC_Layout1> dBS12_SectionC_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDate, String endDate, String periodDate)
                    {
                    dBS12_SectionC_Layout1.forEach((field)->{
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
                                
                                    Map zeroDBS12_SectionC_Layout1TypeOfEntityMap195 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionC_Layout1TypeOfEntityValue194 = DBS12ReportUtil.retrieveValueForElement(field.getTypeOfEntity(), zeroDBS12_SectionC_Layout1TypeOfEntityMap195);

                                        
                                            Context DBS12_SectionC_Layout1TypeOfEntityContext193 = DBS12ReportContextUtil.createFromToContextDBS12_SectionC_Layout1( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionC_Layout1TypeOfEntityValue194 != null && !"".equals(zeroDBS12_SectionC_Layout1TypeOfEntityValue194)) {
                                        
                                        addContext(DBS12_SectionC_Layout1TypeOfEntityContext193, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        TypeOfEntity typeOfEntityValue196 = new TypeOfEntity();
                                        typeOfEntityValue196.setContextRef(DBS12_SectionC_Layout1TypeOfEntityContext193);
                                        
                                            typeOfEntityValue196.setValue(zeroDBS12_SectionC_Layout1TypeOfEntityValue194);        
                                        
                                        
                                        JAXBElement<TypeOfEntity> typeOfEntityElement197 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTypeOfEntity(typeOfEntityValue196);
                                        bodyElements.add(typeOfEntityElement197);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionC_Layout1
                                // create unit if not empty
                                
                                
                                // - TypeOfExposures
                                
                                    Map zeroDBS12_SectionC_Layout1TypeOfExposuresMap200 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionC_Layout1TypeOfExposuresValue199 = DBS12ReportUtil.retrieveValueForElement(field.getTypeOfExposures(), zeroDBS12_SectionC_Layout1TypeOfExposuresMap200);

                                        
                                            Context DBS12_SectionC_Layout1TypeOfExposuresContext198 = DBS12ReportContextUtil.createFromToContextDBS12_SectionC_Layout1( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionC_Layout1TypeOfExposuresValue199 != null && !"".equals(zeroDBS12_SectionC_Layout1TypeOfExposuresValue199)) {
                                        
                                        addContext(DBS12_SectionC_Layout1TypeOfExposuresContext198, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        TypeOfExposures typeOfExposuresValue201 = new TypeOfExposures();
                                        typeOfExposuresValue201.setContextRef(DBS12_SectionC_Layout1TypeOfExposuresContext198);
                                        
                                            typeOfExposuresValue201.setValue(zeroDBS12_SectionC_Layout1TypeOfExposuresValue199);        
                                        
                                        
                                        JAXBElement<TypeOfExposures> typeOfExposuresElement202 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTypeOfExposures(typeOfExposuresValue201);
                                        bodyElements.add(typeOfExposuresElement202);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionC_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR203 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR203 = createUnitIfNotExist(INR203, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExposureAmount
                                
                                    Map zeroDBS12_SectionC_Layout1ExposureAmountMap206 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionC_Layout1ExposureAmountValue205 = DBS12ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBS12_SectionC_Layout1ExposureAmountMap206);

                                        
                                        Context DBS12_SectionC_Layout1ExposureAmountContext204 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionC_Layout1( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionC_Layout1ExposureAmountValue205 != null && !"".equals(zeroDBS12_SectionC_Layout1ExposureAmountValue205)) {
                                        
                                        addContext(DBS12_SectionC_Layout1ExposureAmountContext204, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exposureAmountValue207 = new MonetaryItemType();
                                        exposureAmountValue207.setContextRef(DBS12_SectionC_Layout1ExposureAmountContext204);
                                        
                                            exposureAmountValue207.setUnitRef(INR203);
                                            exposureAmountValue207.setDecimals("INF");
                                            exposureAmountValue207.setValue(new BigDecimal(zeroDBS12_SectionC_Layout1ExposureAmountValue205));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exposureAmountElement208 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue207);
                                        bodyElements.add(exposureAmountElement208);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionC_Layout1
                                // create unit if not empty
                                
                                
                                // - TermOfCreditExposure
                                
                                    Map zeroDBS12_SectionC_Layout1TermOfCreditExposureMap211 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionC_Layout1TermOfCreditExposureValue210 = DBS12ReportUtil.retrieveValueForElement(field.getTermOfCreditExposure(), zeroDBS12_SectionC_Layout1TermOfCreditExposureMap211);

                                        
                                            Context DBS12_SectionC_Layout1TermOfCreditExposureContext209 = DBS12ReportContextUtil.createFromToContextDBS12_SectionC_Layout1( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionC_Layout1TermOfCreditExposureValue210 != null && !"".equals(zeroDBS12_SectionC_Layout1TermOfCreditExposureValue210)) {
                                        
                                        addContext(DBS12_SectionC_Layout1TermOfCreditExposureContext209, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        StringItemType termOfCreditExposureValue212 = new StringItemType();
                                        termOfCreditExposureValue212.setContextRef(DBS12_SectionC_Layout1TermOfCreditExposureContext209);
                                        
                                            termOfCreditExposureValue212.setValue(zeroDBS12_SectionC_Layout1TermOfCreditExposureValue210);        
                                        
                                        
                                        JAXBElement<StringItemType> termOfCreditExposureElement213 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createTermOfCreditExposure(termOfCreditExposureValue212);
                                        bodyElements.add(termOfCreditExposureElement213);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionC_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR214 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR214 = createUnitIfNotExist(INR214, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ValueOfSecuritiesCollateral
                                
                                    Map zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralMap217 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralValue216 = DBS12ReportUtil.retrieveValueForElement(field.getValueOfSecuritiesCollateral(), zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralMap217);

                                        
                                        Context DBS12_SectionC_Layout1ValueOfSecuritiesCollateralContext215 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionC_Layout1( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralValue216 != null && !"".equals(zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralValue216)) {
                                        
                                        addContext(DBS12_SectionC_Layout1ValueOfSecuritiesCollateralContext215, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType valueOfSecuritiesCollateralValue218 = new MonetaryItemType();
                                        valueOfSecuritiesCollateralValue218.setContextRef(DBS12_SectionC_Layout1ValueOfSecuritiesCollateralContext215);
                                        
                                            valueOfSecuritiesCollateralValue218.setUnitRef(INR214);
                                            valueOfSecuritiesCollateralValue218.setDecimals("INF");
                                            valueOfSecuritiesCollateralValue218.setValue(new BigDecimal(zeroDBS12_SectionC_Layout1ValueOfSecuritiesCollateralValue216));
                                        
                                        
                                        JAXBElement<MonetaryItemType> valueOfSecuritiesCollateralElement219 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createValueOfSecuritiesCollateral(valueOfSecuritiesCollateralValue218);
                                        bodyElements.add(valueOfSecuritiesCollateralElement219);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionC_Layout1
                                // create unit if not empty
                                
                                
                                // - AssetClassifications
                                
                                    Map zeroDBS12_SectionC_Layout1AssetClassificationsMap222 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionC_Layout1AssetClassificationsValue221 = DBS12ReportUtil.retrieveValueForElement(field.getAssetClassifications(), zeroDBS12_SectionC_Layout1AssetClassificationsMap222);

                                        
                                            Context DBS12_SectionC_Layout1AssetClassificationsContext220 = DBS12ReportContextUtil.createFromToContextDBS12_SectionC_Layout1( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionC_Layout1AssetClassificationsValue221 != null && !"".equals(zeroDBS12_SectionC_Layout1AssetClassificationsValue221)) {
                                        
                                        addContext(DBS12_SectionC_Layout1AssetClassificationsContext220, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        AssetClassifications assetClassificationsValue223 = new AssetClassifications();
                                        assetClassificationsValue223.setContextRef(DBS12_SectionC_Layout1AssetClassificationsContext220);
                                        
                                            assetClassificationsValue223.setValue(zeroDBS12_SectionC_Layout1AssetClassificationsValue221);        
                                        
                                        
                                        JAXBElement<AssetClassifications> assetClassificationsElement224 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createAssetClassifications(assetClassificationsValue223);
                                        bodyElements.add(assetClassificationsElement224);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionC_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR225 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR225 = createUnitIfNotExist(INR225, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ProvisionForInvestment
                                
                                    Map zeroDBS12_SectionC_Layout1ProvisionForInvestmentMap228 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionC_Layout1ProvisionForInvestmentValue227 = DBS12ReportUtil.retrieveValueForElement(field.getProvisionForInvestment(), zeroDBS12_SectionC_Layout1ProvisionForInvestmentMap228);

                                        
                                        Context DBS12_SectionC_Layout1ProvisionForInvestmentContext226 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionC_Layout1( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionC_Layout1ProvisionForInvestmentValue227 != null && !"".equals(zeroDBS12_SectionC_Layout1ProvisionForInvestmentValue227)) {
                                        
                                        addContext(DBS12_SectionC_Layout1ProvisionForInvestmentContext226, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType provisionForInvestmentValue229 = new MonetaryItemType();
                                        provisionForInvestmentValue229.setContextRef(DBS12_SectionC_Layout1ProvisionForInvestmentContext226);
                                        
                                            provisionForInvestmentValue229.setUnitRef(INR225);
                                            provisionForInvestmentValue229.setDecimals("INF");
                                            provisionForInvestmentValue229.setValue(new BigDecimal(zeroDBS12_SectionC_Layout1ProvisionForInvestmentValue227));
                                        
                                        
                                        JAXBElement<MonetaryItemType> provisionForInvestmentElement230 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createProvisionForInvestment(provisionForInvestmentValue229);
                                        bodyElements.add(provisionForInvestmentElement230);
                                    }
                                
                            
                            
                            
                        
                        
                
                        
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBS12_SectionD_Layout1 if any typeMembers then List or Single
                //List<DBS12_SectionD_Layout1> dBS12_SectionD_Layout1 = mainReportData.getDBS12_SectionD_Layout1();
                
                
                // if typemembers exist
                
                    private String dBS12_SectionD_Layout1Method(List<DBS12_SectionD_Layout1> dBS12_SectionD_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDate, String endDate, String periodDate)
                    {
                    dBS12_SectionD_Layout1.forEach((field)->{
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
                                
                                    Map zeroDBS12_SectionD_Layout1TypeOfExposuresMap233 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout1TypeOfExposuresValue232 = DBS12ReportUtil.retrieveValueForElement(field.getTypeOfExposures(), zeroDBS12_SectionD_Layout1TypeOfExposuresMap233);

                                        
                                            Context DBS12_SectionD_Layout1TypeOfExposuresContext231 = DBS12ReportContextUtil.createFromToContextDBS12_SectionD_Layout1( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout1TypeOfExposuresValue232 != null && !"".equals(zeroDBS12_SectionD_Layout1TypeOfExposuresValue232)) {
                                        
                                        addContext(DBS12_SectionD_Layout1TypeOfExposuresContext231, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        TypeOfExposures typeOfExposuresValue234 = new TypeOfExposures();
                                        typeOfExposuresValue234.setContextRef(DBS12_SectionD_Layout1TypeOfExposuresContext231);
                                        
                                            typeOfExposuresValue234.setValue(zeroDBS12_SectionD_Layout1TypeOfExposuresValue232);        
                                        
                                        
                                        JAXBElement<TypeOfExposures> typeOfExposuresElement235 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTypeOfExposures(typeOfExposuresValue234);
                                        bodyElements.add(typeOfExposuresElement235);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR236 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR236 = createUnitIfNotExist(INR236, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExposureAmount
                                
                                    Map zeroDBS12_SectionD_Layout1ExposureAmountMap239 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout1ExposureAmountValue238 = DBS12ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBS12_SectionD_Layout1ExposureAmountMap239);

                                        
                                        Context DBS12_SectionD_Layout1ExposureAmountContext237 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionD_Layout1( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout1ExposureAmountValue238 != null && !"".equals(zeroDBS12_SectionD_Layout1ExposureAmountValue238)) {
                                        
                                        addContext(DBS12_SectionD_Layout1ExposureAmountContext237, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exposureAmountValue240 = new MonetaryItemType();
                                        exposureAmountValue240.setContextRef(DBS12_SectionD_Layout1ExposureAmountContext237);
                                        
                                            exposureAmountValue240.setUnitRef(INR236);
                                            exposureAmountValue240.setDecimals("INF");
                                            exposureAmountValue240.setValue(new BigDecimal(zeroDBS12_SectionD_Layout1ExposureAmountValue238));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exposureAmountElement241 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue240);
                                        bodyElements.add(exposureAmountElement241);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout1
                                // create unit if not empty
                                
                                
                                // - TermOfCreditExposure
                                
                                    Map zeroDBS12_SectionD_Layout1TermOfCreditExposureMap244 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout1TermOfCreditExposureValue243 = DBS12ReportUtil.retrieveValueForElement(field.getTermOfCreditExposure(), zeroDBS12_SectionD_Layout1TermOfCreditExposureMap244);

                                        
                                            Context DBS12_SectionD_Layout1TermOfCreditExposureContext242 = DBS12ReportContextUtil.createFromToContextDBS12_SectionD_Layout1( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout1TermOfCreditExposureValue243 != null && !"".equals(zeroDBS12_SectionD_Layout1TermOfCreditExposureValue243)) {
                                        
                                        addContext(DBS12_SectionD_Layout1TermOfCreditExposureContext242, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        StringItemType termOfCreditExposureValue245 = new StringItemType();
                                        termOfCreditExposureValue245.setContextRef(DBS12_SectionD_Layout1TermOfCreditExposureContext242);
                                        
                                            termOfCreditExposureValue245.setValue(zeroDBS12_SectionD_Layout1TermOfCreditExposureValue243);        
                                        
                                        
                                        JAXBElement<StringItemType> termOfCreditExposureElement246 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createTermOfCreditExposure(termOfCreditExposureValue245);
                                        bodyElements.add(termOfCreditExposureElement246);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR247 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR247 = createUnitIfNotExist(INR247, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ValueOfSecuritiesCollateral
                                
                                    Map zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralMap250 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralValue249 = DBS12ReportUtil.retrieveValueForElement(field.getValueOfSecuritiesCollateral(), zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralMap250);

                                        
                                        Context DBS12_SectionD_Layout1ValueOfSecuritiesCollateralContext248 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionD_Layout1( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralValue249 != null && !"".equals(zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralValue249)) {
                                        
                                        addContext(DBS12_SectionD_Layout1ValueOfSecuritiesCollateralContext248, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType valueOfSecuritiesCollateralValue251 = new MonetaryItemType();
                                        valueOfSecuritiesCollateralValue251.setContextRef(DBS12_SectionD_Layout1ValueOfSecuritiesCollateralContext248);
                                        
                                            valueOfSecuritiesCollateralValue251.setUnitRef(INR247);
                                            valueOfSecuritiesCollateralValue251.setDecimals("INF");
                                            valueOfSecuritiesCollateralValue251.setValue(new BigDecimal(zeroDBS12_SectionD_Layout1ValueOfSecuritiesCollateralValue249));
                                        
                                        
                                        JAXBElement<MonetaryItemType> valueOfSecuritiesCollateralElement252 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createValueOfSecuritiesCollateral(valueOfSecuritiesCollateralValue251);
                                        bodyElements.add(valueOfSecuritiesCollateralElement252);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout1
                                // create unit if not empty
                                
                                
                                // - AssetClassifications
                                
                                    Map zeroDBS12_SectionD_Layout1AssetClassificationsMap255 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout1AssetClassificationsValue254 = DBS12ReportUtil.retrieveValueForElement(field.getAssetClassifications(), zeroDBS12_SectionD_Layout1AssetClassificationsMap255);

                                        
                                            Context DBS12_SectionD_Layout1AssetClassificationsContext253 = DBS12ReportContextUtil.createFromToContextDBS12_SectionD_Layout1( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout1AssetClassificationsValue254 != null && !"".equals(zeroDBS12_SectionD_Layout1AssetClassificationsValue254)) {
                                        
                                        addContext(DBS12_SectionD_Layout1AssetClassificationsContext253, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        AssetClassifications assetClassificationsValue256 = new AssetClassifications();
                                        assetClassificationsValue256.setContextRef(DBS12_SectionD_Layout1AssetClassificationsContext253);
                                        
                                            assetClassificationsValue256.setValue(zeroDBS12_SectionD_Layout1AssetClassificationsValue254);        
                                        
                                        
                                        JAXBElement<AssetClassifications> assetClassificationsElement257 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createAssetClassifications(assetClassificationsValue256);
                                        bodyElements.add(assetClassificationsElement257);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout1
                                // create unit if not empty
                                
                                    
                                    Unit INR258 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR258 = createUnitIfNotExist(INR258, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ProvisionForInvestment
                                
                                    Map zeroDBS12_SectionD_Layout1ProvisionForInvestmentMap261 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout1ProvisionForInvestmentValue260 = DBS12ReportUtil.retrieveValueForElement(field.getProvisionForInvestment(), zeroDBS12_SectionD_Layout1ProvisionForInvestmentMap261);

                                        
                                        Context DBS12_SectionD_Layout1ProvisionForInvestmentContext259 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionD_Layout1( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout1ProvisionForInvestmentValue260 != null && !"".equals(zeroDBS12_SectionD_Layout1ProvisionForInvestmentValue260)) {
                                        
                                        addContext(DBS12_SectionD_Layout1ProvisionForInvestmentContext259, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType provisionForInvestmentValue262 = new MonetaryItemType();
                                        provisionForInvestmentValue262.setContextRef(DBS12_SectionD_Layout1ProvisionForInvestmentContext259);
                                        
                                            provisionForInvestmentValue262.setUnitRef(INR258);
                                            provisionForInvestmentValue262.setDecimals("INF");
                                            provisionForInvestmentValue262.setValue(new BigDecimal(zeroDBS12_SectionD_Layout1ProvisionForInvestmentValue260));
                                        
                                        
                                        JAXBElement<MonetaryItemType> provisionForInvestmentElement263 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createProvisionForInvestment(provisionForInvestmentValue262);
                                        bodyElements.add(provisionForInvestmentElement263);
                                    }
                                
                            
                            
                            
                        
                        
                
                        
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBS12_SectionD_Layout2 if any typeMembers then List or Single
                //List<DBS12_SectionD_Layout2> dBS12_SectionD_Layout2 = mainReportData.getDBS12_SectionD_Layout2();
                
                
                // if typemembers exist
                
                    private String dBS12_SectionD_Layout2Method(List<DBS12_SectionD_Layout2> dBS12_SectionD_Layout2, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDate, String endDate, String periodDate)
                    {
                    dBS12_SectionD_Layout2.forEach((field)->{
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
                                
                                    Map zeroDBS12_SectionD_Layout2TypeOfEntityMap266 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout2TypeOfEntityValue265 = DBS12ReportUtil.retrieveValueForElement(field.getTypeOfEntity(), zeroDBS12_SectionD_Layout2TypeOfEntityMap266);

                                        
                                            Context DBS12_SectionD_Layout2TypeOfEntityContext264 = DBS12ReportContextUtil.createFromToContextDBS12_SectionD_Layout2( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis,nameOfInterestedDirectorManagerAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout2TypeOfEntityValue265 != null && !"".equals(zeroDBS12_SectionD_Layout2TypeOfEntityValue265)) {
                                        
                                        addContext(DBS12_SectionD_Layout2TypeOfEntityContext264, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        TypeOfEntity typeOfEntityValue267 = new TypeOfEntity();
                                        typeOfEntityValue267.setContextRef(DBS12_SectionD_Layout2TypeOfEntityContext264);
                                        
                                            typeOfEntityValue267.setValue(zeroDBS12_SectionD_Layout2TypeOfEntityValue265);        
                                        
                                        
                                        JAXBElement<TypeOfEntity> typeOfEntityElement268 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTypeOfEntity(typeOfEntityValue267);
                                        bodyElements.add(typeOfEntityElement268);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout2
                                // create unit if not empty
                                
                                
                                // - TypeOfExposures
                                
                                    Map zeroDBS12_SectionD_Layout2TypeOfExposuresMap271 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout2TypeOfExposuresValue270 = DBS12ReportUtil.retrieveValueForElement(field.getTypeOfExposures(), zeroDBS12_SectionD_Layout2TypeOfExposuresMap271);

                                        
                                            Context DBS12_SectionD_Layout2TypeOfExposuresContext269 = DBS12ReportContextUtil.createFromToContextDBS12_SectionD_Layout2( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis,nameOfInterestedDirectorManagerAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout2TypeOfExposuresValue270 != null && !"".equals(zeroDBS12_SectionD_Layout2TypeOfExposuresValue270)) {
                                        
                                        addContext(DBS12_SectionD_Layout2TypeOfExposuresContext269, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        TypeOfExposures typeOfExposuresValue272 = new TypeOfExposures();
                                        typeOfExposuresValue272.setContextRef(DBS12_SectionD_Layout2TypeOfExposuresContext269);
                                        
                                            typeOfExposuresValue272.setValue(zeroDBS12_SectionD_Layout2TypeOfExposuresValue270);        
                                        
                                        
                                        JAXBElement<TypeOfExposures> typeOfExposuresElement273 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createTypeOfExposures(typeOfExposuresValue272);
                                        bodyElements.add(typeOfExposuresElement273);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout2
                                // create unit if not empty
                                
                                    
                                    Unit INR274 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR274 = createUnitIfNotExist(INR274, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ExposureAmount
                                
                                    Map zeroDBS12_SectionD_Layout2ExposureAmountMap277 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout2ExposureAmountValue276 = DBS12ReportUtil.retrieveValueForElement(field.getExposureAmount(), zeroDBS12_SectionD_Layout2ExposureAmountMap277);

                                        
                                        Context DBS12_SectionD_Layout2ExposureAmountContext275 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionD_Layout2( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis,nameOfInterestedDirectorManagerAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout2ExposureAmountValue276 != null && !"".equals(zeroDBS12_SectionD_Layout2ExposureAmountValue276)) {
                                        
                                        addContext(DBS12_SectionD_Layout2ExposureAmountContext275, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType exposureAmountValue278 = new MonetaryItemType();
                                        exposureAmountValue278.setContextRef(DBS12_SectionD_Layout2ExposureAmountContext275);
                                        
                                            exposureAmountValue278.setUnitRef(INR274);
                                            exposureAmountValue278.setDecimals("INF");
                                            exposureAmountValue278.setValue(new BigDecimal(zeroDBS12_SectionD_Layout2ExposureAmountValue276));
                                        
                                        
                                        JAXBElement<MonetaryItemType> exposureAmountElement279 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createExposureAmount(exposureAmountValue278);
                                        bodyElements.add(exposureAmountElement279);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout2
                                // create unit if not empty
                                
                                
                                // - TermOfCreditExposure
                                
                                    Map zeroDBS12_SectionD_Layout2TermOfCreditExposureMap282 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout2TermOfCreditExposureValue281 = DBS12ReportUtil.retrieveValueForElement(field.getTermOfCreditExposure(), zeroDBS12_SectionD_Layout2TermOfCreditExposureMap282);

                                        
                                            Context DBS12_SectionD_Layout2TermOfCreditExposureContext280 = DBS12ReportContextUtil.createFromToContextDBS12_SectionD_Layout2( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis,nameOfInterestedDirectorManagerAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout2TermOfCreditExposureValue281 != null && !"".equals(zeroDBS12_SectionD_Layout2TermOfCreditExposureValue281)) {
                                        
                                        addContext(DBS12_SectionD_Layout2TermOfCreditExposureContext280, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        StringItemType termOfCreditExposureValue283 = new StringItemType();
                                        termOfCreditExposureValue283.setContextRef(DBS12_SectionD_Layout2TermOfCreditExposureContext280);
                                        
                                            termOfCreditExposureValue283.setValue(zeroDBS12_SectionD_Layout2TermOfCreditExposureValue281);        
                                        
                                        
                                        JAXBElement<StringItemType> termOfCreditExposureElement284 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createTermOfCreditExposure(termOfCreditExposureValue283);
                                        bodyElements.add(termOfCreditExposureElement284);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout2
                                // create unit if not empty
                                
                                    
                                    Unit INR285 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR285 = createUnitIfNotExist(INR285, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ValueOfSecuritiesCollateral
                                
                                    Map zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralMap288 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralValue287 = DBS12ReportUtil.retrieveValueForElement(field.getValueOfSecuritiesCollateral(), zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralMap288);

                                        
                                        Context DBS12_SectionD_Layout2ValueOfSecuritiesCollateralContext286 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionD_Layout2( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis,nameOfInterestedDirectorManagerAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralValue287 != null && !"".equals(zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralValue287)) {
                                        
                                        addContext(DBS12_SectionD_Layout2ValueOfSecuritiesCollateralContext286, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType valueOfSecuritiesCollateralValue289 = new MonetaryItemType();
                                        valueOfSecuritiesCollateralValue289.setContextRef(DBS12_SectionD_Layout2ValueOfSecuritiesCollateralContext286);
                                        
                                            valueOfSecuritiesCollateralValue289.setUnitRef(INR285);
                                            valueOfSecuritiesCollateralValue289.setDecimals("INF");
                                            valueOfSecuritiesCollateralValue289.setValue(new BigDecimal(zeroDBS12_SectionD_Layout2ValueOfSecuritiesCollateralValue287));
                                        
                                        
                                        JAXBElement<MonetaryItemType> valueOfSecuritiesCollateralElement290 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createValueOfSecuritiesCollateral(valueOfSecuritiesCollateralValue289);
                                        bodyElements.add(valueOfSecuritiesCollateralElement290);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout2
                                // create unit if not empty
                                
                                
                                // - AssetClassifications
                                
                                    Map zeroDBS12_SectionD_Layout2AssetClassificationsMap293 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout2AssetClassificationsValue292 = DBS12ReportUtil.retrieveValueForElement(field.getAssetClassifications(), zeroDBS12_SectionD_Layout2AssetClassificationsMap293);

                                        
                                            Context DBS12_SectionD_Layout2AssetClassificationsContext291 = DBS12ReportContextUtil.createFromToContextDBS12_SectionD_Layout2( bankCode, startDate, endDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis,nameOfInterestedDirectorManagerAxis );
                                            
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout2AssetClassificationsValue292 != null && !"".equals(zeroDBS12_SectionD_Layout2AssetClassificationsValue292)) {
                                        
                                        addContext(DBS12_SectionD_Layout2AssetClassificationsContext291, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        AssetClassifications assetClassificationsValue294 = new AssetClassifications();
                                        assetClassificationsValue294.setContextRef(DBS12_SectionD_Layout2AssetClassificationsContext291);
                                        
                                            assetClassificationsValue294.setValue(zeroDBS12_SectionD_Layout2AssetClassificationsValue292);        
                                        
                                        
                                        JAXBElement<AssetClassifications> assetClassificationsElement295 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createAssetClassifications(assetClassificationsValue294);
                                        bodyElements.add(assetClassificationsElement295);
                                    }
                                
                            
                            
                                // start create element for report of DBS12_SectionD_Layout2
                                // create unit if not empty
                                
                                    
                                    Unit INR296 = unitElements.stream().filter(u -> u.getId().equalsIgnoreCase("INR")).findAny().orElse(null);
                                    INR296 = createUnitIfNotExist(INR296, "INR", "http://www.xbrl.org/2003/iso4217","INR", unitElements);
                                    
                                
                                
                                // - ProvisionForInvestment
                                
                                    Map zeroDBS12_SectionD_Layout2ProvisionForInvestmentMap299 = new HashMap<String, String>();
                                    
                                        // retrieve value for element
                                        String zeroDBS12_SectionD_Layout2ProvisionForInvestmentValue298 = DBS12ReportUtil.retrieveValueForElement(field.getProvisionForInvestment(), zeroDBS12_SectionD_Layout2ProvisionForInvestmentMap299);

                                        
                                        Context DBS12_SectionD_Layout2ProvisionForInvestmentContext297 = DBS12ReportContextUtil.createAsOfContextDBS12_SectionD_Layout2( bankCode, periodDate ,uniqueTransactionCodeAxis,nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis,nameOfInterestedDirectorManagerAxis );
                                            
                                        
                                    // check if value is null or empty
                                    if(zeroDBS12_SectionD_Layout2ProvisionForInvestmentValue298 != null && !"".equals(zeroDBS12_SectionD_Layout2ProvisionForInvestmentValue298)) {
                                        
                                        addContext(DBS12_SectionD_Layout2ProvisionForInvestmentContext297, contextElements, contextIdentifiers);
                                    
                                        // create element JAXB Element
                                        
                                        MonetaryItemType provisionForInvestmentValue300 = new MonetaryItemType();
                                        provisionForInvestmentValue300.setContextRef(DBS12_SectionD_Layout2ProvisionForInvestmentContext297);
                                        
                                            provisionForInvestmentValue300.setUnitRef(INR296);
                                            provisionForInvestmentValue300.setDecimals("INF");
                                            provisionForInvestmentValue300.setValue(new BigDecimal(zeroDBS12_SectionD_Layout2ProvisionForInvestmentValue298));
                                        
                                        
                                        JAXBElement<MonetaryItemType> provisionForInvestmentElement301 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createProvisionForInvestment(provisionForInvestmentValue300);
                                        bodyElements.add(provisionForInvestmentElement301);
                                    }
                                
                            
                            
                            
                        
                        
                
                        
                        
                        
                    });
                    return "";
                }
                
                    
                
                
                // create variable for subclass DBSAuthorisedSignatory_Layout1 if any typeMembers then List or Single
                //DBSAuthorisedSignatory_Layout1 dBSAuthorisedSignatory_Layout1 = mainReportData.getDBSAuthorisedSignatory_Layout1();
                
                    private String dBSAuthorisedSignatory_Layout1Method(DBSAuthorisedSignatory_Layout1 dBSAuthorisedSignatory_Layout1, List<String> contextIdentifiers,  List<Context> contextElements, List<Object> bodyElements, List<String> unitIdentifiers, List<Unit> unitElements, String bankCode, String startDate, String endDate, String periodDate)
                
                    {
            
                    DBSAuthorisedSignatory_Layout1 field = dBSAuthorisedSignatory_Layout1;
                    
                    
                        
                        
                            
                            // - NameOfSignatory
                            
                                Map zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryMap304 = new HashMap<String, String>();
                                
                                    
                                    String zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryValue303 = DBS12ReportUtil.retrieveValueForElement(field.getNameOfSignatory(), zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryMap304);

                                    
                                        Context DBSAuthorisedSignatory_Layout1NameOfSignatoryContext302 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryValue303 != null && !"".equals(zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryValue303)) {
                                    
                                    addContext(DBSAuthorisedSignatory_Layout1NameOfSignatoryContext302, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType nameOfSignatoryValue305 = new StringItemType();
                                    nameOfSignatoryValue305.setContextRef(DBSAuthorisedSignatory_Layout1NameOfSignatoryContext302);
                                    
                                    nameOfSignatoryValue305.setValue(zeroDBSAuthorisedSignatory_Layout1NameOfSignatoryValue303);        
                                    
                                    
                                    JAXBElement<StringItemType> nameOfSignatoryElement306 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createNameOfSignatory(nameOfSignatoryValue305);
                                    bodyElements.add(nameOfSignatoryElement306);
                                
                            }
                        
                            
                            // - DesignationOfSignatory
                            
                                Map zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryMap309 = new HashMap<String, String>();
                                
                                    
                                    String zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryValue308 = DBS12ReportUtil.retrieveValueForElement(field.getDesignationOfSignatory(), zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryMap309);

                                    
                                        Context DBSAuthorisedSignatory_Layout1DesignationOfSignatoryContext307 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryValue308 != null && !"".equals(zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryValue308)) {
                                    
                                    addContext(DBSAuthorisedSignatory_Layout1DesignationOfSignatoryContext307, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType designationOfSignatoryValue310 = new StringItemType();
                                    designationOfSignatoryValue310.setContextRef(DBSAuthorisedSignatory_Layout1DesignationOfSignatoryContext307);
                                    
                                    designationOfSignatoryValue310.setValue(zeroDBSAuthorisedSignatory_Layout1DesignationOfSignatoryValue308);        
                                    
                                    
                                    JAXBElement<StringItemType> designationOfSignatoryElement311 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createDesignationOfSignatory(designationOfSignatoryValue310);
                                    bodyElements.add(designationOfSignatoryElement311);
                                
                            }
                        
                            
                            // - AuthorisedSignatoryOfficialLandlineNumber
                            
                                Map zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberMap314 = new HashMap<String, String>();
                                
                                    
                                    String zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue313 = DBS12ReportUtil.retrieveValueForElement(field.getAuthorisedSignatoryOfficialLandlineNumber(), zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberMap314);

                                    
                                        Context DBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext312 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue313 != null && !"".equals(zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue313)) {
                                    
                                    addContext(DBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext312, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType authorisedSignatoryOfficialLandlineNumberValue315 = new StringItemType();
                                    authorisedSignatoryOfficialLandlineNumberValue315.setContextRef(DBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberContext312);
                                    
                                    authorisedSignatoryOfficialLandlineNumberValue315.setValue(zeroDBSAuthorisedSignatory_Layout1AuthorisedSignatoryOfficialLandlineNumberValue313);        
                                    
                                    
                                    JAXBElement<StringItemType> authorisedSignatoryOfficialLandlineNumberElement316 = new org.rbi.in.xbrl.rbi_core.ObjectFactory().createAuthorisedSignatoryOfficialLandlineNumber(authorisedSignatoryOfficialLandlineNumberValue315);
                                    bodyElements.add(authorisedSignatoryOfficialLandlineNumberElement316);
                                
                            }
                        
                            
                            // - MobileNumberOfAuthorisedSignatory
                            
                                Map zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryMap319 = new HashMap<String, String>();
                                
                                    
                                    String zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue318 = DBS12ReportUtil.retrieveValueForElement(field.getMobileNumberOfAuthorisedSignatory(), zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryMap319);

                                    
                                        Context DBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext317 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue318 != null && !"".equals(zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue318)) {
                                    
                                    addContext(DBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext317, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType mobileNumberOfAuthorisedSignatoryValue320 = new StringItemType();
                                    mobileNumberOfAuthorisedSignatoryValue320.setContextRef(DBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryContext317);
                                    
                                    mobileNumberOfAuthorisedSignatoryValue320.setValue(zeroDBSAuthorisedSignatory_Layout1MobileNumberOfAuthorisedSignatoryValue318);        
                                    
                                    
                                    JAXBElement<StringItemType> mobileNumberOfAuthorisedSignatoryElement321 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createMobileNumberOfAuthorisedSignatory(mobileNumberOfAuthorisedSignatoryValue320);
                                    bodyElements.add(mobileNumberOfAuthorisedSignatoryElement321);
                                
                            }
                        
                            
                            // - EMailIDOfAuthorisedReportingOfficial
                            
                                Map zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialMap324 = new HashMap<String, String>();
                                
                                    
                                    String zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue323 = DBS12ReportUtil.retrieveValueForElement(field.getEMailIDOfAuthorisedReportingOfficial(), zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialMap324);

                                    
                                        Context DBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext322 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue323 != null && !"".equals(zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue323)) {
                                    
                                    addContext(DBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext322, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType eMailIDOfAuthorisedReportingOfficialValue325 = new StringItemType();
                                    eMailIDOfAuthorisedReportingOfficialValue325.setContextRef(DBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialContext322);
                                    
                                    eMailIDOfAuthorisedReportingOfficialValue325.setValue(zeroDBSAuthorisedSignatory_Layout1EMailIDOfAuthorisedReportingOfficialValue323);        
                                    
                                    
                                    JAXBElement<StringItemType> eMailIDOfAuthorisedReportingOfficialElement326 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createEMailIDOfAuthorisedReportingOfficial(eMailIDOfAuthorisedReportingOfficialValue325);
                                    bodyElements.add(eMailIDOfAuthorisedReportingOfficialElement326);
                                
                            }
                        
                            
                            // - Remarks
                            
                                Map zeroDBSAuthorisedSignatory_Layout1RemarksMap329 = new HashMap<String, String>();
                                
                                    
                                    String zeroDBSAuthorisedSignatory_Layout1RemarksValue328 = DBS12ReportUtil.retrieveValueForElement(field.getRemarks(), zeroDBSAuthorisedSignatory_Layout1RemarksMap329);

                                    
                                        Context DBSAuthorisedSignatory_Layout1RemarksContext327 = DBS12ReportContextUtil.createFromToContext( bankCode, startDate, endDate  );
                                        
                                
                                if(zeroDBSAuthorisedSignatory_Layout1RemarksValue328 != null && !"".equals(zeroDBSAuthorisedSignatory_Layout1RemarksValue328)) {
                                    
                                    addContext(DBSAuthorisedSignatory_Layout1RemarksContext327, contextElements, contextIdentifiers);
                                    
                                    
                                    
                                    StringItemType remarksValue330 = new StringItemType();
                                    remarksValue330.setContextRef(DBSAuthorisedSignatory_Layout1RemarksContext327);
                                    
                                    remarksValue330.setValue(zeroDBSAuthorisedSignatory_Layout1RemarksValue328);        
                                    
                                    
                                    JAXBElement<StringItemType> remarksElement331 = new org.rbi.in.xbrl._2012_04_25.rbi.ObjectFactory().createRemarks(remarksValue330);
                                    bodyElements.add(remarksElement331);
                                
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
    
    

