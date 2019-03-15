/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

/**
 *
 * @author Admin
 */
public class SoPhuc {
    public class SoPhuc {
    private double phanThuc;
    private double phanAo;

    public SoPhuc() {
    }

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public double getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }
    
    public SoPhuc tongSoPhuc (SoPhuc sp1, SoPhuc sp2) {
        SoPhuc spTong = new SoPhuc();
        spTong.setPhanThuc(sp1.getPhanThuc()+sp2.getPhanThuc());
        spTong.setPhanAo(sp1.getPhanAo()+sp2.getPhanAo());
        return spTong;
    }
}
