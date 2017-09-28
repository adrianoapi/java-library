package programmer.escopo.variaveis;

/**
 * Simples calculadora JAVA
 * @author adriano.costa
 *
 */
public class Calculadora {

	/*
	 * Cont�m os valores e tipo de opera��o
	 * recebidos por par�metros
	 */
	public int operacao(int num1, int num2, String operador) {
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

	public static void main(String args[]) {

		Calculadora c = new Calculadora();
		int resultado = c.operacao(10, 5, "*");

		System.out.println(resultado);
	}
}
