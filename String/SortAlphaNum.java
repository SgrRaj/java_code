import java.util.Scanner;
class SortAlphaNum{
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a String which contains ALpha as well as Number");
            String s=sc.nextLine();
           String res= sortAlphaNum(s);
  System.out.println(res);

    }

    public static String sortAlphaNum(String str){
        char[] arr =str.toCharArray();
        int i=0;
        int j=arr.length-1;
       while(i<j){
        if(Character.isLetter(arr[i])){
            i++;
        }
        else if(Character.isDigit(arr[j])){
            j--;
        }

         else {
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            i++;
                j--;
            }
        }
        return (new String(arr));
    }
}