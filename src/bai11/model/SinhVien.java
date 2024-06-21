/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai11.model;

/**
 *
 * @author lakeh
 */
public class SinhVien {
    private String hoten;
    private double dtb;
    private int tuoi;

    public SinhVien(String hoten, double dtb, int tuoi) {
        this.hoten = hoten;
        this.dtb = dtb;
        this.tuoi = tuoi;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "hoten=" + hoten + ", dtb=" + dtb + ", tuoi=" + tuoi + '}';
    }

    
}
