package L2;

public class query {
    public static void main(String[] args) {
        derived one=new derived("Raghav");
    }
}
class base{
    base(){
        System.out.println("Base class constructor");
    }
}

class derived extends base{
    derived(String name){
        System.out.println(name);
    }
}


class UseStatic {
       static int a = 3;
       static int b;
       static void meth(int x) {
         System.out.println("x = " + x);
         System.out.println("a = " + a);
         System.out.println("b = " + b);
       }
       static {
         System.out.println("Static block initialized.");
         b = a * 4;
        }
        public static void main(String args[]) {
        meth(42);
        }
}
