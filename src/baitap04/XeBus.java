/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap04;

/**
 *
 * @author lakeh
 */
public class XeBus {
    private String hangxe;
    private int namsanxuat;
    private float dongco;
    private int soghe;

    public XeBus(String hangxe, int namsanxuat, float dongco, int soghe) {
        this.hangxe = hangxe;
        this.namsanxuat = namsanxuat;
        this.dongco = dongco;
        this.soghe = soghe;
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

    public int getSoghe() {
        return soghe;
    }

    public void setSoghe(int soghe) {
        this.soghe = soghe;
    }

    @Override
    public String toString() {
        return "XeBus{" + "hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + ", dongco=" + dongco + ", soghe=" + soghe + '}';
    }
    
    
}
