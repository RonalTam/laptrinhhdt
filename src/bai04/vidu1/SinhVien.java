/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai04.vidu1;

/**
 *
 * @author lakeh
 */
public class SinhVien extends Nguoi {
    private String masoSV;
    private String nganhhoc;

    public SinhVien(String hoten, int namsinh, String masoSV, String nganhhoc) {
        super(hoten, namsinh);
        this.masoSV = masoSV;
        this.nganhhoc = nganhhoc;
    }

    public String getMasoSV() {
        return masoSV;
    }

    public void setMasoSV(String masoSV) {
        this.masoSV = masoSV;
    }

    public String getNganhhoc() {
        return nganhhoc;
    }

    public void setNganhhoc(String nganhhoc) {
        this.nganhhoc = nganhhoc;
    }

    @Override
    public String toString() {
        return "SinhVien{" + super.toString() + "masoSV= " + masoSV + ", nganhhoc= " + nganhhoc +" " + '}'; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    

    
    

    
    
    
}
