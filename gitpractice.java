package Git;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class gitpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nº Casos:");
		int ncaso = sc.nextInt();
		
		while(ncaso<1) {
			System.out.println("Nº Casos:");
			ncaso = sc.nextInt();
		}
		
		for(int x=0; x<ncaso; x++) {
			System.out.println("Nº Dígitos:");
			int ndigit = sc.nextInt();
			
			while(ndigit<1 || ndigit>10) {
				System.out.println("Nº Dígitos:");
				ndigit = sc.nextInt();
			}
		
			int [] array = new int[ndigit];

			
			for(int y=0; y<ndigit; y++) {
				int nserie = sc.nextInt();
//				int nseriestring= Integer.toString(nserie);
				array[y] = nserie;
			}

			moda(array);
			System.out.println();
		}
		
	}

	private static void moda(int[] array) {			// método el cual recibe como argumento el array de arriba.
		HashMap <Integer,Integer> map = new HashMap();
		   
	    int repetido = 0, numMax = -1,repetidoCon = 0;
	   
	    for (int i : array) {				// Hashmap para ver cuantas veces se repite un dato dentro del array.
	        if (map.containsKey(i)) {		
	          repetido =  map.get(i);
	          map.put(i, ++repetido); 
	        } else{
	            map.put(i, 1);
	        }
	    }
	     
	    for (Map.Entry<Integer,Integer> e : map.entrySet()) { //recorre el Hashmap y verifica cual es el dato que más se repite
	        if (repetidoCon < e.getValue()) {
	            repetidoCon = e.getValue();
	            numMax = e.getKey();
	            System.out.println(numMax);
	        }
	    }
	    
	    System.out.println("la moda en la población es  " +   numMax);
	}


	}

