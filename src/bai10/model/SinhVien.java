/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai10.model;

/**
 *
 * @author lakeh
 */
public class SinhVien implements Comparable<SinhVien> {

    private String hoTen;
    private double diemTB;
    private int tuoi;

    public SinhVien(String hoTen, double diemTB, int tuoi) {
        this.hoTen = hoTen;
        this.diemTB = diemTB;
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "hoTen=" + hoTen + ", diemTB=" + diemTB + ", tuoi=" + tuoi + '}';
    }

    
    @Override
    public int compareTo(SinhVien o) {
        return Double.compare(diemTB, o.diemTB);
    }

}
