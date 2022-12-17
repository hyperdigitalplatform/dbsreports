package in.armedu.banking.report.rbixbrl.db.service.dbs06;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class DBS06Service {
        

            @Autowired
            private DBS06FilingInfo_Layout1EntityRepository dbs06FilingInfo_Layout1EntityRepository;

            public List<DBS06FilingInfo_Layout1Entity> getDbs06FilingInfo_Layout1Entities(){
                return (List<DBS06FilingInfo_Layout1Entity>) dbs06FilingInfo_Layout1EntityRepository.findAll();
            }
            

            @Autowired
            private DBS06FilingInfo_Layout2EntityRepository dbs06FilingInfo_Layout2EntityRepository;

            public List<DBS06FilingInfo_Layout2Entity> getDbs06FilingInfo_Layout2Entities(){
                return (List<DBS06FilingInfo_Layout2Entity>) dbs06FilingInfo_Layout2EntityRepository.findAll();
            }
            

            @Autowired
            private DBS06DBSLeverageRatioSolo_Layout1EntityRepository dbs06DBSLeverageRatioSolo_Layout1EntityRepository;

            public List<DBS06DBSLeverageRatioSolo_Layout1Entity> getDbs06DBSLeverageRatioSolo_Layout1Entities(){
                return (List<DBS06DBSLeverageRatioSolo_Layout1Entity>) dbs06DBSLeverageRatioSolo_Layout1EntityRepository.findAll();
            }
            

            @Autowired
            private DBS06DBSLeverageRatioSolo_Layout2EntityRepository dbs06DBSLeverageRatioSolo_Layout2EntityRepository;

            public List<DBS06DBSLeverageRatioSolo_Layout2Entity> getDbs06DBSLeverageRatioSolo_Layout2Entities(){
                return (List<DBS06DBSLeverageRatioSolo_Layout2Entity>) dbs06DBSLeverageRatioSolo_Layout2EntityRepository.findAll();
            }
            

            @Autowired
            private DBS06DBSLeverageRatioSolo_Layout3EntityRepository dbs06DBSLeverageRatioSolo_Layout3EntityRepository;

            public List<DBS06DBSLeverageRatioSolo_Layout3Entity> getDbs06DBSLeverageRatioSolo_Layout3Entities(){
                return (List<DBS06DBSLeverageRatioSolo_Layout3Entity>) dbs06DBSLeverageRatioSolo_Layout3EntityRepository.findAll();
            }
            

            @Autowired
            private DBS06DBSLeverageRatioSolo_Layout4EntityRepository dbs06DBSLeverageRatioSolo_Layout4EntityRepository;

            public List<DBS06DBSLeverageRatioSolo_Layout4Entity> getDbs06DBSLeverageRatioSolo_Layout4Entities(){
                return (List<DBS06DBSLeverageRatioSolo_Layout4Entity>) dbs06DBSLeverageRatioSolo_Layout4EntityRepository.findAll();
            }
            

            @Autowired
            private DBS06DBSLeverageRatioSolo_Layout5EntityRepository dbs06DBSLeverageRatioSolo_Layout5EntityRepository;

            public List<DBS06DBSLeverageRatioSolo_Layout5Entity> getDbs06DBSLeverageRatioSolo_Layout5Entities(){
                return (List<DBS06DBSLeverageRatioSolo_Layout5Entity>) dbs06DBSLeverageRatioSolo_Layout5EntityRepository.findAll();
            }
            

            @Autowired
            private DBS06DBSLeverageRatioConsolidated_Layout1EntityRepository dbs06DBSLeverageRatioConsolidated_Layout1EntityRepository;

            public List<DBS06DBSLeverageRatioConsolidated_Layout1Entity> getDbs06DBSLeverageRatioConsolidated_Layout1Entities(){
                return (List<DBS06DBSLeverageRatioConsolidated_Layout1Entity>) dbs06DBSLeverageRatioConsolidated_Layout1EntityRepository.findAll();
            }
            

            @Autowired
            private DBS06DBSLeverageRatioConsolidated_Layout2EntityRepository dbs06DBSLeverageRatioConsolidated_Layout2EntityRepository;

            public List<DBS06DBSLeverageRatioConsolidated_Layout2Entity> getDbs06DBSLeverageRatioConsolidated_Layout2Entities(){
                return (List<DBS06DBSLeverageRatioConsolidated_Layout2Entity>) dbs06DBSLeverageRatioConsolidated_Layout2EntityRepository.findAll();
            }
            

            @Autowired
            private DBS06DBSLeverageRatioConsolidated_Layout3EntityRepository dbs06DBSLeverageRatioConsolidated_Layout3EntityRepository;

            public List<DBS06DBSLeverageRatioConsolidated_Layout3Entity> getDbs06DBSLeverageRatioConsolidated_Layout3Entities(){
                return (List<DBS06DBSLeverageRatioConsolidated_Layout3Entity>) dbs06DBSLeverageRatioConsolidated_Layout3EntityRepository.findAll();
            }
            

            @Autowired
            private DBS06DBSLeverageRatioConsolidated_Layout4EntityRepository dbs06DBSLeverageRatioConsolidated_Layout4EntityRepository;

            public List<DBS06DBSLeverageRatioConsolidated_Layout4Entity> getDbs06DBSLeverageRatioConsolidated_Layout4Entities(){
                return (List<DBS06DBSLeverageRatioConsolidated_Layout4Entity>) dbs06DBSLeverageRatioConsolidated_Layout4EntityRepository.findAll();
            }
            

            @Autowired
            private DBS06DBSLeverageRatioConsolidated_Layout5EntityRepository dbs06DBSLeverageRatioConsolidated_Layout5EntityRepository;

            public List<DBS06DBSLeverageRatioConsolidated_Layout5Entity> getDbs06DBSLeverageRatioConsolidated_Layout5Entities(){
                return (List<DBS06DBSLeverageRatioConsolidated_Layout5Entity>) dbs06DBSLeverageRatioConsolidated_Layout5EntityRepository.findAll();
            }
            

            @Autowired
            private DBS06DBSAuthorisedSignatory_Layout1EntityRepository dbs06DBSAuthorisedSignatory_Layout1EntityRepository;

            public List<DBS06DBSAuthorisedSignatory_Layout1Entity> getDbs06DBSAuthorisedSignatory_Layout1Entities(){
                return (List<DBS06DBSAuthorisedSignatory_Layout1Entity>) dbs06DBSAuthorisedSignatory_Layout1EntityRepository.findAll();
            }
            
}
