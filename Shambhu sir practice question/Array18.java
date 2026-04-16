class Array18{

    public static void main(String[] args){
        int[] a={10,20,30,40,50,60,70};
        a=insertElement(a,3,35);
        for(int n:a){
            System.out.println(n+" ");
        }
    }


    public static int[] insertElement(int[] nums,int index,int val){
        if(index<0 || index>nums.length){
            System.out.println("Index out of bounds");
            return nums;

        }
        int[] b=new int[nums.length+1];
        b[index]=val;
        for(int i=0;i<b.length;i++){
            if(i<index){
                b[i]=nums[i];
            }
            else if(i>index)
              b[i]=nums[i-1];
        }
        return b;
    }
}