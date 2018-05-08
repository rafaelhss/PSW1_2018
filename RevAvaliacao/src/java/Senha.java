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
public class Senha extends HttpServlet {

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
        
        String senha = request.getParameter("senha");
        
        String resultado = "INVALIDA";
        
        if(tamanhoMaiorQue6(senha)){
            if(possuiMaiuscula(senha)){
                if(possuiNumero(senha)){
                    resultado = "FORTE";
                } else {
                    resultado = "MEDIA";
                }
            } else {
                if(possuiNumero(senha)){
                    resultado = "MEDIA";
                } else {
                    resultado = "FRACA";
                }
            }
        }
        
        request.setAttribute("res", resultado);
        
        request.getRequestDispatcher("validacao.jsp")
                .forward(request, response);
        
        
    }

    
    public boolean tamanhoMaiorQue6(String str){
            return str.length() >= 6;
    }


    public boolean possuiMaiuscula(String str) {        
        for(int i=str.length()-1; i>=0; i--) {
            if(Character.isUpperCase(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }



    public boolean possuiNumero(String str) {        
        for(int i=str.length()-1; i>=0; i--) {
    try{
                    Integer.parseInt(String.valueOf(str.charAt(i)));
                            return true;
                    } catch (Exception e){

                    }
        }
        return false;
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
