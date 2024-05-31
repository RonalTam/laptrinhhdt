/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai06.vidu2;

/**
 *
 * @author lakeh
 */
public abstract class BoBinh extends NhanVat implements DiChuyen, TanCong {

    private int giao;
    private boolean khien;
    private boolean aogiap;

    public BoBinh(int giao, boolean khien, boolean aogiap, String ten, String id, byte gioitinh, double nangluong) {
        super(ten, id, gioitinh, nangluong);
        this.giao = giao;
        this.khien = khien;
        this.aogiap = aogiap;
    }
    
    public void tancongKhongVuKhi(){
        
    }
    
    public void tancongCoVuKhi(){
        
    }
    
    public void sangPhai() {
        System.out.println("Nhan vat di chuyen sang phai");
    }

    public void sangTrai() {
        System.out.println("Nhan vat di chuyen sang trai");
    }

    public void nhayLen() {
        System.out.println("Nhan vat nhay len");

    }

    public void boChay() {
        System.out.println("Nhan vat  bay cho");

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
        return "BoBinh{" + super.toString() + "giao=" + giao + ", khien=" + khien + ", aogiap=" + aogiap + '}';
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
