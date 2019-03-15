    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhanvien;

/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        NhanVien nv = 
                new NhanVien("Hoang", 11, "Ha Noi", 100000, 200);
        
        nv.printInfo();
        double thuong = nv.tinhThuong();
        System.out.println("thuong: " + thuong);
        
        NhanVien nv1 = new NhanVien();
        nv1.inputInfo();
        nv1.printInfo();
        double thuong1 = nv1.tinhThuong();
        System.out.println("thuong: " + thuong1);
        
    }
    
}
    }
    
}
