package exam;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println ("Escribe el primer número entero positivo:");
		int num1 = scanner.nextInt();
		System.out.println ("Escribe el segundo número entero positivo:");
		int num2 = scanner.nextInt();
		if(num1>21 && num2>21) {
			System.out.println ("0");
		}
		else if (num1>21 && num2<21) {
			System.out.println (num2);
		}
		else if (num1<21 && num2>21) {
			System.out.println (num1);
		}
		else {
			if(num1>num2) {
				System.out.println (num1);
			}
			else {
				System.out.println (num2);
			}	
		}
	}
}