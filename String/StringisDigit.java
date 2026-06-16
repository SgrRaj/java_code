import java.util.Scanner;
class StringisDigit{
public static void main(String[] args){
Scanner sc =new Scanner(System.in); 
System.out.println("Enter a String ");
String s=sc.nextLine();
boolean res=isDigit(s);
if(res){
    System.out.println("String is Digit");
}
else {
    System.out.println("String is not Digit");  
}
}
public static boolean isDigit(String s){
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)<'0' || s.charAt(i)>'9'){
            return false;
        }
    }
    return true;
}

}