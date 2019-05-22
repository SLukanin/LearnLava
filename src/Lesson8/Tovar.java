package Lesson8;

import java.io.PrintStream;

public class Tovar {
    private int idTovara;
    private int fixPrice;
    private int discount;
    private String nameTovar;
    private String type;
    private String colorId;
    private String nameColor;
    private boolean available;
    private Characteristic[] characteristics = new Characteristic[30];
    private Comments[] comments = new Comments[1000];

    public void addCharacteristic(Characteristic characteristic){
        for (int i = 0; i < characteristics.length; i++){
            if (characteristics[i] == null){
                characteristics[i] = characteristic;
                return;
            }
        }
    }

    public void addComment(Comments otziv){
        for (int i = 0; i < comments.length; i++){
            if(comments[i] == null){
                comments[i] = otziv;
                return;
            }
        }
    }

    public void printInfo(){
        System.out.printf("Товар: Имя - %s\nЦена - %d\nСкидка - %d\nТип - %s\n",
                nameTovar, fixPrice, discount, type);
        for (Characteristic ch: characteristics){
            if(ch != null) {
                System.out.println(ch.getKey() + ": " + ch.getValue());
            }
        }

        for (Comments com: comments){
            if(com != null){
                System.out.printf("Имя: %s\nДостоинства: %s\nНедостатки: %s\nКомментарий: %s\n, Рейтинг - %s",
                        com.getKlientFIO(), com.getPlus(), com.getMinus(), com.getRating());
            }
        }
    }

    public int getIdTovara() {
        return idTovara;
    }

    public void setIdTovara(int idTovara) {
        this.idTovara = idTovara;
    }

    public int getFixPrice() {
        return fixPrice;
    }

    public void setFixPrice(int fixPrice) {
        this.fixPrice = fixPrice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getNameTovar() {
        return nameTovar;
    }

    public void setNameTovar(String nameTovar) {
        this.nameTovar = nameTovar;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColorId() {
        return colorId;
    }

    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    public String getNameColor() {
        return nameColor;
    }

    public void setNameColor(String nameColor) {
        this.nameColor = nameColor;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Characteristic[] getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(Characteristic[] characteristics) {
        this.characteristics = characteristics;
    }

    public Comments[] getComments() {
        return comments;
    }

    public void setComments(Comments[] comments) {
        this.comments = comments;
    }
}
