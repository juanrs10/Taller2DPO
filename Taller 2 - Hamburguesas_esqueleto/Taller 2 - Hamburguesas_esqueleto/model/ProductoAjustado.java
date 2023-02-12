package model; 

import java.util.ArrayList;


public class ProductoAjustado implements Producto{

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

    @Override

    public String getNombre(){

        return nombre; 

    }

    @Override

    public int getPrecio(){

        return precioAjustado; 
    }

    @Override
    public String generarTextoFactura(){

        String textoFactura = nombre + ": " + Integer.toString(precioAjustado);

        return textoFactura;

    }



}