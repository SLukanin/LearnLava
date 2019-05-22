package Lesson19.Praktica;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        CopyFileTaskImpl task1 = new CopyFileTaskImpl("/Users/user/Downloads/ideaIC-2018.3.5.dmg", "Idea.dmg");

        CopyFileTaskImpl task2 = new CopyFileTaskImpl("/Users/user/Downloads/jdk-8u201-macosx-x64.dmg", "jdk.dmg");

        CopyFileTaskImpl task3 = new CopyFileTaskImpl("/Users/user/Downloads/GMT20190508-164238_----------_1280x720.mp4",
                "video.mp4");

        CopyFileTaskImpl task4 = new CopyFileTaskImpl("/Users/user/Downloads/FirefoxSetup.dmg", "Firefox.dmg");

        CopyFileTaskImpl task5 = new CopyFileTaskImpl("/Users/user/Downloads/GMT20190508-164238_----------.m4a",
                "HZ.m4a");


        FindFileTaskImpl task6 = new FindFileTaskImpl();

        try {
            task6.setDirectory("/Users/user/Downloads");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        task6.setFileNameSearchString("111");
        task6.setPrintStream(System.out);


    }
}
