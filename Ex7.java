package exam;

import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Map namesMap = new HashMap(); 
		namesMap.put("a1234", "Steve Jobs");
		namesMap.put("a1235", "Scott McNealy");
		namesMap.put("a1236", "Jeff Bezos");
		namesMap.put("a1237", "Larry Elison");
		namesMap.put("a1238", "Bill Gates");
		Scanner scanner = new Scanner(System.in);
		System.out.println ("Escribe el ID:");
		String id = scanner.nextLine();
		String llave = id + " " + (String) namesMap.get(id);
		
	}
	public void obtenerPersonaje(String llave) throws Exception {
		System.out.println(llave);
		FileOutputStream out = null;
		out = new FileOutputStream("C:\\Users\\curso\\RERI\\JAVA Exam\\JAVA Exam\\src\\exam\\personaje.txt");
		byte[] b = llave.getBytes();
		out.write(b);
		out.close();
	}
}