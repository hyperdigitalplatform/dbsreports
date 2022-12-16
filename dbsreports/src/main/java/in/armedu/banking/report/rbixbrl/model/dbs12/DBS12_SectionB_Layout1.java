package in.armedu.banking.report.rbixbrl.model.dbs12;

import java.util.List;
import java.util.ArrayList;
import in.armedu.banking.report.rbixbrl.model.dbs12.*;
import in.armedu.banking.report.rbixbrl.model.ReportData;
import in.armedu.banking.report.rbixbrl.model.FieldDataValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DBS12_SectionB_Layout1 {
    
    
            private String nameOfEntityAxis = new String();
        
        private List<FieldDataValue> typeOfEntity = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> financialClassification = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> banksEquityInvestmentInTheCompany = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> banksPercentageInvestmentInCompanyEquity = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> aggregateAmountOutstandingForFundedExposure = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> fundedCreditExposure = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> aggregateAmountOutstandingForNonFundedExposure = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> nonFundedCreditExposure = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> aggregateInvestmentExposure = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> exemptedExposure = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> aggregateAmountOutstanding = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> aggregateExposure = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> assetClassifications = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> amountOfAggregateProvisionsHeldForNPAs = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> amountOfUnsecuredAmountOutstandingOfTotalAmountOutstanding = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> reasonsForBreachOfStipulatedPrudentialLimits = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> descriptionOfIntraGroupSupportArrangementsOrAgreements = new ArrayList<FieldDataValue>();
     
}
