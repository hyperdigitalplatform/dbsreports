package in.armedu.banking.report.rbixbrl.core;

import in.armedu.banking.report.rbixbrl.reports.XBRLReportBuilder;
import in.armedu.banking.report.rbixbrl.reports.XBRLReportIntf;

public class ReportGenerationFactory {

    public static final String RBI_DBS13_XBRL_REPORT = "RBI_DBS13_XBRL_REPORT";
    public static final String RBI_DBS12_XBRL_REPORT = "RBI_DBS12_XBRL_REPORT";
    public static final String RBI_DBS01_XBRL_REPORT = "RBI_DBS01_XBRL_REPORT";
    public static final String RBI_DBS06_XBRL_REPORT = "RBI_DBS06_XBRL_REPORT";

    public XBRLReportIntf createXBRLReport(String reportType){
        // return null if report type is null
        if(reportType == null) return null;
        
        else if(RBI_DBS13_XBRL_REPORT.equalsIgnoreCase(reportType)) { // build DBS13 report
            return new XBRLReportBuilder().buildDBS13Report();
        }
        else if(RBI_DBS12_XBRL_REPORT.equalsIgnoreCase(reportType)) { // build DBS12 report
            return new XBRLReportBuilder().buildDBS12Report();
        }
        else if(RBI_DBS01_XBRL_REPORT.equalsIgnoreCase(reportType)) { // build DBS01 report
            return new XBRLReportBuilder().buildDBS01Report();
        }
        else if(RBI_DBS06_XBRL_REPORT.equalsIgnoreCase(reportType)) { // build DBS06 report
            return new XBRLReportBuilder().buildDBS06Report();
        }
        return null;
    }
}
