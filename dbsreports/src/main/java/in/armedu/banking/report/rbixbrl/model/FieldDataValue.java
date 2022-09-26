package in.armedu.banking.report.rbixbrl.model;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class FieldDataValue {
    private Map<String, String> members;
    private String value;
}
