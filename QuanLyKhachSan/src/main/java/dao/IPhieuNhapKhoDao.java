package dao;

import java.util.ArrayList;

import entities.NhanVien;
import entities.PhieuNhapKho;

public interface IPhieuNhapKhoDao {
	public void them(PhieuNhapKho phieuNhapKho);
	public void sua(PhieuNhapKho phieuNhapKho);
	public void updateListPhieuNhapKho();
	public ArrayList<PhieuNhapKho> getListPhieuNhapKho();
}
