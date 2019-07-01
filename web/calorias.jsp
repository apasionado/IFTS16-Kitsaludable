<%-- 
    Document   : calorias.jsp
    Created on : 24/06/2019, 05:45:22
    Author     : Agustin
--%>

<%@page import="java.util.List"%>
<%@page import="kitsaludable.componentes.alimentos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form class="container" action="controlador_calorias.do" method="post">
            <h3 class="container-fluid">Cantidad de calorias</h3>
                 <select name="select" multiple>
                     <option value ="" disable selected>--Seleccione una Calorias--</option>
                     <option value ="100">100</option>
                     <option value ="200">200</option>
                     <option value ="300">300</option>
                     <option value ="400">400</option>
                     <option value ="500">500</option>
                 </select>
            <input  name="boton1" type="submit" value="Enviar"/>
                 </form>
       
        <div class ="container bg-dark">
            <h1>Lista de alimentos con las calorias determinadas</h1> 
            <table class="table table-striped table-bordered table-hover">
                <tr class="success">
                    <th><h2>Alimentos</h2></th>
                    <th><h2>Calorias</h2></th>
                    <th><h2>Descripcion</h2></th>
                </tr>
                 <% 
                     List<alimentos> listaCalorias = null;
                     listaCalorias= (List<alimentos>)request.getAttribute("lista calorias");
                if(listaCalorias != null){
                for(alimentos lc: listaCalorias){%>
                <tr>
                    <td><h2><%= lc.getNom_alimentos() %></h2></td>
                    <td><h2><%= lc.getCalorias() %></h2></td>
                    <td><h2><%= lc.getNom_dietas() %></h2></td>
                    <td>-</td>
                </tr>
                <% 
            }
            }
               %>
            </table>
        </div>

    </body>
</html>
