import java.util.Arrays;

public class ArrayRemoveElement {
    public static void main(String[] args) {
        // write a java program to remove a specific element from an array

        int[] arr = {1, 2, 3, 4, 5};

        removeArrElement(arr, 3);
    }
    public static void removeArrElement(int[] arr, int index){
        int[] newArray = new int[arr.length - 1]; // each time an element is removed, the new array will decrease by 1

        for(int i = 0, j = 0; i < arr.length; i++){

            // skip the element if the index is equal to the input index
            // so it is not added to the new array
            if(index == i){
                continue;
            }
            newArray[j++] = arr[i];
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Element at index " + index + " has been removed from " + Arrays.toString(arr));
        System.out.print("New array: " + Arrays.toString(newArray));
    }
}
