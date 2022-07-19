package services;

import java.util.ArrayList;

import dao.DonViChiTietDao;
import entities.DonViChiTiet;
import models.DonViChiTietModel;
import utils.IoCContainer;

public class DonViChiTietService {
	private IoCContainer ioCContainer = new IoCContainer();
	private ArrayList<DonViChiTietModel> _listDonViChiTietModels = new ArrayList<DonViChiTietModel>();
	private DonViChiTietDao _DonViChiTietDao = (DonViChiTietDao) ioCContainer.getBean(DonViChiTietDao.class.toString());
	private DonViChiTiet _DonViChiTiet;
	private DonViChiTietModel _DonViChiTietModel = (DonViChiTietModel) IoCContainer.getBean(DonViChiTietModel.class.toString());;
	private int _stt = 0;

	public static DonViChiTiet updateDataDonViChiTietDependOnDonViChiTietModel(DonViChiTietModel DonViChiTietModel) {
		DonViChiTiet DonViChiTiet = new DonViChiTiet();
		DonViChiTiet.setDonViTinh(DonViChiTietModel.getDonViTinh());
		DonViChiTiet.setMaDonVi(DonViChiTietModel.getMaDonVi());
		DonViChiTiet.setSanPhamVaDichVu(DonViChiTietModel.getSanPhamVaDichVu());
		DonViChiTiet.setMaDichVu(DonViChiTietModel.getMaDichVu());
		DonViChiTiet.setGiaTriQuyDoi(DonViChiTietModel.getGiaTriQuyDoi());
		DonViChiTiet.setGiaBan(DonViChiTietModel.getGiaBan());
		DonViChiTiet.setTrangThai(DonViChiTietModel.getTrangThai());
		return DonViChiTiet;
	}

	public void them(DonViChiTietModel DonViChiTietModel) {
		_DonViChiTiet = updateDataDonViChiTietDependOnDonViChiTietModel(DonViChiTietModel);
		_DonViChiTietDao.them(_DonViChiTiet);
		DonViChiTietModel.setStt(_stt);
		_listDonViChiTietModels.add(_stt, DonViChiTietModel);
		_stt++;
	}

	public void sua(DonViChiTietModel DonViChiTietModel) {
		_DonViChiTiet = updateDataDonViChiTietDependOnDonViChiTietModel(DonViChiTietModel);
		_DonViChiTietDao.sua(_DonViChiTiet);
		int stt = DonViChiTietModel.getStt();
		_listDonViChiTietModels.remove(stt);
		_listDonViChiTietModels.add(stt, DonViChiTietModel);
	}
	
	public void updateListDonViChiTietModel() {
		_DonViChiTietDao.updateListDonViChiTiet();
		ArrayList<DonViChiTiet> listDonViChiTiet = _DonViChiTietDao.getListDonViChiTiet();
		for (DonViChiTiet DonViChiTiet : listDonViChiTiet) {
			_DonViChiTietModel = new DonViChiTietModel();
			_DonViChiTietModel.setStt(_stt);
			_DonViChiTietModel.setDonViTinh(DonViChiTiet.getDonViTinh());
			_DonViChiTietModel.setMaDonVi(DonViChiTiet.getMaDonVi());
			_DonViChiTietModel.setSanPhamVaDichVu(DonViChiTiet.getSanPhamVaDichVu());
			_DonViChiTietModel.setMaDichVu(DonViChiTiet.getMaDichVu());
			_DonViChiTietModel.setGiaTriQuyDoi(DonViChiTiet.getGiaTriQuyDoi());
			_DonViChiTietModel.setGiaBan(DonViChiTiet.getGiaBan());
			_DonViChiTietModel.setTrangThai(DonViChiTiet.getTrangThai());
			_listDonViChiTietModels.add(_DonViChiTietModel);
			_stt++;
		}

	}

	public ArrayList<DonViChiTietModel> getListDonViChiTietModel() {
		return _listDonViChiTietModels;
	}

}
