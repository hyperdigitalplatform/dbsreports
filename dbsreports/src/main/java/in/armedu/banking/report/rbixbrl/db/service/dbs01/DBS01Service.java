package in.armedu.banking.report.rbixbrl.db.service.dbs01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class DBS01Service {
        

            @Autowired
            private FilingInfo_Layout1EntityRepository filingInfo_Layout1EntityRepository;

            public List<FilingInfo_Layout1Entity> getFilingInfo_Layout1Entities(){
                return (List<FilingInfo_Layout1Entity>) filingInfo_Layout1EntityRepository.findAll();
            }
            

            @Autowired
            private FilingInfo_Layout2EntityRepository filingInfo_Layout2EntityRepository;

            public List<FilingInfo_Layout2Entity> getFilingInfo_Layout2Entities(){
                return (List<FilingInfo_Layout2Entity>) filingInfo_Layout2EntityRepository.findAll();
            }
            

            @Autowired
            private DBS01AddInfo_Layout1EntityRepository dBS01AddInfo_Layout1EntityRepository;

            public List<DBS01AddInfo_Layout1Entity> getDBS01AddInfo_Layout1Entities(){
                return (List<DBS01AddInfo_Layout1Entity>) dBS01AddInfo_Layout1EntityRepository.findAll();
            }
            

            @Autowired
            private DBS01FS_Layout1EntityRepository dBS01FS_Layout1EntityRepository;

            public List<DBS01FS_Layout1Entity> getDBS01FS_Layout1Entities(){
                return (List<DBS01FS_Layout1Entity>) dBS01FS_Layout1EntityRepository.findAll();
            }
            

            @Autowired
            private DBS01FS_Layout2EntityRepository dBS01FS_Layout2EntityRepository;

            public List<DBS01FS_Layout2Entity> getDBS01FS_Layout2Entities(){
                return (List<DBS01FS_Layout2Entity>) dBS01FS_Layout2EntityRepository.findAll();
            }
            

            @Autowired
            private DBS01FS_Layout3EntityRepository dBS01FS_Layout3EntityRepository;

            public List<DBS01FS_Layout3Entity> getDBS01FS_Layout3Entities(){
                return (List<DBS01FS_Layout3Entity>) dBS01FS_Layout3EntityRepository.findAll();
            }
            

            @Autowired
            private DBS01OFC_Layout1EntityRepository dBS01OFC_Layout1EntityRepository;

            public List<DBS01OFC_Layout1Entity> getDBS01OFC_Layout1Entities(){
                return (List<DBS01OFC_Layout1Entity>) dBS01OFC_Layout1EntityRepository.findAll();
            }
            
}
