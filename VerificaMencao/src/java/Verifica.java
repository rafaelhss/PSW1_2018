/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rafael.Soares
 */
public class Verifica extends HttpServlet {

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
        
        String COD_APROVADO = "a";
        String COD_REPROVADO = "r";
        
        
        String nome = request.getParameter("nome");
        
        String disc1 = request.getParameter("disc1");
        String disc2 = request.getParameter("disc2");
        String disc3 = request.getParameter("disc3");
        
        Integer faltas1 = Integer.parseInt(request.getParameter("faltas1"));
        Integer faltas2 = Integer.parseInt(request.getParameter("faltas2"));
        Integer faltas3 = Integer.parseInt(request.getParameter("faltas3"));
        
        int MAX_FALTAS = 8;
        
        String resultDisc1 = COD_REPROVADO;
        String resultDisc2 = COD_REPROVADO;
        String resultDisc3 = COD_REPROVADO;
        
        if(disc1.equals("ss") || disc1.equals("ms") || disc1.equals("mm")){
            if(faltas1 < MAX_FALTAS){
                resultDisc1 = COD_APROVADO;
            }
        }
        
        if(disc2.equals("ss") || disc2.equals("ms") || disc2.equals("mm")){
            if(faltas2 < MAX_FALTAS){
                resultDisc2 = COD_APROVADO;
            }
        }
        
        if(disc3.equals("ss") || disc3.equals("ms") || disc3.equals("mm")){
            if(faltas3 < MAX_FALTAS){
                resultDisc3 = COD_APROVADO;
            }
        }
        
        String resultFinal = "r";
        if(resultDisc1.equals(resultDisc2) && resultDisc2.equals(resultDisc3) && resultDisc3.equals(COD_APROVADO)){
            resultFinal = COD_APROVADO;
        }
        
        
        request.setAttribute("nome", nome);
        request.setAttribute("resultDisc1", resultDisc1);
        request.setAttribute("resultDisc2", resultDisc2);
        request.setAttribute("resultDisc3", resultDisc3);
        request.setAttribute("resultFinal", resultFinal);
        
        

        String codDia = "n";
        int hours = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if(hours > 0 && hours < 12){
            codDia = "d";
        } else if (hours >= 12 && hours < 19){
            codDia = "t";
        }
        request.setAttribute("codDia", codDia);
        
        
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
        
        
        
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
