import model.login;
import persistence.loginDB;
import java.sql.SQLException;
public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
            loginDB Login = new loginDB();
            login loginm = new login();
            loginm.setSenha("310802Gi");
            loginm.setUsuario("leonardo.destro");
            Login.atualizarLogin(loginm);
    }

}


