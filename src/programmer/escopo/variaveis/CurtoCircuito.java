package programmer.escopo.variaveis;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		/*
		 *  Qando a condição for && ele já desconsidera as próximas comparações
		 *  já que no caso a primeira deu 'false';
		 */
				
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & verdadeiro;
		boolean resultado2 = falso && verdadeiro;
		System.out.println(resultado1);
		System.out.println(resultado2);

	}

}
