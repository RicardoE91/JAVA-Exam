package exam;

public class Ex4 {
 public static void main(String[] args) {
	int[] a1 = {7,7,7};
	int[] a2 = {3,8,0};
	int[] a3 = {0,0};
	
	a3[0] = a1[1];
	a3[1] = a2[1];
		for (int i:a3) {
			System.out.print(i);
		}
	}
}