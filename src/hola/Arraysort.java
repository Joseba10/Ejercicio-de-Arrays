package hola;

import java.util.Arrays;
import java.util.Collections;


public class Arraysort {

	public static void main(String[] args) {


		String[] myArray = {"Android","JavaFX", "HBase", "OpenCV", "Java", "Hadoop","Neo4j","Nexus","JavaEE", "Eclipse", "Ionic", "Angular", "Netbean","Mysql"};
		
		 long startTime = System.nanoTime();
		Arrays.sort(myArray);
		 long endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
		 
		 System.out.println("Tiempo transcurrido arrays.sort " + endTime + "\n");
		 
		System.out.println(Arrays.toString(myArray));
		
		 long startTime3 = System.nanoTime();	
		 
		 Arrays.sort(myArray, Collections.reverseOrder());
		 
		 System.out.println("Tiempo transcurrido arrays.sort Collections.reverseOrder()" + endTime + "\n");

		 long endTime3 = System.nanoTime() - startTime3; // tiempo en que se ejecuta su método
		System.out.println(Arrays.toString(myArray));
		
		
	
		 
		 long startTime2 = System.nanoTime();
		 Arrays.parallelSort(myArray);
		 long endTime2 = System.nanoTime() - startTime2; // tiempo en que se ejecuta su método
		 System.out.println("Tiempo transcurrido Arrays.parallelSort " + endTime + "\n");
		 System.out.println(Arrays.toString(myArray));
	
	
	

	}

	
}
