import model.login;
import persistence.ConnectDB;
import controller.loginPrincipal;
import persistence.loginDB;


import java.sql.SQLException;




public class Main {

    public static void main(String[] args) {
        try{
            loginDB Login = new loginDB();
            login loginm = new login();
            loginm.setUsuario("leonardo.destro");
            Login.inserirLogin(loginm);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

