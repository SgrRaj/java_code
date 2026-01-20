class escapeLiterals{
    public static void main(String[] args){
        char ch1 ='\+';
        char ch2='\p';
        char ch3='\a';
        System.out.println(char1);
        System.out.println(char2);
        System.out.println(char3);
    }
}

//  error: illegal escape character
//         char ch1 ='\+';
//                     ^
// escapeLiterals.java:4: error: illegal escape character
//         char ch2='\p';
//                    ^
// escapeLiterals.java:5: error: illegal escape character
//         char ch3='\a';
//                    ^