class RectangleTest{
    public static void main(String[] args){
        Rectangle r1=new Rectangle();

        r1.l=10.8;
        r1.w=10.2;
        System.out.println(r1.getDetails(r1.l,r1.w));
         System.out.println("area is:"+r1.getArea(r1.l,r1.w));
          System.out.println("perimeter is: "+r1.getPerimeter(r1.l,r1.w));

    }
}