package model;
import java.util.ArrayList;
import java.util.List;
import model.Producto; 
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.nio.charset.StandardCharsets;

public class Pedido {

    private String nombreCliente;
    private String dirCliente;
    private int cantidadPedidos;
    private int idPedido;
    private ArrayList<Producto> productos;


    public Pedido(String nombreCliente, String dirCliente){

        this.nombreCliente = nombreCliente;
        this.dirCliente = dirCliente;
        
    }

    public int getIdPedido(){

        return idPedido;
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

        String textoFactura = Integer.toString(getIdPedido())+"\n";

        int len = productos.size(); 

        for (int i  = 0; i<len ; i++){

            textoFactura += productos.get(i).getNombre();
            textoFactura += "             ";
            textoFactura += productos.get(i).getPrecio();
            textoFactura += "\n";


        }

        textoFactura+="Neto: "+Integer.toString(getPrecioNetoPedido())+"\n";
        textoFactura+="IVA: "+Integer.toString(getPrecioIvaPedido())+"\n";
        textoFactura+="Total a pagar: "+Integer.toString(getPrecioNetoPedido()+getPrecioIvaPedido());


        return textoFactura;



    }

    public void guardarFactura(String archivo){

        /*
        String texto = generarTextoFactura();
        Files.writeString(archivo,texto,StandardCharsets.UTF_8,StandardOpenOption.APPEND);

         */
    }





    
}
