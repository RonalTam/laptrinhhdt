/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai10;

import bai10.business.DienTichComparator;
import bai10.model.model3.HinhHoc;
import bai10.model.model3.HinhTron;
import bai10.model.model3.HinhVuong;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author lakeh
 */
public class SoSanhDienTich2 {

    public static void main(String[] args) {
        ArrayList<HinhHoc> dshh = new ArrayList<>();

        dshh.add(new HinhVuong(3));
        dshh.add(new HinhTron(4.5));
        dshh.add(new HinhVuong(1));
        dshh.add(new HinhTron(2.5));
        dshh.add(new HinhVuong(7));
        dshh.add(new HinhTron(22.5));
        System.out.println("SAP XEP TANG DAN THEO DIEN TICH");
        Collections.sort(dshh, new DienTichComparator());
        for (HinhHoc hinhHoc : dshh) {
            System.out.println(hinhHoc);
        }
    }
}
