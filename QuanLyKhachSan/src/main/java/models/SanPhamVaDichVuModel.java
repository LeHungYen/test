package models;

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
import entities.DichVuPhong;
import entities.DonViChiTiet;
import entities.Kho;
import entities.PhieuKiemKhoChiTiet;
import entities.NhomSPVaDichVu;

public class SanPhamVaDichVuModel {
	private int stt;
	private int maDichVu;
	private String tenHangHoa;
	private NhomSPVaDichVu nhomSPVaDichVu;
	private int maNhomSp;
	private int soLuongTon;
	private long giaVon;
	private Kho kho;
	private int maKho;
	private String trangThai;
	  private Set<DonViChiTiet> listDonViChiTiet = new HashSet<DonViChiTiet>();
	  private Set<PhieuKiemKhoChiTiet> listPhieuKiemKhoChiTiet = new HashSet<PhieuKiemKhoChiTiet>();
	  private Set<DichVuPhong> listDichVuPhong = new HashSet<DichVuPhong>();
	  private Set<PhieuNhapKhoChiTiet> listPhieuNhapKhoChiTiet = new HashSet<PhieuNhapKhoChiTiet>();
	  
	public SanPhamVaDichVuModel(int stt, int maDichVu, String tenHangHoa, NhomSPVaDichVu nhomSPVaDichVu, int maNhomSp,
			int soLuongTon, long giaVon, Kho kho, int maKho, String trangThai, Set<DonViChiTiet> listDonViChiTiet,
			Set<PhieuKiemKhoChiTiet> listPhieuKiemKhoChiTiet, Set<DichVuPhong> listDichVuPhong,
			Set<PhieuNhapKhoChiTiet> listPhieuNhapKhoChiTiet) {
		this.stt = stt;
		this.maDichVu = maDichVu;
		this.tenHangHoa = tenHangHoa;
		this.nhomSPVaDichVu = nhomSPVaDichVu;
		this.maNhomSp = maNhomSp;
		this.soLuongTon = soLuongTon;
		this.giaVon = giaVon;
		this.kho = kho;
		this.maKho = maKho;
		this.trangThai = trangThai;
		this.listDonViChiTiet = listDonViChiTiet;
		this.listPhieuKiemKhoChiTiet = listPhieuKiemKhoChiTiet;
		this.listDichVuPhong = listDichVuPhong;
		this.listPhieuNhapKhoChiTiet = listPhieuNhapKhoChiTiet;
	}
	
	public SanPhamVaDichVuModel() {
		
	}

	public int getStt() {
		return stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

	public int getMaDichVu() {
		return maDichVu;
	}

	public void setMaDichVu(int maDichVu) {
		this.maDichVu = maDichVu;
	}

	public String getTenHangHoa() {
		return tenHangHoa;
	}

	public void setTenHangHoa(String tenHangHoa) {
		this.tenHangHoa = tenHangHoa;
	}

	public NhomSPVaDichVu getNhomSPVaDichVu() {
		return nhomSPVaDichVu;
	}

	public void setNhomSPVaDichVu(NhomSPVaDichVu nhomSPVaDichVu) {
		this.nhomSPVaDichVu = nhomSPVaDichVu;
	}

	public int getMaNhomSp() {
		return maNhomSp;
	}

	public void setMaNhomSp(int maNhomSp) {
		this.maNhomSp = maNhomSp;
	}

	public int getSoLuongTon() {
		return soLuongTon;
	}

	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}

	public long getGiaVon() {
		return giaVon;
	}

	public void setGiaVon(long giaVon) {
		this.giaVon = giaVon;
	}

	public Kho getKho() {
		return kho;
	}

	public void setKho(Kho kho) {
		this.kho = kho;
	}

	public int getMaKho() {
		return maKho;
	}

	public void setMaKho(int maKho) {
		this.maKho = maKho;
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

	public Set<PhieuKiemKhoChiTiet> getListPhieuKiemKhoChiTiet() {
		return listPhieuKiemKhoChiTiet;
	}

	public void setListPhieuKiemKhoChiTiet(Set<PhieuKiemKhoChiTiet> listPhieuKiemKhoChiTiet) {
		this.listPhieuKiemKhoChiTiet = listPhieuKiemKhoChiTiet;
	}

	public Set<DichVuPhong> getListDichVuPhong() {
		return listDichVuPhong;
	}

	public void setListDichVuPhong(Set<DichVuPhong> listDichVuPhong) {
		this.listDichVuPhong = listDichVuPhong;
	}

	public Set<PhieuNhapKhoChiTiet> getListPhieuNhapKhoChiTiet() {
		return listPhieuNhapKhoChiTiet;
	}

	public void setListPhieuNhapKhoChiTiet(Set<PhieuNhapKhoChiTiet> listPhieuNhapKhoChiTiet) {
		this.listPhieuNhapKhoChiTiet = listPhieuNhapKhoChiTiet;
	}

	@Override
	public String toString() {
		return "SanPhamVaDichVuModel [stt=" + stt + ", maDichVu=" + maDichVu + ", tenHangHoa=" + tenHangHoa
				+ ", nhomSPVaDichVu=" + nhomSPVaDichVu + ", maNhomSp=" + maNhomSp + ", soLuongTon=" + soLuongTon
				+ ", giaVon=" + giaVon + ", kho=" + kho + ", maKho=" + maKho + ", trangThai=" + trangThai
				+ ", listDonViChiTiet=" + listDonViChiTiet + ", listPhieuKiemKhoChiTiet=" + listPhieuKiemKhoChiTiet
				+ ", listDichVuPhong=" + listDichVuPhong + ", listPhieuNhapKhoChiTiet=" + listPhieuNhapKhoChiTiet + "]";
	}
	
	
	
	
	

	

}
