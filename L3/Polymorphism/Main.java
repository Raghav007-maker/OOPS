package OOPS.L3.Polymorphism;

public class Main {

    public static void main(String[] args) {
        
        Shapes obj = new Shapes();
        obj.area();
        
        Square obj2=new Square();
        obj2.area();
        Circle obj3=new Circle();
        obj3.area();
        
        Shapes obj4=new Circle();
        obj4.area();
        // ok so here in Shapes class the method area() must be present Java checks at compile-time whether the Shapes class has an area() method. If it doesn’t, you’ll get a compile-time error—even though the actual object is Circle.
// 🔍 So yes, the method MUST exist in the parent class (reference type) for it to be callable like this.

// ✅ 2. Runtime Behavior (Object Type Matters)
// At runtime, Java looks at the actual object—which in this case is new Circle()—and asks:
// “Did Circle override the area() method?”

// - If it did override, Java executes Circle’s version.
// - If it didn’t override, Java falls back to Shapes’ version.

    }
}
 