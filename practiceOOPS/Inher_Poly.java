package practiceOOPS;

public class Inher_Poly {
    public static void main(String[] args) {
        System.out.println("Hello World");
        // Runtime Polymorphism
        a obj=new b();
        // Method Overriding
        obj.meassage();

        // Compile time polymorphism
        //  both the reference and the class must be of the same type (or the reference must be of a type that declares all the overloaded methods you want to use). Otherwise, you can only use the methods visible in the reference type.
        b obj2=new b();
        // method overloading
        obj2.sum(2.0,3.0); 

        a obj3=new b();
        System.out.println(obj3.a);
        obj3.fun();//Static methods mainly called via class name but can be call by objects too!

    }
}

class a{
    int a=10;

    void meassage(){
        System.out.println("From class A");
    }
    static void fun(){
        System.out.println("Understanding static from A");
    }
    
}
class b extends a{
    int a=12;
    
    static void fun(){
        System.out.println("Understanding static from A");
    }
    // instance variables and static methods can,t override as they resolved at compile time.
    
    @Override
    void meassage(){
        System.out.println("From Class B");
    }

    // Example of method overloading
    void sum(int a,int b){
        System.out.println("Sum is "+(a+b));
    }

    void sum(double a,double b){
        System.out.println("Sum is"+(a+b));
    }
}
