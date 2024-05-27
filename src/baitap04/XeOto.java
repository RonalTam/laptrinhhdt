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
        this.setHangxe(hangxe);
        this.setNamsanxuat(namsanxuat);
        this.setDongco(dongco);
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

    @Override
    public String toString() {
        if (namsanxuat <= 2024 || namsanxuat >= 1886) {
            return "XeOto{" + "hangxe=" + hangxe + ", dongco=" + dongco + '}';
        } else if (dongco >= 1200 || dongco <= 20) {
            return "XeOto{" + "hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + '}';
        } else {
        return "XeOto{" + "hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + ", dongco=" + dongco + '}';
        }
    }

}
