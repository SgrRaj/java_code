import java.util.*;


class DswapString{

    public static void SwapS(String a,String b){
        String temp;
     temp=a;
     a=b;
     b=temp;
     System.out.println(a);
     System.out.println(b);

    }
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          String a=sc.nextLine();
          String b=sc.nextLine();
          SwapS(a,b);
    }
}