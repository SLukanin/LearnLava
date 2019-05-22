package Lesson10;

import java.io.Serializable;

public class Lion extends Lesson9.Animal implements Animal, Serializable {

    @Override
    public void breathe() {
        System.out.println("Лев дышит");

    }

    @Override
    public void voice() {
        System.out.println("Рррррр");
    }
}
