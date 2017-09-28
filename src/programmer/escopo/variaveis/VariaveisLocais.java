package programmer.escopo.variaveis;

public class VariaveisLocais {

	/*
	 * exemplo de utilização de variável local
	 */
	public static void main(String[] args) {
		int y = 0;
		int x = 8;
		if (x >= 10) {
			y = x / 10;
		} else {
			// Se a declaração da variável y fosse no bloco if, ela
			// não poderia ser chamada fora dessa condição
			// int y
			y = x * 5;
		}
		System.out.println(y);
	}
}
