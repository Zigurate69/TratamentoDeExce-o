package LPAloreSemestre2;

import java.util.Scanner;

public class TratamentoDeExceção4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double v1 = 0, v2 = 0, v3 = 0;
		
		try {
		
		System.out.println("Informe o valor 1: ");
		v1 = ler.nextDouble();
		
		System.out.println("Informe o valor 2: ");
		v2 = ler.nextDouble();
		
		System.out.println("Informe o valor 3: ");
		v3 = ler.nextDouble();
		
		if (v1 == v2 && v1 == v3)
			System.out.println("Todos Iguais!");
		
		else if (v1 > v2 && v1 > v3)
			System.out.println("O 1° valor é o maior! " + v1);
		else if (v2 > v3)
			System.out.println("O 2° valor é o maior! " + v2);
		else
			System.out.println("O 3° valor é o maior! " + v3);
		
		}catch (Exception erro) {
			System.out.println("Letra não corresponde ao que é pedido!");
			System.out.println("Insira um número!");
		}
		
		ler.close();
	}
}