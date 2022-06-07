package controller;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.produtos;
import persistence.produtosDB;

import java.sql.SQLException;

public class produtosPrincipal implements Iprodutos{
    public String msg_produtos = "Lista de produtos";
    public TextField tfdescricao;
    public TextField tfiditem;
    public TextField tfpreco;
    public produtosPrincipal(TextField tfiditem, TextField tfpreco, TextField tfdescricao, Label msg_produtos) {
        this.tfiditem = tfiditem;
        this.tfdescricao = tfdescricao;
        this.tfpreco = tfpreco;
        this.msg_produtos = String.valueOf(msg_produtos);
    }
    @Override
    public void inserirProdutos(produtos pr) throws SQLException, ClassNotFoundException {
        produtosDB prDB = new produtosDB();
        prDB.inserirProdutos(pr);
        prDB.buscarProdutos(pr);
        prDB.atualziarProdutos(pr);
        tfpreco.setText(String.valueOf(pr.getPreço()));
        tfdescricao.setText(String.valueOf(pr.getDescricao()));
    }
    @Override
    public void buscarProdutos(produtos pr) throws SQLException, ClassNotFoundException {
        produtosDB prDB = new produtosDB();
        prDB.inserirProdutos(pr);
        prDB.buscarProdutos(pr);
        prDB.atualziarProdutos(pr);
    }
    @Override
    public void atualizarProdutos(produtos pr) throws SQLException, ClassNotFoundException {
        produtosDB prDB = new produtosDB();
        prDB.inserirProdutos(pr);
        prDB.buscarProdutos(pr);
        prDB.atualziarProdutos(pr);
    }
    @Override
    public void excluirProdutos(produtos pr) throws SQLException, ClassNotFoundException {
        produtosDB prDB = new produtosDB();
        prDB.excluirProdutos(pr);
        prDB.buscarProdutos(pr);
        prDB.atualziarProdutos(pr);
    }
}
