

class Cal{
    public static void Calculator(double a,double b){
        double sum=a+b;
        System.out.println("sum is: "+sum);
        double sub=a-b;
        System.out.println("sub is: "+sub);
        double mul=a*b;
        System.out.println("mul is: "+mul);
        double div=a/b;
        System.out.println("div is: "+div);

    }

    public static void main(String[] args){
        double x=10;
        double y=2;
        Calculator(x,y);
    }
}