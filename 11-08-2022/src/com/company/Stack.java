package com.company;

// В этом классе определяется строковый стек,
// где можно хранить до length строковых значений
public class Stack <T> {

    T[] array;
    int top;

    // инициализировать массив и вершину стека
    public Stack(int length) {
        array = (T[]) new Integer[length];
        top = -1;
    }

    // добавить элемент в стек
    public void push(T item) {
        if (top == array.length - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
            array[top] = item;
        }
    }

    // извлечь элемент из стека
    public T pop() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return (T) "";
        } else {
            T value = array[top];
            top--;
            return value;
        }
    }

}
