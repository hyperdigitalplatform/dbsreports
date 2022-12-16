package in.armedu.banking.report.rbixbrl.db.service.dbs12;

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
@Table(name = "DBS12DBS12_SectionD_Layout1Entity")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class DBS12DBS12_SectionD_Layout1Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    
        private String uniqueTransactionCodeAxis;
    
        private String nameOfAssistedDirectorManagerOrEnterpriseOfTheirInterestAxis;
    
    
    private String startDateField;
    private String startDateValue;
    private String endDateField;
    private String endDateValue;
    private String instantDateField;
    private String instantDateValue;
    private String fieldName;
    private String fieldValue;
}