package Lesson18;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File dirFrom = new File("/Users/user/Downloads");
        File[] filesFromDir = dirFrom.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.isDirectory()){
                    return true;
                }
                if(pathname.getAbsolutePath().endsWith(".ppt") || pathname.getAbsolutePath().endsWith(".jpg")){
                    return true;
                }
                return false;
            }
        }) ;
        for (File file: filesFromDir){
            System.out.println(file);
        }
    }
}
