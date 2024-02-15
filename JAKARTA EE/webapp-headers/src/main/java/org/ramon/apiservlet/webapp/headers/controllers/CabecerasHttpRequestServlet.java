package org.ramon.apiservlet.webapp.headers.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/cabeceras-request")
public class CabecerasHttpRequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        String metodoHttp = req.getMethod();
        String requestURI = req.getRequestURI();
        String requestURL = req.getRequestURL().toString();
        String contextPath = req.getContextPath();
        String servletPath = req.getServletPath();
        String ip = req.getLocalAddr();
        String server = req.getServerName();
        int port = req.getLocalPort();
        String schema = req.getScheme();
        String host = req.getHeader("host");
        String url = schema + "://" + host + contextPath + servletPath;
        String url2 = schema + "://" + ip + ":" + port + contextPath + servletPath;


        try (PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("     <head>");
            out.println("         <meta charset = \"UTF-8\">");
            out.println("         <title>Cabeceras HTTP Request</title>");
            out.println("     </head>");
            out.println("     <body>");
            out.println("         <h1>CabecerasHttpRequestServlet extends HttpServlet</h1>");

            out.println("<ul>");
            out.println("   <li>metodoHttp: " + metodoHttp + "</li>");
            out.println("   <li>requestURI: " + requestURI + "</li>");
            out.println("   <li>requestURL: " + requestURL + "</li>");
            out.println("   <li>contextPath: " + contextPath + "</li>");
            out.println("   <li>servletPath: " + servletPath + "</li>");
            out.println("   <li>ip: " + ip + "</li>");
            out.println("   <li>port: " + port + "</li>");
            out.println("   <li>schema: " + schema + "</li>");
            out.println("   <li>host: " + host + "</li>");
            out.println("   <li>url: " + url + "</li>");
            out.println("   <li>url2: " + url2 + "</li>");
            out.println("   <li>server: " + server + "</li>");

            Enumeration<String> headerNames = req.getHeaderNames();
            while (headerNames.hasMoreElements()) {
                String cabecera = headerNames.nextElement();
                out.println("<br><hr><br><li>" + cabecera + ": "+ req.getHeader(cabecera) + "</li>");
            }
            out.println("</ul>");

            out.println("         <footer>");
            out.println("           <p>by Ramón</p>");
            out.println("         </footer>");
            out.println("     </body>");
            out.println("</html>");
        }
    }
}
