/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai09.vidu2;

import java.util.ArrayList;

/**
 *
 * @author lakeh
 */
public class HoaDon {
    private int maHoaDon;
    private ArrayList<SanPham> dssp;

    public HoaDon(int maHoaDon, ArrayList<SanPham> dssp) {
        this.maHoaDon = maHoaDon;
        this.dssp = dssp;
    }

    public HoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
        this.dssp = new ArrayList<SanPham>();
    }
    
    public void addSanPham(SanPham sp) throws CloneNotSupportedException {
        SanPham temp = (SanPham) sp.clone();
        this.dssp.add(sp);
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public ArrayList<SanPham> getDssp() {
        return dssp;
    }

    public void setDssp(ArrayList<SanPham> dssp) {
        this.dssp = dssp;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "maHoaDon=" + maHoaDon + ", dssp=" + dssp + '}';
    }
    
    
}
