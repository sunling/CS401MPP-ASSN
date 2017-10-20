package lab8.homework.assignment.prob6;

import java.io.File;

public class excises2 {
    public static void main(String[] args) {

        //get all the files/
        File file = new File("src/java8/behaviorparameters");
        File[] subDirectories = file.listFiles((File files) -> files.isFile() && files.getName().endsWith("java"));
        for (int i = 0; i < subDirectories.length; i++) {
            System.out.println(subDirectories[i].toString());
        }
    }
}
