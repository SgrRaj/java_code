import java.util.Scanner;
class ReverseStringFrom0Index{
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a String ");
        String str=sc.nextLine();
        System.out.println(reverseOrder(str));
    }
    public static String reverseOrder(String s){
        String rev="";
        for(int i=0;i<s.length();i++){
            rev=s.charAt(i)+rev;
        }
        return rev;
    }
}