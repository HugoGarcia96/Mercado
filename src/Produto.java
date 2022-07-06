import java.util.Scanner;

public class Produto {
    private double preco;
    private String tipo, nome, peso;
    private int id, qtd = 0;

    public Produto(double preco, String peso, String tipo, int id, String nome, int qtd) {
        this.preco = preco;
        this.peso = peso;
        this.tipo = tipo;
        this.id = id;
        this.nome = nome;
        this.qtd = qtd;
    }

    public Produto(double preco, String tipo, int id, String nome, int qtd) {
        this.preco = preco;
        this.peso = null;
        this.tipo = tipo;
        this.id = id;
        this.nome = nome;
        this.qtd = qtd;
    }

    public Produto() {

    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static Produto criaProdutoParaEstoque(){
        double preco;
        String peso, tipo;
        String nome;
        int qtd, id;

        Scanner scan = new Scanner(System.in); 

        System.out.println("Informe o preço do produto: ");    
        preco = scan.nextDouble();
        
        System.out.println("Informe o peso do produto: ");    
        peso = scan.next();

        System.out.println("Informe o tipo do produto: ");    
        tipo = scan.next();

        System.out.println("Informe o ID do produto: ");    
        id = scan.nextInt();

        System.out.println("Informe o nome do produto: ");    
        nome = scan.next();

        System.out.println("Informe a quantidade desse produto em estoque: ");       
        qtd = scan.nextInt();

        Produto p = new Produto(preco, peso, tipo, id, nome, qtd);

        return p;
    }

    public void exibeInfo() {
        if (peso == null) {
            System.out.println("Nome: " + this.nome);
            System.out.println("Preco: " + this.preco);
            System.out.println("Tipo: " + this.tipo);
        } else
            System.out.println("Nome: " + this.nome);
            System.out.println("Preco: " + this.preco);
            System.out.println("Peso: " + this.peso);
            System.out.println("Tipo: " + this.tipo);
    }

}
