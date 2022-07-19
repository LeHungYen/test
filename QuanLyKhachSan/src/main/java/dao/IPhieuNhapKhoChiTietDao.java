package dao;

import java.util.ArrayList;

import entities.PhieuNhapKhoChiTiet;
import entities.ChucVu;

public interface IPhieuNhapKhoChiTietDao {
	public void them(PhieuNhapKhoChiTiet phieuNhapKhoChiTiet);
	public void sua(PhieuNhapKhoChiTiet phieuNhapKhoChiTiet);
	public void updateListPhieuNhapKhoChiTiet();
	public ArrayList<PhieuNhapKhoChiTiet> getListPhieuNhapKhoChiTiet();
}
