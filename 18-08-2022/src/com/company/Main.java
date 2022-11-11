package com.company;


public class Main {

    public static void main(String[] args) {

    Queue queue = new Queue();
    queue.add(10);
    queue.add(20);
    queue.add(30);
    while (!queue.isEmpty()) System.out.println(queue.delete());

    queue.add(40);
    System.out.println(queue.delete());



            // Дан файл действительных чисел и некоторое число С. Используя
            // очередь напечатать сначала все элементы меньшие числа С, а затем
            // все остальные.
            double[] data = new double[20];
            for (int i = 0; i < data.length; i++) {
                data[i] = 100 * Math.random();
                System.out.println(data[i]);
            }
            System.out.println();
            double c = 50.0;
            DQueue queue2 = new DQueue();
            for (int i = 0; i < data.length; i++) {
                if (data[i] < c)  {
                    System.out.println(data[i]);
                } else {
                    queue2.add(data[i]);
                }
            }
            while (!queue.isEmpty()) {
                System.out.println(queue2.delete());
            }
        }

}



