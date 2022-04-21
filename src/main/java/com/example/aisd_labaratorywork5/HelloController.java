package com.example.aisd_labaratorywork5;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {
    Queue queue = new Queue();
    Stack stack = new Stack();
    @FXML
    private Button startButton;

    @FXML
    private TextField input;

    @FXML
    private TextField fifotext;

    @FXML
    private TextField lifotext;

    @FXML
    protected void clickAdd() {
        fifotext.clear();
        lifotext.clear();
        double buff;
        String[] array = input.getText().split(" ");
        for (int i = 0; i < array.length; i++) {
            buff = Double.parseDouble(array[i]);
            queue.addNode(buff);
            stack.addNode(buff);
        }
        fifotext.appendText((queue.getStringQueue()));
        lifotext.appendText((stack.getStringStack()));
    }

    @FXML
    protected void clickDelete() {
        fifotext.clear();
        lifotext.clear();
        queue.deleteNode();
        stack.deleteNode();
        fifotext.appendText((queue.getStringQueue()));
        lifotext.appendText((stack.getStringStack()));
    }
}