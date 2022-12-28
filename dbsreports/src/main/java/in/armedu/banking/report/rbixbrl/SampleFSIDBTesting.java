package in.armedu.banking.report.rbixbrl;

    import java.io.FileWriter;
    import java.io.StringWriter;
    
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.boot.CommandLineRunner;
    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    
    import in.armedu.banking.report.rbixbrl.core.ReportGenerationEngine;
    import in.armedu.banking.report.rbixbrl.core.ReportGenerationFactory;
    import in.armedu.banking.report.rbixbrl.core.impl.XBRLReportGenerationEngine;
import in.armedu.banking.report.rbixbrl.db.service.dbs01.DBS01Calculator;
import in.armedu.banking.report.rbixbrl.model.dbs01.DBS01ReportData;
    
    @SpringBootApplication
    public class SampleFSIDBTesting implements CommandLineRunner {
        
        @Autowired
        private DBS01Calculator fsiCalculator;
        
        public static void main(String[] args) throws Exception {
            SpringApplication.run(SampleFSIDBTesting.class, args);
        }
    
        @Override
        public void run(String... args) throws Exception {
            
            DBS01ReportData reportData = fsiCalculator.prepareReportData();
            reportData.setBankCode("600");
            reportData.setStartDate("2022-04-01");
            reportData.setEndDate("2022-06-30");
            reportData.setPeriodDate("2022-06-30");
            ReportGenerationEngine engine = new XBRLReportGenerationEngine();
            StringWriter sw = engine.execute(ReportGenerationFactory.RBI_DBS01_XBRL_REPORT, reportData);
            FileWriter fw = new FileWriter("fsi-instance.xml");
            fw.write(sw.toString());
            fw.close();
    
        }
    }