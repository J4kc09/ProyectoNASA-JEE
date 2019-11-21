/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.codejava.upload;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Base64;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.ImageIcon;

/**
 *
 * @author Hp
 */
@WebServlet("/consultaServlet")
public class ConsultaDBServlet extends HttpServlet {

    private final String url = "jdbc:mysql://karrasko.ddns.net/planetas";
    private final String user = "nasa";
    private final String password = "nasanasa";
    
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Connection conn = null; // connection to the database
        String message = null;  // message will be sent back to client

        String ID_PLANETA = null;
        String NOMBRE_SISTEMA = null;
        String IMAGEN = null;
        String NOMBRE_PLANETA = null;
        String DIAMETRO = null;
        String DIST_ESTRELLA = null;
        String SATELITES = null;
        String TIPO = null;
        String MASA = null;
        String ENANO = null;
        String VERIFICADO = null;
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection(url, user, password);
            String sql2 = "select * from planeta_editable where NOMBRE_PLANETA = '" + request.getParameter("consultaPlaneta") + "';";
            PreparedStatement statement = conn.prepareStatement(sql2);
            ResultSet res = statement.executeQuery();
            if (res.next()) {
                ID_PLANETA = res.getString(1);
                NOMBRE_SISTEMA = res.getString(2);
                NOMBRE_PLANETA = res.getString(3);
                String IMAGENString = res.getString(4);
                Blob ImagenBlob = res.getBlob(4);
                DIAMETRO = res.getString(5);
                DIST_ESTRELLA = res.getString(6);
                SATELITES = res.getString(7);
                TIPO = res.getString(8);
                MASA = res.getString(9);
                ENANO = res.getString(10);
                VERIFICADO = res.getString(11);

                if (NOMBRE_SISTEMA != null) {
                    request.setAttribute("NOMBRE_PLANETA", NOMBRE_PLANETA);
                    request.setAttribute("NOMBRE_SISTEMA", NOMBRE_SISTEMA);
                    request.setAttribute("DIAMETRO", DIAMETRO);
                    request.setAttribute("DIST_ESTRELLA", DIST_ESTRELLA);
                    request.setAttribute("SATELITES", SATELITES);
                    request.setAttribute("TIPO", TIPO);
                    request.setAttribute("MASA", MASA);
                    request.setAttribute("ENANO", ENANO);
                    request.setAttribute("VERIFICADO", VERIFICADO);
                } else {
                    request.setAttribute("Message", "NO ENCONTRADO");
                }

                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];
                InputStream in = ImagenBlob.getBinaryStream();
                int n = 0;
                while ((n = in.read(buf)) >= 0) {
                    baos.write(buf, 0, n);
                }
                in.close();
                byte[] bytes = baos.toByteArray();
                String base64Image = Base64.getEncoder().encodeToString(bytes);
                IMAGEN = base64Image;
                request.setAttribute("IMAGEN", IMAGEN);
                in.close();
                baos.close();

                // forwards to the message page 
                getServletContext().getRequestDispatcher("/Consulta.jsp").forward(request, response);
            }
        } catch (Exception e) {
            out.println(e);
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
