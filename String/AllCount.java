import java.util.Scanner;
class AllCount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        countAll(s);
        
    }
    public static void countAll(String str){
        int countSpace=0;
        int countChar=0;
        int countNum=0;
        int countSpecialChar=0;
        for(int i=0;i<str.length();i++){
            Character c=str.charAt(i);
            if(c>='a' && c<='z' || c>='A' && c<='Z'){
                countChar++;
            }
            else if(c>='0' && c<='9'){
                countNum++;
            }
            else if(c==' '){
                countSpace++;
            }
            else{
                countSpecialChar++;
            }   
        }
        System.out.println("Number of characters: "+countChar);
        System.out.println("Number of numbers: "+countNum);             
        System.out.println("Number of spaces: "+countSpace);
        System.out.println("Number of special characters: "+countSpecialChar);
        
    }
}

