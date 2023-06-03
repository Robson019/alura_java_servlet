package com.example.studies_servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/update-name")
public class EditServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String dateParam = request.getParameter("date");
        String idParam = request.getParameter("id");
        int id = Integer.valueOf(idParam);

        Date createdAt;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            createdAt = sdf.parse(dateParam);
        } catch (ParseException e) {
            throw new ServletException(e);
        }

        Database database = new Database();
        Corporation corp = database.getCorpById(id);
        corp.setName(name);
        corp.setCreatedAt(createdAt);

        response.sendRedirect("corpListServlet");
    }
}
