package exerciciosIniciante;

import java.util.Scanner;

public class Exercicio5_VolumeLataDeOleo {
	public static void main(String[] args) {
		Scanner teclador = new Scanner(System.in);
		System.out.print("Informe o raio da lata de oleo em cm: ");
		float raioLata = teclador.nextFloat();
		System.out.print("Informe a altura da lata de oleo em cm: ");
		float alturaLata = teclador.nextFloat();
		teclador.close();
		float volumeLata = (float) 3.14159 * raioLata * raioLata * alturaLata;
		System.out.printf("O volume da lata eh %2.2f cm3", volumeLata);
	}
}
