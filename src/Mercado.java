public class Mercado {
    private Produto estoque[] = new Produto[3];
    private double caixa;

    public Produto[] getEstoque() {
        return estoque;
    }

    public void setEstoque(Produto estoque[]) {
        this.estoque = estoque;
    }

    public double getCaixa() {
        return caixa;
    }

    public void setCaixa(double caixa) {
        this.caixa = caixa;
    }

    public void qtdEstoque() {
        System.out.println("Quantidade de produtos em estoque " + estoque);
    }

    public void lucro() {
        System.out.println("O lucro em caixa e " + caixa);
    }

}
