class CircleDriver{
    public static void main(String[] args){
        Circle c1=new Circle();

        c1.r=5;
        System.out.println(c1.getDetails(c1.r));
        System.out.println(c1.getPerimeter(c1.r));
        System.out.println(c1.getArea(c1.r));



    }
}