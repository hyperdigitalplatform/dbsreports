package in.armedu.banking.report.rbixbrl.model.dbs01;

import java.util.List;
import java.util.ArrayList;
import in.armedu.banking.report.rbixbrl.model.dbs01.*;
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
public class DBS01ReportData implements ReportData {
    private String bankCode;
    private String startDate;
    private String endDate;
    private String periodDate;
    private FilingInfo_Layout1 filingInfo_Layout1 = new FilingInfo_Layout1();
    private FilingInfo_Layout2 filingInfo_Layout2 = new FilingInfo_Layout2();
    private DBS01AddInfo_Layout1 dBS01AddInfo_Layout1 = new DBS01AddInfo_Layout1();
    private DBS01FS_Layout1 dBS01FS_Layout1 = new DBS01FS_Layout1();
    private DBS01FS_Layout2 dBS01FS_Layout2 = new DBS01FS_Layout2();
    private DBS01FS_Layout3 dBS01FS_Layout3 = new DBS01FS_Layout3();
    private DBS01OFC_Layout1 dBS01OFC_Layout1 = new DBS01OFC_Layout1();
}
