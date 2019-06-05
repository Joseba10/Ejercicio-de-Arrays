package hola;

import java.util.Arrays;
import java.util.Random;

import utilidades.ObtencionTeclado;

public class EjemploArrays {

	public static void main(String[] args) {
		int N = ObtencionTeclado.recogerEnteroTeclado("Dame el número de elementos: ");
		int VALOR_MAXIMO = ObtencionTeclado.recogerEnteroTeclado("Dame el valor máximo: ");
		//
		System.out.println("--------------------------------------------");
		int[] arrayEnterosAleatorios = generarArrayEnterosAleatorios(N, VALOR_MAXIMO);
		System.out.println("ELEMENTOS DEL ARRAY");
		imprimirArray(arrayEnterosAleatorios);
		//
		System.out.println("--------------------------------------------");
		int elementoBuscar = ObtencionTeclado.recogerEnteroTeclado("Introduzca el valor a buscar: ");
		int posicionArray = buscarElementoArrayBusquedaLineal(arrayEnterosAleatorios, elementoBuscar);
		System.out.println("La posicion del elemento en el array es: " + posicionArray);
		//
		System.out.println("--------------------------------------------");
		// LO TIENES QUE HACER TÚ
		int[] arrayOrdenadoEnterosAleatorios = generarArrayOrdenadoEnteros(arrayEnterosAleatorios);
		System.out.println("ELEMENTOS DEL ARRAY ORDENADO");
		imprimirArray(arrayOrdenadoEnterosAleatorios);
		//
		System.out.println("--------------------------------------------");
		elementoBuscar = ObtencionTeclado.recogerEnteroTeclado("Introduzca el valor a buscar en el array ordenado: ");
		posicionArray = buscarElementoArrayOrdenadoBusquedaLineal(arrayOrdenadoEnterosAleatorios, elementoBuscar);
		System.out.println("La posicion del elemento en el array es: " + posicionArray);
		//
		System.out.println("--------------------------------------------");
		elementoBuscar = ObtencionTeclado
				.recogerEnteroTeclado("Introduzca el valor a buscar (búsqueda binaria) en el array ordenado: ");
		posicionArray = buscarElementoArrayOrdenadoBusquedaBinaria(arrayOrdenadoEnterosAleatorios, elementoBuscar);
		System.out.println("La posicion del elemento en el array es: " + posicionArray);

	}

	public static int[] generarArrayEnterosAleatorios(int longitud, int valorMaximo) {
		Random random = new Random();
		int[] arrayEnteros = new int[longitud];
		for (int i = 0; i < arrayEnteros.length; i++) {
			arrayEnteros[i] = random.nextInt(valorMaximo + 1);
		}
		return arrayEnteros;
	}

	public static int[] imprimirArray(int[] arrayEnteros) {
		for (int i = 0; i < arrayEnteros.length; i++) {
			System.out.println("Elemento " + i + ": " + arrayEnteros[i]);
		}
		return arrayEnteros;
	}

	// LO TIENES QUE HACER TÚ

	public static int buscarElementoArrayBusquedaLineal(int[] arrayEnterosSinOrdenar, int elementoBuscar) {

		int posicion = -1;
	
		boolean encontrado = false;
		int i = 0;
		while ((i < arrayEnterosSinOrdenar.length) && (!encontrado)) {
			if (arrayEnterosSinOrdenar[i] == elementoBuscar) {
				encontrado = true;
				posicion = i;
			} else {
				i = i + 1;
			}
		}

		return posicion;
	}

	public static int[] generarArrayOrdenadoEnteros(int[] arrayEnteros) {
		/*
		 * Metodo de arrays,su funcionamiento es empezar a ordenar de menor a mayor,en
		 * caso de que el array seria string basicamente lo ordenaria comparando el
		 * abecerario.
		 * 
		 * En caso de que necesitariamos revertir el orden habria que llamar al metodo
		 * Collections.reverseOrder() dentro del array.sort,tambien hay otro metodo
		 * implementado en java 8 llamado Arrays.ParallelSort() que es mas rapido pero
		 * cuando los elementos de un array son pocos no hay diferencia,la diferencia
		 * entre los dos metodos es que sort solo funciona con un hilo y ParallelSort
		 * con multiples lo que hace que sea mas veloz
		 */
		// Arrays.sort(arrayEnteros);

		for (int i = 0; i < arrayEnteros.length - 1; i++) {
			for (int j = 0; j < arrayEnteros.length - 1; j++) { //Si no pones el 1 te sales del array

				if (arrayEnteros[j] > arrayEnteros[j + 1]) {
					int temp = arrayEnteros[j];
					arrayEnteros[j] = arrayEnteros[j + 1]; // La posicion actual se queda con el numero siguiente que
															// esta ubicado en la siguiente posicion del array
					arrayEnteros[j + 1] = temp; // El valor del proximo elemento del array se queda en la posicion
												// actual

				}
			}
		}
		return arrayEnteros;
	}

	public static int buscarElementoArrayOrdenadoBusquedaLineal(int[] arrayEnterosOrdenados, int elementoBuscar) {
		int posicion = -1;
		boolean encontrado = false;
		int i = 0;

		while ((i < arrayEnterosOrdenados.length) && (!encontrado)) {
			if (arrayEnterosOrdenados[i] == elementoBuscar) {
				encontrado = true;
				posicion = i;
			} else {
				i = i + 1;
			}

		}
		return posicion;
	}

	public static int buscarElementoArrayOrdenadoBusquedaBinaria(int[] arrayEnterosSinOrdenar, int elementoBuscar) {

		// Dentro de los arrays hay un metodo llamado binarySearch,su funcion es buscar
		// el elemento introducido dentro del array existente

		//int busqueda_binaria = Arrays.binarySearch(arrayEnterosSinOrdenar, elementoBuscar);
		
		int centro = 0;
		int primero,ultimo,valorCentro;
		
		primero=0;
		ultimo= arrayEnterosSinOrdenar.length-1;
		
		while(primero<=ultimo) {
			
			centro= (primero+ultimo)/2;
			valorCentro= arrayEnterosSinOrdenar[centro];
			
			if(valorCentro==elementoBuscar) {
				
				return centro;
			}
			else if(elementoBuscar<valorCentro){
			ultimo=centro-1;	//Nos movemos hacia izquierda
				
			}else{ //elementoBuscar>valorCentro
				primero=centro+1; //Nos movemos hacia derecha
			}
			
		}
		return centro;

		
	}

	/************* Otras formas ******************/

	public static int buscarElementoArrayBusquedaLinealBueno(int[] arrayEnterosSinOrdenar, int elementoBuscar) {
		int posicion = -1;
		boolean encontrado = false;
		int i = 0;
		while ((i < arrayEnterosSinOrdenar.length) && (!encontrado)) {
			if (arrayEnterosSinOrdenar[i] == elementoBuscar) {
				encontrado = true;
				posicion = i;
			} else {
				i = i + 1;
			}
		}
		return posicion;
	}

	public static int buscarElementoArrayOrdenadoBusquedaLinealBueno(int[] arrayEnterosOrdenados, int elementoBuscar) {
		int posicion = -1;
		boolean encontrado = false;
		boolean pasado = false;
		int i = 0;
		while ((i < arrayEnterosOrdenados.length) && (!encontrado) && (!pasado)) {
			if (arrayEnterosOrdenados[i] == elementoBuscar) {
				encontrado = true;
				posicion = i;
			} else if (arrayEnterosOrdenados[i] > elementoBuscar) {
				pasado = true;
			} else {
				i = i + 1;
			}
		}
		return posicion;
	}
}
