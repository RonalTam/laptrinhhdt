/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai07;

/**
 *
 * @author lakeh
 */
public class NhanVat {

    private String ten;
    private String id;
    private byte gioitinh;
    private double nangluong;

    public NhanVat(String ten, String id, byte gioitinh, double nangluong) {
        this.ten = ten;
        this.id = id;
        this.gioitinh = gioitinh;
        this.nangluong = nangluong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public byte getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(byte gioitinh) {
        this.gioitinh = gioitinh;
    }

    public double getNangluong() {
        return nangluong;
    }

    public void setNangluong(double nangluong) {
        this.nangluong = nangluong;
    }

    public void hanhdong() {
        System.out.println("........");
    }

    public void sucmanh() {
        System.out.println(".........");
    }

    @Override
    public String toString() {
        return "NhanVat{" + "ten=" + ten + ", id=" + id + ", gioitinh=" + gioitinh + ", nangluong=" + nangluong + '}';
    }

}
