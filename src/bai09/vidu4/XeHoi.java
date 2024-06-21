/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai09.vidu4;

import java.util.ArrayList;

/**
 *
 * @author lakeh
 */
public class XeHoi {
    private DongCo dongCo;
    private ArrayList<BanhXe> dsbx;

    public XeHoi(DongCo dongCo, ArrayList<BanhXe> dsbx) throws CloneNotSupportedException {
        this.dongCo = (DongCo) dongCo.clone();
        this.dsbx = dsbx;
    }

    public XeHoi(DongCo dongCo) throws CloneNotSupportedException {
        this.dongCo = (DongCo) dongCo.clone();
        this.dsbx = new ArrayList<BanhXe>();
    }
    
    public void addBanhXe(BanhXe bx) throws CloneNotSupportedException {
        BanhXe temp = (BanhXe) bx.clone();
        this.dsbx.add(bx);
    }

    public DongCo getDongCo() {
        return dongCo;
    }

    public void setDongCo(DongCo dongCo) {
        this.dongCo = dongCo;
    }

    public ArrayList<BanhXe> getDsbx() {
        return dsbx;
    }

    public void setDsbx(ArrayList<BanhXe> dsbx) {
        this.dsbx = dsbx;
    }

    @Override
    public String toString() {
        return "XeHoi{" + "dongCo=" + dongCo + ", dsbx=" + dsbx + '}';
    }
    
}
