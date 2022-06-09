package persistence;

import controller.Ilogin;
import model.Login;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoginDB implements Ilogin {
    private Connection c;
    public LoginDB() throws ClassNotFoundException, SQLException{
        ConnectDB cDB = new ConnectDB();
        c = cDB.getConnection();
    }
    public void inserirLogin(Login l) throws SQLException {
        String sql = "INSERT INTO cliente (Login,senha,cpf) values (?,?,?)";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, l.getUsuario());
        ps.setString(2, l.getSenha());
        ps.setString(3, l.getCpf());
        ps.execute();
        ps.close();
    }

    public void buscarLogin(Login l) throws SQLException {
        String sql = "Select Login, cpf from cliente";
        List<Login> Logins = new ArrayList<>();
        PreparedStatement ps = c.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        try {
            ps.setString(1, l.getUsuario());
            ps.setString(2, l.getCpf());
        } catch (NullPointerException nexc){
            JOptionPane.showMessageDialog(null, "Não há Logins cadastrados.\n");
        }
        ps.close();
    }

    public void excluirLogin(Login l) throws SQLException {
        String sql = "DELETE FROM cliente where codcli = ?";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.execute();
        ps.close();
    }

    public void atualizarLogin(Login l) throws SQLException {
        String sql = "UPDATE cliente SET senha = ? where Login = ?";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, l.getSenha());
        ps.setString(2, l.getUsuario());
        ps.execute();
        ps.close();
    }
}
