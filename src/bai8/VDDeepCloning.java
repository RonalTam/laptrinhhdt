/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8;

import bai08.vidu4.HoaDon;
import bai08.vidu4.SanPham;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lakeh
 */
public class VDDeepCloning {

    public static void main(String[] args) {
        ArrayList<SanPham> dssp = new ArrayList<SanPham>();
        dssp.add(new SanPham(1, "Messi"));
        dssp.add(new SanPham(2, "ROnaldo"));

        HoaDon hd1 = new HoaDon(1, dssp);

        System.out.println(hd1);

        HoaDon hd2;
        try {
            hd2 = (HoaDon) hd1.clone();
            hd2.setMaHD(15);
            hd2.getDssp().getFirst().setMaSP(18);
            hd2.getDssp().getFirst().setTenSP("IPhone");
            System.out.println("Hoa don 1: " + hd1);
            System.out.println("Hoa don 2: " + hd2);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(VDDeepCloning.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
