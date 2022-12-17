package in.armedu.banking.report.rbixbrl.db.service.dbs06;
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
import in.armedu.banking.report.rbixbrl.model.dbs06.*;
import in.armedu.banking.report.rbixbrl.model.FieldDataValue;
@Component
@Service
public class DBS06Calculator {
    @Autowired
    private DBS06Service dbs06Service; 
    public DBS06ReportData prepareReportData() {
        //create reportdata
        DBS06ReportData reportData = new DBS06ReportData();
        // start loop for  db models
                // retrieve FilingInfo_Layout1 entities from db
                // typedmember grouping clause
                List<DBS06FilingInfo_Layout1Entity> filinginfo_layout1Entities = (List<DBS06FilingInfo_Layout1Entity>) dbs06Service.getDbs06FilingInfo_Layout1Entities();
                Map<String, List<DBS06FilingInfo_Layout1Entity>> filinginfo_layout1ByTypeMembers = filinginfo_layout1Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForFilingInfo_Layout1(ent)), Collectors.mapping((DBS06FilingInfo_Layout1Entity p)-> p, Collectors.toList())));
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
                List<DBS06FilingInfo_Layout2Entity> filinginfo_layout2Entities = (List<DBS06FilingInfo_Layout2Entity>) dbs06Service.getDbs06FilingInfo_Layout2Entities();
                Map<String, List<DBS06FilingInfo_Layout2Entity>> filinginfo_layout2ByTypeMembers = filinginfo_layout2Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForFilingInfo_Layout2(ent)), Collectors.mapping((DBS06FilingInfo_Layout2Entity p)-> p, Collectors.toList())));
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
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
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
                // retrieve DBSLeverageRatioSolo_Layout1 entities from db
                // typedmember grouping clause
                List<DBS06DBSLeverageRatioSolo_Layout1Entity> dbsleverageratiosolo_layout1Entities = (List<DBS06DBSLeverageRatioSolo_Layout1Entity>) dbs06Service.getDbs06DBSLeverageRatioSolo_Layout1Entities();
                Map<String, List<DBS06DBSLeverageRatioSolo_Layout1Entity>> dbsleverageratiosolo_layout1ByTypeMembers = dbsleverageratiosolo_layout1Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBSLeverageRatioSolo_Layout1(ent)), Collectors.mapping((DBS06DBSLeverageRatioSolo_Layout1Entity p)-> p, Collectors.toList())));
                dbsleverageratiosolo_layout1ByTypeMembers.forEach((key, dbsleverageratiosolo_layout1EntitiesList)->{
                    // initiate DBSLeverageRatioSolo_Layout1 
                    DBSLeverageRatioSolo_Layout1 dBSLeverageRatioSolo_Layout1 = new DBSLeverageRatioSolo_Layout1();
                    // start all datafields and create mapping
                        dbsleverageratiosolo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
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
                                    dBSLeverageRatioSolo_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
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
                                    dBSLeverageRatioSolo_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
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
                                    dBSLeverageRatioSolo_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
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
                                    dBSLeverageRatioSolo_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
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
                                    dBSLeverageRatioSolo_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
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
                                    dBSLeverageRatioSolo_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
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
                                    dBSLeverageRatioSolo_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
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
                                    dBSLeverageRatioSolo_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
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
                                    dBSLeverageRatioSolo_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
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
                                    dBSLeverageRatioSolo_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
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
                                    dBSLeverageRatioSolo_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
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
                                    dBSLeverageRatioSolo_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
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
                                    dBSLeverageRatioSolo_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
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
                                    dBSLeverageRatioSolo_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
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
                                    dBSLeverageRatioSolo_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
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
                                    dBSLeverageRatioSolo_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                        });
                    // end all datafields and create mapping
                    // add model to reportdata
                        reportData.setDBSLeverageRatioSolo_Layout1(dBSLeverageRatioSolo_Layout1);
                });
                // retrieve DBSLeverageRatioSolo_Layout2 entities from db
                // typedmember grouping clause
                List<DBS06DBSLeverageRatioSolo_Layout2Entity> dbsleverageratiosolo_layout2Entities = (List<DBS06DBSLeverageRatioSolo_Layout2Entity>) dbs06Service.getDbs06DBSLeverageRatioSolo_Layout2Entities();
                Map<String, List<DBS06DBSLeverageRatioSolo_Layout2Entity>> dbsleverageratiosolo_layout2ByTypeMembers = dbsleverageratiosolo_layout2Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBSLeverageRatioSolo_Layout2(ent)), Collectors.mapping((DBS06DBSLeverageRatioSolo_Layout2Entity p)-> p, Collectors.toList())));
                dbsleverageratiosolo_layout2ByTypeMembers.forEach((key, dbsleverageratiosolo_layout2EntitiesList)->{
                    // initiate DBSLeverageRatioSolo_Layout2 
                    DBSLeverageRatioSolo_Layout2 dBSLeverageRatioSolo_Layout2 = new DBSLeverageRatioSolo_Layout2();
                    // start all datafields and create mapping
                        dbsleverageratiosolo_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("CreditConversionFactor")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout2.getCreditConversionFactor().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("CreditConversionFactor")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout2.getCreditConversionFactor().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("CreditConversionFactor")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout2.getCreditConversionFactor().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("CreditConversionFactor")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout2.getCreditConversionFactor().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("CreditConversionFactor")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout2.getCreditConversionFactor().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("CreditConversionFactor")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout2.getCreditConversionFactor().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                        });
                    // end all datafields and create mapping
                    // add model to reportdata
                        reportData.setDBSLeverageRatioSolo_Layout2(dBSLeverageRatioSolo_Layout2);
                });
                // retrieve DBSLeverageRatioSolo_Layout3 entities from db
                // typedmember grouping clause
                List<DBS06DBSLeverageRatioSolo_Layout3Entity> dbsleverageratiosolo_layout3Entities = (List<DBS06DBSLeverageRatioSolo_Layout3Entity>) dbs06Service.getDbs06DBSLeverageRatioSolo_Layout3Entities();
                Map<String, List<DBS06DBSLeverageRatioSolo_Layout3Entity>> dbsleverageratiosolo_layout3ByTypeMembers = dbsleverageratiosolo_layout3Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBSLeverageRatioSolo_Layout3(ent)), Collectors.mapping((DBS06DBSLeverageRatioSolo_Layout3Entity p)-> p, Collectors.toList())));
                dbsleverageratiosolo_layout3ByTypeMembers.forEach((key, dbsleverageratiosolo_layout3EntitiesList)->{
                    // initiate DBSLeverageRatioSolo_Layout3 
                    DBSLeverageRatioSolo_Layout3 dBSLeverageRatioSolo_Layout3 = new DBSLeverageRatioSolo_Layout3();
                    // start all datafields and create mapping
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioSolo_Layout3.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioSolo_Layout3.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioSolo_Layout3.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioSolo_Layout3.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                        });
                    // end all datafields and create mapping
                    // add model to reportdata
                        reportData.setDBSLeverageRatioSolo_Layout3(dBSLeverageRatioSolo_Layout3);
                });
                // retrieve DBSLeverageRatioSolo_Layout4 entities from db
                // typedmember grouping clause
                List<DBS06DBSLeverageRatioSolo_Layout4Entity> dbsleverageratiosolo_layout4Entities = (List<DBS06DBSLeverageRatioSolo_Layout4Entity>) dbs06Service.getDbs06DBSLeverageRatioSolo_Layout4Entities();
                Map<String, List<DBS06DBSLeverageRatioSolo_Layout4Entity>> dbsleverageratiosolo_layout4ByTypeMembers = dbsleverageratiosolo_layout4Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBSLeverageRatioSolo_Layout4(ent)), Collectors.mapping((DBS06DBSLeverageRatioSolo_Layout4Entity p)-> p, Collectors.toList())));
                dbsleverageratiosolo_layout4ByTypeMembers.forEach((key, dbsleverageratiosolo_layout4EntitiesList)->{
                    // initiate DBSLeverageRatioSolo_Layout4 
                    DBSLeverageRatioSolo_Layout4 dBSLeverageRatioSolo_Layout4 = new DBSLeverageRatioSolo_Layout4();
                    // start all datafields and create mapping
                        dbsleverageratiosolo_layout4EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
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
                                    dBSLeverageRatioSolo_Layout4.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout4EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                        });
                    // end all datafields and create mapping
                    // add model to reportdata
                        reportData.setDBSLeverageRatioSolo_Layout4(dBSLeverageRatioSolo_Layout4);
                });
                // retrieve DBSLeverageRatioSolo_Layout5 entities from db
                // typedmember grouping clause
                List<DBS06DBSLeverageRatioSolo_Layout5Entity> dbsleverageratiosolo_layout5Entities = (List<DBS06DBSLeverageRatioSolo_Layout5Entity>) dbs06Service.getDbs06DBSLeverageRatioSolo_Layout5Entities();
                Map<String, List<DBS06DBSLeverageRatioSolo_Layout5Entity>> dbsleverageratiosolo_layout5ByTypeMembers = dbsleverageratiosolo_layout5Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBSLeverageRatioSolo_Layout5(ent)), Collectors.mapping((DBS06DBSLeverageRatioSolo_Layout5Entity p)-> p, Collectors.toList())));
                dbsleverageratiosolo_layout5ByTypeMembers.forEach((key, dbsleverageratiosolo_layout5EntitiesList)->{
                    // initiate DBSLeverageRatioSolo_Layout5 
                    DBSLeverageRatioSolo_Layout5 dBSLeverageRatioSolo_Layout5 = new DBSLeverageRatioSolo_Layout5();
                    // start all datafields and create mapping
                        dbsleverageratiosolo_layout5EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("Tier1Capital")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout5.getTier1Capital().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout5EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioSolo_Layout5.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout5EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("BaselIILeverageRatio")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioSolo_Layout5.getBaselIILeverageRatio().add(fieldDataValue);
                                }
                        });
                        dbsleverageratiosolo_layout5EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                        });
                    // end all datafields and create mapping
                    // add model to reportdata
                        reportData.setDBSLeverageRatioSolo_Layout5(dBSLeverageRatioSolo_Layout5);
                });
                // retrieve DBSLeverageRatioConsolidated_Layout1 entities from db
                // typedmember grouping clause
                List<DBS06DBSLeverageRatioConsolidated_Layout1Entity> dbsleverageratioconsolidated_layout1Entities = (List<DBS06DBSLeverageRatioConsolidated_Layout1Entity>) dbs06Service.getDbs06DBSLeverageRatioConsolidated_Layout1Entities();
                Map<String, List<DBS06DBSLeverageRatioConsolidated_Layout1Entity>> dbsleverageratioconsolidated_layout1ByTypeMembers = dbsleverageratioconsolidated_layout1Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBSLeverageRatioConsolidated_Layout1(ent)), Collectors.mapping((DBS06DBSLeverageRatioConsolidated_Layout1Entity p)-> p, Collectors.toList())));
                dbsleverageratioconsolidated_layout1ByTypeMembers.forEach((key, dbsleverageratioconsolidated_layout1EntitiesList)->{
                    // initiate DBSLeverageRatioConsolidated_Layout1 
                    DBSLeverageRatioConsolidated_Layout1 dBSLeverageRatioConsolidated_Layout1 = new DBSLeverageRatioConsolidated_Layout1();
                    // start all datafields and create mapping
                        dbsleverageratioconsolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioConsolidated_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioConsolidated_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioConsolidated_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioConsolidated_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioConsolidated_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioConsolidated_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioConsolidated_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioConsolidated_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioConsolidated_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioConsolidated_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioConsolidated_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioConsolidated_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioConsolidated_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioConsolidated_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioConsolidated_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioConsolidated_Layout1.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout1EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                        });
                    // end all datafields and create mapping
                    // add model to reportdata
                        reportData.setDBSLeverageRatioConsolidated_Layout1(dBSLeverageRatioConsolidated_Layout1);
                });
                // retrieve DBSLeverageRatioConsolidated_Layout2 entities from db
                // typedmember grouping clause
                List<DBS06DBSLeverageRatioConsolidated_Layout2Entity> dbsleverageratioconsolidated_layout2Entities = (List<DBS06DBSLeverageRatioConsolidated_Layout2Entity>) dbs06Service.getDbs06DBSLeverageRatioConsolidated_Layout2Entities();
                Map<String, List<DBS06DBSLeverageRatioConsolidated_Layout2Entity>> dbsleverageratioconsolidated_layout2ByTypeMembers = dbsleverageratioconsolidated_layout2Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBSLeverageRatioConsolidated_Layout2(ent)), Collectors.mapping((DBS06DBSLeverageRatioConsolidated_Layout2Entity p)-> p, Collectors.toList())));
                dbsleverageratioconsolidated_layout2ByTypeMembers.forEach((key, dbsleverageratioconsolidated_layout2EntitiesList)->{
                    // initiate DBSLeverageRatioConsolidated_Layout2 
                    DBSLeverageRatioConsolidated_Layout2 dBSLeverageRatioConsolidated_Layout2 = new DBSLeverageRatioConsolidated_Layout2();
                    // start all datafields and create mapping
                        dbsleverageratioconsolidated_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("CreditConversionFactor")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout2.getCreditConversionFactor().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("CreditConversionFactor")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout2.getCreditConversionFactor().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("CreditConversionFactor")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout2.getCreditConversionFactor().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("CreditConversionFactor")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout2.getCreditConversionFactor().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("CreditConversionFactor")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout2.getCreditConversionFactor().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("CreditConversionFactor")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout2.getCreditConversionFactor().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout2EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                        });
                    // end all datafields and create mapping
                    // add model to reportdata
                        reportData.setDBSLeverageRatioConsolidated_Layout2(dBSLeverageRatioConsolidated_Layout2);
                });
                // retrieve DBSLeverageRatioConsolidated_Layout3 entities from db
                // typedmember grouping clause
                List<DBS06DBSLeverageRatioConsolidated_Layout3Entity> dbsleverageratioconsolidated_layout3Entities = (List<DBS06DBSLeverageRatioConsolidated_Layout3Entity>) dbs06Service.getDbs06DBSLeverageRatioConsolidated_Layout3Entities();
                Map<String, List<DBS06DBSLeverageRatioConsolidated_Layout3Entity>> dbsleverageratioconsolidated_layout3ByTypeMembers = dbsleverageratioconsolidated_layout3Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBSLeverageRatioConsolidated_Layout3(ent)), Collectors.mapping((DBS06DBSLeverageRatioConsolidated_Layout3Entity p)-> p, Collectors.toList())));
                dbsleverageratioconsolidated_layout3ByTypeMembers.forEach((key, dbsleverageratioconsolidated_layout3EntitiesList)->{
                    // initiate DBSLeverageRatioConsolidated_Layout3 
                    DBSLeverageRatioConsolidated_Layout3 dBSLeverageRatioConsolidated_Layout3 = new DBSLeverageRatioConsolidated_Layout3();
                    // start all datafields and create mapping
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioConsolidated_Layout3.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioConsolidated_Layout3.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioConsolidated_Layout3.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("ExposureClassAxis", dbEntity.getExposureClassAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("NotionalPrincipalAmount")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getNotionalPrincipalAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("ReplacementCost")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getReplacementCost().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("PotentialFutureExposure")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout3.getPotentialFutureExposure().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioConsolidated_Layout3.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout3EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                        });
                    // end all datafields and create mapping
                    // add model to reportdata
                        reportData.setDBSLeverageRatioConsolidated_Layout3(dBSLeverageRatioConsolidated_Layout3);
                });
                // retrieve DBSLeverageRatioConsolidated_Layout4 entities from db
                // typedmember grouping clause
                List<DBS06DBSLeverageRatioConsolidated_Layout4Entity> dbsleverageratioconsolidated_layout4Entities = (List<DBS06DBSLeverageRatioConsolidated_Layout4Entity>) dbs06Service.getDbs06DBSLeverageRatioConsolidated_Layout4Entities();
                Map<String, List<DBS06DBSLeverageRatioConsolidated_Layout4Entity>> dbsleverageratioconsolidated_layout4ByTypeMembers = dbsleverageratioconsolidated_layout4Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBSLeverageRatioConsolidated_Layout4(ent)), Collectors.mapping((DBS06DBSLeverageRatioConsolidated_Layout4Entity p)-> p, Collectors.toList())));
                dbsleverageratioconsolidated_layout4ByTypeMembers.forEach((key, dbsleverageratioconsolidated_layout4EntitiesList)->{
                    // initiate DBSLeverageRatioConsolidated_Layout4 
                    DBSLeverageRatioConsolidated_Layout4 dBSLeverageRatioConsolidated_Layout4 = new DBSLeverageRatioConsolidated_Layout4();
                    // start all datafields and create mapping
                        dbsleverageratioconsolidated_layout4EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
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
                                    dBSLeverageRatioConsolidated_Layout4.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout4EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                        });
                    // end all datafields and create mapping
                    // add model to reportdata
                        reportData.setDBSLeverageRatioConsolidated_Layout4(dBSLeverageRatioConsolidated_Layout4);
                });
                // retrieve DBSLeverageRatioConsolidated_Layout5 entities from db
                // typedmember grouping clause
                List<DBS06DBSLeverageRatioConsolidated_Layout5Entity> dbsleverageratioconsolidated_layout5Entities = (List<DBS06DBSLeverageRatioConsolidated_Layout5Entity>) dbs06Service.getDbs06DBSLeverageRatioConsolidated_Layout5Entities();
                Map<String, List<DBS06DBSLeverageRatioConsolidated_Layout5Entity>> dbsleverageratioconsolidated_layout5ByTypeMembers = dbsleverageratioconsolidated_layout5Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBSLeverageRatioConsolidated_Layout5(ent)), Collectors.mapping((DBS06DBSLeverageRatioConsolidated_Layout5Entity p)-> p, Collectors.toList())));
                dbsleverageratioconsolidated_layout5ByTypeMembers.forEach((key, dbsleverageratioconsolidated_layout5EntitiesList)->{
                    // initiate DBSLeverageRatioConsolidated_Layout5 
                    DBSLeverageRatioConsolidated_Layout5 dBSLeverageRatioConsolidated_Layout5 = new DBSLeverageRatioConsolidated_Layout5();
                    // start all datafields and create mapping
                        dbsleverageratioconsolidated_layout5EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("Tier1Capital")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout5.getTier1Capital().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout5EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                fieldDataValue.getMembers().put("LeverageRatioExposureAxis", dbEntity.getLeverageRatioExposureAxis());
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
                                    dBSLeverageRatioConsolidated_Layout5.getExposureAmount().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout5EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                                fieldDataValue.getMembers().put("ConsolidatedAndSeparateFinancialStatementsAxis", dbEntity.getConsolidatedAndSeparateFinancialStatementsAxis());
                                // set value for field
                                if(dbEntity.getFieldName().equalsIgnoreCase("BaselIILeverageRatio")) {
                                    fieldDataValue.setValue(dbEntity.getFieldValue());
                                    // add startdate , enddate, and instantdate
                                    fieldDataValue.setStartDateField(dbEntity.getStartDateField());
                                    fieldDataValue.setStartDateValue(dbEntity.getStartDateValue());
                                    fieldDataValue.setEndDateField(dbEntity.getEndDateField());
                                    fieldDataValue.setEndDateValue(dbEntity.getEndDateValue());
                                    fieldDataValue.setInstantDateField(dbEntity.getInstantDateField());
                                    fieldDataValue.setInstantDateValue(dbEntity.getInstantDateValue());
                                    // add fieldDataValue to field
                                    dBSLeverageRatioConsolidated_Layout5.getBaselIILeverageRatio().add(fieldDataValue);
                                }
                        });
                        dbsleverageratioconsolidated_layout5EntitiesList.forEach((dbEntity)->{
                            FieldDataValue fieldDataValue = new FieldDataValue();
                            // adding explicit members
                        });
                    // end all datafields and create mapping
                    // add model to reportdata
                        reportData.setDBSLeverageRatioConsolidated_Layout5(dBSLeverageRatioConsolidated_Layout5);
                });
                // retrieve DBSAuthorisedSignatory_Layout1 entities from db
                // typedmember grouping clause
                List<DBS06DBSAuthorisedSignatory_Layout1Entity> dbsauthorisedsignatory_layout1Entities = (List<DBS06DBSAuthorisedSignatory_Layout1Entity>) dbs06Service.getDbs06DBSAuthorisedSignatory_Layout1Entities();
                Map<String, List<DBS06DBSAuthorisedSignatory_Layout1Entity>> dbsauthorisedsignatory_layout1ByTypeMembers = dbsauthorisedsignatory_layout1Entities.stream().collect(Collectors.groupingBy(ent->(getGroupingClauseForDBSAuthorisedSignatory_Layout1(ent)), Collectors.mapping((DBS06DBSAuthorisedSignatory_Layout1Entity p)-> p, Collectors.toList())));
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
        private String getGroupingClauseForFilingInfo_Layout1(DBS06FilingInfo_Layout1Entity filingInfo_Layout1Entity){
            return "-";
        }
        private String getGroupingClauseForFilingInfo_Layout2(DBS06FilingInfo_Layout2Entity filingInfo_Layout2Entity){
            return "-";
        }
        private String getGroupingClauseForDBSLeverageRatioSolo_Layout1(DBS06DBSLeverageRatioSolo_Layout1Entity dBSLeverageRatioSolo_Layout1Entity){
            return "-";
        }
        private String getGroupingClauseForDBSLeverageRatioSolo_Layout2(DBS06DBSLeverageRatioSolo_Layout2Entity dBSLeverageRatioSolo_Layout2Entity){
            return "-";
        }
        private String getGroupingClauseForDBSLeverageRatioSolo_Layout3(DBS06DBSLeverageRatioSolo_Layout3Entity dBSLeverageRatioSolo_Layout3Entity){
            return "-";
        }
        private String getGroupingClauseForDBSLeverageRatioSolo_Layout4(DBS06DBSLeverageRatioSolo_Layout4Entity dBSLeverageRatioSolo_Layout4Entity){
            return "-";
        }
        private String getGroupingClauseForDBSLeverageRatioSolo_Layout5(DBS06DBSLeverageRatioSolo_Layout5Entity dBSLeverageRatioSolo_Layout5Entity){
            return "-";
        }
        private String getGroupingClauseForDBSLeverageRatioConsolidated_Layout1(DBS06DBSLeverageRatioConsolidated_Layout1Entity dBSLeverageRatioConsolidated_Layout1Entity){
            return "-";
        }
        private String getGroupingClauseForDBSLeverageRatioConsolidated_Layout2(DBS06DBSLeverageRatioConsolidated_Layout2Entity dBSLeverageRatioConsolidated_Layout2Entity){
            return "-";
        }
        private String getGroupingClauseForDBSLeverageRatioConsolidated_Layout3(DBS06DBSLeverageRatioConsolidated_Layout3Entity dBSLeverageRatioConsolidated_Layout3Entity){
            return "-";
        }
        private String getGroupingClauseForDBSLeverageRatioConsolidated_Layout4(DBS06DBSLeverageRatioConsolidated_Layout4Entity dBSLeverageRatioConsolidated_Layout4Entity){
            return "-";
        }
        private String getGroupingClauseForDBSLeverageRatioConsolidated_Layout5(DBS06DBSLeverageRatioConsolidated_Layout5Entity dBSLeverageRatioConsolidated_Layout5Entity){
            return "-";
        }
        private String getGroupingClauseForDBSAuthorisedSignatory_Layout1(DBS06DBSAuthorisedSignatory_Layout1Entity dBSAuthorisedSignatory_Layout1Entity){
            return "-";
        }
// end loop for db models
}
