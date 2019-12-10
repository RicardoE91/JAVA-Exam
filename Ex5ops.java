package exam;

public class Ex5ops implements Ex5i{
	public void Suma(int num1,int num2) {
		System.out.println("La suma de " + num1 + " + " + num2 +" es = " +(num1+num2));
	}
	public void Resta(int num1,int num2) {
		System.out.println("La resta de " + num1 + " - " + num2 +" es = " +(num1-num2));
	}
	public void Multiplicacion(int num1,int num2) {
		System.out.println("La multiplicación de " + num1 + " * " + num2 +" es = " +(num1*num2));
	}
	public void Division(int num1,int num2) {
		System.out.println("La división de " + num1 + " / " + num2 +" es = " + ((float)num1/num2));
	}
}