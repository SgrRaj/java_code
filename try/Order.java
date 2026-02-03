class Order{
   String name;
   double price;
   String color;
   int items;

public void setDetails(String n,double p,String c,int i){
        name=n;
	price=p;
	color=c;
	items=i;

                                                                                   
}

public void getDetails(){
System.out.println("name is: "+name);
System.out.println("price is: "+price);
System.out.println("color is: "+color);
System.out.println("items is: "+items);

}
}
