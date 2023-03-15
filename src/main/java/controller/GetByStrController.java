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

@WebServlet("/getByStr")
public class GetByStrController extends HttpServlet {
    @EJB
    private CustomerService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String str = req.getParameter("str");
        List<Customer> customers = service.getCustomersByStr(str);
        req.setAttribute("customers", customers);
        for (Customer cu : customers) {
            System.out.println(cu);
        }
        req.getRequestDispatcher("getCustomersByStr.jsp").forward(req, resp);
    }
}