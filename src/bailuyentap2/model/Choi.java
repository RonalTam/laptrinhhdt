/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailuyentap2.model;

/**
 *
 * @author lakeh
 */
public class Choi extends VuKhi {

    private Double tamdanh;

    public Choi(Double tamdanh, String tenvk, int soluong) {
        super(tenvk, soluong);
        this.tamdanh = tamdanh;
    }

    public Double getTamdanh() {
        return tamdanh;
    }

    public void setTamdanh(Double tamdanh) {
        this.tamdanh = tamdanh;
    }

    @Override
    public String toString() {
        return "Choi{" + "tamdanh=" + tamdanh + '}';
    }

    @Override
    public void tanCong() {
        System.out.println("Nem cai choi");
    }

    @Override
    public void phongThu() {
        System.out.println("Chay chay chay");
    }

}
