package programmer.escopo.variaveis;

public class Curiosidade {

	public static void main(String[] args) {
		
		int x = 2147483647;
		int y = 1;

		System.out.println(x + y);
		// -2147483648
		// Quando excede o limite o número volta para o menor
	}
}
