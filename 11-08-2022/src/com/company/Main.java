package com.company;

public class Main {

    public static void main(String[] args) {
        StackArrayInt st1 = new StackArrayInt(10);
        st1.push(10);
        st1.push(100);
        System.out.println(st1.pop());
        System.out.println(st1.pop());
        System.out.println(st1.pop());

        for (int i = 0; i < 10; i++) {
            st1.push(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(st1.pop());
        }

        StackArrayString st2 = new StackArrayString(10);
        st2.push("qwerty");
        System.out.println(st2.pop());

        System.out.println("-----");


        Stack<Integer> st3 = new Stack<>(10);
        st3.push(10);
        st3.push(100);
        System.out.println(st3.pop());
        System.out.println(st3.pop());
        System.out.println(st3.pop());

        for (int i = 0; i < 10; i++) {
            st3.push(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(st3.pop());
        }
    }

}


