package com.driver;
class B extends A{
    @Override
    public void meth(){
        System.out.println("Method is overridden in Extendend class B");
    }
}
class A{
    public void meth(){
        System.out.println("Invoking method from class A");
    }
}
public class Main {
    public static void main(String[] args){
        B obj=new B();
        obj.meth();
    }
}
