package L4;

public class main {
    public static void main(String[] args) {
        Acess_Modifiers obj=new Acess_Modifiers();
        //need to do few things
        // 1. access the data members
        // 2. modify the data members


        // by applying a variable or method to be private then this means that that varible can be access only in that class only
        // how to access any private variable like num by getter and setter
        System.out.println(obj.getNum());
        // here we are accessing the function which is accessing the variable num as it is in same file
        String n=obj.name;
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.no);
    }
}
