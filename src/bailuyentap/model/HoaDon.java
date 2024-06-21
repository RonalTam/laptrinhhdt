/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailuyentap.model;

import java.util.ArrayList;

/**
 *
 * @author lakeh
 */
public class HoaDon {
    private int soHoaDon;
    private ArrayList<SanPham> dssp;

    public HoaDon(int soHoaDon, ArrayList<SanPham> dssp) {
        this.soHoaDon = soHoaDon;
        this.dssp = dssp;
    }

    public HoaDon(int soHoaDon) {
        this.soHoaDon = soHoaDon;
        this.dssp = new ArrayList<SanPham>();
    }
    
    
    public void addSanPham (SanPham sp) throws CloneNotSupportedException {
        SanPham temp = (SanPham) sp.clone();
        this.dssp.add(sp);
    }

    public int getSoHoaDon() {
        return soHoaDon;
    }

    public void setSoHoaDon(int soHoaDon) {
        this.soHoaDon = soHoaDon;
    }

    public ArrayList<SanPham> getDssp() {
        return dssp;
    }

    public void setDssp(ArrayList<SanPham> dssp) {
        for (SanPham sanPham : dssp) {
            this.dssp.add(sanPham);
        }
    }

    

    @Override
    public String toString() {
        return "HoaDon{" + "soHoaDon=" + soHoaDon + ", dssp=" + dssp + '}';
    }

//    void add(HoaDon hd) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    
    
}
