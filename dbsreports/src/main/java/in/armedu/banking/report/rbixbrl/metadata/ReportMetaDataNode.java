package in.armedu.banking.report.rbixbrl.metadata;

import java.util.List;
import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReportMetaDataNode {
    private String name;
    private String value;
    private List<Object> attributes = new ArrayList<Object>();
    private List<Object> extras = new ArrayList<Object>();
    private List<ReportMetaDataNode> childNodes = new ArrayList<ReportMetaDataNode>();
}
