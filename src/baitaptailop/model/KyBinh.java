package baitaptailop.model;

import java.util.ArrayList;
import java.util.List;

public class KyBinh extends NhanVat {

    private boolean giap;
    private boolean ngua;
    private List<BinhDoan> dsbd;

    public KyBinh(boolean giap, boolean ngua, String tennhanvat, int level, VuKhi vk) {
        super(tennhanvat, level, vk);
        this.giap = giap;
        this.ngua = ngua;
        this.dsbd = new ArrayList<>(); // Initialize the list
    }

    public KyBinh(boolean giap, boolean ngua, String tennhanvat, int level) {
        super(tennhanvat, level);
        this.giap = giap;
        this.ngua = ngua;
        this.dsbd = new ArrayList<>(); // Initialize the list
    }

    public void addBinhDoan(BinhDoan bd) throws CloneNotSupportedException {
        this.dsbd.add((BinhDoan) bd.clone());
    }

    public boolean isGiap() {
        return giap;
    }

    public void setGiap(boolean giap) {
        this.giap = giap;
    }

    public boolean isNgua() {
        return ngua;
    }

    public void setNgua(boolean ngua) {
        this.ngua = ngua;
    }

    public List<BinhDoan> getDsbd() {
        return dsbd;
    }

    public void setDsbd(List<BinhDoan> dsbd) {
        this.dsbd = dsbd;
    }

    @Override
    public void tanCong() {
        System.out.println("Ky Binh Tan Cong");
    }

    @Override
    public void diChuyen() {
        System.out.println("Ky Binh Di Chuyen");
    }

    @Override
    public String toString() {
        return super.toString() + "KyBinh{" + "giap=" + giap + ", ngua=" + ngua + ", dsbd=" + dsbd + '}';
    }

    

    
}
