/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai04.vidu2;

/**
 *
 * @author lakeh
 */
public class DongVat {

    private String ten;
    private String loai;
    private int tuoi;
    private String gioitinh;

    public DongVat(String ten, String loai, int tuoi, String gioitinh) {
        this.setTen(ten);
        this.setLoai(loai);
        this.setTuoi(tuoi);
        this.setGioitinh(gioitinh);
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        if (tuoi <= 0) {
            System.out.println("Tuoi khong hop le");
        } else {
            this.tuoi = tuoi;
        }
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        if (tuoi <= 0) {
            return "DongVat{" + "ten=" + ten + ", loai=" + loai + ", gioitinh=" + gioitinh + '}';
        } else {
            return "DongVat{" + "ten=" + ten + ", loai=" + loai + ", tuoi=" + tuoi + ", gioitinh=" + gioitinh + '}';
        }
    }

}
