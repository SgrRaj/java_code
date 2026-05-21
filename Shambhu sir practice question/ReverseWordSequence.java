class ReverseWordSequence{

    public static void main(String[] args) {
        String str="Hello World                        java";
        System.out.println(reverseWords(str));
    }
    
    public static String reverseWords(String str) {
        String res="",temp="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                temp=temp+ch;
            }
            // if(ch==' ' || i==str.length()-1){ //it gives extra space also 
             if((ch==' ' || i==str.length()-1) && temp.length()>0){ //it remove  extra space 
                res=temp+" "+res;
                temp="";
            }
    }
    return res;
    }
}