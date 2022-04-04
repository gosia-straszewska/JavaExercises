package algo;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;

public class SortDemo {
    public static void main(String[] args) {
        final int n = 100;
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        printArray(arr);
        long startTime = System.currentTimeMillis();
        System.out.println();

        for (int number : arr){
            if(number == 12){
                System.out.println("\u001B[31m" + "Jest" + "\u001B[0m");
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Przeszukanie trwa: " + (endTime - startTime));

        Arrays.sort(arr);
        Arrays.binarySearch(arr, 12);
        System.out.println();
        System.out.println("********");
        printArray(arr);
    }

    public static void  printArray(int[] array){
        for (int x : array){
            System.out.print(x + " ");
        }
    }

}
