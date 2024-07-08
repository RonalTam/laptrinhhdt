/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailuyentap2.model;

/**
 *
 * @author lakeh
 */
public class CungTen extends VuKhi {

    private double tamban;

    public CungTen(double tamban, String tenvk, int soluong) {
        super(tenvk, soluong);
        this.tamban = tamban;
    }

    public double getTamban() {
        return tamban;
    }

    public void setTamban(double tamban) {
        this.tamban = tamban;
    }

    @Override
    public String toString() {
        return "CungTen{" + "tamban=" + tamban + '}';
    }

    @Override
    public void tanCong() {
        System.out.println("ban mui ten ");
    }

    @Override
    public void phongThu() {
        System.out.println("Ne ne ne");
    }

}
