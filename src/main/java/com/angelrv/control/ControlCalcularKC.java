/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.angelrv.control;

import com.angelrv.calculos.IndicadorSalud;
import com.angelrv.calculos.MetodoKC_CS;
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
public class ControlCalcularKC extends HttpServlet {

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
        
        double peso = Double.parseDouble(request.getParameter("peso"));
        
        IndicadorSalud IS = new IndicadorSalud();
        
        IS.setKcr(new MetodoKC_CS());
        IS.setUsuario(user);
        IS.setPeso(peso);
        
        ArrayList<String[]> data = (ArrayList<String[]>)sesion.getAttribute("data");
        if (data == null) {
            data = new ArrayList<String[]>();
        }
        
        String valores[] = {
            LocalDate.now().toString(),
            Double.toString(IS.getPeso()),
            "",
            "",
            "Chris Shugart",
            Double.toString(IS.caloriasRequeridas())
        };
        
        data.add(valores);
        
        sesion.setAttribute("data", data);
        
        RequestDispatcher req = request.getRequestDispatcher("Resultado.jsp");
        request.setAttribute("caloriasRequeridas", IS.caloriasRequeridas());
        request.setAttribute("metodo", "Chris Shugart");
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
