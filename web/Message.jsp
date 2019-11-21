<%-- 
    Document   : Message
    Created on : 17-nov-2019, 18:11:55
    Author     : acarr
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="https://fonts.googleapis.com/css?family=Roboto&display=swap" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="estilos.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Message</title>
</head>
<body>
    <center>
        <div>
        <h3><%=request.getAttribute("Message")%></h3>
        <a href="http://localhost:8080/ProyectoNASA-JEE_-_copia/">
            <button>Volver a inicio</button>
        </a>
                <a href="http://localhost:8080/ProyectoNASA-JEE_-_copia/Upload.jsp">
            <button>Crea otro planeta</button>
        </a>
        </div>
    </center>
</body>
</html>
