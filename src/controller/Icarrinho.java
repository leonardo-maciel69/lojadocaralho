package controller;

import model.Login;
import model.Pagamento;

import java.sql.SQLException;

public interface Icarrinho {
    void inserirCarrinho(Login L, Pagamento PG) throws SQLException;
    void inserirCarrinhoIt(Login L, Pagamento PG) throws SQLException;
    void buscarCarrinhoIt(Login L, Pagamento PG) throws SQLException;
    void excluirCarrinhoIt(Login L, Pagamento PG) throws SQLException;
    void atualizarCarrinhoIt(Login L, Pagamento PG) throws SQLException;
}
