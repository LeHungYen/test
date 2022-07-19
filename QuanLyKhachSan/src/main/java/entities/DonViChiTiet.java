package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity (name = "donViChiTiet")
@Table (name = "DonViChiTiet")
@IdClass(DonViChiTiet.class)
public class DonViChiTiet implements Serializable{
	@Id
	@ManyToOne
	@JoinColumn (name = "maDonVi" ,nullable = false)
	private DonViTinh donViTinh;
	@Column(name = "maDonVi" , nullable = false , updatable = false , insertable = false)
	private int maDonVi;
	@Id
	@ManyToOne
	@JoinColumn (name = "maDichVu" ,nullable = false)
	private SanPhamVaDichVu sanPhamVaDichVu;
	@Column(name = "maDichVu" , nullable = false , updatable = false , insertable = false)
	private int maDichVu;
	private int giaTriQuyDoi;
	private long giaBan;
	private String trangThai;
	
	public DonViChiTiet(DonViTinh donViTinh, int maDonVi, SanPhamVaDichVu sanPhamVaDichVu, int maDichVu,
			int giaTriQuyDoi, long giaBan, String trangThai) {
		this.donViTinh = donViTinh;
		this.maDonVi = maDonVi;
		this.sanPhamVaDichVu = sanPhamVaDichVu;
		this.maDichVu = maDichVu;
		this.giaTriQuyDoi = giaTriQuyDoi;
		this.giaBan = giaBan;
		this.trangThai = trangThai;
	}
	public DonViChiTiet() {
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
		return "DonViChiTiet [donViTinh=" + donViTinh + ", maDonVi=" + maDonVi + ", sanPhamVaDichVu=" + sanPhamVaDichVu
				+ ", maDichVu=" + maDichVu + ", giaTriQuyDoi=" + giaTriQuyDoi + ", giaBan=" + giaBan + ", trangThai="
				+ trangThai + "]";
	}
	
	
	
}
