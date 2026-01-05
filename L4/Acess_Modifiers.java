package L4;

public class Acess_Modifiers {
    private int num;
    public String name = "Raghav";
    int age; // Default
    protected int no=15;
    int[] arr;

    public Acess_Modifiers(int num,String name){
        this.num=num;
        this.name=name;
        this.arr=new int[num];
    }
    public Acess_Modifiers() {}
    

    public int getNum(){
        return num;
    } 
}
class access{
    public static void main(String[] args) {
        Acess_Modifiers obj=new Acess_Modifiers(10, "Raghav");
        // System.out.println(obj.num);
        // so here in same file you can not access the num variable in different class it is only for it,s own class only
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.no);
    }
}
