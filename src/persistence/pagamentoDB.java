package persistence;

import model.pagamento;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class pagamentoDB {

    private Connection c;

    public pagamentoDB() throws ClassNotFoundException, SQLException {
        ConnectDB cDB = new ConnectDB();
        c = cDB.getConnection();
    }

    public void inserirPagamento(pagamento p) throws SQLException {
        String sql = "INSERT INTO pagamento (formapagamneto, endereço, totalfrete) values (?,?,?)";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, p.getFormapagamento());
        ps.setString(2, p.getEndereco());
        ps.setDouble(3, p.getTotalFrete());
        ps.execute();
        ps.close();
    }

    public void buscarPagamento(pagamento p) throws SQLException {
        String sql = "SELECT id_pg, formapagamento, endereço, totalfrete FROM pagamento";
        List<pagamento> pagamentos = new ArrayList<>();
        PreparedStatement ps = c.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        try {
                ps.setLong(1, p.getId_pg());
                ps.setString(2, p.getFormapagamento());
                ps.setString(3, p.getEndereco());
        } catch (NullPointerException nexc){
            JOptionPane.showMessageDialog(null, "Não há pagamentos cadastrados.\n");
        }
        ps.close();
    }

    public void excluirPagamento(pagamento p) throws SQLException {
        String sql = "DELETE FROM pagamento where codigo = ?";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setLong(1, p.getId_pg());
        ps.execute();
        ps.close();
    }

    public void atualizarPagamento(pagamento p) throws SQLException {
        String sql = "UPDATE pagamento SET totalfrete = ?, endereço = ?, formapagamento = ? where id_pg = ?";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setDouble(1,p.getTotalFrete());
        ps.setString(2,p.getEndereco());
        ps.setString(3,p.getFormapagamento());
        ps.setLong(4,p.getId_pg());
        ps.execute();
        ps.close();
    }

}
