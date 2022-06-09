package controller;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Login;
import model.Pagamento;

import java.sql.SQLException;

public class CarrinhoPrincipal implements Icarrinho {

    private TextField tfTotalItens;

    private TextField tfidCarrinho;

    private TextField tfIdLinha;

    private TextField tftotalGeral;

    private TextField tfqtdItens;

    private Label msg_carrinho;
    public CarrinhoPrincipal(TextField tftotalItens, TextField tdidCarrinho, TextField tfidLinha, TextField totalGeral, TextField qtdItens, Label msg_carrinho){
        this.tfidCarrinho = tfidCarrinho;
        this.tfqtdItens = tfqtdItens;
        this.tfTotalItens = tfTotalItens;
        this.tftotalGeral = tftotalGeral;
        this.tfIdLinha = tfIdLinha;
    }


    @Override
    public void inserirCarrinho(Login L, Pagamento PG) throws SQLException {

    }

    @Override
    public void inserirCarrinhoIt(Login L, Pagamento PG) throws SQLException {

    }

    @Override
    public void buscarCarrinhoIt(Login L, Pagamento PG) throws SQLException {

    }

    @Override
    public void excluirCarrinhoIt(Login L, Pagamento PG) throws SQLException {

    }

    @Override
    public void atualizarCarrinhoIt(Login L, Pagamento PG) throws SQLException {

    }
}
