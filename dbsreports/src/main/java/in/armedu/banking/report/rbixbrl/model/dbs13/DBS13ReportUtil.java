package in.armedu.banking.report.rbixbrl.model.dbs13;

import java.util.List;
import java.util.Map;
import in.armedu.banking.report.rbixbrl.model.dbs13.*;
import in.armedu.banking.report.rbixbrl.model.FieldDataValue;

public class DBS13ReportUtil {
    
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
        } else if(members.size() >= 1) {
            if(fieldList.isEmpty()) {
                return null;
            } else if(fieldList.size() >= 1){
                for(FieldDataValue field : fieldList){
                    if(field.getMembers().isEmpty()) continue;
                    boolean b = members.entrySet().stream().filter(value -> field.getMembers().entrySet().stream().anyMatch(value1 -> (value1.getKey().equalsIgnoreCase(value.getKey().split(":")[1])  && value1.getValue().equalsIgnoreCase(value.getValue())))).findAny().isPresent();
                    if(b) return field.getValue();
                }                
                return null;
            }
        }
        return null;
    }

    public static FieldDataValue retrieveFieldDataForElement(List<FieldDataValue> fieldList, Map<String, String> members ) {
        if(members.isEmpty()){
            if(fieldList.isEmpty()) {
                return null;
            } else if(fieldList.size()==1){
                FieldDataValue fieldDataValue = fieldList.get(0);
                if(fieldDataValue.getMembers().isEmpty()) {
                    return fieldDataValue;
                } else {
                    return null;
                }
            }
        } else if(members.size() >= 1) {
            if(fieldList.isEmpty()) {
                return null;
            } else if(fieldList.size() >= 1){
                for(FieldDataValue field : fieldList){
                    if(field.getMembers().isEmpty()) continue;
                    boolean b = members.entrySet().stream().filter(value -> field.getMembers().entrySet().stream().anyMatch(value1 -> (value1.getKey().equalsIgnoreCase(value.getKey().split(":")[1])  && value1.getValue().equalsIgnoreCase(value.getValue())))).findAny().isPresent();
                    if(b) return field;
                }                
                return null;
            }
        }
        return null;
    }
    
}
