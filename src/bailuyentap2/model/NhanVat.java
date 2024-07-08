/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailuyentap2.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lakeh
 */
public class NhanVat implements DiChuyen {

    private double nangluong;
    private String ten;
    private List<VuKhi> dsvk;

    public NhanVat(double nangluong, String ten) {
        this.nangluong = nangluong;
        this.ten = ten;
        this.dsvk = new ArrayList<VuKhi>();
    }

    public void addVuKhi(VuKhi vk) throws CloneNotSupportedException {
        this.dsvk.add((VuKhi) vk.clone());
    }

    public double getNangluong() {
        return nangluong;
    }

    public void setNangluong(double nangluong) {
        this.nangluong = nangluong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public List<VuKhi> getDsvk() {
        return dsvk;
    }

    public void setDsvk(List<VuKhi> dsvk) throws CloneNotSupportedException {
        for (VuKhi item : dsvk) {
            this.dsvk.add((VuKhi) item.clone());
        }
    }

    @Override
    public String toString() {
        return "NhanVat{" + "nangluong=" + nangluong + ", ten=" + ten + ", dsvk=" + dsvk + '}';
    }

    @Override
    public void sangTrai() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sangPhai() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
