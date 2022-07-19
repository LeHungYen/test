package models;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import entities.PhieuNhapKhoChiTiet;
import entities.HoaDon;
import entities.NhanVien;

public class PhieuNhapKhoModel {
	private int stt;
	private int maNhap;
	private String ghiChu;
	private Date ngayNhap;
	private String tinhTrang;
	private NhanVien nhanVien;
	private String maNV;
	private double giamGia;
	private double vat;
	private double phiShip;
	private Set<PhieuNhapKhoChiTiet> listPhieuNhapKhoChiTiet = new HashSet<PhieuNhapKhoChiTiet>();
	
	public PhieuNhapKhoModel(int stt, int maNhap, String ghiChu, Date ngayNhap, String tinhTrang, NhanVien nhanVien,
			String maNV, double giamGia, double vat, double phiShip, Set<PhieuNhapKhoChiTiet> listPhieuNhapKhoChiTiet) {
		this.stt = stt;
		this.maNhap = maNhap;
		this.ghiChu = ghiChu;
		this.ngayNhap = ngayNhap;
		this.tinhTrang = tinhTrang;
		this.nhanVien = nhanVien;
		this.maNV = maNV;
		this.giamGia = giamGia;
		this.vat = vat;
		this.phiShip = phiShip;
		this.listPhieuNhapKhoChiTiet = listPhieuNhapKhoChiTiet;
	}
	
	public PhieuNhapKhoModel() {
		
	}

	public int getStt() {
		return stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

	public int getMaNhap() {
		return maNhap;
	}

	public void setMaNhap(int maNhap) {
		this.maNhap = maNhap;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public Date getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public double getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}

	public double getVat() {
		return vat;
	}

	public void setVat(double vat) {
		this.vat = vat;
	}

	public double getPhiShip() {
		return phiShip;
	}

	public void setPhiShip(double phiShip) {
		this.phiShip = phiShip;
	}

	public Set<PhieuNhapKhoChiTiet> getListPhieuNhapKhoChiTiet() {
		return listPhieuNhapKhoChiTiet;
	}

	public void setListPhieuNhapKhoChiTiet(Set<PhieuNhapKhoChiTiet> listPhieuNhapKhoChiTiet) {
		this.listPhieuNhapKhoChiTiet = listPhieuNhapKhoChiTiet;
	}

	@Override
	public String toString() {
		return "PhieuNhapKhoModel [stt=" + stt + ", maNhap=" + maNhap + ", ghiChu=" + ghiChu + ", ngayNhap=" + ngayNhap
				+ ", tinhTrang=" + tinhTrang + ", nhanVien=" + nhanVien + ", maNV=" + maNV + ", giamGia=" + giamGia
				+ ", vat=" + vat + ", phiShip=" + phiShip + ", listPhieuNhapKhoChiTiet=" + listPhieuNhapKhoChiTiet
				+ "]";
	}
	
	
	
}
