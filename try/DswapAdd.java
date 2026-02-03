import java.util.*;
class DswapAdd{
    public static void SwapTwoNo(int a,int b){
         
       a=a+b;
       b=a-b;
       a=a-b;
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

//It works only for interger value.