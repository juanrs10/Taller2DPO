package model; 

import java.util.ArrayList;


public class ProductoAjustado{

    private String nombre; 

    private int precioAjustado; 

    private ArrayList<Ingrediente> agregados; 

    private ArrayList<Ingrediente> eliminados; 

    public ProductoAjustado(ProductoMenu base, ArrayList<Ingrediente> eliminados, ArrayList<Ingrediente> agregados){

        this.nombre = base.getNombre(); 

        this.agregados = agregados; 

        this.eliminados = eliminados; 

        int totalAgregados = 0;

        int len = agregados.size(); 

        for (int i  = 0; i<len ; i++){

            totalAgregados += agregados.get(i).getCostoAdicional(); 

        
        }

        this.precioAjustado = base.getPrecio()+totalAgregados;
        
        
    }

    public String getNombre(){

        return nombre; 

    }

    public int getPrecio(){

        return precioAjustado; 
    }

    public String generarTextoFactura(){

        //not ready

    }



}