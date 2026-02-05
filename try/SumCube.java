import java.util.*;

class SumCube{
    public static void SumOfCube(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i*i*i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            SumOfCube(a);
            
    }
}

