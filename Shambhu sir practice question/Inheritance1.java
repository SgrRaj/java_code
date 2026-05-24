class A {
    static void show() { 
        System.out.println("A");
         }
}
class B extends A {
    static void show() { 
        System.out.println("B");
         }
}
public class Inheritance1 {
    public static void main(String[] args) {
        A obj = new B();  //upcasting
        obj.show(); //Output: A (because static methods are resolved at compile time
                    //  based on reference type)
    }
}