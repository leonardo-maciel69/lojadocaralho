package persistence;

import model.produtos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class produtosDB {

    private Connection c;

    public produtosDB() throws ClassNotFoundException, SQLException {
        ConnectDB cDB = new ConnectDB();
        c = cDB.getConnection();
    }

    public void inserirProdutos(produtos p) throws SQLException {
        String sql = "INSERT INTO itens (descricao,preço) values (?,?)";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, p.getPreço());
        ps.setString(2, p.getDescricao());
        ps.execute();
        ps.close();
    }

    public void buscarProdutos(produtos p) throws SQLException {
        String sql = "Select codigo, login, cpf from cliente";
        List<produtos> produtos1 = new ArrayList<>();
        PreparedStatement ps = c.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        int count = 0;
        if (rs.next()) {
            ps.setLong(1, p.getIditem());
            ps.setString(2, p.getDescricao());
            ps.setInt(3, p.getPreço());
            count++;
        }
        if (count==0) {
            p = new produtos();
            produtos p1 = new produtos();
            p.setDescricao(String.valueOf(p1));
        }
        ps.close();
    }

    public void excluirProdutos(produtos p) throws SQLException {
        String sql = "DELETE FROM itens where codigo = ?";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setLong(1, p.getIditem());
        ps.execute();
        ps.close();
    }

    public void atualziarProdutos(produtos p) throws SQLException {
        String sql = "UPDATE produtos SET preço = ? where codigo = ?";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, p.getDescricao());
        ps.setLong(2, p.getIditem());
        ps.execute();
        ps.close();
    }
}
