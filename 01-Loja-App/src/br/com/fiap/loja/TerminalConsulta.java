package br.com.fiap.loja;

import java.util.Scanner;

import br.com.fiap.loja.bo.EstoqueBO;

public class TerminalConsulta {
	public static void main(String[] args) {
		EstoqueBO bo = new EstoqueBO();
		System.out.println(getNomeLoja());
		System.out.println(bo.getProduto(getCodigo()));

	} 

	public static int getCodigo() {
		Scanner leitor = new Scanner(System.in);	
		System.out.println("Insira o número do código:");
		int resposta = leitor.nextInt();
		leitor.close();
		return resposta;
	}

	public static String getNomeLoja() {
		return "Loja";
	}
}
