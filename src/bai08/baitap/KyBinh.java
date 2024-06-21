/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai08.baitap;

import java.util.ArrayList;

/**
 *
 * @author lakeh
 */
public class KyBinh implements Cloneable {

    private int maKyBinh;
    private ArrayList<VuKhi> vk;

    public KyBinh(int maKyBinh, ArrayList<VuKhi> vk) {
        this.setMaKyBinh(maKyBinh);
        this.setVk(vk);
    }

    public int getMaKyBinh() {
        return maKyBinh;
    }

    public void setMaKyBinh(int maKyBinh) {
        this.maKyBinh = maKyBinh;
    }

    public ArrayList<VuKhi> getVk() {
        return vk;
    }

    public void setVk(ArrayList<VuKhi> vk) {
        this.vk = vk;
    }

    @Override
    public String toString() {
        return "KyBinh{" + "maKyBinh=" + maKyBinh + ", vk=" + vk + '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ArrayList<VuKhi> vknew = new ArrayList<VuKhi>();
        for (VuKhi item : this.vk) {
            VuKhi temp = new VuKhi(item.getTenVuKhi(), item.getSoLuong()); 
        }
        
        KyBinh kb = new KyBinh(this.maKyBinh, vk);
        return kb;
    }

}
