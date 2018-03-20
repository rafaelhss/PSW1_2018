/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rafael.Soares
 */
public class Signo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            Integer dia = Integer.parseInt(request.getParameter("dia"));
            Integer mes = Integer.parseInt(request.getParameter("mes"));
            
            String signo = "";
            String img = "";
            if(mes == 3){
                if(dia < 21){
                    signo = "Peixes";
                } else {
                    signo = "Aries";
                }
            }
            if(mes == 4){
                if(dia < 21){
                    signo = "Aries";
                } else {
                    signo = "Touro";
                }
            }
            if(mes == 5){
                if(dia < 21){
                    signo = "Touro";
                } else {
                    signo = "Gemeos";
                }
            }
            if(mes == 6){
                if(dia < 21){
                    signo = "Gemeos";
                } else {
                    signo = "Cancer";
                }
            }
            if(mes == 7){
                if(dia < 21){
                    signo = "Cancer";
                } else {
                    signo = "Leao";
                }
            }
            if(mes == 8){
                if(dia < 21){
                    signo = "Leao";
                } else {
                    signo = "Virgem";
                }
            } 
            if(mes == 9){
                if(dia < 21){
                    signo = "Virgem";
                } else {
                    signo = "Libra";
                }
            }
            if(mes == 10){
                if(dia < 21){
                    signo = "Libra";
                } else {
                    signo = "Escorpiao";
                }
            }
            if(mes == 11){
                if(dia < 21){
                    signo = "Escorpiao";
                } else {
                    signo = "Sagitario";
                    img = "https://image.freepik.com/icones-gratis/sagitario_318-63013.jpg";
                }
            }
            if(mes == 12){
                if(dia < 21){
                    signo = "Sagitario";
                    img = "https://image.freepik.com/icones-gratis/sagitario_318-63013.jpg";
                } else {
                    signo = "Capricornio";
                    img = "https://image.freepik.com/free-icon/capricorn_318-63017.png";
                }
            }
            if(mes == 1){
                if(dia < 21){
                    signo = "Capricornio";
                    img = "https://image.freepik.com/free-icon/capricorn_318-63017.png";
                } else {
                    signo = "Aquario";
                }
            }
            if(mes == 2){
                if(dia < 21){
                    signo = "Aquario";
                } else {
                    signo = "Peixes";
                }
            }
            
            
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Signo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Seu signo eh: "+ signo +"</h1>");
            out.println("<img src='"+ img + "' width='50px' height='300px'>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
