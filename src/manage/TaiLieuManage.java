package manage;

import quantities.TaiLieu;
import quantities.TapChi;

import java.io.IOException;
import java.util.ArrayList;

public class TaiLieuManage {
    private ArrayList<TaiLieu> myList = new ArrayList<>();
    private String path = "E:\\module2\\baitap_module2\\thuchanh_9\\DocumentList";

    public void add(TaiLieu doc){
        myList = FileProcess.readFile(path);
        if (myList == null) {
            myList = new ArrayList<>();

        }
        myList.add(doc);
        FileProcess.writeFile(myList,path);

    }
    public void update(TaiLieu doc){
        myList = FileProcess.readFile(path);
        TaiLieu d1 = new TapChi();
        for (TaiLieu d:myList) {
            if(d.getId().equals(doc.getId())){
                d1 = d;
            }
        }
        int index = myList.indexOf(d1);
        myList.remove(d1);
        myList.add(index,doc);
        FileProcess.writeFile(myList,path);
    }
    public void delete(TaiLieu doc){
        myList = FileProcess.readFile(path);
        TaiLieu d1 = new TapChi();
        for (TaiLieu d:myList) {
            if(d.getId().equals(doc.getId())){
                d1 = d;
            }
        }
        int index = myList.indexOf(d1);
        myList.remove(d1);
        FileProcess.writeFile(myList,path);
    }
    //note
    public void displayAll(){
        myList = FileProcess.readFile(path);
        for (TaiLieu doc:myList) {
            System.out.println(doc);
        }
    }
    public void displayOne(String id){
        myList = FileProcess.readFile(path);
        TaiLieu doc = search(id);
        System.out.println(doc);
    }

    public TaiLieu search(String id){
        myList = FileProcess.readFile(path);
        for (TaiLieu doc:myList) {
            if(doc.getId().equals(id)){
                return doc;
            }
        }
        return null;
    }
    public boolean contain(String id){
        myList = FileProcess.readFile(path);
        if(myList == null){
            return false;
        }
        for (TaiLieu doc:myList) {
            if(doc.getId().equals(id)){
                return true;
            }
        }
        return false;
    }


}
