package AbstractClasses;
public class Daughter extends AbstractClass {
    public Daughter(int age) {
        super(age);
    }
    @Override
    void career(){
        System.out.println("I want to become a doctor");
    }
    @Override
    void Partner(){
        System.out.println("I want a Doctor partner");
    }
}
