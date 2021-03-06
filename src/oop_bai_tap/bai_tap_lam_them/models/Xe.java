package oop_bai_tap.bai_tap_lam_them.models;

import s12_java_collection_framework.bai_tap.arraylist_linkedlist.Product;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Xe {
    private String bienSoXe;
    private String tenHang;
    private int namSanXuat;
    private String chuSoHuu;

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<XeTai> xeTaiArrayList1 = new ArrayList<>();

    public Xe() {
    }

    public Xe(String bienSoXe, String tenHang, int namSanXuat, String chuSoHuu) {
        this.bienSoXe = bienSoXe;
        this.tenHang = tenHang;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }


}
