package programmer.escopo.condicionais;

public class DoWhile {

	public static void main(String[] args) {

		int i = 1;
		int max = 10;

		System.out.println("Contando até: " + i);

		// while (i < max) {
		// System.out.println(i);
		// i++;
		// }

		// Primeiro avalia depois imprime a mensagem
		do {
			i++;
			System.out.println(i);
		} while (i < max);
		System.out.println("\nFinal: " + i);

	}

}
