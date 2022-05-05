package com.example.aisd_labaratorywork5;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {
    Queue queue;
    Stack stack;
    double time;

    @FXML
    private Button startButton;

    @FXML
    private TextField input;

    @FXML
    private TextField fifotext;

    @FXML
    private TextField lifotext;

    @FXML
    private TextField datatext;

    @FXML
    protected void clickAdd() {
        //Инициализация очереди и стека
        if (queue == null && stack == null) {

            time = System.nanoTime();
            queue = new Queue();
            time = System.nanoTime() - time;
            datatext.appendText("Queue init time: " + time + " | ");

            time = System.nanoTime();
            stack = new Stack();
            time = System.nanoTime() - time;
            datatext.appendText("Stack init time: " + time + " | ");
        }
        fifotext.clear();
        lifotext.clear();
        double buff;
        boolean incomingDataCorrect = true;
        String[] array = input.getText().split(" ");
        for (int i = 0; i < array.length; i++) {
            if (!isNumber(array[i])) {
                incomingDataCorrect = false;
            }
        }
        if (array.length > 0 && incomingDataCorrect) {
            for (int i = 0; i < array.length; i++) {
                buff = Double.parseDouble(array[i]);
                //Добавление в очередь и измерение времени
                time = System.nanoTime();
                queue.addNode(buff);
                time = System.nanoTime() - time;
                datatext.appendText("Queue add time: " + time + " | ");
                //Добавление в стек и измерение времени
                time = System.nanoTime();
                stack.addNode(buff);
                time = System.nanoTime() - time;
                datatext.appendText("Stack add time: " + time + " | ");
            }
            fifotext.appendText((queue.getStringQueue()));
            lifotext.appendText((stack.getStringStack()));
        } else {
            System.err.println("uncorrected data");
            input.clear();
        }
    }

    @FXML
    protected void clickDelete() {
        fifotext.clear();
        lifotext.clear();

        //Удаление из очереди и измерение времени
        time = System.nanoTime();
        queue.deleteNode();
        time = System.nanoTime() - time;
        datatext.appendText("Queue delete time: " + time + " | ");

        //Удаление из стека и измерение времени
        time = System.nanoTime();
        stack.deleteNode();
        time = System.nanoTime() - time;
        datatext.appendText("Stack delete time: " + time + " | ");

        fifotext.appendText((queue.getStringQueue()));
        lifotext.appendText((stack.getStringStack()));
    }

    public boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }
}