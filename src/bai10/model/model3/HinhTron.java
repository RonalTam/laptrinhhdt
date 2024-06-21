/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai10.model.model3;

/**
 *
 * @author lakeh
 */
public class HinhTron extends HinhHoc {

    private double bankinh;

    @Override
    public double tinhDienTich() {
        return Math.PI * Math.pow(this.bankinh, 2);
    }

    public HinhTron(double bankinh) {
        this.bankinh = bankinh;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    @Override
    public String toString() {
        return "HinhTron{" + "bankinh=" + bankinh + " Dien tich " + tinhDienTich() + '}';
    }
    

}
