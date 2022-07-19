package services;

import java.util.ArrayList;

import models.SanPhamVaDichVuModel;

public interface ISanPhamVaDichVuService {
	public void them(SanPhamVaDichVuModel sanPhamVaDichVuModel);
	public void sua(SanPhamVaDichVuModel sanPhamVaDichVuModel);
	public void updateListSanPhamVaDichVuModel();
	public ArrayList<SanPhamVaDichVuModel> getListSanPhamVaDichVuModel();
}
