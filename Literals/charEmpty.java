class charEmpty{ 
public static void main(String as[]) { 
char ch1 = '';   //empty
char ch2 = '  ';  //Two space 
char ch3 = 'AB';
char ch4 = '\';
char ch5 = "";
System.out.println(ch1); 
System.out.println(ch2); 
System.out.println(ch3); 
System.out.println(ch4); 
}  
} 

//  error: empty character literal
// char ch1 = ''; 
//            ^
// charEmpty.java:4: error: unclosed character literal
// char ch2 = '  ';
//            ^
// charEmpty.java:5: error: unclosed character literal
// char ch3 = 'AB';
//               ^
// charEmpty.java:5: error: not a statement
// char ch3 = 'AB';
//             ^
// charEmpty.java:6: error: unclosed character literal
// char ch4 = '\';
//            ^

