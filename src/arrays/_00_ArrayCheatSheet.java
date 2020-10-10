package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] names = {"Joe", "Jeff", "Bob", "Billy", "Johnny"};
		
		//2. print the third element in the array
System.out.println(names[2]);
		//3. set the third element to a different value
		names[2] = "Bobby";
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		int l = names.length;
		
		
		for (int i = 0; i < l; i++) {
			
			System.out.println(names[i]);
			
		}
		//6. make an array of 50 integers
		int[] numbers = new int[50];
		
	
Random ran = new Random();
		
		
		
		for(int n = 0; n<50; n++) {
		
			int r = ran.nextInt(50);
			
			numbers[n] = r;
			
			System.out.println(numbers[n]);   
		}
	
		

		//7. use a for loop to make every value of the integer array a random number
		
		//8. without printing the entire array, print only the smallest number in the array
	for(int x = 1; x<numbers.length;x++) {
		
		int num1 = x;
		
		int num2 = x+1;
		
		if(numbers[num1]>numbers[num2]) {
			
			numbers[x]=numbers[num2];
			
			numbers[x+1]= numbers[num1];
			
			
		}
		
		
	}
		//9 print the entire array to see if step 8 was correct
		     
		//10. print the largest number in the array.
		
	}
	}
  