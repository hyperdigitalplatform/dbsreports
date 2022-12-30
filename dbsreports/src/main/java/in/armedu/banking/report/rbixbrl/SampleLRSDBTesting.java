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
import in.armedu.banking.report.rbixbrl.db.service.dbs06.DBS06Calculator;
import in.armedu.banking.report.rbixbrl.model.dbs06.DBS06ReportData;

@SpringBootApplication
public class SampleLRSDBTesting implements CommandLineRunner {
    
    @Autowired
    private DBS06Calculator rceCalculator;
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleLRSDBTesting.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
        DBS06ReportData reportData = rceCalculator.prepareReportData();
        reportData.setBankCode("600");
        reportData.setStartDate("2022-04-01");
        reportData.setEndDate("2022-06-30");
        reportData.setPeriodDate("2022-06-30");
        ReportGenerationEngine engine = new XBRLReportGenerationEngine();
        StringWriter sw = engine.execute(ReportGenerationFactory.RBI_DBS06_XBRL_REPORT, reportData);
        FileWriter fw = new FileWriter("reports/lrs-instance.xml");
        fw.write(sw.toString());
        fw.close();

    }
}