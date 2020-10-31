public class FinalVariables1 {
    
    public static void main(String[] args){
        final int x = 0;
        final int a;
        a = 6;
        final int arr[] = new int[]{1,2,3};
        arr[0] = 4;
        System.out.println(x);
        for (int i = 0; i < arr.length ; ++i){
            System.out.println(arr[i]);
        }
    }
}