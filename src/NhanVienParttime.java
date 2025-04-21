class NhanVienParttime extends NhanVien{
    private double gioLamViec;
    NhanVienParttime(String maNV, String hoTen, int tuoi, int sdt, String email,int gioLamViec) {
        super(maNV, hoTen, tuoi, sdt, email);
        this.gioLamViec = gioLamViec;
    }
    public double getGioLamViec() {
        return gioLamViec;
    }
    public void setGioLamViec(double gioLamViec) {
        this.gioLamViec = gioLamViec;
    }
    public double tinhLuong() {
        return gioLamViec * 100000;
    }
        @Override
        public String toString() {
            return "NhanVienParttime{" +
                    "gioLamViec=" + gioLamViec +
                    "} " + super.toString();
        }
}
