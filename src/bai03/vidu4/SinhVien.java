/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai03.vidu4;

/**
 *
 * @author lakeh
 */
public class SinhVien {

    private String hoten;
    private int namsinh;
    private String sdt;

    public SinhVien(String hoten, int namsinh, String sdt) {
        this.hoten = hoten;
        this.setNamsinh(namsinh);
        this.sdt = sdt;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        if (namsinh <= 1900 | namsinh >= 2024) {
            System.out.println("Nam sinh: " + namsinh + " ko hop le");
        } else {
            this.namsinh = namsinh;
        }
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "hoten=" + hoten + ", namsinh=" + namsinh + ", sdt=" + sdt + '}';
    }

}
