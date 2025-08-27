package practiceOOPS;


class Name{
    int no=10;
    final String name;
    public Name(String name){
        this.name=name;
    }
    public void printName(){
        System.out.println(this.name);
    }
}

 
class greeting extends Name{
    

    public greeting(String name) {
        super(name);
    }

    public void greet(){
        System.out.println("Good Morning "+this.name);
    }

}
public class raghav {
    public static void main(String[] args) {
        greeting one=new greeting("Raghav");
        greeting two=new greeting("Bansal");
        one.greet();
        two.greet();
    }
}
