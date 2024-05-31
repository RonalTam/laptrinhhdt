/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai06.vidu2;

/**
 *
 * @author lakeh
 */
public abstract class KyBinh extends NhanVat implements DiChuyen, TanCong {

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
    public void sucmanh() {
        double energy = this.getNangluong() * 2.8;
        System.out.println("Suc manh = " + energy);
    }

    @Override
    public void hanhdong() {
        if (guom == true) {
            System.out.println("Cuoi ngua dung guom");
        } else {
            System.out.println("Cuoi ngua cam giao");
        }
    }

    @Override
    public String toString() {
        return "KyBinh{" + super.toString() + "guom=" + guom + ", giao=" + giao + ", ngua=" + ngua + '}';
    }

}
