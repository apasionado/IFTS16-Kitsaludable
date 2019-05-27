package kitsaludable.sistema;

import kitsaludable.componentes.alimentos;
import java.util.ArrayList;
import java.util.Scanner;
import kitsaludable.componentes.dietas;


public class fabrica {
        /*Creo lista alimentos como atributo
        .la lista de dietas va ir dentro de cada uno de los alimentos, seran muchas
        .la lista de alimentos sera una */
    
    private ArrayList<alimentos> listaDeAlimentos = new ArrayList();
    
        //creo las 3 dietas que va a tener esta app
        private dietas dietaLimon = new dietas ("Dieta del limon");
        private dietas dietaHarinas = new dietas("Dieta de harinas");
        private dietas dietaProteica = new dietas("Dietas proteica");
    
    public fabrica(){
        
        //ensalada
        ArrayList<dietas> L_D_n1= new ArrayList<dietas>();
        listaDeAlimentos.add(new alimentos("ensalada",150, L_D_n1));
        L_D_n1.add(dietaLimon);
        L_D_n1.add(dietaHarinas);
        L_D_n1.add(dietaProteica);
        
        //asado
        ArrayList<dietas> L_D_n2= new ArrayList<dietas>();
        listaDeAlimentos.add(new alimentos("asado",1500, L_D_n2));
        L_D_n2.add(dietaProteica);
        
        //milanesa de carne
        ArrayList<dietas> L_D_n3= new ArrayList<dietas>();
        listaDeAlimentos.add(new alimentos("milanesa de carne",310, L_D_n3));
        L_D_n3.add(dietaProteica);
        L_D_n3.add(dietaLimon);
        
        //milanesa de pollo
        ArrayList<dietas> L_D_n4= new ArrayList<dietas>();
        listaDeAlimentos.add(new alimentos("milanesa de pollo", 120, L_D_n4));
        L_D_n4.add(dietaProteica);
        L_D_n4.add(dietaLimon);
        
        //pastas
        ArrayList<dietas> L_D_n5= new ArrayList<dietas>();
        listaDeAlimentos.add(new alimentos("pastas", 130, L_D_n5));
        L_D_n5.add(dietaLimon);
        L_D_n5.add(dietaHarinas);
        
        //frutas
        ArrayList<dietas> L_D_n6= new ArrayList<dietas>();
        listaDeAlimentos.add(new alimentos("frutas", 130, L_D_n6));
        L_D_n6.add(dietaLimon);
        L_D_n6.add(dietaHarinas);
        
        //desayuno completo
        ArrayList<dietas> L_D_n7= new ArrayList<dietas>();
        listaDeAlimentos.add(new alimentos("desayuno completo", 300, L_D_n7));
        L_D_n7.add(dietaHarinas);
        L_D_n7.add(dietaProteica);
        
        //hamburguesa big mac completa la que te gusta a vos gordo (baba
        ArrayList<dietas> L_D_n8= new ArrayList<dietas>();
        listaDeAlimentos.add(new alimentos("hamburguesa", 600, L_D_n8));
        L_D_n8.add(dietaHarinas);
        L_D_n8.add(dietaProteica);
        
        //alfajor
        ArrayList<dietas> L_D_n9= new ArrayList<dietas>();
        listaDeAlimentos.add(new alimentos("alfajor", 300, L_D_n9));
        L_D_n9.add(dietaHarinas);
        L_D_n9.add(dietaLimon);
        
        //pizza
        ArrayList<dietas> L_D_n10= new ArrayList<dietas>();
        listaDeAlimentos.add(new alimentos("pizza", 250, L_D_n9));
        L_D_n10.add(dietaLimon);
        L_D_n10.add(dietaHarinas);
        
    }
    //el menu de navegacion, solo imprime en pantalla
    public void Precentacion (){
        System.out.println("\nBienvenido a KitSaludable!\t\n"
                +"-----------------------------------------------------\t\n"
                +"Ingrese el nuemero de la dieta que quiere seguir:\t\n"
                +"\n"
                +"1.Dieta del limon\t\n"
                +"2.Dieta de harinas \t\n"
                +"3.Dieta proteica\t\n"
                +"4.Salir del programa");
    }
    //este es el back-end del menu de navegacion donde ira llamando a los metodo que estan debajo de este.
    public void Opciones (){
        
        Scanner sc = new Scanner(System.in);
        int numeros = sc.nextInt();
        //despues de nextInt se agrega un nextLine para que no quede colgado
        sc.nextLine();
        
        switch (numeros){
            case 1:
                System.out.println("\n-------Has elegido la dieta del limon------- \n");
                CorredorDeListaDeAlimentos_BuscaDieta(dietaLimon.getNombreDieta());
                ImprimeLista_alterna();
                System.out.println("\n------------------------------------------------------\n");
                System.out.println("Ingrese la cantidad de calorias que desea consumir: ");
                int caloriasDeseadas = sc.nextInt();
                System.out.println("Lista de comidas que puedes comer: \n");
                CorrederDeListaAlterna(caloriasDeseadas);
                break;
            case 2:
                System.err.println("Has elegido la dieta de la harina: ");
                CorredorDeListaDeAlimentos_BuscaDieta(dietaHarinas.getNombreDieta());
                ImprimeLista_alterna();
                System.out.println("\n------------------------------------------------------\n");
                System.out.println("Ingrese la cantidad de calorias que desea consumir: ");
                int caloriasDeseadas1 = sc.nextInt();
                System.out.println("Lista de comidas que puedes comer: \n");
                CorrederDeListaAlterna(caloriasDeseadas1);
                break;
            case 3:
                System.out.println("Has elegido la dieta proteica: ");
                CorredorDeListaDeAlimentos_BuscaDieta(dietaProteica.getNombreDieta());
                ImprimeLista_alterna();
                System.out.println("\n------------------------------------------------------\n");
                System.out.println("Ingrese la cantidad de calorias que desea consumir: ");
                int caloriasDeseadas2 = sc.nextInt();
                System.out.println("Lista de comidas que puedes comer: \n");
                CorrederDeListaAlterna(caloriasDeseadas2);
                break;
            case 4:
                System.out.println("Fin del programa");
                default:break;
        } 
    }
    //creo como atributo una lista alterna donde volcare el resultado del metodo "CorredorDeListasDeAlimentos_BuscaDieta"
    private ArrayList<alimentos> listaAlterna = new ArrayList();
    
    public void CorredorDeListaDeAlimentos_BuscaDieta (String c){
        for (int i = 0; i < 10; i++) {
            /*un for que recorre la lista de alimentos
            agarramos un alimento y vamos al metodo de la clase alimentos.corredorListaDietas
            este devuelve un true si la dieta esta en ella
            y si es un true lo guarda en la lista alterna
            sino pasa al siguiente alimento*/
            if(listaDeAlimentos.get(i).corredorListaDietas(c)==true){
                listaAlterna.add(listaDeAlimentos.get(i));
            }
            }
        
    }
    //imprime el nombre de alimentos de tal dieta
    public void ImprimeLista_alterna (){
         for(int j=0; j < listaAlterna.size(); j++){
         System.out.println("Estas son las comidas de tal dieta: "+listaAlterna.get(j).getNombre());
         }
    }
    //este se emplica solo, si la comida es menor o igual a las calorias ingresadas imprime
    public void CorrederDeListaAlterna (int caloriasDeseadas){
        for (int i = 0; i < listaAlterna.size(); i++) {
            if(listaAlterna.get(i).getCalorias() <= caloriasDeseadas){
                System.out.println(listaAlterna.get(i).getNombre());
            }
        }
    }
}
