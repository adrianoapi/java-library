package programmer.escopo.variaveis;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		/*
		 *  Qando a condi��o for && ele j� desconsidera as pr�ximas compara��es
		 *  j� que no caso a primeira deu 'false';
		 */
				
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & verdadeiro;
		boolean resultado2 = falso && verdadeiro;
		System.out.println(resultado1);
		System.out.println(resultado2);

	}

}
