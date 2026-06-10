import java.util.Scanner;
class SpaceIndex{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String ");
        String s=sc.nextLine();
        spaceIndex(s);

    }
    public static void spaceIndex(String str){
       
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                System.out.print(i+" ");
            }
        }
    }
}