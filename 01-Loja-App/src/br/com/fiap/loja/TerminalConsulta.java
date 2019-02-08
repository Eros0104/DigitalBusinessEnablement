package br.com.fiap.loja;

import java.util.Scanner;

public class TerminalConsulta {
	public static void main(String[] args) {
		System.out.println(getNomeLoja());
		System.out.println(getProduto(getCodigo()));

	}

	public static int getCodigo() {
		Scanner leitor = new Scanner(System.in);		
		System.out.println("Insira o n�mero do c�digo:");
		int resposta = leitor.nextInt();
		leitor.close();
		return resposta;
	}

	public static String getNomeLoja() {
		return "Loja";
	}

	public static String getProduto(int cod) {
		return cod == 401 ? "C�digo 401 � Camiseta branca"
				: cod == 402 ? "C�digo 402 � Camiseta azul"
						: cod == 403 ? "C�digo 403 � Camiseta rosa" : "Outro C�digo � Produto n�o encontrado";
	}
}
