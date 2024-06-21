/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai10;

import bai10.model.SinhVien;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author lakeh
 */
public class SapXepSinhVien1 {

    public static void main(String[] args) {
        ArrayList<SinhVien> dssv = new ArrayList<SinhVien>();
        dssv.add(new SinhVien("Messi", 5.5, 37));
        dssv.add(new SinhVien("Ronaldo", 5.1, 39));
        dssv.add(new SinhVien("Bale", 4.5, 30));
        for (SinhVien sinhVien : dssv) {
            System.out.println(sinhVien);
        }
        System.out.println("\n");
        //sắp xếp theo hoten đc định nghĩa trong compareTo lop 
        Collections.sort(dssv);
        for (SinhVien sinhVien : dssv) {
            System.out.println(sinhVien);
        }
    }
}
