package persistence;

import model.Produtos;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class ProdutosDB {

    private Connection c;

    public ProdutosDB() throws ClassNotFoundException, SQLException {
        ConnectDB cDB = new ConnectDB();
        c = cDB.getConnection();
    }

    public void inserirProdutos(Produtos p) throws SQLException {
        String sql = "INSERT INTO itens (descricao,preço) values (?,?)";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, p.getPreço());
        ps.setString(2, p.getDescricao());
        ps.execute();
        ps.close();
    }

    public void buscarProdutos(Produtos p) throws SQLException {
        String sql = "Select codigo, descricao, preço from cliente";
        List<Produtos> produtos1 = new ArrayList<>();
        PreparedStatement ps = c.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        //colocar while caso traga a tabela sem diferenciar os registros no try
        try {
            ps.setLong(1, p.getIditem());
            ps.setString(2, p.getDescricao());
            ps.setDouble(3, p.getPreço());
        } catch (NullPointerException nexc){
            JOptionPane.showMessageDialog(null, "Não há Produtos cadastrados.\n");
        }
        ps.close();
        ps.close();
    }

    public void excluirProdutos(Produtos p) throws SQLException {
        String sql = "DELETE FROM itens where codigo = ?";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setLong(1, p.getIditem());
        ps.execute();
        ps.close();
    }

    public void atualziarProdutos(Produtos p) throws SQLException {
        String sql = "UPDATE Produtos SET preço = ?, descricao = ? where codigo = ?";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, p.getDescricao());
        ps.setString(2,p.getDescricao());
        ps.setLong(3, p.getIditem());
        ps.execute();
        ps.close();
    }
}
