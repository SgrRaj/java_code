class ascii34{ 
public static void main(String str[]) { 
char ch1=-1;    //error: incompatible types: possible lossy conversion from int to char
char ch2=65536;     // error: incompatible types: possible lossy conversion from int to char
System.out.println(ch1); 
System.out.println(ch2); 
} 
} 

