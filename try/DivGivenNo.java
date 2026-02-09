import java.util.*;
class DivGivenNo{

    public static void Divisiblity(int n){
        for (int i=1;i<=n/2;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Divisiblity(a);

    }
}