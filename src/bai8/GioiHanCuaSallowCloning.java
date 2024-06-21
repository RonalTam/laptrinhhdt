/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8;

import bai08.vidu3.HoaDon;
import bai08.vidu3.SanPham;
import java.util.ArrayList;

/**
 *
 * @author lakeh
 */
public class GioiHanCuaSallowCloning {

    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<SanPham> dssp = new ArrayList<>();
        dssp.add(new SanPham(1, "Messi"));
        dssp.add(new SanPham(2, "ROnaldo"));

        HoaDon hd1 = new HoaDon(1, new ArrayList<>());
        System.out.println(hd1);
        
        HoaDon hd2;
        hd2 = (HoaDon)hd1.clone();
        hd2.getDssp().getFirst().setTenSP("Bale");
        
        System.out.println(hd1);
        System.out.println(hd2);
    }

}
