/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailuyentap2.model;

import java.util.List;

/**
 *
 * @author lakeh
 */
public class KyBinh extends NhanVat implements Cloneable {

    private int kinhnghiem;

    public KyBinh(int kinhnghiem, double nangluong, String ten) {
        super(nangluong, ten);
        this.kinhnghiem = kinhnghiem;
    }

    public int getKinhnghiem() {
        return kinhnghiem;
    }

    public void setKinhnghiem(int kinhnghiem) {
        this.kinhnghiem = kinhnghiem;
    }

    @Override
    public void sangPhai() {
        System.out.println("Di chuyen sang phai 50m");
    }

    @Override
    public void sangTrai() {
        System.out.println("Di chuyen sang trai 50m");
    }

    @Override
    public String toString() {
        return "KyBinh{" + "kinhnghiem=" + kinhnghiem + super.toString() + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
