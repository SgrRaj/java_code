

class isPrimee{ 
    //check whether the number is prime or not

public static boolean isPrimee(int n){
    if(n<2)
    return false;

    for(int i=2;i*i<=n;i++){
        if(n%2==0){
            return false;
        }
    }
    return true;
}


public static void main(String[] args){
    int n=10;
    if(isPrimee(n)){
        System.out.println("it is prime number");
    }
    else 
     System.out.println("it is not prime number");
}
}
