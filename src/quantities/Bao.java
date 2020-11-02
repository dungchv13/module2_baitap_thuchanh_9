package quantities;

import java.time.LocalDate;

public class Bao extends TaiLieu {
    private String ngayPhatHanh;

    public Bao() {
    }

    public Bao(String id, String nhaSanXuat, String soLuong, String ngayPhatHanh) {
        super(id, nhaSanXuat, soLuong);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public String getNhaSanXuat() {
        return super.getNhaSanXuat();
    }

    @Override
    public void setNhaSanXuat(String nhaSanXuat) {
        super.setNhaSanXuat(nhaSanXuat);
    }

    @Override
    public String getSoLuong() {
        return super.getSoLuong();
    }

    @Override
    public void setSoLuong(String soLuong) {
        super.setSoLuong(soLuong);
    }

    @Override
    public String toString() {
        return "Báo {" +
                "Mã tài liệu: '" + this.getId() + '\'' +
                ", nhà sản xuất: '" + this.getNhaSanXuat() + '\'' +
                ", số lượng: '" + this.getSoLuong() + '\'' +
                ", ngày phát hành: " + ngayPhatHanh +
                "} ";
    }
}
