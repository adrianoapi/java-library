package programmer.escopo.variaveis;

public class VariaveisInstancia {
	// instancia a(o) variavel/atributo no bojeto
	static int count = 210;

	public static int method() {
		int ponteiro = 0;
		int j = 0;
		for (int i = count; i >= 100; --i) {
			ponteiro = j++;
		}
		return ponteiro;
	}

	public static void main(String[] args) {
		// Não é possível usar o ponteiro this em um método stático
		// int number = this.id;
		System.out.println("A direrença é de: " + method());
	}
}
