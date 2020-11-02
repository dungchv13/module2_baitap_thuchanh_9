package quantities;

public class Sach extends TaiLieu {
    private String tacGia;
    private String soTrang;

    public Sach() {
    }

    public Sach(String id, String nhaSanXuat, String soLuong, String tacGia, String soTrang) {
        super(id, nhaSanXuat, soLuong);
        this.tacGia = tacGia;
        this.soTrang = soTrang;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(String soTrang) {
        this.soTrang = soTrang;
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
        return "Sách {" +
                "Mã tài liệu :'" + this.getId() + '\'' +
                ", nhà sản xuất :'" + this.getNhaSanXuat() + '\'' +
                ", số lượng :'" + this.getSoLuong() + '\'' +
                ", tác giả: '" + tacGia + '\'' +
                ", số trang: '" + soTrang + '\'' +
                "} ";
    }
}
