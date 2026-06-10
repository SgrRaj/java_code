import java.util.Scanner;
class PalindromWithOutReversing{
public static void main(String[] args){ 
Scanner sc =new Scanner(System.in);
System.out.println("Enter a String ");
String s=sc.nextLine();
palindrome(s);

}

public static void palindrome(String s){
    int i=0;
    int j=s.length()-1;

while(i<j){
if(s.charAt(i)==s.charAt(j)){  
    i++;
    j--;
}
else {
    System.out.println("Not Palindrome");
    return;
}
}
System.out.println("Palindrome");
}
}