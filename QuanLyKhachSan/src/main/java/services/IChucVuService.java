package services;

import java.util.ArrayList;

import models.ChucVuModel;
import models.SanPhamVaDichVuModel;

public interface IChucVuService {
	public void them(ChucVuModel chucVuModel);
	public void sua(ChucVuModel chucVuModel);
	public void updateListChucVuModel();
	public ArrayList<ChucVuModel> getListChucVuModel();
}
