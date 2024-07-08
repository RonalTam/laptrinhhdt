/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailuyentap2.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lakeh
 */
public class DoiQuan {

    private List<BinhDoan> dsbd;
    private String tendq;

    public DoiQuan(String tendq) {
        this.tendq = tendq;
        this.dsbd = new ArrayList<BinhDoan>();
    }
    
    public void addBinhDoan(BinhDoan bd) {
        this.dsbd.add(bd);
    }

    public List<BinhDoan> getDsbd() {
        return dsbd;
    }

    public void setDsbd(List<BinhDoan> dsbd) {
        this.dsbd = dsbd;
    }

    public String getTendq() {
        return tendq;
    }

    public void setTendq(String tendq) {
        this.tendq = tendq;
    }

    @Override
    public String toString() {
        return "DoiQuan{" + "dsbd=" + dsbd + ", tendq=" + tendq + '}';
    }

    
}
