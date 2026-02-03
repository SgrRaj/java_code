import java.util.*;

class P1toN{
    public static void printNum(int n){
        for(int i=0;i<=n;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       printNum(a);
    }
}