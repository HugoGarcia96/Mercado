import java.util.Scanner;

public class Cliente {
    private Produto item[] = new Produto[3];
    private Produto pd[] = new Produto[3];
    private String nome, cpf;
    private double carteira, precoTotal = 0;
    private int idCliente, qntItens, choice = 0;

    Scanner scan = new Scanner(System.in);

    public Cliente(Produto[] pd, double precoTotal, int qntItens) {
        this.pd = pd;
        this.precoTotal = precoTotal;
        this.qntItens = qntItens;
    }

    public Cliente() {
        this.precoTotal = 0;
        this.qntItens = 0;
    }

     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getCarteira() {
        return carteira;
    }

    public void setCarteira(double carteira) {
        this.carteira = carteira;
    }

    public Produto[] getItem() {
        return item;
    }

    public void setItem(Produto item[]) {
        this.item = item;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void infoCliente(){
        System.out.println("Nome: " +nome);
        System.out.println("Cpf: " +cpf);
        System.out.printf("Carteira: %.2f ",carteira);
        System.out.println("ID: " +idCliente);
    }

    public void add(){
        System.out.println("====================");
        System.out.println("Produtos Disponiveis");
        System.out.println("====================");
        for (int i = 0; i < 3; i++) {
            item[i] = new Produto();
            item[i].exibeInfo();
            System.out.println("=============================================");
            System.out.println("Voce quer Adicionar esse produto ao Carrinho?");
            System.out.println("              1: SIM  |  0: NAO              ");
            System.out.println("=============================================");
            int choice = scan.nextInt();
            if (choice == 1) {
                pd[i] = item[i];
            }
            for (int k = 0; k < 20; k++)
                System.out.println(" ");
        }

    }

    public void corrigirEstoque() {
        for (int i = 0; i < 3; i++) {
            System.out.println("==========================================");
            System.out.println("Quantos desse produto voce deseja comprar?");
            System.out.println("==========================================");
            int q = scan.nextInt();
            qntItens += q;
            pd[i].setQtd(q);
            item[i].setQtd(item[i].getQtd() - q);
        }
    }

    public int comprar(){
        for(int i=0;i<3;i++){
            precoTotal += pd[i].getPreco();
        }
        System.out.println("==========================================");
        System.out.println("    Voce deseja finalizar sua compra?     ");
        System.out.println("          1: SIM  |  0: NAO               ");
        System.out.println("==========================================");
        int choice = scan.nextInt();
        if (choice == 1){
            return 1;
        }else
        return 0;
    }
}
