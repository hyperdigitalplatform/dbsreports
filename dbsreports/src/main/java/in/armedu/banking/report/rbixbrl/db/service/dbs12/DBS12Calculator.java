package in.armedu.banking.report.rbixbrl.db.service.dbs12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.lang.Long;

import org.hibernate.type.SetType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import in.armedu.banking.report.rbixbrl.model.dbs12.*;
import in.armedu.banking.report.rbixbrl.model.FieldDataValue;

@Component
@Service
public class DBS12Calculator {

    @Autowired
    private DBS12Service dbs12Service; 

    public DBS12ReportData prepareReportData() {
        //create reportdata
        DBS12ReportData reportData = new DBS12ReportData();
        // start loop for  db models
        
                // retrieve FilingInfo_Layout1 entities from db
                // typedmember grouping clause
                List<DBS12FilingInfo_Layout1Entity> filinginfo_layout1Entities = (List<DBS12FilingInfo_Layout1Entity>) dbs12Service.getDbs12FilingInfo_Layout1Entities();
                Map<String, List<DBS12FilingInfo_Layout1Entity>> filinginfo_layout1ByTypeMembers = filinginfo_layout1Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForFilingInfo_Layout1(ent)), Collectors.mapping((DBS12FilingInfo_Layout1Entity p)-> p, Collectors.toList())));
                filinginfo_layout1ByTypeMembers.forEach((key, filinginfo_layout1EntitiesList)->{
                    // initiate FilingInfo_Layout1 
                    FilingInfo_Layout1 filingInfo_Layout1 = new FilingInfo_Layout1();
                
                    // start all datafields and create mapping
                    
                        filinginfo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReturnName")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    filingInfo_Layout1.getReturnName().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        filinginfo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReturnCode")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    filingInfo_Layout1.getReturnCode().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        filinginfo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NameOfReportingInstitution")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    filingInfo_Layout1.getNameOfReportingInstitution().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        filinginfo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("BankCode")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    filingInfo_Layout1.getBankCode().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        filinginfo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("InstitutionType")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    filingInfo_Layout1.getInstitutionType().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        filinginfo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReportingFrequency")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    filingInfo_Layout1.getReportingFrequency().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        filinginfo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReportingPeriodStartDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    filingInfo_Layout1.getReportingPeriodStartDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        filinginfo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReportingPeriodEndDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    filingInfo_Layout1.getReportingPeriodEndDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        filinginfo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReportingCurrency")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    filingInfo_Layout1.getReportingCurrency().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        filinginfo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReportingScale")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    filingInfo_Layout1.getReportingScale().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        filinginfo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("TaxonomyVersion")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    filingInfo_Layout1.getTaxonomyVersion().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        filinginfo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ToolName")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    filingInfo_Layout1.getToolName().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        filinginfo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ToolVersion")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    filingInfo_Layout1.getToolVersion().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        filinginfo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReportStatus")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    filingInfo_Layout1.getReportStatus().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        filinginfo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("DateOfAudit")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    filingInfo_Layout1.getDateOfAudit().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        filinginfo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("GeneralRemarks")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    filingInfo_Layout1.getGeneralRemarks().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        filinginfo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                        });
                        
                         
                    
                    // end all datafields and create mapping
                    // add model to reportdata
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    
                    
                        reportData.setFilingInfo_Layout1(filingInfo_Layout1);
                    
                });
                
                
                // retrieve FilingInfo_Layout2 entities from db
                // typedmember grouping clause
                List<DBS12FilingInfo_Layout2Entity> filinginfo_layout2Entities = (List<DBS12FilingInfo_Layout2Entity>) dbs12Service.getDbs12FilingInfo_Layout2Entities();
                Map<String, List<DBS12FilingInfo_Layout2Entity>> filinginfo_layout2ByTypeMembers = filinginfo_layout2Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForFilingInfo_Layout2(ent)), Collectors.mapping((DBS12FilingInfo_Layout2Entity p)-> p, Collectors.toList())));
                filinginfo_layout2ByTypeMembers.forEach((key, filinginfo_layout2EntitiesList)->{
                    // initiate FilingInfo_Layout2 
                    FilingInfo_Layout2 filingInfo_Layout2 = new FilingInfo_Layout2();
                
                    // start all datafields and create mapping
                    
                        filinginfo_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("WhetherBankSubmittingTheReturnIsForeignBank")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    filingInfo_Layout2.getWhetherBankSubmittingTheReturnIsForeignBank().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        filinginfo_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            // adding explicit members
                            
                        });
                        
                         
                    
                    // end all datafields and create mapping
                    // add model to reportdata
                        
                        
                    
                    
                        reportData.setFilingInfo_Layout2(filingInfo_Layout2);
                    
                });
                
                
                // retrieve DBS12_SectionA_Layout1 entities from db
                // typedmember grouping clause
                List<DBS12DBS12_SectionA_Layout1Entity> dbs12_sectiona_layout1Entities = (List<DBS12DBS12_SectionA_Layout1Entity>) dbs12Service.getDbs12DBS12_SectionA_Layout1Entities();
                Map<String, List<DBS12DBS12_SectionA_Layout1Entity>> dbs12_sectiona_layout1ByTypeMembers = dbs12_sectiona_layout1Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBS12_SectionA_Layout1(ent)), Collectors.mapping((DBS12DBS12_SectionA_Layout1Entity p)-> p, Collectors.toList())));
                dbs12_sectiona_layout1ByTypeMembers.forEach((key, dbs12_sectiona_layout1EntitiesList)->{
                    // initiate DBS12_SectionA_Layout1 
                    DBS12_SectionA_Layout1 dBS12_SectionA_Layout1 = new DBS12_SectionA_Layout1();
                
                    // start all datafields and create mapping
                    
                        dbs12_sectiona_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionA_Layout1.setNameOfEntityAxis(dbEntity.getNameOfEntityAxis());
                                    //fieldDataValue.getMembers().put("NameOfEntityAxis", dbEntity.getNameOfEntityAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("TypeOfEntity")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionA_Layout1.getTypeOfEntity().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectiona_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionA_Layout1.setNameOfEntityAxis(dbEntity.getNameOfEntityAxis());
                                    //fieldDataValue.getMembers().put("NameOfEntityAxis", dbEntity.getNameOfEntityAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("FinancialClassification")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionA_Layout1.getFinancialClassification().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectiona_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionA_Layout1.setNameOfEntityAxis(dbEntity.getNameOfEntityAxis());
                                    //fieldDataValue.getMembers().put("NameOfEntityAxis", dbEntity.getNameOfEntityAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                        });
                        
                         
                    
                    // end all datafields and create mapping
                    // add model to reportdata
                        
                        
                        
                        
                    
                    
                        reportData.getDBS12_SectionA_Layout1().add(dBS12_SectionA_Layout1);
                    
                });
                
                
                // retrieve DBS12_SectionB_Layout1 entities from db
                // typedmember grouping clause
                List<DBS12DBS12_SectionB_Layout1Entity> dbs12_sectionb_layout1Entities = (List<DBS12DBS12_SectionB_Layout1Entity>) dbs12Service.getDbs12DBS12_SectionB_Layout1Entities();
                Map<String, List<DBS12DBS12_SectionB_Layout1Entity>> dbs12_sectionb_layout1ByTypeMembers = dbs12_sectionb_layout1Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBS12_SectionB_Layout1(ent)), Collectors.mapping((DBS12DBS12_SectionB_Layout1Entity p)-> p, Collectors.toList())));
                dbs12_sectionb_layout1ByTypeMembers.forEach((key, dbs12_sectionb_layout1EntitiesList)->{
                    // initiate DBS12_SectionB_Layout1 
                    DBS12_SectionB_Layout1 dBS12_SectionB_Layout1 = new DBS12_SectionB_Layout1();
                
                    // start all datafields and create mapping
                    
                        dbs12_sectionb_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionB_Layout1.setNameOfEntityAxis(dbEntity.getNameOfEntityAxis());
                                    //fieldDataValue.getMembers().put("NameOfEntityAxis", dbEntity.getNameOfEntityAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("TypeOfEntity")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionB_Layout1.getTypeOfEntity().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectionb_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionB_Layout1.setNameOfEntityAxis(dbEntity.getNameOfEntityAxis());
                                    //fieldDataValue.getMembers().put("NameOfEntityAxis", dbEntity.getNameOfEntityAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("FinancialClassification")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionB_Layout1.getFinancialClassification().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectionb_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionB_Layout1.setNameOfEntityAxis(dbEntity.getNameOfEntityAxis());
                                    //fieldDataValue.getMembers().put("NameOfEntityAxis", dbEntity.getNameOfEntityAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("BanksEquityInvestmentInTheCompany")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionB_Layout1.getBanksEquityInvestmentInTheCompany().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectionb_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionB_Layout1.setNameOfEntityAxis(dbEntity.getNameOfEntityAxis());
                                    //fieldDataValue.getMembers().put("NameOfEntityAxis", dbEntity.getNameOfEntityAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("BanksPercentageInvestmentInCompanyEquity")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionB_Layout1.getBanksPercentageInvestmentInCompanyEquity().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectionb_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionB_Layout1.setNameOfEntityAxis(dbEntity.getNameOfEntityAxis());
                                    //fieldDataValue.getMembers().put("NameOfEntityAxis", dbEntity.getNameOfEntityAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("AggregateAmountOutstandingForFundedExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionB_Layout1.getAggregateAmountOutstandingForFundedExposure().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectionb_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionB_Layout1.setNameOfEntityAxis(dbEntity.getNameOfEntityAxis());
                                    //fieldDataValue.getMembers().put("NameOfEntityAxis", dbEntity.getNameOfEntityAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("FundedCreditExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionB_Layout1.getFundedCreditExposure().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectionb_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionB_Layout1.setNameOfEntityAxis(dbEntity.getNameOfEntityAxis());
                                    //fieldDataValue.getMembers().put("NameOfEntityAxis", dbEntity.getNameOfEntityAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("AggregateAmountOutstandingForNonFundedExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionB_Layout1.getAggregateAmountOutstandingForNonFundedExposure().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectionb_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionB_Layout1.setNameOfEntityAxis(dbEntity.getNameOfEntityAxis());
                                    //fieldDataValue.getMembers().put("NameOfEntityAxis", dbEntity.getNameOfEntityAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NonFundedCreditExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionB_Layout1.getNonFundedCreditExposure().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectionb_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionB_Layout1.setNameOfEntityAxis(dbEntity.getNameOfEntityAxis());
                                    //fieldDataValue.getMembers().put("NameOfEntityAxis", dbEntity.getNameOfEntityAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("AggregateInvestmentExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionB_Layout1.getAggregateInvestmentExposure().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectionb_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionB_Layout1.setNameOfEntityAxis(dbEntity.getNameOfEntityAxis());
                                    //fieldDataValue.getMembers().put("NameOfEntityAxis", dbEntity.getNameOfEntityAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ExemptedExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionB_Layout1.getExemptedExposure().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectionb_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionB_Layout1.setNameOfEntityAxis(dbEntity.getNameOfEntityAxis());
                                    //fieldDataValue.getMembers().put("NameOfEntityAxis", dbEntity.getNameOfEntityAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("AggregateAmountOutstanding")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionB_Layout1.getAggregateAmountOutstanding().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectionb_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionB_Layout1.setNameOfEntityAxis(dbEntity.getNameOfEntityAxis());
                                    //fieldDataValue.getMembers().put("NameOfEntityAxis", dbEntity.getNameOfEntityAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("AggregateExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionB_Layout1.getAggregateExposure().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectionb_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionB_Layout1.setNameOfEntityAxis(dbEntity.getNameOfEntityAxis());
                                    //fieldDataValue.getMembers().put("NameOfEntityAxis", dbEntity.getNameOfEntityAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("AssetClassifications")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionB_Layout1.getAssetClassifications().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectionb_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionB_Layout1.setNameOfEntityAxis(dbEntity.getNameOfEntityAxis());
                                    //fieldDataValue.getMembers().put("NameOfEntityAxis", dbEntity.getNameOfEntityAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("AmountOfAggregateProvisionsHeldForNPAs")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionB_Layout1.getAmountOfAggregateProvisionsHeldForNPAs().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectionb_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionB_Layout1.setNameOfEntityAxis(dbEntity.getNameOfEntityAxis());
                                    //fieldDataValue.getMembers().put("NameOfEntityAxis", dbEntity.getNameOfEntityAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("AmountOfUnsecuredAmountOutstandingOfTotalAmountOutstanding")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionB_Layout1.getAmountOfUnsecuredAmountOutstandingOfTotalAmountOutstanding().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectionb_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionB_Layout1.setNameOfEntityAxis(dbEntity.getNameOfEntityAxis());
                                    //fieldDataValue.getMembers().put("NameOfEntityAxis", dbEntity.getNameOfEntityAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReasonsForBreachOfStipulatedPrudentialLimits")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionB_Layout1.getReasonsForBreachOfStipulatedPrudentialLimits().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectionb_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionB_Layout1.setNameOfEntityAxis(dbEntity.getNameOfEntityAxis());
                                    //fieldDataValue.getMembers().put("NameOfEntityAxis", dbEntity.getNameOfEntityAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("DescriptionOfIntraGroupSupportArrangementsOrAgreements")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionB_Layout1.getDescriptionOfIntraGroupSupportArrangementsOrAgreements().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectionb_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionB_Layout1.setNameOfEntityAxis(dbEntity.getNameOfEntityAxis());
                                    //fieldDataValue.getMembers().put("NameOfEntityAxis", dbEntity.getNameOfEntityAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                        });
                        
                         
                    
                    // end all datafields and create mapping
                    // add model to reportdata
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    
                    
                        reportData.getDBS12_SectionB_Layout1().add(dBS12_SectionB_Layout1);
                    
                });
                
                
                // retrieve DBS12_SectionC_Layout1 entities from db
                // typedmember grouping clause
                List<DBS12DBS12_SectionC_Layout1Entity> dbs12_sectionc_layout1Entities = (List<DBS12DBS12_SectionC_Layout1Entity>) dbs12Service.getDbs12DBS12_SectionC_Layout1Entities();
                Map<String, List<DBS12DBS12_SectionC_Layout1Entity>> dbs12_sectionc_layout1ByTypeMembers = dbs12_sectionc_layout1Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBS12_SectionC_Layout1(ent)), Collectors.mapping((DBS12DBS12_SectionC_Layout1Entity p)-> p, Collectors.toList())));
                dbs12_sectionc_layout1ByTypeMembers.forEach((key, dbs12_sectionc_layout1EntitiesList)->{
                    // initiate DBS12_SectionC_Layout1 
                    DBS12_SectionC_Layout1 dBS12_SectionC_Layout1 = new DBS12_SectionC_Layout1();
                
                    // start all datafields and create mapping
                    
                        dbs12_sectionc_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionC_Layout1.setUniqueTransactionCodeAxis(dbEntity.getUniqueTransactionCodeAxis());
                                    //fieldDataValue.getMembers().put("UniqueTransactionCodeAxis", dbEntity.getUniqueTransactionCodeAxis());
                                
                            
                                dBS12_SectionC_Layout1.setNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis(dbEntity.getNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis());
                                    //fieldDataValue.getMembers().put("NameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis", dbEntity.getNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("TypeOfEntity")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionC_Layout1.getTypeOfEntity().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectionc_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionC_Layout1.setUniqueTransactionCodeAxis(dbEntity.getUniqueTransactionCodeAxis());
                                    //fieldDataValue.getMembers().put("UniqueTransactionCodeAxis", dbEntity.getUniqueTransactionCodeAxis());
                                
                            
                                dBS12_SectionC_Layout1.setNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis(dbEntity.getNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis());
                                    //fieldDataValue.getMembers().put("NameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis", dbEntity.getNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("TypeOfExposures")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionC_Layout1.getTypeOfExposures().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectionc_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionC_Layout1.setUniqueTransactionCodeAxis(dbEntity.getUniqueTransactionCodeAxis());
                                    //fieldDataValue.getMembers().put("UniqueTransactionCodeAxis", dbEntity.getUniqueTransactionCodeAxis());
                                
                            
                                dBS12_SectionC_Layout1.setNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis(dbEntity.getNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis());
                                    //fieldDataValue.getMembers().put("NameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis", dbEntity.getNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ExposureAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionC_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectionc_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionC_Layout1.setUniqueTransactionCodeAxis(dbEntity.getUniqueTransactionCodeAxis());
                                    //fieldDataValue.getMembers().put("UniqueTransactionCodeAxis", dbEntity.getUniqueTransactionCodeAxis());
                                
                            
                                dBS12_SectionC_Layout1.setNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis(dbEntity.getNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis());
                                    //fieldDataValue.getMembers().put("NameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis", dbEntity.getNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("TermOfCreditExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionC_Layout1.getTermOfCreditExposure().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectionc_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionC_Layout1.setUniqueTransactionCodeAxis(dbEntity.getUniqueTransactionCodeAxis());
                                    //fieldDataValue.getMembers().put("UniqueTransactionCodeAxis", dbEntity.getUniqueTransactionCodeAxis());
                                
                            
                                dBS12_SectionC_Layout1.setNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis(dbEntity.getNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis());
                                    //fieldDataValue.getMembers().put("NameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis", dbEntity.getNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ValueOfSecuritiesCollateral")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionC_Layout1.getValueOfSecuritiesCollateral().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectionc_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionC_Layout1.setUniqueTransactionCodeAxis(dbEntity.getUniqueTransactionCodeAxis());
                                    //fieldDataValue.getMembers().put("UniqueTransactionCodeAxis", dbEntity.getUniqueTransactionCodeAxis());
                                
                            
                                dBS12_SectionC_Layout1.setNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis(dbEntity.getNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis());
                                    //fieldDataValue.getMembers().put("NameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis", dbEntity.getNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("AssetClassifications")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionC_Layout1.getAssetClassifications().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectionc_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionC_Layout1.setUniqueTransactionCodeAxis(dbEntity.getUniqueTransactionCodeAxis());
                                    //fieldDataValue.getMembers().put("UniqueTransactionCodeAxis", dbEntity.getUniqueTransactionCodeAxis());
                                
                            
                                dBS12_SectionC_Layout1.setNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis(dbEntity.getNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis());
                                    //fieldDataValue.getMembers().put("NameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis", dbEntity.getNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ProvisionForInvestment")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionC_Layout1.getProvisionForInvestment().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectionc_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionC_Layout1.setUniqueTransactionCodeAxis(dbEntity.getUniqueTransactionCodeAxis());
                                    //fieldDataValue.getMembers().put("UniqueTransactionCodeAxis", dbEntity.getUniqueTransactionCodeAxis());
                                
                            
                                dBS12_SectionC_Layout1.setNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis(dbEntity.getNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis());
                                    //fieldDataValue.getMembers().put("NameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis", dbEntity.getNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                        });
                        
                         
                    
                    // end all datafields and create mapping
                    // add model to reportdata
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    
                    
                        reportData.getDBS12_SectionC_Layout1().add(dBS12_SectionC_Layout1);
                    
                });
                
                
                // retrieve DBS12_SectionD_Layout1 entities from db
                // typedmember grouping clause
                List<DBS12DBS12_SectionD_Layout1Entity> dbs12_sectiond_layout1Entities = (List<DBS12DBS12_SectionD_Layout1Entity>) dbs12Service.getDbs12DBS12_SectionD_Layout1Entities();
                Map<String, List<DBS12DBS12_SectionD_Layout1Entity>> dbs12_sectiond_layout1ByTypeMembers = dbs12_sectiond_layout1Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBS12_SectionD_Layout1(ent)), Collectors.mapping((DBS12DBS12_SectionD_Layout1Entity p)-> p, Collectors.toList())));
                dbs12_sectiond_layout1ByTypeMembers.forEach((key, dbs12_sectiond_layout1EntitiesList)->{
                    // initiate DBS12_SectionD_Layout1 
                    DBS12_SectionD_Layout1 dBS12_SectionD_Layout1 = new DBS12_SectionD_Layout1();
                
                    // start all datafields and create mapping
                    
                        dbs12_sectiond_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionD_Layout1.setUniqueTransactionCodeAxis(dbEntity.getUniqueTransactionCodeAxis());
                                    //fieldDataValue.getMembers().put("UniqueTransactionCodeAxis", dbEntity.getUniqueTransactionCodeAxis());
                                
                            
                                dBS12_SectionD_Layout1.setNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis(dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                    //fieldDataValue.getMembers().put("NameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis", dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("TypeOfExposures")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionD_Layout1.getTypeOfExposures().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectiond_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionD_Layout1.setUniqueTransactionCodeAxis(dbEntity.getUniqueTransactionCodeAxis());
                                    //fieldDataValue.getMembers().put("UniqueTransactionCodeAxis", dbEntity.getUniqueTransactionCodeAxis());
                                
                            
                                dBS12_SectionD_Layout1.setNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis(dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                    //fieldDataValue.getMembers().put("NameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis", dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ExposureAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionD_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectiond_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionD_Layout1.setUniqueTransactionCodeAxis(dbEntity.getUniqueTransactionCodeAxis());
                                    //fieldDataValue.getMembers().put("UniqueTransactionCodeAxis", dbEntity.getUniqueTransactionCodeAxis());
                                
                            
                                dBS12_SectionD_Layout1.setNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis(dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                    //fieldDataValue.getMembers().put("NameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis", dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("TermOfCreditExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionD_Layout1.getTermOfCreditExposure().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectiond_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionD_Layout1.setUniqueTransactionCodeAxis(dbEntity.getUniqueTransactionCodeAxis());
                                    //fieldDataValue.getMembers().put("UniqueTransactionCodeAxis", dbEntity.getUniqueTransactionCodeAxis());
                                
                            
                                dBS12_SectionD_Layout1.setNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis(dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                    //fieldDataValue.getMembers().put("NameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis", dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ValueOfSecuritiesCollateral")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionD_Layout1.getValueOfSecuritiesCollateral().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectiond_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionD_Layout1.setUniqueTransactionCodeAxis(dbEntity.getUniqueTransactionCodeAxis());
                                    //fieldDataValue.getMembers().put("UniqueTransactionCodeAxis", dbEntity.getUniqueTransactionCodeAxis());
                                
                            
                                dBS12_SectionD_Layout1.setNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis(dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                    //fieldDataValue.getMembers().put("NameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis", dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("AssetClassifications")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionD_Layout1.getAssetClassifications().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectiond_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionD_Layout1.setUniqueTransactionCodeAxis(dbEntity.getUniqueTransactionCodeAxis());
                                    //fieldDataValue.getMembers().put("UniqueTransactionCodeAxis", dbEntity.getUniqueTransactionCodeAxis());
                                
                            
                                dBS12_SectionD_Layout1.setNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis(dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                    //fieldDataValue.getMembers().put("NameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis", dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ProvisionForInvestment")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionD_Layout1.getProvisionForInvestment().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectiond_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionD_Layout1.setUniqueTransactionCodeAxis(dbEntity.getUniqueTransactionCodeAxis());
                                    //fieldDataValue.getMembers().put("UniqueTransactionCodeAxis", dbEntity.getUniqueTransactionCodeAxis());
                                
                            
                                dBS12_SectionD_Layout1.setNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis(dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                    //fieldDataValue.getMembers().put("NameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis", dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                        });
                        
                         
                    
                    // end all datafields and create mapping
                    // add model to reportdata
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    
                    
                        reportData.getDBS12_SectionD_Layout1().add(dBS12_SectionD_Layout1);
                    
                });
                
                
                // retrieve DBS12_SectionD_Layout2 entities from db
                // typedmember grouping clause
                List<DBS12DBS12_SectionD_Layout2Entity> dbs12_sectiond_layout2Entities = (List<DBS12DBS12_SectionD_Layout2Entity>) dbs12Service.getDbs12DBS12_SectionD_Layout2Entities();
                Map<String, List<DBS12DBS12_SectionD_Layout2Entity>> dbs12_sectiond_layout2ByTypeMembers = dbs12_sectiond_layout2Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBS12_SectionD_Layout2(ent)), Collectors.mapping((DBS12DBS12_SectionD_Layout2Entity p)-> p, Collectors.toList())));
                dbs12_sectiond_layout2ByTypeMembers.forEach((key, dbs12_sectiond_layout2EntitiesList)->{
                    // initiate DBS12_SectionD_Layout2 
                    DBS12_SectionD_Layout2 dBS12_SectionD_Layout2 = new DBS12_SectionD_Layout2();
                
                    // start all datafields and create mapping
                    
                        dbs12_sectiond_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionD_Layout2.setUniqueTransactionCodeAxis(dbEntity.getUniqueTransactionCodeAxis());
                                    //fieldDataValue.getMembers().put("UniqueTransactionCodeAxis", dbEntity.getUniqueTransactionCodeAxis());
                                
                            
                                dBS12_SectionD_Layout2.setNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis(dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                    //fieldDataValue.getMembers().put("NameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis", dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                
                            
                                dBS12_SectionD_Layout2.setNameOfInterestedDirectorManagerAxis(dbEntity.getNameOfInterestedDirectorManagerAxis());
                                    //fieldDataValue.getMembers().put("NameOfInterestedDirectorManagerAxis", dbEntity.getNameOfInterestedDirectorManagerAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("TypeOfEntity")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionD_Layout2.getTypeOfEntity().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectiond_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionD_Layout2.setUniqueTransactionCodeAxis(dbEntity.getUniqueTransactionCodeAxis());
                                    //fieldDataValue.getMembers().put("UniqueTransactionCodeAxis", dbEntity.getUniqueTransactionCodeAxis());
                                
                            
                                dBS12_SectionD_Layout2.setNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis(dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                    //fieldDataValue.getMembers().put("NameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis", dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                
                            
                                dBS12_SectionD_Layout2.setNameOfInterestedDirectorManagerAxis(dbEntity.getNameOfInterestedDirectorManagerAxis());
                                    //fieldDataValue.getMembers().put("NameOfInterestedDirectorManagerAxis", dbEntity.getNameOfInterestedDirectorManagerAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("TypeOfExposures")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionD_Layout2.getTypeOfExposures().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectiond_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionD_Layout2.setUniqueTransactionCodeAxis(dbEntity.getUniqueTransactionCodeAxis());
                                    //fieldDataValue.getMembers().put("UniqueTransactionCodeAxis", dbEntity.getUniqueTransactionCodeAxis());
                                
                            
                                dBS12_SectionD_Layout2.setNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis(dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                    //fieldDataValue.getMembers().put("NameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis", dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                
                            
                                dBS12_SectionD_Layout2.setNameOfInterestedDirectorManagerAxis(dbEntity.getNameOfInterestedDirectorManagerAxis());
                                    //fieldDataValue.getMembers().put("NameOfInterestedDirectorManagerAxis", dbEntity.getNameOfInterestedDirectorManagerAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ExposureAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionD_Layout2.getExposureAmount().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectiond_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionD_Layout2.setUniqueTransactionCodeAxis(dbEntity.getUniqueTransactionCodeAxis());
                                    //fieldDataValue.getMembers().put("UniqueTransactionCodeAxis", dbEntity.getUniqueTransactionCodeAxis());
                                
                            
                                dBS12_SectionD_Layout2.setNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis(dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                    //fieldDataValue.getMembers().put("NameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis", dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                
                            
                                dBS12_SectionD_Layout2.setNameOfInterestedDirectorManagerAxis(dbEntity.getNameOfInterestedDirectorManagerAxis());
                                    //fieldDataValue.getMembers().put("NameOfInterestedDirectorManagerAxis", dbEntity.getNameOfInterestedDirectorManagerAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("TermOfCreditExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionD_Layout2.getTermOfCreditExposure().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectiond_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionD_Layout2.setUniqueTransactionCodeAxis(dbEntity.getUniqueTransactionCodeAxis());
                                    //fieldDataValue.getMembers().put("UniqueTransactionCodeAxis", dbEntity.getUniqueTransactionCodeAxis());
                                
                            
                                dBS12_SectionD_Layout2.setNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis(dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                    //fieldDataValue.getMembers().put("NameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis", dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                
                            
                                dBS12_SectionD_Layout2.setNameOfInterestedDirectorManagerAxis(dbEntity.getNameOfInterestedDirectorManagerAxis());
                                    //fieldDataValue.getMembers().put("NameOfInterestedDirectorManagerAxis", dbEntity.getNameOfInterestedDirectorManagerAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ValueOfSecuritiesCollateral")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionD_Layout2.getValueOfSecuritiesCollateral().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectiond_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionD_Layout2.setUniqueTransactionCodeAxis(dbEntity.getUniqueTransactionCodeAxis());
                                    //fieldDataValue.getMembers().put("UniqueTransactionCodeAxis", dbEntity.getUniqueTransactionCodeAxis());
                                
                            
                                dBS12_SectionD_Layout2.setNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis(dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                    //fieldDataValue.getMembers().put("NameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis", dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                
                            
                                dBS12_SectionD_Layout2.setNameOfInterestedDirectorManagerAxis(dbEntity.getNameOfInterestedDirectorManagerAxis());
                                    //fieldDataValue.getMembers().put("NameOfInterestedDirectorManagerAxis", dbEntity.getNameOfInterestedDirectorManagerAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("AssetClassifications")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionD_Layout2.getAssetClassifications().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectiond_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionD_Layout2.setUniqueTransactionCodeAxis(dbEntity.getUniqueTransactionCodeAxis());
                                    //fieldDataValue.getMembers().put("UniqueTransactionCodeAxis", dbEntity.getUniqueTransactionCodeAxis());
                                
                            
                                dBS12_SectionD_Layout2.setNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis(dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                    //fieldDataValue.getMembers().put("NameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis", dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                
                            
                                dBS12_SectionD_Layout2.setNameOfInterestedDirectorManagerAxis(dbEntity.getNameOfInterestedDirectorManagerAxis());
                                    //fieldDataValue.getMembers().put("NameOfInterestedDirectorManagerAxis", dbEntity.getNameOfInterestedDirectorManagerAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ProvisionForInvestment")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS12_SectionD_Layout2.getProvisionForInvestment().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs12_sectiond_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS12_SectionD_Layout2.setUniqueTransactionCodeAxis(dbEntity.getUniqueTransactionCodeAxis());
                                    //fieldDataValue.getMembers().put("UniqueTransactionCodeAxis", dbEntity.getUniqueTransactionCodeAxis());
                                
                            
                                dBS12_SectionD_Layout2.setNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis(dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                    //fieldDataValue.getMembers().put("NameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis", dbEntity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis());
                                
                            
                                dBS12_SectionD_Layout2.setNameOfInterestedDirectorManagerAxis(dbEntity.getNameOfInterestedDirectorManagerAxis());
                                    //fieldDataValue.getMembers().put("NameOfInterestedDirectorManagerAxis", dbEntity.getNameOfInterestedDirectorManagerAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                        });
                        
                         
                    
                    // end all datafields and create mapping
                    // add model to reportdata
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    
                    
                        reportData.getDBS12_SectionD_Layout2().add(dBS12_SectionD_Layout2);
                    
                });
                
                
                // retrieve DBSAuthorisedSignatory_Layout1 entities from db
                // typedmember grouping clause
                List<DBS12DBSAuthorisedSignatory_Layout1Entity> dbsauthorisedsignatory_layout1Entities = (List<DBS12DBSAuthorisedSignatory_Layout1Entity>) dbs12Service.getDbs12DBSAuthorisedSignatory_Layout1Entities();
                Map<String, List<DBS12DBSAuthorisedSignatory_Layout1Entity>> dbsauthorisedsignatory_layout1ByTypeMembers = dbsauthorisedsignatory_layout1Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBSAuthorisedSignatory_Layout1(ent)), Collectors.mapping((DBS12DBSAuthorisedSignatory_Layout1Entity p)-> p, Collectors.toList())));
                dbsauthorisedsignatory_layout1ByTypeMembers.forEach((key, dbsauthorisedsignatory_layout1EntitiesList)->{
                    // initiate DBSAuthorisedSignatory_Layout1 
                    DBSAuthorisedSignatory_Layout1 dBSAuthorisedSignatory_Layout1 = new DBSAuthorisedSignatory_Layout1();
                
                    // start all datafields and create mapping
                    
                        dbsauthorisedsignatory_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NameOfSignatory")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBSAuthorisedSignatory_Layout1.getNameOfSignatory().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbsauthorisedsignatory_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("DesignationOfSignatory")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBSAuthorisedSignatory_Layout1.getDesignationOfSignatory().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbsauthorisedsignatory_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("AuthorisedSignatoryOfficialLandlineNumber")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBSAuthorisedSignatory_Layout1.getAuthorisedSignatoryOfficialLandlineNumber().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbsauthorisedsignatory_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("MobileNumberOfAuthorisedSignatory")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBSAuthorisedSignatory_Layout1.getMobileNumberOfAuthorisedSignatory().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbsauthorisedsignatory_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("EMailIDOfAuthorisedReportingOfficial")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBSAuthorisedSignatory_Layout1.getEMailIDOfAuthorisedReportingOfficial().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbsauthorisedsignatory_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("Remarks")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBSAuthorisedSignatory_Layout1.getRemarks().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbsauthorisedsignatory_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                        });
                        
                         
                    
                    // end all datafields and create mapping
                    // add model to reportdata
                        
                        
                        
                        
                        
                        
                        
                    
                    
                        reportData.setDBSAuthorisedSignatory_Layout1(dBSAuthorisedSignatory_Layout1);
                    
                });
                
                
        // end loop for db models
        

        return reportData;

    }
    // start loop for  db models
    
        private String getGroupingClauseForFilingInfo_Layout1(DBS12FilingInfo_Layout1Entity filingInfo_Layout1Entity){
            return "-";
        }
        
        
        private String getGroupingClauseForFilingInfo_Layout2(DBS12FilingInfo_Layout2Entity filingInfo_Layout2Entity){
            return "-";
        }
        
        
        private String getGroupingClauseForDBS12_SectionA_Layout1(DBS12DBS12_SectionA_Layout1Entity dBS12_SectionA_Layout1Entity){
            return "-"+dBS12_SectionA_Layout1Entity.getNameOfEntityAxis();
        }
        
        
        private String getGroupingClauseForDBS12_SectionB_Layout1(DBS12DBS12_SectionB_Layout1Entity dBS12_SectionB_Layout1Entity){
            return "-"+dBS12_SectionB_Layout1Entity.getNameOfEntityAxis();
        }
        
        
        private String getGroupingClauseForDBS12_SectionC_Layout1(DBS12DBS12_SectionC_Layout1Entity dBS12_SectionC_Layout1Entity){
            return "-"+dBS12_SectionC_Layout1Entity.getUniqueTransactionCodeAxis()+dBS12_SectionC_Layout1Entity.getNameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis();
        }
        
        
        private String getGroupingClauseForDBS12_SectionD_Layout1(DBS12DBS12_SectionD_Layout1Entity dBS12_SectionD_Layout1Entity){
            return "-"+dBS12_SectionD_Layout1Entity.getUniqueTransactionCodeAxis()+dBS12_SectionD_Layout1Entity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis();
        }
        
        
        private String getGroupingClauseForDBS12_SectionD_Layout2(DBS12DBS12_SectionD_Layout2Entity dBS12_SectionD_Layout2Entity){
            return "-"+dBS12_SectionD_Layout2Entity.getUniqueTransactionCodeAxis()+dBS12_SectionD_Layout2Entity.getNameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis()+dBS12_SectionD_Layout2Entity.getNameOfInterestedDirectorManagerAxis();
        }
        
        
        private String getGroupingClauseForDBSAuthorisedSignatory_Layout1(DBS12DBSAuthorisedSignatory_Layout1Entity dBSAuthorisedSignatory_Layout1Entity){
            return "-";
        }
        
        
// end loop for db models


}

