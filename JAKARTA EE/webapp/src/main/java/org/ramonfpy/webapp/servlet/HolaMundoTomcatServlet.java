package org.ramonfpy.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hola-mundo")
public class HolaMundoTomcatServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        //out.println(); a ver la diferencia.
        out.println("<!DOCTYPE html>");
        out.println("     <head>");
        out.println("         <meta charset = \"UTF-8\">");
        out.println("         <title>Hola Mundo Servlet</title>");
        out.println("     </head>");
        out.println("     <body>");
        out.println("         <h1>Hola mundo Tomcat Servlet</h1>");
        out.println("         <h2>Tomcat Servlet Funcionando</h2>");
        out.println("         <p>By Ramón</p>");
        out.println("     </body>");
        out.println("</html>");
        out.close(); //PrintWriter se cierra automáticamente, pero lo pongo para saberlo.
    }
}
