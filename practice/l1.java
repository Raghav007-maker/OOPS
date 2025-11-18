package practice;

public class l1 {
    public static void main(String[] args) {

        l2 obj = new l2(48,"Raghav");

        System.out.println(obj.no);

        System.out.println(obj.name);
        
        l2 obj1 = obj;
        
        System.out.println(obj1.name);
        obj1.name = "Anuj";
        System.out.println(obj1.name);
        System.out.println(obj.name);
        
        l2 obj2 = new l2(obj);
        System.out.println(obj2.name);
    }
}

class l2{

    int no;
    String  name;
    // final char section = 'A';
    

    public  l2(int no){
        this.no = no;
    }

    public  l2(String name){
        this.name = name;
    }

    public l2(int no , String name) {
        this.no = no;
        this.name = name;
    }

    public l2(l2 other){
        this.name = other.name;
        this.no = other.no;
    }

}
