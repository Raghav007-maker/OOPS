package practiceOOPS;

import L4.Acess_Modifiers;

public class AccessModi extends Acess_Modifiers {
    public AccessModi(int no, String name) {
        super(no, name); // calling superclass constructor
    }

    // public void displayProtected() {
    //     System.out.println(this.no); // ✅ Accessing protected member via inheritance
    // }

    public static void main(String[] args) {
        AccessModi obj = new AccessModi(10,"raghav");
        System.out.println(obj.name); 
        System.out.println(obj.no);       // public: ✅ accessible
        // obj.displayProtected();              // protected: ✅ accessed properly
        // System.out.println(obj.age);      // default: ❌ not accessible here
    }
}