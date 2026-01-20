class doubleQuotes{
    public static void main(String[] args){
        String str="Welcome to "JLC""; //gave error
        System.out.println(str);
    }
}

// "Welcome to "JLC""    
//  so, "Welcome to "     --> treat as String
//  and   JLC""    --> trated as variable which are not declare 