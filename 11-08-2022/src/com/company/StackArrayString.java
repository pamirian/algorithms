package com.company;

// В этом классе определяется строковый стек,
// где можно хранить до length строковых значений
public class StackArrayString {

    String[] array;
    int top;

    // инициализировать массив и вершину стека
    public StackArrayString(int length) {
        array = new String[length];
        top = -1;
    }

    // добавить элемент в стек
    public void push(String item) {
        if (top == array.length - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
            array[top] = item;
        }
    }

    // извлечь элемент из стека
    public String pop() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return "";
        } else {
            String value = array[top];
            top--;
            return value;
        }
    }

}