<%-- 
    Document   : listarDistrito
    Created on : 21/09/2015, 05:10:49 PM
    Author     : admin-david.orrego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Distrito" %>
<jsp:useBean id="list1" scope="session" class="java.util.ArrayList"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="../../WEB-INF/segmentos/top.jspf" %>
    </head>
    <body>
        <%@include file="../../WEB-INF/segmentos/header.jspf" %>
        <div class="table-responsive">
            <a href="<%= request.getContextPath()%>/dc?op=2" class="btn btn-mini btn-primary" role="button">Nuevo</a>
            <hr>
            <table class="table table-bordered" style="width: 800px;">
                <tr>
                    <th>Iddistrito</th>
                    <th>IdRegion</th>
                    <th>Distrito</th>
                    <th></th>
                </tr>
                <% for(int i=0; i<list1.size();i++){
                    Distrito distrito = new Distrito();
                    distrito = (Distrito)list1.get(i);
                    %>
                <tr>
                    <td><%= distrito.getIdd()%></td>
                    <td><%= distrito.getIdr()%></td>
                    <td><%= distrito.getDistrito()%></td>
                    <td>
                        <a href="dc?op=3&id=<%= distrito.getIdd()%>" class="btn btn-mini btn-primary" role="button">Editar</a>
                        <a href="dc?op=4&id=<%= distrito.getIdd()%>" class="btn btn-mini btn-primary" role="button">Eliminar</a>
                    </td>
                </tr>
                <%}%>
            </table>
        </div>
        <%@include file="../../WEB-INF/segmentos/footer.jspf" %>
    </body>
</html>
