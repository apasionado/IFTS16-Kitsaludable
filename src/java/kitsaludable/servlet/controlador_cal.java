package kitsaludable.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kitsaludable.componentes.alimentos;
import kitsaludable.componentes.listas;

@WebServlet(name = "controlador_cal", urlPatterns = {"/controlador_cal"})
public class controlador_cal extends HttpServlet {
        
    private listas listaDietas;
        

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
        /*
        Esta clase tiene el fin de filtrar: las listas existentes por las calorias pedidas. Lo unico que hace es: de la lista existente, excluir las dietas que tengan más de las
        calorias pedidas
        
        habria que: para poder filtrar las calorias, como no se puede pasar de un servlet a otro servlet, pasamos del servlet controlador a una clase que maneje
        las listas, le haga el amor con un buen filtro de calorias en base a las calorias que ya existen, y se la pase en una variable a este servlet
        
        */
        /*
         
         String calorias = request.getParameter("select");
         String boton2 = request.getParameter("boton2");
         List<alimentos> listaCalorias = new ArrayList<>();
         try{
         if(boton2 != null){
             int cal = (int)Integer.parseInt(calorias);
             
             

             }
             request.setAttribute("lista calorias", listaCalorias);
             request.getRequestDispatcher("/calorias.jsp").forward(request, response);
            
         
         }
         }
         catch(Exception e){
                 e.printStackTrace();
                 }*/
         }
}