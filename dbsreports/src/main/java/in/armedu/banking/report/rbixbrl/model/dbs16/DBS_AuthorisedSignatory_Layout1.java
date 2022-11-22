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
public class DBS_AuthorisedSignatory_Layout1 {
    
    
        private List<FieldDataValue> nameOfSignatory = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> designationOfSignatory = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> authorisedSignatoryOfficialLandlineNumber = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> mobileNumberOfAuthorisedSignatory = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> eMailIDOfAuthorisedReportingOfficial = new ArrayList<FieldDataValue>();
    
        private List<FieldDataValue> remarks = new ArrayList<FieldDataValue>();
     
}
