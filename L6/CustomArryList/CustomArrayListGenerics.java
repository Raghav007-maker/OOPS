package L6.CustomArryList;

import java.util.ArrayList;
import java.util.Arrays;
// here T Should either be a number or it subclass
public class CustomArrayListGenerics<T> {
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomArrayListGenerics(){
        this.data=new Object[DEFAULT_SIZE];
    }

    public CustomArrayListGenerics(int size){
        this.data=new Object[size];
    }

    public void add(T num){
        if(isfull()){
            resize();
        }
        data[size++]=num;
    }
    public boolean isfull() {
        return size==DEFAULT_SIZE;
    }
    public void resize() {
        // here the size will be equal to default_size which is 10.
        Object[] temp=new Object[data.length*2];

        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public T remove(){
        T removed=(T)data[--size];
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return size;
    }

    public void set(int index,T value){
        data[index]=value;
    }
    @Override
    public String toString(){
        return  "CustomArrayList{"+
        "data="+Arrays.toString(data)+
        ", size="+size+
        '}';
    }

    public static void main(String[] args) {

        CustomArrayListGenerics<Integer> list=new CustomArrayListGenerics<>(20);
        list.add(3);
        list.add(23);
        list.add(31);
        // list.add("raghavb");
        System.out.println(list);

        // Problem with custom array List is that your custom arrayList is off only integer Type Hence it can,t store Different Dayatype but ArrayList Store can Store Multiple datatypes like String Boolean etc
        ArrayList<Integer> list2=new ArrayList<>(); 

        // here list2 can allow to add only integer not any other datatype like
        list2.add(23);
        // list2.add("Raghav");//Error

        // <Integer> this is generics which  determine the type of list.

        // We Can Create The Same Multiple Classes and Use the same code by Changing the DataType Of aray To String but it take much time and code to hence we use Generics

        // Now let see how to solve the problem by Generics
         

    }


}
