package in.armedu.banking.report.rbixbrl.db.service.dbs13;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class DBS13Service {
        

            @Autowired
            private DBS13FilingInfo_Layout1EntityRepository dbs13FilingInfo_Layout1EntityRepository;

            public List<DBS13FilingInfo_Layout1Entity> getDbs13FilingInfo_Layout1Entities(){
                return (List<DBS13FilingInfo_Layout1Entity>) dbs13FilingInfo_Layout1EntityRepository.findAll();
            }
            

            @Autowired
            private DBS13FilingInfo_Layout2EntityRepository dbs13FilingInfo_Layout2EntityRepository;

            public List<DBS13FilingInfo_Layout2Entity> getDbs13FilingInfo_Layout2Entities(){
                return (List<DBS13FilingInfo_Layout2Entity>) dbs13FilingInfo_Layout2EntityRepository.findAll();
            }
            

            @Autowired
            private DBS13DBS_LEF_A_20LE_Standalone_Layout1EntityRepository dbs13DBS_LEF_A_20LE_Standalone_Layout1EntityRepository;

            public List<DBS13DBS_LEF_A_20LE_Standalone_Layout1Entity> getDbs13DBS_LEF_A_20LE_Standalone_Layout1Entities(){
                return (List<DBS13DBS_LEF_A_20LE_Standalone_Layout1Entity>) dbs13DBS_LEF_A_20LE_Standalone_Layout1EntityRepository.findAll();
            }
            

            @Autowired
            private DBS13DBS_LEF_A_20LE_Standalone_Layout2EntityRepository dbs13DBS_LEF_A_20LE_Standalone_Layout2EntityRepository;

            public List<DBS13DBS_LEF_A_20LE_Standalone_Layout2Entity> getDbs13DBS_LEF_A_20LE_Standalone_Layout2Entities(){
                return (List<DBS13DBS_LEF_A_20LE_Standalone_Layout2Entity>) dbs13DBS_LEF_A_20LE_Standalone_Layout2EntityRepository.findAll();
            }
            

            @Autowired
            private DBS13DBS_LEF_B_SpecExp_Standalone_Layout1EntityRepository dbs13DBS_LEF_B_SpecExp_Standalone_Layout1EntityRepository;

            public List<DBS13DBS_LEF_B_SpecExp_Standalone_Layout1Entity> getDbs13DBS_LEF_B_SpecExp_Standalone_Layout1Entities(){
                return (List<DBS13DBS_LEF_B_SpecExp_Standalone_Layout1Entity>) dbs13DBS_LEF_B_SpecExp_Standalone_Layout1EntityRepository.findAll();
            }
            

            @Autowired
            private DBS13DBS_LEF_C_OthExp_Standalone_Layout1EntityRepository dbs13DBS_LEF_C_OthExp_Standalone_Layout1EntityRepository;

            public List<DBS13DBS_LEF_C_OthExp_Standalone_Layout1Entity> getDbs13DBS_LEF_C_OthExp_Standalone_Layout1Entities(){
                return (List<DBS13DBS_LEF_C_OthExp_Standalone_Layout1Entity>) dbs13DBS_LEF_C_OthExp_Standalone_Layout1EntityRepository.findAll();
            }
            

            @Autowired
            private DBS13DBS_LEF_D_ExempExp_Standalone_Layout1EntityRepository dbs13DBS_LEF_D_ExempExp_Standalone_Layout1EntityRepository;

            public List<DBS13DBS_LEF_D_ExempExp_Standalone_Layout1Entity> getDbs13DBS_LEF_D_ExempExp_Standalone_Layout1Entities(){
                return (List<DBS13DBS_LEF_D_ExempExp_Standalone_Layout1Entity>) dbs13DBS_LEF_D_ExempExp_Standalone_Layout1EntityRepository.findAll();
            }
            

            @Autowired
            private DBS13DBS_LEF_A_20LE_Consolidated_Layout1EntityRepository dbs13DBS_LEF_A_20LE_Consolidated_Layout1EntityRepository;

            public List<DBS13DBS_LEF_A_20LE_Consolidated_Layout1Entity> getDbs13DBS_LEF_A_20LE_Consolidated_Layout1Entities(){
                return (List<DBS13DBS_LEF_A_20LE_Consolidated_Layout1Entity>) dbs13DBS_LEF_A_20LE_Consolidated_Layout1EntityRepository.findAll();
            }
            

            @Autowired
            private DBS13DBS_LEF_A_20LE_Consolidated_Layout2EntityRepository dbs13DBS_LEF_A_20LE_Consolidated_Layout2EntityRepository;

            public List<DBS13DBS_LEF_A_20LE_Consolidated_Layout2Entity> getDbs13DBS_LEF_A_20LE_Consolidated_Layout2Entities(){
                return (List<DBS13DBS_LEF_A_20LE_Consolidated_Layout2Entity>) dbs13DBS_LEF_A_20LE_Consolidated_Layout2EntityRepository.findAll();
            }
            

            @Autowired
            private DBS13DBS_LEF_B_SpecExp_Consolidated_Layout1EntityRepository dbs13DBS_LEF_B_SpecExp_Consolidated_Layout1EntityRepository;

            public List<DBS13DBS_LEF_B_SpecExp_Consolidated_Layout1Entity> getDbs13DBS_LEF_B_SpecExp_Consolidated_Layout1Entities(){
                return (List<DBS13DBS_LEF_B_SpecExp_Consolidated_Layout1Entity>) dbs13DBS_LEF_B_SpecExp_Consolidated_Layout1EntityRepository.findAll();
            }
            

            @Autowired
            private DBS13DBS_LEF_C_OthExp_Consolidated_Layout1EntityRepository dbs13DBS_LEF_C_OthExp_Consolidated_Layout1EntityRepository;

            public List<DBS13DBS_LEF_C_OthExp_Consolidated_Layout1Entity> getDbs13DBS_LEF_C_OthExp_Consolidated_Layout1Entities(){
                return (List<DBS13DBS_LEF_C_OthExp_Consolidated_Layout1Entity>) dbs13DBS_LEF_C_OthExp_Consolidated_Layout1EntityRepository.findAll();
            }
            

            @Autowired
            private DBS13DBS_LEF_D_ExempExp_Consolidated_Layout1EntityRepository dbs13DBS_LEF_D_ExempExp_Consolidated_Layout1EntityRepository;

            public List<DBS13DBS_LEF_D_ExempExp_Consolidated_Layout1Entity> getDbs13DBS_LEF_D_ExempExp_Consolidated_Layout1Entities(){
                return (List<DBS13DBS_LEF_D_ExempExp_Consolidated_Layout1Entity>) dbs13DBS_LEF_D_ExempExp_Consolidated_Layout1EntityRepository.findAll();
            }
            

            @Autowired
            private DBS13DBS_AuthorisedSignatory_Layout1EntityRepository dbs13DBS_AuthorisedSignatory_Layout1EntityRepository;

            public List<DBS13DBS_AuthorisedSignatory_Layout1Entity> getDbs13DBS_AuthorisedSignatory_Layout1Entities(){
                return (List<DBS13DBS_AuthorisedSignatory_Layout1Entity>) dbs13DBS_AuthorisedSignatory_Layout1EntityRepository.findAll();
            }
            
}
