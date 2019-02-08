package br.com.fiap.loja;

import java.util.Scanner;

public class TerminalConsulta {
	public static void main(String[] args) {
		System.out.println(getNomeLoja());
		System.out.println(getProduto(getCodigo()));

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

	public static String getProduto(int cod) {
		return cod == 401 ? "Código 401 – Camiseta branca"
				: cod == 402 ? "Código 402 – Camiseta azul"
						: cod == 403 ? "Código 403 – Camiseta rosa" : "Outro Código – Produto não encontrado";
	}
}
