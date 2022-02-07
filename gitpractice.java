package Git;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class gitpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("N� Casos:");
		int ncaso = sc.nextInt();
		
		while(ncaso<1) {
			System.out.println("N� Casos:");
			ncaso = sc.nextInt();
		}
		
		for(int x=0; x<ncaso; x++) {
			System.out.println("N� D�gitos:");
			int ndigit = sc.nextInt();
			
			while(ndigit<1 || ndigit>10) {
				System.out.println("N� D�gitos:");
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

	private static void moda(int[] array) {
		HashMap <Integer,Integer> map = new HashMap();
		   
	    int repetido = 0, numMax = -1,repetidoCon = 0;
	   
	    for (int i : array) {
	        if (map.containsKey(i)) {
	          repetido =  map.get(i);
	          map.put(i, ++repetido); 
	        } else{
	            map.put(i, 1);
	        }
	    }
	     
	    for (Map.Entry<Integer,Integer> e : map.entrySet()) {
	        if (repetidoCon < e.getValue()) {
	            repetidoCon = e.getValue();
	            numMax = e.getKey();
	            System.out.println(numMax);
	        }
	    }
	    
	    System.out.println("la moda en la poblaci�n es  " +   numMax);
	}


	}

