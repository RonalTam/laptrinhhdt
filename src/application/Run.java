/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Choi;
import model.CungTen;
import model.KyBinh;
import model.NhanVat;
import model.PhuThuy;
import model.VuKhi;

/**
 *
 * @author lakeh
 */
public class Run {

    private static Scanner scanner = new Scanner(System.in);
    private static List<VuKhi> dsvk = new ArrayList<VuKhi>();
    private static List<NhanVat> dsnv = new ArrayList<NhanVat>();

    public static void main(String[] args) throws CloneNotSupportedException {
        while (true) {
            System.out.println("================ MENU ================");
            System.out.println("1. Nhap du lieu cho danh sach VuKhi");
            System.out.println("2. Nhập dữ liệu cho KyBinh");
            System.out.println("3. Nhập dữ liệu cho NhanVat");
            System.out.println("4. Xuat danh sach VuKhi");
            System.out.println("5. Thoát");
            System.out.print("Chọn một tùy chọn: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    nhapDuLieuVuKhi();
                    break;
                case 2:
                    break;
                case 3:
                    nhapDuLieuNhanVat();
                    break;
                case 4:
                    xuatDanhSach();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    public static void nhapDuLieuVuKhi() {
        int chon;
        do {
            System.out.println("-------- Nhap du lieu cho VuKhi ----------");
            System.out.println("Chon VuKhi muon nhap 1. Choi | 2. CungTen | 3. Thoat ");
            chon = scanner.nextInt();
            scanner.nextLine();
            switch (chon) {
                case 1:
                    System.out.println("---Nhap du lieu cho Choi----");
                    System.out.println("Nhap so Choi muon nhap:");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap ten choi:");
                        String tenvk = scanner.nextLine();
                        System.out.println("Nhap so luong:");
                        int soluong = scanner.nextInt();
                        System.out.println("Nhap tam danh:");
                        double tamdanh = scanner.nextDouble();
                        scanner.nextLine();
                        VuKhi c = new Choi(tenvk, soluong, tamdanh);
                        dsvk.add(c);
                    }
                    break;
                case 2:
                    System.out.println("---Nhap du lieu cho CungTen----");
                    System.out.println("Nhap so CungTen muon nhap:");
                    int n1 = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < n1; i++) {
                        System.out.println("Nhap ten CungTen:");
                        String tenvk = scanner.nextLine();
                        System.out.println("Nhap so luong:");
                        int soluong = scanner.nextInt();
                        System.out.println("Nhap tam danh:");
                        double tamdanh = scanner.nextDouble();
                        scanner.nextLine();
                        VuKhi ct = new CungTen(tenvk, soluong, tamdanh);
                        dsvk.add(ct);
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        } while (chon != 0);

    }

    public static void nhapDuLieuNhanVat() throws CloneNotSupportedException {
        int chon;
        do {
            System.out.println("-------- Nhap du lieu cho NhanVat ----------");
            System.out.println("Chon VuKhi muon nhap 1. PhuThuy | 2. KyBinh | 3. Thoat ");
            chon = scanner.nextInt();
            scanner.nextLine();
            switch (chon) {
                case 1:
                    System.out.println("---Nhap du lieu cho PhuThuy----");
                    System.out.println("Nhap so PhuThuy muon nhap:");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap ten PhuThuy:");
                        String ten = scanner.nextLine();
                        System.out.println("Nhap nang luong:");
                        double nangluong = scanner.nextDouble();
                        System.out.println("Nhap phep thuat:");
                        double phepthuat = scanner.nextDouble();
                        System.out.println("Chon VuKhi ma PhuThuy se dung (nhap so thu tu):");
                        for (int j = 0; j < dsvk.size(); j++) {
                            System.out.println((j + 1) + ". " + dsvk.get(j).getTenvk());
                        }
                        int chonVuKhi = scanner.nextInt() - 1;
                        scanner.nextLine();

                        VuKhi vuKhiChon = dsvk.get(chonVuKhi);
                        PhuThuy pt = new PhuThuy(ten, nangluong, phepthuat);
                        pt.addVuKhi(vuKhiChon);
                        dsnv.add(pt);
                    }
                    break;
                case 2:
                    System.out.println("---Nhap du lieu cho KyBinh----");
                    System.out.println("Nhap so KyBinh muon nhap:");
                    int n1 = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < n1; i++) {
                        System.out.println("Nhap ten KyBinh:");
                        String ten = scanner.nextLine();
                        System.out.println("Nhap nang luong:");
                        double nangluong = scanner.nextDouble();
                        System.out.println("Nhap kinh nghiem:");
                        int kinhnghiem = scanner.nextInt();
                        scanner.nextLine();
                        KyBinh kb = new KyBinh(ten, nangluong, kinhnghiem);
                        dsnv.add(kb);
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        } while (chon != 0);

    }

    public static void xuatDanhSach() {
        int chon;
        do {
            System.out.println("-----Xuat danh sach--------");
            System.out.println("Vui long chon: 1. VuKhi | 2. NhanVat | 3. Thoat");
            chon = scanner.nextInt();
            scanner.nextLine();
            switch (chon) {
                case 1:
                    System.out.println("------Danh sach VuKhi-----");
                    for (VuKhi vuKhi : dsvk) {
                        System.out.println(vuKhi);
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("------Danh sach NhanVat-----");
                    for (NhanVat nhanVat : dsnv) {
                        System.out.println(nhanVat);
                    }
                    System.out.println("");
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Lua chon khong hop le");
            }

        } while (chon != 0);
    }
}
