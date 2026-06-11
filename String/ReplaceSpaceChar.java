import java.util.Scanner;
class ReplaceSpaceChar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String ");
        String s=sc.nextLine();
        String res=replaceSpaceChar(s);
        System.out.println(res);
    }

    public static String replaceSpaceChar(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                s=s.substring(0,i)+'_'+s.substring(i+1);
            }
        }
        return s;
    }
}