/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai04.vidu3;

/**
 *
 * @author lakeh
 */
public class QLCC {
    public static void main(String[] args) {
        LopCha obj1 = new LopCha("AAA", 15, 3.5);
        
        obj1.thuoctinh2 = 20;
        
        System.out.println(obj1);
        
        obj1.phuongthuc2();
        obj1.phuongthuc3();
        obj1.vidugoiprivate();
        
        System.out.println(obj1);
        
        LopCon obj2 = new LopCon("HTT", "QWER", 5, 3.4);
        obj2.phuongthuc2();
        System.out.println(obj2);
    }
}
