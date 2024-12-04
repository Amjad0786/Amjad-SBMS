package in.amjadit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.amjadit.Service.ReportService;
import in.amjadit.cfg.AppConfig;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ReportService services = context.getBean(ReportService.class);
		System.out.println(services);
		services.generate();
	}

}
