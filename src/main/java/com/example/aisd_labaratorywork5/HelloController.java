package com.example.aisd_labaratorywork5;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.concurrent.TimeUnit;

public class HelloController {
    @FXML
    private Button startButton;

    @FXML
    private TextField input;

    @FXML
    private TextField fifotext;

    @FXML
    private TextField lifotext;

    @FXML
    protected void click() {
        startButton.setText("process...");
        System.out.println(input.getText());

        String[] array = input.getText().split(" ");
        for(int i = 0;i< array.length;i++){

            lifotext.appendText("["+i+"]"+array[i]+" ");
            fifotext.appendText("["+i+"]"+array[i]+" ");
        }

    }
}