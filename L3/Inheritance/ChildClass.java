package L3.Inheritance;

public class ChildClass extends baseClass {
    double weight;
    
    public ChildClass(){
        weight=-1;
    }

    public ChildClass(ChildClass other){
        super(other);
        weight=other.weight;
    }

    public ChildClass( double l, double w, double h,double weight) {
        super(l, w, h); //what is this --->call the parent class constructor
        //used to initialize parent class constructor

        // System.out.println(this.weight);
        // this.weight = weight;
    }
}
