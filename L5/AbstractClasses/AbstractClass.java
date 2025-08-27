package AbstractClasses;
public abstract class AbstractClass {

    int age;
    final int value;

    public AbstractClass(int age){
        this.age=age;
        value=234536;
    }

    static void hello(){
        System.out.println("Hello");
    }

    void normal(){
        System.out.println("This is a normal MEthod from abstract class");
    }
    abstract void career();
    abstract void Partner();


    // so we can create the abstract methods but do not create their body and leave the job to the child classes to use it and create body by self.

    // You can create constructor of abstract classes
     
    // You can not create Abstract class Object beacause if you can then you will acess their methods but abstract methods have no body hence you can not create abstract objects

    // you can not create abstract class constructor like--
    // abstract AbstractClass(){}

    // You can not create abstract static methods because as static methods does not overridden hence what is the need of abstract static Methods..

    // You can create static methods.

    // final keyword prevent inheritance if i put final before class it can,t be inherit hence abstract classes can,t have final abstract class...

    //the subclasses must override Abstract Methods.
    // 1 Can Have Static Methods
    // 2. Can Have Final Method
    // 4. You Can Extend Other Abstract Classes
    // 3. Can Implement Interface
    // 5. Abstract Classes Can Be Generic
    
}
