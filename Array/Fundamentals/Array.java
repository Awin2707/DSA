import java.util.Arrays;

public class Array {

    //An array is a linear data structure that stores multiple values of the same data type in contiguous memory locations and allows access using an index.
    // address formaula = baseAddress + (i * size of array ) ex: 1000 + (1 * 4) => 1004.
    // arrays are always static. if we need a dynamic array we need to use ArrayList
    /*
        array index allways start with zero
        int arr = {10,02,31}; // size of int is 4 bytes
        index value address
        0     10    1000
        1     02    1004
        2     31    1008 
    */
   //array access in read and write O(1). insert or delete in end => O(1). insert or delete in start => O(n). insert or delete in middle => O(n). Search in sorted array => O(log n). unsorted array => O(n)  
    public static void main(String[] args) {
        //array declaration types;
        int[] arr = {1,2,4,6,77,1}; // static array
        int[] arrs = new int[3]; //static array
        arrs[0] = 1;
        arrs[1] = 2;
        arrs[2] = 2;
        // arrs[3] = 4; its throws a error like array index out bound if we use it
        System.out.println("dynamic array : "+Arrays.toString(arr) + ", static array" + Arrays.toString(arrs));
        //Default value in java
        int[] ints = new int[5];
        float[] floats = new float[5];
        boolean[] bool = new boolean[5];
        Object[] object = new Object[2];
        System.out.println("int default value : " +ints[0] +", float default value : "+ floats[0] + ", bool default value : " + bool[0] + ", object default value : "+ object[0]);
    }
}
