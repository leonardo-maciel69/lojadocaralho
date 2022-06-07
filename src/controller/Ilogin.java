package controller;

import model.login;

import java.sql.SQLException;

public interface Ilogin {
    void inserirLogin (login L) throws ClassNotFoundException, SQLException;
    void buscarLogin (login L) throws ClassNotFoundException, SQLException;
    void atualizarLogin (login L) throws ClassNotFoundException, SQLException;
    void excluirLogin (login L) throws ClassNotFoundException, SQLException;
}
