import java.util.*;

class SumOfN{
    public static void SumOfAll(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            SumOfAll(a);
    }
}