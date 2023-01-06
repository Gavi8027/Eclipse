import com.sun.java_cup.internal.runtime.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
	

		

		

		/*input:[45,333,76,29,900,23,474,654,29,454];
		op :min;->23
		max:->900
		*/

              int count, max, min, i;
		       int[] inputArray = new int[10];
		 
		       Scanner in = new Scanner(System.in);
		 
		       System.out.println("Enter number of elements");
		       count = in.nextInt();
		       System.out.println("Enter " + count + " elements");
		       
		       for(i = 0; i < count; i++) {
		           inputArray[i] = ((Object) in).nextInt();
		       }
		       
		       max = min = inputArray[0];
		       
		       for(i = 1; i < count; i++) {
		           if(inputArray[i] > max)
		               max = inputArray[i];
		           else if (inputArray[i] < min)
		               min = inputArray[i];
		               
		       }
		       System.out.println("min :-> " + min);
		       System.out.println("Max :-> " + max);
		       
		}

		

}
