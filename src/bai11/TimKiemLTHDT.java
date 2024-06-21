/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai11;

import bai11.model.SinhVien;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author lakeh
 */
public class TimKiemLTHDT {

    public static void main(String[] args) {
        List<SinhVien> dssv = new ArrayList<>();
        dssv.add(new SinhVien("Messi", 9.9, 36));
        dssv.add(new SinhVien("Ronaldo", 9.5, 39));
        dssv.add(new SinhVien("Beckham", 8, 49));
        dssv.add(new SinhVien("Enzo", 6.5, 23));
        dssv.add(new SinhVien("D.Rice", 7, 28));

        System.out.println("Danh sach sinh vien ban dau:");
        for (SinhVien sinhVien : dssv) {
            System.out.println(sinhVien);
        }
        System.out.println("--------------------------");

        // Tim kiem sv co dtb thap nhat
        SinhVien sv_min = Collections.min(dssv, Comparator.comparingDouble(SinhVien::getDtb));

        System.out.println("Sinh vien co DTB thap nhat:");
        System.out.println(sv_min);

        // Tim kiem sv co tuoi cao nhat
        
        SinhVien sv_max = Collections.max(dssv, Comparator.comparingInt(SinhVien::getTuoi));
        System.out.println("Sinh vien co tuoi cao nhat:");
        System.out.println(sv_max);

        // Tim kiem sv co ten Ronaldo
        Collections.sort(dssv, Comparator.comparing(SinhVien::getHoten));
        int vitri = Collections.binarySearch(dssv, new SinhVien("Ronaldo", 0, 0), Comparator.comparing(SinhVien::getHoten));
        
        if (vitri < 0) {
            
            System.out.println("Khong tim thay");
        } else {
            System.out.println("Vi tri sinh vien co ten Ronaldo: " + vitri);
            System.out.println(dssv.get(vitri));
        }
        
        // su dung Stream va cu phap lambda
        List<SinhVien> kqloc = dssv.stream()
                .filter(sv -> sv.getDtb() >= 8)
                .filter(sv -> sv.getDtb() <= 10)
                .filter(sv -> sv.getTuoi() >= 25)
                .filter(sv -> sv.getTuoi() <= 40)
                .toList();
        System.out.println("");
        System.out.println("Ket qua loc");
        for (SinhVien sinhVien : kqloc) {
            System.out.println(sinhVien);
        }
        System.out.println("------------------");
        
        //xay dung menh de logic - Predicate
        //loc sv co 8<= dtb <= 10 or 18<= tuoi <=20
        //xay dung menh de logic 8<= dtb <= 10
        Predicate<SinhVien> dk_dtb = new Predicate<SinhVien>() {
            @Override
            public boolean test(SinhVien t) {
                return t.getDtb() >= 8 && t.getDtb() <= 10;
            }
        };
        //xay dun menh de tuoi
        Predicate<SinhVien> dk_tuoi = new Predicate<SinhVien>() {
            @Override
            public boolean test(SinhVien t) {
                return t.getTuoi() >= 30 && t.getTuoi() <= 38;
            }
        };

        List<SinhVien> dskq = dssv.stream()
                .filter(dk_dtb.or(dk_tuoi))
                .toList();
        System.out.println("");
        System.out.println("Ket qua loc 2");
        for (SinhVien sinhVien : dskq) {
            System.out.println(sinhVien);
        }
        System.out.println("------------------");
    }
}

