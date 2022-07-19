package dao;

import java.util.ArrayList;

import entities.PhieuKiemKho;
import entities.PhieuKiemKhoChiTiet;

public interface IPhieuKiemKhoDao {
	public void them(PhieuKiemKho phieuKiemKho);
	public void sua(PhieuKiemKho phieuKiemKho);
	public void updateListPhieuKiemKho();
	public ArrayList<PhieuKiemKho> getListPhieuKiemKho();
}
