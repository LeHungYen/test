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

import entities.PhieuKiemKhoChiTiet;
import entities.Kho;
import entities.NhanVien;

public class PhieuKiemKhoModel {
	private int stt;
	private int maKiemKho;
	private Date ngayKiemKho;
	private NhanVien nhanVien;
	private String maNV;
	private Kho kho;
	private String maKho;
	private Set<PhieuKiemKhoChiTiet> listPhieuKiemKhoChiTiet = new HashSet<PhieuKiemKhoChiTiet>();
	
	
	public PhieuKiemKhoModel(int stt, int maKiemKho, Date ngayKiemKho, NhanVien nhanVien, String maNV, Kho kho,
			String maKho, Set<PhieuKiemKhoChiTiet> listPhieuKiemKhoChiTiet) {
		this.stt = stt;
		this.maKiemKho = maKiemKho;
		this.ngayKiemKho = ngayKiemKho;
		this.nhanVien = nhanVien;
		this.maNV = maNV;
		this.kho = kho;
		this.maKho = maKho;
		this.listPhieuKiemKhoChiTiet = listPhieuKiemKhoChiTiet;
	}
	public PhieuKiemKhoModel() {
		
	}

	

	public int getStt() {
		return stt;
	}
	public void setStt(int stt) {
		this.stt = stt;
	}
	public int getMaKiemKho() {
		return maKiemKho;
	}
	public void setMaKiemKho(int maKiemKho) {
		this.maKiemKho = maKiemKho;
	}
	public Date getNgayKiemKho() {
		return ngayKiemKho;
	}
	public void setNgayKiemKho(Date ngayKiemKho) {
		this.ngayKiemKho = ngayKiemKho;
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
	public Kho getKho() {
		return kho;
	}
	public void setKho(Kho kho) {
		this.kho = kho;
	}
	public String getMaKho() {
		return maKho;
	}
	public void setMaKho(String maKho) {
		this.maKho = maKho;
	}
	public Set<PhieuKiemKhoChiTiet> getListPhieuKiemKhoChiTiet() {
		return listPhieuKiemKhoChiTiet;
	}
	public void setListPhieuKiemKhoChiTiet(Set<PhieuKiemKhoChiTiet> listPhieuKiemKhoChiTiet) {
		this.listPhieuKiemKhoChiTiet = listPhieuKiemKhoChiTiet;
	}
	@Override
	public String toString() {
		return "PhieuKiemKhoModel [stt=" + stt + ", maKiemKho=" + maKiemKho + ", ngayKiemKho=" + ngayKiemKho
				+ ", nhanVien=" + nhanVien + ", maNV=" + maNV + ", kho=" + kho + ", maKho=" + maKho
				+ ", listPhieuKiemKhoChiTiet=" + listPhieuKiemKhoChiTiet + "]";
	}
	
	
	
	
}
