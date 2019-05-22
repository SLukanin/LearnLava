package Lesson14;

public class Main2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Иван ");
        try {
            person.setAge(320);
        } catch (AgePersonException e){
            System.out.println("некорректно введен возраст ");
        }

        System.out.println(person);
    }
}
