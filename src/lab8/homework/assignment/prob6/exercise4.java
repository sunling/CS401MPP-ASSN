package lab8.homework.assignment.prob6;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class exercise4 {
    public static void main(String[] args) {
        //sorting the files
        File file = new File("src/java8/behaviorparameters");
        File[] subDirectories = file.listFiles((File files) -> files.isFile() && files.getName().endsWith("java"));
        List<File> fileList = Arrays.asList(subDirectories);
        fileList.sort(File::compareTo);

        for (int i = 0; i < subDirectories.length; i++) {
            System.out.println(subDirectories[i].toString());
        }

    }
}
