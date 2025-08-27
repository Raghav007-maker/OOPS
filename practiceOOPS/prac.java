package practiceOOPS;

public class prac {

    public static void main(String[] args) {
        one a = new one("Raghav", "papillon", 18, "Black");
        System.out.println(a.breed);
        System.out.println(a.getName());

    }
}

class one {

    private String name;
    String breed;
    int age;
    String color;

    // Constructor Declaration of Class
    public one(String name, String breed, int age,
            String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // method 1
    public String getName() {
        return name;
    }

    // method 2
    public String getBreed() {
        return breed;
    }

    // method 3
    public int getAge() {
        return age;
    }

    // method 4
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return ("Name is: " + this.getName()
                + "\nBreed, age, and color are: "
                + this.getBreed() + "," + this.getAge()
                + "," + this.getColor());
    }
}
