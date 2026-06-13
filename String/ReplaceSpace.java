import java.util.Scanner;
class ReplaceSpace{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
System.out.println("Enter a String ");
String s=sc.nextLine();
String s1=replace(s);
System.out.println(s1);
}
public static String replace(String s){
s=s.replace(' ','_'); 
return s;
}
}