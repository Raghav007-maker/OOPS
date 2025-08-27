package L1;

public class L1 {

    public static void main(String[] args) {

        // int[] arr=new int[5];
        Students student1 = new Students();

        student1.changeName("hello");
        student1.greeting();
        
        System.out.println("Roll No: " + student1.rollno + ", Name: " + student1.name + ", Marks: " + student1.marks);
        
        Students student2 = new Students(100, "bansal", 78.23f);
        System.out.println("Roll No: " + student2.rollno + ", Name: " + student2.name + ", Marks: " + student2.marks);

        Students random=new Students(student2);
        System.out.println(random.name);
        
        Students one = new Students();
        Students two=one;
        one.name="Kunal";
        System.out.println(one.name);
        System.out.println(two.name);
        two.name="Raghav";
        Students three=new Students(one);
        
        System.out.println(three.name);

    }

    static class Students {

        int rollno;
        String name;
        float marks = 12.34f;
        //we need a way to add the values of the above properties object by object

        // we need one word to access every object which is this

        void greeting(){
            System.out.println("Hello My name is "+name);
            System.out.println("Hello My name is "+this.name);
        }
        void changeName(String naam){
            name=naam;
        }

        Students(Students other) {
            // random.name=student2.name
            this.rollno = other.rollno;
            this.name = other.name;
            this.marks = other.marks;
        }
        Students(){}

        Students(int rollno, String name, float marks) {
            // here the arguments has same name class element so that,s why we have to use this convention as reference variable. 
            this.rollno = rollno;
            this.name = name;
            this.marks = marks;
        }
    }
}
