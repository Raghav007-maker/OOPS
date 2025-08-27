package L6.Cloaning;

public class Human implements Cloneable {

    int age;
    String name;
    int[] arr;
    public Human(int age,String name){
        this.age=age;
        this.name=name;
        this.arr=new int[]{1,2,3,4,5};

    }

    // public Human(Human old){
    //     this.age=old.age;
    //     this.name=old.name;
    // }
    // @Override
    // public Object clone() throws CloneNotSupportedException {
    //     // This is a Shallow copy
    //     return super.clone();
    // }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // This is a Shallow copy
        Human twin=(Human)super.clone();

        // MAke a deep copy
        twin.arr=new int[twin.arr.length];
        for(int i=0;i<twin.arr.length;i++){
            twin.arr[i]=this.arr[i];
        }
        return twin;
    }
}
