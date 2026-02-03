import java.util.*;
public class Circle{

    public static void Circumference(int r){
        double cir=2*3.14*r;
        System.out.println(cir);

       
    }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    Circumference(r);
//     double result=Circumference(r);
// System.out.println(result);
//
}

}