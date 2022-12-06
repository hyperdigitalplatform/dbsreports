package in.armedu.banking.report.rbixbrl.model;

import java.util.Map;
import java.util.HashMap;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class FieldDataValue {
    private Map<String, String> members = new HashMap<String, String>();
    private String value;
    private String startDateField;
    private String startDateValue;
    private String endDateField;
    private String endDateValue;
    private String instantDateField;
    private String instantDateValue;
}
