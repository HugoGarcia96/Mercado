public class Mercado {
    private int estoque;
    private double caixa;
    
    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public double getCaixa() {
        return caixa;
    }
    public void setCaixa(double caixa) {
        this.caixa = caixa;
    }

    public void qtdEstoque(){
        System.out.println("Quantidade de produtos em estoque " + estoque);
    }

    public void lucro (){
        System.out.println("O lucro em caixa e " + caixa);
    }

    public double venda (double precoTotal, double getCarteira,int getItem ){
        
        
    }
}
