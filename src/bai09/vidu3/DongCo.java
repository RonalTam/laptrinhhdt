/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai09.vidu3;

/**
 *
 * @author lakeh
 */
public class DongCo implements Cloneable {
    private String loaiDongCo;

    public DongCo(String loaiDongCo) {
        this.loaiDongCo = loaiDongCo;
    }

    public String getLoaiDongCo() {
        return loaiDongCo;
    }

    public void setLoaiDongCo(String loaiDongCo) {
        this.loaiDongCo = loaiDongCo;
    }

    @Override
    public String toString() {
        return "DongCo{" + "loaiDongCo=" + loaiDongCo + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
