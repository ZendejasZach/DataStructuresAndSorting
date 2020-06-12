package DataStructures;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Stack {
    // main Stack program
    public static int[] stack(int[] array){
        int run = 1;
        // create pointer to make working with Array variable easier

        while(run == 1){
            System.out.println("Please select an operation:");
            System.out.println("[1] Push");
            System.out.println("[2] Pop");
            System.out.println("[0] Return to Main Menu");

            //get input from user
            Scanner in = new Scanner(System.in);
            int s = Integer.parseInt(in.nextLine());

            switch (s) {
                case 1:
//                    int[] pushArray = new int[Array.getLength(array) + 1];
                    System.out.println("What would you like to push?");
                    int num = Integer.parseInt(in.nextLine());
                    array = push(array, num);
//                    array=pushArray;
                    System.out.println("The array is now: " + Arrays.toString(array));
                    break;

                case 2:
//                    int[] popArray = new int[Array.getLength(array) - 1];
                    System.out.println("Initiating pop");
                    array = pop(array);
//                    array = popArray;
                    System.out.println("The array is now: " + Arrays.toString(array));
                    break;

                case 0:
                    run = 0;
                    break;

                default:
                    System.out.println("Input not recognized.");
                    break;

            }
        }
        return array;
    }

    //push and pop functions
    private static int[] pop(int[] array) {
        int size = Array.getLength(array) - 1;
        int[] newArray = new int[size];

        for (int i = 1; i <= size; i++){
            newArray[i - 1] = array[i];
        }
        return newArray;
    }

    private static int[] push(int[] array, int num) {
        // establish parameters of the stack
        int maxsize = Array.getLength(array);
        int[] newArray = new int[maxsize + 1];

        // create the new array
        for (int i = 0; i < maxsize + 1; i++) {
            if (i == 0)
                newArray[i] = num;
            else
                newArray[i] = array[i - 1];
        }
        return newArray;
    }
}
