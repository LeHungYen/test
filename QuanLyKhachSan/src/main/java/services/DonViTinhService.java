package services;

import java.util.ArrayList;

import dao.DonViTinhDao;
import entities.DonViTinh;
import models.DonViTinhModel;
import utils.IoCContainer;

public class DonViTinhService {
	private IoCContainer ioCContainer = new IoCContainer();
	private ArrayList<DonViTinhModel> _listDonViTinhModels = new ArrayList<DonViTinhModel>();
	private DonViTinhDao _DonViTinhDao = (DonViTinhDao) ioCContainer.getBean(DonViTinhDao.class.toString());
	private DonViTinh _DonViTinh;
	private DonViTinhModel _DonViTinhModel = (DonViTinhModel) IoCContainer.getBean(DonViTinhModel.class.toString());;
	private int _stt = 0;

	public static DonViTinh updateDataDonViTinhDependOnDonViTinhModel(DonViTinhModel DonViTinhModel) {
		DonViTinh DonViTinh = new DonViTinh();
		DonViTinh.setMaDonVi(DonViTinhModel.getMaDonVi());
		DonViTinh.setTenDonVi(DonViTinhModel.getTenDonVi());
		DonViTinh.setTrangThai(DonViTinhModel.getTrangThai());
		DonViTinh.setListDonViChiTiet(DonViTinhModel.getListDonViChiTiet());
		DonViTinh.setDichVuPhong(DonViTinhModel.getDichVuPhong());
		return DonViTinh;
	}

	public void them(DonViTinhModel DonViTinhModel) {
		_DonViTinh = updateDataDonViTinhDependOnDonViTinhModel(DonViTinhModel);
		_DonViTinhDao.them(_DonViTinh);
		DonViTinhModel.setStt(_stt);
		_listDonViTinhModels.add(_stt, DonViTinhModel);
		_stt++;
	}

	public void sua(DonViTinhModel DonViTinhModel) {
		_DonViTinh = updateDataDonViTinhDependOnDonViTinhModel(DonViTinhModel);
		_DonViTinhDao.sua(_DonViTinh);
		int stt = DonViTinhModel.getStt();
		_listDonViTinhModels.remove(stt);
		_listDonViTinhModels.add(stt, DonViTinhModel);
	}
	
	public void updateListDonViTinhModel() {
		_DonViTinhDao.updateListDonViTinh();
		ArrayList<DonViTinh> listDonViTinh = _DonViTinhDao.getListDonViTinh();
		for (DonViTinh DonViTinh : listDonViTinh) {
			_DonViTinhModel = new DonViTinhModel();
			_DonViTinhModel.setStt(_stt);
			_DonViTinhModel.setMaDonVi(DonViTinh.getMaDonVi());
			_DonViTinhModel.setTenDonVi(DonViTinh.getTenDonVi());
			_DonViTinhModel.setTrangThai(DonViTinh.getTrangThai());
			_DonViTinhModel.setListDonViChiTiet(DonViTinh.getListDonViChiTiet());
			_DonViTinhModel.setDichVuPhong(DonViTinh.getDichVuPhong());
			_listDonViTinhModels.add(_DonViTinhModel);
			_stt++;
		}

	}

	public ArrayList<DonViTinhModel> getListDonViTinhModel() {
		return _listDonViTinhModels;
	}

}
