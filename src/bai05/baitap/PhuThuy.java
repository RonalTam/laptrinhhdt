/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai05.baitap;

/**
 *
 * @author lakeh
 */
public class PhuThuy extends NhanVat {

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
    public String toString() {
        return "PhuThuy{" + super.toString() + "choi=" + choi + ", gay=" + gay + '}';
    }

    @Override
    public void sucmanh() {
        double energy = this.getNangluong() * 2.5;
        System.out.println("Suc manh = " + energy);
    }

    @Override
    public void hanhdong() {
        if (choi == true) {
            System.out.println("Nem cay choi");
        } else {
            System.out.println("Nem cay gay");
        }
    }

}
