package utilidades;

import java.util.Scanner;

public class ObtencionTeclado {

	public static void main(String[] args) {
		int numEntero = ObtencionTeclado.recogerEnteroTeclado("Dame un número entero: ");
		System.out.println("El entero es: " + numEntero);
		double numReal = ObtencionTeclado.recogerDoubleTeclado("Dame un número real: ");
		System.out.println("El real es: " + numReal);
		String cadena = ObtencionTeclado.recogerStringTeclado("Dame una cadena: ");
		System.out.println("La cadena es: " + cadena);
	}

	public static String recogerStringTeclado(String mensaje) {
		Scanner teclado = new Scanner(System.in);
		System.out.print(mensaje);
		String cadena = teclado.nextLine();
		return cadena;

	}

	public static int recogerEnteroTeclado(String mensaje) {
		Scanner teclado = new Scanner(System.in);
		System.out.print(mensaje);
		int numero = Integer.parseInt(teclado.nextLine());
		return numero;

	}

	public static double recogerDoubleTeclado(String mensaje) {
		Scanner teclado = new Scanner(System.in);
		System.out.print(mensaje);
		double numero = Double.parseDouble(teclado.nextLine());
		return numero;

	}

}
