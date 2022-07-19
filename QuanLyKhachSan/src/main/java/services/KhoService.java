package services;

import java.util.ArrayList;

import dao.KhoDao;
import entities.Kho;
import models.KhoModel;
import utils.IoCContainer;

public class KhoService implements IKhoService{
	private IoCContainer ioCContainer = new IoCContainer();
	private ArrayList<KhoModel> _listKhoModels = new ArrayList<KhoModel>();
	private KhoDao _KhoDao = (KhoDao) ioCContainer.getBean(KhoDao.class.toString());
	private Kho _Kho;
	private KhoModel _KhoModel = (KhoModel) IoCContainer.getBean(KhoModel.class.toString());;
	private int _stt = 0;

	public static Kho updateDataKhoDependOnKhoModel(KhoModel KhoModel) {
		Kho Kho = new Kho();
		Kho.setMaKho(KhoModel.getMaKho());
		Kho.setTenKho(KhoModel.getTenKho());
		Kho.setTrangThai(KhoModel.getTrangThai());
		Kho.setListSanPhamVaDichVu(KhoModel.getListSanPhamVaDichVu());
		Kho.setListPhieuKiemKho(KhoModel.getListPhieuKiemKho());
		return Kho;
	}

	public void them(KhoModel KhoModel) {
		_Kho = updateDataKhoDependOnKhoModel(KhoModel);
		_KhoDao.them(_Kho);
		KhoModel.setStt(_stt);
		_listKhoModels.add(_stt, KhoModel);
		_stt++;
	}

	public void sua(KhoModel KhoModel) {
		_Kho = updateDataKhoDependOnKhoModel(KhoModel);
		_KhoDao.sua(_Kho);
		int stt = KhoModel.getStt();
		_listKhoModels.remove(stt);
		_listKhoModels.add(stt, KhoModel);
	}
	
	public void updateListKhoModel() {
		_KhoDao.updateListKho();
		ArrayList<Kho> listKho = _KhoDao.getListKho();
		for (Kho Kho : listKho) {
			_KhoModel = new KhoModel();
			_KhoModel.setStt(_stt);
			_KhoModel.setMaKho(Kho.getMaKho());
			_KhoModel.setTenKho(Kho.getTenKho());
			_KhoModel.setTrangThai(Kho.getTrangThai());
			_KhoModel.setListSanPhamVaDichVu(Kho.getListSanPhamVaDichVu());
			_KhoModel.setListPhieuKiemKho(Kho.getListPhieuKiemKho());
			_listKhoModels.add(_KhoModel);
			_stt++;
		}

	}

	public ArrayList<KhoModel> getListKhoModel() {
		return _listKhoModels;
	}

}
