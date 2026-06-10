import java.util.Scanner;
class ReverseString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String ");
        String s=sc.nextLine();
        String result=reverseString(s);
        System.out.println(result);

    }
    public static String reverseString(String str){
    String rev="";
    for(int i=str.length()-1;i>=0;i--){  //last index se traverse kiye hai
        rev=rev+str.charAt(i);
    }
    return rev;
}
}