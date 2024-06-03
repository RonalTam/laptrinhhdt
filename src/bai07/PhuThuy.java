/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai07;

/**
 *
 * @author lakeh
 */
public class PhuThuy extends NhanVat implements DiChuyen{
    private boolean choi;
    private boolean gay;

    public PhuThuy(boolean choi, boolean gay, String ten, String id, byte gioitinh, double nangluong) {
        super(ten, id, gioitinh, nangluong);
        this.choi = choi;
        this.gay = gay;
    }

    public boolean isChoi() {
        return choi;
    }

    public void setChoi(boolean choi) {
        this.choi = choi;
    }

    public boolean isGay() {
        return gay;
    }

    public void setGay(boolean gay) {
        this.gay = gay;
    }
    
    @Override
    public void sucmanh(){
        System.out.println(".....PhuThuy SucManh.......");
    }
    
    @Override
    public void hanhdong(){
        System.out.println(".....PhuThuy HanhDOng.......");
    }

    @Override
    public String toString() {
        return "PhuThuy{" + "choi=" + choi + ", gay=" + gay + super.toString() + '}';
    }

    @Override
    public void sangPhai() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sangTrai() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void nhayLen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void bochay() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
