package L2;

public class L2b {
    static int a=4;
    static int b;


    static{ //will only run once when the first obj is create i.e. when the class is loaded for the first time
        System.out.println("I am in static Block");
        b=a*5;
    }
    static void displayValues() {
        System.out.println("Static variable a = " + a);
        System.out.println("Static variable b = " + b);
    }

    public static void main(String[] args) {
        L2b obj=new L2b();
        System.out.println(L2b.a+" "+L2b.b);
        
        L2b.displayValues();
        L2b.b+=3;
        L2b obj2=new L2b();
        System.out.println(L2b.a+" "+L2b.b);
        
        A obj3=new A(23);
        System.out.println(obj3.age);
    }
    static class A{
        int age;
        A(int age){
            this.age=age;
        } 
    }
}
