package controller;

import entity.Customer;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.CustomerService;

import java.io.IOException;

@WebServlet("/addNew")
public class AddNewCustomerController extends HttpServlet {
    @EJB
    private CustomerService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.getRequestDispatcher("addNewCustomer.jsp").forward(req, resp);
        Customer customer = new Customer();
        customer.setName(req.getParameter("name"));
        customer.setSurname(req.getParameter("surname"));
        customer.setZipCode(Integer.parseInt(req.getParameter("zip")));
        customer.setEmail(req.getParameter("email"));
        service.addCustomer(customer);
    }
}
