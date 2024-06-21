/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai09;

import bai09.vidu2.HoaDon;
import bai09.vidu2.SanPham;

/**
 *
 * @author lakeh
 */
public class QHeAggregation {
    public static void main(String[] args) throws CloneNotSupportedException {
        SanPham sp1 = new SanPham("Den da k duong");
        HoaDon hd1 = new HoaDon(1975);
        hd1.addSanPham(sp1);
        SanPham sp2 = new SanPham("Tra dao cam xe");
        hd1.addSanPham(sp2);
        System.out.println(hd1);
        sp2.setTensp("ABCDFG");
    }
}
