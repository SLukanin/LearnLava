package Lesson8;

public class Main {
    public static void main(String[] args) {
        Tovar blender = new Tovar();
        blender.setNameTovar("Phillips Avent Блендер-пароварка 2 в 1");
        blender.setIdTovara(7324820);
        blender.setFixPrice(12200);
        blender.setDiscount(19);
        blender.setAvailable(true);

        Characteristic size = new Characteristic();
        size.setKey("Объем, л");
        size.setValue("0,8");

        Characteristic color = new Characteristic();
        color.setKey("Цвет");
        color.setValue("Белый");

        blender.addCharacteristic(size);
        blender.addCharacteristic(color);

        Comments otziv1 = new Comments();
        otziv1.setPlus("Хороший товар");
        otziv1.setMinus("Но криво собран");
        otziv1.setComment("Можно брать");
        otziv1.setLike(10);
        otziv1.setDislike(3);
        otziv1.setAge(19);
        otziv1.setRating(4.0);
        otziv1.setKlientFIO("Пупкин Василий Иванович");
        otziv1.setBuyInOzon(true);
        otziv1.setDateOfComment("27.03.2019");


        Comments otziv2 = new Comments();
        otziv1.setPlus("Достоинств нет");
        otziv1.setMinus("Полная хрень");
        otziv1.setComment("Не берите");
        otziv1.setLike(2);
        otziv1.setDislike(15);
        otziv1.setAge(19);
        otziv1.setRating(2.1);
        otziv1.setKlientFIO("Пупкин Василий Иванович");
        otziv1.setBuyInOzon(true);
        otziv1.setDateOfComment("27.03.2019");

        blender.addComment(otziv1);
        blender.addComment(otziv2);

        blender.printInfo();

    }
}
