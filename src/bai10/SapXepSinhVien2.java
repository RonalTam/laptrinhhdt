/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai10;

import bai10.model2.SinhVien;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author lakeh
 */
public class SapXepSinhVien2 {

    public static void main(String[] args) {
        ArrayList<SinhVien> dssv = new ArrayList<SinhVien>();
        dssv.add(new SinhVien("Messi", 5.5, 37));
        dssv.add(new SinhVien("Ronaldo", 5.1, 39));
        dssv.add(new SinhVien("Bale", 4.5, 30));

        System.out.println("sap xep theo ho ten");
        Collections.sort(dssv, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });

        for (SinhVien sinhVien : dssv) {
            System.out.println(sinhVien);
        }
        System.out.println("");
        System.out.println("sap xep theo diemTB");
        Collections.sort(dssv, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.compare(o1.getDiemTB(), o2.getDiemTB());
            }
        });

        for (SinhVien sinhVien : dssv) {
            System.out.println(sinhVien);
        }

        System.out.println("sap xep theo tuoi");
        Collections.sort(dssv, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Integer.compare(o1.getTuoi(), o2.getTuoi());
            }
        });

        for (SinhVien sinhVien : dssv) {
            System.out.println(sinhVien);
        }
    }
}
