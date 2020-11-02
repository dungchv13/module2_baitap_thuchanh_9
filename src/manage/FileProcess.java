package manage;

import quantities.TaiLieu;

import java.io.*;
import java.util.ArrayList;

public class FileProcess {


    public static void writeFile(ArrayList<TaiLieu> taiLieuArrayList,String path)  {
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(taiLieuArrayList);

            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<TaiLieu> readFile(String path){
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);

            return (ArrayList<TaiLieu>) ois.readObject();
        } catch (ClassNotFoundException | IOException e) {

            return null;
        }
    }
}
