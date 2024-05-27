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
        this.setHangxe(hangxe);
        this.setNamsanxuat(namsanxuat);
        this.setDongco(dongco);
        this.setSoghe(soghe);
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
        if (namsanxuat <= 2024 || namsanxuat >= 1886) {
            System.out.println(namsanxuat + "khong hop le");
        } else {
            this.namsanxuat = namsanxuat;
        }
    }

    public float getDongco() {
        return dongco;
    }

    public void setDongco(float dongco) {
        if (dongco >= 1200 || dongco <= 20) {
            System.out.println(dongco + "Khong hop le");
        } else {
            this.dongco = dongco;
        }
    }

    public int getSoghe() {
        return soghe;
    }

    public void setSoghe(int soghe) {
        if (soghe <= 1 || soghe >= 60) {
            System.out.println(soghe + "Khong phu hop");
        } else {
            this.soghe = soghe;
        }
    }

    @Override
    public String toString() {
        if (namsanxuat <= 2024 || namsanxuat >= 1886) {
            return "XeBus{" + "hangxe=" + hangxe + ", dongco=" + dongco + ", soghe=" + soghe + '}';
        } else if (dongco >= 1200 || dongco <= 20) {
            return "XeBus{" + "hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + ", soghe=" + soghe + '}';
        } else if (soghe <= 1 || soghe >= 60) {
            return "XeBus{" + "hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + ", dongco=" + dongco + '}';
        } else {
            return "XeBus{" + "hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + ", dongco=" + dongco + ", soghe=" + soghe + '}';

        }
    }

}
