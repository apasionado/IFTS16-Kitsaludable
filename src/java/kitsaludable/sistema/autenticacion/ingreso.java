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
public class ingreso {
    
    public boolean usuarioActivo;
    
    public void ingresoDelUsuario(){
        
        login login = new login();
        registro registro = new registro();

        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Utilice un numero para continuar");
        
        System.out.println("1 - Ingreso al sistema");
        System.out.println("2 - No tenes usuario? Registrate");
        
        int Opciones = in.nextInt();
        in.nextLine();
        
        switch (Opciones){
        case 1:
            login.ingreso();
            break;
        case 2:
            registro.ingresarUsuario();
            registro.ingresarContrasenia();
            break;
        case 3:
            System.out.println("Ingrese una de las opciones anteriores para continuar");
        default:ingresoDelUsuario();
    }
        
    }

    
}
