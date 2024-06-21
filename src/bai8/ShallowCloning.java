/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8;

import bai08.vidu2.SanPham;

/**
 *
 * @author lakeh
 */
public class ShallowCloning {

    public static void main(String[] args) throws CloneNotSupportedException {
        SanPham sp1 = new SanPham(12, "Messi");
        System.out.println(sp1);

        SanPham sp2 = (SanPham) sp1.clone();
        sp2.setTenSP("Ronaldo");
        sp2.setMaSP(1);
        System.out.println(sp1);
        System.out.println(sp2);
    }
}
