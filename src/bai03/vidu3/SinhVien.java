/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai03.vidu3;

/**
 *
 * @author lakeh
 */
public class SinhVien {

    private String hoten;
    private int namsinh;
    private String sdt;

    public String getHoten() {
        return hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setNamsinh(int namsinh) {
        if (namsinh <= 1980) {
            System.out.print(namsinh + "Khong hop le.\n");
        } else {
            this.namsinh = namsinh;
        }
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        if (namsinh == 0) {
        return "SinhVien{" + "namsinh=" + namsinh + ", sdt=" + sdt + '}';
        } else {
        }
        return "SinhVien{" + "hoten=" + hoten + ", namsinh=" + namsinh + ", sdt=" + sdt + '}';
    }

}
