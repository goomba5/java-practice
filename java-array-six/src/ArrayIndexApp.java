public class ArrayIndexApp {
    public static void main(String[] args) {
        // write a java program to find the index of an element

        int[] arr = {5, 10, 15, 20, 25};

        // Test 1
        System.out.println("Test 1");
        System.out.println(getElementIndex(arr, 5));
    }

    public static int getElementIndex(int[] array, int x){
        int index = 0;

        for(int i = 0; i < array.length; i++){
            int element = array[i];
            if(x == element){
                index = i;
            } else {
                index = -1;
            }
        }
        return index;
    }
}
