import java.util.*;

class RangeRandom{
    public static void main(String[] args){
        int min =50;
        int max=90;
        int num=min+(int)(Math.random()*max-min);

        System.out.println(num);
    }
}