package model;

public class produtos {

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
}
