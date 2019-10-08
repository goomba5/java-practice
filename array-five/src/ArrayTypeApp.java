import java.lang.reflect.Array;

public class ArrayTypeApp {
    public static void main(String[] args) {
        // write a Java program to test if an array contains a specific value

        String[] stringArray = {"a", "b", "c"};
        Class<?> stringType = stringArray.getClass().getComponentType();

        int[] intArray = {1, 2, 3};
        Class<?> intType = intArray.getClass().getComponentType();

        double[] doubleArray = {1.23, 2.22, 34.44};
        Class<?> doubleType = doubleArray.getClass().getComponentType();

        // print result
        System.out.println("First array is type " + stringType);
        System.out.println("Second array is type " + intType);
        System.out.println("Third array is type " + doubleType);
    }
//
//    public static Class<?> checkArrayType(Array[] array){
//        return array.getClass().getComponentType();
//    }
}
