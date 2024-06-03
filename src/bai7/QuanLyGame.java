/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai7;

import bai07.KyBinh;
import bai07.NhanVat;
import bai07.PhuThuy;
import java.util.ArrayList;

/**
 *
 * @author lakeh
 */
public class QuanLyGame {

    public static void main(String[] args) {
        KyBinh kb1 = new KyBinh(true, true, true, "KyBinh1", "KB-1", (byte) 1, 10);
        KyBinh kb2 = new KyBinh(true, true, true, "KyBinh2", "KB-2", (byte) 2, 60);
        KyBinh kb3 = new KyBinh(true, true, true, "KyBinh3", "KB-3", (byte) 2, 5);
        KyBinh kb4 = new KyBinh(true, true, true, "KyBinh4", "KB-4", (byte) 2, 5.5);
        KyBinh kb5 = new KyBinh(true, true, true, "KyBinh5", "KB-5", (byte) 1, 150);

        PhuThuy pt6 = new PhuThuy(true, true, "PhuThuy6", "PT-6", (byte) 2, 150);
        PhuThuy pt7 = new PhuThuy(true, true, "PhuThuy7", "PT-7", (byte) 2, 50);
        PhuThuy pt8 = new PhuThuy(true, true, "PhuThuy8", "PT-8", (byte) 1, 150);
        PhuThuy pt9 = new PhuThuy(true, true, "PhuThuy9", "PT-9", (byte) 1, 150);
        PhuThuy pt10 = new PhuThuy(true, true, "PhuThuy10", "PT-10", (byte) 1, 50);

        ArrayList<NhanVat> dsnv = new ArrayList<>();
        dsnv.add(kb1);
        dsnv.add(kb2);
        dsnv.add(kb3);
        dsnv.add(kb4);
        dsnv.add(kb5);
        dsnv.add(pt6);
        dsnv.add(pt7);
        dsnv.add(pt8);
        dsnv.add(pt9);
        dsnv.add(pt10);

        int d = 0;
        for (NhanVat nhanVat : dsnv) {
            if (nhanVat instanceof KyBinh) {
                System.out.println(nhanVat);
                d++;
            }
        }
        if (d == 0) {
            System.out.println("Khong co ky binh nao");
        } else {
            System.out.println("Co " + d + " trong danh sach");
        }
    }
}
