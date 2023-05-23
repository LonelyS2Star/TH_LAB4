package THUCHANHLAB4.bai3;
import java.util.Scanner;
/**
 *
 * @author Ngoc Nhi
 */
public class DiemHocVien {
    String hoTen;
    int namSinh;
    float mon1;
     float mon2;
      float mon3;
       float mon4;
        float mon5;

    public DiemHocVien(String hoTen, int namSinh, float mon1, float mon2, float mon3, float mon4, float mon5) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
        this.mon4 = mon4;
        this.mon5 = mon5;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public float getMon1() {
        return mon1;
    }

    public void setMon1(float mon1) {
        this.mon1 = mon1;
    }

    public float getMon2() {
        return mon2;
    }

    public void setMon2(float mon2) {
        this.mon2 = mon2;
    }

    public float getMon3() {
        return mon3;
    }

    public void setMon3(float mon3) {
        this.mon3 = mon3;
    }

    public float getMon4() {
        return mon4;
    }

    public void setMon4(float mon4) {
        this.mon4 = mon4;
    }

    public float getMon5() {
        return mon5;
    }

    public void setMon5(float mon5) {
        this.mon5 = mon5;
    }

    @Override
    public String toString() {
        return "DiemHocVien{" + "hoTen=" + hoTen + ", namSinh=" + namSinh + ", mon1=" + mon1 + ", mon2=" + mon2 + ", mon3=" + mon3 + ", mon4=" + mon4 + ", mon5=" + mon5 + '}';
    }

    public void hienThiTT() {
        System.out.printf("%-5s %-20s %-15s %-15s \n",hoTen,namSinh,mon1,mon2,mon3,mon4,mon5);
    }
}
