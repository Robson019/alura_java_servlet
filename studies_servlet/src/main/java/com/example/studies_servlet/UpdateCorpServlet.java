package com.example.studies_servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/update-corporation")
public class UpdateCorpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String paramId = request.getParameter("id");
        Integer id = Integer.valueOf(paramId);

        Database database = new Database();
        Corporation corp = database.getCorpById(id);

        request.setAttribute("corp", corp);

        RequestDispatcher rd = request.getRequestDispatcher("/formUpdateCorp.jsp");
        rd.forward(request, response);
    }
}
