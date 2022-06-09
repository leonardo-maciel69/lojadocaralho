package controller;

import model.Pagamento;

import java.sql.SQLException;
public interface Ipagamento {

    void inserirPagamento(Pagamento p) throws SQLException, ClassNotFoundException;
    void buscarPagamento(Pagamento p) throws SQLException,ClassNotFoundException;
    void atualizarPagamento(Pagamento p) throws SQLException, ClassNotFoundException;
    void excluirPagamento(Pagamento p) throws SQLException, ClassNotFoundException;

    }