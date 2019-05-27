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
public class login {
    
    ingreso sesion = new ingreso();
    Scanner in = new Scanner(System.in);
    
    //la idea sería que usuario y contrasenia sean los datos que se ingresan para entrar
    // y que usuario existente y contrasenia existente sean para coincidir si están en la base o no
    private String usuario;
    private String contrasenia;
    
    String usuarioExistente;
    String contraseniaExistente;
    
    
    public void ingreso(){
        System.out.println("Ingrese su usuario");
        usuarioExistente = in.nextLine();
        if(usuarioExistente.equals(usuario)){
            System.out.println("Ingrese su contrasenia");
            contraseniaExistente = in.nextLine();
            if(contraseniaExistente.equals(contrasenia)){
                System.out.println("Ingreso exitosamente");
                sesion.usuarioActivo = true;
            }
        }  
    }
    
    
    
}
