package sample;

import java.util.ArrayList;
import java.util.Arrays;

public class Model {
    public boolean isCorrectLogin(String name, String password){

        if(name.equals("Sarah") && password.equals("1234")){
            return true;
        }
        else{
            System.err.println("Wrong username or password!");
        }
        return false;
    }

    ArrayList<String> positiveAnswers = new ArrayList<String> (Arrays.asList("It is certain.", "It is decidedly so.", "Without a doubt.", "Yes – definitely.", "You may rely on it.", "As I see it, yes.", "Most likely.", "Outlook good.", "Yes.", "Signs point to yes."));
    ArrayList<String> neutralAnswers = new ArrayList<String> (Arrays.asList("Reply hazy, try again.", "Ask again later.", "Better not tell you now.", "Cannot predict now.", "Concentrate and ask again."));
    ArrayList<String> negativeAnswers = new ArrayList<String> (Arrays.asList("Don’t count on it.", "My reply is no.", "My sources say no.", "Outlook not so good.", "Very doubtful."));


}
