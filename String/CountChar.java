import java.util.Scanner;
class CountChar{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        System.out.println(countChar(str));
    }

    public static int countChar(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z'){
                count++;
            }
        }
        return count;
    }
}