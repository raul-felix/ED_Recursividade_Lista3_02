package view;

import java.util.Scanner;

import controller.NumeroController;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		NumeroController numController = new NumeroController();
		int a;
		int b;
		
		do {
			System.out.println("Digite um número inteiro de 10 a 999999:");
			a = sc.nextInt();
		}
		while (a < 10 || a > 999999);
		
		do {
			System.out.println("Digite um número inteiro de 0 a 9:");
			b = sc.nextInt();
		}
		while (b < 0 || b > 9);
		
		
		int resultado = numController.quantasVezesNum(a, b, 0);
		
		System.out.println("Aparece " + resultado + " vezes");
	}

}
