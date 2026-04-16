class Array17{

    public static void main(String[] args){
        int[] a={10,20,30,40,50,60,70};
        a=removeElement(a,3);
        for(int n:a){
            System.out.println(n+" ");
        }
    }


    public static int[] removeElement(int[] nums,int index){
        if(index<0 || index>=nums.length){
            System.out.println("Index out of bounds");
            return nums;

        }
        int[] b=new int[nums.length-1];
        for(int i=0;i<b.length;i++){
            if(i<index){
                b[i]=nums[i];
            }
            else 
              b[i]=nums[i+1];
        }
        return b;
    }
}