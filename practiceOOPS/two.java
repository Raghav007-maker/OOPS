package practiceOOPS;

public class two {
    public static void main(String[] args) {

        // two obj=new two();
        // obj.fun();

        Demo d1 = new Demo();
        Demo d2 = new Demo();

        d1.increaseCount(); // Count is now: 1
        d2.increaseCount();
        Demo.decreaseAge();
    }
    // void fun(){
    //     // here we need an object for calling a non static function.
    //     System.out.println("HELLO");
    // }
    
}
class Demo {
    static int count = 0; // static variable
    int age=5;//non static variable
    void increaseCount() { // non-static method
        count++;
        age--;
        System.out.println("Count is now: " + count);
    }

    static void decreaseAge(){
        count++;
        // age--;//non static variable can not be accessable in static method
    }
}
