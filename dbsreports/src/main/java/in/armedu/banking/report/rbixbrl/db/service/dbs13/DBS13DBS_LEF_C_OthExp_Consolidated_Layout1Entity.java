package in.armedu.banking.report.rbixbrl.db.service.dbs13;

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
@Table(name = "DBS13DBS_LEF_C_OthExp_Consolidated_Layout1Entity")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class DBS13DBS_LEF_C_OthExp_Consolidated_Layout1Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    
        private String permanentAccountNumberOrGroupIDOfCounterpartyAxis;
    
        private String nameOfCounterPartyAxis;
    
    
        private String consolidatedAndSeparateFinancialStatementsAxis;
    
        private String exposureToCounterpartiesAxis;
    
    private String fieldName;
    private String fieldValue;
}
