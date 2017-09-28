package programmer.escopo.variaveis;

public class VariaveisLocais {
	static int valor = 10;

	public static void main(String[] args) {
		int y = 0;
		int x = VariaveisLocais.valor;
		if (x >= 10) {
			y = x / 10;
		} else {
			y = x * 5;
		}
		System.out.println(y);
	}
}
