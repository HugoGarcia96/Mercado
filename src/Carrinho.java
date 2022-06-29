public class Carrinho {
    private Produto item [] = new Produto[10];
    private double precoTotal;
    
    public Produto[] getItem() {
        return item;
    }
    public void setItem(int Produto[]) {
        this.item = item;
    }
    public double getPrecoTotal() {
        return precoTotal;
    }
    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public void compra(Produto produtos[]){
        double total=0;
        
        for(int i=0; i<produtos.length; i++){
            total += produtos[i].getPreco();
        }
    }
}
