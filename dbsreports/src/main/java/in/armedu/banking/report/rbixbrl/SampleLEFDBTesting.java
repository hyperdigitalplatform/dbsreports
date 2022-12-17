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
import in.armedu.banking.report.rbixbrl.db.service.dbs13.DBS13Calculator;
import in.armedu.banking.report.rbixbrl.model.dbs13.DBS13ReportData;

@SpringBootApplication
public class SampleLEFDBTesting implements CommandLineRunner {
    
    @Autowired
    private DBS13Calculator rosCalculator;
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleLEFDBTesting.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
        DBS13ReportData reportData = rosCalculator.prepareReportData();
        reportData.setBankCode("600");
        reportData.setStartDate("2022-01-01");
        reportData.setEndDate("2022-03-31");
        reportData.setPeriodDate("2022-03-31");
        ReportGenerationEngine engine = new XBRLReportGenerationEngine();
        StringWriter sw = engine.execute(ReportGenerationFactory.RBI_DBS13_XBRL_REPORT, reportData);
        FileWriter fw = new FileWriter("reports/lef-instance.xml");
        fw.write(sw.toString());
        fw.close();

    }
}