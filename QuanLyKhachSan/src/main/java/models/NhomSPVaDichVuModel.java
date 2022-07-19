package models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import entities.SanPhamVaDichVu;

public class NhomSPVaDichVuModel {
	private int stt;
	private int maNhomSP;
	private String tenNhomSP;
	private String nhomHangHoa;
	private String ghiChu;
	private String trangThai;
	private Set<SanPhamVaDichVu> listSanPhamVaDichVu = new HashSet<SanPhamVaDichVu>();
	public NhomSPVaDichVuModel(int stt, int maNhomSP, String tenNhomSP, String nhomHangHoa, String ghiChu,
			String trangThai, Set<SanPhamVaDichVu> listSanPhamVaDichVu) {
		this.stt = stt;
		this.maNhomSP = maNhomSP;
		this.tenNhomSP = tenNhomSP;
		this.nhomHangHoa = nhomHangHoa;
		this.ghiChu = ghiChu;
		this.trangThai = trangThai;
		this.listSanPhamVaDichVu = listSanPhamVaDichVu;
	}
	public NhomSPVaDichVuModel() {
	}
	public int getStt() {
		return stt;
	}
	public void setStt(int stt) {
		this.stt = stt;
	}
	public int getMaNhomSP() {
		return maNhomSP;
	}
	public void setMaNhomSP(int maNhomSP) {
		this.maNhomSP = maNhomSP;
	}
	public String getTenNhomSP() {
		return tenNhomSP;
	}
	public void setTenNhomSP(String tenNhomSP) {
		this.tenNhomSP = tenNhomSP;
	}
	public String getNhomHangHoa() {
		return nhomHangHoa;
	}
	public void setNhomHangHoa(String nhomHangHoa) {
		this.nhomHangHoa = nhomHangHoa;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
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
	@Override
	public String toString() {
		return "NhomSPVaDichVuModel [stt=" + stt + ", maNhomSP=" + maNhomSP + ", tenNhomSP=" + tenNhomSP
				+ ", nhomHangHoa=" + nhomHangHoa + ", ghiChu=" + ghiChu + ", trangThai=" + trangThai
				+ ", listSanPhamVaDichVu=" + listSanPhamVaDichVu + "]";
	}
	
	
	
	
	
	
}
