package controller;

import model.login;
import model.pagamento;

import java.sql.SQLException;

public interface Icarrinho {
    void inserirCarrinho(login L, pagamento PG) throws SQLException;
    void inserirCarrinhoIt(login L, pagamento PG) throws SQLException;
    void buscarCarrinhoIt(login L, pagamento PG) throws SQLException;
    void excluirCarrinhoIt(login L, pagamento PG) throws SQLException;
    void atualizarCarrinhoIt(login L, pagamento PG) throws SQLException;
}
