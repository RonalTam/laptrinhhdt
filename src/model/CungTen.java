/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lakeh
 */
public class CungTen extends VuKhi {
    private double tamdanh;

    public CungTen(String tenvk, int soluong, double tamdanh) {
        super(tenvk, soluong);
        this.tamdanh = tamdanh;
    }

    public double getTamdanh() {
        return tamdanh;
    }

    public void setTamdanh(double tamdanh) {
        this.tamdanh = tamdanh;
    }

    @Override
    public String toString() {
        return super.toString() + "CungTen{" + "tamdanh=" + tamdanh + '}';
    }

    @Override
    public void tanCong() {
        System.out.println("Su dung Cung Ten tan cong");
    }

    @Override
    public void phongThu() {
        System.out.println("Su dung Cung Ten phong thu");
    }
    
    
    
    
    
}
