package Static;

public class Human {
    int age;
    String name;
    static int population;
    Human(int age, String name){
        this.age=age;
        this.name=name;
        Human.population+=1;
    }
}
