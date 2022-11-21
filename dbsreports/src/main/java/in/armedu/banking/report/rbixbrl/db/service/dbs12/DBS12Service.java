package in.armedu.banking.report.rbixbrl.db.service.dbs12;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class DBS12Service {
        

            @Autowired
            private DBS12FilingInfo_Layout1EntityRepository dbs12FilingInfo_Layout1EntityRepository;

            public List<DBS12FilingInfo_Layout1Entity> getDbs12FilingInfo_Layout1Entities(){
                return (List<DBS12FilingInfo_Layout1Entity>) dbs12FilingInfo_Layout1EntityRepository.findAll();
            }
            

            @Autowired
            private DBS12FilingInfo_Layout2EntityRepository dbs12FilingInfo_Layout2EntityRepository;

            public List<DBS12FilingInfo_Layout2Entity> getDbs12FilingInfo_Layout2Entities(){
                return (List<DBS12FilingInfo_Layout2Entity>) dbs12FilingInfo_Layout2EntityRepository.findAll();
            }
            

            @Autowired
            private DBS12DBS12_SectionA_Layout1EntityRepository dbs12DBS12_SectionA_Layout1EntityRepository;

            public List<DBS12DBS12_SectionA_Layout1Entity> getDbs12DBS12_SectionA_Layout1Entities(){
                return (List<DBS12DBS12_SectionA_Layout1Entity>) dbs12DBS12_SectionA_Layout1EntityRepository.findAll();
            }
            

            @Autowired
            private DBS12DBS12_SectionB_Layout1EntityRepository dbs12DBS12_SectionB_Layout1EntityRepository;

            public List<DBS12DBS12_SectionB_Layout1Entity> getDbs12DBS12_SectionB_Layout1Entities(){
                return (List<DBS12DBS12_SectionB_Layout1Entity>) dbs12DBS12_SectionB_Layout1EntityRepository.findAll();
            }
            

            @Autowired
            private DBS12DBS12_SectionC_Layout1EntityRepository dbs12DBS12_SectionC_Layout1EntityRepository;

            public List<DBS12DBS12_SectionC_Layout1Entity> getDbs12DBS12_SectionC_Layout1Entities(){
                return (List<DBS12DBS12_SectionC_Layout1Entity>) dbs12DBS12_SectionC_Layout1EntityRepository.findAll();
            }
            

            @Autowired
            private DBS12DBS12_SectionD_Layout1EntityRepository dbs12DBS12_SectionD_Layout1EntityRepository;

            public List<DBS12DBS12_SectionD_Layout1Entity> getDbs12DBS12_SectionD_Layout1Entities(){
                return (List<DBS12DBS12_SectionD_Layout1Entity>) dbs12DBS12_SectionD_Layout1EntityRepository.findAll();
            }
            

            @Autowired
            private DBS12DBS12_SectionD_Layout2EntityRepository dbs12DBS12_SectionD_Layout2EntityRepository;

            public List<DBS12DBS12_SectionD_Layout2Entity> getDbs12DBS12_SectionD_Layout2Entities(){
                return (List<DBS12DBS12_SectionD_Layout2Entity>) dbs12DBS12_SectionD_Layout2EntityRepository.findAll();
            }
            

            @Autowired
            private DBS12DBSAuthorisedSignatory_Layout1EntityRepository dbs12DBSAuthorisedSignatory_Layout1EntityRepository;

            public List<DBS12DBSAuthorisedSignatory_Layout1Entity> getDbs12DBSAuthorisedSignatory_Layout1Entities(){
                return (List<DBS12DBSAuthorisedSignatory_Layout1Entity>) dbs12DBSAuthorisedSignatory_Layout1EntityRepository.findAll();
            }
            
}
