//will olson number reader

import java.util.Scanner;

public class Numbers {
	
	
	public static void main(String[] args) {
		
		String ask = "print a number";
		String sum = "The sum is ";
		String pro = "The product is";
		String quo = "The quotient is";
		String mod = "The remainder is";
		int num1 = 0;
		int num2 = 0
		Scanner numbers = new Scanner(System.in);
	
		System.out.println(ask);
		num1 = numbers.nextInt();
		System.out.println(ask);
		num2 = numbers.nextInt();
		
		
		System.out.println(sum + (num1 + num2);
		System.out.println(pro + (num1 * num2);
		System.out.println(quo + (num1 / num2);
		System.out.println(mod + (num1 % num2);
		
	}
}
