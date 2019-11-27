import java.util.Arrays;

public class AddElementToArray {
    public static void main(String[] args) {
        // write a java program that can insert an element at a specific position
        // within an array

        int[] arr = {1, 2, 3, 4, 5};

        addElementToArray(arr, 5, 0);
    }
    public static void addElementToArray(int[] arr, int element, int index){
        int[] newArray = new int[arr.length + 1];
        int arrLength = arr.length;

        for(int i = 0; i < arrLength + 1; i++){

            if(i <= index - 1){
                newArray[i] = arr[i];
            } else if(i == index) {
                newArray[i] = element;
            } else {
                newArray[i] = arr[i - 1];
            }
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Array after element added: " + Arrays.toString(newArray));
    }
}
