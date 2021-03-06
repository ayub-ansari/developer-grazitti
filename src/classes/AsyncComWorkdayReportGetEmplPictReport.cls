//Generated by wsdl2apex

public class AsyncComWorkdayReportGetEmplPictReport {
    public class Report_DataTypeFuture extends System.WebServiceCalloutFuture {
        public comWorkdayReportGetEmplPictReport.Report_EntryType[] getValue() {
            comWorkdayReportGetEmplPictReport.Report_DataType response = (comWorkdayReportGetEmplPictReport.Report_DataType)System.WebServiceCallout.endInvoke(this);
            return response.Report_Entry;
        }
    }
    public class AsyncReport {
        public String endpoint_x = 'https://wd2-impl-services1.workday.com/ccx/service/Report2/marketo/amsuresh/Get_Empl_Pict_Report';
        public Map<String,String> inputHttpHeaders_x;
        public String clientCertName_x;
        public Integer timeout_x;
        private String[] ns_map_type_info = new String[]{'urn:com.workday.report/Get_Empl_Pict_Report', 'comWorkdayReportGetEmplPictReport'};
        public AsyncComWorkdayReportGetEmplPictReport.Report_DataTypeFuture beginExecute_Report(System.Continuation continuation,comWorkdayReportGetEmplPictReport.Report_ParametersType Report_Parameters,comWorkdayReportGetEmplPictReport.AuthenticationType Authentication) {
            comWorkdayReportGetEmplPictReport.Execute_ReportType request_x = new comWorkdayReportGetEmplPictReport.Execute_ReportType();
            request_x.Report_Parameters = Report_Parameters;
            request_x.Authentication = Authentication;
            return (AsyncComWorkdayReportGetEmplPictReport.Report_DataTypeFuture) System.WebServiceCallout.beginInvoke(
              this,
              request_x,
              AsyncComWorkdayReportGetEmplPictReport.Report_DataTypeFuture.class,
              continuation,
              new String[]{endpoint_x,
              '',
              'urn:com.workday.report/Get_Empl_Pict_Report',
              'Execute_Report',
              'urn:com.workday.report/Get_Empl_Pict_Report',
              'Report_Data',
              'comWorkdayReportGetEmplPictReport.Report_DataType'}
            );
        }
    }
}