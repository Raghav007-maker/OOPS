package L2;

public class L2a {
    public static void main(String[] args) {

        Human raghav=new Human(18,"Raghav",1000000,false);
        System.out.println("Name: " + raghav.name + ", Age: " + raghav.age + ", Salary: " + raghav.salary + ", Married: " + raghav.married);
        // static variable can be accessed by class name also
        System.out.println("Population: " + Human.population);
        // static variable is shared by all the objects so it will be same for all the objects
        // so if we create another object it will increase the population
        Human bansal=new Human(18,"Bansal",1000000,false);
        // we prefer to use the class name to access static variables
        System.out.println("Population: " + Human.population);
        
        // In summary, use static when you want a variable or method to be shared across all instances or accessible without creating an object.
        L2a obj = new L2a();
        obj.fun2(); // calling non-static method using object

        fun();//calling static method.
    }
    // this is not dependent on object
    static void fun(){

        // greeting(); // you can,t use this because this require an instance of the class
        // but the function we are using is static so we can use it without creating an instance of the class
        

        // you can not access non static stuff without referencing their instances in a static content
        L2a obj = new L2a();
        // obj.greeting(); // this is how we can use non-static method in static method
    }

    // we know something which is not static is belong to the object
    void greeting(){//non-static method
        System.out.println("Hello from opp2 class");
        fun2(); //you can call non static method inside non static method without objects 
    }
    void fun2(){//non-static method
        System.out.println("Hello from opp2 class");
        // here we can create an object for fun2 in main class method and greeting2 method does not require an object to create in fun2.
        // greeting2();
        fun();
        // From non static function we can call static as well as non static function
    }

    void greeting2(){//non-static
        System.out.println("Hello from opp2 class");
    } 
    
}

class Human{
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){
        // System.out.println("Hello my name is " + this.name);//you can not access this inside any static method as static stuff is independent of object
    }
    public Human(int age,String name,int salary,boolean married){
        this.age=age;  
        this.name=name;
        this.salary=salary;
        this.married=married;   
        Human.population+=1;
    }
}


