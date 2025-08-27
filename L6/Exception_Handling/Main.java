package L6.Exception_Handling;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try {
            // String name="raghav";
            // if(name.equals("raghav")){
            //     throw new MyException("name is Raghav");
            // }
            int c=a/b;
            // devide(a,b);

            // positiveMultiply(-1,4);Not Called
            // Because after finding the Exception in devide method the program control jumps directly to the catch block and skips the method 2nd method.
            // You can call this via writing other exception handling like devide.

        } catch (ArithmeticException e) {
                System.out.println("Caught: " + e);  
        }
        catch (Exception e) {
                System.out.println(e.getMessage());  
        }
        // One Thing that Exception catch must be below because it contains all the exception inside it hence if we put it in first then no other option will be caught
        finally{
            System.out.println("Always Executed");
        }
    }
    static int devide(int a,int b)throws ArithmeticException{
        // Throws means thr function you are using it may throw an exception
        if(b==0){
            throw new ArithmeticException("CAn Give Your Own Exception Like This!!");
            // thorw means we are throwing an Exception
        }
        return a/b;
    }

    static int positiveMultiply(int a,int b) throws ArithmeticException{
        if(a<0 || b<0) {
            throw new ArithmeticException("A and b can,t be negative");
        }
        return a*b;
    }
}
