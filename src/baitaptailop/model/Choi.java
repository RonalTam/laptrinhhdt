/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptailop.model;

/**
 *
 * @author lakeh
 */
public class Choi extends VuKhi {
    private int ap;
    private double tocdobay;

    public Choi(int ap, double tocdobay) {
        this.ap = ap;
        this.tocdobay = tocdobay;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public double getTocdobay() {
        return tocdobay;
    }

    public void setTocdobay(double tocdobay) {
        this.tocdobay = tocdobay;
    }

    @Override
    public double sucTanCong() {
        return ap * tocdobay;
    }

    @Override
    public String toString() {
        return "Choi{" + "ap=" + ap + ", tocdobay=" + tocdobay + '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
