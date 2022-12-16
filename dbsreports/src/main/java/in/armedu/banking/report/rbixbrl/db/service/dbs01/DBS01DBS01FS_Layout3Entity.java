package in.armedu.banking.report.rbixbrl.db.service.dbs01;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "DBS01DBS01FS_Layout3Entity")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class DBS01DBS01FS_Layout3Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    
    
        private String tierCapitalDimension;
    
        private String typeOfBalanceAxis;
    
        private String tierCapitalClassificationAxis;
    
        private String typeOfLoansAndAdvancesAxis;
    
        private String typeOfEconomiesAxis;
    
        private String developingCountryListAxis;
    
        private String geographicalLocationAxis;
    
    private String startDateField;
    private String startDateValue;
    private String endDateField;
    private String endDateValue;
    private String instantDateField;
    private String instantDateValue;
    private String fieldName;
    private String fieldValue;
}