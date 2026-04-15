import java.util.*;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // size
        int[] arr = new int[n];

        // array input
        for (int k = 0; k < n; k++) {
            arr[k] = sc.nextInt();
        }

        int i = sc.nextInt();   // first index
        int j = sc.nextInt();   // second index

System.out.println("Reached here"); 
        // swap
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        // output
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}