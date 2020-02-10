package oldherd.inter.in;

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class fileManager {
    //public fileManager() {
    //}
    public static String fileToString(String fileName) throws IOException {
        Scanner in = new Scanner(Paths.get(fileName), "UTF-8");
        String resString = new String();
        while(in.hasNextLine())
            resString = resString + '\n' + in.nextLine();
        return resString;
    }
}
