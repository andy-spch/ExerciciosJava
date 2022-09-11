package exerciciosIniciante;

import java.util.Scanner;
/**
 * Criando um programa para conversão de Celsius para Kelvin, Reamur, Rankine e Fahrenheit
 * @author ander
 *
 */

public class Exercicio1_ConversorDeTemperatura {
	public static void main(String[] args) {
		// Título do programa
		System.out.println("PROGRAMA DE CONVERSÃO DE TEMPERATURA!!!");
		// Abertura do Scanner para variáveis de entrada no sistema
		Scanner pointer = new Scanner(System.in);
		// Aloca a temperatura Celcius que o usuário informar, para o sistema
		System.out.println("Informe a temperatura, em graus celsius que deseja converter: ");
		double temperaturaCelcius = pointer.nextInt();
		// declaração das variaveis de memória para as fórmulas de conversão de temperatura em seguida
		double temperaturaKelvin, temperaturaReamur, temperaturaRankine, temperaturaFahrenheit;
		temperaturaKelvin = temperaturaCelcius + 273.15;
		temperaturaReamur = temperaturaCelcius * 0.8;
		temperaturaRankine = temperaturaCelcius * 1.8 + 32 + 459.67;
		temperaturaFahrenheit = temperaturaCelcius * 1.8 + 32;
		// Informa ao usuário que iniciará as conversões a partir daqui
		System.out.println("Seguem as conversoes: ");
		// listagem de conversões (utilizei o .2f, para 2 casas decimais em número de ponto flutuante
		System.out.printf("Kelvin = %.2f K\n", temperaturaKelvin);
		System.out.printf("Reamur = %.2f Re\n", temperaturaReamur);
		System.out.printf("Rankine = %.2f Ra\n", temperaturaRankine);
		System.out.printf("Fahrenheit = %.2f F", temperaturaFahrenheit);
		pointer.close();
	}
}
