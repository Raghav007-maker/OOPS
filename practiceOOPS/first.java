package practiceOOPS;

public class first {
    public static void main(String[] args) {
        greeting a=new greeting();
        System.out.println(a.a);
        a.hello();

        // System.out.println(a.b);
        System.out.println(greeting.b);
        String changedNAme=a.changeName("Raghav");
        System.out.println(changedNAme);
    }
    // static class hello{

    // }
}
class greeting{
    int a=10;
    String name="Hello";
    public static int b=20;

    // Greeting
    void hello(){
        System.out.println("Hello");
    }
    // Changing name
    String changeName(String name){
        System.out.println(this.name);
        this.name=name;
        return this.name;
    }
}
