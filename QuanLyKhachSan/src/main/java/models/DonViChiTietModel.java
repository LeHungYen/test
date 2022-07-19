package models;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import entities.DonViTinh;
import entities.SanPhamVaDichVu;

public class DonViChiTietModel {
	private int stt;
	private DonViTinh donViTinh;
	private int maDonVi;
	private SanPhamVaDichVu sanPhamVaDichVu;
	private int maDichVu;
	private int giaTriQuyDoi;
	private long giaBan;
	private String trangThai;
	public DonViChiTietModel(int stt, DonViTinh donViTinh, int maDonVi, SanPhamVaDichVu sanPhamVaDichVu, int maDichVu,
			int giaTriQuyDoi, long giaBan, String trangThai) {
		this.stt = stt;
		this.donViTinh = donViTinh;
		this.maDonVi = maDonVi;
		this.sanPhamVaDichVu = sanPhamVaDichVu;
		this.maDichVu = maDichVu;
		this.giaTriQuyDoi = giaTriQuyDoi;
		this.giaBan = giaBan;
		this.trangThai = trangThai;
	}
	public DonViChiTietModel() {
		
	}
	public int getStt() {
		return stt;
	}
	public void setStt(int stt) {
		this.stt = stt;
	}
	public DonViTinh getDonViTinh() {
		return donViTinh;
	}
	public void setDonViTinh(DonViTinh donViTinh) {
		this.donViTinh = donViTinh;
	}
	public int getMaDonVi() {
		return maDonVi;
	}
	public void setMaDonVi(int maDonVi) {
		this.maDonVi = maDonVi;
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
	public int getGiaTriQuyDoi() {
		return giaTriQuyDoi;
	}
	public void setGiaTriQuyDoi(int giaTriQuyDoi) {
		this.giaTriQuyDoi = giaTriQuyDoi;
	}
	public long getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(long giaBan) {
		this.giaBan = giaBan;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	@Override
	public String toString() {
		return "DonViChiTietModel [stt=" + stt + ", donViTinh=" + donViTinh + ", maDonVi=" + maDonVi
				+ ", sanPhamVaDichVu=" + sanPhamVaDichVu + ", maDichVu=" + maDichVu + ", giaTriQuyDoi=" + giaTriQuyDoi
				+ ", giaBan=" + giaBan + ", trangThai=" + trangThai + "]";
	}
	
	
	
	
}
