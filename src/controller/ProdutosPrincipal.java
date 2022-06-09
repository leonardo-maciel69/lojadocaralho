package controller;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Produtos;
import persistence.ProdutosDB;

import java.sql.SQLException;

public class ProdutosPrincipal implements Iprodutos{
    public String msg_produtos = "Lista de Produtos";
    public TextField tfdescricao;
    public TextField tfiditem;
    public TextField tfpreco;
    public ProdutosPrincipal(TextField tfiditem, TextField tfpreco, TextField tfdescricao, Label msg_produtos) {
        this.tfiditem = tfiditem;
        this.tfdescricao = tfdescricao;
        this.tfpreco = tfpreco;
        this.msg_produtos = String.valueOf(msg_produtos);
    }
    @Override
    public void inserirProdutos(Produtos pr) throws SQLException, ClassNotFoundException {
        ProdutosDB prDB = new ProdutosDB();
        prDB.inserirProdutos(pr);
        prDB.buscarProdutos(pr);
        prDB.atualziarProdutos(pr);
        tfpreco.setText(String.valueOf(pr.getPreço()));
        tfdescricao.setText(String.valueOf(pr.getDescricao()));
    }
    @Override
    public void buscarProdutos(Produtos pr) throws SQLException, ClassNotFoundException {
        ProdutosDB prDB = new ProdutosDB();
        prDB.inserirProdutos(pr);
        prDB.buscarProdutos(pr);
        prDB.atualziarProdutos(pr);
    }
    @Override
    public void atualizarProdutos(Produtos pr) throws SQLException, ClassNotFoundException {
        ProdutosDB prDB = new ProdutosDB();
        prDB.inserirProdutos(pr);
        prDB.buscarProdutos(pr);
        prDB.atualziarProdutos(pr);
    }
    @Override
    public void excluirProdutos(Produtos pr) throws SQLException, ClassNotFoundException {
        ProdutosDB prDB = new ProdutosDB();
        prDB.excluirProdutos(pr);
        prDB.buscarProdutos(pr);
        prDB.atualziarProdutos(pr);
    }
}
