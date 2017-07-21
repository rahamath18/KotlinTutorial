package com.test.kotlintutorial;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by rahamathullahrahamathullah on 7/17/17.
 */

public class TestJava2HTML {

    public static String space = "&nbsp;&nbsp;&nbsp;";
    public static String blue = "<font color=\"#0037b3\">fun</font>";
    public static String green = "<font color=\"#4ed297\">";
    public static String clsFont = "</font>";
    public static String platform = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Target platform: " +
            "JVMRunning on kotlin v. 1.1.3";

    public static String br1 = " <br>";
    public static String br2 = " <br><br>";

    public static void main(String args[]) {

        System.out.println();
        try {
            FileReader fr = new FileReader("/Users/rahamathullahrahamathullah/AndroidStudio3Projects/KotlinTutorial/app/src/test/java/com/test/kotlintutorial/javacode.txt");
            BufferedReader br = new BufferedReader(fr);
            int firstReminderCount = 0;
            int count = 0;
            String line = "";
            while(br.ready()) {
                line = br.readLine().trim();
                if(line.trim().equals(""))
                    continue;
                else {
//					System.out.println(line);
                    System.out.println(line
                            .replaceAll("fun", blue)
                            .replaceAll("val", blue)
                            .replaceAll("}", "} br1") + br1);

                }
            }
            fr.close();
            br.close();
        } catch(Exception e) {

        }
    }
}
