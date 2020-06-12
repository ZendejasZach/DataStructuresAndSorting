package DataStructures;

import java.util.Arrays;
import java.util.Scanner;
import static DataStructures.CreateArray.createArray;
import static DataStructures.Stack.stack;

public class DataStructures {

    public static void main(String[] args) {
        int[] array = createArray();
        System.out.println("Welcome to my Data Structures Program");
        program(array);
    }

    private static int program(int[] array) {
        int run = 1;
        while (run == 1) {

            Scanner in = new Scanner(System.in);
            System.out.println("The array we will be using for this instance is: " + Arrays.toString(array));
            System.out.println("Please select a Data Structure to demonstrate:");
            System.out.println("[1] Stack");
//        System.out.println("[2] Queue");
//        System.out.println("[3] Heap");
//        System.out.println("[4] Linked List");
//        System.out.println("[5] Binary Tree");
//        System.out.println("[6] Hash Table");
//        System.out.println("[7] Linked Hash Map");
            System.out.println("[0] Exit Program");

            // grab user input
            int s = Integer.parseInt(in.nextLine());

            switch (s) {
                case 1:
                    //run Stack Program
                    array = stack(array);
                    break;

                case 0:
                    run = 0;
            }
        }
        return 0;
    }
}
