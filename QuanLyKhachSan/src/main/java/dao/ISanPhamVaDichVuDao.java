package dao;

import java.util.ArrayList;

import entities.SanPhamVaDichVu;

public interface ISanPhamVaDichVuDao {
	public void them(SanPhamVaDichVu sanPhamVaDichVu);
	public void sua(SanPhamVaDichVu sanPhamVaDichVu);
	public void updateListSanPhamVaDichVu();
	public ArrayList<SanPhamVaDichVu> getListSanPhamVaDichVu();
}
