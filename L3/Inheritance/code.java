package L3.Inheritance;

class Parent {
    static void show() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {
    
    static void show() {
        System.out.println("Child static method");
    }
}
class code {
    public static void main(String[] args) {

        // baseClass obj = new baseClass();
        // System.out.println(obj.l + " " + obj.w + " "+ obj.h);
        // baseClass obj1 = new baseClass(3.3,23.1,21.1);
        // System.out.println(obj1.l + " " + obj1.w + " "+ obj1.h);
        ChildClass childObj = new ChildClass();
        System.out.println(childObj.weight);
        ChildClass childObj2 = new ChildClass(3.23,454.2,34.5,12.0);
        System.out.println(childObj2.l + " " + childObj2.w + " "+ childObj2.h+" "+childObj2.weight);
        
        baseClass childObj3 = new ChildClass(454.2,34.5,12.0,34.2);
        System.out.println(childObj3.w);
        // System.out.println(childObj3.weight);
        // When a subclass object is assigned to superclass ref. var. you will have the access only those parts of the objects which are define in the superClass. 

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight

        // hence you should have access to weight variables

        // this also means, that the ones you are trying to access should be initialized
        // but here when the object itself is type parent class how you will call constructor of child class

        // ChildClass childObj4=new baseClass(2,4,7); //Error you can not assign rederence to child class and object to parent class
        // System.out.println(childObj4);   
        
        Parent p = new Child();
        Parent.show();  // Output: Parent static method 
    }
}





