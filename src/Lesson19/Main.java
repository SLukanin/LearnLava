package Lesson19;

public class Main {
    public static void main(String[] args) {
        FileCopyWithChannel copyUtils1 = new FileCopyWithChannel();
        FileCopyWithJava7 copeUtils2 = new FileCopyWithJava7();

        try {
            copyUtils1.copyFile("Lection_Collections.ppt", "Lection_Collections28.ppt");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }

        try {
            copeUtils2.copyFile("/Users/user/Downloads/Lection_Collections.ppt", "/Users/user/Downloads/Lection_Collections100501.ppt");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
    }
}
