package AbstractClasses;

public class Main {
    public static void main(String[] args) {
        
        son obj=new son(22);
        System.out.println(obj.age);
        obj.career();
        obj.Partner();
        Daughter obj2=new Daughter(25);
        System.out.println(obj2.age);
        obj2.career();
        obj2.Partner();
        AbstractClass.hello();
        obj.normal();
        // AbstractClass obj3=new AbstractClass();
        // You cannot create the abstract class obj but..
        AbstractClass obj3=new son(23);
        obj3.career();
        obj3.normal();
    }
}
