package repository;

import entity.Customer;
import jakarta.ejb.Singleton;
import jakarta.persistence.*;

import java.util.List;
import java.util.Queue;

@Singleton
public class CustomerRepository {
    private final EntityManagerFactory entityManagerFactory;

    public CustomerRepository() {
        entityManagerFactory = Persistence.createEntityManagerFactory("persistenceUnit");
    }

    public List<Customer> getAllCustomers() {
        EntityManager em = entityManagerFactory.createEntityManager();
        List<Customer> customers = em.createQuery("select a from Customer a order by a.id", Customer.class).getResultList();
        return customers;
    }

    public Customer getCustomerById(Long id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        Customer customer = em.find(Customer.class, id);
        em.close();
        return customer;
    }

    public void addCustomer(Customer customer) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.persist(customer);
        em.close();
    }

    public List<Customer> getCustomersByStr(String str) {
        EntityManager em = entityManagerFactory.createEntityManager();
        Query query = em.createQuery("select a from Customer a where a.name like :substr or a.surname like :substr or a.email like :substr or a.zipCode like :substr", Customer.class);
        query.setParameter("substr", "%" + str +"%");
        List<Customer> customers = query.getResultList();
        em.close();
        return customers;
    }
}
