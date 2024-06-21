/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailuyentap.model;

import java.util.ArrayList;

/**
 *
 * @author lakeh
 */
public class XeHoi extends SanPham {

    private DongCo dongCo;
    private ArrayList<BanhXe> dsbx;

    public XeHoi(DongCo dongCo, ArrayList<BanhXe> dsbx, int maSanPham, String tenSanPham, int soluong, double giaca) throws CloneNotSupportedException {
        super(maSanPham, tenSanPham, soluong, giaca);
        this.dongCo = (DongCo) dongCo.clone();
        this.dsbx = dsbx;
    }

    public XeHoi(DongCo dongCo) throws CloneNotSupportedException {
        super(0, "", 0, 0.0);
        this.dongCo = (DongCo) dongCo.clone();
        this.dsbx = new ArrayList<BanhXe>();
    }

    public void addBanhXe(BanhXe bx) throws CloneNotSupportedException {
        this.dsbx.add((BanhXe) bx.clone());
    }

    public DongCo getDongCo() {
        return dongCo;
    }

    public void setDongCo(DongCo dongCo) throws CloneNotSupportedException {
        this.dongCo = (DongCo) dongCo.clone();
    }

    public ArrayList<BanhXe> getDsbx() {
        return dsbx;
    }

    public void setDsbx(ArrayList<BanhXe> dsbx) throws CloneNotSupportedException {
        for (BanhXe banhXe : dsbx) {
            this.dsbx.add((BanhXe) banhXe.clone());
        }
    }

    @Override
    public String toString() {
        return "XeHoi{" + "dongCo=" + dongCo + ", dsbx=" + dsbx + super.toString() + '}';
    }

}
