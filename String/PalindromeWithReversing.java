import java.util.Scanner;
class PalindromeWithReversing{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String ");
String s=sc.nextLine(); 
palindrome(s);


}
public static void palindrome(String s){
String original=s;
String rev="";
for(int i=0;i<s.length();i++){
  
      rev=s.charAt(i)+rev;
      
}
 System.out.println("Reversed String is "+rev);
if(original.equals(rev)){
    System.out.println("Palindrome String  ");
}
else System.out.println("not  Palindrome  ");
}
}