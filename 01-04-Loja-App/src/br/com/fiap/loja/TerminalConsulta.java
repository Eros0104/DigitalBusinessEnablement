package br.com.fiap.loja;

import java.util.Scanner;

import br.com.fiap.loja.bo.EstoqueBO;
import br.com.fiap.singleton.PropertySingleton;

public class TerminalConsulta {
	
	
	public static void main(String[] args) {				
		EstoqueBO bo = new EstoqueBO();
		System.out.println(PropertySingleton.getInstance().getProperty("nome"));
		System.out.println(bo.toString(bo.getProduto(getCodigo())));
	} 

	public static int getCodigo() {
		Scanner leitor = new Scanner(System.in);	
		System.out.println("Insira o número do código:");
		int resposta = leitor.nextInt();
		leitor.close();
		return resposta;
	}
}
