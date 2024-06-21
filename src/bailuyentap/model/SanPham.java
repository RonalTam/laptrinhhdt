/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailuyentap.model;

/**
 *
 * @author lakeh
 */
public class SanPham implements Cloneable {
    private int maSanPham;
    private String tenSanPham;
    private int soluong;
    private double giaca;

    public SanPham(int maSanPham, String tenSanPham, int soluong, double giaca) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soluong = soluong;
        this.giaca = giaca;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getGiaca() {
        return giaca;
    }

    public void setGiaca(double giaca) {
        this.giaca = giaca;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", soluong=" + soluong + ", giaca=" + giaca + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
