package model;
import java.util.ArrayList;
import java.util.List;

import javax.print.event.PrintEvent;

import model.Producto; 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.nio.charset.StandardCharsets;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Pedido {

    private String nombreCliente;
    private String dirCliente;
    private int cantidadPedidos;
    private int idPedido;
    private ArrayList<Producto> productos = new ArrayList<Producto>();


    public Pedido(String nombreCliente, String dirCliente){

        this.nombreCliente = nombreCliente;
        this.dirCliente = dirCliente;
        
    }

    public int getIdPedido(){

        return idPedido;
    }

    public ArrayList<Producto> getProductos(){

        return productos;
    }

    public void agregarProducto(Producto nuevoItem){
        productos.add(nuevoItem); 
    }


    private int getPrecioNetoPedido(){

        int totalPedido = 0; 

        int len = productos.size(); 

        for (int i  = 0; i<len ; i++){

            totalPedido += productos.get(i).getPrecio(); 

        
        }

        int totalPedidoCast = (int)(totalPedido); 


        return totalPedidoCast;


    }

    private int getPrecioTotalPedido(){

        return getPrecioNetoPedido(); 
    }

    private int getPrecioIvaPedido(){

        return (int) (getPrecioNetoPedido()*0.19); 
    }

    private String generarTextoFactura(){

        String textoFactura = "Id pedido: "+Integer.toString(getIdPedido())+"\n"+"Nombre: "+nombreCliente+"\n"+"Dirección: "+dirCliente+"\n";

        int len = productos.size(); 

        for (int i  = 0; i<len ; i++){

            textoFactura += productos.get(i).generarTextoFactura();
            textoFactura += "\n";
        }

        textoFactura+="Neto: "+Integer.toString(getPrecioNetoPedido())+"\n";
        textoFactura+="IVA: "+Integer.toString(getPrecioIvaPedido())+"\n";
        textoFactura+="Total a pagar: "+Integer.toString(getPrecioNetoPedido()+getPrecioIvaPedido());


        System.out.println(textoFactura);


        return textoFactura;



    }

    public void guardarFactura(String archivo){

        
        String texto = generarTextoFactura();

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("Facturas.txt"));
            writer.write(texto);
            writer.close();
        }

        catch (IOException e){

            System.out.println(e);
        }

    }





    
}
