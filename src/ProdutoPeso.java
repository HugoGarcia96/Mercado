import java.util.Scanner;

public class ProdutoPeso extends Produto implements InterfaceProdutos{
	private double peso;
	
	public ProdutoPeso(int id, String nome, double valor, double peso) {
		super(id, nome, valor);
		this.peso = peso;
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
@Override
	public double valorTotal() {
		return (this.peso * this.getValor());
	}
	
	public void imprime() {
		super.imprime();
		System.out.println("Peso: "+this.peso);
		System.out.println("Valor total: "+valorTotal());
		System.out.println("");
	}
	
	public static ProdutoPeso criaProdutoPeso() {
		int id=0;
		double valor=0, peso=0;
		String nome;
		int qtd=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Id: ");
		id = scan.nextInt();
		
		System.out.println("Nome: ");
		nome = scan.next();
		
		System.out.println("Valor: ");
		valor = scan.nextDouble();
		
		System.out.println("Peso: ");
		peso = scan.nextDouble();
		
		ProdutoPeso p = new ProdutoPeso(id, nome, valor, peso);
		
		return p;
	}
}
