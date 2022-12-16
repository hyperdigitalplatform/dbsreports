package in.armedu.banking.report.rbixbrl.model.dbs12;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import in.armedu.banking.report.rbixbrl.model.dbs12.*;
import in.armedu.banking.report.rbixbrl.model.FieldDataValue;

public class DBS12ReportUtil {
    
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
                    if(members.size() < field.getMembers().size()){
                        // add additional field members with empty string value
                        Map<String, String> shadowMap = new HashMap<String, String>();
                        members.forEach((k, v)->{
                            shadowMap.put(k.split(":")[1], v);
                        });
                        field.getMembers().keySet().forEach(key->{
                            if(!shadowMap.containsKey(key)) shadowMap.put(key, "");
                        });
                        boolean b = shadowMap.entrySet().stream().allMatch(value -> field.getMembers().entrySet().stream().anyMatch(value1 -> (value1.getKey().equalsIgnoreCase(value.getKey())  && value1.getValue().equalsIgnoreCase(value.getValue()))));
                        if(b) return field.getValue();
                    } else {
                        boolean b = members.entrySet().stream().allMatch(value -> field.getMembers().entrySet().stream().anyMatch(value1 -> (value1.getKey().equalsIgnoreCase(value.getKey().split(":")[1])  && value1.getValue().equalsIgnoreCase(value.getValue()))));
                        if(b) return field.getValue();
                    }
                    
                    // boolean b = members.entrySet().stream().allMatch(value -> field.getMembers().entrySet().stream().anyMatch(value1 -> (value1.getKey().equalsIgnoreCase(value.getKey().split(":")[1])  && value1.getValue().equalsIgnoreCase(value.getValue()))));
                    // if(b) return field.getValue();
                }                
                return null;
            }
        }
        return null;
    }

    public static FieldDataValue retrieveFieldDataForElement(List<FieldDataValue> fieldList, Map<String, String> members, String startDateField, String endDateField, String instantDateField ) {
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
                    boolean b = false;
                    if(members.size() < field.getMembers().size()){
                        // add additional field members with empty string value
                        Map<String, String> shadowMap = new HashMap<String, String>();
                        members.forEach((k, v)->{
                            shadowMap.put(k.split(":")[1], v);
                        });
                        field.getMembers().keySet().forEach(key->{
                            if(!shadowMap.containsKey(key)) shadowMap.put(key, "");
                        });
                        b = shadowMap.entrySet().stream().allMatch(value -> field.getMembers().entrySet().stream().anyMatch(value1 -> (value1.getKey().equalsIgnoreCase(value.getKey())  && value1.getValue().equalsIgnoreCase(value.getValue()))));
                        //if(b) return field.getValue();
                    } else {
                        b = members.entrySet().stream().allMatch(value -> field.getMembers().entrySet().stream().anyMatch(value1 -> (value1.getKey().equalsIgnoreCase(value.getKey().split(":")[1])  && value1.getValue().equalsIgnoreCase(value.getValue()))));
                        //if(b) return field.getValue();
                    }
                    
                    //boolean b = members.entrySet().stream().allMatch(value -> field.getMembers().entrySet().stream().anyMatch(value1 -> (value1.getKey().equalsIgnoreCase(value.getKey().split(":")[1])  && value1.getValue().equalsIgnoreCase(value.getValue()))));
                    
                    if(b) {
                        if(field.getStartDateField().equalsIgnoreCase(startDateField) && field.getEndDateField().equalsIgnoreCase(endDateField) && field.getInstantDateField().equalsIgnoreCase(instantDateField)){
                            return field;
                        } else {
                            continue;
                        }
                    } 
                }                
                return null;
            }
        }
        return null;
    }
    
}
