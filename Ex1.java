package exam;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println ("Escribe el número entero a multiplicar para obtener su tabla:");
		int num = scanner.nextInt();
		int mul = 0;
		for(int i=1;i<=10;i++) {
			mul = i*num;
			System.out.println(num + " x " + i + " = " + mul);
		}
	}
}