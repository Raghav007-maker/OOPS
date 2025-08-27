package practiceOOPS;

public class Encapsulation {
    // Private instance
    private int a=10;

    // Private Method
    private void check(){
        System.out.println("Can you access me?");
    }

    // Private Static method
    private static void staticMethod(){
        System.out.println("Static private method");
    }
    // getter-->get the value
    public int getmethod(){
        check();
        staticMethod();
        //non-static method can call static as well non-static methods
        return a;
    }

    // Setters-->Sets and upadates the Value
    public void setValue(int value){
        this.a=value;
    }


}

class access extends Encapsulation{

}

class main{
    public static void main(String[] args) {
        access obj=new access();
        System.out.println(obj.getmethod());
        obj.setValue(20);
        System.out.println(obj.getmethod());
    }
}

