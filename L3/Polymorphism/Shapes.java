package OOPS.L3.Polymorphism;

public class Shapes {

    void area() {
        System.out.println("Iam in shapes");
    }

    // Early Binding check notes
    // final void area(){
    //     System.out.println("Iam in shapes");
    // }
}
// 🧠 Early Binding (Compile-Time Polymorphism)
// Also called static binding.

// Happens at compile time.
// The method that will be executed is determined based on the reference type, not the actual object.
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
// The compiler knows at compile time which add method to call based on argument types.

// Static methods and private methods also fall under early binding, as they can't be overridden.
// 🧠 Late Binding (Run-Time Polymorphism)
// Also called dynamic binding.
// Happens at runtime.
// The method call is resolved based on the actual object's type, not the reference type.
class Animal {

    void sound() {
        System.out.println("Generic sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Bark");
    }
}

// Main class moved to Main.java
// Here, even though a is of type Animal, the JVM waits until runtime to determine the actual method to call — based on the fact that it points to a Dog object.
// Feature	       Early Binding	                Late Binding
// Timing	       Compile time	                    Runtime
// Type used	   Reference type	                Object type
// Applicable to   Overloaded methods, static	    Overridden methods
// Flexibility	   Less flexible	                More flexible
