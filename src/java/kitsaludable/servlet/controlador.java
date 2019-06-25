package kitsaludable.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kitsaludable.componentes.alimentos;
import kitsaludable.componentes.listas;
import kitsaludable.sistema.fabrica_BBDD;

public class controlador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    
        String dieta= request.getParameter("selector");
        String boton=request.getParameter("boton");
         if(boton != null){
             
        fabrica_BBDD fb = new fabrica_BBDD();
        List<alimentos> alimentos_delControlador;
        try{
            alimentos_delControlador =  fb.getAlimentos(dieta);
            listas listaDietas  = new listas ();
            listaDietas.setLista(alimentos_delControlador);
            request.setAttribute("lista dietas", alimentos_delControlador);
            request.getRequestDispatcher("/alimentos.jsp").forward(request, response);
            
        }catch(Exception e){
            e.printStackTrace();
        }
         }
         
         }
        
        
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
}
    /*
    private fabrica_BBDD fabricaAlimentos;
  
    @Override
    public void init()throws ServletException{
        super.init(); 
        try{
            fabricaAlimentos= new fabrica_BBDD();
        }catch(Exception e){
            throw new ServletException(e);
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
        //Obtener las lista de alimentos desde fabrica
        List<alimentos> alimentos_delControlador;
        try{
            alimentos_delControlador=fabricaAlimentos.getAlimentos();
        
        //agregar la lista de alimentos al request
        
            request.setAttribute("Lista_Alimentos", alimentos_delControlador);
        //enviar ese request a el jsp
            
            RequestDispatcher miDispatcher=request.getRequestDispatcher("/alimentos.jsp");
            
            miDispatcher.forward(request, response);
            
            }catch(Exception e){
            e.printStackTrace();
        }
    }


}
*/
