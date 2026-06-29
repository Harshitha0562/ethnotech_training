package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.util.Scanner;

public class FH {
    public static void main(String [] args) throws IOException {
        /*
        //creating a file
        System.out.println("starting my file");
        String path="C:\\Users\\DELL\\IdeaProjects\\ethnotech_training\\src\\fileHandling\\test.text";
        File f=new File(path);
        //giving permission to write
        FileWriter fw=new FileWriter(f);
        BufferedWriter bw=new BufferedWriter(fw);
        //fw.write("Hello");
        bw.write("Hello guys");
        bw.close();
        fw.close();
         */

        /*
        //adding data into existing file
        System.out.println("starting my file");
        String path="C:\\Users\\DELL\\IdeaProjects\\ethnotech_training\\src\\fileHandling\\test.text";
        File f=new File(path);
        //giving permission to write
        FileWriter fw=new FileWriter(f,true);
        BufferedWriter bw=new BufferedWriter(fw);
        Scanner sc=new Scanner(System.in);
        String user_input=sc.nextLine();

        //fw.write("Hello");
        bw.newLine();
        bw.write(user_input);
        bw.close();
        fw.close();
        */


        System.out.println("starting my file");
        String path="C:\\Users\\DELL\\IdeaProjects\\ethnotech_training\\src\\fileHandling\\test.text";
        File f=new File(path);
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        int ch;
        int count=0;
        while((ch=br.read())!=-1)
        {
            System.out.print((char)ch);
            count++;
        }
        System.out.println();
        System.out.println (count);



    }
}
