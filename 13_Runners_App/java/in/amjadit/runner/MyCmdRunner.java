package in.amjadit.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCmdRunner implements CommandLineRunner{
	
	
    @Override
    public void run(String... args) throws Exception {
    	System.out.println("MyCmdRunner :: Run() method executed");    	
    }
}
