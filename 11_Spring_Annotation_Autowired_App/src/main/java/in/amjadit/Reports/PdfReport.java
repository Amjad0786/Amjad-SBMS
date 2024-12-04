package in.amjadit.Reports;

import org.springframework.stereotype.Component;

@Component("pdf")
//@ComponentScan (basePackages = {"in.amjadit"})
public class PdfReport  implements IReport{

	@Override
	public void generateReport() {
		System.out.println("PdfReport Generate....");
	}
}
