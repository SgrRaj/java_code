import java.util.*;
class SumOfNf{
    public static void SumOfNformula(int n){
       int sum=0;
       sum=n*(n+1)/2;
       System.out.println(sum);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        SumOfNformula(a);
    }
}
