import java.util.*;
class Dswap{
    public static void SwapTwoNo(int a,int b){
         int  temp;
         temp=a;
         a=b;
         b=temp;
         System.out.println(a);
         System.out.println(b);
         return;

    }

    

    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter First Number");
       int a=sc.nextInt();
       
              System.out.println("Enter second Number");

       int b=sc.nextInt();
       SwapTwoNo(a,b);
    }
}