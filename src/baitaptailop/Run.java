/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptailop;

import baitaptailop.model.BinhDoan;
import baitaptailop.model.Choi;
import baitaptailop.model.CungTen;
import baitaptailop.model.DoiQuan;
import baitaptailop.model.KyBinh;
import baitaptailop.model.NhanVat;
import baitaptailop.model.PhuThuy;
import baitaptailop.model.VuKhi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author lakeh
 */
public class Run {

    public static void main(String[] args) {
        VuKhi vk1 = new CungTen(350, 500);
        VuKhi vk2 = new Choi(500, 250);
        List<NhanVat> dsnv = new ArrayList<NhanVat>();
        PhuThuy pt1 = new PhuThuy(true, "Syndra", 18);
        PhuThuy pt2 = new PhuThuy(false, "Viktor", 15, new Choi(350, 100));
        PhuThuy pt3 = new PhuThuy(true, "kata", 2, new Choi(50, 200));
        dsnv.add(pt1);
        dsnv.add(pt2);
        dsnv.add(pt3);

        KyBinh kb1 = new KyBinh(true, true, "Hecraim", 12, vk1);
        KyBinh kb2 = new KyBinh(true, true, "Ashe", 1, vk1);
        KyBinh kb3 = new KyBinh(true, true, "Varus", 3, vk1);
        KyBinh kb4 = new KyBinh(true, true, "Rell", 17, vk1);
        dsnv.add(kb1);
        dsnv.add(kb2);
        dsnv.add(kb3);
        dsnv.add(kb4);

        for (NhanVat nhanVat : dsnv) {
            System.out.println(nhanVat);
        }

        Collections.sort(dsnv, new Comparator<NhanVat>() {
            @Override
            public int compare(NhanVat o1, NhanVat o2) {
                return Integer.compare(o1.getLevel(), o2.getLevel());
            }
        });
        System.out.println("");
        System.out.println("Sap Xep Theo Level");
        for (NhanVat nhanVat : dsnv) {
            System.out.println(nhanVat);
        }
        Collections.sort(dsnv, new Comparator<NhanVat>() {
            @Override
            public int compare(NhanVat o1, NhanVat o2) {
                return o1.getTennhanvat().compareTo(o2.getTennhanvat());
            }
        });
        System.out.println("");
        System.out.println("Sap Xep Theo Ten");
        for (NhanVat nhanVat : dsnv) {
            System.out.println(nhanVat);
        }
        
        Predicate<NhanVat> dk_nv = new Predicate<NhanVat>() {
            @Override
            public boolean test(NhanVat t) {
                return t.getLevel() <= 15 && t.getLevel() >= 3;
            }
        };
        
        List<NhanVat> lknv = dsnv.stream()
                .filter(dk_nv)
                .toList();
        System.out.println("");
        System.out.println("Liet ke nhan vat lv 3 - 15");
        for (NhanVat nhanVat : lknv) {
            System.out.println(nhanVat);
        }
        
        BinhDoan db = new  BinhDoan(20, 500);
    }
}
