import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
//        int a = -1000, b = 1000;  //если диапазон  сделать любым

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
//          случайное целое число  в диапазоне от а до b
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int)((b-a)*Math.random()+a);
//        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input item");
        int item = scanner.nextInt();

        System.out.println(binarySearch(array, item));

       // System.out.println(fact(3));

    }
    private static int binarySearch(int[] array, int item) {
        int count = 0;
        int low = 0;                    // нижняя граница поиска
        int high = array.length - 1;    // верхняя граница поиска
        while (low <= high) {
            count++;
            int mid = (low + high) / 2;
            System.out.println(low+"+"+high+"/2="+mid+" - mid");
            int guess = array[mid];
            System.out.println("guess: "+guess);
            if (guess == item) {        // элемент найден
                System.out.println("Times: "+count);
                return mid;
            }
            if (guess > item) {         // "Много"
                high = mid - 1;
            } else {
                low = mid + 1;          // "Мало"
            }
        }
        System.out.println("Times: "+count);
        return -1;
    }

    private static int fact(int n){
       if (n==1){return 1;}
        return fact(n-1)*n;
    }
}
