package Lesson8;

import javax.xml.transform.sax.SAXResult;
import java.util.Date;

public class Comments {
    private String klientFIO;
    private int age;
    private String plus;
    private String minus;
    private String comment;
    private int like;
    private int dislike;
    private String dateOfComment;
    private double rating;
    boolean buyInOzon;

    public String getKlientFIO() {
        return klientFIO;
    }

    public void setKlientFIO(String klientFIO) {
        this.klientFIO = klientFIO;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPlus() {
        return plus;
    }

    public void setPlus(String plus) {
        this.plus = plus;
    }

    public String getMinus() {
        return minus;
    }

    public void setMinus(String minus) {
        this.minus = minus;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    public String getDateOfComment() {
        return dateOfComment;
    }

    public void setDateOfComment(String dateOfComment) {
        this.dateOfComment = dateOfComment;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isBuyInOzon() {
        return buyInOzon;
    }

    public void setBuyInOzon(boolean buyInOzon) {
        this.buyInOzon = buyInOzon;
    }



}
