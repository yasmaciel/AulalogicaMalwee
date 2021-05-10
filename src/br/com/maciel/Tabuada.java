package br.com.maciel;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		System.out.println("informe um numero inteiro: ");
		int valor1 = tec.nextInt();
		int aux = 1;
		System.out.println("Tabuada do numero " + valor1 + ":");
		while (aux < 11) {
			System.out.println(aux + " x " + valor1 + " = " + aux * valor1 );
			aux++;
			
			
			
		}
		

	}

}
