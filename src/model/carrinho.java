package model;

public class carrinho {

    private double totalItens;
    private int idCarrinho;

    private int idLinha;
    private double totalGeral;
    private int qtdItens;

    public double getTotalItens() {return totalItens;}

    public void setTotalItens(double totalItens) {this.totalItens = totalItens;}

    public int getIdCarrinho() {return idCarrinho;}

    public void setIdCarrinho(int idCarrinho) {this.idCarrinho = idCarrinho;}

    public double getTotalGeral() {
        return totalGeral;
    }

    public void setTotalGeral(double totalGeral) {
        this.totalGeral = totalGeral;
    }

    public int getQtdItens() {return qtdItens;}

    public void setQtdItens(int qtdItens) {this.qtdItens = qtdItens;}

    public int getIdLinha() {return idLinha;}

    public void setIdLinha(int idLinha) {this.idLinha = idLinha;}

    @Override
    public String toString() {
        return "carrinho{" +
                "totalItens=" + totalItens +
                ", idCarrinho=" + idCarrinho +
                ", idLinha=" + idLinha +
                ", totalGeral=" + totalGeral +
                ", qtdItens=" + qtdItens +
                '}';
    }
}
