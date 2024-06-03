/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai07;

/**
 *
 * @author lakeh
 */
public class KyBinh extends NhanVat implements DiChuyen {
    private boolean guom;
    private boolean giao;
    private boolean ngua;

    public KyBinh(boolean guom, boolean giao, boolean ngua, String ten, String id, byte gioitinh, double nangluong) {
        super(ten, id, gioitinh, nangluong);
        this.guom = guom;
        this.giao = giao;
        this.ngua = ngua;
    }

    public boolean isGuom() {
        return guom;
    }

    public void setGuom(boolean guom) {
        this.guom = guom;
    }

    public boolean isGiao() {
        return giao;
    }

    public void setGiao(boolean giao) {
        this.giao = giao;
    }

    public boolean isNgua() {
        return ngua;
    }

    public void setNgua(boolean ngua) {
        this.ngua = ngua;
    }

    @Override
    public String toString() {
        return "KyBinh{" + "guom=" + guom + ", giao=" + giao + ", ngua=" + ngua + super.toString() + '}';
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
