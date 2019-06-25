package kitsaludable.componentes;


public class alimentos {
    
    private String nom_alimentos;
    private int calorias;
    private String nom_dietas;
    
    
    public alimentos (String nom_alm,int cal, String nom_diet){
        this.nom_alimentos = nom_alm;
        this.calorias = cal;
        this.nom_dietas = nom_diet;
    }

    public String getNom_alimentos() {
        return nom_alimentos;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public String getNom_dietas() {
        return nom_dietas;
    }

    public void setNom_dietas(String nom_dietas) {
        this.nom_dietas = nom_dietas;
    }

    @Override
    public String toString() {
        return "alimentos{" + "nom_alimentos=" + nom_alimentos + ", calorias=" + calorias + ", nom_dietas=" + nom_dietas + '}';
    }

    
}
