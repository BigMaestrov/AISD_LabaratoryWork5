package com.example.aisd_labaratorywork5;

//Очередь
public class Queue {
    Node head;

    //Элемент очереди "узел"
    public class Node {
        double value;
        Node next;

        public Node(double value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(double value) {
            this.value = value;
            this.next = null;
        }

        public Node() {
            this.value = 0;
            this.next = null;
        }
    }

    //Конструктор списка
    public Queue() {
        head = new Node();
    }

    public String getStringQueue(){
        String buffer = " ";
       for(int i = 1;i<getLength();i++){
           buffer+=Double.toString(this.getNodeValue(i));
       }
       return buffer;
    }

    public Node getNode(int index) {
        //Проверка на отрицательный индекс
        if (index < 1) {
            System.err.println("Ошибка ввода индекса, индекс должен быть целочисленным числом больше 0");
            return null;
        }
        //Проверка на выход за границы списка
        if (index > getLength()) {
            System.err.println("Элемент с указанным индексом не найден");
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public double getNodeValue(int index) {
        return getNode(index).value;
    }

    //Вставка в конец
    public void addNode(double val) {
        Node newNode = new Node(val);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void deleteNode() {
        head = head.next;
    }

    public int getLength() {
        int length = 0;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        return length;
    }
}

