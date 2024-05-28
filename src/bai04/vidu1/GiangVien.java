/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai04.vidu1;

/**
 *
 * @author lakeh
 */
public class GiangVien extends Nguoi {

    private String masoGV;
    private String trinhdo;
    private String chuyennganh;

    public GiangVien(String hoten, int namsinh, String masoGV, String trinhdo, String chuyennganh) {
        super(hoten, namsinh);
        this.masoGV = masoGV;
        this.trinhdo = trinhdo;
        this.chuyennganh = chuyennganh;
    }

    public String getMasoGV() {
        return masoGV;
    }

    public void setMasoGV(String masoGV) {
        if (masoGV.isEmpty()) {
            System.out.println("Ma giang vien rong");
        } else {
            this.masoGV = masoGV;
        }
    }

    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }

    public String getChuyennganh() {
        return chuyennganh;
    }

    public void setChuyennganh(String chuyennganh) {
        this.chuyennganh = chuyennganh;
    }

    @Override
    public String toString() {
        return "GiangVien{" + super.toString() + "masoGV=" + masoGV + ", trinhdo=" + trinhdo
                + ", chuyennganh=" + chuyennganh + '}';
    }
}
