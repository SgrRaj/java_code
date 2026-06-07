import java.util.Scanner;

class CountNum{
    public static void main(String[] args){
      
        Scanner sc =new Scanner(System.in);
         System.out.println("Enter a string:");
        String str=sc.nextLine();
        System.out.println(countNum(str));
        sc.close();


    }
    public static int countNum(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                count++;
            }
        }
        return count;
    }
}