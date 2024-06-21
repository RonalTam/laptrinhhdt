/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptailop.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lakeh
 */
public class NhanVat implements HanhDong {

    private String tennhanvat;
    private int level;
    private VuKhi vk;

    public NhanVat(String tennhanvat, int level, VuKhi vk) {
        this.tennhanvat = tennhanvat;
        this.level = level;
        this.vk = vk;
    }

    public NhanVat(String tennhanvat, int level) {
        this.tennhanvat = tennhanvat;
        this.level = level;
    }

    public static void lucChien() {
    }

    public String getTennhanvat() {
        return tennhanvat;
    }

    public void setTennhanvat(String tennhanvat) {
        this.tennhanvat = tennhanvat;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public VuKhi getVk() {
        return vk;
    }

    public void setVk(VuKhi vk) {
        this.vk = vk;
    }

    @Override
    public String toString() {
        return "NhanVat{" + "tennhanvat=" + tennhanvat + ", level=" + level + ", vk=" + vk + '}';
    }

    @Override
    public void diChuyen() {
        System.out.println("Nhan vat di chuyen");
    }

    @Override
    public void tanCong() {
        System.out.println("Nhan vat tan cong");
    }

}
