class SquareDriver{
    public static void main(String[] args){
        square s1=new square();
        s1.l=10;
        s1.w=5;
        s1.color="red"; 

        System.out.println(getDetails(s1.l,s1.w,s1.color));
        System.out.println(getArea(s1.l,s1.w));
        System.out.println(getPerimeter(s1.l,s1.w));
    }
}

