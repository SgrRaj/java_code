import java.util.Scanner;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int res = 0;
        for (int n : nums) {
            res = res ^ n;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

       
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       
        SingleNumber obj = new SingleNumber();
        int result = obj.singleNumber(arr);

       
        System.out.println("Single Number is: " + result);

        
    }
}