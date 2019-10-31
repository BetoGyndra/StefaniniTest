package randomArray;
import java.util.Random;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Rnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random Rm = new Random();	
		
		System.out.println("Secuencia 1 :");		
		List<Integer> numbers = new ArrayList<>(20);
		
		for(int i = 0; i<20; i++ ) {
			numbers.add(Rm.nextInt(99));
			
		}		
		System.out.print("\n");
		System.out.println("numeros aleatorios :");
		System.out.println(numbers);				
		
		for (int i=0; i<100; i++){
		    System.out.print("*");
		}
		
		System.out.print("\n");		
		System.out.println("Secuencia 2 :" );
		System.out.print("\n");	
		
		List<Integer> numbers2 = new ArrayList<>(20);
		
		for(int i = 0; i<20; i++ ) {
			numbers2.add(Rm.nextInt(99));
		}
		System.out.println("numeros aleatorios :");
		System.out.println(numbers2);			
		
		List<Integer> numberspairs = new ArrayList<>(100);
		List<Integer> numbersinpairs = new ArrayList<>(100);
				 
		 
		 for (Integer i : numbers) { 		      
			 if(i % 2 == 0){
	            	numberspairs.add(i);
	            }
	            else{
	            	numbersinpairs.add(i);
	            }		
	      }
		 
		 for (Integer j : numbers2) { 		      
			 if(j % 2 == 0){
	            	numberspairs.add(j);
	            }
	            else{
	            	numbersinpairs.add(j);
	            }		
	      }
		 		
		
		 
		 Set<Integer> hashSet = new HashSet<Integer>(numberspairs);
		 numberspairs.clear();
		 numberspairs.addAll(hashSet);
		 Collections.sort(numberspairs);
			
		 	System.out.println("\n");
			System.out.println("numeros repetidos eliminados");
			System.out.println("\n");
			System.out.println("Numeros pares :");
			System.out.println(numberspairs);
		 
		Set<Integer> hashSet2 = new HashSet<Integer>(numbersinpairs);
		numbersinpairs.clear();
		numbersinpairs.addAll(hashSet2);
		Collections.sort(numbersinpairs);
					
		
		 System.out.println("Numeros impares :");
		 System.out.println(numbersinpairs);
		
	}
}
