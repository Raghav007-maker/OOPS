package practiceOOPS;


interface hello{
    int age=10;//public static final is implicitly writte3n in all variable of instance class 
    // also it need to be initialized must as it the final keyword is used 
    void hello();// public abstract method

    default void print(){ //public default methpd
        System.out.println("Printing done");
    }

    static void notOverridden(){//public static method
        System.out.println("Can not be Overridden.");
        CannotOverridden();
    }
    
    private static void CannotOverridden(){ //private method
        System.out.println("Can not be Overridden.");
    }

}

interface interfaces extends hello{
    void greetings();
}

public class InterfacePrac implements interfaces{
    public static void main(String[] args) {
        InterfacePrac obj=new InterfacePrac();
        obj.greetings();
        obj.hello();
        System.out.println(hello.age);

        obj.print();
        hello.notOverridden();
        
        
    }

    @Override
    public void greetings() {
        System.out.println("Good Morning");
    }

    @Override
    public void hello() {
        System.out.println("Hello,My name is raghav");
    }
}

// Summary Table

// | Method Type | Access  | Has Body | Can Be Overridden? | Usage | 
// | Abstract    | public  | ❌       | ✅                | Behavior contract | 
// | Default     | public  | ✅       | ✅                | Optional implementation | 
// | Static      | public  | ✅       | ❌                | Utility/helper methods | 
// | Private     | private | ✅       | ❌                | Internal logic reuse | 



