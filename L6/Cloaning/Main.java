package L6.Cloaning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human raghav=new Human(18,"raghav");
        // Human kunal=new Human(raghav);
        // System.out.println(kunal.age);
        // here we are just copying the object via using new keyword.. 
        // we can use cloning interface for cloaning a object without new keyword.
        Human twin=(Human)raghav.clone();

        System.out.println(twin.age+" "+twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0]=100;
        // Shaloow Copy
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(raghav.arr));



    
    }
    
}
