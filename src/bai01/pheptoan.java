/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai01;

/**
 *
 * @author lakeh
 */
public class pheptoan {

    public static void main(String[] args) {
        int a = 13;
        int b = 3;
        int c = a + b;
        System.out.println("Cong = " + c);
        c = a - b;
        System.out.println("Tru = " + c);
        c = a * b;
        System.out.println("Nhan = " + c);
        c = a / b;
        System.out.println("Chia lay phan nguyen = " + c);
        c = a % b;
        System.out.println("Chia lay phan du = " + c);
        
        
        String s1 = "Ho Thanh Tam";
        String s2 = "ho thanh tam k21";
        System.err.println("");
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s2.contains(s1.toLowerCase()));
        s1 += " " + s2;
        System.out.println(s1);
                
        
    }
}
