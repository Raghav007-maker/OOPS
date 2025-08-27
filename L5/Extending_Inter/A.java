package Extending_Inter;

public  interface A {

    // as static method are not overridden beacause they does not resolved at runtime hence 
    // static method in interface always has body
    static void greeting(){
        System.out.println("Hey i am a static method");
    }

    default void fun(){
        System.out.println("I am a default from A");
    }
} 
