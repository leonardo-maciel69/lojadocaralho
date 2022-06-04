package controller;


import persistence.loginDB;
import model.login;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;


public class loginPrincipal implements Ilogin {
    private TextField tfUsuarioCadastro;
    private TextField tfCpf;
    private TextField tfSenhaCadastro;
    private Label lbCadastrase;
    private Label lbLogin;


    public loginPrincipal(TextField tfNomeCadastro, TextField tfEmailCadastro, TextField tfSenhaCadastro, Label lbCadastrase, Label lbLogin) {
        this.tfUsuarioCadastro = tfUsuarioCadastro;
        this.tfSenhaCadastro = tfSenhaCadastro;
        this.lbCadastrase = lbCadastrase;
        this.lbLogin = lbLogin;
        this.tfCpf = tfCpf;
    }

    @Override
    public void inserirLogin(login L) throws ClassNotFoundException, SQLException {
        loginDB lDB = new loginDB();
        lDB.inserirLogin(L);
        lDB.excluirLogin(L);
        lDB.buscarLogin(L);
    }

    @Override
    public void atualizarLogin(login L) throws ClassNotFoundException, SQLException {
        loginDB lDB = new loginDB();
        lDB.atualizarLogin(L);
        lDB.excluirLogin(L);
        lDB.buscarLogin(L);

    }

    @Override
    public void excluirLogin(login L) throws ClassNotFoundException, SQLException {
        loginDB lDB = new loginDB();
        lDB.excluirLogin(L);
        lDB.excluirLogin(L);
        lDB.buscarLogin(L);

    }

    public void buscarLogin(login L) throws ClassNotFoundException, SQLException {
        loginDB lDB = new loginDB();
        lDB.buscarLogin(L);
        tfUsuarioCadastro.setText(L.getUsuario());
        tfCpf.setText(L.getCpf());
    }
    salve
}
