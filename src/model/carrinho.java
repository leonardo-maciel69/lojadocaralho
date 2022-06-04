package model;

public class carrinho {

    private int codItem;
    private float valorItem;
    private int quantidadeItem;
    private float totalCarrinho;

    public int getCodItem() {
        return codItem;
    }

    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }

    public float getValorItem() {
        return valorItem;
    }

    public void setValorItem(float valorItem) {
        this.valorItem = valorItem;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public float getTotalCarrinho() {
        return totalCarrinho;
    }

    public void setTotalCarrinho(float totalCarrinho) {
        this.totalCarrinho = totalCarrinho;
    }
}
