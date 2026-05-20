class Reverse {
public static String Reverse(String str) {
 String rev="";
 for(int i=str.length()-1;i>=0;i--){
     rev=rev+str.charAt(i);
 }
    return rev;
}

public static void main(String[] args) {
    String str="Mohan";
    String result=Reverse(str);
    System.out.println("Reversed String: " + result);
}
}