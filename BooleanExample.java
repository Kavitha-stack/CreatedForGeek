package com.kavi.geek;

public class BooleanExample {

	public static void main(String[] args) {
		checkUsingAndOperator();
		checkUsingOROperator();
		checkUsingNOTOperator();
		checkUsingEqualToOperator();
		checkUsingNOTEqualToOperator();
		checXorOperator();
		checkTernaryOperator();
		checkLesserThanOperator();
		checkGreaterThanOperator();
		checkLesserEqualToOperator();
		checkGreaterEqualToOperator();
	}



	private static void checkUsingAndOperator() {
		boolean result1 = true;
		boolean result2 = false;
		boolean result3 = true;
		boolean result4 = false;
		
		System.out.println("AND Condition 1: "+(result1 && result2));
		System.out.println("AND Condition 2: "+(result2 && result3));
		System.out.println("AND Condition 3: "+(result1 && result3));
		System.out.println("AND Condition 4: "+(result2 && result4));
		System.out.println("AND Condition 5: "+(result2 & result4));
	}
	
	private static void checkUsingOROperator() {
		boolean result1 = true;
		boolean result2 = false;
		boolean result3 = true;
		boolean result4 = false;
		
		System.out.println("OR Condition 1: "+(result1 || result2));
		System.out.println("OR Condition 2: "+(result2 || result3));
		System.out.println("OR Condition 3: "+(result1 || result3));
		System.out.println("OR Condition 4: "+(result2 || result4));
	}
	
	private static void checkUsingEqualToOperator() {
		boolean result1 = true;
		boolean result2 = false;
		boolean result3 = true;
		boolean result4 = false;
		
		System.out.println("EqualTo Condition 1: "+(result1 == result2));
		System.out.println("EqualTo Condition 2: "+(result2 == result3));
		System.out.println("EqualTo Condition 3: "+(result1 == result3));
		System.out.println("EqualTo Condition 4: "+(result2 == result4));
	}
	
	private static void checkUsingNOTOperator() {
		boolean result1 = true;
		System.out.println("Not Condition: "+!result1);
	}
	
	private static void checkUsingNOTEqualToOperator() {
		boolean result1 = true;
		boolean result2 = false;
		boolean result3 = true;
		boolean result4 = false;
		
		System.out.println("Not EqualTo Condition 1: "+(result1 != result2));
		System.out.println("Not EqualTo Condition 2: "+(result2 != result3));
		System.out.println("Not EqualTo Condition 3: "+(result1 != result3));
		System.out.println("Not EqualTo Condition 4: "+(result2 != result4));
		System.out.println("Not EqualTo Condition 5: "+!(result2 && result4));
		System.out.println("Not EqualTo Condition 6: "+!(result2 || result4));
		System.out.println("Not EqualTo Condition 7: "+!result2);
	}
	
	private static void checXorOperator() {
		boolean result1 = true;
		boolean result2 = false;
		boolean result3 = true;
		System.out.println("Xor Condition 1: "+(result1 ^ result2));
		System.out.println("Xor Condition 2: "+(result1 ^ result3));
	}
	
	private static void checkTernaryOperator (){
		int a = 5;
		int b = 10;
		int result = (a < b) ? a : b;
		System.out.println ("Ternary result : "+result);
		
	}
	

	private static void checkGreaterThanOperator() {
		int num1 = 5;
		int num2 = 10;
		boolean result = num2 > num1;
		System.out.println ("Greater than Result : "+result);
	}

	private static void checkLesserThanOperator() {
		int num1 = 5;
		int num2 = 10;
		boolean result = num1 < num2;
		System.out.println ("Lesser than Result : "+result);
	}

	private static void checkGreaterEqualToOperator() {
		int num1 = 10;
		int num2 = 10;
		int num3 = 5;
		boolean result1 = num2 >= num1;
		boolean result2= num2 >= num3;
		System.out.println (">= Result1 : "+result1);
		System.out.println (">= Result2 : "+result2);
	}

	private static void checkLesserEqualToOperator() {
		int num1 = 10;
		int num2 = 5;
		int num3 = 5;
		boolean result1 = num3 <= num1;
		boolean result2= num2 <= num3;
		System.out.println ("<= Result1 : "+result1);
		System.out.println ("<= Result2 : "+result2);
	}

}
