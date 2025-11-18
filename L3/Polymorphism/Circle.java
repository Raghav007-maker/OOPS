package OOPS.L3.Polymorphism;

public class Circle extends Shapes {

    // this will run when obj of circle is created
    // hence it is overriding the parent method

    @Override //this is called annotation

    void area(){
        System.out.println("area is pi*r*r");
    }
}
