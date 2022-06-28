public class Produto {
    private double preco, peso;
    private String tipo, id;

    public Produto(double preco, double peso, String tipo, String id) {
        this.preco = preco;
        this.peso = peso;
        this.tipo = tipo;
        this.id = id;
    }

    public Produto(double preco, String tipo, String id) {
        this.preco = preco;
        this.tipo = tipo;
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
