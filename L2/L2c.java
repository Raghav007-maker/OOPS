package L2;

public class L2c {
    
    static class B {
        static int age = 18;
        B() {
        }
        void increaseAge(int age) {
            B.age=age;
            System.out.println(B.age);
        }
    }
     public static void main(String[] args) {
        B obj = new B();
        obj.increaseAge(B.age);
        B obj2 = new B();
        obj2.increaseAge(20);
        // System.out.println(B.age);//20 as it updated earlier
        
    }
}
