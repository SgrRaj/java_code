public class PrintNaturalNumber {
    public static void main(String[] args) {
        printNum(1);
    }
    public static void printNum(int n){
        if(n>10){
            System.out.println("=========");
            return;
        }
        System.out.println(n);
        printNum(n+1);
         System.out.println(n);
        
    }
}