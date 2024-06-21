/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailuyentap;

import bailuyentap.model.BanhXe;
import bailuyentap.model.DongCo;
import bailuyentap.model.HoaDon;
import bailuyentap.model.Laptop;
import bailuyentap.model.LopHoc;
import bailuyentap.model.SanPham;
import bailuyentap.model.SinhVien;
import bailuyentap.model.XeHoi;
//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author lakeh
 */
public class Run {

    public static void main(String[] args) throws CloneNotSupportedException {

        //Tạo một danh sách (List) kiểu XeHoi chứa tối thiểu 5 đối tượng;
        DongCo dc1 = new DongCo("Xang", 200);
        XeHoi car1 = new XeHoi(dc1, new ArrayList<BanhXe>(), 67, "HONDA CIVIC", 1, 1000000);
        BanhXe bx1 = new BanhXe("Maxxis", 30);
        for (int i = 0; i < 4; i++) {
            car1.addBanhXe(bx1);
        }

        DongCo dc2 = new DongCo("Dien", 400);
        XeHoi car2 = new XeHoi(dc2, new ArrayList<BanhXe>(), 53, "HONDA ACCENT", 1, 500000);
        BanhXe bx2 = new BanhXe("Michelin", 25);
        for (int i = 0; i < 4; i++) {
            car2.addBanhXe(bx2);
        }

        XeHoi car3 = new XeHoi(dc1, new ArrayList<BanhXe>(), 49, "Hyundai Elantra", 1, 1300000);
        BanhXe bx3 = new BanhXe("Michelin", 40);
        for (int i = 0; i < 4; i++) {
            car3.addBanhXe(bx3);
        }

        DongCo dc4 = new DongCo("Diesel", 800);
        XeHoi car4 = new XeHoi(dc4, new ArrayList<BanhXe>(), 38, "Land Rover", 1, 1400000);
        BanhXe bx4 = new BanhXe("Offroad", 50);
        for (int i = 0; i < 4; i++) {
            car4.addBanhXe(bx4);
        }

        DongCo dc5 = new DongCo("Diesel", 900);
        XeHoi car5 = new XeHoi(dc5, new ArrayList<BanhXe>(), 30, "Mercedes-Benz G-Series", 1, 1800000);
        BanhXe bx5 = new BanhXe("Michelin LTX", 55);
        for (int i = 0; i < 4; i++) {
            car5.addBanhXe(bx5);
        }

        ArrayList<XeHoi> car = new ArrayList<XeHoi>();
        car.add(car1);
        car.add(car2);
        car.add(car3);
        car.add(car4);
        car.add(car5);
        for (XeHoi xeHoi : car) {
            System.out.println(xeHoi);
        }
        System.out.println("------------------------------------");

        //Tạo một danh sách (List&lt;Laptop&gt;) chứa tối thiểu 7 đối tượng;
        ArrayList<Laptop> lap = new ArrayList<Laptop>();
        lap.add(new Laptop(16, "i7-1200H", 15, "ASUS T15", 5, 20.900));
        lap.add(new Laptop(32, "i9-1200H", 15, "ASUS T15", 5, 35.900));
        lap.add(new Laptop(16, "i7-1200H", 15, "ASUS T15", 5, 20.900));
        lap.add(new Laptop(8, "i3-1200H", 15, "ASUS T15", 5, 10.900));
        lap.add(new Laptop(8, "i3-1200H", 15, "ASUS T15", 5, 10.900));
        lap.add(new Laptop(32, "i5-1200H", 15, "ASUS T15", 5, 30.900));
        lap.add(new Laptop(32, "i5-1200H", 15, "ASUS T15", 5, 30.900));
        for (Laptop laptop : lap) {
            System.out.println(laptop);
        }
        System.out.println("-----------------------------");

        //Tạo 2 đối tượng kiểu SinhVien, mỗi đối tượng có 1 HoaDon chứa tối thiểu 5 SanPham
        ArrayList<SanPham> sp = new ArrayList<SanPham>();
        sp.add(new SanPham(13, "BCS", 2, 15.5000));
        sp.add(new SanPham(14, "Loa", 1, 350000));
        sp.add(car1);
        sp.add(new Laptop(32, "i9-1200H", 15, "ASUS T15", 5, 35.900));
        sp.add(car5);
        HoaDon hd1 = new HoaDon(1);
        hd1.setDssp(sp);
        SinhVien sv1 = new SinhVien("Messi", new LopHoc("La masia"), hd1);

        HoaDon hd2 = new HoaDon(2);
        hd2.setDssp(sp);
        SinhVien sv2 = new SinhVien("Ronaldo", new LopHoc("Sprting CP"), hd2);

        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println("--------------------------------");

        //Tiến hành sắp xếp danh sách List&lt;XeHoi&gt; theo giaxe
        Collections.sort(car, new Comparator<XeHoi>() {
            @Override
            public int compare(XeHoi o1, XeHoi o2) {
                return Double.compare(o1.getGiaca(), o2.getGiaca());
            }
        });
        System.out.println("Sap xep xe hoi theo gia");
        for (XeHoi xehoi : car) {
            System.out.println(xehoi);
        }
        System.out.println("------------------------------");
        
        //Tiến hành sắp xếp List&lt;Laptop&gt; theo RAM
        Collections.sort(lap, new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                return Integer.compare(o1.getRam(), o2.getRam());
            }
        });
        System.out.println("Sap xep laptop theo Ram");
        for (Laptop laptop : lap) {
            System.out.println(laptop);
        }
        System.out.println("------------------------");
        
        //Tiến hành tìm kiếm sản phảm có giá cao nhất trong từng HoaDon của từng sinh viên
//        SanPham sp_max = Collections.max(hd1.getDssp(), new Comparator<SanPham>() {
//            @Override
//            public int compare(SanPham o1, SanPham o2) {
//                return Double.compare(o1.getGiaca(), o2.getGiaca());
//            }
//        });
//        System.out.println(sp_max);
        List<SanPham> dssp = sv1.getHd().getDssp();
        dssp = sv2.getHd().getDssp();
        SanPham sp_max1 = Collections.max(dssp, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o1.getGiaca(), o2.getGiaca());
            }
        });
        System.out.println("San pham co gia cao nhat cua sv1");
        System.out.println(sp_max1);
        System.out.println("------------------------------");
        
        //Tiến hành liệt kê các SanPham của từng hoá đơn theo các điều kiện
        Predicate<SanPham> dk_sp = new Predicate<SanPham>() {
            @Override
            public boolean test(SanPham t) {
                return t.getGiaca() >= 10000 && t.getSoluong() <=5;
            }
        };
        
        System.out.println("Liet ke san pham co gia >= 10000 && SL <= 5");
        List<SanPham> lksp = dssp.stream()
                .filter(dk_sp)
                .toList();
        lksp = hd2.getDssp().stream()
                .filter(dk_sp)
                .toList();
        for (SanPham sanPham : lksp) {
            System.out.println(sanPham);
        }
        System.out.println("--------------------------");
        
        System.out.println("ten san pham bat dau bang S");
        List<SanPham> sp_s = dssp.stream()
                .filter(sanPham -> sanPham.getTenSanPham().charAt(0) == 'L')
                .toList();
        sp_s = hd2.getDssp().stream()
                .filter(sanPham -> sanPham.getTenSanPham().charAt(0) == 'L')
                .toList();
        System.out.println(sp_s);
    }

}
