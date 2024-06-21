/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptailop.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lakeh
 */
public class KyBinh extends NhanVat {

    private boolean giap;
    private boolean ngua;
    private List<BinhDoan> dsbd = new ArrayList<BinhDoan>();

    public KyBinh(boolean giap, boolean ngua, String tennhanvat, int level, VuKhi vk) {
        super(tennhanvat, level, vk);
        this.giap = giap;
        this.ngua = ngua;
    }

    public KyBinh(boolean giap, boolean ngua, String tennhanvat, int level) {
        super(tennhanvat, level);
        this.giap = giap;
        this.ngua = ngua;
    }

    public void addBinhDoan(BinhDoan bd) throws CloneNotSupportedException{
        this.dsbd.add((BinhDoan) bd.clone());
    }

    public boolean isGiap() {
        return giap;
    }

    public void setGiap(boolean giap) {
        this.giap = giap;
    }

    public boolean isNgua() {
        return ngua;
    }

    public void setNgua(boolean ngua) {
        this.ngua = ngua;
    }

    public List<BinhDoan> getDsbd() {
        return dsbd;
    }

    public void setDsbd(List<BinhDoan> dsbd) {
        this.dsbd = dsbd;
    }

    @Override
    public void tanCong() {
        System.out.println("Ky Binh Tan Cong");
    }

    @Override
    public void diChuyen() {
        System.out.println("Ky Binh Di CHuyen");
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    

   

    
    

}
