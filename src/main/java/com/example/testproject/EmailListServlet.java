package com.example.testproject;

import com.example.testproject.Enum.HowHear;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class EmailListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, ServletException {
        String url = "/index.html";

        String action = req.getParameter("action");
        if (action == null) {
            action = "join";
        }

        if (action.equals("join")) {
            url = "/index.html";
        } else if (action.equals("add")) {
            String firstName = req.getParameter("firstName");
            String lastName = req.getParameter("lastName");
            String email = req.getParameter("email");
            String dob = req.getParameter("dob");

            String hhs = req.getParameter("how_hear");
            String[] receive = req.getParameterValues("receive_announcements");

            String contact = req.getParameter("contact_via");


            /*DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = new Date(dateFormat.format(dob));*/

            User user = new User(firstName, lastName, email, dob);

            HowHear hh = HowHear.getByName(hhs);
            Contact c = new Contact(receive, contact);

            Survey survey = new Survey(user, hh, c);

            //UserDB.insert(user);

            req.setAttribute("survey", survey);
            req.setAttribute("contact", c);
            req.setAttribute("how", hh);
            url = "/thanks.jsp";
        }
        getServletContext().getRequestDispatcher(url)
                .forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}