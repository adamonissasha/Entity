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
import java.util.List;

@WebServlet("/getAll")
public class GetAllCustomersController extends HttpServlet {
    @EJB
    private CustomerService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        List<Customer> customer = service.getAllCustomers();
        req.setAttribute("customers", customer);
        req.getRequestDispatcher("allCustomers.jsp").forward(req, resp);
    }
}
