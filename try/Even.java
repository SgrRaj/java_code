import java.util.*;

class Even{
    public static void EvenTill(int n){
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
            
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        EvenTill(a);
    }
}