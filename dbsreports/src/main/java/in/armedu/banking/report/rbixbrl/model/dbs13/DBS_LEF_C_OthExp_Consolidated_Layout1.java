package in.armedu.banking.report.rbixbrl.model.dbs13;

import java.util.List;
import java.util.ArrayList;
import in.armedu.banking.report.rbixbrl.model.dbs13.*;
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
public class DBS_LEF_C_OthExp_Consolidated_Layout1 {
    
    
            private String counterPartyAxis = new String();
        
            private String permanentAccountNumberOrGroupIDOfCounterpartyAxis = new String();
        
            private String nameOfCounterPartyAxis = new String();
        
        private List<FieldDataValue> exposureAmount = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> percentageOfExposureToTier1Capital = new ArrayList<FieldDataValue>();
     
}
