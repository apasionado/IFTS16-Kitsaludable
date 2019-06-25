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
         
         String calorias = request.getParameter("select");
         String boton2 = request.getParameter("boton2");
         List<alimentos> listaCalorias = new ArrayList<>();
         try{
         if(boton2 != null){
             int cal = (int)Integer.parseInt(calorias);
             for(alimentos ld: listaDietas.getLista()){
                 if(ld.getCalorias() <= cal){
                     listaCalorias.add(ld);
                 }
             }
             request.setAttribute("lista calorias", listaCalorias);
             request.getRequestDispatcher("/calorias.jsp").forward(request, response);
            
         
         }
         }
         catch(Exception e){
                 e.printStackTrace();
                 }
         }
}