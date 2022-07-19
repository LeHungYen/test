package models;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import entities.PhieuNhapKho;
import entities.SanPhamVaDichVu;

public class PhieuNhapKhoChiTietModel {
	private int stt;
	private PhieuNhapKho phieuNhapKho;
	private int maNhap;
	private SanPhamVaDichVu sanPhamVaDichVu;
	private int maDichVu;
	private int soLuong;
	private long giaNhap;
	private String ghiChu;
	
	public PhieuNhapKhoChiTietModel(int stt, PhieuNhapKho phieuNhapKho, int maNhap, SanPhamVaDichVu sanPhamVaDichVu,
			int maDichVu, int soLuong, long giaNhap, String ghiChu) {
		this.stt = stt;
		this.phieuNhapKho = phieuNhapKho;
		this.maNhap = maNhap;
		this.sanPhamVaDichVu = sanPhamVaDichVu;
		this.maDichVu = maDichVu;
		this.soLuong = soLuong;
		this.giaNhap = giaNhap;
		this.ghiChu = ghiChu;
	}
	
	public PhieuNhapKhoChiTietModel() {
		
	}

	public int getStt() {
		return stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

	public PhieuNhapKho getPhieuNhapKho() {
		return phieuNhapKho;
	}

	public void setPhieuNhapKho(PhieuNhapKho phieuNhapKho) {
		this.phieuNhapKho = phieuNhapKho;
	}

	public int getMaNhap() {
		return maNhap;
	}

	public void setMaNhap(int maNhap) {
		this.maNhap = maNhap;
	}

	public SanPhamVaDichVu getSanPhamVaDichVu() {
		return sanPhamVaDichVu;
	}

	public void setSanPhamVaDichVu(SanPhamVaDichVu sanPhamVaDichVu) {
		this.sanPhamVaDichVu = sanPhamVaDichVu;
	}

	public int getMaDichVu() {
		return maDichVu;
	}

	public void setMaDichVu(int maDichVu) {
		this.maDichVu = maDichVu;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public long getGiaNhap() {
		return giaNhap;
	}

	public void setGiaNhap(long giaNhap) {
		this.giaNhap = giaNhap;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Override
	public String toString() {
		return "PhieuNhapKhoChiTietModel [stt=" + stt + ", phieuNhapKho=" + phieuNhapKho + ", maNhap=" + maNhap
				+ ", sanPhamVaDichVu=" + sanPhamVaDichVu + ", maDichVu=" + maDichVu + ", soLuong=" + soLuong
				+ ", giaNhap=" + giaNhap + ", ghiChu=" + ghiChu + "]";
	}
	
	
}