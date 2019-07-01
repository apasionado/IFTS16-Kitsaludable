package kitsaludable.sistema;

import java.sql.*;
import java.util.*;
import kitsaludable.componentes.alimentos;

public class fabrica_BBDD {
    
    private Database db = new Database();

    
    public List<alimentos> getAlimentos (String dieta) throws Exception{
        String laDieta = dieta;
        List<alimentos> alm = new ArrayList<>();
        
        Connection miConexion = null;
        PreparedStatement miStatement = null;
        ResultSet miResultSet = null;
        String sql;
        //------Establecer la conexion----
        Class.forName(db.getDriver());
        miConexion=DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
        
        //------Crear la sentencia SQL y statement--------
        
        sql="select nombre_alimentos,calorias,nombre_dietas"
                          + " from alimentos inner join dietas "
                          + "on alimentos.dietas_id = dietas.id_dietas "
                          + "where nombre_dietas = '"+ laDieta +"' ;";
        
        miStatement = miConexion.prepareStatement(sql);
        
        //------Ejecutar esa sentencia SQL-------
         
        miResultSet = miStatement.executeQuery();
        
        //------Recorrer el Resultset--------
        
        while(miResultSet.next()){
           
            String nom_alm = miResultSet.getString("nombre_alimentos");
            int calorias = miResultSet.getInt("calorias");
            String nom_dietas = miResultSet.getString("nombre_dietas");
            
            alimentos temp_alm = new alimentos(nom_alm, calorias, nom_dietas);
            
            alm.add(temp_alm);
        }
        
        return alm;
    }
        
}
