package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity (name = "phieuNhapKhoChiTiet")
@Table (name = "PhieuNhapKhoChiTiet")
@IdClass(PhieuNhapKhoChiTiet.class)
public class PhieuNhapKhoChiTiet implements Serializable{
	@Id
	@ManyToOne
	@JoinColumn (name = "maNhap" ,nullable = false)
	private PhieuNhapKho phieuNhapKho;
	@Column(name = "maNhap" , nullable = false , updatable = false , insertable = false)
	private int maNhap;
	@Id
	@ManyToOne
	@JoinColumn (name = "maDichVu" ,nullable = false)
	private SanPhamVaDichVu sanPhamVaDichVu;
	@Column(name = "maDichVu" , nullable = false , updatable = false , insertable = false)
	private int maDichVu;
	private int soLuong;
	private long giaNhap;
	private String ghiChu;
	
	public PhieuNhapKhoChiTiet(PhieuNhapKho phieuNhapKho, int maNhap, SanPhamVaDichVu sanPhamVaDichVu, int maDichVu,
			int soLuong, long giaNhap, String ghiChu) {
		this.phieuNhapKho = phieuNhapKho;
		this.maNhap = maNhap;
		this.sanPhamVaDichVu = sanPhamVaDichVu;
		this.maDichVu = maDichVu;
		this.soLuong = soLuong;
		this.giaNhap = giaNhap;
		this.ghiChu = ghiChu;
	}
	public PhieuNhapKhoChiTiet() {
		
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
		return "PhieuNhapKhoChiTiet [phieuNhapKho=" + phieuNhapKho + ", maNhap=" + maNhap + ", sanPhamVaDichVu="
				+ sanPhamVaDichVu + ", maDichVu=" + maDichVu + ", soLuong=" + soLuong + ", giaNhap=" + giaNhap
				+ ", ghiChu=" + ghiChu + "]";
	}
	
	
	
	
}
