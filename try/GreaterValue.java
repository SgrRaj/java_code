import java.util.*;
public class GreaterValue{
    public static int CompareValue(int a,int b){
        if(a<b){
            return b;
        }
        else return a;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
     int g=  CompareValue(a,b);
       System.out.println(g);
    }
}