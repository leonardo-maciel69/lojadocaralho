package model;

public class pagamento {

    private long id_pg;
    private String endereco;
    private String formapagamento;
    private float totalFrete;

    public long getId_pg() {return id_pg;}

    public void setId_pg(long id_pg) {this.id_pg = id_pg;}

    public String getFormapagamento() {return formapagamento;}

    public void setFormapagamento(String formapagamento) {this.formapagamento = formapagamento;}

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getTotalFrete() {
        return totalFrete;
    }

    public void setTotalFrete(float totalFrete) {
        this.totalFrete = totalFrete;
    }

    @Override
    public String toString() {
        return "pagamento{" +
                "id_pg=" + id_pg +
                ", endereco='" + endereco + '\'' +
                ", formapagamento='" + formapagamento + '\'' +
                ", totalFrete=" + totalFrete +
                '}';
    }
}
