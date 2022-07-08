import java.util.Scanner;

public class Carrinho extends Produto implements InterfaceProdutos {
    private int criaProdutoPeso = 0;
    Scanner scan = new Scanner(System.in);

    public Carrinho(int id, String nome, double valor, int qtd) {
        super(id, nome, valor);

    }

    public void adicionaCarrinho(Produto produto) {
        System.out.println("Digite a quantidade do produto: ");
        int qtd = scan.nextInt();
        produto.setQtd(qtd);
    }

    @Override
    public double valorTotal() {
        
        return 0;
    }

}
