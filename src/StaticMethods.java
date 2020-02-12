import java.util.Arrays;

public class StaticMethods {
    // Functions --> "Methods" (Function inside a class)
    public static void main(String[] args) {

        int result = add(10,20);
        System.out.println(result);

        printName("Vancouver");
        int x = 10;
        int y = 7;
        swap(x, y);
        System.out.println("x = " + x + ", y = " + y);

        int[] values = {1, 2, 3};
        changeFirstElement(values);  // passing reference
        System.out.println(Arrays.toString(values));

        int[] values2 = {1, 2, 3};
        changeFirstElement2(values);  // passing reference
        System.out.println(Arrays.toString(values2));

        // copying an array contents to a new array
        int[] values3 = values2.clone();
        int[] values4 = Arrays.copyOf(values2, values2.length);
        System.out.println(Arrays.toString(values3));
        System.out.println(Arrays.toString(values4));
        System.out.println(values2 == values3);
        System.out.println(values3 == values4);
    }
    // Static Method
    public static int add(int a, int b) {
        return a + b;
    }
    // Method Prototype (header)
    // public: means this method can be called from outside of this class
    // static: means we can call this method without creating a object of this class
    // void: it is empty -> no 'return' value
    // printName: method name
    // (String name): a parameter (Type param, Type param, ..)
    public static void printName(String name) {
        System.out.println(name);
    }
    // pass by values (primitive types)
    public static void swap(int a, int b) {  // this won't swap, we don't use it, only certain cases
        int temp = a;
        a = b;
        b = temp;
    }
    // pass by reference (reference types)
    public static void changeFirstElement(int[] arr) {  // array is not primitive type
        arr[0] = 100;  // modifies the first element of array to 100
    }
    public static void changeFirstElement2(int[] arr) {  // array is not primitive type
        int[] arr1 = {100, 2, 3};
        arr = arr1;
    }
}
