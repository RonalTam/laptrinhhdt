package model;

import java.util.ArrayList;
import java.util.List;

public class BinhDoan {
    private List<KyBinh> dskb;

    public BinhDoan() {
        this.dskb = new ArrayList<KyBinh>();
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
