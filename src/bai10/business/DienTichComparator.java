/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai10.business;

import bai10.model.model3.HinhHoc;
import java.util.Comparator;

/**
 *
 * @author lakeh
 */
public class DienTichComparator implements Comparator<HinhHoc> {

    @Override
    public int compare(HinhHoc o1, HinhHoc o2) {
        return Double.compare(o1.tinhDienTich(), o2.tinhDienTich());
    }
    
}
