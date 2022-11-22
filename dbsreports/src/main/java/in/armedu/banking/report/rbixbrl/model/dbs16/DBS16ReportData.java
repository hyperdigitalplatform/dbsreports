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
public class DBS16ReportData implements ReportData {
    private String bankCode;
    private String startDate;
    private String endDate;
    private String periodDate;
    private FilingInfo_Layout1 filingInfo_Layout1 = new FilingInfo_Layout1();
    private FilingInfo_Layout2 filingInfo_Layout2 = new FilingInfo_Layout2();
    private List<DBS_StressedMSME_Layout1> dBS_StressedMSME_Layout1 = new ArrayList<DBS_StressedMSME_Layout1>();
    private DBS_AuthorisedSignatory_Layout1 dBS_AuthorisedSignatory_Layout1 = new DBS_AuthorisedSignatory_Layout1();
}
