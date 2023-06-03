package com.example.studies_servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/insert-name")
public class NameServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        String dateParam = request.getParameter("date");

        Date createdAt;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            createdAt = sdf.parse(dateParam);
        } catch (ParseException e) {
            throw new ServletException(e);
        }

        Corporation corp = new Corporation(name, createdAt);

        Database database = new Database();
        database.insertCorporation(corp);

        request.setAttribute("corp_name", corp.getName());
        response.sendRedirect("corpListServlet");
    }

}
