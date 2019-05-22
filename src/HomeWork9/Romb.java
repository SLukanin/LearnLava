package HomeWork9;

public class Romb extends Shape {
    private int visota;
    private int osnovanie;


    @Override
    public void prinPerimeter() {
        System.out.println("Периметр" +getName() + " = " + (osnovanie * 4));

    }


    @Override
    public void printPloshad() {

        System.out.println("Площадь "+getName() + " = " + (visota * osnovanie));
    }

    @Override
    public String toString() {
        return "Romb{" +
                "visota=" + visota +
                ", osnovanie=" + osnovanie +
                '}';
    }

    public int getVisota() {
        return visota;
    }


    public void setVisota(int visota) {
        this.visota = visota;
    }


    public int getOsnovanie() {
        return osnovanie;
    }


    public void setOsnovanie(int osnovanie) {
        this.osnovanie = osnovanie;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Romb romb = (Romb) o;

        if (visota != romb.visota) return false;
        return osnovanie == romb.osnovanie;
    }


    @Override
    public int hashCode() {
        int result = visota;
        result = 31 * result + osnovanie;
        return result;
    }

}
