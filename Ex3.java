package exam;

import java.util.Scanner;

public class Ex3 {
	static boolean esPalindromo(String in) 
    { 
        int i = 0;
        int j = in.length() - 1; 
        while (i < j) {  
            if (in.charAt(i) != in.charAt(j)) 
                return false; 
            i++; 
            j--; 
        }
        return true; 
    } 
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println ("Escribe la palabra, frase o secuencia de caracteres para su verificación - No mayor a 50 caracteres-:");
		String in = scanner.nextLine();
		if(in.length()>50) {
			System.out.println("Lo ingresado es mayor a 50 caracteres");
		}
		else {
			if (esPalindromo(in)) {
				System.out.print("SI");
			}
		    else {
		    	System.out.print("NO");
		    }     
		}
	}
}