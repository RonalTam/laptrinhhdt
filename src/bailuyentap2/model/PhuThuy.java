/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailuyentap2.model;

import java.util.List;

/**
 *
 * @author lakeh
 */
public class PhuThuy extends NhanVat {

    private String phepthuat;

    public PhuThuy(String phepthuat, double nangluong, String ten) {
        super(nangluong, ten);
        this.phepthuat = phepthuat;
    }

    public String getPhepthuat() {
        return phepthuat;
    }

    public void setPhepthuat(String phepthuat) {
        this.phepthuat = phepthuat;
    }

    @Override
    public void sangPhai() {
        System.out.println("Di chuyen sang phai 10m");
    }

    @Override
    public void sangTrai() {
        System.out.println("Di chuyen sang trai 10m");
    }

    @Override
    public String toString() {
        return "PhuThuy{" + "phepthuat=" + phepthuat + super.toString() + '}';
    }
    
    
}
