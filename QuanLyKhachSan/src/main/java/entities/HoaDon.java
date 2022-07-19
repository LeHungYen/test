package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name = "hoaDon")
@Table(name = "HoaDon")
public class HoaDon {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int maHoaDon;
}
