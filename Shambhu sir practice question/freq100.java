class freq100{
    public static void main(String[] args){
        int[] a={10,20,4,5,6,7,3,2,4,6,6,4,3,2};
        printFreq(a);
      
    }
    public static void printFreq(int[] a){
  int[] freq=new int[101];
        for(int n:a){
            freq[n]+=1;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println(i+" is "+freq[i]+" times ");
            }
        }
    }
}