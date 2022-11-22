package in.armedu.banking.report.rbixbrl.model.dbs16;

import java.util.List;
import java.util.ArrayList;
import in.armedu.banking.report.rbixbrl.model.dbs16.*;
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
public class DBS_StressedMSME_Layout1 {
    
    
            private String nameOfBorrowerAxis = new String();
        
            private String borrowerPermanentAccountNumberAxis = new String();
        
            private String eligibleMicroSmallAndMediumEnterprisesEntityNameAxis = new String();
        
            private String mSMEEntityPermanentAccountNumberAxis = new String();
        
            private String stateAxis = new String();
        
        private List<FieldDataValue> whetherMicroSmallAndMediumEnterprisesAccountClassifiedAsStandardAsOnSpecifiedDate = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> whetherMicroSmallAndMediumEnterprisesAccountClassifiedAsSMA2OrSubstandardAsOnSpecifiedDate = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> noFraudOrNoWilfulDefaulterFlag = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> promotersStakeInEquityAndDebtInTheEligibleMSMEEntityAsOnTheCGSSDLoanSanctionDate = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> existingSanctionedLoanToTheMSMEEntityAsOnSpecifiedDate = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> existingOutstandingLoanToTheMSMEEntityAsOnSpecifiedDate = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> whetherDeclarationTakenFromTheBorrowerThatHeOrSheHasNotAvailedFundingUnderTheSchemeFromTheOtherLenders = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> loanSanctionDateUnderCGSSD = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> loanSanctionedUnderCGSSD = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> whetherCGTMSEApprovalReceivedForTheGuaranteeCoverage = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> tenureOfLoanSanctionedUnderTheCGSSD = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> tenureOfMoratoriumGrantedOnTheLoanSanctionedUnderTheCGSSD = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> currentOutstandingLoanSanctionedUnderCGSSDAsOnReportingDate = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> loanOutstandingClassificationUnderCGSSDAsOnReportingDate = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> currentOutstandingLoanToTheMSMEEntityAsOnTheSpecifiedDate = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> mSMEAccountClassificationAsOnReportingDate = new ArrayList<FieldDataValue>();
     
}
