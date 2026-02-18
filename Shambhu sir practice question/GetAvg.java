class GetAvg{

    public static int GetAverage(int a,int b,int c){
        int avg=(a+b+c)/3;
        return avg;
    }
    public static void main(String[] args){
        int x=10,y=20,z=30;
            int result=GetAverage(x,y,z);
            System.out.println("Total average of these three no is "+result);
    }
}