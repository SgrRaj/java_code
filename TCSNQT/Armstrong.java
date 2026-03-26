//Write a program to check whether a number is Armstrong number or not.

// e.g num=153 
// 1 pow 3 + 5 pow 3 + 3 pow 3 = num


 
import java.util.*;
class Armstrong{
     public static boolean isArm(int n){
        int count=0,num=n;
        while(n>0){
        n/=10;
         count++;
        }

        n=num;
        int sum=0;
        while(n>0){
            int last=n%10;
            sum=sum+Math.pow(last,count);
            n/=10;
        }
        return sum==num;
    }

public static void main(String[] args){
    System.out.println(isArm(153));
}

}


