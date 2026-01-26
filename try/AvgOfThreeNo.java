import java.util.*;
public class AvgOfThreeNo{
    public static void Avg(int a,int b,int c){
        int Avg=(a+b+c)/3;
        System.out.println(Avg);
        return;
    }

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();

    Avg(a,b,c);

}
}