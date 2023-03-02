package repository;

import entity.Customer;
import jakarta.ejb.Singleton;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Persistence;

import java.util.List;

@Singleton
public class CustomerRepository {
    private final EntityManagerFactory entityManagerFactory;

    public CustomerRepository() {
        entityManagerFactory = Persistence.createEntityManagerFactory("persistenceUnit");
    }
    public List<Customer> getAllCustomers() {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        List<Customer> customers = em.createQuery("select a from Customer a order by a.id", Customer.class).getResultList();
        em.getTransaction().commit();
        return customers;
    }

    public Customer getCustomerById(Long id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        try {
            Customer customer = em.createQuery("select a from Customer a where a.id=" + id, Customer.class).getSingleResult();
            return customer;
        } catch (NoResultException ex) {
            return new Customer();
        }
        finally {
            em.getTransaction().commit();
        }
    }

    public void addCustomer(Customer customer) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(customer);
        em.getTransaction().commit();
    }
}
