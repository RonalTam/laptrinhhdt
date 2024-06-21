/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai12;

import bai12.model.BoSuuTap;
import bai12.model.HinhHoc;
import bai12.model.HinhTron;
import bai12.model.HinhVuong;

/**
 *
 * @author lakeh
 */
public class QLHH {
    public static void main(String[] args) throws CloneNotSupportedException {
        BoSuuTap dshh = new BoSuuTap();
        dshh.addHinhHoc(new HinhVuong(5));
        dshh.addHinhHoc(new HinhTron(5));
        
    }
}
