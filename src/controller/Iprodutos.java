package controller;

import model.Produtos;

import java.sql.SQLException;
public interface Iprodutos {
    void inserirProdutos(Produtos pr) throws SQLException,ClassNotFoundException;
    void buscarProdutos(Produtos pr) throws SQLException,ClassNotFoundException;
    void atualizarProdutos(Produtos pr) throws SQLException,ClassNotFoundException;
    void excluirProdutos(Produtos pr) throws SQLException,ClassNotFoundException;
}
