package entities;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "phieuKiemKho")
@Table(name = "PhieuKiemKho")
public class PhieuKiemKho {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maKiemKho;
	private Date ngayKiemKho;
	@ManyToOne
	@JoinColumn(name = "maNV", nullable = false)
	private NhanVien nhanVien;
	@Column(name = "maNV", insertable = false, updatable = false)
	private String maNV;
	@ManyToOne
	@JoinColumn(name = "maKho", nullable = false)
	private Kho kho;
	@Column(name = "maKho", insertable = false, updatable = false)
	private String maKho;
	@OneToMany(fetch = FetchType.LAZY, targetEntity = PhieuKiemKhoChiTiet.class)
	private Set<PhieuKiemKhoChiTiet> listPhieuKiemKhoChiTiet = new HashSet<PhieuKiemKhoChiTiet>();
	
	public PhieuKiemKho(int maKiemKho, Date ngayKiemKho, NhanVien nhanVien, String maNV, Kho kho, String maKho,
			Set<PhieuKiemKhoChiTiet> listPhieuKiemKhoChiTiet) {
		this.maKiemKho = maKiemKho;
		this.ngayKiemKho = ngayKiemKho;
		this.nhanVien = nhanVien;
		this.maNV = maNV;
		this.kho = kho;
		this.maKho = maKho;
		this.listPhieuKiemKhoChiTiet = listPhieuKiemKhoChiTiet;
	}
	public PhieuKiemKho() {
	
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
		return "PhieuKiemKho [maKiemKho=" + maKiemKho + ", ngayKiemKho=" + ngayKiemKho + ", nhanVien=" + nhanVien
				+ ", maNV=" + maNV + ", kho=" + kho + ", maKho=" + maKho + ", listPhieuKiemKhoChiTiet="
				+ listPhieuKiemKhoChiTiet + "]";
	}

	
	

	
}
