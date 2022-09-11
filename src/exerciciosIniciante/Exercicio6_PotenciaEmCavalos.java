package exerciciosIniciante;

import java.util.Scanner;

public class Exercicio6_PotenciaEmCavalos {
	public static void main(String[] args) {
		System.out.println("PROGRAMA PARA CALCULAR A POTENCIA PARA LEVACAO DA MASSA");
		Scanner viabilizador = new Scanner(System.in);
		System.out.print("Informe a massa em kilogramas(kg), do objeto: ");
		float massaM = viabilizador.nextFloat();
		System.out.print("Informe a altura(h) em metros, que a massa sera elevada: ");
		float alturaH = viabilizador.nextFloat();
		System.out.print("Informe o tempo em segundos(s): ");
		float tempoS = viabilizador.nextFloat();
		
		float potencia = (float) ((massaM * alturaH / tempoS) / 745.6999);
		
		System.out.printf("A potência necessária para uma massa de %.2f kg alcancar a altura %.2f m em %.2f segundos eh %.2f cavalos.", 
				massaM, alturaH, tempoS, potencia);
		viabilizador.close();
	}
}
