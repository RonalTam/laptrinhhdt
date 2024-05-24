/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap04;

/**
 *
 * @author lakeh
 */
public class XeOto {
    private String hangxe;
    private int namsanxuat;
    private float dongco;

    public XeOto(String hangxe, int namsanxuat, float dongco) {
        this.hangxe = hangxe;
        this.namsanxuat = namsanxuat;
        this.dongco = dongco;
    }

    public String getHangxe() {
        return hangxe;
    }

    public void setHangxe(String hangxe) {
        this.hangxe = hangxe;
    }

    public int getNamsanxuat() {
        return namsanxuat;
    }

    public void setNamsanxuat(int namsanxuat) {
        this.namsanxuat = namsanxuat;
    }

    public float getDongco() {
        return dongco;
    }

    public void setDongco(float dongco) {
        this.dongco = dongco;
    }

    @Override
    public String toString() {
        return "XeOto{" + "hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + ", dongco=" + dongco + '}';
    }
    
    
    
}
