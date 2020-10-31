
public class Arrays2 {
    
    public static void main(String[] args){
        int arr[] = m();
        
        int a[][] = new int[2][];
        a[0] = new int[2];
        a[1] = new int[3];
        int c[][][] = new int[2][][];
        for (int b[] : a){
            for (int x : b){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        
        System.out.println(a.getClass());
        System.out.println(a.getClass().getSuperclass());

        int g[] = arr.clone();
        
        
    }

    public static int[] m(){
        return new int[]{1,2,3};
    }
}