/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai03.vidu2;

/**
 *
 * @author lakeh
 */
public class SinhVien {
    public String hoten;
    public int namsinh;
    public String sdt;
    
    public String getHoten() {
        return this.hoten;
    }
    
    public void setHoten(String name){
        this.hoten = name;
    }
    
    public int getNamsinh(){
        return this.namsinh;
    }
    
    public void setNamsinh(int yob){
        this.namsinh = yob;
    }
    
    public String getSdt(){
        return this.sdt;
    }
    
    public void setSdt(String phone){
        this.sdt = phone;
    }
    
    public String toString(){
        String result = "Ho ten: " + this.getHoten() + " Nam sinh: " + this.getNamsinh() +
                " Sdt: " + this.getSdt();
        return result;
    }
}
