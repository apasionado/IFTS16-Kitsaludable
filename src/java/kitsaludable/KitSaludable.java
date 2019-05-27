package kitsaludable;

import kitsaludable.sistema.autenticacion.ingreso;
import kitsaludable.sistema.fabrica;

public class KitSaludable {

    public static void main(String[] args) {
        
        
        ingreso inicioDelPrograma = new ingreso();
        
        fabrica laFabrica = new fabrica();

        System.out.println("Kit Saludable");
        inicioDelPrograma.ingresoDelUsuario();
        
        
        laFabrica.Precentacion();
        laFabrica.Opciones();
        }

        

        
        /*el programa te da 4 opciones donde 3 son dietas
        elegis una
        luego te pedira las calorias, recomiendo ingresar 0-1500 de igual manera fijarse en fabrica
        no busquen el pelo al huevo porque puse 10 alimentos asi nomas con calorias asi nomas, este programa sirve 
        -para ver como recorrer las listas (Que la idea es que sean listas de BBDD)
        -para tener una idea conceptual del back-end
        -y para plantear una idea*/
}

