package SER_and_DSER.deserialization;

import SER_and_DSER.serialization.SER;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DSER {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path="C:\\Users\\DELL\\IdeaProjects\\ethnotech_training\\src\\SER_and_DSER\\serialization\\t1.txt";
        FileInputStream fis=new FileInputStream(path);
        ObjectInputStream ois=new ObjectInputStream(fis);
        SER obj=(SER)ois.readObject();
        obj.display();
        ois.close();
        fis.close();
    }
}
