/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai09.vidu1;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author lakeh
 */
public class LopHoc {
    private String tenLop;
    private ArrayList<SinhVien> dssv;

    public LopHoc(String tenLop, ArrayList<SinhVien> dssv) {
        this.setTenLop(tenLop);
        this.setDssv(dssv);
    }

    public LopHoc(String tenLop) {
        this.tenLop = tenLop;
        this.dssv = new ArrayList<>();
    }
    
    public void addSinhVien(SinhVien sv) {
        this.dssv.add(sv);
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public ArrayList<SinhVien> getDssv() {
        return dssv;
    }

    public void setDssv(ArrayList<SinhVien> dssv) {
        this.dssv = dssv;
    }

    @Override
    public String toString() {
        return "LopHoc{" + "tenLop=" + tenLop + ", dssv=" + dssv + '}';
    }
    
    
}
