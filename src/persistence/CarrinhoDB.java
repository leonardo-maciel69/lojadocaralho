package persistence;

import model.Carrinho;
import model.Login;
import model.Pagamento;
import model.Produtos;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDB {

    private Connection c;

    public CarrinhoDB() throws ClassNotFoundException, SQLException {
        ConnectDB cDB = new ConnectDB();
        c = cDB.getConnection();
    }
    public void inserirCarrinho(Login l, Pagamento pg) throws SQLException {
        String sql = "INSERT INTO Carrinho (total_it, total_geral, Login, totalfrete) values (?,?,?)";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setDouble(1, 0);
        ps.setDouble(2, 0);
        ps.setString(3, l.getUsuario());
        ps.setDouble(4,pg.getTotalFrete());
        ps.execute();
        ps.close();
    }
    public void inserirCarrinhoIt(Carrinho car, Produtos p, Login l) throws SQLException {
        String sql = "INSERT INTO carrinhoit (codigo, qtd_it, preço, id_car) values (?,?,?,?) ";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setLong(1, p.getIditem());
        ps.setInt(2, car.getQtdItens());
        ps.setDouble(3, p.getPreço());
        ps.setInt(4, car.getIdCarrinho());
        ps.execute();
        ps.close();
    }
    public void buscarCarrinhoIt(Carrinho car, Produtos p) throws SQLException {
        String sql = "Select id_linha, id_car, qtd_it, codigo, preço from carrinhoit";
        List<Carrinho> Carrinhos = new ArrayList<>();
        PreparedStatement ps = c.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        int count = 0;
        //colocar while caso traga a tabela sem diferenciar os registros no try catch
        try {
            ps.setLong(1, car.getIdLinha());
            ps.setLong(2, car.getIdCarrinho());
            ps.setInt(3, car.getQtdItens());
            ps.setLong(3, p.getIditem());
            ps.setDouble(5, p.getPreço());
        } catch (NullPointerException nexc){
            JOptionPane.showMessageDialog(null, "Não há itens no Carrinho.\n");
        }
        ps.close();
    }
    public void excluirCarrinhoIt(Carrinho car) throws SQLException {
        String sql = "DELETE FROM carrinhoit where id_linha = ?";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setLong(1, car.getIdLinha());
        ps.execute();
        ps.close();
    }
    public void atualizarCarinhoIt(Carrinho car, Produtos p) throws SQLException {
        String sql = "UPDATE carrinhoit SET id_car = ?, codigo = ?, qtd_it = ?, preço = ? where id_pg = ?";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setDouble(1,car.getIdCarrinho());
        ps.setLong(2,p.getIditem());
        ps.setInt(3,car.getQtdItens());
        ps.setLong(4,p.getPreço());
        ps.setLong(5,car.getIdLinha());
        ps.execute();
        ps.close();
    }
}
