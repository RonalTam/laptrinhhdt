/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai12.model;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lakeh
 */
public class BoSuuTap {
    private List<HinhHoc> bst;

    public BoSuuTap() {
        this.bst = new ArrayList<HinhHoc>();
    }
    
    public void addHinhHoc(HinhHoc hh) throws CloneNotSupportedException {
        this.bst.add((HinhHoc) hh.clone());
    }

    public List<HinhHoc> getBst() {
        return bst;
    }

    public void setBst(List<HinhHoc> bst) {
        this.bst = bst;
    }

    @Override
    public String toString() {
        return "BoSuuTap{" + "bst=" + bst + '}';
    }

    
    
    
}
