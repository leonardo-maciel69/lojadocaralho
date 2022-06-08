package controller;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.login;
import model.pagamento;

import java.sql.SQLException;

public class carrinhoPrincipal implements Icarrinho {

    private TextField tfTotalItens;

    private TextField tfidCarrinho;

    private TextField tfIdLinha;

    private TextField tftotalGeral;

    private TextField tfqtdItens;

    private Label msg_carrinho;
    public carrinhoPrincipal(TextField tftotalItens, TextField tdidCarrinho, TextField tfidLinha, TextField totalGeral, TextField qtdItens, Label msg_carrinho){
        this.tfidCarrinho = tfidCarrinho;
        this.tfqtdItens = tfqtdItens;
        this.tfTotalItens = tfTotalItens;
        this.tftotalGeral = tftotalGeral;
        this.tfIdLinha = tfIdLinha;
    }


    @Override
    public void inserirCarrinho(login L, pagamento PG) throws SQLException {

    }

    @Override
    public void inserirCarrinhoIt(login L, pagamento PG) throws SQLException {

    }

    @Override
    public void buscarCarrinhoIt(login L, pagamento PG) throws SQLException {

    }

    @Override
    public void excluirCarrinhoIt(login L, pagamento PG) throws SQLException {

    }

    @Override
    public void atualizarCarrinhoIt(login L, pagamento PG) throws SQLException {

    }
}
