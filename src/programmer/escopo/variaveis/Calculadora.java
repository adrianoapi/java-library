package programmer.escopo.variaveis;

import java.util.Scanner;

/**
 * Simples calculadora JAVA
 */
public class Calculadora {

	/**
	 * Contém os valores e tipo de operação recebidos por parâmetros
	 * 
	 * @param num1
	 * @param num2
	 * @param operador
	 * @return
	 */
	public double operacao(double num1, double num2, String operador) {
		switch (operador) {
		case "+":
			return num1 + num2;
		case "-":
			return num1 - num2;
		case "*":
			return num1 * num2;
		case "/":
			return num1 / num2;
		default:
			return 0000;
		}
	}

	/**
	 * Imprime o resultado
	 * @param args
	 */
	public static void main(String args[]) {

		// Declaração das classes
		Calculadora c = new Calculadora();
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o primeiro valor: ");
		double valor1 = entrada.nextDouble();
		System.out.println("Informe o operador ( +, -, / ou *): ");
		String operador = entrada.next();
		System.out.println("Informe o segundo valor: ");
		double valor2 = entrada.nextDouble();
		double resultado = c.operacao(valor1, valor2, operador);

		System.out.println(resultado);
	}
}
