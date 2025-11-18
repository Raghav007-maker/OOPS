package L3.Inheritance;


// 🚫 Restrictions
// - Can’t be used in a static context.
// - Must be the first statement in a constructor if used there

class one{
    int first;
    one(){}
    one(int first){
        this.first=first;
    }
}

class two extends one{
    int second;

    two(int first,int second){
        super(first);
        this.second=second;
    }
}

public class inher {
    public static void main(String[] args) {
        one obj2=new one(23);
        System.out.println(obj2.first);

        two obj3=new two(34,76);
        System.out.println(obj3.first);

        Child obj4=new Child();
        obj4.printValues();
        obj4.greet();     
    }
}

class Parent {
int value = 10;

void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent { 
    int value = 20;
    Child(){}

    void printValues() {
        System.out.println("Child value: " + this.value);
        System.out.println("Parent value: " + super.value);

        // Sometimes a child class and parent class have fields with the same name. super.fieldName helps you access the superclass's version.
    }

    @Override
    void greet() {
        super.greet(); // Calls Parent's greet()
        System.out.println("Hello from Child");
    }
}