// Write a java prog  to find product of each digit 

class ProductDigit{
    public static int multiply(int n){
        int p=1;
        while(n!=0){
        int digit =n%10;
         p*=digit;
        n/=10;
        
        }
        return p;
    }

    public static void main(String[] args){
        // Scanner sc =new Scanner(System.in);
        // int a=sc.nextInt();
        // int result=multiply(n);
        System.out.println(multiply(123));

    }
}