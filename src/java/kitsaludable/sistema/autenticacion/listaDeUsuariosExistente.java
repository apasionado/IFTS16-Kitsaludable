/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kitsaludable.sistema.autenticacion;

/**
 *
 * @author Heresy
 */
public class listaDeUsuariosExistente {
    
    /*Un usuario existente es un usuario que ya existe y esta en la base de datos 
    En la mayoria de las clases deberás encontrarlo como "u"
    */
    
    /*Estos son los atributos que tiene un usuario, deberán obtenerse de la base
    de de datos y deberán coincidir con una fila existente
    */
    
    protected boolean resultado;
    String nombre;
    String contrasenia;
    boolean enLinea;
    
    public boolean estaEnLinea(){
        //esta clase define que un usuario está en linea. utilizarla para decir que alguien esta en linea
        enLinea = true;
        return enLinea;
    }
    
    /*hay dos formas de consultar por un usuario en la bdd, una devuelve un String
    y otra devuelve un V o F, ambas funcionan de la misma manera
    */
    
    public String consultarUsuarioExistenteEnLaListaDeLaBdd(){
        String resultado;
        
        if(!(nombre.isEmpty())){
            //TO-DO Obtener contrasenia
            return "Existe";
        }else{
            resultado = "No existe";
         return resultado;  
        }
    }
    
    public boolean existeUsuarioEnLaBdd(){

        
        if(!(nombre.isEmpty())){
            //TO-DO Obtener contrasenia
            return resultado = true;
        }else{
         return resultado = false;  
        }        
    }
    
    public boolean agregarUsuario(){
        
        if(!(nombre.isEmpty())){
            //TO-DO Obtener contrasenia
            return resultado = true;
        }else{
         return resultado = false;
        }        
    }
    
    public boolean quitarUsuario(){
        if(!(nombre.isEmpty())){
            //TO-DO Obtener contrasenia
            return resultado = true;
        }else{
         return resultado = false;
        }     
    }
}
