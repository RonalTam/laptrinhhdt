/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai06.vidu2;

/**
 *
 * @author lakeh
 */
public abstract class KiemKhach extends NhanVat implements DiChuyen, TanCong{
    private int sokiem;
    private int capdosudung;

    public KiemKhach(int sokiem, int capdosudung, String ten, String id, byte gioitinh, double nangluong) {
        super(ten, id, gioitinh, nangluong);
        this.sokiem = sokiem;
        this.capdosudung = capdosudung;
    }

    public int getSokiem() {
        return sokiem;
    }

    public void setSokiem(int sokiem) {
        this.sokiem = sokiem;
    }

    public int getCapdosudung() {
        return capdosudung;
    }

    public void setCapdosudung(int capdosudung) {
        this.capdosudung = capdosudung;
    }

    @Override
    public String toString() {
        return "KiemKhach{" + super.toString() + "sokiem=" + sokiem + ", capdosudung=" + capdosudung + '}';
    }

    @Override
    public void hanhdong() {
        System.out.println("Chem bang kiem");
    }

    @Override
    public void sucmanh() {
        double energy = this.getNangluong() * 0.5;
        System.out.println("Suc manh = " + energy);
    }
    
    
    
    
}
