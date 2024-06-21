/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8;

import bai08.vidu1.SanPham;

/**
 *
 * @author lakeh
 */
public class NoneCloning {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham(12, "Messi");
        System.out.println(sp1);
        
        SanPham sp2 = sp1;
        sp2.setTenSP("Ronaldo");
        
        System.out.println(sp1);
        System.out.println(sp2);
    }
}
