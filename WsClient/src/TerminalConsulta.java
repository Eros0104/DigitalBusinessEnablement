

import java.rmi.RemoteException;
import java.util.Scanner;

import br.com.erosmendonca.bo.EstoqueBOStub;
import br.com.erosmendonca.bo.EstoqueBOStub.ConsultarProduto;
import br.com.erosmendonca.bo.EstoqueBOStub.ConsultarProdutoResponse;
import br.com.erosmendonca.bo.EstoqueBOStub.ProdutoTO;

public class TerminalConsulta {
	
	
	public static void main(String[] args) throws RemoteException {	
		EstoqueBOStub stub = new EstoqueBOStub();
		ConsultarProduto consulta = new ConsultarProduto();
		consulta.setCodigo(getCodigo());
		ConsultarProdutoResponse resp = 
				stub.consultarProduto(consulta);
		ProdutoTO prod = resp.get_return();
		System.out.println(prod.getDescricao());
	} 

	public static int getCodigo() {
		Scanner leitor = new Scanner(System.in);	
		System.out.println("Insira o número do código:");
		int resposta = leitor.nextInt();
		leitor.close();
		return resposta;
	}
}
