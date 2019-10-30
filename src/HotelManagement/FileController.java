package HotelManagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public interface FileController {

    static String convertToTxt(String toBeConverted) {
        return toBeConverted + ".txt";
    }

    static String convertTxtBack(String toBeConverted) {
        int l = toBeConverted.length();
        if (l > 4 && toBeConverted.substring(l - 4) == ".txt") {
            return toBeConverted.substring(0, l - 4);
        }
        return null; //needs exception handling
    }

    static ArrayList<String> copyOldInfo(File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        ArrayList<String> oldInfo = new ArrayList<>();
        while(sc.hasNext()){
            oldInfo.add(String.valueOf(sc.nextLine()));
        }
        return oldInfo;
    }

    public static void cleanFileContent(File file) throws FileNotFoundException {
        PrintWriter Originalwriter = new PrintWriter(file);
        Originalwriter.write("");
        Originalwriter.flush();
        Originalwriter.close();
    }

}
