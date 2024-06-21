/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai08.baitap;

/**
 *
 * @author lakeh
 */
public class VuKhi {
    private String tenVuKhi;
    private int soLuong;

    public VuKhi(String tenVuKhi, int soLuong) {
        this.setTenVuKhi(tenVuKhi);
        this.setSoLuong(soLuong);
    }

    public String getTenVuKhi() {
        return tenVuKhi;
    }

    public void setTenVuKhi(String tenVuKhi) {
        this.tenVuKhi = tenVuKhi;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "VuKhi{" + "tenVuKhi=" + tenVuKhi + ", soLuong=" + soLuong + '}';
    }
    
    
}
