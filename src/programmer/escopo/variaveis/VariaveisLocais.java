package programmer.escopo.variaveis;

public class VariaveisLocais {

	/*
	 * exemplo de utiliza��o de vari�vel local
	 */
	public static void main(String[] args) {
		int y = 0;
		int x = 8;
		if (x >= 10) {
			y = x / 10;
		} else {
			// Se a declara��o da vari�vel y fosse no bloco if, ela
			// n�o poderia ser chamada fora dessa condi��o
			// int y
			y = x * 5;
		}
		System.out.println(y);
	}
}
