package LPAloreSemestre2;

import java.util.Scanner;

public class TratamentoDeExceção {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);

		int a=0, b=0;
		try {
			System.out.println("Informe o primeiro valor: ");
			a = ler.nextInt();

			System.out.println("Informe o segundo valor: ");
			b = ler.nextInt();

		}
		catch (Exception erro) {
			System.out.println("Informe um valor do tipo inteiro!");
			System.exit(0);

			System.out.println("Resultados");
			System.out.println("Soma: " +(a + b));
			System.out.println("Subtração: " +(a - b));
			System.out.println("Multiplicação: " +(a * b));
			System.out.println("Divisão Inteira: " +(a % b));
			System.out.println("Divisão Exata: " +((double)a / b));
			ler.close();
		}
	}
}
