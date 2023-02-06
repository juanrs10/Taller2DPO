import model.hamburguesa;
import model; 

public class view{

    /**
	 * Esta es la calculadora de estadísticas que se usará para hacer todas las
	 * operaciones de la aplicación. Esta calculadora también contiene toda la
	 * información sobre los atletas después de que se cargue desde un archivo.
	 */
	private model.hamburguesa hamburguesa;

	/**
	 * Ejecuta la aplicación: le muestra el menú al usuario y la pide que ingrese
	 * una opción, y ejecuta la opción seleccionada por el usuario. Este proceso se
	 * repite hasta que el usuario seleccione la opción de abandonar la aplicación.
	 */
	public void ejecutarAplicacion()
	{
		System.out.println("Bienvenido al restaurante <name> \n");
		boolean continuar = true;
		while (continuar)
		{
			try
			{
				mostrarMenu();
				int opcion_seleccionada = Integer.parseInt(input("\n Este es nuestro menu \n"));
				if (opcion_seleccionada == 1){
					hamburguesa callejera = model.hamburguesa();
				}
				else if (opcion_seleccionada == 2 && calculadora != null)
					ejecutarAtletasPorAnio();
				else if (opcion_seleccionada == 3 && calculadora != null)
					ejecutarMedallasEnRango();
				else if (opcion_seleccionada == 4 && calculadora != null)
					ejecutarAtletasPorPais();
				else if (opcion_seleccionada == 5 && calculadora != null)
					ejecutarPaisConMasMedallistas();
				else if (opcion_seleccionada == 6 && calculadora != null)
					ejecutarMedallistasPorEvento();
				else if (opcion_seleccionada == 7 && calculadora != null)
					ejecutarAtletasConMasMedallasQue();
				else if (opcion_seleccionada == 8 && calculadora != null)
					ejecutarAtletaEstrella();
				else if (opcion_seleccionada == 9 && calculadora != null)
					ejecutarMejorPaisEnUnEvento();
				else if (opcion_seleccionada == 10 && calculadora != null)
					ejecutarTodoterreno();
				else if (opcion_seleccionada == 11 && calculadora != null)
					ejecutarMedallistasPorNacionYGenero();
				else if (opcion_seleccionada == 12 && calculadora != null)
					ejecutarPorcentajeMedallistas();
				else if (opcion_seleccionada == 13 && calculadora != null)
					ejecutarPaisAtleta();
				else if (opcion_seleccionada == 14)
				{
					System.out.println("Saliendo de la aplicación ...");
					continuar = false;
				}
				else if (calculadora == null)
				{
					System.out.println("Para poder ejecutar esta opción primero debe cargar un archivo de atletas.");
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
	}

	/**
	 * Muestra al usuario el menú con las opciones para que escoja la siguiente
	 * acción que quiere ejecutar.
	 */
	public void mostrarMenu()
	{
		System.out.println("\nOpciones de la aplicación\n");
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

}