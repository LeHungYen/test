package models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import entities.DichVuPhong;
import entities.DonViChiTiet;

public class DonViTinhModel {
	private int stt;
	private int maDonVi;
	private String tenDonVi;
	private String trangThai;
	 private Set<DonViChiTiet> listDonViChiTiet = new HashSet<DonViChiTiet>();
	private DichVuPhong dichVuPhong;
	
	public DonViTinhModel(int stt, int maDonVi, String tenDonVi, String trangThai, Set<DonViChiTiet> listDonViChiTiet,
			DichVuPhong dichVuPhong) {
		this.stt = stt;
		this.maDonVi = maDonVi;
		this.tenDonVi = tenDonVi;
		this.trangThai = trangThai;
		this.listDonViChiTiet = listDonViChiTiet;
		this.dichVuPhong = dichVuPhong;
	}
	public DonViTinhModel() {
		
	}
	public int getStt() {
		return stt;
	}
	public void setStt(int stt) {
		this.stt = stt;
	}
	public int getMaDonVi() {
		return maDonVi;
	}
	public void setMaDonVi(int maDonVi) {
		this.maDonVi = maDonVi;
	}
	public String getTenDonVi() {
		return tenDonVi;
	}
	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public Set<DonViChiTiet> getListDonViChiTiet() {
		return listDonViChiTiet;
	}
	public void setListDonViChiTiet(Set<DonViChiTiet> listDonViChiTiet) {
		this.listDonViChiTiet = listDonViChiTiet;
	}
	public DichVuPhong getDichVuPhong() {
		return dichVuPhong;
	}
	public void setDichVuPhong(DichVuPhong dichVuPhong) {
		this.dichVuPhong = dichVuPhong;
	}
	@Override
	public String toString() {
		return "DonViTinhModel [stt=" + stt + ", maDonVi=" + maDonVi + ", tenDonVi=" + tenDonVi + ", trangThai="
				+ trangThai + ", listDonViChiTiet=" + listDonViChiTiet + ", dichVuPhong=" + dichVuPhong + "]";
	}
	
	
	
}
