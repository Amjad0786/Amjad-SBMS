package in.amjadit.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.amjadit.Reports.IReport;

@Service("reportService")
public class ReportService {
	

	@Autowired
	@Qualifier("excel")
	private IReport excelreport;
	
	@Autowired
	@Qualifier("pdf")
	private IReport pdfreport;
	

	public void generate() {
		System.out.println("injected :: " + pdfreport.getClass().getName());
		pdfreport.generateReport();
	}

}
