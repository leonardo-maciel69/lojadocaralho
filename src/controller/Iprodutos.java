package controller;

import model.produtos;

import java.sql.SQLException;
public interface Iprodutos {
    void inserirProdutos(produtos pr) throws SQLException,ClassNotFoundException;
    void buscarProdutos(produtos pr) throws SQLException,ClassNotFoundException;
    void atualizarProdutos(produtos pr) throws SQLException,ClassNotFoundException;
    void excluirProdutos(produtos pr) throws SQLException,ClassNotFoundException;
}
