package L6.Comparing;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(i+1);
        }

        // lambda function taking Single argument function with function variable
        Consumer<Integer> fun=(item)-> System.out.println(item*2);
        list.forEach(fun);
        
        // lambda function taking Single argument function without function variable
        list.forEach((item) -> System.out.println(item*2));



        Operation sum = (a,b) -> a+b;
        Operation Prd = (a,b) -> a*b;
        Operation sub = (a,b) -> a-b;

        LambdaFunction myCalcu=new LambdaFunction();
        System.out.println(myCalcu.Operate(3,5,sum));
        System.out.println(myCalcu.Operate(3,5,sub));
        System.out.println(myCalcu.Operate(3,5,Prd));

        

    } 

    private int Operate(int a,int b,Operation op){
        return op.operation(a,b);
    }
}

interface Operation{
    int operation(int a,int b);
}
