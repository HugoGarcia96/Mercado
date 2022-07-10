import java.util.Scanner;

public class Carrinho extends Produto{

    Scanner scan = new Scanner(System.in);
    private ProdutoPeso[] carrinhoPeso;
    private ProdutoUnidade [] carrinhoUnidade;

    public Carrinho(int id, String nome, double valor, int qtd) {
        super(id, nome, valor, qtd);
        carrinhoPeso = new ProdutoPeso[qtd];
        carrinhoUnidade = new ProdutoUnidade[qtd];
    }
    

    public void adicionaCarrinho(ProdutoPeso produto) {
        System.out.println("Digite a quantidade do produto: ");
        int qtd = scan.nextInt();
        produto.setQtd(qtd);
    }




}
