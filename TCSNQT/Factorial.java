//write a program to calculate factorial of a number 

class factorial{
    public static int  PrintFac(int n){
           int fact=1;
            for(int i=n;i>=1;i--){
              fact=fact*i;
            
            }
            return fact;

    }

    public static void main(String[] args){
        System.out.println(PrintFac(3));
    }
}