package models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import entities.PhieuKiemKho;
import entities.SanPhamVaDichVu;

public class KhoModel {
	private int stt;
	private int maKho;
	private String tenKho;
	private String trangThai;
	 private Set<SanPhamVaDichVu> listSanPhamVaDichVu = new HashSet<SanPhamVaDichVu>();
	private Set<PhieuKiemKho> listPhieuKiemKho = new HashSet<PhieuKiemKho>();
	
	public KhoModel(int stt, int maKho, String tenKho, String trangThai, Set<SanPhamVaDichVu> listSanPhamVaDichVu,
			Set<PhieuKiemKho> listPhieuKiemKho) {
		this.stt = stt;
		this.maKho = maKho;
		this.tenKho = tenKho;
		this.trangThai = trangThai;
		this.listSanPhamVaDichVu = listSanPhamVaDichVu;
		this.listPhieuKiemKho = listPhieuKiemKho;
	}
	public KhoModel() {
		
	}
	public int getStt() {
		return stt;
	}
	public void setStt(int stt) {
		this.stt = stt;
	}
	public int getMaKho() {
		return maKho;
	}
	public void setMaKho(int maKho) {
		this.maKho = maKho;
	}
	public String getTenKho() {
		return tenKho;
	}
	public void setTenKho(String tenKho) {
		this.tenKho = tenKho;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public Set<SanPhamVaDichVu> getListSanPhamVaDichVu() {
		return listSanPhamVaDichVu;
	}
	public void setListSanPhamVaDichVu(Set<SanPhamVaDichVu> listSanPhamVaDichVu) {
		this.listSanPhamVaDichVu = listSanPhamVaDichVu;
	}
	public Set<PhieuKiemKho> getListPhieuKiemKho() {
		return listPhieuKiemKho;
	}
	public void setListPhieuKiemKho(Set<PhieuKiemKho> listPhieuKiemKho) {
		this.listPhieuKiemKho = listPhieuKiemKho;
	}
	@Override
	public String toString() {
		return "KhoModel [stt=" + stt + ", maKho=" + maKho + ", tenKho=" + tenKho + ", trangThai=" + trangThai
				+ ", listSanPhamVaDichVu=" + listSanPhamVaDichVu + ", listPhieuKiemKho=" + listPhieuKiemKho + "]";
	}
	
	
}
