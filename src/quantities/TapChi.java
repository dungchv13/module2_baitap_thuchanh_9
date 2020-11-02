package quantities;

public class TapChi extends TaiLieu {
    private String soPhatHanh;
    private String thangPhatHanh;

    public TapChi() {
    }

    public TapChi(String id, String nhaSanXuat, String soLuong, String soPhatHanh, String thangPhatHanh) {
        super(id, nhaSanXuat, soLuong);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(String thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
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
        return "Tạp chí{" +
                "Mã tài liệu :'" + this.getId() + '\'' +
                ", nhà sản xuất :'" + this.getNhaSanXuat() + '\'' +
                ", số lượng :'" + this.getSoLuong() + '\'' +
                ", số phát hành:'" + soPhatHanh + '\'' +
                ", tháng phát hành:'" + thangPhatHanh + '\'' +
                "} ";
    }
}
