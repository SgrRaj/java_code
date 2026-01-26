import java.util.*;
public class SumAllOdd{
    public static void PrintAllConOdd(int n){
        int add=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                continue;
            }
            else {
                add+=i;
            }
        }
        System.out.println(add);
    }

public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
 PrintAllConOdd(n);    
}

}