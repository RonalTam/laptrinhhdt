/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai04.vidu1;

import java.time.LocalDate;

/**
 *
 * @author lakeh
 */
public class Nguoi {

    private String hoten;
    private int namsinh;

    public Nguoi(String hoten, int namsinh) {
        this.setHoten(hoten);
        this.setNamsinh(namsinh);
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
        LocalDate localDate = LocalDate.now();
        int nam = localDate.getYear();
        
        if (namsinh >= nam || namsinh <= 1800) {
            System.out.println(namsinh + " khong hop le");
        } else {
            this.namsinh = namsinh;
        }
    }

    @Override
    public String toString() {
        if (namsinh >= 2025 || namsinh <= 1800) {
            return "Nguoi{" + "hoten=" + hoten + '}';
        } else {
            return "Nguoi{" + "hoten=" + hoten + ", namsinh=" + namsinh + '}';
        }
    }

}
