package practiceOOPS;


class base{
    String name;
    base(String name){
        this.name=name;
    }


    void meassage(){
        System.out.println("This is a Base class");
    }
    static void show() {
        System.out.println("Parent's static method");
    }

}

class Child extends base{
    int age;
    Child(String name,int age){
        super(name);
        this.age=age;
    }
    @Override
    void meassage(){
        System.out.println("This is a Child class");
    }

   
    static void show() {
        System.out.println("Child's static method");
    }
    public void a(){
        System.out.println("a");
    }

}
public class three {

    public static void main(String[] args) {
        base obj1=new base("Raghav");

        Child obj2=new Child("Raghav",18);

        // System.out.println(obj1.name);
        // System.out.println(obj2.name);
        // System.out.println(obj2.age);

        obj1.meassage();
        obj2.meassage();
        
        base obj3=new Child("Raghav",18);
        obj3.meassage();
        obj3.show();//Parent's static method
        // Static method resolved at compile time this means in run-time polymorphism that,s why Java uses the reference type—not the actual object—to decide which method to call.

        // This is not runtime polymorphism, because static methods are not polymorphic. They're resolved by the compiler based on the reference type, not the actual object.

        base obj4=new Child("Raghav",12);
        // obj4.a();
    }
}
