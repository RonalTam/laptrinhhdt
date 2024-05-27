/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai04.vidu1;

/**
 *
 * @author lakeh
 */
public class Nguoi {
    private String hoten;
    private int namsinh;

    public Nguoi(String hoten, int namsinh) {
        this.hoten = hoten;
        this.namsinh = namsinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    @Override
    public String toString() {
        return "Nguoi{" + "hoten=" + hoten + ", namsinh=" + namsinh + '}';
    }
    
    
}
