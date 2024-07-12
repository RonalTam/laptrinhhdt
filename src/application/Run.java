package application;

import db.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import model.BinhDoan;
import model.Choi;
import model.CungTen;
import model.KyBinh;
import model.NhanVat;
import model.PhuThuy;
import model.VuKhi;

public class Run {

    private static Scanner scanner = new Scanner(System.in);
    private static List<VuKhi> dsvk = new ArrayList<VuKhi>();
    private static List<NhanVat> dsnv = new ArrayList<NhanVat>();
    private static BinhDoan binhDoan = new BinhDoan();
    private static NhanVat nhanVat;

    public static void main(String[] args) throws CloneNotSupportedException {
        menu();
    }

    public static void menu() throws CloneNotSupportedException {
        while (true) {
            System.out.println("================ MENU ================");
            System.out.println("1. Nhap du lieu");
            System.out.println("2. Sap xep du lieu");
            System.out.println("3. Tim kiem du lieu");
            System.out.println("4. In du lieu");
            System.out.println("5. Ket noi CSDL");
            System.out.println("6. Thoat");
            System.out.print("Lua chon cua ban: ");

            int chon = scanner.nextInt();
            scanner.nextLine();

            switch (chon) {
                case 1:
                    System.out.println("----------- Nhap du lieu -----------");
                    System.out.println("1. Nhap du lieu cho VuKhi");
                    System.out.println("2. Nhap du lieu cho NhanVat");
                    System.out.println("3. Nhap du lieu cho BinhDoan");
                    System.out.print("Lua chon cua ban: ");
                    int chon1 = scanner.nextInt();
                    scanner.nextLine();

                    switch (chon1) {
                        case 1:
                            nhapDuLieuVuKhi();
                            break;
                        case 2:
                            nhapDuLieuNhanVat();
                            break;

                        case 3:
                            nhapDuLieuBinhDoan();
                            break;

                        default:
                            System.out.println("Lua chon khong hop le");
                    }
                    break;
                case 2:
                    System.out.println("---------- Sap xep du lieu ----------");
                    System.out.println("1. Sap xep danh sach VuKhi theo so luong");
                    System.out.println("2. Sap xep danh sach NhanVat theo nang luong");
                    System.out.println("3. Sap xep danh sach cac KyBinh cua BinhDoan theo kinhnghiem");
                    System.out.print("Lua chon cua ban: ");
                    int chon2 = scanner.nextInt();
                    scanner.nextLine();

                    switch (chon2) {
                        case 1:
                            sapXepVuKhi();
                            break;
                        case 2:
                            sapXepNhanVat();
                            break;
                        case 3:
                            sapXepKyBinhBinhDoan();
                            break;
                        default:
                            System.out.println("Lua chon khong hop le");
                    }
                    break;
                case 3:
                    System.out.println("---------- Tim kiem du lieu ----------");
                    System.out.println("1. Tim kiem NhanVat theo ten");
                    System.out.println("2. Tim kiem NhanVat theo khoang nang luong");
                    System.out.println("3. Tim kiem KyBinh theo khoang nang luong va khoang kinh nghiem");
                    System.out.print("Lua chon cua ban: ");
                    int chon3 = scanner.nextInt();
                    scanner.nextLine();

                    switch (chon3) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Lua chon khong hop le");
                    }
                    break;
                case 4:
                    xuatDanhSach();
                    break;
                case 5:
                    ketNoiCSDL();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Lua chon khong hop le");
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
            System.out.println("Chon NhanVat muon nhap 1. PhuThuy | 2. KyBinh | 3. Thoat ");
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
                        scanner.nextLine();
                        PhuThuy pt = new PhuThuy(ten, nangluong, phepthuat);
                        for (VuKhi vk : dsvk) {
                            if (vk instanceof Choi) {
                                pt.addVuKhi(vk);
                            }
                        }
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
                        for (VuKhi vk : dsvk) {
                            if (vk instanceof CungTen) {
                                kb.addVuKhi(vk);
                            }
                        }
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

    public static void nhapDuLieuBinhDoan() throws CloneNotSupportedException {
        int chon;
        do {
            System.out.println("---------Nhap du lieu cho BinhDoan--------");
            System.out.println("1. Them cac KyBinh co san cho BinhDoan");
            System.out.println("2. Nhap moi cho BinhDoan");
            System.out.println("3. Thoat");
            System.out.println("Chon mot tuy chon:");
            chon = scanner.nextInt();
            scanner.nextLine();
            switch (chon) {
                case 1:
                    for (NhanVat nv : dsnv) {
                        if (nv instanceof KyBinh) {
                            binhDoan.addKyBinh((KyBinh) nv);
                        }
                    }
                    System.out.println("Them thanh cong");
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
                        for (VuKhi vk : dsvk) {
                            if (vk instanceof CungTen) {
                                kb.addVuKhi(vk);
                            }
                        }
                        dsnv.add(kb);
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        } while (true);
    }

    public static void xuatDanhSach() {
        int chon;
        do {
            System.out.println("---------- In du lieu ----------");
            System.out.println("1. In danh sach VuKhi");
            System.out.println("2. In danh sach NhanVat");
            System.out.println("3. In danh sach KyBinh trong BinhDoan");
            System.out.println("4. Thoat");
            System.out.print("Lua chon cua ban: ");
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
                    binhDoan.inDSKyBinh();
                    System.out.println("");
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        } while (chon != 0);
    }

    public static void ketNoiCSDL() {
        try {
            Connection conn = DBConnection.getInstance().getConnection();
            System.out.println("Ket noi csdl thanh cong");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Ket noi csdl khong thanh cong");
        }
    }

    public static void sapXepVuKhi() {
        Collections.sort(dsvk, new Comparator<VuKhi>() {
            @Override
            public int compare(VuKhi o1, VuKhi o2) {
                return Integer.compare(o1.getSoluong(), o2.getSoluong());
            }
        });
        System.out.println("------Danh sach VuKhi-----");
        for (VuKhi vuKhi : dsvk) {
            System.out.println(vuKhi);
        }
        System.out.println("");
    }

    public static void sapXepNhanVat() {
        Collections.sort(dsnv, new Comparator<NhanVat>() {
            @Override
            public int compare(NhanVat o1, NhanVat o2) {
                return Double.compare(o1.getNangluong(), o2.getNangluong());
            }
        });
        System.out.println("------Danh sach NhanVat-----");
        for (NhanVat nhanVat : dsnv) {
            System.out.println(nhanVat);
        }
        System.out.println("");
    }

    public static void sapXepKyBinhBinhDoan() {
        List<KyBinh> dskb = binhDoan.getDskb();

        Collections.sort(dskb, new Comparator<KyBinh>() {
            @Override
            public int compare(KyBinh o1, KyBinh o2) {
                return Integer.compare(o1.getKinhnghiem(), o2.getKinhnghiem());
            }
        });
        binhDoan.inDSKyBinh();
        System.out.println("");
    }
}
