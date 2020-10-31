import java.util.Arrays;

public class Arrays3 {
    
    public static void main(String[] args ){
        // Methods on Arrays 
        int intArr[] = {10, 20, 30, 40, 50, 23, 45};

        // List<T> asList(T a)
        System.out.println("Integer List of intArr : " + Arrays.asList(intArr));

        // static int binarySearch( elementToBeSeached );
        Arrays.sort(intArr);

        // int binarySearch(T[] a, int frontindex, int endindex, T key, comparator<T> c)
        System.out.println("Element 10 is present at " + Arrays.binarySearch(intArr,10));
        System.out.println("Element 10 is present at " + Arrays.binarySearch(intArr, 0, 4, 10));

        // compare(arr1, arr2)

        int intArr2[] = {10, 20, 45};
        System.out.println( Arrays.compare(intArr, intArr2)) ;

        // copyOf(originalArray, newlength ) - adds padded 0's if necessary

        int temp[] = Arrays.copyOf(intArr, 10);
        System.out.println("Copy array is " + Arrays.toString(temp));

        // copyOfRange(original, frontIndex, endIndex)

        temp = Arrays.copyOfRange(temp, 1, 4);
        System.out.println(temp);

        // deepEquals(Objectt[] o1, Object[] o2) - return true if two arrays are deeply equal to each other 

        // boolean equals(arr1, arr2) ; true if 2 arrays are equal 

        // fill(originalArray, fillValue): -  fills the original array with fillvalue 
        Arrays.fill(intArr, 23);
        System.out.println("Filled array = " + Arrays.toString(intArr));


        byte b = 4;
        intArr[0] = b;

        char ch = 'b';
        intArr[1] = ch;  // takes the ascii value 
        System.out.println(Arrays.toString(intArr));

    }

}