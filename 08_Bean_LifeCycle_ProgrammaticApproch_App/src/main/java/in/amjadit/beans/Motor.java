package in.amjadit.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Motor implements InitializingBean, DisposableBean {

	public Motor() {
		System.out.println("Motor :: Constructor..");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Motor Started...");
	}

	public void doWork() {
		System.out.println("Motor Pulling Water....");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Motor Got Stopped.... ");

	}

}
