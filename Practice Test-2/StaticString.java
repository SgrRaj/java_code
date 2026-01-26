class StaticString { 
static String name; 
public static void main(String str[]) { 
System.out.println(name); 
System.out.println(name.length()); 
} 
}


// output : null and 5th line give run time error

// null
// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "StaticString.name" is null    
//         at StaticString.main(StaticString.java:5)