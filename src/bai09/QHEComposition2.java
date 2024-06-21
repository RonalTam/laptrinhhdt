/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai09;

import bai09.vidu4.BanhXe;
import bai09.vidu4.DongCo;
import bai09.vidu4.XeHoi;

/**
 *
 * @author lakeh
 */
public class QHEComposition2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        DongCo dc =new DongCo("xang");
        BanhXe bx = new BanhXe(2.5);
        XeHoi car = new XeHoi(dc);
        for (int i = 0; i < 4; i++) {
            car.addBanhXe(bx);
        }
        System.out.println("Cau Hinh Xe Ban Dau");
        System.out.println(car);
        dc.setLoaiDongCo("Dien");
        bx.setBanKinh(5);
        System.out.println("\n\n");
        System.out.println(car);
    }
 
}
