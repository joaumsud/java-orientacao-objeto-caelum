package com.joao.javaCaelum.exercicios;

public class soma1000 {
	public static void main(String[] args) {
		int contador = 1;
		
		//a soma do numero + contador tem que dar <1000, por isso dava errado antes.
		
		for (int numero = 1; (numero + contador) <= 1000; numero += contador) {
			System.out.println("Posição: " + contador + " Numero: " + numero);
			contador++;
		}
	}
}
/*
 * int contador=0, soma=1; while (soma + contador <= 1000) { soma += contador;
 * contador++; System.out.println( contador + " = " +soma); }
 */