/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lakeh
 */
public abstract class VuKhi implements Cloneable{
    private String tenvk;
    private int soluong;

    public VuKhi(String tenvk, int soluong) {
        this.tenvk = tenvk;
        this.soluong = soluong;
    }

    public String getTenvk() {
        return tenvk;
    }

    public void setTenvk(String tenvk) {
        this.tenvk = tenvk;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    public abstract void tanCong();
    public abstract void phongThu();

    @Override
    public String toString() {
        return "VuKhi{" + "tenvk=" + tenvk + ", soluong=" + soluong + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
