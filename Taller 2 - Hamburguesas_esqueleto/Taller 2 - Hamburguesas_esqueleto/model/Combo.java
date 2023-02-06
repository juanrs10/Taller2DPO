package model;

import java.util.ArrayList;

public class Combo {

    private double descuento; 

    private String nombreCombo; 

    private ArrayList<Producto> itemsCombo;


    public Combo(String nombre, double descuento){

        this.nombreCombo = nombre; 

        this.descuento = descuento; 

    }

    public void agregarItemACombo(Producto itemCombo){

        itemsCombo.add(itemCombo); 
    }

    public int getPrecio(){
        
        int precioCombo = 0; 

        int len = itemsCombo.size(); 

        for (int i  = 0; i<len ; i++){

            precioCombo += itemsCombo.get(i).getPrecio(); 


        }


        int precioFinal = (int) (precioCombo - descuento); 

        return precioFinal; 

    }


    public String generarTextoFactura(){

        String factura = ""; 
        int len = itemsCombo.size(); 

        for (int i  = 0; i<len ; i++){

            factura += itemsCombo.get(i).generarTextoFactura(); 


        }

        return factura; 

    }
    

    public String getNombre(){

        return nombreCombo;
    }
}
