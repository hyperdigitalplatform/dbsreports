package in.armedu.banking.report.rbixbrl.reports;

import in.armedu.banking.report.rbixbrl.reports.dbs13.DBS13Report;

public class XBRLReportBuilder {

     public XBRLReportIntf buildDBS13Report(){
    
        DBS13Report report = new DBS13Report();
         return report;
     }

}
