package week4assignment;
import java.util.Scanner;
//import java.io.*;
//import java.util.*;

public class assingment4 {
		
	//Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated 
	//to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	static String concatMethod (String userWord, int x){
		String concatString = "";
		for (int i = 0; i < x; i++){
			concatString += userWord;
		}
	return concatString;
	}
	
	//Write a method that takes two Strings, firstName and lastName, and returns a full name (the 
	//full name should be the first and the last name as a String separated by a space
	static String fullName (String firstN, String lastN){
		String fullName = firstN + " " + lastN;
		return fullName;
	}
	
	//Write a method that takes an Array of int and returns true if the sum of all the ints in the Array
	//is greater than 100
	static boolean isSumGreater (int[] toTest) {
		int sum =0;
	
		for (int i = 0; i < toTest.length; i++) {
			sum += toTest[i];
		}
		if (sum>100)
			return true;
		else 
			return false;
	}
	
	//Write a method that takes an Array of double and returns the average of all the elements in 
	//the Array.
	static double avgOfArray (double[] toAverage) {
		double sum = 0;
		for (int i = 0; i < toAverage.length; i++) {
			sum += toAverage[i];
		}
		return sum/toAverage.length;
	}
	
	//Write a method that takes two Arrays of double and returns true if the average of the 
	//elements in the first Array is greater than the average of the elements in the second Array
	static boolean isFirstAvgGreater (double[] firstArr, double[] secondArr) {
		if (avgOfArray(firstArr)>avgOfArray(secondArr)) 
			return true;
		else
			return false;
	}
	
	//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double 
	//moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket>10.50 ) 
			return true;
		else 
			return false;
	}
	
	//Create a method of your own that solves a problem. In comments, write what the method 
	//does and why you created it
	
	//I'm am a board game creator hobbyist and this class made me excited about how I can use code to playtest my ideas
	//A simple method that I think would be useful in a game I'm currently making is checking whether a unit can use an action
	//It returns a boolean
	//It takes in an int[] parameter, which has values for STR, DEX, CON, INT, WIS, CHAR. In this example, a unit with INT>6 can 
	//cast the Fireball spell. Since the unitStats array will always be 6 long, and INT is always the 4the element in the array, I will 
	//be using those specific values in the method.
	static boolean canCastFireball (int[] unitStats) {
			if (unitStats[3] > 6)
				return true;
			else
				return false;
		}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] array1 = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//Programmatically subtract the value of the first element in the array from the value in the last 
		//element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
		System.out.println("array1 is : {3, 9, 23, 64, 2, 8, 28, 93}");
		System.out.println("Subtracting the first element from last yields: " + (array1[array1.length-1]-array1[0]) + "\n");
		

		
		//Create a new array with 9 elements (one more than the ages array)  
		//Repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		int[] array2 = {13, 22, 38, 34, 8, 12, 15, 101, 28, 76, 15};
		System.out.println("array2 is : {13, 22, 38, 34, 8, 12, 15, 101, 28, 76, 15}");
		System.out.println("Subtracting the first element from last yields: " + (array2[array2.length-1]-array2[0])+ "\n");
				
		//Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int ageSum=0;
		for (int i=0; i < array2.length; i++) {
			ageSum += array2[i];
		}
		System.out.println("I've looped through array2 and the average age is: " + ageSum/array2.length + "\n");
		
		//Create an array of String called names that contains the following values: 
		//“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		System.out.println("array of names contains: Sam, Tommy, Tim, Sally, Buck, and Bob");
		
		//Use a loop to iterate through the array and calculate the average number of letters per name. 
		//Print the result to the console.
		int totalNamesLength=0;
		for (int j = 0; j < names.length; j++) {
			totalNamesLength += names[j].length();
		}
		System.out.println("Average name length is " + totalNamesLength/names.length + "\n");
		
		//Use a loop to iterate through the array again and concatenate all the names together, 
		//separated by spaces, and print the result to the console.
		String concatNames = "";
		for (int x = 0; x < names.length; x++) {
			concatNames = concatNames.concat(names[x]);
			concatNames += " ";
		}
		System.out.println("The names concatenated into one string: " + concatNames + "\n");
		
		//How do you access the last element of any array?
		System.out.println("Using names[names.length-1] to access last element of names array: " + names[names.length-1]);
		System.out.println("Similar syntax works for all arrays, make sure to index at length-1" + "\n");
		
		//How do you access the last element of any array?
		System.out.println("Using names[0] to access first element of names array: " + names[0]);
		System.out.println("Arrays in java are zero-based (wording?) so make sure to index at 0" + "\n");
		
		//Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and 
		//add the length of each name to the nameLengths array.
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
			//System.out.println(nameLengths[i]); this was to check contents of my array in case something is wrong
		}
		
		
		//Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. 
		//Print the result to the console.
		int nameLengthsSum = 0;
		for (int w = 0; w < nameLengths.length; w++) {
			nameLengthsSum += nameLengths[w];
		}
		System.out.println("The sum of name lengths is: " + nameLengthsSum + "\n");
		
		
		//Ask user for a word and integer to pass into concatMethod()
		Scanner in = new Scanner(System.in);
		String word;
		int n;
		System.out.println("Give me a word: ");
		word = in.nextLine();
		System.out.println("Give me a number: ");
		n = in.nextInt();
		System.out.println(concatMethod (word, n));
		
		
		//Ask user for a first and last name to pass into fullName()
		Scanner in2 = new Scanner(System.in);
		String userFirst, userLast;
		System.out.println("Give me a first name: ");
		userFirst = in2.nextLine();
		System.out.println("Give me a last name: ");
		userLast = in2.nextLine();
		System.out.println("Full name is: "  + fullName (userFirst, userLast) + "\n");
		//I had some issues with scanner skipping first name input, creating a new scanner hotfixed the issue
		
		//this is to test isSumGreater() method, false and true conditions
		int[] numArr1 = {30, 40, 50, 1};
		int[] numArr2 = {1, 2};
		
		System.out.println("Numbers in numArray1 = {30, 40, 50, 1} add up to >100: "+ isSumGreater(numArr1));
		System.out.println("Numbers in numArray2 = {1, 2} add up to >100: "+ isSumGreater(numArr2));
		
		//this is to test avgOfArray() method
		double[] doubleArr = {12.6, 13.5, 65.7, 34};
		System.out.println("The average of numbers in doubleArr = {12.6, 13.5, 65.7, 34} is: " + avgOfArray(doubleArr));
		
		//this is to test isFirstAvgGreater() method, testing both false and true conditions
		//this time I decided to try test by assigning method return to variables first.
		//perhaps doing everything in as few lines  as possible previously was leading me to writing code that's harder to parse
		double[] doubleArr2 = {36.6, 100, 123.4, 6, 19};
		double[] doubleArr3 = {1.1, 2.2};
		boolean test1 = isFirstAvgGreater(doubleArr, doubleArr2);
		boolean test2 = isFirstAvgGreater(doubleArr, doubleArr3);
		System.out.println("The average of doubleArr is greater than average of doubleArr2 = {36.6, 100, 123.4, 6, 19}: "+ test1);
		System.out.println("The average of doubleArr is greater than average of doubleArr3 = {1.1, 2.2}: "+ test2 + "\n");
		
		//this is to test willBuyDrink() method
		//used a few different inputs to test false and true conditions
		boolean tempIsHigh1 = true;
		boolean tempIsHigh2 = false;
		double cashInPocket1 = 5.67;
		double cashInPocket2 = 100.32;
		System.out.println("Is it hot? " + tempIsHigh1 + ". I got " + cashInPocket1 
				+" in my pocket. I'm buying beer: " + willBuyDrink(tempIsHigh1, cashInPocket1));
		System.out.println("Is it hot? " + tempIsHigh1 + ". I got " + cashInPocket2 
				+" in my pocket. I'm buying beer: " + willBuyDrink(tempIsHigh1, cashInPocket2));
		System.out.println("Is it hot? " + tempIsHigh2 + ". I got " + cashInPocket1 
				+" in my pocket. I'm buying beer: " + willBuyDrink(tempIsHigh2, cashInPocket1));
		System.out.println("Is it hot? " + tempIsHigh2 + ". I got " + cashInPocket2 
				+" in my pocket. I'm buying beer: " + willBuyDrink(tempIsHigh2, cashInPocket2)+ "\n");
		
		//testing canCastFireball() method with a few different inputs
		int[] unit1 = {1, 1, 3, 7, 8, 1};
		int[] unit2 = {3, 3, 5, 1, 2, 6};
		int[] unit3 = {2, 2, 4, 5, 6, 1};
				
		System.out.println("Unit 1 can cast Fireball: " + canCastFireball(unit1));
		System.out.println("Unit 2 can cast Fireball: " + canCastFireball(unit2));
		System.out.println("Unit 3 can cast Fireball: " + canCastFireball(unit3));
		
		in.close();
		in2.close();
	}

}
