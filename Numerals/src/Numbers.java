//will olson number reader

import java.util.Scanner;

public class Numbers {
	
	
	public static void main(String[] args) {
		
		String ask = "print a number";
		String ans = "The sum is ";
		int num = 0;
		Scanner numbers = new Scanner(System.in);
	
		for (int i = 0; i < 2; i++) {
		System.out.println(ask);
		num = num + numbers.nextInt();
		}
		
		System.out.println(ans + num);
		
		
	}
}
