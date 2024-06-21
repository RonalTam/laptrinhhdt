/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptailop.model;

/**
 *
 * @author lakeh
 */
public class CungTen extends VuKhi {
    private int ad;
    private double tamban;

    public CungTen(int ad, double tamban) {
        this.ad = ad;
        this.tamban = tamban;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public double getTamban() {
        return tamban;
    }

    public void setTamban(double tamban) {
        this.tamban = tamban;
    }

    @Override
    public double sucTanCong() {
        return ad * tamban;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return "CungTen{" + "ad=" + ad + ", tamban=" + tamban + '}';
    }
    
    
    
}
