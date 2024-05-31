/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

import bai05.vidu2.MathHelper;

/**
 *
 * @author lakeh
 */
public class GiaiToan {
    public static void main(String[] args) {
        MathHelper obj = new MathHelper();
        int tongSoNguyen = obj.sum(5, 5);
        double tongSoThuc = obj.sum(5.5, 4.5);
        
        System.out.println(tongSoNguyen);
        System.out.println(tongSoThuc);
        
    }
}
