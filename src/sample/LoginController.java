package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController extends Model{

    @FXML
    TextField userInput = new TextField();

    @FXML
    PasswordField passwordInput = new PasswordField();

    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private void next(){
        //navigate from welcome screen to main screen
        System.out.println("Navigation started ...");

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main.fxml"));
            Parent root = fxmlLoader.load();

            if(isCorrectLogin(userInput.getText(), passwordInput.getText())){
                Stage mainStage = new Stage();
                mainStage.setTitle("Main");
                mainStage.setScene(new Scene(root, 500, 300));
                mainStage.show();

                this.stage.close();
            }
        }
        catch (Exception ex){
            System.out.println("Exception occured while loading main view!");
        }
    }
}
