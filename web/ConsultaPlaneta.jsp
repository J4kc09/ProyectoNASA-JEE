<%--
    Document   : ConsultaPlaneta
    Created on : 19-nov-2019, 17:32:40
    Author     : damdm-2019
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Consulta</title>
        <link href="https://fonts.googleapis.com/css?family=Roboto&display=swap" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="estilos.css">
    </head>
    <body>
        <center>
            <h1>Consultas:</h1>
            <font size="5">
                <table border="2">
                    <tr>
                        <td>NOMBRE: </td>
                        <td>${planeta.nombrePlaneta}</td>
                    </tr>
                    <tr>
                        <td>SISTEMA PLANETARIO: </td>
                        <td>${planeta.nombreSistema}</td>
                    <tr>
                        <td>DISTACIA ESTRELLA: </td>
                        <td>${planeta.distEstrella} (millones de km)</td>
                    </tr>
                    <tr>
                        <td>SATELITES: </td>
                        <td>${planeta.satelites}</td>
                    </tr>
                    <tr>
                        <td>TIPO: </td>
                        <td>${planeta.tipo}</td>
                    </tr>
                    <tr>
                        <td>MASA: </td>
                        <td>${planeta.masa} (kg)</td>
                    </tr>
                    <tr>
                        <td>DIAMETRO: </td>
                        <td>${planeta.diametro}(km)</td>
                    </tr>
                    <tr>
                        <td>ENANO: </td>
                        <td>${planeta.enano}</td>  
                    </tr>
                    <tr>
                        <td>IMAGEN </td>
                        <td><img src="/ProyectoNASA-JEE_-_copia/image?id=${planeta.idPlaneta}" width="550" height="400"/></td>  
                    </tr>
                            <a href="http://localhost:8080/ProyectoNASA-JEE_-_copia/">
            <button>Volver a inicio</button>
        </a>
                <a href="http://localhost:8080/ProyectoNASA-JEE_-_copia/Upload.jsp">
            <button>Crea un planeta</button>
        </a>
                </table>
            </font>
        </center>
    </body>
</html>
