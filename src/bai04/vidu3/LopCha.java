/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai04.vidu3;

/**
 *
 * @author lakeh
 */
public class LopCha {
    private String thuoctinh1;
    protected  int thuoctinh2;
    public double thuoctinh3;

    public LopCha(String thuoctinh1, int thuoctinh2, double thuoctinh3) {
        this.thuoctinh1 = thuoctinh1;
        this.thuoctinh2 = thuoctinh2;
        this.thuoctinh3 = thuoctinh3;
    }

    public String getThuoctinh1() {
        return thuoctinh1;
    }

    public void setThuoctinh1(String thuoctinh1) {
        this.thuoctinh1 = thuoctinh1;
    }

    public int getThuoctinh2() {
        return thuoctinh2;
    }

    public void setThuoctinh2(int thuoctinh2) {
        this.thuoctinh2 = thuoctinh2;
    }

    public double getThuoctinh3() {
        return thuoctinh3;
    }

    public void setThuoctinh3(double thuoctinh3) {
        this.thuoctinh3 = thuoctinh3;
    }

    @Override
    public String toString() {
        return "LopCha{" + "thuoctinh1=" + thuoctinh1 + ", thuoctinh2=" + thuoctinh2 + ", thuoctinh3=" + thuoctinh3 + '}';
    }
    
    private void phuongthuc1() {
        System.out.println("Day la private");
    }
    
    protected void phuongthuc2() {
        System.out.println("Day la protected");
    }
    
    public void phuongthuc3() {
        System.out.println("Day la public");
    }
    
    public void vidugoiprivate() {
        System.out.println("Truy cap den thuoc tinh va phuong thuc private");
        this.thuoctinh1 = "BBB";
        this.thuoctinh2 = 500;
        this.thuoctinh3 = 5.56;
        this.phuongthuc1();
        
    }
}
