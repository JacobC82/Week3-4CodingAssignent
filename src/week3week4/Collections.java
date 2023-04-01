package week3week4;

import java.lang.reflect.Array;

public class Collections {

	public static void main(String[] args) {
		// Prompt 1: creating array
	int[] ages = {3,9,23,64,2,28,93,120};
		//Prompt 1a: first element from last element
			System.out.println("1a " + (ages[ages.length-1] - ages[0]));
		//Prompt 1b: added extra element to array
		//Prompt 1c: iterate through array and calculate avg age
	int i = 0;
	
	for (int age : ages) {
		i +=age;
	}	 
	System.out.println("1b " + i/ages.length);
	
		//Prompt 2: create string array
	String[] names = {"Sam", "Tommy", "Tim", "Sally"};
		//Prompt 2a: calculate avg length
	System.out.println("2a");
	int j = 0;
	for (int index = 0; index < names.length; index++ ) {
		j+=names[index].length();
	} System.out.println(j/names.length);
		//Prompt 2b: concatenate array
	System.out.println("2b");
	for(String name : names) {
		System.out.print(name + " ");
	}	System.out.println(" ");
	
		//Prompt 3: you access the last element with: "arrayName[arrayName.length-1]"
		//Prompt 4: you access the first element with: "arrayName[0]"
		//Prompt 5
	int[] nameLengths = {7,89,10};
		//Prompt 6: iterating over array to calculate elements
	int sumOfElement = 0;
	for (int ele : nameLengths) {
		sumOfElement += ele;
	} System.out.println("6: " + sumOfElement);
	
	System.out.println(7);
	System.out.println(concatWord("Hello",3));
	
	System.out.println(8);
	System.out.println(fullName("Jake","Carlson"));
	
	System.out.println("9: " + isSumGreaterThan(ages));
	double[] doubles = {5.5,6.7,88.9,};
	double[] doubles2 = {15.5,26.7,8.9,};
	System.out.println("10: " + doubleAvg(doubles));
	System.out.println("11: " + dosDoubles(doubles,doubles2));
	boolean isHotOut = true;
	double moneyInPocket = 100.00;
	System.out.println("12: " + willBuyDrink(isHotOut,moneyInPocket));
	boolean isNiceOut = false;
	boolean hasBeenGood = true;
	System.out.println("13: " + canPepperGoOut(isNiceOut,hasBeenGood));
	}//eom
		//Prompt 7
	public static String concatWord(String word, int n) {
		String str = "";
		for (int i = 0; i <= n; i++) {
			str += word;
		} return str;
	}
	
	//Prompt 8
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	//Prompt 9
	public static boolean isSumGreaterThan(int[]numbers) {
		int sum = 0;
		for(int num : numbers) {
			sum += num;
		}if (sum > 100) {
			return true; 
		} else {
			return false;
		}
	}
	
	//Prompt 10
	public static double doubleAvg(double[] doubAvg) {
		double d = 0.0;
		for (double xx : doubAvg) {
			d += xx;
		}
		return d / doubAvg.length;
	}
	//Prompt 11
	public static boolean dosDoubles(double[]yes, double[]no) {
		double sumAvg = 0;
		double sumAvg2 = 0;
		for (double y : yes) {
			sumAvg+= y;
		}
		for (double nO : no) {
			sumAvg2+= nO;
		}if (sumAvg > sumAvg2) {
			return true;
		}else {
			return false;
		}	
	}
	
	//Prompt 12
	public static boolean willBuyDrink(boolean isHotOut, double moneyInPocket) {
		if ((isHotOut = true) && (moneyInPocket > 10.5)) {
			
		}
		return true;
	}
	//Prompt 13
	/*Checks to see if my dog is allowed out. 
	 * 
	 */
	public static String canPepperGoOut(boolean isNiceOut, boolean hasBeenGood) {
		if ((isNiceOut == true) && (hasBeenGood == true)) {
		return "She can go out!";
		}
		else  {
		 	return "She has to wait..";
		}
		
		
	}
}
