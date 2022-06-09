package controller;

import model.Login;

import java.sql.SQLException;

public interface Ilogin {
    void inserirLogin (Login L) throws ClassNotFoundException, SQLException;
    void buscarLogin (Login L) throws ClassNotFoundException, SQLException;
    void atualizarLogin (Login L) throws ClassNotFoundException, SQLException;
    void excluirLogin (Login L) throws ClassNotFoundException, SQLException;
}
