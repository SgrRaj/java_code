class StringLiterals39{
public static void main(String str[]) { 
String str1 = null; 
System.out.println(str1);      //output --      null
int x=str1.length(); 
System.out.println(x);         // Cannot invoke "String.length()" because "<local1>" is null
}
}

