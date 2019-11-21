<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Consulta</title>
    </head>
    <body>
        <center>
            <h1>Consultas:</h1>
            <form method="get" action="consultaServlet" enctype="multipart/form-data">
                <table border="0">
                    <tr>
                        <td>NOMBRE: </td>
                        <td><%=request.getAttribute("NOMBRE_PLANETA")%></td>
                    </tr>
                    <tr>
                        <td>SISTEMA PLANETARIO: </td>
                        <td><%=request.getAttribute("NOMBRE_SISTEMA")%></td>
                    <tr>
                        <td>DISTACIA ESTRELLA: </td>
                        <td><%=request.getAttribute("DIST_ESTRELLA")%></td>
                    </tr>
                    <tr>
                        <td>SATELITES: </td>
                        <td><%=request.getAttribute("SATELITES")%></td>
                    </tr>
                    <tr>
                        <td>TIPO: </td>
                        <td><%=request.getAttribute("TIPO")%></td>
                    </tr>
                    <tr>
                        <td>MASA: </td>
                        <td><%=request.getAttribute("MASA")%></td> 
                    </tr>
                    <tr>
                        <td>DIAMETRO: </td>
                        <td><%=request.getAttribute("DIAMETRO")%></td>
                    </tr>
                    <tr>
                        <td>ENANO: </td>
                        <td><%=request.getAttribute("ENANO")%></td>   
                    </tr>
                    <tr>
                        <td>IMAGEN </td>
                        <td><img src="data:image/jpg;base64,<%=request.getAttribute("IMAGEN")%>" width="42" height="42"/></td>   
                    </tr>
                </table>
            </form>
        </center>
    </body>
</html>