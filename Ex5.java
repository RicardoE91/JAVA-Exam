package exam;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println ("Escribe el primer numero entero:");
		int num1 = scanner.nextInt();
		System.out.println ("Escribe el segundo numero entero:");
		int num2 = scanner.nextInt();
		Ex5ops misOps = new Ex5ops();
		misOps.Suma(num1,num2);
		misOps.Resta(num1,num2);
		misOps.Multiplicacion(num1,num2);
		misOps.Division(num1,num2);
	}
}