import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<NhanVien> danhSach = new ArrayList<>();
        danhSach.add(new NhanVienFulltime("1234","hoatam",26,93736,"tamhoa1234",1000000,5000000,200000));
        danhSach.add(new NhanVienParttime("1235","hoatam",26,93736,"tamhoa1234",10));
        danhSach.add(new NhanVienFulltime("1236","hoatam",26,93736,"tamhoa1234",1000000,5000000,200000));
        danhSach.add(new NhanVienParttime("1237","hoatam",26,93736,"tamhoa1234",10));
        danhSach.add(new NhanVienFulltime("1238","hoatam",26,93736,"tamhoa1234",1000000,5000000,200000));
        danhSach.add(new NhanVienParttime("1239","hoatam",26,93736,"tamhoa1234",10));

      for (NhanVien nv : danhSach) {
            if (nv instanceof NhanVienFulltime) {
                System.out.println("Nhan vien fulltime: " + nv.toString());
                System.out.println("Luong: " + ((NhanVienFulltime) nv).tinhLuong());
            } else if (nv instanceof NhanVienParttime) {
                System.out.println("Nhan vien partime: " + nv.toString());
                System.out.println("Luong: " + ((NhanVienParttime) nv).tinhLuong());
            }
        }
        System.out.println("Danh sach nhan vien co luong thap hon luong trung binh la: ");
      }

    }

//class NhanVien{
//    private String maNV;
//    private String hoTen;
//    private int tuoi;
//    private int sdt;
//    private String email;
//    NhanVien(String maNV, String hoTen, int tuoi, int sdt, String email) {
//        this.maNV = maNV;
//        this.hoTen = hoTen;
//        this.tuoi = tuoi;
//        this.sdt = sdt;
//        this.email = email;
//
//    }
//    public String getMaNV() {
//        return maNV;
//    }
//    public void setMaNV(String maNV) {
//        this.maNV = maNV;
//    }
//    public String getHoTen() {
//        return hoTen;
//    }
//    public void setHoTen(String hoTen) {
//        this.hoTen = hoTen;
//    }
//    public int getTuoi() {
//        return tuoi;
//    }
//    public void setTuoi(int tuoi) {
//        this.tuoi = tuoi;
//    }
//    public int getSdt() {
//        return sdt;
//    }
//    public void setSdt(int sdt) {
//        this.sdt = sdt;
//    }
//    public String getEmail() {
//        return email;
//    }
//    public void setEmail(String email) {
//        this.email = email;
//    }
//    public String toString() {
//        return "NhanVien{" +
//                "maNV='" + maNV + '\'' +
//                ", hoTen='" + hoTen + '\'' +
//                ", tuoi=" + tuoi +
//                ", sdt=" + sdt +
//                ", email='" + email + '\'' +
//                '}';
//    }
//
//
//}
//class NhanVienFulltime extends NhanVien {
//    private double tienThuong;
//    private double luongCoBan;
//    private double tienPhat;
//
//    NhanVienFulltime(String maNV, String hoTen, int tuoi, int sdt, String email, double tienThuong, double luongCoBan, double tienPhat) {
//        super(maNV, hoTen, tuoi, sdt, email);
//        this.tienThuong = tienThuong;
//        this.luongCoBan = luongCoBan;
//        this.tienPhat = tienPhat;
//
//    }
//
//    public double getTienThuong() {
//        return tienThuong;
//    }
//
//    public void setTienThuong(double tienThuong) {
//        this.tienThuong = tienThuong;
//    }
//
//    public double getLuongCoBan() {
//        return luongCoBan;
//    }
//
//    public void setLuongCoBan(double luongCoBan) {
//        this.luongCoBan = luongCoBan;
//    }
//
//    public double getTienPhat() {
//        return tienPhat;
//    }
//
//    public void setTienPhat(double tienPhat) {
//        this.tienPhat = tienPhat;
//    }
//
//    public double tinhLuong() {
//        return luongCoBan + tienThuong - tienPhat;
//    }
//
//    @Override
//    public String toString() {
//        return "NhanVienFulltime{" +
//                "tienThuong=" + getTienThuong() +
//                ", luongCoBan=" + getLuongCoBan() +
//                ", tienPhat=" + getTienPhat() +
//                "} " + super.toString();
//
//
//    }
//}
//
//class NhanVienParttime extends NhanVien{
//    private double gioLamViec;
//    NhanVienParttime(String maNV, String hoTen, int tuoi, int sdt, String email,int gioLamViec) {
//        super(maNV, hoTen, tuoi, sdt, email);
//        this.gioLamViec = gioLamViec;
//    }
//    public double getGioLamViec() {
//        return gioLamViec;
//    }
//    public void setGioLamViec(double gioLamViec) {
//        this.gioLamViec = gioLamViec;
//    }
//    public double tinhLuong() {
//        return gioLamViec * 100000;
//    }
//        @Override
//        public String toString() {
//            return "NhanVienParttime{" +
//                    "gioLamViec=" + gioLamViec +
//                    "} " + super.toString();
//        }
//}
