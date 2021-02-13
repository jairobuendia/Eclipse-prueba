/*
 * Esto es una prueba para subir a Git
 * 
 */
package javaGitPrueba;

/**
 * @author Jairo Buendia
 *
 */
public class JavaGit {
	public static void main(String args[]) {
		System.out.println("Programa que te da una carta aleatoria ");
		System.out.println("---------------------------------------");

		// elige tipo de carta (picas, corazones, diamantes, tr�boles)
		int numTipo = (int) (Math.random() * 4) + 1;
		String tipo = "";
		switch (numTipo) {
		case 1:
			tipo = "Picas";
			break;
		case 2:
			tipo = "Corazones";
			break;
		case 3:
			tipo = "Diamantes";
			break;
		case 4:
			tipo = "Tr�boles";
			break;
		}
		// System.out.println(tipo);

		// elige el numero de la carta (1-10) (J,Q,K,A)
		int numCarta = (int) (Math.random() * 13) + 1;
		String carta = "";
		switch (numCarta) {
		case 11:
			carta = "J";
			break;
		case 12:
			carta = "Q";
			break;
		case 13:
			carta = "K";
			break;
		case 1:
			carta = "A";
			break;
		default:
			carta = String.valueOf(numCarta);
		}
		System.out.println("La carta elegida al azar es: " + carta + " de " + tipo);
	}
}
