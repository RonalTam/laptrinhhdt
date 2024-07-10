/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

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

    public void setDsvk(List<VuKhi> dsvk) {
        this.dsvk = dsvk;
    }

    @Override
    public String toString() {
        return "NhanVat{" + "nangluong=" + nangluong + ", ten=" + ten + ", dsvk=" + dsvk + '}';
    }

    @Override
    public void sangTrai() {
    }

    @Override
    public void sangPhai() {
    }

    @Override
    public void diLen() {
    }

    @Override
    public void diXuong() {
    }

}
