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

@WebServlet("/getById")
public class CustomerByIdController extends HttpServlet {
    @EJB
    private CustomerService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        Long id = Long.parseLong(req.getParameter("id"));
        Customer customer = service.getCustomerById(id);
        req.setAttribute("customer", customer);
        req.getRequestDispatcher("customerById.jsp").forward(req, resp);
    }
}