package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {

    @FXML
    private TextField mainText;
    @FXML
    private TextField tanxa;


    public void daatriale(ActionEvent actionEvent) {

        int tanxaINT = Integer.parseInt(tanxa.getText());


        int shvidiani = 0;
        int isshvidiani = 0;



        for(int i = 0; i < 3; i++)
        {
            char charAtZero = mainText.getText().charAt(i);
            if(charAtZero == '7')
            {
                isshvidiani = 1;
                shvidiani++;
            }

        }

        if(isshvidiani == 1)
        {
            tanxa.setText(Integer.toString(tanxaINT+shvidiani));
        }
        else
        {
            tanxa.setText(Integer.toString(tanxaINT-1));
        }


        Random random = new Random();

        // generate a random integer from 0 to 899, then add 100
        int rand = random.nextInt(900) + 100;
        mainText.setText(Integer.toString(rand));
        isshvidiani = 0;
    }
}
