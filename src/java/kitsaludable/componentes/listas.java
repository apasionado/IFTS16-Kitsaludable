package kitsaludable.componentes;

import java.util.List;

public class listas {

    private List<alimentos> lista;

    public listas(List<alimentos> lista) {
        this.lista = lista;
    }

    public listas() {
    }
    
    

    public List<alimentos> getLista() {
        return lista;
    }

    public void setLista(List<alimentos> lista) {
        this.lista = lista;
    }
    
    
}
