package practiceOOPS;

import L4.Acess_Modifiers;

public class basic extends Acess_Modifiers {
    public static void main(String[] args) {
        first one=new first("raghav");
        System.out.println(one.name);
        System.out.println(one.Replace("Bansal"));
        first.greeting();
        one.greeting();
        Acess_Modifiers obj=new Acess_Modifiers();
        System.out.println(obj.name);
        // System.out.println(obj.age);
        // System.out.println(obj.no);//can Be accessed via subClass reference Variable not via SuperClass reference Var. 
        // basic a=new basic();
        // System.out.println(a.no);

    }
}


class first{
    int a=10;
    String name;
    public first(String name){
        this.name=name;
    }
    String Replace(String name){
        this.name=name;
        return name;
    }
    public static void greeting(){
        System.out.println("Good Morning");
    }
}
