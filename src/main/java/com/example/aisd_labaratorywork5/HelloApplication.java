package com.example.aisd_labaratorywork5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 700, 600);
        stage.setTitle("AISD Labaratory 5");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch();
        /*
        Scanner scanner = new Scanner(System.in);
        int answer;
        double time;
        while (true) {
            System.out.print("Выберете тип списка: стек/очередь (1/2)" + "\n" + ">>");
            try {
                answer = scanner.nextInt();
                System.out.print("Выберете тип списка: стек/очередь (1/2)" + "\n" + ">>");
                if (answer == 1) {

                    //Число переменных
                    int n1 = 10;

                    //Инициализация
                    time = System.nanoTime();
                    Stack stack = new Stack();
                    System.out.println(System.nanoTime() - time);

                    //Добавление
                    time = System.nanoTime();
                    for (int i = 0; i < n1; i++) {
                        stack.addNode(0.1);
                    }
                    System.out.println(System.nanoTime() - time);

                    //Удаление
                    time = System.nanoTime();
                    for (int i = 0; i < n1; i++) {
                        stack.deleteNode();
                    }
                    System.out.println(System.nanoTime() - time);

                } else if (answer == 2) {

                    //Число переменных
                    int n2 = 10;

                    //Инициализация
                    time = System.nanoTime();
                    Queue queue = new Queue();
                    System.out.println(System.nanoTime() - time);

                    //Добавление
                    time = System.nanoTime();
                    for (int i = 0; i < n2; i++) {
                        queue.addNode(0.1);
                    }
                    System.out.println(System.nanoTime() - time);

                    //Удаление
                    time = System.nanoTime();
                    for (int i = 0; i < n2; i++) {
                        queue.deleteNode();
                    }
                    System.out.println(System.nanoTime() - time);

                } else {
                    System.out.println("Ошибка ввода");
                }
            } catch (Exception e) {
                scanner.next();
                System.out.println("Ошибка ввода");
            }
        }*/

    }
}