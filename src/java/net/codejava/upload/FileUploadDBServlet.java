package net.codejava.upload;
 
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
 
@WebServlet("/uploadServlet")
@MultipartConfig(maxFileSize = 16177215)    // upload file's size up to 16MB
public class FileUploadDBServlet extends HttpServlet {
     
    // database connection settings
   private final String url = "jdbc:mysql://karrasko.ddns.net/planetas";
    private final String user = "nasa";
    private final String password = "nasanasa";
    
   @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // gets values of text fields
        String ID = request.getParameter("id");
        String SISTEMA_ID = request.getParameter("sistema_id");
        String IMAGEN = request.getParameter("imagen");
        String NOMBRE = request.getParameter("nombre");
        String DIAMETRO = request.getParameter("diametro");
        String DIST_ESTRELLA = request.getParameter("dist_estrella");
        String SATELITES = request.getParameter("satelites");
        String TIPO = request.getParameter("tipo");
        String MASA = request.getParameter("masa");
        String ENANO = request.getParameter("enano");
        String VERIFICADO = request.getParameter("verificado");
        
         
        InputStream inputStream = null; // input stream of the upload file
         
        // obtains the upload file part in this multipart request
        Part filePart = request.getPart("imagen");
        if (filePart != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
             
            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();
        }
         
        Connection conn = null; // connection to the database
        String message = null;  // message will be sent back to client
         
        try {
            // connects to the database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection(url, user, password);
 
            // constructs SQL statement
            String sql = "INSERT INTO planeta (ID, SISTEMA_ID, NOMBRE, DIAMETRO,"
                    + "DIST_ESTRELLA, SATELITES, TIPO, MASA, ENANO, VERIFICADO,IMAGEN) "
                    + "VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, ID);
            statement.setString(2, SISTEMA_ID);
            statement.setString(3, NOMBRE);
            statement.setString(4, DIAMETRO);
            statement.setString(5, DIST_ESTRELLA);
            statement.setString(6, SATELITES);
            statement.setString(7, TIPO);
            statement.setString(8, MASA);
            statement.setString(9, ENANO);
            statement.setString(10, VERIFICADO);

          if (inputStream != null) {
                // fetches input stream of the upload file for the blob column
                statement.setBlob(11, inputStream);
            }
 
            // sends the statement to the database server
            int row = statement.executeUpdate();
            if (row > 0) {
                message = "File uploaded and saved into database";
            }   
            
        } catch (SQLException ex) {
            message = "ERROR: " + ex.getMessage();
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                // closes the database connection
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            // sets the message in request scope
            request.setAttribute("Message", message);
             
            // forwards to the message page
            getServletContext().getRequestDispatcher("/Message.jsp").forward(request, response);
        }
    }
}