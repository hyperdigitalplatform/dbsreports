package in.armedu.banking.report.rbixbrl.db.service.dbs16;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class DBS16Service {
        

            @Autowired
            private DBS16FilingInfo_Layout1EntityRepository dbs16FilingInfo_Layout1EntityRepository;

            public List<DBS16FilingInfo_Layout1Entity> getDbs16FilingInfo_Layout1Entities(){
                return (List<DBS16FilingInfo_Layout1Entity>) dbs16FilingInfo_Layout1EntityRepository.findAll();
            }
            

            @Autowired
            private DBS16FilingInfo_Layout2EntityRepository dbs16FilingInfo_Layout2EntityRepository;

            public List<DBS16FilingInfo_Layout2Entity> getDbs16FilingInfo_Layout2Entities(){
                return (List<DBS16FilingInfo_Layout2Entity>) dbs16FilingInfo_Layout2EntityRepository.findAll();
            }
            

            @Autowired
            private DBS16DBS_StressedMSME_Layout1EntityRepository dbs16DBS_StressedMSME_Layout1EntityRepository;

            public List<DBS16DBS_StressedMSME_Layout1Entity> getDbs16DBS_StressedMSME_Layout1Entities(){
                return (List<DBS16DBS_StressedMSME_Layout1Entity>) dbs16DBS_StressedMSME_Layout1EntityRepository.findAll();
            }
            

            @Autowired
            private DBS16DBS_AuthorisedSignatory_Layout1EntityRepository dbs16DBS_AuthorisedSignatory_Layout1EntityRepository;

            public List<DBS16DBS_AuthorisedSignatory_Layout1Entity> getDbs16DBS_AuthorisedSignatory_Layout1Entities(){
                return (List<DBS16DBS_AuthorisedSignatory_Layout1Entity>) dbs16DBS_AuthorisedSignatory_Layout1EntityRepository.findAll();
            }
            
}
