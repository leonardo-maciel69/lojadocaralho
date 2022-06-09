package controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Login;
import persistence.LoginDB;
import java.sql.SQLException;

public class LoginPrincipal implements Ilogin {
    private StringProperty UsuarioCadastro = new SimpleStringProperty("");
    private StringProperty SenhaCadastro = new SimpleStringProperty("");
    private StringProperty Cpf = new SimpleStringProperty("");

    private TableView<Login> tabLogin = new TableView<Login>();

    private ObservableList<Login> listObsLogin = FXCollections.observableArrayList();

    public LoginPrincipal() {
        TableColumn<Login, String> campo1 = new TableColumn<>("Login");
        TableColumn<Login, String> campo2 = new TableColumn<>("CPF");
        campo1.setCellValueFactory(new PropertyValueFactory<>("login"));
        campo2.setCellValueFactory(new PropertyValueFactory<>("cpf"));
        tabLogin.setItems(listObsLogin);
    }
    public StringProperty UsuarioCadastroProperty(){
        return UsuarioCadastro;
    }
    public StringProperty SenhaCadastroProperty(){
        return SenhaCadastro;
    }
    public StringProperty CpfProperty(){
        return Cpf;
    }

    @Override
    public void inserirLogin(Login L) throws ClassNotFoundException, SQLException {
        Login l = new Login();
        LoginDB lDB = new LoginDB();
        l.setUsuario(UsuarioCadastro.get());
        l.setSenha(SenhaCadastro.get());
        l.setCpf(Cpf.get());
        listObsLogin.add(l);
        lDB.inserirLogin(l);
        limparCampos();
    }

    @Override
    public void buscarLogin(Login L) throws ClassNotFoundException, SQLException {
        Login l = new Login();
        LoginDB lDB = new LoginDB();
        lDB.buscarLogin(l);
        limparCampos();
    }

    @Override
    public void atualizarLogin(Login L) throws ClassNotFoundException, SQLException {
        Login l = new Login();
        LoginDB lDB = new LoginDB();
        lDB.atualizarLogin(l);
        limparCampos();
    }

    @Override
    public void excluirLogin(Login L) throws ClassNotFoundException, SQLException {
        Login l = new Login();
        LoginDB lDB = new LoginDB();
        l.setUsuario(UsuarioCadastro.get());
        l.setCpf(Cpf.get());
        lDB.excluirLogin(l);
        limparCampos();
    }

    private void limparCampos() {
        UsuarioCadastro.set("");
        Cpf.set("");
        SenhaCadastro.set("");
    }

    public TableView<Login> getTabLogin(){
        return tabLogin;
    }
}
