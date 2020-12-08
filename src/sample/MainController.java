package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Random;

public class MainController extends Model{
    @FXML
    TextField questionTxt = new TextField();

    @FXML
    Text answerTxt = new Text();

    @FXML
    public void getRandomAnswer() {
        ArrayList<String> answers = new ArrayList<String>();
        answers.addAll(positiveAnswers);
        answers.addAll(negativeAnswers);
        answers.addAll(neutralAnswers);

        Random random = new Random();
        int r = random.nextInt(20);

        if(questionTxt.getText().contains("?"))
        {
            answerTxt.setText(answers.get(r));
        }
        else if(questionTxt.getText().contains("Softwareentwicklung")) {
            answerTxt.setText(positiveAnswers.get(r));
        }
        else{
            System.err.println("This is not a question! At the end there must be a question mark!");
        }
    }
}
