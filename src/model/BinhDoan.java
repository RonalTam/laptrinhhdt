/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author lakeh
 */
public class BinhDoan {
    private List<KyBinh> dskb;

    public BinhDoan(List<KyBinh> dskb) {
        this.dskb = dskb;
    }

    public void addKyBinh(KyBinh kb) throws CloneNotSupportedException {
        this.dskb.add((KyBinh) kb.clone());
    }

    public List<KyBinh> getDskb() {
        return dskb;
    }

    public void setDskb(List<KyBinh> dskb) {
        this.dskb = dskb;
    }

    @Override
    public String toString() {
        return "BinhDoan{" + "dskb=" + dskb + '}';
    }
    
    
}
