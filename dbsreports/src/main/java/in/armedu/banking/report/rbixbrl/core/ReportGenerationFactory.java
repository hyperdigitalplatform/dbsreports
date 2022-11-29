package in.armedu.banking.report.rbixbrl.core;

import in.armedu.banking.report.rbixbrl.reports.XBRLReportBuilder;
import in.armedu.banking.report.rbixbrl.reports.XBRLReportIntf;

public class ReportGenerationFactory {

    public static final String RBI_DBS13_XBRL_REPORT = "RBI_DBS13_XBRL_REPORT";

    public XBRLReportIntf createXBRLReport(String reportType){
        // return null if report type is null
        if(reportType == null) return null;
        
        else if(RBI_DBS13_XBRL_REPORT.equalsIgnoreCase(reportType)) { // build DBS13 report
            return new XBRLReportBuilder().buildDBS13Report();
        }
        return null;
    }
}
