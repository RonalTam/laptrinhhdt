/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailuyentap2.model;

import bailuyentap2.model.DoiQuan;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lakeh
 */
public class BinhDoan {
    private List<KyBinh> dskb;
    private DoiQuan doiquan;
    
    public BinhDoan(DoiQuan doiquan) {
        this.doiquan = doiquan;
        this.dskb = new ArrayList<KyBinh>();
    }
    
    public void addKyBinh(KyBinh kb) throws CloneNotSupportedException{
        this.dskb.add((KyBinh) kb.clone());
    }
    public List<KyBinh> getDskb() {
        return dskb;
    }

    public void setDskb(List<KyBinh> dskb) throws CloneNotSupportedException {
        for (KyBinh item : dskb) {
            this.dskb.add((KyBinh) item.clone());
        }
    }

    public DoiQuan getDoiquan() {
        return doiquan;
    }

    public void setDoiquan(DoiQuan doiquan) {
        this.doiquan = doiquan;
    }

    @Override
    public String toString() {
        return "BinhDoan{" + "dskb=" + dskb + ", doiquan=" + doiquan + '}';
    }
    
    
    
    
}
