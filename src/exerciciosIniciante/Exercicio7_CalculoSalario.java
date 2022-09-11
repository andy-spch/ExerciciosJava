package exerciciosIniciante;

import java.util.Scanner;

public class Exercicio7_CalculoSalario {
	public static void main(String[] args) {
		System.out.println("CALCULO DE SALARIO");
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe o seu numero de funcionario: ");
		int numeroDoFuncionario = leitor.nextInt();
		System.out.print("Informe o numero de horas trabalhadas: ");
		int quantidadeHorasTrabalhadas = leitor.nextInt();
		System.out.print("Informe quanto recebe por hora trabalhada: R$");
		float valorPorHora = leitor.nextFloat();
		leitor.close();
		
		float totalRecebido = quantidadeHorasTrabalhadas * valorPorHora;
		
		System.out.printf("O funcionário de indentificacao %d recebe R$%.2f por mes.", numeroDoFuncionario, totalRecebido);
	}
}
