package LPAloreSemestre2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNúmerosPares {

	public static void main(String[] args) {
		
         ArrayList<Integer> numeros = new ArrayList<>();
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite o valor 0 para sair ");
		
		int soma = 0, i = 1;
		while(i != 0) {
			System.out.println("Digite o valor que irá ser somado");
			i = ler.nextInt();
			numeros.add(i);
		}
		System.out.println("Os números pares são: ");
		for(int n: numeros) {
			soma = soma + n;
			if (n % 2 == 0) {
				System.out.println(n);
			}
		}
		System.out.println("Lista é :" + numeros);
		System.out.println("A soma é :" + soma);
		ler.close();
	}
}