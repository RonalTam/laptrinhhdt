/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailuyentap2.model;

/**
 *
 * @author lakeh
 */
public abstract class VuKhi implements Cloneable {

    private String tenvk;
    private int soluong;

    public VuKhi(String tenvk, int soluong) {
        this.tenvk = tenvk;
        this.soluong = soluong;
    }
    
    

    public abstract void tanCong();

    public abstract void phongThu();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    

}
