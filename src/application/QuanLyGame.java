package application;

import db.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import model.BinhDoan;
import model.Choi;
import model.CungTen;
import model.KyBinh;
import model.NhanVat;
import model.PhuThuy;
import model.VuKhi;

public class QuanLyGame {

    private static Scanner scanner = new Scanner(System.in);
    private static List<VuKhi> dsvk = new ArrayList<VuKhi>();
    private static List<NhanVat> dsnv = new ArrayList<NhanVat>();
    private static BinhDoan binhDoan = new BinhDoan();
    private static NhanVat nhanVat;

    public static void main(String[] args) throws CloneNotSupportedException {
        dsvk.add(new Choi("ChoiPhep", 4, 1200));
        dsvk.add(new Choi("ChoiBay", 2, 1000));
        dsvk.add(new CungTen("CungGo", 10, 1300));
        dsvk.add(new CungTen("CungSat", 15, 1500));
        
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
                    System.out.println("4. Thoat");
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
                        case 4:
                            continue;
                        default:
                            System.out.println("Lua chon khong hop le");
                    }
                    break;
                case 3:
                    System.out.println("---------- Tim kiem du lieu ----------");
                    System.out.println("1. Tim kiem NhanVat theo ten");
                    System.out.println("2. Tim kiem NhanVat theo khoang nang luong");
                    System.out.println("3. Tim kiem KyBinh theo khoang nang luong va khoang kinh nghiem");
                    System.out.println("4. Thoat");
                    System.out.print("Lua chon cua ban: ");
                    int chon3 = scanner.nextInt();
                    scanner.nextLine();

                    switch (chon3) {
                        case 1:
                            searchNhanVatTheoTen();
                            break;
                        case 2:
                            searchNhanVatTheoNL();
                            break;
                        case 3:
                            searchKyBinh();
                            break;
                        case 4:
                            continue;
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
                    int td = 0;
                    if (!dsnv.isEmpty()) {
                        for (NhanVat nv : dsnv) {
                            if (nv instanceof KyBinh) {
                                binhDoan.addKyBinh((KyBinh) nv);
                                td = 1;
                            }
                        }
                        System.out.println("Them thanh cong");
                    }
                    if (td == 0) {
                        System.out.println("Chua co KyBinh trong NhanVat");
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
                        binhDoan.addKyBinh((KyBinh) kb);
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
                    System.out.println("-------Danh sach cac KyBinh cua BinhDoan--------");
                    System.out.println(binhDoan);
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
        System.out.println(binhDoan);
    }

    public static void searchNhanVatTheoTen() {
        System.out.println("------ Tim kiem NhanVat theo ten -------");
        System.out.println("Nhap ten NhanVat can tim:");
        String tennv = scanner.nextLine().toLowerCase();

        Predicate<NhanVat> dk_nv = nv -> {
            String ten = nv.getTen().toLowerCase();
            if (tennv.length() <= ten.length()) {
        for (int i = 0; i < tennv.length(); i++) {
            if (ten.charAt(i) != tennv.charAt(i)) {
                return false;
            }
        }
        return true;
    } else {
        return false;
    }
        };

        List<NhanVat> ketQuaTimKiem = dsnv.stream()
                .filter(dk_nv)
                .collect(Collectors.toList());

        if (ketQuaTimKiem.isEmpty()) {
            System.out.println("Khong tim thay NhanVat co ten : " + tennv);
        } else {
            System.out.println("------ Danh sach NhanVat tim thay -----");
            for (NhanVat nhanVat : ketQuaTimKiem) {
                System.out.println(nhanVat);
            }
        }
    }

    public static void searchNhanVatTheoNL() {
        System.out.println("--------- Tim kiem NhanVat theo nang luong --------");
        System.out.println("Nhap khoang nang luong(batdau ketthuc)");
        double nl_bd = scanner.nextDouble();
        double nl_kt = scanner.nextDouble();
        scanner.nextLine();
        Predicate<NhanVat> dk_nl = nhanVat -> nhanVat.getNangluong() >= nl_bd
                && nhanVat.getNangluong() <= nl_kt;

        List<NhanVat> ketQuaTimKiem = dsnv.stream()
                .filter(dk_nl)
                .collect(Collectors.toList());
        if (ketQuaTimKiem.isEmpty()) {
            System.out.println("Khong tim thay NhanVat co khoang nang luong tu " + nl_bd + " den " + nl_kt);
        } else {
            System.out.println("Danh sach NhanVat co khoang nang luong tu " + nl_bd + " den " + nl_kt);
            for (NhanVat nv : ketQuaTimKiem) {
                System.out.println(nv);
            }
        }

    }

    public static void searchKyBinh() {
        System.out.println("------ Tim kiem KyBinh theo khoang nang luong va khoang kinh nghiem -----");
        System.out.println("Nhap khoang nang luong(batdau ketthuc)");
        double nl_bd = scanner.nextDouble();
        double nl_kt = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhap khoang kinh nghiem(batdau ketthuc)");
        int kn_bd = scanner.nextInt();
        int kn_kt = scanner.nextInt();
        scanner.nextLine();

        Predicate<KyBinh> dk_nlkn = kb -> kb.getNangluong() >= nl_bd
                && kb.getNangluong() <= nl_kt
                && kb.getKinhnghiem() >= kn_bd
                && kb.getKinhnghiem() <= kn_kt;

        List<KyBinh> ketQuaTimKiem = binhDoan.getDskb().stream()
                .filter(dk_nlkn).toList();
        if (ketQuaTimKiem.isEmpty()) {
            System.out.println("Khong tim thay KyBinh co khoang nang luong tu " + nl_bd + " den " + nl_kt + " kinh nghiem tu " + kn_bd + " den " + kn_kt);
        } else {
            System.out.println("Danh sach KyBinh co khoang nang luong tu " + nl_bd + " den " + nl_kt + " kinh nghiem tu " + kn_bd + " den " + kn_kt);
            for (KyBinh nv : ketQuaTimKiem) {
                System.out.println(nv);
            }
        }
    }

}