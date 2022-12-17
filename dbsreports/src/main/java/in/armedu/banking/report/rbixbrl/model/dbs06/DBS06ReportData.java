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
public class DBS06ReportData implements ReportData {
    private String bankCode;
    private String startDate;
    private String endDate;
    private String periodDate;
    private FilingInfo_Layout1 filingInfo_Layout1 = new FilingInfo_Layout1();
    private FilingInfo_Layout2 filingInfo_Layout2 = new FilingInfo_Layout2();
    private DBSLeverageRatioSolo_Layout1 dBSLeverageRatioSolo_Layout1 = new DBSLeverageRatioSolo_Layout1();
    private DBSLeverageRatioSolo_Layout2 dBSLeverageRatioSolo_Layout2 = new DBSLeverageRatioSolo_Layout2();
    private DBSLeverageRatioSolo_Layout3 dBSLeverageRatioSolo_Layout3 = new DBSLeverageRatioSolo_Layout3();
    private DBSLeverageRatioSolo_Layout4 dBSLeverageRatioSolo_Layout4 = new DBSLeverageRatioSolo_Layout4();
    private DBSLeverageRatioSolo_Layout5 dBSLeverageRatioSolo_Layout5 = new DBSLeverageRatioSolo_Layout5();
    private DBSLeverageRatioConsolidated_Layout1 dBSLeverageRatioConsolidated_Layout1 = new DBSLeverageRatioConsolidated_Layout1();
    private DBSLeverageRatioConsolidated_Layout2 dBSLeverageRatioConsolidated_Layout2 = new DBSLeverageRatioConsolidated_Layout2();
    private DBSLeverageRatioConsolidated_Layout3 dBSLeverageRatioConsolidated_Layout3 = new DBSLeverageRatioConsolidated_Layout3();
    private DBSLeverageRatioConsolidated_Layout4 dBSLeverageRatioConsolidated_Layout4 = new DBSLeverageRatioConsolidated_Layout4();
    private DBSLeverageRatioConsolidated_Layout5 dBSLeverageRatioConsolidated_Layout5 = new DBSLeverageRatioConsolidated_Layout5();
    private DBSAuthorisedSignatory_Layout1 dBSAuthorisedSignatory_Layout1 = new DBSAuthorisedSignatory_Layout1();
}
