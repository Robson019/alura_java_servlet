package com.example.studies_servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/corpListServlet")
public class CorpListServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        Database database = new Database();
        List<Corporation> corps = database.getCorps();

        RequestDispatcher rd = req.getRequestDispatcher("/getCorps.jsp");
        req.setAttribute("corps", corps);
        rd.forward(req, resp);
    }

}
