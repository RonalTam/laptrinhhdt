/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

import bai05.baitap.KyBinh;

/**
 *
 * @author lakeh
 */
public class GameHD {
    public static void main(String[] args) {
    KyBinh kb = new KyBinh(true, false, true, "Volkath", "ITA01", (byte) 1, 4.5);
        System.out.println(kb);
        kb.hanhdong();
        kb.sucmanh();
    }
}
