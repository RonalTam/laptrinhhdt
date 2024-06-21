/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptailop.model;

/**
 *
 * @author lakeh
 */
public class BinhDoan implements Cloneable {
    private int madb;
    private int soluong;
    
    public int tongLucChien() {
        return soluong * 1000;
    }

    public BinhDoan(int madb, int soluong) {
        this.madb = madb;
        this.soluong = soluong;
    }

    public int getMadb() {
        return madb;
    }

    public void setMadb(int madb) {
        this.madb = madb;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return "BinhDoan{" + "madb=" + madb + ", soluong=" + soluong + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
