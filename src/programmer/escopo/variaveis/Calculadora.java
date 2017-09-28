package programmer.escopo.variaveis;

public class Calculadora {

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
		int resultado = c.operacao(5, 2, "*");
		System.out.println(resultado);
	}
}
