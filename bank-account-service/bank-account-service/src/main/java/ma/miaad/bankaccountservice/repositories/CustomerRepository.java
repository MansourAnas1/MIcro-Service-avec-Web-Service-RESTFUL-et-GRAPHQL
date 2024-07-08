package ma.miaad.bankaccountservice.repositories;

import ma.miaad.bankaccountservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer,Long> {
}