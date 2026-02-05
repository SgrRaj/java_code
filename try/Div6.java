import java.util.*;

class Div6{
    public static void DivBy(int n){
        for(int i=1;i<=n;i++){
            if(i%6==0){
                System.out.println(i);
            }
         
            
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        DivBy(a);
    }
}

