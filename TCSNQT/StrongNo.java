//write a program to check whether the no is Strong number or not 

// A number of which is equal to the sum of factorial of each digit                                                                                                               

class StrongNo{
    public static boolean Fac(int n){
            int sum=0,temp=n;
        while(n>0){
            int f=n%10;
            int fact=1;
            for(int i=f;i>=1;i--){
              fact=fact*i;
            
            }
            sum+=fact;
          n=n/10;
        }
         return sum==temp;
    }

    public static void main(String[] args){
        System.out.println(Fac(145));
    }
}