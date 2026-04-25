class FreqInAnyRange{
    public static void printFreq(int[] a){
        int min=a[0];
        int max=a[0];
        
        for(int n:a){
            if(n>max){
                max=n;
            }
            else if(n<min){
                min=n;
            }

        }


        int[] freq=new int[max-min+1];
        for(int n:a){
            freq[n-min]++; //freq
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println((i+min)+" is "+freq[i]+ " times ");
            }
        }
    }

    public static void main(String[] args){
        int[] a={15,43,2,5,6,7,5,4,4,5,5,3,7,7,3,2,1,43,35,35,43};
        printFreq(a);
    }
}