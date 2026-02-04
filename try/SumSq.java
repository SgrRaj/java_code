import java.util.*;

class SumSq{
    public static void SumOfSq(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i*i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            SumOfSq(a);
            
    }
}