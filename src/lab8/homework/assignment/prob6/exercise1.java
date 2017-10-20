package lab8.homework.assignment.prob6;

import java.io.File;
import java.io.FileFilter;

public class exercise1 {

    public static void main(String[] args) {
        File file = new File("src");

        File[] subDirectories = file.listFiles((File files) ->files.isDirectory());
        for (int i = 0; i < subDirectories.length; i++) {
            System.out.println(subDirectories[i].toString());
        }
    }
}
