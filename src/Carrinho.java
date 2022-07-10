import java.util.Scanner;

public class Carrinho extends Produto implements InterfaceProdutos {
    Scanner scan = new Scanner(System.in);

    private double carrinhoTotal;
    private ProdutoPeso[] carrinhoPeso;
    private ProdutoUnidade[] carrinhoUnidade;


    public double getCarrinhoTotal() {
        return carrinhoTotal;
    }

    public void setCarrinhoTotal(double carrinhoTotal) {
        this.carrinhoTotal = carrinhoTotal;
    }

    public ProdutoPeso[] getCarrinhoPeso() {
        return carrinhoPeso;
    }

    public void setCarrinhoPeso(ProdutoPeso[] carrinhoPeso) {
        this.carrinhoPeso = carrinhoPeso;
    }

    public ProdutoUnidade[] getCarrinhoUnidade() {
        return carrinhoUnidade;
    }

    public void setCarrinhoUnidade(ProdutoUnidade[] carrinhoUnidade) {
        this.carrinhoUnidade = carrinhoUnidade;
    }

    public Carrinho(int id, String nome, double valor, int qtd) {
        super(id, nome, valor);
        carrinhoPeso = new ProdutoPeso[qtd];
        carrinhoUnidade = new ProdutoUnidade[qtd];
    }

    public void adicionaCarrinhoPeso(ProdutoPeso produto) {
        for (int i = 0; i < carrinhoPeso.length; i++) {
            if (carrinhoPeso[i] == null) {
                carrinhoPeso[i] = produto;
                break;
            }
        }
    }

    public void adicionaCarrinhoUnidade(ProdutoUnidade produto) {
        for (int i = 0; i < carrinhoUnidade.length; i++) {
            if (carrinhoUnidade[i] == null) {
                carrinhoUnidade[i] = produto;
                break;
            }
        }
    }
    public void removeCarrinhoPeso(ProdutoPeso produto){
        for (int i = 0; i < carrinhoPeso.length; i++) {
            if (carrinhoPeso[i] == produto) {
                carrinhoPeso[i] = null;
                break;
            }
        }
    }
    public void removeCarrinhoUnidade(ProdutoUnidade produto){
        for (int i = 0; i < carrinhoUnidade.length; i++) {
            if (carrinhoUnidade[i] == produto) {
                carrinhoUnidade[i] = null;
                break;
            }
        }
    }

    @Override
    public double valorTotal() {
        for (int i = 0; i < carrinhoPeso.length + carrinhoUnidade.length; i++) {

            carrinhoTotal += this.getValor() * this.carrinhoPeso[i].getQtd();
            carrinhoTotal += this.getValor() * this.carrinhoUnidade[i].getQtd();
        }
        return 0;
    }

}
