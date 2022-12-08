package in.armedu.banking.report.rbixbrl.db.service.dbs16;

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

import in.armedu.banking.report.rbixbrl.model.dbs16.*;
import in.armedu.banking.report.rbixbrl.model.FieldDataValue;

@Component
@Service
public class DBS16Calculator {

    @Autowired
    private DBS16Service dbs16Service; 

    public DBS16ReportData prepareReportData() {
        //create reportdata
        DBS16ReportData reportData = new DBS16ReportData();
        // start loop for  db models
        
                // retrieve FilingInfo_Layout1 entities from db
                // typedmember grouping clause
                List<DBS16FilingInfo_Layout1Entity> filinginfo_layout1Entities = (List<DBS16FilingInfo_Layout1Entity>) dbs16Service.getDbs16FilingInfo_Layout1Entities();
                Map<String, List<DBS16FilingInfo_Layout1Entity>> filinginfo_layout1ByTypeMembers = filinginfo_layout1Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForFilingInfo_Layout1(ent)), Collectors.mapping((DBS16FilingInfo_Layout1Entity p)-> p, Collectors.toList())));
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
                List<DBS16FilingInfo_Layout2Entity> filinginfo_layout2Entities = (List<DBS16FilingInfo_Layout2Entity>) dbs16Service.getDbs16FilingInfo_Layout2Entities();
                Map<String, List<DBS16FilingInfo_Layout2Entity>> filinginfo_layout2ByTypeMembers = filinginfo_layout2Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForFilingInfo_Layout2(ent)), Collectors.mapping((DBS16FilingInfo_Layout2Entity p)-> p, Collectors.toList())));
                filinginfo_layout2ByTypeMembers.forEach((key, filinginfo_layout2EntitiesList)->{
                    // initiate FilingInfo_Layout2 
                    FilingInfo_Layout2 filingInfo_Layout2 = new FilingInfo_Layout2();
                
                    // start all datafields and create mapping
                    
                        filinginfo_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("WhetherNilReporting")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    filingInfo_Layout2.getWhetherNilReporting().add(fieldDataValue);
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
                
                
                // retrieve DBS_StressedMSME_Layout1 entities from db
                // typedmember grouping clause
                List<DBS16DBS_StressedMSME_Layout1Entity> dbs_stressedmsme_layout1Entities = (List<DBS16DBS_StressedMSME_Layout1Entity>) dbs16Service.getDbs16DBS_StressedMSME_Layout1Entities();
                Map<String, List<DBS16DBS_StressedMSME_Layout1Entity>> dbs_stressedmsme_layout1ByTypeMembers = dbs_stressedmsme_layout1Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBS_StressedMSME_Layout1(ent)), Collectors.mapping((DBS16DBS_StressedMSME_Layout1Entity p)-> p, Collectors.toList())));
                dbs_stressedmsme_layout1ByTypeMembers.forEach((key, dbs_stressedmsme_layout1EntitiesList)->{
                    // initiate DBS_StressedMSME_Layout1 
                    DBS_StressedMSME_Layout1 dBS_StressedMSME_Layout1 = new DBS_StressedMSME_Layout1();
                
                    // start all datafields and create mapping
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NoFraudOrNoWilfulDefaulterFlag")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getNoFraudOrNoWilfulDefaulterFlag().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getPromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getWhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("LoanSanctionDateUnderCGSSD")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getLoanSanctionDateUnderCGSSD().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("LoanSanctionedUnderCGSSD")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getLoanSanctionedUnderCGSSD().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getWhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("TenureOfLoanSanctionedUnderTheCGSSD")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getTenureOfLoanSanctionedUnderTheCGSSD().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getTenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getCurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("LoanOutstandingClassificationUnderCGSSDAsOnReportingDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getLoanOutstandingClassificationUnderCGSSDAsOnReportingDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getCurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("MSMEAccountClassificationAsOnReportingDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getMSMEAccountClassificationAsOnReportingDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NoFraudOrNoWilfulDefaulterFlag")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getNoFraudOrNoWilfulDefaulterFlag().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getPromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getWhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("LoanSanctionDateUnderCGSSD")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getLoanSanctionDateUnderCGSSD().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("LoanSanctionedUnderCGSSD")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getLoanSanctionedUnderCGSSD().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getWhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("TenureOfLoanSanctionedUnderTheCGSSD")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getTenureOfLoanSanctionedUnderTheCGSSD().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getTenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getCurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("LoanOutstandingClassificationUnderCGSSDAsOnReportingDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getLoanOutstandingClassificationUnderCGSSDAsOnReportingDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getCurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("MSMEAccountClassificationAsOnReportingDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getMSMEAccountClassificationAsOnReportingDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NoFraudOrNoWilfulDefaulterFlag")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getNoFraudOrNoWilfulDefaulterFlag().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getPromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getWhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("LoanSanctionDateUnderCGSSD")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getLoanSanctionDateUnderCGSSD().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("LoanSanctionedUnderCGSSD")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getLoanSanctionedUnderCGSSD().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getWhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("TenureOfLoanSanctionedUnderTheCGSSD")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getTenureOfLoanSanctionedUnderTheCGSSD().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getTenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getCurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("LoanOutstandingClassificationUnderCGSSDAsOnReportingDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getLoanOutstandingClassificationUnderCGSSDAsOnReportingDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getCurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("MicroSmallAndMediumEnterprisesCategoryAxis", dbEntity.getMicroSmallAndMediumEnterprisesCategoryAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("MSMEAccountClassificationAsOnReportingDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getMSMEAccountClassificationAsOnReportingDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NoFraudOrNoWilfulDefaulterFlag")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getNoFraudOrNoWilfulDefaulterFlag().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getPromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getWhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("LoanSanctionDateUnderCGSSD")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getLoanSanctionDateUnderCGSSD().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("LoanSanctionedUnderCGSSD")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getLoanSanctionedUnderCGSSD().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getWhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("TenureOfLoanSanctionedUnderTheCGSSD")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getTenureOfLoanSanctionedUnderTheCGSSD().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getTenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getCurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("LoanOutstandingClassificationUnderCGSSDAsOnReportingDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getLoanOutstandingClassificationUnderCGSSDAsOnReportingDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getCurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("MSMEAccountClassificationAsOnReportingDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getMSMEAccountClassificationAsOnReportingDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("WhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getWhetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NoFraudOrNoWilfulDefaulterFlag")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getNoFraudOrNoWilfulDefaulterFlag().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getPromotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getExistingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getExistingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("WhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getWhetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("LoanSanctionDateUnderCGSSD")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getLoanSanctionDateUnderCGSSD().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("LoanSanctionedUnderCGSSD")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getLoanSanctionedUnderCGSSD().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("WhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getWhetherCGTMSEApprovalReceivedForTheGuaranteeCoverage().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("TenureOfLoanSanctionedUnderTheCGSSD")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getTenureOfLoanSanctionedUnderTheCGSSD().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("TenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getTenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("CurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getCurrentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("LoanOutstandingClassificationUnderCGSSDAsOnReportingDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getLoanOutstandingClassificationUnderCGSSDAsOnReportingDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("CurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getCurrentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("SectorsAxis", dbEntity.getSectorsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("MSMEAccountClassificationAsOnReportingDate")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    
                                    // add fieldDataValue to field
                                    dBS_StressedMSME_Layout1.getMSMEAccountClassificationAsOnReportingDate().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_stressedmsme_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_StressedMSME_Layout1.setNameOfBorrowerAxis(dbEntity.getNameOfBorrowerAxis());
                                    //fieldDataValue.getMembers().put("NameOfBorrowerAxis", dbEntity.getNameOfBorrowerAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setBorrowerPermanentAccountNumberAxis(dbEntity.getBorrowerPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("BorrowerPermanentAccountNumberAxis", dbEntity.getBorrowerPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setEligibleMicroSmallAndMediumEnterprisesEntityNameAxis(dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                    //fieldDataValue.getMembers().put("EligibleMicroSmallAndMediumEnterprisesEntityNameAxis", dbEntity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setMSMEEntityPermanentAccountNumberAxis(dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                    //fieldDataValue.getMembers().put("MSMEEntityPermanentAccountNumberAxis", dbEntity.getMSMEEntityPermanentAccountNumberAxis());
                                
                            
                                dBS_StressedMSME_Layout1.setStateAxis(dbEntity.getStateAxis());
                                    //fieldDataValue.getMembers().put("StateAxis", dbEntity.getStateAxis());
                                
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                        });
                        
                         
                    
                    // end all datafields and create mapping
                    // add model to reportdata
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    
                    
                        reportData.getDBS_StressedMSME_Layout1().add(dBS_StressedMSME_Layout1);
                    
                });
                
                
                // retrieve DBS_AuthorisedSignatory_Layout1 entities from db
                // typedmember grouping clause
                List<DBS16DBS_AuthorisedSignatory_Layout1Entity> dbs_authorisedsignatory_layout1Entities = (List<DBS16DBS_AuthorisedSignatory_Layout1Entity>) dbs16Service.getDbs16DBS_AuthorisedSignatory_Layout1Entities();
                Map<String, List<DBS16DBS_AuthorisedSignatory_Layout1Entity>> dbs_authorisedsignatory_layout1ByTypeMembers = dbs_authorisedsignatory_layout1Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBS_AuthorisedSignatory_Layout1(ent)), Collectors.mapping((DBS16DBS_AuthorisedSignatory_Layout1Entity p)-> p, Collectors.toList())));
                dbs_authorisedsignatory_layout1ByTypeMembers.forEach((key, dbs_authorisedsignatory_layout1EntitiesList)->{
                    // initiate DBS_AuthorisedSignatory_Layout1 
                    DBS_AuthorisedSignatory_Layout1 dBS_AuthorisedSignatory_Layout1 = new DBS_AuthorisedSignatory_Layout1();
                
                    // start all datafields and create mapping
                    
                        dbs_authorisedsignatory_layout1EntitiesList.forEach((dbEntity)->{
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
                                    dBS_AuthorisedSignatory_Layout1.getNameOfSignatory().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_authorisedsignatory_layout1EntitiesList.forEach((dbEntity)->{
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
                                    dBS_AuthorisedSignatory_Layout1.getDesignationOfSignatory().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_authorisedsignatory_layout1EntitiesList.forEach((dbEntity)->{
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
                                    dBS_AuthorisedSignatory_Layout1.getAuthorisedSignatoryOfficialLandlineNumber().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_authorisedsignatory_layout1EntitiesList.forEach((dbEntity)->{
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
                                    dBS_AuthorisedSignatory_Layout1.getMobileNumberOfAuthorisedSignatory().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_authorisedsignatory_layout1EntitiesList.forEach((dbEntity)->{
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
                                    dBS_AuthorisedSignatory_Layout1.getEMailIDOfAuthorisedReportingOfficial().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_authorisedsignatory_layout1EntitiesList.forEach((dbEntity)->{
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
                                    dBS_AuthorisedSignatory_Layout1.getRemarks().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_authorisedsignatory_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            
                            
                            
                            
                            
                            // adding explicit members
                            
                        });
                        
                         
                    
                    // end all datafields and create mapping
                    // add model to reportdata
                        
                        
                        
                        
                        
                        
                        
                    
                    
                        reportData.setDBS_AuthorisedSignatory_Layout1(dBS_AuthorisedSignatory_Layout1);
                    
                });
                
                
        // end loop for db models
        

        return reportData;

    }
    // start loop for  db models
    
        private String getGroupingClauseForFilingInfo_Layout1(DBS16FilingInfo_Layout1Entity filingInfo_Layout1Entity){
            return "-";
        }
        
        
        private String getGroupingClauseForFilingInfo_Layout2(DBS16FilingInfo_Layout2Entity filingInfo_Layout2Entity){
            return "-";
        }
        
        
        private String getGroupingClauseForDBS_StressedMSME_Layout1(DBS16DBS_StressedMSME_Layout1Entity dBS_StressedMSME_Layout1Entity){
            return "-"+dBS_StressedMSME_Layout1Entity.getNameOfBorrowerAxis()+dBS_StressedMSME_Layout1Entity.getBorrowerPermanentAccountNumberAxis()+dBS_StressedMSME_Layout1Entity.getEligibleMicroSmallAndMediumEnterprisesEntityNameAxis()+dBS_StressedMSME_Layout1Entity.getMSMEEntityPermanentAccountNumberAxis()+dBS_StressedMSME_Layout1Entity.getStateAxis();
        }
        
        
        private String getGroupingClauseForDBS_AuthorisedSignatory_Layout1(DBS16DBS_AuthorisedSignatory_Layout1Entity dBS_AuthorisedSignatory_Layout1Entity){
            return "-";
        }
        
        
// end loop for db models


}

