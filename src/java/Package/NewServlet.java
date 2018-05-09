/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Joel
 */
@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String usuario = request.getParameter("usuario");
        
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>HOLA SERVLET UNO</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>HOLA " + usuario + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String contra = request.getParameter("contra");
        String sexo = request.getParameter("sexo");
        String movies [] = request.getParameterValues("peliculas");
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>HOLA SERVLET UNO</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>HOLA " + usuario + "</h1>");
        out.println("<h1>Mi contraseña es " + contra + "   no te creas C: </h1>");
        out.println("<h1>Género " + sexo + "   no te creas C: </h1>");
        out.println("<h1>Mis peliculas favoritas son: </h1>");
        out.println();
            for(String i : movies){
                out.println("<p>" + i + "</p>");
            }
        out.println("</body>");
        out.println("</html>");
    }
    

}
