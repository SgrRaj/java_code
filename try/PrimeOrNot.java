import java.util.*;
class PrimeOrNot{
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        boolean result=isPrime(a);
             if(result==false){
            System.out.println("not prime no");
        }
        else System.out.println(" a prime no");
    }
    }


