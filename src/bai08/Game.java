/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai08;

import bai08.baitap.KyBinh;
import bai08.baitap.VuKhi;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lakeh
 */
public class Game {

    public static void main(String[] args) {
        ArrayList<VuKhi> vk = new ArrayList<VuKhi>();
        vk.add(new VuKhi("PhongLon", 5));
        vk.add(new VuKhi("MaTau", 15));
        KyBinh kb1 = new KyBinh(1, vk);

        System.out.println(kb1);

        KyBinh kb2;
        try {
            kb2 = (KyBinh) kb1.clone();
            kb2.setMaKyBinh(111);
            kb2.getVk().getFirst().setTenVuKhi("DaoGam");
            kb2.getVk().getFirst().setSoLuong(5);
            
            System.out.println(kb1);
            System.out.println(kb2);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
