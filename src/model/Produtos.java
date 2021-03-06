package model;

public class Produtos {

    private long iditem;

    private int preço;

    private String descricao;

    public long getIditem() {return iditem;}

    public void setIditem(long iditem) {this.iditem = iditem;}

    public int getPreço() {
        return preço;
    }

    public void setPreço(int quantidadeProdutos) {
        this.preço = preço;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String valor) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "iditem=" + iditem +
                ", preço=" + preço +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
