package quantities;

import java.io.Serializable;

public class TaiLieu implements Serializable {
    private String id;
    private String nhaSanXuat;
    private String soLuong;

    public TaiLieu() {
    }

    public TaiLieu(String id, String nhaSanXuat, String soLuong) {
        this.id = id;
        this.nhaSanXuat = nhaSanXuat;
        this.soLuong = soLuong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "Tài liệu{" +
                "Mã tài liệu :'" + id + '\'' +
                ", nhà sản xuất :'" + nhaSanXuat + '\'' +
                ", số lượng :'" + soLuong + '\'' +
                '}';
    }
}
