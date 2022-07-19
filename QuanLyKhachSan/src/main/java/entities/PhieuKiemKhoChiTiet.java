package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "phieuKiemKhoChiTiet")
@Table (name = "PhieuKiemKhoChiTiet")
@IdClass(PhieuKiemKhoChiTiet.class)
public class PhieuKiemKhoChiTiet implements Serializable{
	@Id
	@ManyToOne
	@JoinColumn(name = "maKiemKho", nullable = false)
	private PhieuKiemKho phieuKiemKho;
	@Column(name = "maKiemKho", insertable = false, updatable = false)
	private int maKiemKho;
	@Id
	@ManyToOne
	@JoinColumn(name = "maDichVu", nullable = false)
	private SanPhamVaDichVu sanPhamVaDichVu;
	@Column(name = "maDichVu", insertable = false, updatable = false)
	private int maDichVu;
	private int soLuongTruocKhiKiem;
	private int soLuongThucTe;
	private int soLuongChenhLech;
	private String ghiChuLiDoChenhLech;
	
	public PhieuKiemKhoChiTiet(PhieuKiemKho phieuKiemKho, int maKiemKho, SanPhamVaDichVu sanPhamVaDichVu, int maDichVu,
			int soLuongTruocKhiKiem, int soLuongThucTe, int soLuongChenhLech, String ghiChuLiDoChenhLech) {
		this.phieuKiemKho = phieuKiemKho;
		this.maKiemKho = maKiemKho;
		this.sanPhamVaDichVu = sanPhamVaDichVu;
		this.maDichVu = maDichVu;
		this.soLuongTruocKhiKiem = soLuongTruocKhiKiem;
		this.soLuongThucTe = soLuongThucTe;
		this.soLuongChenhLech = soLuongChenhLech;
		this.ghiChuLiDoChenhLech = ghiChuLiDoChenhLech;
	}
	
	public PhieuKiemKhoChiTiet() {
		
	}

	public PhieuKiemKho getPhieuKiemKho() {
		return phieuKiemKho;
	}

	public void setPhieuKiemKho(PhieuKiemKho phieuKiemKho) {
		this.phieuKiemKho = phieuKiemKho;
	}

	public int getMaKiemKho() {
		return maKiemKho;
	}

	public void setMaKiemKho(int maKiemKho) {
		this.maKiemKho = maKiemKho;
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

	public int getSoLuongTruocKhiKiem() {
		return soLuongTruocKhiKiem;
	}

	public void setSoLuongTruocKhiKiem(int soLuongTruocKhiKiem) {
		this.soLuongTruocKhiKiem = soLuongTruocKhiKiem;
	}

	public int getSoLuongThucTe() {
		return soLuongThucTe;
	}

	public void setSoLuongThucTe(int soLuongThucTe) {
		this.soLuongThucTe = soLuongThucTe;
	}

	public int getSoLuongChenhLech() {
		return soLuongChenhLech;
	}

	public void setSoLuongChenhLech(int soLuongChenhLech) {
		this.soLuongChenhLech = soLuongChenhLech;
	}

	public String getGhiChuLiDoChenhLech() {
		return ghiChuLiDoChenhLech;
	}

	public void setGhiChuLiDoChenhLech(String ghiChuLiDoChenhLech) {
		this.ghiChuLiDoChenhLech = ghiChuLiDoChenhLech;
	}

	@Override
	public String toString() {
		return "PhieuKiemKhoChiTiet [phieuKiemKho=" + phieuKiemKho + ", maKiemKho=" + maKiemKho + ", sanPhamVaDichVu="
				+ sanPhamVaDichVu + ", maDichVu=" + maDichVu + ", soLuongTruocKhiKiem=" + soLuongTruocKhiKiem
				+ ", soLuongThucTe=" + soLuongThucTe + ", soLuongChenhLech=" + soLuongChenhLech
				+ ", ghiChuLiDoChenhLech=" + ghiChuLiDoChenhLech + "]";
	}
	
	
	
	
}
