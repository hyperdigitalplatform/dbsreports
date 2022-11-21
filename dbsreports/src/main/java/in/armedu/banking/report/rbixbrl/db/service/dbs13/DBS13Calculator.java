package in.armedu.banking.report.rbixbrl.db.service.dbs13;

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

import in.armedu.banking.report.rbixbrl.model.dbs13.*;
import in.armedu.banking.report.rbixbrl.model.FieldDataValue;

@Component
@Service
public class DBS13Calculator {

    @Autowired
    private DBS13Service dbs13Service; 

    public DBS13ReportData prepareReportData() {
        //create reportdata
        DBS13ReportData reportData = new DBS13ReportData();
        // start loop for  db models
        
                // retrieve FilingInfo_Layout1 entities from db
                // typedmember grouping clause
                List<DBS13FilingInfo_Layout1Entity> filinginfo_layout1Entities = (List<DBS13FilingInfo_Layout1Entity>) dbs13Service.getDbs13FilingInfo_Layout1Entities();
                Map<String, List<DBS13FilingInfo_Layout1Entity>> filinginfo_layout1ByTypeMembers = filinginfo_layout1Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForFilingInfo_Layout1(ent)), Collectors.mapping((DBS13FilingInfo_Layout1Entity p)-> p, Collectors.toList())));
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
                List<DBS13FilingInfo_Layout2Entity> filinginfo_layout2Entities = (List<DBS13FilingInfo_Layout2Entity>) dbs13Service.getDbs13FilingInfo_Layout2Entities();
                Map<String, List<DBS13FilingInfo_Layout2Entity>> filinginfo_layout2ByTypeMembers = filinginfo_layout2Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForFilingInfo_Layout2(ent)), Collectors.mapping((DBS13FilingInfo_Layout2Entity p)-> p, Collectors.toList())));
                filinginfo_layout2ByTypeMembers.forEach((key, filinginfo_layout2EntitiesList)->{
                    // initiate FilingInfo_Layout2 
                    FilingInfo_Layout2 filingInfo_Layout2 = new FilingInfo_Layout2();
                
                    // start all datafields and create mapping
                    
                        filinginfo_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            // adding explicit members
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("WhetherBankHasSubsidiaries")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add fieldDataValue to field
                                    filingInfo_Layout2.getWhetherBankHasSubsidiaries().add(fieldDataValue);
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
                
                
                // retrieve DBS_LEF_A_20LE_Standalone_Layout1 entities from db
                // typedmember grouping clause
                List<DBS13DBS_LEF_A_20LE_Standalone_Layout1Entity> dbs_lef_a_20le_standalone_layout1Entities = (List<DBS13DBS_LEF_A_20LE_Standalone_Layout1Entity>) dbs13Service.getDbs13DBS_LEF_A_20LE_Standalone_Layout1Entities();
                Map<String, List<DBS13DBS_LEF_A_20LE_Standalone_Layout1Entity>> dbs_lef_a_20le_standalone_layout1ByTypeMembers = dbs_lef_a_20le_standalone_layout1Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBS_LEF_A_20LE_Standalone_Layout1(ent)), Collectors.mapping((DBS13DBS_LEF_A_20LE_Standalone_Layout1Entity p)-> p, Collectors.toList())));
                dbs_lef_a_20le_standalone_layout1ByTypeMembers.forEach((key, dbs_lef_a_20le_standalone_layout1EntitiesList)->{
                    // initiate DBS_LEF_A_20LE_Standalone_Layout1 
                    DBS_LEF_A_20LE_Standalone_Layout1 dBS_LEF_A_20LE_Standalone_Layout1 = new DBS_LEF_A_20LE_Standalone_Layout1();
                
                    // start all datafields and create mapping
                    
                        dbs_lef_a_20le_standalone_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("Tier1Capital")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add fieldDataValue to field
                                    dBS_LEF_A_20LE_Standalone_Layout1.getTier1Capital().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_lef_a_20le_standalone_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            // adding explicit members
                            
                        });
                        
                         
                    
                    // end all datafields and create mapping
                    // add model to reportdata
                        
                        
                    
                    
                        reportData.setDBS_LEF_A_20LE_Standalone_Layout1(dBS_LEF_A_20LE_Standalone_Layout1);
                    
                });
                
                
                // retrieve DBS_LEF_A_20LE_Standalone_Layout2 entities from db
                // typedmember grouping clause
                List<DBS13DBS_LEF_A_20LE_Standalone_Layout2Entity> dbs_lef_a_20le_standalone_layout2Entities = (List<DBS13DBS_LEF_A_20LE_Standalone_Layout2Entity>) dbs13Service.getDbs13DBS_LEF_A_20LE_Standalone_Layout2Entities();
                Map<String, List<DBS13DBS_LEF_A_20LE_Standalone_Layout2Entity>> dbs_lef_a_20le_standalone_layout2ByTypeMembers = dbs_lef_a_20le_standalone_layout2Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBS_LEF_A_20LE_Standalone_Layout2(ent)), Collectors.mapping((DBS13DBS_LEF_A_20LE_Standalone_Layout2Entity p)-> p, Collectors.toList())));
                dbs_lef_a_20le_standalone_layout2ByTypeMembers.forEach((key, dbs_lef_a_20le_standalone_layout2EntitiesList)->{
                    // initiate DBS_LEF_A_20LE_Standalone_Layout2 
                    DBS_LEF_A_20LE_Standalone_Layout2 dBS_LEF_A_20LE_Standalone_Layout2 = new DBS_LEF_A_20LE_Standalone_Layout2();
                
                    // start all datafields and create mapping
                    
                        dbs_lef_a_20le_standalone_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_LEF_A_20LE_Standalone_Layout2.setCounterPartyAxis(dbEntity.getCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("CounterPartyAxis", dbEntity.getCounterPartyAxis());
                                
                            
                                dBS_LEF_A_20LE_Standalone_Layout2.setPermanentAccountNumberOrGroupIDOfCounterpartyAxis(dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                    //fieldDataValue.getMembers().put("PermanentAccountNumberOrGroupIDOfCounterpartyAxis", dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                
                            
                                dBS_LEF_A_20LE_Standalone_Layout2.setNameOfCounterPartyAxis(dbEntity.getNameOfCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("NameOfCounterPartyAxis", dbEntity.getNameOfCounterPartyAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                            
                                fieldDataValue.getMembers().put("ExposureToCounterpartiesAxis", dbEntity.getExposureToCounterpartiesAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ExposureAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add fieldDataValue to field
                                    dBS_LEF_A_20LE_Standalone_Layout2.getExposureAmount().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_lef_a_20le_standalone_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_LEF_A_20LE_Standalone_Layout2.setCounterPartyAxis(dbEntity.getCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("CounterPartyAxis", dbEntity.getCounterPartyAxis());
                                
                            
                                dBS_LEF_A_20LE_Standalone_Layout2.setPermanentAccountNumberOrGroupIDOfCounterpartyAxis(dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                    //fieldDataValue.getMembers().put("PermanentAccountNumberOrGroupIDOfCounterpartyAxis", dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                
                            
                                dBS_LEF_A_20LE_Standalone_Layout2.setNameOfCounterPartyAxis(dbEntity.getNameOfCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("NameOfCounterPartyAxis", dbEntity.getNameOfCounterPartyAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                            
                                fieldDataValue.getMembers().put("ExposureToCounterpartiesAxis", dbEntity.getExposureToCounterpartiesAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PercentageOfExposureToTier1Capital")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add fieldDataValue to field
                                    dBS_LEF_A_20LE_Standalone_Layout2.getPercentageOfExposureToTier1Capital().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_lef_a_20le_standalone_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_LEF_A_20LE_Standalone_Layout2.setCounterPartyAxis(dbEntity.getCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("CounterPartyAxis", dbEntity.getCounterPartyAxis());
                                
                            
                                dBS_LEF_A_20LE_Standalone_Layout2.setPermanentAccountNumberOrGroupIDOfCounterpartyAxis(dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                    //fieldDataValue.getMembers().put("PermanentAccountNumberOrGroupIDOfCounterpartyAxis", dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                
                            
                                dBS_LEF_A_20LE_Standalone_Layout2.setNameOfCounterPartyAxis(dbEntity.getNameOfCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("NameOfCounterPartyAxis", dbEntity.getNameOfCounterPartyAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                        });
                        
                         
                    
                    // end all datafields and create mapping
                    // add model to reportdata
                        
                        
                        
                        
                        
                        
                    
                    
                        reportData.getDBS_LEF_A_20LE_Standalone_Layout2().add(dBS_LEF_A_20LE_Standalone_Layout2);
                    
                });
                
                
                // retrieve DBS_LEF_B_SpecExp_Standalone_Layout1 entities from db
                // typedmember grouping clause
                List<DBS13DBS_LEF_B_SpecExp_Standalone_Layout1Entity> dbs_lef_b_specexp_standalone_layout1Entities = (List<DBS13DBS_LEF_B_SpecExp_Standalone_Layout1Entity>) dbs13Service.getDbs13DBS_LEF_B_SpecExp_Standalone_Layout1Entities();
                Map<String, List<DBS13DBS_LEF_B_SpecExp_Standalone_Layout1Entity>> dbs_lef_b_specexp_standalone_layout1ByTypeMembers = dbs_lef_b_specexp_standalone_layout1Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBS_LEF_B_SpecExp_Standalone_Layout1(ent)), Collectors.mapping((DBS13DBS_LEF_B_SpecExp_Standalone_Layout1Entity p)-> p, Collectors.toList())));
                dbs_lef_b_specexp_standalone_layout1ByTypeMembers.forEach((key, dbs_lef_b_specexp_standalone_layout1EntitiesList)->{
                    // initiate DBS_LEF_B_SpecExp_Standalone_Layout1 
                    DBS_LEF_B_SpecExp_Standalone_Layout1 dBS_LEF_B_SpecExp_Standalone_Layout1 = new DBS_LEF_B_SpecExp_Standalone_Layout1();
                
                    // start all datafields and create mapping
                    
                        dbs_lef_b_specexp_standalone_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_LEF_B_SpecExp_Standalone_Layout1.setCounterPartyAxis(dbEntity.getCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("CounterPartyAxis", dbEntity.getCounterPartyAxis());
                                
                            
                                dBS_LEF_B_SpecExp_Standalone_Layout1.setPermanentAccountNumberOrGroupIDOfCounterpartyAxis(dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                    //fieldDataValue.getMembers().put("PermanentAccountNumberOrGroupIDOfCounterpartyAxis", dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                
                            
                                dBS_LEF_B_SpecExp_Standalone_Layout1.setNameOfCounterPartyAxis(dbEntity.getNameOfCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("NameOfCounterPartyAxis", dbEntity.getNameOfCounterPartyAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                            
                                fieldDataValue.getMembers().put("ExposureToCounterpartiesAxis", dbEntity.getExposureToCounterpartiesAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ExposureAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add fieldDataValue to field
                                    dBS_LEF_B_SpecExp_Standalone_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_lef_b_specexp_standalone_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_LEF_B_SpecExp_Standalone_Layout1.setCounterPartyAxis(dbEntity.getCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("CounterPartyAxis", dbEntity.getCounterPartyAxis());
                                
                            
                                dBS_LEF_B_SpecExp_Standalone_Layout1.setPermanentAccountNumberOrGroupIDOfCounterpartyAxis(dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                    //fieldDataValue.getMembers().put("PermanentAccountNumberOrGroupIDOfCounterpartyAxis", dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                
                            
                                dBS_LEF_B_SpecExp_Standalone_Layout1.setNameOfCounterPartyAxis(dbEntity.getNameOfCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("NameOfCounterPartyAxis", dbEntity.getNameOfCounterPartyAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                            
                                fieldDataValue.getMembers().put("ExposureToCounterpartiesAxis", dbEntity.getExposureToCounterpartiesAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PercentageOfExposureToTier1Capital")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add fieldDataValue to field
                                    dBS_LEF_B_SpecExp_Standalone_Layout1.getPercentageOfExposureToTier1Capital().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_lef_b_specexp_standalone_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_LEF_B_SpecExp_Standalone_Layout1.setCounterPartyAxis(dbEntity.getCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("CounterPartyAxis", dbEntity.getCounterPartyAxis());
                                
                            
                                dBS_LEF_B_SpecExp_Standalone_Layout1.setPermanentAccountNumberOrGroupIDOfCounterpartyAxis(dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                    //fieldDataValue.getMembers().put("PermanentAccountNumberOrGroupIDOfCounterpartyAxis", dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                
                            
                                dBS_LEF_B_SpecExp_Standalone_Layout1.setNameOfCounterPartyAxis(dbEntity.getNameOfCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("NameOfCounterPartyAxis", dbEntity.getNameOfCounterPartyAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                        });
                        
                         
                    
                    // end all datafields and create mapping
                    // add model to reportdata
                        
                        
                        
                        
                        
                        
                    
                    
                        reportData.getDBS_LEF_B_SpecExp_Standalone_Layout1().add(dBS_LEF_B_SpecExp_Standalone_Layout1);
                    
                });
                
                
                // retrieve DBS_LEF_C_OthExp_Standalone_Layout1 entities from db
                // typedmember grouping clause
                List<DBS13DBS_LEF_C_OthExp_Standalone_Layout1Entity> dbs_lef_c_othexp_standalone_layout1Entities = (List<DBS13DBS_LEF_C_OthExp_Standalone_Layout1Entity>) dbs13Service.getDbs13DBS_LEF_C_OthExp_Standalone_Layout1Entities();
                Map<String, List<DBS13DBS_LEF_C_OthExp_Standalone_Layout1Entity>> dbs_lef_c_othexp_standalone_layout1ByTypeMembers = dbs_lef_c_othexp_standalone_layout1Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBS_LEF_C_OthExp_Standalone_Layout1(ent)), Collectors.mapping((DBS13DBS_LEF_C_OthExp_Standalone_Layout1Entity p)-> p, Collectors.toList())));
                dbs_lef_c_othexp_standalone_layout1ByTypeMembers.forEach((key, dbs_lef_c_othexp_standalone_layout1EntitiesList)->{
                    // initiate DBS_LEF_C_OthExp_Standalone_Layout1 
                    DBS_LEF_C_OthExp_Standalone_Layout1 dBS_LEF_C_OthExp_Standalone_Layout1 = new DBS_LEF_C_OthExp_Standalone_Layout1();
                
                    // start all datafields and create mapping
                    
                        dbs_lef_c_othexp_standalone_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_LEF_C_OthExp_Standalone_Layout1.setCounterPartyAxis(dbEntity.getCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("CounterPartyAxis", dbEntity.getCounterPartyAxis());
                                
                            
                                dBS_LEF_C_OthExp_Standalone_Layout1.setPermanentAccountNumberOrGroupIDOfCounterpartyAxis(dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                    //fieldDataValue.getMembers().put("PermanentAccountNumberOrGroupIDOfCounterpartyAxis", dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                
                            
                                dBS_LEF_C_OthExp_Standalone_Layout1.setNameOfCounterPartyAxis(dbEntity.getNameOfCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("NameOfCounterPartyAxis", dbEntity.getNameOfCounterPartyAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                            
                                fieldDataValue.getMembers().put("ExposureToCounterpartiesAxis", dbEntity.getExposureToCounterpartiesAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ExposureAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add fieldDataValue to field
                                    dBS_LEF_C_OthExp_Standalone_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_lef_c_othexp_standalone_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_LEF_C_OthExp_Standalone_Layout1.setCounterPartyAxis(dbEntity.getCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("CounterPartyAxis", dbEntity.getCounterPartyAxis());
                                
                            
                                dBS_LEF_C_OthExp_Standalone_Layout1.setPermanentAccountNumberOrGroupIDOfCounterpartyAxis(dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                    //fieldDataValue.getMembers().put("PermanentAccountNumberOrGroupIDOfCounterpartyAxis", dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                
                            
                                dBS_LEF_C_OthExp_Standalone_Layout1.setNameOfCounterPartyAxis(dbEntity.getNameOfCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("NameOfCounterPartyAxis", dbEntity.getNameOfCounterPartyAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                            
                                fieldDataValue.getMembers().put("ExposureToCounterpartiesAxis", dbEntity.getExposureToCounterpartiesAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PercentageOfExposureToTier1Capital")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add fieldDataValue to field
                                    dBS_LEF_C_OthExp_Standalone_Layout1.getPercentageOfExposureToTier1Capital().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_lef_c_othexp_standalone_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_LEF_C_OthExp_Standalone_Layout1.setCounterPartyAxis(dbEntity.getCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("CounterPartyAxis", dbEntity.getCounterPartyAxis());
                                
                            
                                dBS_LEF_C_OthExp_Standalone_Layout1.setPermanentAccountNumberOrGroupIDOfCounterpartyAxis(dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                    //fieldDataValue.getMembers().put("PermanentAccountNumberOrGroupIDOfCounterpartyAxis", dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                
                            
                                dBS_LEF_C_OthExp_Standalone_Layout1.setNameOfCounterPartyAxis(dbEntity.getNameOfCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("NameOfCounterPartyAxis", dbEntity.getNameOfCounterPartyAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                        });
                        
                         
                    
                    // end all datafields and create mapping
                    // add model to reportdata
                        
                        
                        
                        
                        
                        
                    
                    
                        reportData.getDBS_LEF_C_OthExp_Standalone_Layout1().add(dBS_LEF_C_OthExp_Standalone_Layout1);
                    
                });
                
                
                // retrieve DBS_LEF_D_ExempExp_Standalone_Layout1 entities from db
                // typedmember grouping clause
                List<DBS13DBS_LEF_D_ExempExp_Standalone_Layout1Entity> dbs_lef_d_exempexp_standalone_layout1Entities = (List<DBS13DBS_LEF_D_ExempExp_Standalone_Layout1Entity>) dbs13Service.getDbs13DBS_LEF_D_ExempExp_Standalone_Layout1Entities();
                Map<String, List<DBS13DBS_LEF_D_ExempExp_Standalone_Layout1Entity>> dbs_lef_d_exempexp_standalone_layout1ByTypeMembers = dbs_lef_d_exempexp_standalone_layout1Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBS_LEF_D_ExempExp_Standalone_Layout1(ent)), Collectors.mapping((DBS13DBS_LEF_D_ExempExp_Standalone_Layout1Entity p)-> p, Collectors.toList())));
                dbs_lef_d_exempexp_standalone_layout1ByTypeMembers.forEach((key, dbs_lef_d_exempexp_standalone_layout1EntitiesList)->{
                    // initiate DBS_LEF_D_ExempExp_Standalone_Layout1 
                    DBS_LEF_D_ExempExp_Standalone_Layout1 dBS_LEF_D_ExempExp_Standalone_Layout1 = new DBS_LEF_D_ExempExp_Standalone_Layout1();
                
                    // start all datafields and create mapping
                    
                        dbs_lef_d_exempexp_standalone_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_LEF_D_ExempExp_Standalone_Layout1.setCounterPartyAxis(dbEntity.getCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("CounterPartyAxis", dbEntity.getCounterPartyAxis());
                                
                            
                                dBS_LEF_D_ExempExp_Standalone_Layout1.setPermanentAccountNumberOrGroupIDOfCounterpartyAxis(dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                    //fieldDataValue.getMembers().put("PermanentAccountNumberOrGroupIDOfCounterpartyAxis", dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                
                            
                                dBS_LEF_D_ExempExp_Standalone_Layout1.setNameOfCounterPartyAxis(dbEntity.getNameOfCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("NameOfCounterPartyAxis", dbEntity.getNameOfCounterPartyAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                            
                                fieldDataValue.getMembers().put("ExposureToCounterpartiesAxis", dbEntity.getExposureToCounterpartiesAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ExposureAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add fieldDataValue to field
                                    dBS_LEF_D_ExempExp_Standalone_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_lef_d_exempexp_standalone_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_LEF_D_ExempExp_Standalone_Layout1.setCounterPartyAxis(dbEntity.getCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("CounterPartyAxis", dbEntity.getCounterPartyAxis());
                                
                            
                                dBS_LEF_D_ExempExp_Standalone_Layout1.setPermanentAccountNumberOrGroupIDOfCounterpartyAxis(dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                    //fieldDataValue.getMembers().put("PermanentAccountNumberOrGroupIDOfCounterpartyAxis", dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                
                            
                                dBS_LEF_D_ExempExp_Standalone_Layout1.setNameOfCounterPartyAxis(dbEntity.getNameOfCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("NameOfCounterPartyAxis", dbEntity.getNameOfCounterPartyAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                            
                                fieldDataValue.getMembers().put("ExposureToCounterpartiesAxis", dbEntity.getExposureToCounterpartiesAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PercentageOfExposureToTier1Capital")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add fieldDataValue to field
                                    dBS_LEF_D_ExempExp_Standalone_Layout1.getPercentageOfExposureToTier1Capital().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_lef_d_exempexp_standalone_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_LEF_D_ExempExp_Standalone_Layout1.setCounterPartyAxis(dbEntity.getCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("CounterPartyAxis", dbEntity.getCounterPartyAxis());
                                
                            
                                dBS_LEF_D_ExempExp_Standalone_Layout1.setPermanentAccountNumberOrGroupIDOfCounterpartyAxis(dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                    //fieldDataValue.getMembers().put("PermanentAccountNumberOrGroupIDOfCounterpartyAxis", dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                
                            
                                dBS_LEF_D_ExempExp_Standalone_Layout1.setNameOfCounterPartyAxis(dbEntity.getNameOfCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("NameOfCounterPartyAxis", dbEntity.getNameOfCounterPartyAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                        });
                        
                         
                    
                    // end all datafields and create mapping
                    // add model to reportdata
                        
                        
                        
                        
                        
                        
                    
                    
                        reportData.getDBS_LEF_D_ExempExp_Standalone_Layout1().add(dBS_LEF_D_ExempExp_Standalone_Layout1);
                    
                });
                
                
                // retrieve DBS_LEF_A_20LE_Consolidated_Layout1 entities from db
                // typedmember grouping clause
                List<DBS13DBS_LEF_A_20LE_Consolidated_Layout1Entity> dbs_lef_a_20le_consolidated_layout1Entities = (List<DBS13DBS_LEF_A_20LE_Consolidated_Layout1Entity>) dbs13Service.getDbs13DBS_LEF_A_20LE_Consolidated_Layout1Entities();
                Map<String, List<DBS13DBS_LEF_A_20LE_Consolidated_Layout1Entity>> dbs_lef_a_20le_consolidated_layout1ByTypeMembers = dbs_lef_a_20le_consolidated_layout1Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBS_LEF_A_20LE_Consolidated_Layout1(ent)), Collectors.mapping((DBS13DBS_LEF_A_20LE_Consolidated_Layout1Entity p)-> p, Collectors.toList())));
                dbs_lef_a_20le_consolidated_layout1ByTypeMembers.forEach((key, dbs_lef_a_20le_consolidated_layout1EntitiesList)->{
                    // initiate DBS_LEF_A_20LE_Consolidated_Layout1 
                    DBS_LEF_A_20LE_Consolidated_Layout1 dBS_LEF_A_20LE_Consolidated_Layout1 = new DBS_LEF_A_20LE_Consolidated_Layout1();
                
                    // start all datafields and create mapping
                    
                        dbs_lef_a_20le_consolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("Tier1Capital")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add fieldDataValue to field
                                    dBS_LEF_A_20LE_Consolidated_Layout1.getTier1Capital().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_lef_a_20le_consolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                            
                            
                            // adding explicit members
                            
                        });
                        
                         
                    
                    // end all datafields and create mapping
                    // add model to reportdata
                        
                        
                    
                    
                        reportData.setDBS_LEF_A_20LE_Consolidated_Layout1(dBS_LEF_A_20LE_Consolidated_Layout1);
                    
                });
                
                
                // retrieve DBS_LEF_A_20LE_Consolidated_Layout2 entities from db
                // typedmember grouping clause
                List<DBS13DBS_LEF_A_20LE_Consolidated_Layout2Entity> dbs_lef_a_20le_consolidated_layout2Entities = (List<DBS13DBS_LEF_A_20LE_Consolidated_Layout2Entity>) dbs13Service.getDbs13DBS_LEF_A_20LE_Consolidated_Layout2Entities();
                Map<String, List<DBS13DBS_LEF_A_20LE_Consolidated_Layout2Entity>> dbs_lef_a_20le_consolidated_layout2ByTypeMembers = dbs_lef_a_20le_consolidated_layout2Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBS_LEF_A_20LE_Consolidated_Layout2(ent)), Collectors.mapping((DBS13DBS_LEF_A_20LE_Consolidated_Layout2Entity p)-> p, Collectors.toList())));
                dbs_lef_a_20le_consolidated_layout2ByTypeMembers.forEach((key, dbs_lef_a_20le_consolidated_layout2EntitiesList)->{
                    // initiate DBS_LEF_A_20LE_Consolidated_Layout2 
                    DBS_LEF_A_20LE_Consolidated_Layout2 dBS_LEF_A_20LE_Consolidated_Layout2 = new DBS_LEF_A_20LE_Consolidated_Layout2();
                
                    // start all datafields and create mapping
                    
                        dbs_lef_a_20le_consolidated_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_LEF_A_20LE_Consolidated_Layout2.setCounterPartyAxis(dbEntity.getCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("CounterPartyAxis", dbEntity.getCounterPartyAxis());
                                
                            
                                dBS_LEF_A_20LE_Consolidated_Layout2.setPermanentAccountNumberOrGroupIDOfCounterpartyAxis(dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                    //fieldDataValue.getMembers().put("PermanentAccountNumberOrGroupIDOfCounterpartyAxis", dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                
                            
                                dBS_LEF_A_20LE_Consolidated_Layout2.setNameOfCounterPartyAxis(dbEntity.getNameOfCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("NameOfCounterPartyAxis", dbEntity.getNameOfCounterPartyAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                            
                                fieldDataValue.getMembers().put("ExposureToCounterpartiesAxis", dbEntity.getExposureToCounterpartiesAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ExposureAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add fieldDataValue to field
                                    dBS_LEF_A_20LE_Consolidated_Layout2.getExposureAmount().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_lef_a_20le_consolidated_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_LEF_A_20LE_Consolidated_Layout2.setCounterPartyAxis(dbEntity.getCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("CounterPartyAxis", dbEntity.getCounterPartyAxis());
                                
                            
                                dBS_LEF_A_20LE_Consolidated_Layout2.setPermanentAccountNumberOrGroupIDOfCounterpartyAxis(dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                    //fieldDataValue.getMembers().put("PermanentAccountNumberOrGroupIDOfCounterpartyAxis", dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                
                            
                                dBS_LEF_A_20LE_Consolidated_Layout2.setNameOfCounterPartyAxis(dbEntity.getNameOfCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("NameOfCounterPartyAxis", dbEntity.getNameOfCounterPartyAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                            
                                fieldDataValue.getMembers().put("ExposureToCounterpartiesAxis", dbEntity.getExposureToCounterpartiesAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PercentageOfExposureToTier1Capital")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add fieldDataValue to field
                                    dBS_LEF_A_20LE_Consolidated_Layout2.getPercentageOfExposureToTier1Capital().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_lef_a_20le_consolidated_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_LEF_A_20LE_Consolidated_Layout2.setCounterPartyAxis(dbEntity.getCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("CounterPartyAxis", dbEntity.getCounterPartyAxis());
                                
                            
                                dBS_LEF_A_20LE_Consolidated_Layout2.setPermanentAccountNumberOrGroupIDOfCounterpartyAxis(dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                    //fieldDataValue.getMembers().put("PermanentAccountNumberOrGroupIDOfCounterpartyAxis", dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                
                            
                                dBS_LEF_A_20LE_Consolidated_Layout2.setNameOfCounterPartyAxis(dbEntity.getNameOfCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("NameOfCounterPartyAxis", dbEntity.getNameOfCounterPartyAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                        });
                        
                         
                    
                    // end all datafields and create mapping
                    // add model to reportdata
                        
                        
                        
                        
                        
                        
                    
                    
                        reportData.getDBS_LEF_A_20LE_Consolidated_Layout2().add(dBS_LEF_A_20LE_Consolidated_Layout2);
                    
                });
                
                
                // retrieve DBS_LEF_B_SpecExp_Consolidated_Layout1 entities from db
                // typedmember grouping clause
                List<DBS13DBS_LEF_B_SpecExp_Consolidated_Layout1Entity> dbs_lef_b_specexp_consolidated_layout1Entities = (List<DBS13DBS_LEF_B_SpecExp_Consolidated_Layout1Entity>) dbs13Service.getDbs13DBS_LEF_B_SpecExp_Consolidated_Layout1Entities();
                Map<String, List<DBS13DBS_LEF_B_SpecExp_Consolidated_Layout1Entity>> dbs_lef_b_specexp_consolidated_layout1ByTypeMembers = dbs_lef_b_specexp_consolidated_layout1Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBS_LEF_B_SpecExp_Consolidated_Layout1(ent)), Collectors.mapping((DBS13DBS_LEF_B_SpecExp_Consolidated_Layout1Entity p)-> p, Collectors.toList())));
                dbs_lef_b_specexp_consolidated_layout1ByTypeMembers.forEach((key, dbs_lef_b_specexp_consolidated_layout1EntitiesList)->{
                    // initiate DBS_LEF_B_SpecExp_Consolidated_Layout1 
                    DBS_LEF_B_SpecExp_Consolidated_Layout1 dBS_LEF_B_SpecExp_Consolidated_Layout1 = new DBS_LEF_B_SpecExp_Consolidated_Layout1();
                
                    // start all datafields and create mapping
                    
                        dbs_lef_b_specexp_consolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_LEF_B_SpecExp_Consolidated_Layout1.setCounterPartyAxis(dbEntity.getCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("CounterPartyAxis", dbEntity.getCounterPartyAxis());
                                
                            
                                dBS_LEF_B_SpecExp_Consolidated_Layout1.setPermanentAccountNumberOrGroupIDOfCounterpartyAxis(dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                    //fieldDataValue.getMembers().put("PermanentAccountNumberOrGroupIDOfCounterpartyAxis", dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                
                            
                                dBS_LEF_B_SpecExp_Consolidated_Layout1.setNameOfCounterPartyAxis(dbEntity.getNameOfCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("NameOfCounterPartyAxis", dbEntity.getNameOfCounterPartyAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                            
                                fieldDataValue.getMembers().put("ExposureToCounterpartiesAxis", dbEntity.getExposureToCounterpartiesAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ExposureAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add fieldDataValue to field
                                    dBS_LEF_B_SpecExp_Consolidated_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_lef_b_specexp_consolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_LEF_B_SpecExp_Consolidated_Layout1.setCounterPartyAxis(dbEntity.getCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("CounterPartyAxis", dbEntity.getCounterPartyAxis());
                                
                            
                                dBS_LEF_B_SpecExp_Consolidated_Layout1.setPermanentAccountNumberOrGroupIDOfCounterpartyAxis(dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                    //fieldDataValue.getMembers().put("PermanentAccountNumberOrGroupIDOfCounterpartyAxis", dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                
                            
                                dBS_LEF_B_SpecExp_Consolidated_Layout1.setNameOfCounterPartyAxis(dbEntity.getNameOfCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("NameOfCounterPartyAxis", dbEntity.getNameOfCounterPartyAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                            
                                fieldDataValue.getMembers().put("ExposureToCounterpartiesAxis", dbEntity.getExposureToCounterpartiesAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PercentageOfExposureToTier1Capital")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add fieldDataValue to field
                                    dBS_LEF_B_SpecExp_Consolidated_Layout1.getPercentageOfExposureToTier1Capital().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_lef_b_specexp_consolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_LEF_B_SpecExp_Consolidated_Layout1.setCounterPartyAxis(dbEntity.getCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("CounterPartyAxis", dbEntity.getCounterPartyAxis());
                                
                            
                                dBS_LEF_B_SpecExp_Consolidated_Layout1.setPermanentAccountNumberOrGroupIDOfCounterpartyAxis(dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                    //fieldDataValue.getMembers().put("PermanentAccountNumberOrGroupIDOfCounterpartyAxis", dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                
                            
                                dBS_LEF_B_SpecExp_Consolidated_Layout1.setNameOfCounterPartyAxis(dbEntity.getNameOfCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("NameOfCounterPartyAxis", dbEntity.getNameOfCounterPartyAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                        });
                        
                         
                    
                    // end all datafields and create mapping
                    // add model to reportdata
                        
                        
                        
                        
                        
                        
                    
                    
                        reportData.getDBS_LEF_B_SpecExp_Consolidated_Layout1().add(dBS_LEF_B_SpecExp_Consolidated_Layout1);
                    
                });
                
                
                // retrieve DBS_LEF_C_OthExp_Consolidated_Layout1 entities from db
                // typedmember grouping clause
                List<DBS13DBS_LEF_C_OthExp_Consolidated_Layout1Entity> dbs_lef_c_othexp_consolidated_layout1Entities = (List<DBS13DBS_LEF_C_OthExp_Consolidated_Layout1Entity>) dbs13Service.getDbs13DBS_LEF_C_OthExp_Consolidated_Layout1Entities();
                Map<String, List<DBS13DBS_LEF_C_OthExp_Consolidated_Layout1Entity>> dbs_lef_c_othexp_consolidated_layout1ByTypeMembers = dbs_lef_c_othexp_consolidated_layout1Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBS_LEF_C_OthExp_Consolidated_Layout1(ent)), Collectors.mapping((DBS13DBS_LEF_C_OthExp_Consolidated_Layout1Entity p)-> p, Collectors.toList())));
                dbs_lef_c_othexp_consolidated_layout1ByTypeMembers.forEach((key, dbs_lef_c_othexp_consolidated_layout1EntitiesList)->{
                    // initiate DBS_LEF_C_OthExp_Consolidated_Layout1 
                    DBS_LEF_C_OthExp_Consolidated_Layout1 dBS_LEF_C_OthExp_Consolidated_Layout1 = new DBS_LEF_C_OthExp_Consolidated_Layout1();
                
                    // start all datafields and create mapping
                    
                        dbs_lef_c_othexp_consolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_LEF_C_OthExp_Consolidated_Layout1.setCounterPartyAxis(dbEntity.getCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("CounterPartyAxis", dbEntity.getCounterPartyAxis());
                                
                            
                                dBS_LEF_C_OthExp_Consolidated_Layout1.setPermanentAccountNumberOrGroupIDOfCounterpartyAxis(dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                    //fieldDataValue.getMembers().put("PermanentAccountNumberOrGroupIDOfCounterpartyAxis", dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                
                            
                                dBS_LEF_C_OthExp_Consolidated_Layout1.setNameOfCounterPartyAxis(dbEntity.getNameOfCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("NameOfCounterPartyAxis", dbEntity.getNameOfCounterPartyAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                            
                                fieldDataValue.getMembers().put("ExposureToCounterpartiesAxis", dbEntity.getExposureToCounterpartiesAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ExposureAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add fieldDataValue to field
                                    dBS_LEF_C_OthExp_Consolidated_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_lef_c_othexp_consolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_LEF_C_OthExp_Consolidated_Layout1.setCounterPartyAxis(dbEntity.getCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("CounterPartyAxis", dbEntity.getCounterPartyAxis());
                                
                            
                                dBS_LEF_C_OthExp_Consolidated_Layout1.setPermanentAccountNumberOrGroupIDOfCounterpartyAxis(dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                    //fieldDataValue.getMembers().put("PermanentAccountNumberOrGroupIDOfCounterpartyAxis", dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                
                            
                                dBS_LEF_C_OthExp_Consolidated_Layout1.setNameOfCounterPartyAxis(dbEntity.getNameOfCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("NameOfCounterPartyAxis", dbEntity.getNameOfCounterPartyAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                            
                                fieldDataValue.getMembers().put("ExposureToCounterpartiesAxis", dbEntity.getExposureToCounterpartiesAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PercentageOfExposureToTier1Capital")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add fieldDataValue to field
                                    dBS_LEF_C_OthExp_Consolidated_Layout1.getPercentageOfExposureToTier1Capital().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_lef_c_othexp_consolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_LEF_C_OthExp_Consolidated_Layout1.setCounterPartyAxis(dbEntity.getCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("CounterPartyAxis", dbEntity.getCounterPartyAxis());
                                
                            
                                dBS_LEF_C_OthExp_Consolidated_Layout1.setPermanentAccountNumberOrGroupIDOfCounterpartyAxis(dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                    //fieldDataValue.getMembers().put("PermanentAccountNumberOrGroupIDOfCounterpartyAxis", dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                
                            
                                dBS_LEF_C_OthExp_Consolidated_Layout1.setNameOfCounterPartyAxis(dbEntity.getNameOfCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("NameOfCounterPartyAxis", dbEntity.getNameOfCounterPartyAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                        });
                        
                         
                    
                    // end all datafields and create mapping
                    // add model to reportdata
                        
                        
                        
                        
                        
                        
                    
                    
                        reportData.getDBS_LEF_C_OthExp_Consolidated_Layout1().add(dBS_LEF_C_OthExp_Consolidated_Layout1);
                    
                });
                
                
                // retrieve DBS_LEF_D_ExempExp_Consolidated_Layout1 entities from db
                // typedmember grouping clause
                List<DBS13DBS_LEF_D_ExempExp_Consolidated_Layout1Entity> dbs_lef_d_exempexp_consolidated_layout1Entities = (List<DBS13DBS_LEF_D_ExempExp_Consolidated_Layout1Entity>) dbs13Service.getDbs13DBS_LEF_D_ExempExp_Consolidated_Layout1Entities();
                Map<String, List<DBS13DBS_LEF_D_ExempExp_Consolidated_Layout1Entity>> dbs_lef_d_exempexp_consolidated_layout1ByTypeMembers = dbs_lef_d_exempexp_consolidated_layout1Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBS_LEF_D_ExempExp_Consolidated_Layout1(ent)), Collectors.mapping((DBS13DBS_LEF_D_ExempExp_Consolidated_Layout1Entity p)-> p, Collectors.toList())));
                dbs_lef_d_exempexp_consolidated_layout1ByTypeMembers.forEach((key, dbs_lef_d_exempexp_consolidated_layout1EntitiesList)->{
                    // initiate DBS_LEF_D_ExempExp_Consolidated_Layout1 
                    DBS_LEF_D_ExempExp_Consolidated_Layout1 dBS_LEF_D_ExempExp_Consolidated_Layout1 = new DBS_LEF_D_ExempExp_Consolidated_Layout1();
                
                    // start all datafields and create mapping
                    
                        dbs_lef_d_exempexp_consolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_LEF_D_ExempExp_Consolidated_Layout1.setCounterPartyAxis(dbEntity.getCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("CounterPartyAxis", dbEntity.getCounterPartyAxis());
                                
                            
                                dBS_LEF_D_ExempExp_Consolidated_Layout1.setPermanentAccountNumberOrGroupIDOfCounterpartyAxis(dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                    //fieldDataValue.getMembers().put("PermanentAccountNumberOrGroupIDOfCounterpartyAxis", dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                
                            
                                dBS_LEF_D_ExempExp_Consolidated_Layout1.setNameOfCounterPartyAxis(dbEntity.getNameOfCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("NameOfCounterPartyAxis", dbEntity.getNameOfCounterPartyAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                            
                                fieldDataValue.getMembers().put("ExposureToCounterpartiesAxis", dbEntity.getExposureToCounterpartiesAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ExposureAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add fieldDataValue to field
                                    dBS_LEF_D_ExempExp_Consolidated_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_lef_d_exempexp_consolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_LEF_D_ExempExp_Consolidated_Layout1.setCounterPartyAxis(dbEntity.getCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("CounterPartyAxis", dbEntity.getCounterPartyAxis());
                                
                            
                                dBS_LEF_D_ExempExp_Consolidated_Layout1.setPermanentAccountNumberOrGroupIDOfCounterpartyAxis(dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                    //fieldDataValue.getMembers().put("PermanentAccountNumberOrGroupIDOfCounterpartyAxis", dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                
                            
                                dBS_LEF_D_ExempExp_Consolidated_Layout1.setNameOfCounterPartyAxis(dbEntity.getNameOfCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("NameOfCounterPartyAxis", dbEntity.getNameOfCounterPartyAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                            
                                fieldDataValue.getMembers().put("ExposureToCounterpartiesAxis", dbEntity.getExposureToCounterpartiesAxis());
                            
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PercentageOfExposureToTier1Capital")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add fieldDataValue to field
                                    dBS_LEF_D_ExempExp_Consolidated_Layout1.getPercentageOfExposureToTier1Capital().add(fieldDataValue);
                                }
                                
                            
                        });
                        
                         
                    
                        dbs_lef_d_exempexp_consolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            
                                dBS_LEF_D_ExempExp_Consolidated_Layout1.setCounterPartyAxis(dbEntity.getCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("CounterPartyAxis", dbEntity.getCounterPartyAxis());
                                
                            
                                dBS_LEF_D_ExempExp_Consolidated_Layout1.setPermanentAccountNumberOrGroupIDOfCounterpartyAxis(dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                    //fieldDataValue.getMembers().put("PermanentAccountNumberOrGroupIDOfCounterpartyAxis", dbEntity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis());
                                
                            
                                dBS_LEF_D_ExempExp_Consolidated_Layout1.setNameOfCounterPartyAxis(dbEntity.getNameOfCounterPartyAxis());
                                    //fieldDataValue.getMembers().put("NameOfCounterPartyAxis", dbEntity.getNameOfCounterPartyAxis());
                                
                            
                            
                            
                            
                            // adding explicit members
                            
                        });
                        
                         
                    
                    // end all datafields and create mapping
                    // add model to reportdata
                        
                        
                        
                        
                        
                        
                    
                    
                        reportData.getDBS_LEF_D_ExempExp_Consolidated_Layout1().add(dBS_LEF_D_ExempExp_Consolidated_Layout1);
                    
                });
                
                
                // retrieve DBS_AuthorisedSignatory_Layout1 entities from db
                // typedmember grouping clause
                List<DBS13DBS_AuthorisedSignatory_Layout1Entity> dbs_authorisedsignatory_layout1Entities = (List<DBS13DBS_AuthorisedSignatory_Layout1Entity>) dbs13Service.getDbs13DBS_AuthorisedSignatory_Layout1Entities();
                Map<String, List<DBS13DBS_AuthorisedSignatory_Layout1Entity>> dbs_authorisedsignatory_layout1ByTypeMembers = dbs_authorisedsignatory_layout1Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBS_AuthorisedSignatory_Layout1(ent)), Collectors.mapping((DBS13DBS_AuthorisedSignatory_Layout1Entity p)-> p, Collectors.toList())));
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
    
        private String getGroupingClauseForFilingInfo_Layout1(DBS13FilingInfo_Layout1Entity filingInfo_Layout1Entity){
            return "-";
        }
        
        
        private String getGroupingClauseForFilingInfo_Layout2(DBS13FilingInfo_Layout2Entity filingInfo_Layout2Entity){
            return "-";
        }
        
        
        private String getGroupingClauseForDBS_LEF_A_20LE_Standalone_Layout1(DBS13DBS_LEF_A_20LE_Standalone_Layout1Entity dBS_LEF_A_20LE_Standalone_Layout1Entity){
            return "-";
        }
        
        
        private String getGroupingClauseForDBS_LEF_A_20LE_Standalone_Layout2(DBS13DBS_LEF_A_20LE_Standalone_Layout2Entity dBS_LEF_A_20LE_Standalone_Layout2Entity){
            return "-"+dBS_LEF_A_20LE_Standalone_Layout2Entity.getCounterPartyAxis()+dBS_LEF_A_20LE_Standalone_Layout2Entity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis()+dBS_LEF_A_20LE_Standalone_Layout2Entity.getNameOfCounterPartyAxis();
        }
        
        
        private String getGroupingClauseForDBS_LEF_B_SpecExp_Standalone_Layout1(DBS13DBS_LEF_B_SpecExp_Standalone_Layout1Entity dBS_LEF_B_SpecExp_Standalone_Layout1Entity){
            return "-"+dBS_LEF_B_SpecExp_Standalone_Layout1Entity.getCounterPartyAxis()+dBS_LEF_B_SpecExp_Standalone_Layout1Entity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis()+dBS_LEF_B_SpecExp_Standalone_Layout1Entity.getNameOfCounterPartyAxis();
        }
        
        
        private String getGroupingClauseForDBS_LEF_C_OthExp_Standalone_Layout1(DBS13DBS_LEF_C_OthExp_Standalone_Layout1Entity dBS_LEF_C_OthExp_Standalone_Layout1Entity){
            return "-"+dBS_LEF_C_OthExp_Standalone_Layout1Entity.getCounterPartyAxis()+dBS_LEF_C_OthExp_Standalone_Layout1Entity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis()+dBS_LEF_C_OthExp_Standalone_Layout1Entity.getNameOfCounterPartyAxis();
        }
        
        
        private String getGroupingClauseForDBS_LEF_D_ExempExp_Standalone_Layout1(DBS13DBS_LEF_D_ExempExp_Standalone_Layout1Entity dBS_LEF_D_ExempExp_Standalone_Layout1Entity){
            return "-"+dBS_LEF_D_ExempExp_Standalone_Layout1Entity.getCounterPartyAxis()+dBS_LEF_D_ExempExp_Standalone_Layout1Entity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis()+dBS_LEF_D_ExempExp_Standalone_Layout1Entity.getNameOfCounterPartyAxis();
        }
        
        
        private String getGroupingClauseForDBS_LEF_A_20LE_Consolidated_Layout1(DBS13DBS_LEF_A_20LE_Consolidated_Layout1Entity dBS_LEF_A_20LE_Consolidated_Layout1Entity){
            return "-";
        }
        
        
        private String getGroupingClauseForDBS_LEF_A_20LE_Consolidated_Layout2(DBS13DBS_LEF_A_20LE_Consolidated_Layout2Entity dBS_LEF_A_20LE_Consolidated_Layout2Entity){
            return "-"+dBS_LEF_A_20LE_Consolidated_Layout2Entity.getCounterPartyAxis()+dBS_LEF_A_20LE_Consolidated_Layout2Entity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis()+dBS_LEF_A_20LE_Consolidated_Layout2Entity.getNameOfCounterPartyAxis();
        }
        
        
        private String getGroupingClauseForDBS_LEF_B_SpecExp_Consolidated_Layout1(DBS13DBS_LEF_B_SpecExp_Consolidated_Layout1Entity dBS_LEF_B_SpecExp_Consolidated_Layout1Entity){
            return "-"+dBS_LEF_B_SpecExp_Consolidated_Layout1Entity.getCounterPartyAxis()+dBS_LEF_B_SpecExp_Consolidated_Layout1Entity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis()+dBS_LEF_B_SpecExp_Consolidated_Layout1Entity.getNameOfCounterPartyAxis();
        }
        
        
        private String getGroupingClauseForDBS_LEF_C_OthExp_Consolidated_Layout1(DBS13DBS_LEF_C_OthExp_Consolidated_Layout1Entity dBS_LEF_C_OthExp_Consolidated_Layout1Entity){
            return "-"+dBS_LEF_C_OthExp_Consolidated_Layout1Entity.getCounterPartyAxis()+dBS_LEF_C_OthExp_Consolidated_Layout1Entity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis()+dBS_LEF_C_OthExp_Consolidated_Layout1Entity.getNameOfCounterPartyAxis();
        }
        
        
        private String getGroupingClauseForDBS_LEF_D_ExempExp_Consolidated_Layout1(DBS13DBS_LEF_D_ExempExp_Consolidated_Layout1Entity dBS_LEF_D_ExempExp_Consolidated_Layout1Entity){
            return "-"+dBS_LEF_D_ExempExp_Consolidated_Layout1Entity.getCounterPartyAxis()+dBS_LEF_D_ExempExp_Consolidated_Layout1Entity.getPermanentAccountNumberOrGroupIDOfCounterpartyAxis()+dBS_LEF_D_ExempExp_Consolidated_Layout1Entity.getNameOfCounterPartyAxis();
        }
        
        
        private String getGroupingClauseForDBS_AuthorisedSignatory_Layout1(DBS13DBS_AuthorisedSignatory_Layout1Entity dBS_AuthorisedSignatory_Layout1Entity){
            return "-";
        }
        
        
// end loop for db models


}

