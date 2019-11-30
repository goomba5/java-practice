import java.util.Arrays;

public class ArrayMinMaxApp {
    public static void main(String[] args) {
        // write a java program to find the maximum and minimum value of an array

        int[] arr = {10, 7, 3, 25, 4, 20};
        int[] arr1 = {-10, 7, 3, -25, 4, 20};
        int[] arr2 = {100, 7, -1, 5, 4, 20};

        // Test 1
        printMinAndMax(arr);

        // Test 2
        printMinAndMax(arr1);

        // Test 3
        printMinAndMax(arr2);
    }
    public static void printMinAndMax(int[] arr){
        int maximum = findMaxInteger(arr);
        int minimum = findMinInteger(arr);

        System.out.println("The smallest number is " + minimum + " and the largest number is " + maximum);
    }

    public static int findMaxInteger(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMinInteger(int[] arr){
        int min = arr[0];

        for(int i = 1; i < arr.length - 1; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
