package com.driver;
class A{
    public String meth(){
        return "Method is invoking from class A";
    }
}
class B extends A{
    @Override
    public String meth(){
        return "Method is overridden in Extendend class B";
    }
}
public class Main {
    public static void main(String[] args) {
        B obj=new B();
       String result=obj.meth();
       System.out.println(result);
       //comment
    }
}