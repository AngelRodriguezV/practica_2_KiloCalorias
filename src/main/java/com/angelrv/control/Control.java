/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.angelrv.control;

import com.angelrv.modelo.Usuario;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author veneg
 */
public class Control extends HttpServlet {

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
        
        HttpSession sesion = request.getSession();

        Usuario user = (Usuario)sesion.getAttribute("usuario");
        
        if (user == null) {
            String nombre = request.getParameter("nombre");
            String usuario = request.getParameter("usuario");
            String password = request.getParameter("password");
            char sexo = request.getParameter("sexo").charAt(0);
            LocalDate fechaNacimiento = LocalDate.parse(request.getParameter("nacimiento"));
            user = new Usuario(nombre, sexo, LocalDate.now(), usuario, password, fechaNacimiento, sesion.hashCode());
        }
        
        ArrayList<String[]> data = (ArrayList<String[]>)sesion.getAttribute("data");
        if (data == null) {
            data = new ArrayList<String[]>();
        }
        
        sesion.setAttribute("usuario", user);
        sesion.setAttribute("data", data);
        
        RequestDispatcher req = request.getRequestDispatcher("KiloApp.jsp");
        request.setAttribute("usuario", user);
        request.setAttribute("data", data);
        req.forward(request, response);
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
