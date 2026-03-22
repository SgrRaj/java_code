class AddArray{

    public static int AddEle(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr={10,20,30,40,10,10,20,20,10,10};
        System.out.println(AddEle(arr));

    }
}

