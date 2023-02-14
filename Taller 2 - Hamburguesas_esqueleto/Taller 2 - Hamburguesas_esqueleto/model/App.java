package model;
import java.lang.Boolean;
import java.lang.InterruptedException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
/*
 * 
 * PENDING
 * 
 * READ FILES WITH INFO AND GENERATE DE PRODUCTS WITH IT
 * 
 * VERIFY ALL CLASES AND THE CONECTIONS IN THE UML
 * 
 * GENERATE BILL IN THE TXT FILE
 */
public class App {

    public void ejecutarAplicacion()
	{
		System.out.println("Bienvenido al restaurante <name> \n");
		boolean continuar = true;
		File fileMenu = new File("../menu.txt");
		File fileIngredientes = new File("../ingredientes.txt");
		File fileCombos = new File("../combos.txt");


		//RESTAURANTE LOAD
		Restaurante restaurante = new Restaurante();
		restaurante.cargarInformacionRestaurante(fileIngredientes, fileMenu, fileCombos);

		Pedido pedido = new Pedido("na", "na");
		Scanner scanner = new Scanner(System.in);		

		while (continuar)
		{
			try
			{	
				mostrarOpciones();
				int opcion_seleccionada1 = Integer.parseInt(scanner.nextLine());

				if (opcion_seleccionada1 == 1){

					System.out.println("\nEste es nuestro menu: \n");
					mostrarMenu();

				}

				else if (opcion_seleccionada1 == 2){

					//CREDENTIALS CLIENT 

					System.out.println("Ingrese su nombre");
					String nombreCliente = scanner.nextLine();
					System.out.println("Ingrese su dirección");
					String dirCliente = scanner.nextLine();


					//PEDIDO INSTANCIATION

					restaurante.iniciarPedido(nombreCliente,dirCliente);

					pedido = restaurante.getPedidoEnCurso();

				}

				else if (opcion_seleccionada1 == 3){
					
					System.out.println("Ingrese el producto que desea agregar: ");

					int opcion_seleccionada = Integer.parseInt(scanner.nextLine());

					try{

						if (opcion_seleccionada == 1){

							Producto corral = new ProductoMenu("Corral", 14000);
	
							pedido.agregarProducto(corral);
						}
						else if (opcion_seleccionada == 2){
							Producto corral = new ProductoMenu("Corral queso", 16000);
	
							pedido.agregarProducto(corral);
						}
						else if (opcion_seleccionada == 3){
	
							Producto corral = new ProductoMenu("Corral pollo", 15000);
	
							pedido.agregarProducto(corral);
						}
						else if (opcion_seleccionada == 4){
	
							Producto corral = new ProductoMenu("Corralita", 13000);
	
							pedido.agregarProducto(corral);
						}
						else if (opcion_seleccionada == 5){
	
							Producto corral = new ProductoMenu("todoterreno", 16000);
	
							pedido.agregarProducto(corral);
						}
						else if (opcion_seleccionada == 6){
	
							Producto corral = new ProductoMenu("1/2 libra", 25000);
	
							pedido.agregarProducto(corral);
						}
						else if (opcion_seleccionada == 7){
	
							Producto corral = new ProductoMenu("especial", 24000);
	
							pedido.agregarProducto(corral);
						}
						else if (opcion_seleccionada == 8){
	
							Producto corral = new ProductoMenu("casera", 23000);
	
							pedido.agregarProducto(corral);
						}
						else if (opcion_seleccionada == 9){
	
							Producto corral = new ProductoMenu("Mexicana", 22000);
	
							pedido.agregarProducto(corral);
						}
						else if (opcion_seleccionada == 10){
	
							Producto corral = new ProductoMenu("Criolla", 22000);
	
							pedido.agregarProducto(corral);
						}
						else if (opcion_seleccionada == 11){
	
							Producto corral = new ProductoMenu("Costeña", 20000);
	
							pedido.agregarProducto(corral);
						}
						else if (opcion_seleccionada == 12){
	
							Producto corral = new ProductoMenu("Hawaiana", 20000);
	
							pedido.agregarProducto(corral);
						}
						else if (opcion_seleccionada == 13){
	
							Producto corral = new ProductoMenu("Wrap de pollo", 15000);
	
							pedido.agregarProducto(corral);
						}
						else if (opcion_seleccionada == 14){
						
							Producto corral = new ProductoMenu("Wrap de lomo", 16000);
	
							pedido.agregarProducto(corral);
						}
	
						else if (opcion_seleccionada == 15){
						
							Producto corral = new ProductoMenu("Ensalada mexicana", 20900);
	
							pedido.agregarProducto(corral);
						}
	
						else if (opcion_seleccionada == 16){
						
							Producto corral = new ProductoMenu("Papas medianas", 5500);
	
							pedido.agregarProducto(corral);
	
						}
	
						else if (opcion_seleccionada == 17){
						
							Producto corral = new ProductoMenu("Papas grandes", 6900);
	
							pedido.agregarProducto(corral);
						}
						else if (opcion_seleccionada == 18){
						
							Producto corral = new ProductoMenu("papas en casco medianas", 5500);
	
							pedido.agregarProducto(corral);
	
						}
						else if (opcion_seleccionada == 19){
						
							Producto corral = new ProductoMenu("Papas en casco grandes", 6900);
	
							pedido.agregarProducto(corral);
						}
						else if (opcion_seleccionada == 20){
						
							Producto corral = new ProductoMenu("Agua cristal sin gas", 5000);
	
							pedido.agregarProducto(corral);
						}
						else if (opcion_seleccionada == 21){
						
							Producto corral = new ProductoMenu("Agua cristal con gas", 5000);
	
							pedido.agregarProducto(corral);
						}
						else
						{
							System.out.println("Por favor seleccione una opción válida.");
						}
	
					}
					catch (NumberFormatException e)
					{
						System.out.println("Debe seleccionar uno de los números de las opciones.");
					}
				}

				else if (opcion_seleccionada1 == 4){

					restaurante.cerrarGuardarPedido();	
					pedido.guardarFactura(null);
					System.out.println("\nProducto cerrado y guardado correctamente\n");
			
				}

				else if (opcion_seleccionada1 == 5){

					//GET PEDIDO POR ID
					continue;
				}

			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}
		scanner.close();
	}



	/**
	 * Muestra al usuario el menú con las opciones para que escoja la siguiente
	 * acción que quiere ejecutar.
	 */

	public boolean validator(Pedido producto, Pedido productoNull){

		if(producto.equals(productoNull)){

			return false;
		}
		else{

			return true;
		}
		}
	
	public void mostrarOpciones()
	{
		System.out.println("\nOpciones de la aplicación\n");
		System.out.println("1. Mostrar el menu");
		System.out.println("2. Iniciar nuevo pedido");
		System.out.println("3. Agregar un elemento a un pedido");
		System.out.println("4. Cerrar un producto y guardar la factura");
		System.out.println("5. Consultar la información de un pedido dado por su id");

	}

	public void mostrarMenu()
	{
		System.out.println("1. Corral queso: 16.000");
		System.out.println("2. corral pollo: 15.000");
		System.out.println("3. corralita: 13.000");
		System.out.println("4. todoterreno: 25.000");
		System.out.println("5. 1/2 libra: 25.000");
		System.out.println("6. especial: 24.000");
		System.out.println("7. casera: 23.000");
		System.out.println("8. mexicana: 22.000");
		System.out.println("9. criolla: 22.000");
		System.out.println("10. Costeña: 20.000");
		System.out.println("11. hawaiana: 20.000");
		System.out.println("12. wrap de pollo: 15.000");
		System.out.println("13. wrap de lomo: 22.000");
		System.out.println("14. papas medianas: 5.500");
        System.out.println("15. papas grandes: 6.900");
		System.out.println("16. papas en casco medianas: 5.500");
		System.out.println("17. papas en casco grandes: 6.900");
		System.out.println("18. agua cristal sin gas: 5.000");
		System.out.println("19. agua cristal con gas: 5.000");
		System.out.println("20. gaseosa: 5.000");
	}

	public static void main(String[] args)
	{
		App app = new App();
		app.ejecutarAplicacion();
	}

}
    

