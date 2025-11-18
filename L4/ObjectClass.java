package L4;
//  all the class extends to Object class by Default if there any other class which the objectClass has extends then the baseClass will extends to both the classes
public class ObjectClass {

    int num;
    float gpa;

    public ObjectClass(int num,float gpa) {
        this.num = num;
        this.gpa=gpa;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
    
    // @Override
    // public boolean equals(Object obj) {
       
    //     return this.num=((ObjectClass)obj).num;
    // }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectClass obj1=new ObjectClass(12,23.4f);
        ObjectClass obj2=new ObjectClass(12,23.4f);
        System.out.println(obj1.toString());
        System.out.println(obj1.hashCode());
        

        // if(obj1.equals(obj2)){
        //     System.out.println("YES");
        // }
        // else System.out.println("NO");
        System.out.println(obj1 instanceof Object);
        System.out.println(obj1 instanceof ObjectClass);
        System.out.println(obj1.getClass().getName());

    }
    
}
