import java.util.Scanner;
class Path17{
public static void main(String[] args){
Scanner sc =new Scanner(System.in); 
System.out.println("Enter a String ");
String s=sc.nextLine(); 
String res=path(s);
System.out.println(res);

}

public static String path(String s){
    String s1="";
for(int i=s.length()-1;i>=0;i--){
    if(s.charAt(i)!='\\'){
        s1=s.charAt(i)+s1;
    }
    else{
        break;
    }
}
return s1;
}
}