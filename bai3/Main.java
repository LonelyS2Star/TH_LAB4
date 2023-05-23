/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package THUCHANHLAB4.bai3;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Ngoc Nhi
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    static void nhapThongTinh(DiemHocVien tt) {
        System.out.println("Nhập họ tên sinh viên: ");
        tt.setHoTen(sc.nextLine());
        ;
        sc.nextLine();
        System.out.println("Nhập năm sinh sinh viên: ");
        tt.setNamSinh(sc.nextInt());
        System.out.println("Nhập điểm môn 1: ");
        tt.setMon1(sc.nextFloat());
        System.out.println("Nhập điểm môn 2: ");
        tt.setMon2(sc.nextFloat());
        System.out.println("Nhập điểm môn 3: ");
        tt.setMon3(sc.nextFloat());
        System.out.println("Nhập điểm môn 4: ");
        tt.setMon4(sc.nextFloat());
        System.out.println("Nhập điểm môn 15: ");
        tt.setMon5(sc.nextFloat());
    }
     public static void main(String[] args) {
        DiemHocVien sv[] = null;
        int a, n = 0;
        boolean flag = true;
        do {
            System.out.println("Bạn chọn làm gì?");
            System.out.println("1.Nhập thông tin sinh viên. \n" +
                    "2.Kiểm tra thông tin.\n" +
                    "Nhập số khác để thoát");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Nhập số lượng sinh viên: ");
                    n = sc.nextInt();
                    sv = new DiemHocVien[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh viên thứ " + (i + 1)+": ");
                        sv[i] = new DiemHocVien();
                        nhapThongTinh(sv[i]);
 
                    }
                    break;
                     case 2:
                        
                   
}