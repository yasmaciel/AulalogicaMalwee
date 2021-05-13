package br.com.maciel;

import java.util.Scanner;

public class Menurepete {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String opcao = "s";
		int opcaoDoMenu;
				
		do {
			System.out.println("---MENU---");
			System.out.println("1) Tabuada  com do While");
			System.out.println("2) Tabuada com For");
			System.out.println("3) Editar");
			System.out.println("4) Excluir");
			System.out.println("9) Sair ");
			System.out.println("--------");
			System.out.println("Informe a opção desejada: ");
			opcaoDoMenu = tec.nextInt();
			
			switch(opcaoDoMenu) {
			case 1: 
				System.out.println("--- TABUADA ---");
				int valor;
				int multiplicador = 0;
				
				System.out.println("informe um valor inteiro: ");
				valor = tec.nextInt();
				
		do { 
			System.out.println(valor + " x " + multiplicador + " = " + (valor * multiplicador ));
			multiplicador++;
		}while(multiplicador <= 10 );
		
		break;
			
			case 2:
				System.out.println("--- TABUADA For ---");
				for(int i = 0; i <= 10; i++) {
					System.out.println("Valor do i: " + i);
						
					
				}
				break;
			case 3:
				System.out.println("--- EDITAR ---");
				break;
			case 4:
				System.out.println("--- EXCLUIR ---");
				break;
			case 9:
				opcao = "n";
				break;
				
			default:
				System.out.println("opção inválida");
			}
			
		
		}while(opcao.equalsIgnoreCase("s"));
		
		System.out.println("Sistema finalizado.s");

	}

}
