package SER_and_DSER.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        SER obj=new SER(1,"Harshitha");
        obj.display();
        String path="C:\\Users\\DELL\\IdeaProjects\\ethnotech_training\\src\\SER_and_DSER\\serialization\\t1.txt";
        FileOutputStream fos=new FileOutputStream(path);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj);
        oos.close();
        fos.close();
    }
}
