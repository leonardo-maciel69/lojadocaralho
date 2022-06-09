import controller.CarrinhoPrincipal;
import controller.LoginPrincipal;
import controller.PagamentoPrincipal;
import controller.ProdutosPrincipal;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.awt.*;

public class Main {
    private LoginPrincipal logP = new LoginPrincipal();
    private PagamentoPrincipal pagP = new PagamentoPrincipal();
    private ProdutosPrincipal prdP = new ProdutosPrincipal();
    private CarrinhoPrincipal carP = new CarrinhoPrincipal();

    public void start(Stage stage) throws Exception {
        stage.setTitle("Login");
            TextField loginUsuario = new TextField();
            TextField idUsuario = new TextField();
            TextField senhaUsuario = new TextField();
            TextField cadastroUsuario = new TextField();
            TextField cadastroSenha = new TextField();
            TextField cadastroCpf = new TextField();
            Button btnlogin = new Button("Entrar");
            Button btncadastrar = new Button ("Cadastrar");
            Button btnexcluir = new Button ("Deletar");
            Button btnatualizar = new Button ("Atualizar informações");
            btnlogin.setStyle(("-fx-background-color:#352dd6; "));
            btncadastrar.setStyle(("-fx-background-color:#352dd6; "));
            btnexcluir.setStyle(("-fx-background-color:#352dd6; "));
            btnatualizar.setStyle(("-fx-background-color:#352dd6; "));

            GridPane tela2 = new GridPane();
            Scene scnScreenFunc = new Scene(tela2, 600, 250);
            GridPane tela1 = new GridPane();
            Scene scnScreenFuncTable = new Scene(tela1, 600, 250);

            btnlogin.setOnAction(e ->{
                if
                }
        }
    }
}



