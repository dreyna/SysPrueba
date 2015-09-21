/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DistritoDAO;
import interfaces.InterfaceDistrito;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Distrito;

/**
 *
 * @author admin-david.orrego
 */
public class DistritoController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

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
    
        PrintWriter out = response.getWriter();
        InterfaceDistrito aO = new DistritoDAO();
        Distrito dep = new Distrito();
        HttpSession session = request.getSession(true);
        RequestDispatcher dispatcher; String pagina;
        String op = request.getParameter("op"); int id;
        switch(Integer.parseInt(op)){
            case 0: pagina = "/inicio.jsp";
                    dispatcher = getServletContext().getRequestDispatcher(pagina);
                    dispatcher.forward(request, response);break;
            case 1: pagina = "/vista/distrito/listarDistrito.jsp";
                    session.setAttribute("list1", aO.listarDistrito());
                    dispatcher = getServletContext().getRequestDispatcher(pagina);
                    dispatcher.forward(request, response);break;
            case 2: pagina = "/vista/distrito/guardarDistrito.jsp";
                    
                    dispatcher = getServletContext().getRequestDispatcher(pagina);
                    dispatcher.forward(request, response);break;
            case 3: pagina = "/vista/distrito/editarDistrito.jsp";
                    
                    dispatcher = getServletContext().getRequestDispatcher(pagina);
                    dispatcher.forward(request, response);break;
            case 4: pagina = "/vista/distrito/buscarDistrito.jsp";
                    
                    dispatcher = getServletContext().getRequestDispatcher(pagina);
                    dispatcher.forward(request, response);break;
        }
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
