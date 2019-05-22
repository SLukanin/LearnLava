package Lesson10;

public class Main5 {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        Lion lion = new Lion();
        Animal[] animals = new Animal[2];

        animals[0] = lion;
        animals[1] = monkey;

        for (Animal a : animals) {
            a.voice();

        }
    }
}
