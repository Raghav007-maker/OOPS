package Extending_Inter;

public class Main implements B {
    @Override
    public void greet() {
        System.out.println("Hello");
    }

    // Default Methods are not neceessary to override but simple method in inteface which are abstract methods must be Override

    // @Override
    // public void fun() {
    //     System.out.println("Hello from fun()");
    // }
    public static void main(String[] args) {
        Main obj=new Main();
        A.greeting();
        obj.fun();
    }   
}
