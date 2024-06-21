/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai10.model.model3;

/**
 *
 * @author lakeh
 */
public class HinhVuong extends HinhHoc {

    private double canh;

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public String toString() {
        return "HinhVuong{" + "canh=" + canh + "  Dien tich " + tinhDienTich() + '}';
    }

    @Override
    public double tinhDienTich() {
        return canh * canh;
    }
    
    
}
