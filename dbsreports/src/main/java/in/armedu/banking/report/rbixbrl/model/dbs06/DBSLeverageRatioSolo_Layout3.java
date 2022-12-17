package in.armedu.banking.report.rbixbrl.model.dbs06;

import java.util.List;
import java.util.ArrayList;
import in.armedu.banking.report.rbixbrl.model.dbs06.*;
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
public class DBSLeverageRatioSolo_Layout3 {
    
    
        private List<FieldDataValue> notionalPrincipalAmount = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> replacementCost = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> potentialFutureExposure = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> exposureAmount = new ArrayList<FieldDataValue>();
     
}
