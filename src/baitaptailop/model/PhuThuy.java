/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptailop.model;

import java.util.List;

/**
 *
 * @author lakeh
 */
public class PhuThuy extends NhanVat {
    private boolean giap;

    public PhuThuy(boolean giap, String tennhanvat, int level, VuKhi vk) {
        super(tennhanvat, level, vk);
        this.giap = giap;
    }

    public PhuThuy(boolean giap, String tennhanvat, int level) {
        super(tennhanvat, level);
        this.giap = giap;
    }
    
    

    public boolean isGiap() {
        return giap;
    }

    public void setGiap(boolean giap) {
        this.giap = giap;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    

    @Override
    public void tanCong() {
        System.out.println("Phu Thuy Tan Cong");
    }

    @Override
    public void diChuyen() {
        System.out.println("Phu Thuy Di Chuyen");
    }
    
    
    
    
}
