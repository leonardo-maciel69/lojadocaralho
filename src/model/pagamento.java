package model;

public class pagamento {

    private String endereco;
    private int codFormapagamento;
    private String descricaoProduto;
    private float totalFrete;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCodFormapagamento() {
        return codFormapagamento;
    }

    public void setCodFormapagamento(int codFormapagamento) {
        this.codFormapagamento = codFormapagamento;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public float getTotalFrete() {
        return totalFrete;
    }

    public void setTotalFrete(float totalFrete) {
        this.totalFrete = totalFrete;
    }
}
