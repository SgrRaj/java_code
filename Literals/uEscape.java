class uEscape{
    public static void main(String[] args){
        char ch='\u'; 
        System.out.println(ch);
    }
}

//  error: illegal unicode escape
//         char ch='\u'; 
//                    ^
// uEscape.java:3: error: empty character literal
//         char ch='\u';
//                 ^