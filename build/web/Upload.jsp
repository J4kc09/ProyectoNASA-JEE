<%-- 
    Document   : upload.jsp
    Created on : 17-nov-2019, 18:09:20
    Author     : acarr
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File Upload to Database Demo</title>
</head>
<body>
    <center>
<<<<<<< Updated upstream
        <h1>creaci�n de un planeta:</h1>
        <form method="post" action="uploadServlet" enctype="multipart/form-data">
            <table border="0">

                <tr>
                    <td>SISTEMA ID: </td>
                    <td><input type="text" name="sistema_id" size="50" value="1"/></td>
                </tr>
=======
        <h1>Crea un planeta nuevo:</h1>
        <form method="post" action="uploadServlet" enctype="multipart/form-data">
            <table border="0">
>>>>>>> Stashed changes
                <tr>
                    <td>IMAGEN: </td>
                    <td><input type="file" name="imagen" size="50"/></td>
                </tr>
<<<<<<< Updated upstream
                                <tr>
                    <td>NOMBRE: </td>
                    <td><input type="text" name="nombre" size="50"/></td>
                </tr>
                                <tr>
                    <td>DIAMETRO: </td>
                    <td><input type="text" name="diametro" size="50"/></td>
                </tr>
                                <tr>
                    <td>DISTACIA ESTRELLA: </td>
                    <td><input type="text" name="dist_estrella" size="50"/></td>
                </tr>
                                <tr>
                    <td>SATELITES: </td>
                    <td><input type="text" name="satelites" size="50"/></td>
                </tr>
                                <tr>
                    <td>TIPO: </td>
                    <td><input type="text" name="tipo" size="50"/></td>
                </tr>
                                <tr>
                    <td>MASA: </td>
                    <td><input type="text" name="masa" size="50"/></td>
                </tr>
                                <tr>
                    <td>ENANO: </td>
                    <td><input type="text" name="enano" size="50"/></td>
                </tr>
                                <tr>
                    <td>VERIFICADO: </td>
                    <td><input type="text" name="verificado" size="50"/></td>
=======
                <tr>
                    <td>NOMBRE: </td>
                    <td><input type="text" placeholder="Tierra" name="nombre_planeta" size="25"/></td>
                </tr>
                <tr>
                    <td>SISTEMA PLANETARIO: </td>
                    <td>
                        <select name="nombre_sistema">
                            <option disabled selected value>Otro</option>
                            <option value="Sistema Solar">Sistema Solar</option> 
                            <option value="Alfa Centauri">Alfa Centauri</option>
                            <option value="Alfa Centauri">Epsilon Eridani</option>
                            <option value="Alfa Centauri">Epsilon Indi</option>
                            <option value="Alfa Centauri">Gliese 674</option>
                        </select>
                        <input type="text" placeholder="Sistema Solar" name="nombre_sistema" size="25"/>
                    </td>
                <tr>
                    <td>DISTACIA ESTRELLA: </td>
                    <td><input type="text" placeholder="150" name="dist_estrella" size="25"/> (millones de km)</td>
                </tr>
                <tr>
                    <td>SATELITES: </td>
                    <td><input type="text" placeholder="1" name="satelites" size="25"/></td>
                </tr>
                <tr>
                    <td>TIPO: </td>
                    <td>
                        <select name="tipo">
                            <option value="Rocoso">Rocoso</option> 
                            <option value="Gaseoso">Gaseoso</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>MASA: </td>
                    <td><input type="text" placeholder="5,972 � 10^24" name="masa" size="25"/> (kg)</td> 
                </tr>
                <tr>
                    <td>DIAMETRO: </td>
                    <td><input type="text" placeholder="12.756" name="diametro" size="25"/> (km)</td>
                </tr>
                <tr>
                    <td>ENANO: </td>
                    <td>
                        Si<input type="radio" name="enano" value="1"/>
                        No<input type="radio" name="enano" value="0"/>
                    </td>   
>>>>>>> Stashed changes
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Guardar">
                    </td>
                </tr>
            </table>
        </form>
    </center>
</body>
</html>