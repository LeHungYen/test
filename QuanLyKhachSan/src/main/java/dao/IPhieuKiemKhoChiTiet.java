package dao;

import java.util.ArrayList;

import entities.Kho;
import entities.PhieuKiemKhoChiTiet;

public interface IPhieuKiemKhoChiTiet {
	public void them(PhieuKiemKhoChiTiet phieuKiemKhoChiTiet);
	public void sua(PhieuKiemKhoChiTiet phieuKiemKhoChiTiet);
	public void updateListPhieuKiemKhoChiTiet();
	public ArrayList<PhieuKiemKhoChiTiet> getListPhieuKiemKhoChiTiet();
}
