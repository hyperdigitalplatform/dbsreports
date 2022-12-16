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
public class DBS12ReportData implements ReportData {
    private String bankCode;
    private String startDate;
    private String endDate;
    private String periodDate;
    private FilingInfo_Layout1 filingInfo_Layout1 = new FilingInfo_Layout1();
    private FilingInfo_Layout2 filingInfo_Layout2 = new FilingInfo_Layout2();
    private List<DBS12_SectionA_Layout1> dBS12_SectionA_Layout1 = new ArrayList<DBS12_SectionA_Layout1>();
    private List<DBS12_SectionB_Layout1> dBS12_SectionB_Layout1 = new ArrayList<DBS12_SectionB_Layout1>();
    private List<DBS12_SectionC_Layout1> dBS12_SectionC_Layout1 = new ArrayList<DBS12_SectionC_Layout1>();
    private List<DBS12_SectionD_Layout1> dBS12_SectionD_Layout1 = new ArrayList<DBS12_SectionD_Layout1>();
    private List<DBS12_SectionD_Layout2> dBS12_SectionD_Layout2 = new ArrayList<DBS12_SectionD_Layout2>();
    private DBSAuthorisedSignatory_Layout1 dBSAuthorisedSignatory_Layout1 = new DBSAuthorisedSignatory_Layout1();
}
