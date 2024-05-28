/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai04.vidu2;

/**
 *
 * @author lakeh
 */
public class Tho extends DongVat {
    private String mausac;
    private int soluong;

    public Tho(String ten, String loai, int tuoi, String gioitinh, String mausac, int soluong) {
        super(ten, loai, tuoi, gioitinh);
        this.mausac = mausac;
        this.soluong = soluong;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return "Tho{" + super.toString() + "mausac=" + mausac + ", soluong=" + soluong + '}';
    } 
}
