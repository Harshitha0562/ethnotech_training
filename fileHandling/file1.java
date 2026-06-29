package fileHandling;

import java.io.*;

public class file1 {
    public static void main(String [] args) throws IOException {
        System.out.println("starting the file");
        String path="C:\\Users\\DELL\\IdeaProjects\\ethnotech_training\\src\\fileHandling\\test.text";
        File f1=new File(path);
        File f2=new File("C:\\Users\\DELL\\IdeaProjects\\ethnotech_training\\src\\fileHandling\\test1.text");

        FileInputStream fis1=new FileInputStream(f1);
        FileOutputStream fos2=new FileOutputStream(f2);

        int ch;
        while((ch=fis1.read())!=-1)
        {
            System.out.print((char)ch);
            fos2.write(ch);
        }
        fis1.close();
        fos2.close();
    }
}
