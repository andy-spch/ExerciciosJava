package exerciciosIniciante;

import java.util.Scanner;

public class Exercicio4_CalculoAlturaParedeAzulejos {
	public static void main(String[] args) {
		double alturaParede, larguraParede, alturaAzulejo, larguraAzulejo;
		Scanner observador = new Scanner(System.in);
		System.out.print("Informe a altura da parede em metros: ");
		alturaParede = observador.nextDouble();
		System.out.print("Informe a largura da parede em metros: ");
		larguraParede = observador.nextDouble();
		System.out.print("Informe a altura do azulejo em m: ");
		alturaAzulejo = observador.nextDouble();
		System.out.print("Informe a largura do azulejo em m: ");
		larguraAzulejo = observador.nextDouble();
		observador.close();
		
		double areaParede = alturaParede * larguraParede;
		double areaAzulejo = alturaAzulejo * larguraAzulejo;
		int totalAzulejos = (int)(areaParede/areaAzulejo);
		System.out.printf("A parede informada tem %2.2f m2 de area e o azulejo informado tem %2.2f m2 de area."
				+ "\nSerao necessarios cerca de %d azulejos para essa parede!", areaParede, areaAzulejo, totalAzulejos);
	}
}
