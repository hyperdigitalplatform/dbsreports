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
public class DBS12_SectionC_Layout1 {
    
    
            private String uniqueTransactionCodeAxis = new String();
        
            private String nameOfAssistedShareholderOrShareholderInterestedEnterpriseAxis = new String();
        
        private List<FieldDataValue> typeOfEntity = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> typeOfExposures = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> exposureAmount = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> termOfCreditExposure = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> valueOfSecuritiesCollateral = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> assetClassifications = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> provisionForInvestment = new ArrayList<FieldDataValue>();
     
}
