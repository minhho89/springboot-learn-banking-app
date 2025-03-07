package minhho.learn.bank.repositories;

import minhho.learn.bank.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
