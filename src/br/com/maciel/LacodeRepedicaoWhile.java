package br.com.maciel;

public class LacodeRepedicaoWhile {

	public static void main(String[] args) {
	int valor = 0;
	
	System.out.println("Valor:" + valor);
	
	System.out.println("Agora valor �:" + valor);
	
	while(valor <= 25){ 
		System.out.println("-> Valor: " + valor);
		valor++;
		valor = valor += 1;
		valor = valor + 1;
	}
	System.out.println("Agora valor �:" + valor );
	}

}
