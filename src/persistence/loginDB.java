package persistence;

import controller.Ilogin;
import model.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class loginDB implements Ilogin {

    private Connection c;

    public loginDB() throws ClassNotFoundException, SQLException{
        ConnectDB cDB = new ConnectDB();
        c = cDB.getConnection();
    }
    public void inserirLogin(login l) throws SQLException {
        String sql = "INSERT INTO cliente (login,senha,cpf) values (?,?,?)";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, l.getUsuario());
        ps.setString(2, l.getSenha());
        ps.setString(3, l.getCpf());
        ps.execute();
        ps.close();
    }

    public void buscarLogin(login l) throws SQLException {
        String sql = "Select login, cpf where from cliente";
        List<login> logins = new ArrayList<>();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.execute();
        ps.close();
    }

    public void excluirLogin(login l) throws SQLException {
        String sql = "DELETE FROM cliente where codcli = ?";
        PreparedStatement ps = c.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        int count = 0;
        if (rs.next()) {
            ps.setLong(1, l.getId());
            count++;
        }
        if (count==0) {
            l = new login();
            login l1 = new login();
            l.setUsuario(String.valueOf(l1));
        }
        ps.close();
    }

    public void atualizarLogin(login l) throws SQLException {
        String sql = "UPDATE cliente SET senha = ? where login = ?";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, l.getSenha());
        ps.setString(2, l.getUsuario());
        ps.execute();
        ps.close();
    }
}
