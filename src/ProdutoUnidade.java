import java.util.Scanner;

public class ProdutoUnidade extends Produto implements InterfaceProdutos{
	private int quantidade;
	
	public ProdutoUnidade(int id, String nome, double valor, int quantidade, int qtd) {
		super(id, nome, valor, qtd);
		this.quantidade = quantidade;
		
	}

	public double valorTotal() {
		return (quantidade * this.getValor());
	}
	
	public void imprime() {
		super.imprime();
		System.out.println("Quantidade: "+this.quantidade);
		System.out.println("Valor total: "+this.valorTotal());
		System.out.println("");
	}
	
	public static ProdutoUnidade criaProdutoUnidade() {
		int id=0, quantidade=0;
		double valor=0;
		String nome;
		int qtd=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Id: ");
		id = scan.nextInt();
		
		System.out.println("Nome: ");
		nome = scan.next();
		
		System.out.println("Valor: ");
		valor = scan.nextDouble();
		
		System.out.println("Quantidade: ");
		quantidade = scan.nextInt();
		
		ProdutoUnidade p = new ProdutoUnidade(id, nome, valor, quantidade, qtd);
		
		return p;
	}
}
