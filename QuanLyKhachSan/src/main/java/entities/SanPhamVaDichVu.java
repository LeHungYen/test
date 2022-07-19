package entities;

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

@Entity (name = "dichVu")
@Table (name = "DichVu")
public class SanPhamVaDichVu {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int maDichVu;
	private String tenHangHoa;
	@ManyToOne
	@JoinColumn(name = "maNhomSp", nullable = false)
	private NhomSPVaDichVu nhomSPVaDichVu;
	@Column(name = "maNhomSp", insertable = false, updatable = false)
	private int maNhomSp;
	private int soLuongTon;
	private long giaVon;
	@ManyToOne
	@JoinColumn(name = "maKho", nullable = false)
	private Kho kho;
	@Column(name = "maKho", insertable = false, updatable = false)
	private int maKho;
	private String trangThai;
	@OneToMany(fetch = FetchType.LAZY, targetEntity=DonViChiTiet.class, mappedBy = "maDichVu")
	  private Set<DonViChiTiet> listDonViChiTiet = new HashSet<DonViChiTiet>();
	@OneToMany(fetch = FetchType.LAZY, targetEntity=PhieuKiemKhoChiTiet.class, mappedBy = "maDichVu")
	  private Set<PhieuKiemKhoChiTiet> listPhieuKiemKhoChiTiet = new HashSet<PhieuKiemKhoChiTiet>();
	@OneToMany(fetch = FetchType.LAZY, targetEntity=DichVuPhong.class , mappedBy = "maDichVu")
	  private Set<DichVuPhong> listDichVuPhong = new HashSet<DichVuPhong>();
	@OneToMany(fetch = FetchType.LAZY, targetEntity=PhieuNhapKhoChiTiet.class , mappedBy = "maDichVu")
	  private Set<PhieuNhapKhoChiTiet> listPhieuNhapKhoChiTiet = new HashSet<PhieuNhapKhoChiTiet>();
	
	public SanPhamVaDichVu(int maDichVu, String tenHangHoa, NhomSPVaDichVu nhomSPVaDichVu, int maNhomSp, int soLuongTon,
			long giaVon, Kho kho, int maKho, String trangThai, Set<DonViChiTiet> listDonViChiTiet,
			Set<PhieuKiemKhoChiTiet> listPhieuKiemKhoChiTiet, Set<DichVuPhong> listDichVuPhong,
			Set<PhieuNhapKhoChiTiet> listPhieuNhapKhoChiTiet) {
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
	public SanPhamVaDichVu() {
		
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
		return "SanPhamVaDichVu [maDichVu=" + maDichVu + ", tenHangHoa=" + tenHangHoa + ", nhomSPVaDichVu="
				+ nhomSPVaDichVu + ", maNhomSp=" + maNhomSp + ", soLuongTon=" + soLuongTon + ", giaVon=" + giaVon
				+ ", kho=" + kho + ", maKho=" + maKho + ", trangThai=" + trangThai + ", listDonViChiTiet="
				+ listDonViChiTiet + ", listPhieuKiemKhoChiTiet=" + listPhieuKiemKhoChiTiet + ", listDichVuPhong="
				+ listDichVuPhong + ", listPhieuNhapKhoChiTiet=" + listPhieuNhapKhoChiTiet + "]";
	}
	
	
	
	
	
	
}
