package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "dichVuPhong")
@Table(name = "DichVuPhong")
@IdClass(DichVuPhong.class)
public class DichVuPhong implements Serializable{
	@Id
	@ManyToOne
	@JoinColumn(name = "maDichVu", nullable = false )
	private SanPhamVaDichVu sanPhamVaDichVu;
	@Column(name = "maDichVu", insertable = false, updatable = false)
	private String maDichVu;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "maDonVi", nullable = false)
	private DonViTinh donViTinh;
	@Column(name = "maDonVi", insertable = false, updatable = false)
	private String maDonVi;
	
}