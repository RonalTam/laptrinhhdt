/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai05.baitap;

/**
 *
 * @author lakeh
 */
public class BoBinh extends NhanVat {
    private int giao;
    private boolean khien;
    private boolean aogiap;

    public BoBinh(int giao, boolean khien, boolean aogiap, String ten, String id, byte gioitinh, double nangluong) {
        super(ten, id, gioitinh, nangluong);
        this.giao = giao;
        this.khien = khien;
        this.aogiap = aogiap;
    }

    public int getGiao() {
        return giao;
    }

    public void setGiao(int giao) {
        this.giao = giao;
    }

    public boolean isKhien() {
        return khien;
    }

    public void setKhien(boolean khien) {
        this.khien = khien;
    }

    public boolean isAogiap() {
        return aogiap;
    }

    public void setAogiap(boolean aogiap) {
        this.aogiap = aogiap;
    }

    @Override
    public String toString() {
        return "BoBinh{"+ super.toString() + "giao=" + giao + ", khien=" + khien + ", aogiap=" + aogiap + '}';
    }

    @Override
    public void sucmanh() {
        double energy = this.getNangluong() * 1;
        System.out.println("Suc manh = " + energy);
    }

    @Override
    public void hanhdong() {
        System.out.println("Lay giao dam no");
    }
    
    
    
}
