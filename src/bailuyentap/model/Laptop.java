/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailuyentap.model;

/**
 *
 * @author lakeh
 */
public class Laptop extends SanPham {
    private int ram;
    private String cpu;

    public Laptop(int ram, String cpu, int maSanPham, String tenSanPham, int soluong, double giaca) {
        super(maSanPham, tenSanPham, soluong, giaca);
        this.ram = ram;
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Laptop{" + "ram=" + ram + ", cpu=" + cpu + super.toString() + '}';
    }

    
    
}
