package Lesson10;

public class Monkey implements Animal {

    @Override
    public void breathe() {
        System.out.println("Обезьянка дышит");
    }

    @Override
    public void voice() {
        System.out.println("уа-уа-уаааа");
    }

}
