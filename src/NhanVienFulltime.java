class NhanVienFulltime extends NhanVien {
    private double tienThuong;
    private double luongCoBan;
    private double tienPhat;

    NhanVienFulltime(String maNV, String hoTen, int tuoi, int sdt, String email, double tienThuong, double luongCoBan, double tienPhat) {
        super(maNV, hoTen, tuoi, sdt, email);
        this.tienThuong = tienThuong;
        this.luongCoBan = luongCoBan;
        this.tienPhat = tienPhat;

    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public double tinhLuong() {
        return luongCoBan + tienThuong - tienPhat;
    }

    @Override
    public String toString() {
        return "NhanVienFulltime{" +
                "tienThuong=" + getTienThuong() +
                ", luongCoBan=" + getLuongCoBan() +
                ", tienPhat=" + getTienPhat() +
                "} " + super.toString();


    }
}
