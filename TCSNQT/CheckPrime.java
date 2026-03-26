//Write a java program given no is prime or not 



class CheckPrime{
        public static boolean isPrime(int n){
            // int count =0;
            // for(int i=1;i<n;i++){
                
            //     if(n%i==0)
            //     count++;
            // }
            // if(count>2)
            // return false;
            // else return true;

            boolean Prime=true;
            for(int i=0;i<n/2;i++){
                if(n%i==0){
                    return false;
                    break;
                }
                return Prime;

            }

        }

    public static void main(String[] args){

            System.out.println(isPrime(25));
    }
}