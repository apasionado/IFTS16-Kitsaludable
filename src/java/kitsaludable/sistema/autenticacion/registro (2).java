/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kitsaludable.sistema.autenticacion;

import java.util.Scanner;



/**
 *
 * @author Heresy
 */
public class registro {
    
    Scanner in = new Scanner(System.in);
    
    String usuario;
    String contrasenia;
    String nuevoUsuario;
    String nuevaContrasenia;
    
    public void registro(){
    this.ingresarUsuario();
    this.ingresarContrasenia();
    
    //ingresarabase(
    
    System.out.println("Registro completado");
}
    
    
    public void ingresarUsuario(){
    System.out.println("Por favor, ingrese una usuario");    
    if(!usuario.isEmpty()){
        usuario = in.nextLine();
        System.out.println("Su nuevo usuario es" + usuario);
        nuevoUsuario = usuario;
    }
    }
    public void ingresarContrasenia(){
    System.out.println("Por favor, ingrese una contrasenia mayor a 2 y menor a 10 digitos");
    contrasenia = in.nextLine();
    if(contrasenia.length() >= 3 && contrasenia.length() <= 10){
        
        System.out.println("Contrasenia valida!");
        
        nuevaContrasenia = contrasenia;
    }
}
    
}
