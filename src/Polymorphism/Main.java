package Polymorphism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DynamicPoly obj = new ChildPoly();
        obj.print();
        StaticPoly obj1 =new StaticPoly();
        System.out.println(obj1.a);
        StaticPoly obj2 =new StaticPoly(10);
        System.out.println(obj2.b);
        StaticPoly obj3 =new StaticPoly(10,20);
        System.out.println(obj2.b);



    }
}
