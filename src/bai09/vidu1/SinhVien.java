/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai09.vidu1;

/**
 *
 * @author lakeh
 */
public class SinhVien {
    private String hoTen;
    private LopHoc lop;

    public SinhVien(String hoTen, LopHoc lop) {
        this.setHoTen(hoTen);
        this.setLop(lop);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LopHoc getLop() {
        return lop;
    }

    public void setLop(LopHoc lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "hoTen=" + hoTen + ", lop=" + lop + '}';
    }
    
    
}
