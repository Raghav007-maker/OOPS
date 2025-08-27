package L7;

public class Main {
    enum Week implements InterfaceA{
        Monday,Tuesday,Wednusday,Thursday,Friday,Saturday,Sunday;
        // these are enum constants
        //Public,static and final
        // since its final you can create child enums
        // type is week

        Week(){
            System.out.println("Constructor Called for " + this);
        }
        // this is not public or protected, only private or default
        // why? we dont want to create new objects
        // this is not enum concept, that,s why

        @Override
        public void hello() {
            System.out.println("Hello Every One");
        }


        // internally: public static final Week Monday = new  Week();
    }


    public static void main(String[] args) {
        Week week;
        week=Week.Monday;
        // week=Week.Tuesday;

        // for(Week day:Week.values()){
        //     System.out.println(day);
        // }
        System.out.println(week);
        System.out.println(week.ordinal()); //Starts from 0 to n-1        
        week.hello();
        System.out.println(week.valueOf("Monday"));
    }
}
