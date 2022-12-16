package in.armedu.banking.report.rbixbrl.db.service.dbs01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class DBS01Service {
        

            @Autowired
            private DBS01FilingInfo_Layout1EntityRepository dbs01FilingInfo_Layout1EntityRepository;

            public List<DBS01FilingInfo_Layout1Entity> getDbs01FilingInfo_Layout1Entities(){
                return (List<DBS01FilingInfo_Layout1Entity>) dbs01FilingInfo_Layout1EntityRepository.findAll();
            }
            

            @Autowired
            private DBS01FilingInfo_Layout2EntityRepository dbs01FilingInfo_Layout2EntityRepository;

            public List<DBS01FilingInfo_Layout2Entity> getDbs01FilingInfo_Layout2Entities(){
                return (List<DBS01FilingInfo_Layout2Entity>) dbs01FilingInfo_Layout2EntityRepository.findAll();
            }
            

            @Autowired
            private DBS01DBS01AddInfo_Layout1EntityRepository dbs01DBS01AddInfo_Layout1EntityRepository;

            public List<DBS01DBS01AddInfo_Layout1Entity> getDbs01DBS01AddInfo_Layout1Entities(){
                return (List<DBS01DBS01AddInfo_Layout1Entity>) dbs01DBS01AddInfo_Layout1EntityRepository.findAll();
            }
            

            @Autowired
            private DBS01DBS01FS_Layout1EntityRepository dbs01DBS01FS_Layout1EntityRepository;

            public List<DBS01DBS01FS_Layout1Entity> getDbs01DBS01FS_Layout1Entities(){
                return (List<DBS01DBS01FS_Layout1Entity>) dbs01DBS01FS_Layout1EntityRepository.findAll();
            }
            

            @Autowired
            private DBS01DBS01FS_Layout2EntityRepository dbs01DBS01FS_Layout2EntityRepository;

            public List<DBS01DBS01FS_Layout2Entity> getDbs01DBS01FS_Layout2Entities(){
                return (List<DBS01DBS01FS_Layout2Entity>) dbs01DBS01FS_Layout2EntityRepository.findAll();
            }
            

            @Autowired
            private DBS01DBS01FS_Layout3EntityRepository dbs01DBS01FS_Layout3EntityRepository;

            public List<DBS01DBS01FS_Layout3Entity> getDbs01DBS01FS_Layout3Entities(){
                return (List<DBS01DBS01FS_Layout3Entity>) dbs01DBS01FS_Layout3EntityRepository.findAll();
            }
            

            @Autowired
            private DBS01DBS01OFC_Layout1EntityRepository dbs01DBS01OFC_Layout1EntityRepository;

            public List<DBS01DBS01OFC_Layout1Entity> getDbs01DBS01OFC_Layout1Entities(){
                return (List<DBS01DBS01OFC_Layout1Entity>) dbs01DBS01OFC_Layout1EntityRepository.findAll();
            }
            
}
