package exam;

import java.util.ArrayList;
import java.util.List;

public class Ex8 {
	public static void main(String[] args) {
		List<String> paises= new ArrayList<>();
		paises.add("Sudafrica");
		paises.add("Egipto");
		paises.add("Turquia");
		paises.add("Rusia");
		paises.add("China");
		paises.add("India");
		List<String> paises2 = new ArrayList<>();
		paises2.add("Francia");
		paises2.add("México");
		paises2.add("Australia");
		paises2.add("Italia");
		paises2.add("Argentina");
		paises2.add("Brasil");
		List<String> paisestotal = new ArrayList<>(paises);
		paisestotal.addAll(paises2);
		paisestotal.sort(null);
		System.out.println(paisestotal);
	}
}