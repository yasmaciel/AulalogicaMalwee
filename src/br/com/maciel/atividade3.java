package br.com.maciel;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.print("Insira o primeiro valor: ");
		int valor1 = tec.nextInt();
		System.out.print("Insira o segundo valor: ");
		int valor2 = tec.nextInt();
		int par = 0;
		int impar = 0;
		
		if (valor1 < valor2) {
			while (valor1 <= valor2) {
				if(valor1 % 2 == 0) {
					par++;
				}
				else {
					impar++;
				}
				System.out.println(valor1);
				valor1++;
			}
		}
		else if (valor1 > valor2){
			while (valor1 >= valor2) {
				if(valor1 % 2 == 0) {
					par++;
				}
				else {
					impar++;
				}
				System.out.println(valor1);
				valor1--;
			}
		}
		else {
			System.out.println("Os valores s�o iguais.");
		}
		System.out.println("Quantidade de valores pares: " + par);
		System.out.println("Quantidade de valores �mpares: " + impar);
	}





	}


