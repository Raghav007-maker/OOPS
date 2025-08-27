package L6.Comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student kunal=new Student(12,89.76f);
        Student rahul=new Student(5,99.56f);
        Student arpit=new Student(2,95.56f);
        Student Sachin=new Student(13,77.56f);

        Student[] list={kunal,rahul,arpit,Sachin};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        // if(kunal.compareTo(rahul)<0){
        //     System.out.println(kunal.compareTo(rahul));
        //     System.out.println("Rahul has more marks");
        // }
        
    }
}
