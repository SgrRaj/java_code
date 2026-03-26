//write a program to print all the n term of fibonacci series

class Fibo{
    public static void PrintFibo(int n){
        int n1=0,n2=1;
        if(n==1){
            system.out.println(n1);

        }
        else 
          system.out.println(n1);
            system.out.println(n2);

            for(int i=1;i<n-2;i++){
                int n3=n1+n2;
                  system.out.println(n3);
                  n1=n2;
                  n2=n3
            }
    }

    public static void main(String[] args){
        System.out.println(PrintFibo(10));
    }
}