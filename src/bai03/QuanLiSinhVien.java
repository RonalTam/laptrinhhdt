/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai03;

/**
 *
 * @author lakeh
 */
public class QuanLiSinhVien {
    public static void main(String[] args) {
        //Khai bao doi tuong kieu SinhVien
        SinhVien sv;
        //Khoi tao doi tuong sv
        sv = new SinhVien();
        //Gan gia tri cho cac thuoc tinh cua doi tuong sv
        sv.hoten = "Thanh Tam";
        sv.namsinh = 2005;
        sv.sdt = "0855444444";
        
        System.out.println("Ho Ten: " + sv.hoten + " Nam Sinh: " + sv.namsinh + 
               " Sdt: " + sv.sdt );
        
    }
}
