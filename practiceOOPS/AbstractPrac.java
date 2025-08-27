package practiceOOPS;

public abstract class AbstractPrac {

    int x=10;

    public AbstractPrac(){
        x=20;
        System.out.println(x);
    }

    void message(){
        System.out.println("From abstractClass.");
    }
    abstract void Name(String name);
}

class New extends AbstractPrac{
    String name;
    @Override
    void Name(String name){
        this.name =name;
    }

    @Override
    void message(){
        System.out.println("From New Class");
    }
}

class Main{
    public static void main(String[] args) {
        New obj=new New();
        obj.Name("raghav");
        System.out.println(obj.name);
        obj.message();
        AbstractPrac obj2=new New();
        obj2.message();
        System.out.println(obj2.x);
    }
}