package chp8.example.ex10;

import java.io.*;
import java.util.*;

public class Test {
    public static void main() {

        Properties pro = new Properties();

        try {
            FileInputStream fis = new FileInputStream("ipConfig.properties");
            pro.load(fis);
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
        System.out.println("server ip:" + pro.getProperty("server"));
        System.out.println("server ip:" + pro.getProperty("port"));
    }
}