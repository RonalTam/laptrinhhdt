/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai09.vidu3;

/**
 *
 * @author lakeh
 */
public class BanhXe {

    private double banKinh;

    public BanhXe(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public String toString() {
        return "BanhXe{" + "banKinh=" + banKinh + '}';
    }

}
