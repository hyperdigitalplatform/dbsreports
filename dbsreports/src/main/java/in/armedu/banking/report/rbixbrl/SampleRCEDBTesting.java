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
import in.armedu.banking.report.rbixbrl.db.service.dbs12.DBS12Calculator;
import in.armedu.banking.report.rbixbrl.model.dbs12.DBS12ReportData;

@SpringBootApplication
public class SampleRCEDBTesting implements CommandLineRunner {
    
    @Autowired
    private DBS12Calculator rceCalculator;
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleRCEDBTesting.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
        DBS12ReportData reportData = rceCalculator.prepareReportData();
        reportData.setBankCode("600");
        reportData.setStartDate("2022-04-01");
        reportData.setEndDate("2022-06-30");
        reportData.setPeriodDate("2022-06-30");
        ReportGenerationEngine engine = new XBRLReportGenerationEngine();
        StringWriter sw = engine.execute(ReportGenerationFactory.RBI_DBS12_XBRL_REPORT, reportData);
        FileWriter fw = new FileWriter("rce-instance.xml");
        fw.write(sw.toString());
        fw.close();

    }
}