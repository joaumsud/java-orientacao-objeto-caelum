package com.joao.javaCaelum.exercicios;

public class Fatorial {

	public static void main(String[] args) {

		int fatorial = 1; // Inicio da conta.
		int numeroDeIteracao = 10; // Quantidadede itera??o que pode ser alterada pelo usu?rio

		// contador ? contagem de multiplica??o que vai diminuindo
		for (int contador = 1; contador <= numeroDeIteracao; contador++) {
			fatorial = fatorial * contador;
			System.out.println("Itera??o " + contador + " ? igual a " + fatorial);
		}

		/*
		 * int fatorial = 1; int numeroDeIteracao = 10; int contador = 1;
		 * 
		 * while (contador <= numeroDeIteracao) {
		 * 
		 * System.out.println("n?mero de Itera??o: " + contador + " Fatorial: " +
		 * fatorial); contador++; fatorial *= contador; }
		 */

	}
}
