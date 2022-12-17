package in.armedu.banking.report.rbixbrl.reports;

import in.armedu.banking.report.rbixbrl.reports.dbs12.DBS12Report;
import in.armedu.banking.report.rbixbrl.reports.dbs13.DBS13Report;

public class XBRLReportBuilder {

     public XBRLReportIntf buildDBS13Report(){
    
        DBS13Report report = new DBS13Report();
         return report;
     }
     public XBRLReportIntf buildDBS12Report(){
    
          DBS12Report report = new DBS12Report();
           return report;
       }

}
