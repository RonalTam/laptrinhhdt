/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lakeh
 */
public class PhuThuy extends NhanVat {
    public double phepthuat;

    public PhuThuy(String ten, double nangluong, double phepthuat) {
        super(nangluong, ten);
        this.phepthuat = phepthuat;
    }

    public double getPhepthuat() {
        return phepthuat;
    }

    public void setPhepthuat(double phepthuat) {
        this.phepthuat = phepthuat;
    }

    @Override
    public String toString() {
        return super.toString() + "PhuThuy{" + "phepthuat=" + phepthuat + '}';
    }

    @Override
    public void diXuong() {
        System.out.println("Phu Thuy di Xuong");
    }

    @Override
    public void diLen() {
        System.out.println("Phu Thuy di Len");
    }

    @Override
    public void sangPhai() {
        System.out.println("Phu Thuy sang Phai");
    }

    @Override
    public void sangTrai() {
        System.out.println("Phu Thuy sang Trai");
    }
    
    
    
    
    
}
