package kitsaludable.componentes;

import java.util.List;

public class alimentos {
    
    private String nombre;
    private int calorias;
    // alimentos contiene una lista de dietas como atributo
    private List<dietas> listaDietas;
    
    
    public alimentos (String nom,int cal, List<dietas> ld){
        this.nombre = nom;
        this.calorias = cal;
        this.listaDietas = ld;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public void setListaDietas(List<dietas> listaDietas) {
        this.listaDietas = listaDietas;
    }

    public List<dietas> getListaDietas() {
        return listaDietas;
    }
    /*este es una funsion que al recorrerla con el FOR y un IF comprueba si dentro de la lista de dieta se encuenta el nombre
    de la dieta elegida, si esta devuelve un true sino un false*/
    

    public boolean corredorListaDietas(String nombreDieta) {
        for (int j = 0; j < listaDietas.size(); j++) {
            if(listaDietas.get(j).getNombreDieta().equalsIgnoreCase(nombreDieta)){
               return true;
            }
        } 
        return false;
    }
    
}
