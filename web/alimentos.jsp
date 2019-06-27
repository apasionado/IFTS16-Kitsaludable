<%-- 
    Document   : alimentos
    Created on : 18/06/2019, 14:05:47
    Author     : Agustin
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session ="true" %>
<%@ page import="java.util.*, kitsaludable.componentes.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="estilos/estilos.css">
        <title>Alimentos</title>
    </head>
    
    <body>
         
        <header>
            <h1 onclick="location.href='index.html'">KitSaludable</h1>
        </header>
        
        
        <form class="container"  action="controlador.do" method="post"  >
            <select name="selector" multiple>
                <option disable selected>--Seleccione una Dieta--</option>
                <option value ="dieta proteica">dieta proteica</option>
                <option value ="dieta de harinas">dieta de harinas</option>
                <option value ="dieta del limon">dieta del limon</option>
                <option value ="Azucares">Azucares</option>
                <option value ="Vegetariana">Vegetariana</option>
            </select>
             <input  name="boton" type="submit" value="Enviar"/>
        </form>
            <div class ="container">
            <h3>Lista de alimentos de la dieta seleccionada</h3>
           <table class="table table-striped table-bordered table-hover">
                <tr class="success">
                    <th>Alimentos</th>
                    <th>Calorias</th>
                    <th>Descripcion</th>
                </tr>
        <% 
            List<alimentos> losAlimentos = null;
            losAlimentos=(List<alimentos>) request.getAttribute("lista dietas");
            if(losAlimentos != null){
                for(alimentos la : losAlimentos){%>
                <tr>
                    
                    <td><%= la.getNom_alimentos() %></td>
                    <td><%= la.getCalorias() %></td>
                    <td><%= la.getNom_dietas() %></td>
                    
                </tr>
                <% 
            }
            }
               %>
            </table>
        </div>
        
               <jsp:include page="calorias.jsp"></jsp:include>
        
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
    <footer> 
        <br></br>
        <br></br>
    </footer>
</html>

<%-- 
    try{
                // 1. crear conexiónz
                  Connection miConexion= DriverManager.getConnection("jdbc:mysql://localhost:3306/ks", "root", "");

                  // 2. Preparar consulta
                  PreparedStatement miSentencia =miConexion.prepareStatement("select nombre_alimentos,calorias,nombre_dietas"
                          + " from alimentos inner join dietas "
                          + "on alimentos.dietas_id = dietas.id_dietas "
                          + "where nombre_dietas =?;");

                  // 3. Establecer parametros de consulta

                  miSentencia.setString(1, dieta);
                  //4. Ejecutar y correr consulta
                  ResultSet rs = miSentencia.executeQuery();

                  if(rs.absolute(1)) out.println("dieta encontrada");
                  else out.println("no hay dieta");


                }catch(Exception e){
                    out.println("hubo un error");
                }
--%>