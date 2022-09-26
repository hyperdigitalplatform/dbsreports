package in.armedu.banking.report.rbixbrl.model.dbs01;

import java.util.List;
import java.util.Map;
import in.armedu.banking.report.rbixbrl.model.dbs01.*;
import in.armedu.banking.report.rbixbrl.model.FieldDataValue;

public class DBS01ReportUtil {
    
    public static String retrieveValueForElement(List<FieldDataValue> fieldList, Map<String, String> members ) {
        if(members.isEmpty()){
            if(fieldList.isEmpty()) {
                return null;
            } else if(fieldList.size()==1){
                FieldDataValue fieldDataValue = fieldList.get(0);
                if(fieldDataValue.getMembers().isEmpty()) {
                    return fieldDataValue.getValue();
                } else {
                    return null;
                }
            }
        } else if(members.size() > 1) {
            if(fieldList.isEmpty()) {
                return null;
            } else if(fieldList.size() > 1){
                for(FieldDataValue field : fieldList){
                    if(field.getMembers().isEmpty()) continue;
                    if(field.getMembers().equals(members)) return field.getValue();
                }                
                return null;
            }
        }
        return null;
    }
    
}
