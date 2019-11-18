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
        <h1>creación de un planeta:</h1>
        <form method="post" action="uploadServlet" enctype="multipart/form-data">
            <table border="0">

                <tr>
                    <td>SISTEMA ID: </td>
                    <td><input type="text" name="sistema_id" size="50" value="1"/></td>
                </tr>
                <tr>
                    <td>IMAGEN: </td>
                    <td><input type="file" name="imagen" size="50"/></td>
                </tr>
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