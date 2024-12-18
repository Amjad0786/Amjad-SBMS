package in.amjadit;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.amjadit.Entity.Account;
import in.amjadit.Entity.AccountPK;

import in.amjadit.repository.AccountRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		AccountRepository repository = context.getBean(AccountRepository.class);
		
		AccountPK pk = new AccountPK();
		pk.setAccId(02);
		pk.setAccType("Current");
		pk.setAccNum(12941342489l);
		
		/*
		 * Account acc = new Account(); acc.setHolderName("Amjad");
		 * acc.setBranch("Dildarnagar"); acc.setAccountPk(pk);
		 * 
		 * repository.save(acc);
		 */

		Optional<Account> optional = repository.findById(pk);
		
		System.out.println(optional.get());
	}

}
