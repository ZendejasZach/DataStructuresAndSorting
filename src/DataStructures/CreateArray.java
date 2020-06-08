package DataStructures;

public class CreateArray {
    public static int[] createArray(){
        // create a random array
        int[] array = new int[10];
        //define the range for random
        int max = 10;
        int min = 1;
        int range = max - min + 1;

        // populate the array
        for(int i = 0; i < 10; i++){
            array[i] = (int) (Math.random() * range) + min;
        }
        return array;
    }

}
