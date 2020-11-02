package program;

import manage.TaiLieuManage;
import quantities.Bao;
import quantities.Sach;
import quantities.TaiLieu;
import quantities.TapChi;


import java.util.Scanner;

public class Menus {
    private Scanner input = new Scanner(System.in);
    public TaiLieu menuAdd(TaiLieuManage manage){
        System.out.println("*****************");
        System.out.println("Tài liệu bạn muốn nhập thông tin là: ");
        System.out.println("1.Sách.");
        System.out.println("2.Báo.");
        System.out.println("3.Tạp chí.");
        System.out.print("Enter your choice: ");
        String choice = InputFunc.inputString("[1-3]");


        System.out.print("Nhập mã tài liệu(2-4 chữ số): ");
        String id = notContainId(manage);

        System.out.print("Nhập tên nhà sản xuất: ");
        String nhaSanXuat = InputFunc.inputString(".+");
        System.out.print("Nhập số lượng: ");
        String soLuong = InputFunc.inputString("\\d+");
        if(choice.equals("1")){
            System.out.print("Nhập tên tác giả: ");
            String tacGia = InputFunc.inputString(".+");
            System.out.print("Nhập tên số trang: ");
            String soTrang = InputFunc.inputString("\\d+");

            return new Sach(id,nhaSanXuat,soLuong,tacGia,soTrang);
        }else if(choice.equals("2")){
            System.out.print("Nhập ngày phát hành(dd/mm/yyyy): ");
            String ngayPhatHanh = InputFunc.inputDate();

            return new Bao(id,nhaSanXuat,soLuong,ngayPhatHanh);
        }else {
            System.out.print("Nhập số phát hành(ba chữ số):");
            String soPhatHanh = InputFunc.inputString("\\d{3}");
            System.out.print("Nhập tháng phát hành(ex:05):");
            String thangPhatHanh = InputFunc.inputString("(0[1-9]|1[012])");

            return new TapChi(id,nhaSanXuat,soLuong,soPhatHanh,thangPhatHanh);
        }
    }
    public void menuUpdate(TaiLieuManage manage){
        System.out.println("*****************");
        System.out.print("Nhập mã tài liệu(2-4 chữ số): ");
        String id = containId(manage);
        TaiLieu doc = manage.search(id);
        System.out.print("Update tên nhà sẳn xuất: ");
        doc.setNhaSanXuat(InputFunc.inputString(".+"));
        System.out.print("Update số lượng: ");
        doc.setSoLuong(InputFunc.inputString("\\d+"));
        if(doc instanceof Bao){
            System.out.print("Update ngày phát hành: ");
            ((Bao) doc).setNgayPhatHanh(InputFunc.inputDate());
        }else if(doc instanceof Sach){
            System.out.print("Update  tên tác giả: ");
            ((Sach) doc).setTacGia(InputFunc.inputString(".+"));
            System.out.print("Update số trang: ");
            ((Sach) doc).setSoTrang(InputFunc.inputString("\\d+"));
        }else if(doc instanceof TapChi){
            System.out.print("Update số phát hành: ");
            ((TapChi) doc).setSoPhatHanh(InputFunc.inputString("\\d{3}"));
            System.out.print("Update tháng phát hành: ");
            ((TapChi) doc).setThangPhatHanh(InputFunc.inputString("(0[1-9]|1[012])"));
        }
        manage.update(doc);
        System.out.println("Tài liệu sau khi update: "+doc);
    }

    public void menuDelete(TaiLieuManage manage){
        System.out.println("*****************");
        System.out.print("Nhập mã tài liệu(2-4 chữ số): ");
        String id = containId(manage);
        TaiLieu doc = manage.search(id);
        if(doc != null) {
            System.out.println("tài liệu đã xóa: "+doc);
            manage.delete(doc);
        }else {
            System.out.println("no document have this id!");
        }
    }

    public void menuSearch(TaiLieuManage manage){
        System.out.println("*****************");
        System.out.print("Nhập mã tài liệu(2-4 chữ số): ");
        String id = containId(manage);
        TaiLieu doc = manage.search(id);
        System.out.println(doc);
    }

    private String notContainId(TaiLieuManage manage){
        String id = InputFunc.inputString("\\d{2,4}");
        if(manage.contain(id)){
            System.out.println("this id already exist");
            System.out.print("Re-enter:");
            id = notContainId(manage);
        }
        return id;
    }
    private String containId(TaiLieuManage manage){
        String id = InputFunc.inputString("\\d{2,4}");
        if(manage.contain(id)){
            return id;
        }else{
            System.out.println("no document have this id!");
            System.out.print("Re-enter: ");
            return containId(manage);
        }

    }

}
