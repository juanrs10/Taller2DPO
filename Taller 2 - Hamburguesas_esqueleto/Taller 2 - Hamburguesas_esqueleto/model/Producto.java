package model;

public class Producto {

    private String nombre;
    private int precioBase; 

    public Producto(String nombre, int precioBase){

        this.nombre = nombre; 

        this.precioBase = precioBase; 
    }


    
    public int getPrecio(){

        return precioBase; 
    }

    public String getNombre(){

        return nombre; 


    }

    public String generarTextoFactura(){

        //not ready


    }
}
