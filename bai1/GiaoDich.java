/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package THUCHANHLAB4.bai1;
import java.until.Scanner;
/**
 *
 * @author Ngoc Nhi
 */
public class GiaoDich {
    private int id;
    private String date;
    private double unitPrice;
    private double area;
    Scanner scanner = new Scanner(System.in);

    public GiaoDich(int id, String date, double unitPrice, double area) {
        this.id = id;
        this.date = date;
        this.unitPrice = unitPrice;
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
 public void nhap() {
        System.out.print("Nhập mã giao dịch: ");
        id = scanner.nextInt();
        System.out.print("Nhập ngày giao dịch (ngày/tháng/năm): ");
        date = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        unitPrice = scanner.nextDouble();
        System.out.print("Nhập diện tích: ");
        area = scanner.nextDouble();
    }
     
    @Override
    public String toString() {
        return String.format("%s%15s%15s%15s",id,date,unitPrice,area);
    }
    
   
}
