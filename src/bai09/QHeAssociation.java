/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai09;

import bai09.vidu1.LopHoc;
import bai09.vidu1.SinhVien;

/**
 *
 * @author lakeh
 */
public class QHeAssociation {

    public static void main(String[] args) {
        SinhVien sv = new SinhVien("AAAA", new LopHoc("k20"));
        System.out.println(sv);

        LopHoc lop = new LopHoc("k20");
        lop.addSinhVien(sv);
        System.out.println(lop);
    }
}
