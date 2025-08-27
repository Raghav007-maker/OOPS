package L3.Inheritance;

public class baseClass {
    double l;
    double w;
    double h;

    public baseClass() {
        l=-1;
        w=-1;
        h=-1;
    }
    public baseClass(double side){
        super();
        this.w=side;
        this.h=side;
        this.l=side;
    }

    public baseClass(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    
    public baseClass(baseClass old){
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;
    }
}
