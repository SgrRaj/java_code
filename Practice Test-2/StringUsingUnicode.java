class StringUsingUnicode{
public static void main(String str[]) { 
String name="UNICODE OF A IS 
\u0041"; 
System.out.println(name); 
} 
}

// error : unclosed string literal
// String name="UNICODE OF A IS 
//             ^
// StringUsingUnicode.java:4: error: unclosed string literal  
// \u0041";
//       ^
// StringUsingUnicode.java:4: error: not a statement
// \u0041";
// ^
// 3 errors