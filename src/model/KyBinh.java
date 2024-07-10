/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lakeh
 */
public class KyBinh extends NhanVat implements Cloneable {

    private String kinhnghiem;

    public KyBinh(String ten, double nangluong, String phepthuat) {
        super(nangluong, ten);
        this.kinhnghiem = phepthuat;
    }

    public String getKinhnghiem() {
        return kinhnghiem;
    }

    public void setKinhnghiem(String kinhnghiem) {
        this.kinhnghiem = kinhnghiem;
    }

    @Override
    public String toString() {
        return super.toString() + "KyBinh{" + "kinhnghiem=" + kinhnghiem + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void diXuong() {
        System.out.println("Ky Binh di Xuong");
    }

    @Override
    public void diLen() {
        System.out.println("Ky Binh di Len");

    }

    @Override
    public void sangPhai() {
        System.out.println("Ky Binh sang Phai");
    }

    @Override
    public void sangTrai() {
        System.out.println("Ky Binh sang Trai");
    }

}
