class NhanVien{
    private String maNV;
    private String hoTen;
    private int tuoi;
    private int sdt;
    private String email;
    NhanVien(String maNV, String hoTen, int tuoi, int sdt, String email) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.sdt = sdt;
        this.email = email;

    }
    public String getMaNV() {
        return maNV;
    }
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public int getSdt() {
        return sdt;
    }
    public void setSdt(int sdt) {
        this.sdt = sdt;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return "NhanVien{" +
                "maNV='" + maNV + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", sdt=" + sdt +
                ", email='" + email + '\'' +
                '}';
    }


}