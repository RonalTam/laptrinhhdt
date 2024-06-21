/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailuyentap.model;

/**
 *
 * @author lakeh
 */
public class DongCo implements Cloneable {
    private String loaiDongCo;
    private double congsuat;

    public DongCo(String loaiDongCo, double congsuat) {
        this.loaiDongCo = loaiDongCo;
        this.congsuat = congsuat;
    }

    public String getLoaiDongCo() {
        return loaiDongCo;
    }

    public void setLoaiDongCo(String loaiDongCo) {
        this.loaiDongCo = loaiDongCo;
    }

    public double getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(double congsuat) {
        this.congsuat = congsuat;
    }

    @Override
    public String toString() {
        return "DongCo{" + "loaiDongCo=" + loaiDongCo + ", congsuat=" + congsuat + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
