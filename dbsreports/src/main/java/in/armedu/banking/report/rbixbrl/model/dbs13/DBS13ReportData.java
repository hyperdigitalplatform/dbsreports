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
public class DBS13ReportData implements ReportData {
    private String bankCode;
    private String startDate;
    private String endDate;
    private String periodDate;
    private FilingInfo_Layout1 filingInfo_Layout1 = new FilingInfo_Layout1();
    private FilingInfo_Layout2 filingInfo_Layout2 = new FilingInfo_Layout2();
    private DBS_LEF_A_20LE_Standalone_Layout1 dBS_LEF_A_20LE_Standalone_Layout1 = new DBS_LEF_A_20LE_Standalone_Layout1();
    private List<DBS_LEF_A_20LE_Standalone_Layout2> dBS_LEF_A_20LE_Standalone_Layout2 = new ArrayList<DBS_LEF_A_20LE_Standalone_Layout2>();
    private List<DBS_LEF_B_SpecExp_Standalone_Layout1> dBS_LEF_B_SpecExp_Standalone_Layout1 = new ArrayList<DBS_LEF_B_SpecExp_Standalone_Layout1>();
    private List<DBS_LEF_C_OthExp_Standalone_Layout1> dBS_LEF_C_OthExp_Standalone_Layout1 = new ArrayList<DBS_LEF_C_OthExp_Standalone_Layout1>();
    private List<DBS_LEF_D_ExempExp_Standalone_Layout1> dBS_LEF_D_ExempExp_Standalone_Layout1 = new ArrayList<DBS_LEF_D_ExempExp_Standalone_Layout1>();
    private DBS_LEF_A_20LE_Consolidated_Layout1 dBS_LEF_A_20LE_Consolidated_Layout1 = new DBS_LEF_A_20LE_Consolidated_Layout1();
    private List<DBS_LEF_A_20LE_Consolidated_Layout2> dBS_LEF_A_20LE_Consolidated_Layout2 = new ArrayList<DBS_LEF_A_20LE_Consolidated_Layout2>();
    private List<DBS_LEF_B_SpecExp_Consolidated_Layout1> dBS_LEF_B_SpecExp_Consolidated_Layout1 = new ArrayList<DBS_LEF_B_SpecExp_Consolidated_Layout1>();
    private List<DBS_LEF_C_OthExp_Consolidated_Layout1> dBS_LEF_C_OthExp_Consolidated_Layout1 = new ArrayList<DBS_LEF_C_OthExp_Consolidated_Layout1>();
    private List<DBS_LEF_D_ExempExp_Consolidated_Layout1> dBS_LEF_D_ExempExp_Consolidated_Layout1 = new ArrayList<DBS_LEF_D_ExempExp_Consolidated_Layout1>();
    private DBS_AuthorisedSignatory_Layout1 dBS_AuthorisedSignatory_Layout1 = new DBS_AuthorisedSignatory_Layout1();
}
