
public class Arrays1 {
    public static void main(String[] args){
        int a[] = new int[]{1,2,3};
        
        for (int i = 0; i < a.length ; ++i){
            System.out.print(a[i] + " ");
        }

        int b[] = new int[5];
        b[0] = 4;
        b[1] = 5;
        b[2] = 5;
        b[3] = 6;
        b[4] = 3;

        System.out.println();
        for (int i : b){
            System.out.print(i + " ");
        }
    }
}