package model;
import java.util.ArrayList;
import java.io.File;


public class Restaurante {

    public ArrayList<ProductoMenu> menu; 

    public ArrayList<Ingrediente> ingredientes; 

    public ArrayList<Combo> combos; 

    public Pedido elPedido; 

    public void iniciarPedido(String nombreCliente, String direccionCliente){
        
        final Pedido elPedido = new Pedido(nombreCliente,direccionCliente);
        
        this.elPedido = elPedido; 
    }

    public void cerrarGuardarPedido(){

    }

    public Pedido getPedidoEnCurso(){
        
        return elPedido; 
    }

    public ArrayList<ProductoMenu> getMenuBase(){

        return menu; 

    }

    public ArrayList<Ingrediente> getIngredientes(){

        return ingredientes; 
        
    }

    public void cargarInformacionRestaurante(File archivoIngredientes, File archivoMenu, File archivoCombos){


    }

    private void cargarIngredientes(File archivoIngredientes){


    }

    private void cargarMenu(File archivoMenu){


    }

    private void cargarCombos(File archivoCombos){



    }
}
