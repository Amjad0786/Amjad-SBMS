package in.amjadit.Reports;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("excel")

public class ExcelReport implements IReport {

	@Override
	public void generateReport() {
		System.out.println("Excel Report Generate ...");
	}

}
