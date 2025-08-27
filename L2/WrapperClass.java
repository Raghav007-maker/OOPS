package L2;

public class WrapperClass {
    public static void main(String[] args) {
        // int a=2;
        // int b=3;
        // swap(a,b) // here the value is not swapped we know so if we are using integer objects
        Integer a=21;
        Integer b=12;
        swap(a,b);
        System.out.println(a);
        System.out.println(b);
        // but here they also not get swapped go here the concept of final keyword comes.
        final A one = new A("Raghav");
        one.name="hello";//Possible
        // one=new A("Krishna");//Error
        
        // final int bonus=23;
        // bonus=12;//error

        A obj;
        for (int i = 0; i < 100000000; i++) {
            obj=new A("random name");
        }
        
    }
    public static void swap(Integer a, Integer b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static void message(){
        System.out.println("Hello");
    }
}


class A{
    final int num=10;
    String name;

    public A(String name){
        this.name=name;
    }
    // you can not delete the objects manually but you can define what to do when the object is going to be deleted 


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is Destroyed");
    }


}

