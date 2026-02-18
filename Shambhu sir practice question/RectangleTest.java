class RectangleTest{
    public static void main(String[] args){
        Rectangle r1=new Rectangle();

        r1.l=10.8;
        r1.w=10.2;
        System.out.println(r1.getDetails(10.0,10.0));
         System.out.println("area is:"+r1.getArea(10.0,10.0));
          System.out.println("perimeter is: "+r1.getPerimeter(10.0,10.0));

    }
}