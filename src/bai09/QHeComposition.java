/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai09;

import bai09.vidu3.BanhXe;
import bai09.vidu3.DongCo;
import bai09.vidu3.XeHoi;

/**
 *
 * @author lakeh
 */
public class QHeComposition {

    public static void main(String[] args) throws CloneNotSupportedException {
        DongCo dc = new DongCo("Xang");
        System.out.println("Dong co ban dau: " + dc);
        XeHoi car = new XeHoi(dc);
        BanhXe bx1 = new BanhXe(50);
        BanhXe bx2 = new BanhXe(50);
        BanhXe bx3 = new BanhXe(50);
        BanhXe bx4 = new BanhXe(50);
        car.addBanhXe(bx1);
        car.addBanhXe(bx2);
        car.addBanhXe(bx3);
        car.addBanhXe(bx4);
        System.out.println(car);
        dc.setLoaiDongCo("Dien");
        bx1.setBanKinh(1.5);
        System.out.println(car);
                
    }
}
