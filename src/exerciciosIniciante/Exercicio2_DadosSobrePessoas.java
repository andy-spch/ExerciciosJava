package exerciciosIniciante;

import java.util.Scanner;

/**
 * O programa quantifica a maior e a menor altura. Também informa a médida das alturas do homens
 * e por fim informa quantas mulheres foram informadas.
 * @author ander
 *
 */
public class Exercicio2_DadosSobrePessoas {
	public static void main(String[] args) {
		// Criando armazenadores de informações:
		double quantificaFeminino = 0, quantificaMasculino = 0, quantificaAlturaMasculino = 0, quantificaAlturaFeminino = 0;
		double altura, maiorAltura = 0, menorAltura = 0;
		String sexo;
		
		// Inicia a variavel de entrada no Systema
		Scanner ler = new Scanner(System.in);
		
		// Inicia o loop for, de 0 a 9, para quantificar 10 pessoas
		for (int i = 0; i < 10; i++) {
			// Informa o sexo e guarda até o próximo loop
			System.out.println("Informe o sexo(M/F): ".toLowerCase());
			sexo = ler.next();
			// Informa a altura e guarda até o próximo loop
			System.out.println("Informe a altura: ");
			altura = ler.nextDouble();
			
			// Separa entre masculino e feminino, adiciona mais 1 ao sexo e soma as alturas, separadas por sexo.
			// IMPORTANTE - as comparações de Strings devem utilizar o método .equals()
			if (sexo.equals("m")) {
				quantificaMasculino++;
				quantificaAlturaMasculino = quantificaAlturaMasculino + altura;
			} else {
				quantificaFeminino++;
				quantificaAlturaFeminino = quantificaAlturaFeminino + altura;
			}
			
			// Se a altura informada nesse loop é a maior ou a menor, caso seja a primeira, a
			// maior e a menor altura serão a mesma.
			if (maiorAltura == 0 && menorAltura == 0) {
				maiorAltura = menorAltura = altura;
			} else if (altura > maiorAltura) {
				maiorAltura = altura;
			} else if (altura < menorAltura) {
				menorAltura = altura;
			}
		}
		// fecha o sistema de entrada de dados
		ler.close();
		// calcula a media da altura dos homens
		double mediaAlturaHomens = quantificaAlturaMasculino / quantificaMasculino;
		
		// RESULTADOS SÃO INFORMADOS PARA O USUARIO DO PROGRAMA
		System.out.printf("A maior altura do grupo eh %.2f metro(s).\n"
				+ "A menor altura do grupo eh %.2f metro(s).\n"
				+ "A media da altura dos homens eh %2.2f metro(s).\n"
				+ "Temos um total de %2.0f mulheres",
				maiorAltura, menorAltura, mediaAlturaHomens, quantificaFeminino);
	}
}
