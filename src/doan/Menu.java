/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doan;

import doan.model.BinhDoan;
import doan.model.NhanVat;
import doan.model.DiChuyen;
import doan.model.KyBinh;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lakeh
 */
public class Menu {
    private Scanner scanner = new Scanner(System.in);
    
    private List<BinhDoan> binhDoanList = new ArrayList<>();
    private List<DiChuyen> diChuyenList = new ArrayList<>();
    private List<KyBinh> kyBinhList = new ArrayList<>();
    private List<NhanVat> nhanVatList = new ArrayList<>();

    public void showMenu() {
        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Nhập dữ liệu");
            System.out.println("2. Xuất dữ liệu");
            System.out.println("3. In dữ liệu");
            System.out.println("4. Thoát");
            System.out.print("Chọn một tùy chọn: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    nhapDuLieu();
                    break;
                case 2:
                    xuatDuLieu();
                    break;
                case 3:
                    inDuLieu();
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
    
    private void nhapDuLieu() {
        System.out.println("===== Nhập Dữ Liệu =====");
        System.out.println("1. Nhập dữ liệu cho BinhDoan");
        System.out.println("2. Nhập dữ liệu cho DiChuyen");
        System.out.println("3. Nhập dữ liệu cho KyBinh");
        System.out.println("4. Nhập dữ liệu cho NhanVat");
        System.out.print("Chọn một tùy chọn: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                BinhDoan binhDoan = new BinhDoan();
                // Nhập dữ liệu cho BinhDoan từ bàn phím
                // Ví dụ: binhDoan.setName(scanner.nextLine());
                binhDoanList.add(binhDoan);
                break;
            case 2:
                DiChuyen diChuyen = new DiChuyen();
                // Nhập dữ liệu cho DiChuyen từ bàn phím
                // Ví dụ: diChuyen.setSpeed(scanner.nextInt());
                diChuyenList.add(diChuyen);
                break;
            case 3:
                KyBinh kyBinh = new KyBinh();
                // Nhập dữ liệu cho KyBinh từ bàn phím
                // Ví dụ: kyBinh.setHorseName(scanner.nextLine());
                kyBinhList.add(kyBinh);
                break;
            case 4:
                NhanVat nhanVat = new NhanVat();
                // Nhập dữ liệu cho NhanVat từ bàn phím
                // Ví dụ: nhanVat.setName(scanner.nextLine());
                nhanVatList.add(nhanVat);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
        }
    }
    
    private void xuatDuLieu() {
        System.out.println("===== Xuất Dữ Liệu =====");
        System.out.println("1. Xuất dữ liệu cho BinhDoan");
        System.out.println("2. Xuất dữ liệu cho DiChuyen");
        System.out.println("3. Xuất dữ liệu cho KyBinh");
        System.out.println("4. Xuất dữ liệu cho NhanVat");
        System.out.print("Chọn một tùy chọn: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        switch (choice) {
            case 1:
                for (BinhDoan binhDoan : binhDoanList) {
                    System.out.println(binhDoan);
                }
                break;
            case 2:
                for (DiChuyen diChuyen : diChuyenList) {
                    System.out.println(diChuyen);
                }
                break;
            case 3:
                for (KyBinh kyBinh : kyBinhList) {
                    System.out.println(kyBinh);
                }
                break;
            case 4:
                for (NhanVat nhanVat : nhanVatList) {
                    System.out.println(nhanVat);
                }
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
        }
    }
    
    private void inDuLieu() {
        // Bạn có thể thêm logic tùy chọn để in dữ liệu
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.showMenu();
    }
}
