package exerciciosIniciante;

import java.util.Scanner;

public class Exercicio3_ {
	public static void main(String[] args) {
		System.out.println("PROGRAMA DE CALCULO DE SALARIOS");
		Scanner entrada = new Scanner(System.in);
		Boolean proximo = true;
		int i = 1, somaSalario = 0;
		while (proximo.equals(true)) {
			System.out.printf("Informe o %do salario: R$", i);
			double salario = entrada.nextDouble();
			System.out.print("Quer continuar?(S/N) ".toLowerCase());
			String continua = entrada.next();
			somaSalario += salario;
			if (continua.equals("n")) {
				proximo = false;
			} else {
				i++;
			}
		}
		entrada.close();
		double mediaSalario = somaSalario/i;
		
		System.out.printf("A media dos %d salarios informados eh R$%2.2f", i, mediaSalario);
	}
}
