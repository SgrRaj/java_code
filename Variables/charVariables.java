class Hello{
    char ch;
    void show(){
        System.out.println(ch==0);
        System.out.println(ch=='a');
        System.out.println(ch=='\u0000');
    }

}
class charVariables{
    public static void main(String[] args){
        Hello h=new Hello();
        h.show();
    }
}