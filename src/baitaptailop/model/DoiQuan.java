/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptailop.model;

import java.util.List;

/**
 *
 * @author lakeh
 */
public class DoiQuan {
    private int madq;
    private List<BinhDoan> dsbd;

    public DoiQuan(int madq, List<BinhDoan> dsbd) {
        this.madq = madq;
        this.dsbd = dsbd;
    }

    public DoiQuan(int madq) {
        this.madq = madq;
    }
    
    
    public void addBinhDoan(BinhDoan bd){
        dsbd.add(bd);
    }

    public int getMadq() {
        return madq;
    }

    public void setMadq(int madq) {
        this.madq = madq;
    }

    public List<BinhDoan> getDsbd() {
        return dsbd;
    }

    public void setDsbd(List<BinhDoan> dsbd) {
        this.dsbd = dsbd;
    }

    @Override
    public String toString() {
        return "DoiQuan{" + "madq=" + madq + ", dsbd=" + dsbd + '}';
    }
    
}
