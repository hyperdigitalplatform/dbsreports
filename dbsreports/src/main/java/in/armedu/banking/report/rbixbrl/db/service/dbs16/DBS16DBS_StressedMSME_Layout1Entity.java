package in.armedu.banking.report.rbixbrl.db.service.dbs16;

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
@Table(name = "DBS16DBS_StressedMSME_Layout1Entity")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class DBS16DBS_StressedMSME_Layout1Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    
        private String nameOfBorrowerAxis;
    
        private String borrowerPermanentAccountNumberAxis;
    
        private String eligibleMicroSmallAndMediumEnterprisesEntityNameAxis;
    
        private String mSMEEntityPermanentAccountNumberAxis;
    
        private String stateAxis;
    
    
    private String fieldName;
    private String fieldValue;
}
