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
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta http-equiv="x-ua-compatible" content="i3-edge">
        <!--iconito-->
        <link rel="shortcut icon" type="image/png" href="img/favicon.ico"/>


        <!-- Bootstrap CSS -->
        <link href="css/bootstrap.css" media="all" rel="stylesheet">
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

            <div class ="container bg-dark" >
                
                <h1>Lista de alimentos de la dieta seleccionada</h1>
               <table class="table table-striped table-bordered table-hover">
                    <tr class="success">
                        <th><h2>Alimentos</h2></th>
                        <th><h2>Calorias</h2></th>
                        <th><h2>Descripcion</h2></th>
                    </tr>
            <% 
                List<alimentos> losAlimentos = null;

                losAlimentos=(List<alimentos>) request.getAttribute("lista dietas");
                if(losAlimentos != null){
                    for(alimentos la : losAlimentos){%>
                    <tr>                   
                        <td><h2><%= la.getNom_alimentos() %></h2></td>
                        <td><h2><%= la.getCalorias() %></h2></td>
                        <td><h2><%= la.getNom_dietas() %></h2></td>      
                    </tr>
                    <% 
                    }
                }
            %>
                </table>
            </div>

            <jsp:include page="calorias.jsp"></jsp:include>
            
    <style>
        body{
        background: url(img/alimentos-sanos.jpg) no-repeat center center fixed; 
        
        background-size: cover;}
        header{
            background:#2c3e50;
            text-align: center;
        }
        h1, h2, h3{
            margin: 0px;}
        h1{
            color:#fff;
            font-size: 40px;
            margin: 0px;
            padding: 10px 0;
            text-align: center;}
        h2{
            color:#fff;
            font-size: 20px;
            margin: 0px;}
        h3{
            color:#2c3e50;
            font-size: 20px;
            margin: 0px;}   
    </style>
    
    <!--Bootstrap CSS -->
    <script src="js/jquery/jquery-3.4.1.min.js"></script>
    <script src="js/jquery/jquery-3.4.1.slim.min.js"></script>
    <script src="js/popper/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script></body>
    
    <footer> 
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