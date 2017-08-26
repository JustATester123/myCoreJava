package v1ch03.InputTest;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileIo {
    public static void main(String[] args) throws IOException {
        //Scanner in = new Scanner(Paths.get("E:\\javatest\\myCoreJava\\src\\V3\\InputTest\\test.txt"));
        Scanner in = new Scanner(Paths.get("E:\\javatest\\myCoreJava\\src\\V3\\InputTest\\FileIo.java"));
        PrintWriter out = new PrintWriter("E:\\javatest\\myCoreJava\\src\\V3\\InputTest\\out.txt");
        String input = null;
        while (in.hasNext()){
            input = in.next();
            //System.out.println(input);
            out.append(input);
            out.append("\n");
            out.flush();
        }
    }
}
