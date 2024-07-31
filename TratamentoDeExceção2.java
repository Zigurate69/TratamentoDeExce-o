package LPAloreSemestre2;

import java.util.ArrayList;

public class TratamentoDeExceção2 {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<>();

		try {
		nomes.add("Alice");
		nomes.add("Bob");
		nomes.add("Charlie");

		System.out.println("Nome: " + nomes.get(5));
		}
		catch (Exception erro) {
			System.out.println("Informe um valor adequado!");
			System.out.println("Indique o indice corretamente");
		}
	}
}