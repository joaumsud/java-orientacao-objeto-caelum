package com.joao.javaCaelum.exercicios;

public class Fibonacci {
	
	static long fibonacci(int n) {
		if(n < 2) {
			return n;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 30; i++) {
			System.out.println("(" + i + ")" + Fibonacci.fibonacci(i) + "\t");
		}
	}
}
