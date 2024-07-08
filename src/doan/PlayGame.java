/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doan;

import doan.model.KyBinh;
import doan.model.VuKhi;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lakeh
 */
public class PlayGame {
    public static void main(String[] args) {
        KyBinh kb1 = new KyBinh(5.5, "KyBinhGa", 5);
        List<KyBinh> dskb = new ArrayList<KyBinh>();
        dskb.add(new KyBinh(50.5, "KyBinhHeo", 18));
    }
}
