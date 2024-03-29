package service;
import entity.Customer;
import jakarta.ejb.EJB;
import jakarta.ejb.Singleton;
import repository.CustomerRepository;

import java.util.List;

@Singleton
public class CustomerService {
    @EJB
    private CustomerRepository repository;

    public List<Customer> getAllCustomers() {
        return repository.getAllCustomers();
    }

    public List<Customer> getCustomersByStr(String str) {
        return repository.getCustomersByStr(str);
    }

    public Customer getCustomerById(Long id) {
        return repository.getCustomerById(id);
    }

    public void addCustomer(Customer customer) {
        repository.addCustomer(customer);
    }
}
