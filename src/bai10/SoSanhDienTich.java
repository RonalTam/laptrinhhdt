/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai10;

import bai10.model.model3.HinhHoc;
import bai10.model.model3.HinhTron;
import bai10.model.model3.HinhVuong;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author lakeh
 */
public class SoSanhDienTich {

    public static void main(String[] args) {
        ArrayList<HinhHoc> dshh = new ArrayList<HinhHoc>();
        dshh.add(new HinhVuong(3));
        dshh.add(new HinhTron(4.5));
        dshh.add(new HinhVuong(1));
        dshh.add(new HinhTron(2.5));
        dshh.add(new HinhVuong(7));
        dshh.add(new HinhTron(10));

        System.out.println("SAP XEP TANG DAN THEO DIEN TICH");
        Collections.sort(dshh, new Comparator<HinhHoc>() {
            @Override
            public int compare(HinhHoc o1, HinhHoc o2) {
                return Double.compare(o1.tinhDienTich(), o2.tinhDienTich());
            }

        });
        
        for (HinhHoc hinhHoc : dshh) {
            System.out.println(hinhHoc);
        }
    }
}
