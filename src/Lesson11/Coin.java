package Lesson11;

public class Coin implements Comparable<Coin> {
    private int nominal;
    private int year;
    private int diameter;

    public Coin(){
    }

    public Coin(int nominal, int year, int diameter) {
        this.nominal = nominal;
        this.year = year;
        this.diameter = diameter;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal=" + nominal +
                ", year=" + year +
                ", diameter=" + diameter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (nominal != coin.nominal) return false;
        if (year != coin.year) return false;
        return diameter == coin.diameter;
    }

    @Override
    public int hashCode() {
        int result = nominal;
        result = 31 * result + year;
        result = 31 * result + diameter;
        return result;
    }

    @Override
    public int compareTo(Coin o) {
        if(this.nominal != o.nominal){
            return o.nominal - this.nominal ;
        }

        if(this.year != o.year){
            return o.year - this.year ;
        }

        return o.diameter - this.diameter;
    }
}
