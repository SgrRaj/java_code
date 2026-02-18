class Rectangle{
    double l,w;

    public String getDetails(double l,double w){
        return "length is :"+l+"Width is: "+w;
    }

    public double getArea(double l,double w){
        return l*w;
    }
    public double getPerimeter(double l,double w){
        return 2*(l+w);
    }
}