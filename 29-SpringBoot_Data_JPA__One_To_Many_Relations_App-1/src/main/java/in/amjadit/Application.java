package in.amjadit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.amjadit.Entity.Address;
import in.amjadit.Entity.Employee;
import in.amjadit.repository.AddressRepository;
import in.amjadit.repository.EmpRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmpRepository bean = context.getBean(EmpRepository.class);
		AddressRepository bean1 = context.getBean(AddressRepository.class);
		
		Employee e = new Employee();
		e.setEmpName("Raju");
		e.setEmpSalary(4000.00);

		Address a1 = new Address();
		a1.setAddrCity("hyd");
		a1.setAddrCountry("India");
		a1.setAddrState("Telangana");
		a1.setEmp(e);

		Address a2 = new Address();
		a2.setAddrCity("Varansi");
		a2.setAddrCountry("India");
		a2.setAddrState("U.P");
		a2.setEmp(e);

		//setting adresses to employee
		List<Address> asList = Arrays.asList(a1, a2);

		e.setAddr(asList);
		//bean.save(e);
		//bean.deleteById(1);
		
		bean1.findById(3);
		
		System.out.println("Record Inserted......");

	}

}
