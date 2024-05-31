/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai04.vidu3;

/**
 *
 * @author lakeh
 */
public class LopCon extends LopCha {
    private String thuoctinh;

    public LopCon(String thuoctinh, String thuoctinh1, int thuoctinh2, double thuoctinh3) {
        super(thuoctinh1, thuoctinh2, thuoctinh3);
        this.thuoctinh = thuoctinh;
    }

    public String getThuoctinh() {
        return thuoctinh;
    }

    public void setThuoctinh(String thuoctinh) {
        this.thuoctinh = thuoctinh;
    }

    @Override
    public String toString() {
        return "LopCon{" + "thuoctinh=" + thuoctinh + super.toString() +'}';
    }
    
    
    
}
