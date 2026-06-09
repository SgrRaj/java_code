import java.util.Scanner;

class CountVowel{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  a String ");
        String str=sc.nextLine();
        int result=countVowel(str);
        System.out.println(result);

    }
    public static int countVowel(String str){
        int count =0;
        String s=str.toLowerCase();
        char[] vowels={'a','e','i','o','u'};
        for(int i=0;i<str.length();i++){
            Character ch=s.charAt(i);
            for(int j=0;j<vowels.length;j++){
                if(ch==vowels[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
}