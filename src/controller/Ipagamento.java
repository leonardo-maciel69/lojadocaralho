package controller;

import model.pagamento;

import java.sql.SQLException;
public interface Ipagamento {

    void inserirPagamento(pagamento p) throws SQLException, ClassNotFoundException;
    void buscarPagamento(pagamento p) throws SQLException,ClassNotFoundException;
    void atualizarPagamento(pagamento p) throws SQLException, ClassNotFoundException;
    void excluirPagamento(pagamento p) throws SQLException, ClassNotFoundException;

    }