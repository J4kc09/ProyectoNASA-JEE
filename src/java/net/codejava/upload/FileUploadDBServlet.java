package net.codejava.upload;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import javax.ejb.EJB;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import net.codejava.facade.PlanetaEditableFacade;
import net.codejava.modelo.PlanetaEditable;
import org.apache.commons.io.IOUtils;

@WebServlet("/uploadServlet")
@MultipartConfig(maxFileSize = 16177215)    // upload file's size up to 16MB
public class FileUploadDBServlet extends HttpServlet {

    @EJB
    private PlanetaEditableFacade planetaEditableFacade;

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // gets values of text fields
        String ID_PLANETA = request.getParameter("id_planeta");
        String NOMBRE_SISTEMA = request.getParameter("nombre_sistema");
        String IMAGEN = request.getParameter("imagen");
        String NOMBRE_PLANETA = request.getParameter("nombre_planeta");
        String DIAMETRO = request.getParameter("diametro");
        String DIST_ESTRELLA = request.getParameter("dist_estrella");
        String SATELITES = request.getParameter("satelites");
        String TIPO = request.getParameter("tipo");
        String MASA = request.getParameter("masa");
        String ENANO = request.getParameter("enano");
        String VERIFICADO = request.getParameter("verificado");
        String message = "¡El planeta se ha creado con éxito!";
        try { 
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


        byte[] fileAsByteArray = IOUtils.toByteArray(inputStream);
        
        int diametro = (DIAMETRO !=null) ? Integer.parseInt(DIAMETRO):null;
        int distEstrella = Integer.parseInt(DIST_ESTRELLA);
        int satelites = Integer.parseInt(SATELITES);
        boolean enano = Boolean.parseBoolean(ENANO);
        
        PlanetaEditable editable = new PlanetaEditable((long)500, NOMBRE_SISTEMA, NOMBRE_PLANETA, diametro, distEstrella, satelites, TIPO, MASA,enano);
        editable.setImagen(fileAsByteArray);
        
        planetaEditableFacade.create(editable);
        
        // sets the message in request scope
        }catch(Exception err) {
            message = "ERROR: El planeta introducido ya existe o ha introducido caracteres erróneos.";
        }
         request.setAttribute("Message", message);
                
        // forwards to the message page
        getServletContext().getRequestDispatcher("/Message.jsp").forward(request, response);
    }
}
