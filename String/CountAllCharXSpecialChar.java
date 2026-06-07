import java.util.Scanner;

class CountAllCharXSpecialChar{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter the String ");
    String s=sc.nextLine();
   
    System.out.println(countAll(s));

   }
   public static int countAll(String str){
    int count =0;
    for(int i=0;i<str.length();i++){
        Character c=str.charAt(i);
        if(c>='a' && c<='z' || c>='A' && c<='Z' || c>='0' && c<='9'){
            count++;
        }
    }
    return count;
   }
}