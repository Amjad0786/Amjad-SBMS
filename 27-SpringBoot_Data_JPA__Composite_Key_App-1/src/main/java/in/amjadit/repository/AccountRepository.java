package in.amjadit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.amjadit.Entity.Account;
import in.amjadit.Entity.AccountPK;


public interface AccountRepository extends JpaRepository<Account, AccountPK> {

}
